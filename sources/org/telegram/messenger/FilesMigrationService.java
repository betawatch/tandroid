package org.telegram.messenger;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import j$.util.function.Consumer$-CC;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.telegram.ui.Components.ax0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class FilesMigrationService extends Service {
    public static FilesMigrationBottomSheet filesMigrationBottomSheet = null;
    public static boolean hasOldFolder = false;
    public static boolean isRunning = false;
    private static boolean wasShown = false;
    long lastUpdateTime;
    private int movedFilesCount;
    private int totalFilesCount;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public class 1 extends Thread {
        public 1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            FilesMigrationService.isRunning = false;
            FilesMigrationService.this.stopForeground(true);
            FilesMigrationService.this.stopSelf();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FilesMigrationService.this.migrateOldFolder();
            AndroidUtilities.runOnUIThread(new e1(this, 2));
        }
    }

    public static void checkBottomSheet(org.telegram.ui.ActionBar.p2 p2Var) {
        ArrayList<File> rootDirs;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0);
        if (!Environment.isExternalStorageLegacy() || sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) || sharedPreferences.getInt("migration_to_scoped_storage_count", 0) >= 5 || wasShown || filesMigrationBottomSheet != null || isRunning) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && (rootDirs = AndroidUtilities.getRootDirs()) != null) {
                int size = rootDirs.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    File file = rootDirs.get(i10);
                    if (file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                        externalStorageDirectory = file;
                        break;
                    }
                    i10++;
                }
            }
            hasOldFolder = new File(externalStorageDirectory, "Telegram").exists();
        }
        if (!hasOldFolder) {
            sharedPreferences.edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
            return;
        }
        FilesMigrationBottomSheet filesMigrationBottomSheet2 = new FilesMigrationBottomSheet(p2Var);
        filesMigrationBottomSheet = filesMigrationBottomSheet2;
        filesMigrationBottomSheet2.show();
        wasShown = true;
        sharedPreferences.edit().putInt("migration_to_scoped_storage_count", sharedPreferences.getInt("migration_to_scoped_storage_count", 0) + 1).apply();
    }

    private int getFilesCount(File file) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < listFiles.length; i11++) {
            i10 = listFiles[i11].isDirectory() ? i10 + getFilesCount(listFiles[i11]) : i10 + 1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveDirectory$0(File file, Path path) {
        File file2 = new File(file, path.getFileName().toString());
        if (Files.isDirectory(path, new LinkOption[0])) {
            moveDirectory(path.toFile(), file2);
            return;
        }
        try {
            Files.move(path, file2.toPath(), new CopyOption[0]);
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            try {
                path.toFile().delete();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        this.movedFilesCount++;
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProgress$1(int i10) {
        ((NotificationManager) getSystemService("notification")).notify(301, v3.a(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(LocaleController.getString(R.string.MigratingFiles)).setContentText(i10 + "/" + this.totalFilesCount).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(this.totalFilesCount, i10, false).build());
    }

    private void moveDirectory(File file, final File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    try {
                        convert.forEach(new Consumer() { // from class: org.telegram.messenger.w3
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void x(Object obj) {
                                FilesMigrationService.this.lambda$moveDirectory$0(file2, (Path) obj);
                            }

                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$-CC.$default$andThen(this, consumer);
                            }
                        });
                        convert.close();
                    } finally {
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    file.delete();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public static void start() {
        ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) FilesMigrationService.class));
    }

    private void updateProgress() {
        if (System.currentTimeMillis() - this.lastUpdateTime > 20 || this.movedFilesCount >= this.totalFilesCount - 1) {
            AndroidUtilities.runOnUIThread(new s6(this, this.movedFilesCount, 6));
        }
    }

    public void migrateOldFolder() {
        ArrayList<File> rootDirs;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && (rootDirs = AndroidUtilities.getRootDirs()) != null) {
            int size = rootDirs.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                File file = rootDirs.get(i10);
                if (file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                    externalStorageDirectory = file;
                    break;
                }
                i10++;
            }
        }
        File file2 = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
        File file3 = new File(externalStorageDirectory, "Telegram");
        this.totalFilesCount = getFilesCount(file3);
        long currentTimeMillis = System.currentTimeMillis();
        if (file3.canRead() && file3.canWrite()) {
            moveDirectory(file3, file2);
        }
        FileLog.d("move time = " + (System.currentTimeMillis() - currentTimeMillis));
        ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        NotificationsController.checkOtherNotificationsChannel();
        Notification build = v3.a(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(LocaleController.getString(R.string.MigratingFiles)).setAutoCancel(false).setSmallIcon(R.drawable.notification).build();
        isRunning = true;
        new 1().start();
        startForeground(301, build);
        return super.onStartCommand(intent, i10, i11);
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class FilesMigrationBottomSheet extends org.telegram.ui.ActionBar.g3 {
        org.telegram.ui.ActionBar.p2 fragment;

        public FilesMigrationBottomSheet(org.telegram.ui.ActionBar.p2 p2Var) {
            super(p2Var.getParentActivity(), false);
            this.fragment = p2Var;
            setCanceledOnTouchOutside(false);
            Activity parentActivity = p2Var.getParentActivity();
            LinearLayout h = kf.k0.h(parentActivity, 1);
            ax0 ax0Var = new ax0(parentActivity, this.currentAccount);
            ax0Var.setStickerNum(7);
            ax0Var.getImageReceiver().setAutoRepeat(1);
            h.addView(ax0Var, k7.b6.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.j6.j5;
            y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.MigrateOldFolderTitle));
            h.addView(textView, k7.b6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            y3.q(R.string.MigrateOldFolderDescription, textView2);
            h.addView(textView2, k7.b6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.MigrateOldFolderButton));
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            textView3.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
            h.addView(textView3, k7.b6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new x3(this, 0));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(h);
            setCustomView(scrollView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            migrateOldFolder();
        }

        @Override // org.telegram.ui.ActionBar.g3
        public boolean canDismissWithSwipe() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.g3
        public boolean canDismissWithTouchOutside() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
        public void dismiss() {
            super.dismiss();
            FilesMigrationService.filesMigrationBottomSheet = null;
        }

        public void migrateOldFolder() {
            Activity parentActivity = this.fragment.getParentActivity();
            boolean z4 = false;
            boolean z10 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i10 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
                z4 = true;
            }
            if (z4 && z10) {
                FilesMigrationService.start();
                dismiss();
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (!z4) {
                if (i10 >= 33) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                } else {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
            }
            if (!z10) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
        }

        @Override // org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.l2
        public /* bridge */ /* synthetic */ void setLastVisible(boolean z4) {
        }
    }
}

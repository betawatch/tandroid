package org.telegram.messenger;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
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
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.bv0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class FilesMigrationService extends Service {
    public static boolean c = false;
    public static boolean d = false;
    public static c9 e = null;
    public static boolean f = false;
    public int a;
    public int b;

    public static void a(org.telegram.ui.ww wwVar) {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("systemConfig", 0);
        if (!Environment.isExternalStorageLegacy() || sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) || sharedPreferences.getInt("migration_to_scoped_storage_count", 0) >= 5 || f || e != null || d) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!TextUtils.isEmpty(iz.h0)) {
                ArrayList d12 = g0.d1();
                int size = d12.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    File file = (File) d12.get(i7);
                    if (file.getAbsolutePath().startsWith(iz.h0)) {
                        externalStorageDirectory = file;
                        break;
                    }
                    i7++;
                }
            }
            c = new File(externalStorageDirectory, "Telegram").exists();
        }
        if (!c) {
            sharedPreferences.edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
            return;
        }
        c9 c9Var = new c9((Context) wwVar.getParentActivity(), false);
        c9Var.j1 = wwVar;
        c9Var.setCanceledOnTouchOutside(false);
        Activity parentActivity = wwVar.getParentActivity();
        LinearLayout e10 = k5.e(parentActivity, 1);
        bv0 bv0Var = new bv0(parentActivity, c9Var.a);
        bv0Var.setStickerNum(7);
        bv0Var.getImageReceiver().W(1);
        e10.addView(bv0Var, c8.ha.t(qs.a2, qs.a2, 1, 0, 16, 0, 0));
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        k5.n(textView, i10, null, 1, 20.0f);
        textView.setText(hd.M0(2131748430, null));
        e10.addView(textView, c8.ha.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        textView2.setText(g0.X2(hd.M0(2131748431, null)));
        e10.addView(textView2, c8.ha.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(g0.L(34.0f), 0, g0.L(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(g0.o());
        textView3.setText(hd.M0(2131748432, null));
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, null);
        textView3.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 6.0f));
        e10.addView(textView3, c8.ha.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
        textView3.setOnClickListener(new b9(c9Var, 0));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(e10);
        c9Var.N = scrollView;
        e = c9Var;
        c9Var.show();
        f = true;
        sharedPreferences.edit().putInt("migration_to_scoped_storage_count", sharedPreferences.getInt("migration_to_scoped_storage_count", 0) + 1).apply();
    }

    public static int b(File file) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < listFiles.length; i10++) {
            i7 = listFiles[i10].isDirectory() ? b(listFiles[i10]) + i7 : i7 + 1;
        }
        return i7;
    }

    public final void c(File file, final File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    try {
                        convert.forEach(new Consumer() { // from class: org.telegram.messenger.a9
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void x(Object obj) {
                                Path path = (Path) obj;
                                boolean z9 = FilesMigrationService.c;
                                File file3 = new File(file2, path.getFileName().toString());
                                boolean isDirectory = Files.isDirectory(path, new LinkOption[0]);
                                FilesMigrationService filesMigrationService = FilesMigrationService.this;
                                if (isDirectory) {
                                    filesMigrationService.c(path.toFile(), file3);
                                    return;
                                }
                                try {
                                    Files.move(path, file3.toPath(), new CopyOption[0]);
                                } catch (Exception e10) {
                                    a8.g(e10, false);
                                    try {
                                        path.toFile().delete();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                }
                                filesMigrationService.b++;
                                if (System.currentTimeMillis() > 20 || filesMigrationService.b >= filesMigrationService.a - 1) {
                                    g0.h3(new x0(filesMigrationService, filesMigrationService.b, 2));
                                }
                            }

                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$-CC.$default$andThen(this, consumer);
                            }
                        });
                        convert.close();
                    } finally {
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                try {
                    file.delete();
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        dt.i();
        Notification build = z8.b(this, dt.j0).setContentTitle(hd.M0(2131748429, null)).setAutoCancel(false).setSmallIcon(R.drawable.notification).build();
        d = true;
        new k2.k(this).start();
        try {
            startForeground(qs.Y4, build);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return super.onStartCommand(intent, i7, i10);
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("FilesMigrationService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}

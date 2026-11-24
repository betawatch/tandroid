package org.telegram.messenger;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class FilesMigrationService extends Service {
    public static boolean c = false;
    public static boolean d = false;
    public static ya0 e = null;
    public static boolean f = false;
    public int a;
    public int b;

    public static void a(cj3 cj3Var) {
        boolean z = false;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("systemConfig", 0);
        if (!Environment.isExternalStorageLegacy() || sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) || sharedPreferences.getInt("migration_to_scoped_storage_count", 0) >= 5 || f || e != null || d) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!TextUtils.isEmpty(gba.e0)) {
                ArrayList c1 = gl.c1();
                int size = c1.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    File file = (File) c1.get(i);
                    if (file.getAbsolutePath().startsWith(gba.e0)) {
                        externalStorageDirectory = file;
                        break;
                    }
                    i++;
                }
            }
            c = new File(externalStorageDirectory, "Telegram").exists();
        }
        if (!c) {
            sharedPreferences.edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
            return;
        }
        ya0 ya0Var = new ya0(cj3Var.getParentActivity(), z);
        ya0Var.m1 = cj3Var;
        ya0Var.setCanceledOnTouchOutside(false);
        Activity parentActivity = cj3Var.getParentActivity();
        LinearLayout m = ir2.m(parentActivity, 1);
        aza azaVar = new aza(parentActivity, ya0Var.a);
        azaVar.setStickerNum(7);
        azaVar.getImageReceiver().M(1);
        m.addView(azaVar, nme.t(kk7.Z1, kk7.Z1, 1, 0, 16, 0, 0));
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i2 = bkb.i5;
        tb4.w(textView, i2, null, 1, 20.0f);
        textView.setText(k96.M0(2131748239, null));
        m.addView(textView, nme.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 15.0f);
        zkb.X(textView2, i2, null);
        textView2.setText(gl.T2(k96.M0(2131748240, null)));
        m.addView(textView2, nme.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gl.o());
        textView3.setText(k96.M0(2131748241, null));
        zkb.X(textView3, bkb.Ii, null);
        textView3.setBackground(sjb.f(bkb.Ei, 6.0f));
        m.addView(textView3, nme.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
        textView3.setOnClickListener(new yj3(ya0Var, (byte) 8));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(m);
        ya0Var.O = scrollView;
        e = ya0Var;
        ya0Var.show();
        f = true;
        sharedPreferences.edit().putInt("migration_to_scoped_storage_count", sharedPreferences.getInt("migration_to_scoped_storage_count", 0) + 1).apply();
    }

    public static int b(File file) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < listFiles.length; i2++) {
            i = listFiles[i2].isDirectory() ? b(listFiles[i2]) + i : i + 1;
        }
        return i;
    }

    public final void c(File file, File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    try {
                        convert.forEach(new ay2(this, file2, (byte) 1));
                        convert.close();
                    } finally {
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                try {
                    file.delete();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        im7.c();
        ir2.q();
        Notification build = fk.b(this, im7.k0).setContentTitle(k96.M0(2131748238, null)).setAutoCancel(false).setSmallIcon(R.drawable.notification).build();
        d = true;
        new ub4(this).start();
        try {
            startForeground(kk7.X4, build);
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        return super.onStartCommand(intent, i, i2);
    }

    public final void onTimeout(int i, int i2) {
        fa4.b("FilesMigrationService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}

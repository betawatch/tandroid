package androidx.profileinstaller;

import a3.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import ji.u4;
import r4.a;
import r4.d;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            d.s(context, new b(2), new u4(this, 19), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                u4 u4Var = new u4(this, 19);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    u4Var.x(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e7) {
                    u4Var.x(7, e7);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            u4 u4Var2 = new u4(this, 19);
            if (Build.VERSION.SDK_INT < 24) {
                u4Var2.x(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                u4Var2.x(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        u4 u4Var3 = new u4(this, 19);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            u4Var3.x(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (d.c(i10 >= 24 ? a.a(context) : i10 >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            u4Var3.x(14, null);
        } else {
            u4Var3.x(15, null);
        }
    }
}

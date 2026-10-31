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
import m2.t;
import r4.a;
import r4.d;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            d.s(context, new b(3), new t(this, 19), true);
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
                t tVar = new t(this, 19);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    tVar.r(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    tVar.r(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            t tVar2 = new t(this, 19);
            if (Build.VERSION.SDK_INT < 24) {
                tVar2.r(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                tVar2.r(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        t tVar3 = new t(this, 19);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            tVar3.r(16, null);
            return;
        }
        if (d.c(Build.VERSION.SDK_INT >= 24 ? a.a(context) : context.getCodeCacheDir())) {
            tVar3.r(14, null);
        } else {
            tVar3.r(15, null);
        }
    }
}

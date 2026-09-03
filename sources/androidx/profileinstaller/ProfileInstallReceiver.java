package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.biometric.f0;
import e2.a;
import e2.e;
import java.io.File;
import org.telegram.ui.sb0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            e.s(context, new sb0(1), new f0(this, 8), true);
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
                f0 f0Var = new f0(this, 8);
                try {
                    e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    f0Var.u(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e6) {
                    f0Var.u(7, e6);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            f0 f0Var2 = new f0(this, 8);
            if (Build.VERSION.SDK_INT < 24) {
                f0Var2.u(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                f0Var2.u(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        f0 f0Var3 = new f0(this, 8);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            f0Var3.u(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (e.c(i10 >= 24 ? a.a(context) : i10 >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            f0Var3.u(14, null);
        } else {
            f0Var3.u(15, null);
        }
    }
}

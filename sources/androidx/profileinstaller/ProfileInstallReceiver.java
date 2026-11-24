package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                acd.b(context, new hc((byte) 1), new s34(this, (byte) 28), true);
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
                    s34 s34Var = new s34(this, (byte) 28);
                    try {
                        acd.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        s34Var.f(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        s34Var.f(7, e);
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                s34 s34Var2 = new s34(this, (byte) 28);
                if (Build.VERSION.SDK_INT < 24) {
                    s34Var2.f(13, null);
                    return;
                } else {
                    Process.sendSignal(Process.myPid(), 10);
                    s34Var2.f(12, null);
                    return;
                }
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            s34 s34Var3 = new s34(this, (byte) 28);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                s34Var3.f(16, null);
                return;
            }
            if (znd.a(Build.VERSION.SDK_INT >= 24 ? kh0.g(context) : context.getCodeCacheDir())) {
                s34Var3.f(14, null);
            } else {
                s34Var3.f(15, null);
            }
        }
    }
}

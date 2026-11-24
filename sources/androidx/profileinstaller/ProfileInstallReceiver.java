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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                ced.b(context, new kc((byte) 1), new et8(this, (byte) 0), true);
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
                    et8 et8Var = new et8(this, (byte) 0);
                    try {
                        ced.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        et8Var.g(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        et8Var.g(7, e);
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                et8 et8Var2 = new et8(this, (byte) 0);
                if (Build.VERSION.SDK_INT < 24) {
                    et8Var2.g(13, null);
                    return;
                } else {
                    Process.sendSignal(Process.myPid(), 10);
                    et8Var2.g(12, null);
                    return;
                }
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            et8 et8Var3 = new et8(this, (byte) 0);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                et8Var3.g(16, null);
                return;
            }
            if (cqd.a(Build.VERSION.SDK_INT >= 24 ? ki0.g(context) : context.getCodeCacheDir())) {
                et8Var3.g(14, null);
            } else {
                et8Var3.g(15, null);
            }
        }
    }
}

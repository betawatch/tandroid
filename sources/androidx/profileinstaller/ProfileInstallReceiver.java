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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                tgd.b(context, new ic((byte) 1), new pq8(this, (byte) 1), true);
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
                    pq8 pq8Var = new pq8(this, (byte) 1);
                    try {
                        tgd.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        pq8Var.f(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        pq8Var.f(7, e);
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                pq8 pq8Var2 = new pq8(this, (byte) 1);
                if (Build.VERSION.SDK_INT < 24) {
                    pq8Var2.f(13, null);
                    return;
                } else {
                    Process.sendSignal(Process.myPid(), 10);
                    pq8Var2.f(12, null);
                    return;
                }
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            pq8 pq8Var3 = new pq8(this, (byte) 1);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                pq8Var3.f(16, null);
                return;
            }
            if (qsd.a(Build.VERSION.SDK_INT >= 24 ? lh0.g(context) : context.getCodeCacheDir())) {
                pq8Var3.f(14, null);
            } else {
                pq8Var3.f(15, null);
            }
        }
    }
}

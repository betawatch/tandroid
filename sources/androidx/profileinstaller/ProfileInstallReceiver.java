package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import d3.b;
import java.io.File;
import org.telegram.ui.Components.qf;
import u4.a;
import u4.d;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            d.s(context, new b(3), new qf(this, 21), true);
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
                qf qfVar = new qf(this, 21);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    qfVar.C(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    qfVar.C(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            qf qfVar2 = new qf(this, 21);
            if (Build.VERSION.SDK_INT < 24) {
                qfVar2.C(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                qfVar2.C(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        qf qfVar3 = new qf(this, 21);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            qfVar3.C(16, null);
            return;
        }
        if (d.c(Build.VERSION.SDK_INT >= 24 ? a.a(context) : context.getCodeCacheDir())) {
            qfVar3.C(14, null);
        } else {
            qfVar3.C(15, null);
        }
    }
}

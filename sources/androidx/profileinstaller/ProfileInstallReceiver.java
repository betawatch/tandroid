package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import e2.a;
import e2.d;
import ha.c;
import java.io.File;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            d.s(context, new ib0(1), new c(this, 14), true);
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
                c cVar = new c(this, 14);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    cVar.l0(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    cVar.l0(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            c cVar2 = new c(this, 14);
            if (Build.VERSION.SDK_INT < 24) {
                cVar2.l0(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                cVar2.l0(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        c cVar3 = new c(this, 14);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            cVar3.l0(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (d.c(i10 >= 24 ? a.a(context) : i10 >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            cVar3.l0(14, null);
        } else {
            cVar3.l0(15, null);
        }
    }
}

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
import org.telegram.ui.Components.uy;
import u4.a;
import u4.d;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
            d.s(context, new b(3), new uy(this, 22), true);
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
                uy uyVar = new uy(this, 22);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    uyVar.l0(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    uyVar.l0(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            uy uyVar2 = new uy(this, 22);
            if (Build.VERSION.SDK_INT < 24) {
                uyVar2.l0(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                uyVar2.l0(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        uy uyVar3 = new uy(this, 22);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            uyVar3.l0(16, null);
            return;
        }
        if (d.c(Build.VERSION.SDK_INT >= 24 ? a.a(context) : context.getCodeCacheDir())) {
            uyVar3.l0(14, null);
        } else {
            uyVar3.l0(15, null);
        }
    }
}

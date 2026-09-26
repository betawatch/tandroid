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
import r4.a;
import r4.d;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
            d.s(context, new b(2), new l.d(this), true);
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
                l.d dVar = new l.d(this);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    dVar.x(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    dVar.x(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            l.d dVar2 = new l.d(this);
            if (Build.VERSION.SDK_INT < 24) {
                dVar2.x(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                dVar2.x(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        l.d dVar3 = new l.d(this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            dVar3.x(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (d.c(i10 >= 24 ? a.a(context) : i10 >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            dVar3.x(14, null);
        } else {
            dVar3.x(15, null);
        }
    }
}

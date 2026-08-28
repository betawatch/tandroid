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
import e2.e;
import fa.c;
import java.io.File;
import org.telegram.ui.gb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            e.s(context, new gb0(1), new c(this, 12), true);
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
                c cVar = new c(this, 12);
                try {
                    e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    cVar.g(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    cVar.g(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            c cVar2 = new c(this, 12);
            if (Build.VERSION.SDK_INT < 24) {
                cVar2.g(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                cVar2.g(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        c cVar3 = new c(this, 12);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            cVar3.g(16, null);
            return;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (e.c(i9 >= 24 ? a.a(context) : i9 >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            cVar3.g(14, null);
        } else {
            cVar3.g(15, null);
        }
    }
}

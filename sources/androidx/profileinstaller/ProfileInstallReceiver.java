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
import java.io.File;
import o5.i;
import org.telegram.ui.rb0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            e.s(context, new rb0(1), new i(this, 13), true);
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
                i iVar = new i(this, 13);
                try {
                    e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    iVar.v(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    iVar.v(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            i iVar2 = new i(this, 13);
            if (Build.VERSION.SDK_INT < 24) {
                iVar2.v(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                iVar2.v(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        i iVar3 = new i(this, 13);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            iVar3.v(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (e.c(i10 >= 24 ? a.a(context) : i10 >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            iVar3.v(14, null);
        } else {
            iVar3.v(15, null);
        }
    }
}

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
import org.telegram.ui.Components.ff;
import u4.a;
import u4.d;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            d.s(context, new b(3), new ff(this, 20), true);
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
                ff ffVar = new ff(this, 20);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    ffVar.I(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    ffVar.I(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            ff ffVar2 = new ff(this, 20);
            if (Build.VERSION.SDK_INT < 24) {
                ffVar2.I(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                ffVar2.I(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        ff ffVar3 = new ff(this, 20);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            ffVar3.I(16, null);
            return;
        }
        if (d.c(Build.VERSION.SDK_INT >= 24 ? a.a(context) : context.getCodeCacheDir())) {
            ffVar3.I(14, null);
        } else {
            ffVar3.I(15, null);
        }
    }
}

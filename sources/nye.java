// default package

import android.app.AppOpsManager;
import android.os.Process;
import android.text.TextUtils;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class nye {
    public static boolean a() {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a.b.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), a.b.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            fa4.g(e, true);
            return true;
        }
    }

    public static boolean b() {
        return !TextUtils.isEmpty(gl.j1("ro.miui.ui.version.name"));
    }
}

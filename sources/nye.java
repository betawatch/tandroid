// default package

import android.app.AppOpsManager;
import android.os.Process;
import android.text.TextUtils;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

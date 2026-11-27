// default package

import android.app.AppOpsManager;
import android.os.Process;
import android.text.TextUtils;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class f3f {
    public static boolean a() {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a.b.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), a.b.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            cc4.g(e, true);
            return true;
        }
    }

    public static boolean b() {
        return !TextUtils.isEmpty(hl.j1("ro.miui.ui.version.name"));
    }
}

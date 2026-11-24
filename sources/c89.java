// default package

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class c89 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, u06 u06Var) {
        u06Var.getClass();
        if (activity instanceof e16) {
            g16 m = ((e16) activity).m();
            if (ug8.A(m)) {
                m.e(u06Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.Companion.getClass();
            d89.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new e89(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

// default package

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ob9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, y26 y26Var) {
        y26Var.getClass();
        if (activity instanceof i36) {
            k36 m = ((i36) activity).m();
            if (ik8.A(m)) {
                m.e(y26Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.Companion.getClass();
            pb9.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new qb9(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

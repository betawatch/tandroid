// default package

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

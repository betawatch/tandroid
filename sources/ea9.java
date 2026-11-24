// default package

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ea9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, u26 u26Var) {
        u26Var.getClass();
        if (activity instanceof e36) {
            g36 m = ((e36) activity).m();
            if (wi8.A(m)) {
                m.e(u26Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.Companion.getClass();
            fa9.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ga9(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

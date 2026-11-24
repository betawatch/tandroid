// default package

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

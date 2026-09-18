package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class b0 {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public kotlin.jvm.internal.h c;
    public final /* synthetic */ k0 d;

    public b0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        boolean K = k0.K(3);
        k0 k0Var = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + k0Var);
        }
        if (k0.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + k0Var.h);
        }
        a aVar = k0Var.h;
        if (aVar != null) {
            aVar.r = false;
            aVar.d();
            a aVar2 = k0Var.h;
            a0 a0Var = new a0(k0Var, 0);
            if (aVar2.p == null) {
                aVar2.p = new ArrayList();
            }
            aVar2.p.add(a0Var);
            k0Var.h.e(false, true);
            k0Var.i = true;
            k0Var.A(true);
            k0Var.E();
            k0Var.i = false;
            k0Var.h = null;
        }
    }
}

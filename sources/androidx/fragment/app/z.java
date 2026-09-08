package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class z {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public kotlin.jvm.internal.h c;
    public final /* synthetic */ i0 d;

    public z(i0 i0Var) {
        this.d = i0Var;
    }

    public final void a() {
        boolean K = i0.K(3);
        i0 i0Var = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + i0Var);
        }
        if (i0.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + i0Var.h);
        }
        a aVar = i0Var.h;
        if (aVar != null) {
            aVar.r = false;
            aVar.d();
            a aVar2 = i0Var.h;
            a3.d dVar = new a3.d(i0Var, 10);
            if (aVar2.p == null) {
                aVar2.p = new ArrayList();
            }
            aVar2.p.add(dVar);
            i0Var.h.e(false, true);
            i0Var.i = true;
            i0Var.A(true);
            i0Var.E();
            i0Var.i = false;
            i0Var.h = null;
        }
    }
}

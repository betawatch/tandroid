package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
            a3.d dVar = new a3.d(i0Var, 11);
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

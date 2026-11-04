package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public kotlin.jvm.internal.i c;
    public final /* synthetic */ j0 d;

    public a0(j0 j0Var) {
        this.d = j0Var;
    }

    public final void a() {
        boolean K = j0.K(3);
        j0 j0Var = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + j0Var);
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + j0Var.h);
        }
        a aVar = j0Var.h;
        if (aVar != null) {
            aVar.r = false;
            aVar.d();
            a aVar2 = j0Var.h;
            ai.s sVar = new ai.s(j0Var, 12);
            if (aVar2.p == null) {
                aVar2.p = new ArrayList();
            }
            aVar2.p.add(sVar);
            j0Var.h.e(false, true);
            j0Var.i = true;
            j0Var.A(true);
            j0Var.E();
            j0Var.i = false;
            j0Var.h = null;
        }
    }
}

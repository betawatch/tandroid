package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a0 {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public kotlin.jvm.internal.h c;
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
            a3.d dVar = new a3.d(j0Var, 9);
            if (aVar2.p == null) {
                aVar2.p = new ArrayList();
            }
            aVar2.p.add(dVar);
            j0Var.h.e(false, true);
            j0Var.i = true;
            j0Var.A(true);
            j0Var.E();
            j0Var.i = false;
            j0Var.h = null;
        }
    }
}

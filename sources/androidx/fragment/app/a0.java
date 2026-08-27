package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            af.e eVar = new af.e(j0Var, 12);
            if (aVar2.p == null) {
                aVar2.p = new ArrayList();
            }
            aVar2.p.add(eVar);
            j0Var.h.e(false, true);
            j0Var.i = true;
            j0Var.A(true);
            j0Var.E();
            j0Var.i = false;
            j0Var.h = null;
        }
    }
}

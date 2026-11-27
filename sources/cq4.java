// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class cq4 {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public sr4 c;
    public final /* synthetic */ kq4 d;

    public cq4(kq4 kq4Var) {
        this.d = kq4Var;
    }

    public final void a() {
        boolean K = kq4.K(3);
        kq4 kq4Var = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + kq4Var);
        }
        if (kq4.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + kq4Var.h);
        }
        kd0 kd0Var = kq4Var.h;
        if (kd0Var != null) {
            kd0Var.r = false;
            kd0Var.d();
            kd0 kd0Var2 = kq4Var.h;
            rj4 rj4Var = new rj4(kq4Var, (byte) 8);
            ArrayList arrayList = kd0Var2.p;
            if (arrayList == null) {
                arrayList = new ArrayList();
                kd0Var2.p = arrayList;
            }
            arrayList.add(rj4Var);
            kq4Var.h.e(false, true);
            kq4Var.i = true;
            kq4Var.A(true);
            kq4Var.E();
            kq4Var.i = false;
            kq4Var.h = null;
        }
    }
}

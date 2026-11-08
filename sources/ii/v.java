package ii;

import android.os.Bundle;
import org.telegram.ui.Components.s00;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ v(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                d0Var.r1.d.e3.h1(1, d0Var.L1.b);
                d0Var.i1.a(false, true);
                d0Var.q0 = true;
                s00 s00Var = d0Var.u1;
                org.telegram.messenger.g0.v1(s00Var.r);
                s00Var.r.clearFocus();
                break;
            case 1:
                d0 d0Var2 = this.b;
                d0Var2.t1.d.e3.h1(1, d0Var2.L1.b);
                d0Var2.j1.a(false, true);
                d0Var2.q0 = true;
                s00 s00Var2 = d0Var2.v1;
                org.telegram.messenger.g0.v1(s00Var2.r);
                s00Var2.r.clearFocus();
                break;
            default:
                d0 d0Var3 = this.b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.l1);
                d0Var3.q1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                break;
        }
    }
}

package li;

import android.os.Bundle;
import org.telegram.ui.Components.c10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ u(c0 c0Var, int i7) {
        this.a = i7;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c0 c0Var = this.b;
                c0Var.v1.d.f3.h1(1, c0Var.P1.b);
                c0Var.m1.a(false, true);
                c0Var.r0 = true;
                c10 c10Var = c0Var.y1;
                org.telegram.messenger.g0.v1(c10Var.r);
                c10Var.r.clearFocus();
                break;
            case 1:
                c0 c0Var2 = this.b;
                c0Var2.x1.d.f3.h1(1, c0Var2.P1.b);
                c0Var2.n1.a(false, true);
                c0Var2.r0 = true;
                c10 c10Var2 = c0Var2.z1;
                org.telegram.messenger.g0.v1(c10Var2.r);
                c10Var2.r.clearFocus();
                break;
            default:
                c0 c0Var3 = this.b;
                c0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", c0Var3.p1);
                c0Var3.u1.presentFragment(new o(bundle));
                c0Var3.dismiss();
                break;
        }
    }
}

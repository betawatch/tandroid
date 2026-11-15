package li;

import android.os.Bundle;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ u(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                d0Var.v1.d.f3.h1(1, d0Var.P1.b);
                d0Var.m1.a(false, true);
                d0Var.r0 = true;
                v00 v00Var = d0Var.y1;
                org.telegram.messenger.g0.v1(v00Var.r);
                v00Var.r.clearFocus();
                break;
            case 1:
                d0 d0Var2 = this.b;
                d0Var2.x1.d.f3.h1(1, d0Var2.P1.b);
                d0Var2.n1.a(false, true);
                d0Var2.r0 = true;
                v00 v00Var2 = d0Var2.z1;
                org.telegram.messenger.g0.v1(v00Var2.r);
                v00Var2.r.clearFocus();
                break;
            default:
                d0 d0Var3 = this.b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.p1);
                d0Var3.u1.presentFragment(new n(bundle));
                d0Var3.dismiss();
                break;
        }
    }
}

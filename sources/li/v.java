package li;

import android.os.Bundle;
import org.telegram.ui.Components.c10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                d0Var.v1.d.f3.h1(1, d0Var.P1.b);
                d0Var.m1.a(false, true);
                d0Var.r0 = true;
                c10 c10Var = d0Var.y1;
                org.telegram.messenger.g0.v1(c10Var.r);
                c10Var.r.clearFocus();
                break;
            case 1:
                d0 d0Var2 = this.b;
                d0Var2.x1.d.f3.h1(1, d0Var2.P1.b);
                d0Var2.n1.a(false, true);
                d0Var2.r0 = true;
                c10 c10Var2 = d0Var2.z1;
                org.telegram.messenger.g0.v1(c10Var2.r);
                c10Var2.r.clearFocus();
                break;
            default:
                d0 d0Var3 = this.b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.p1);
                d0Var3.u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                break;
        }
    }
}

package ji;

import android.os.Bundle;
import org.telegram.ui.Components.n00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ t(b0 b0Var, int i3) {
        this.a = i3;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                b0Var.s1.d.f3.h1(1, b0Var.M1.b);
                b0Var.j1.a(false, true);
                b0Var.r0 = true;
                n00 n00Var = b0Var.v1;
                org.telegram.messenger.g0.v1(n00Var.r);
                n00Var.r.clearFocus();
                break;
            case 1:
                b0 b0Var2 = this.b;
                b0Var2.u1.d.f3.h1(1, b0Var2.M1.b);
                b0Var2.k1.a(false, true);
                b0Var2.r0 = true;
                n00 n00Var2 = b0Var2.w1;
                org.telegram.messenger.g0.v1(n00Var2.r);
                n00Var2.r.clearFocus();
                break;
            default:
                b0 b0Var3 = this.b;
                b0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", b0Var3.m1);
                b0Var3.r1.presentFragment(new n(bundle));
                b0Var3.dismiss();
                break;
        }
    }
}

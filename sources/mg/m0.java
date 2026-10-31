package mg;

import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.w3;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements q4, xu0, og.g, og.l {
    public final /* synthetic */ w0 a;

    public /* synthetic */ m0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        w0 w0Var = this.a;
        w0Var.e2 = i10 * 1000;
        w0Var.k1(false, true);
    }

    @Override // org.telegram.ui.Components.xu0
    public void m(int i10) {
        w0 w0Var = this.a;
        int i11 = w0Var.Z1;
        int i12 = og.e.w;
        if (i11 == 2) {
            w0Var.f2 = i10;
        } else {
            w0Var.g2 = i10;
        }
        w0Var.i2.a.c(w0Var.f1(), true);
        if (w0Var.Z1 == 3) {
            w0Var.k1(true, true);
        } else {
            w0Var.k1(false, false);
        }
        ng.b bVar = w0Var.Y1;
        int f12 = w0Var.f1();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof og.z) {
                f6 f6Var = ((og.z) childAt).r;
                String G = f12 <= 0 ? "" : cd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                f6Var.a();
                f6Var.c(G, true, true);
            }
            if (childAt instanceof og.h) {
                og.h hVar = (og.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean V = w3.V(hVar.x);
                if (hVar.y) {
                    hVar.setSubtitle(F >= 1 ? cd.G(F, V ? "Subscribers" : "Members", new Object[0]) : cd.L0(V ? 2131751391 : 2131754876, null));
                } else {
                    hVar.setSubtitle(cd.G(f12, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.xu0
    public /* synthetic */ void s() {
    }
}

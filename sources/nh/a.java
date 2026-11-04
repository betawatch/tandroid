package nh;

import lg.n;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.xq;
import qe.c;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a implements qe.b {
    public final c a;
    public final c b;
    public final qe.a c;
    public final qe.a d;
    public final c2 e;
    public final n f;
    public boolean h;

    public a(c2 c2Var, n nVar) {
        xq xqVar = xq.h;
        this.a = new c(1, this, xqVar, 350L);
        this.b = new c(2, this, xqVar, 350L);
        this.c = new qe.a(0, this, xqVar, 350L, true);
        this.d = new qe.a(3, this, xqVar, 350L, true);
        this.h = true;
        this.e = c2Var;
        this.f = nVar;
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, c cVar) {
        c2 c2Var = this.e;
        if (i3 == 1) {
            c2Var.setTranslationX(this.a.f);
        }
        if (i3 == 2) {
            c2Var.setTranslationY(this.b.f);
        }
        qe.a aVar = this.d;
        qe.a aVar2 = this.c;
        if (i3 == 0) {
            c2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
            c2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            c2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            c2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i3 == 3) {
            c2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        n nVar = this.f;
        if (nVar != null) {
            nVar.run();
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}

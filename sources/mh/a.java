package mh;

import l2.a0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.wq;
import te.c;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a implements te.b {
    public final c a;
    public final c b;
    public final te.a c;
    public final te.a d;
    public final n2 e;
    public final a0 f;
    public boolean h;

    public a(n2 n2Var, a0 a0Var) {
        wq wqVar = wq.h;
        this.a = new c(1, this, wqVar, 350L);
        this.b = new c(2, this, wqVar, 350L);
        this.c = new te.a(0, this, wqVar, 350L, true);
        this.d = new te.a(3, this, wqVar, 350L, true);
        this.h = true;
        this.e = n2Var;
        this.f = a0Var;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, c cVar) {
        n2 n2Var = this.e;
        if (i7 == 1) {
            n2Var.setTranslationX(this.a.f);
        }
        if (i7 == 2) {
            n2Var.setTranslationY(this.b.f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.c;
        if (i7 == 0) {
            n2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
            n2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            n2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            n2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i7 == 3) {
            n2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        a0 a0Var = this.f;
        if (a0Var != null) {
            a0Var.run();
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}

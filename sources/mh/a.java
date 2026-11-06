package mh;

import l2.w;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import te.c;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a implements te.b {
    public final c a;
    public final c b;
    public final te.a c;
    public final te.a d;
    public final n2 e;
    public final w f;
    public boolean h;

    public a(n2 n2Var, w wVar) {
        xq xqVar = xq.h;
        this.a = new c(1, this, xqVar, 350L);
        this.b = new c(2, this, xqVar, 350L);
        this.c = new te.a(0, this, xqVar, 350L, true);
        this.d = new te.a(3, this, xqVar, 350L, true);
        this.h = true;
        this.e = n2Var;
        this.f = wVar;
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
        w wVar = this.f;
        if (wVar != null) {
            wVar.run();
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}

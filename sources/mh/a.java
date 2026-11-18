package mh;

import kg.j0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.voip.q2;
import te.c;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a implements te.b {
    public final c a;
    public final c b;
    public final te.a c;
    public final te.a d;
    public final q2 e;
    public final j0 f;
    public boolean h;

    public a(q2 q2Var, j0 j0Var) {
        lr lrVar = lr.h;
        this.a = new c(1, this, lrVar, 350L);
        this.b = new c(2, this, lrVar, 350L);
        this.c = new te.a(0, this, lrVar, 350L, true);
        this.d = new te.a(3, this, lrVar, 350L, true);
        this.h = true;
        this.e = q2Var;
        this.f = j0Var;
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, c cVar) {
        q2 q2Var = this.e;
        if (i7 == 1) {
            q2Var.setTranslationX(this.a.f);
        }
        if (i7 == 2) {
            q2Var.setTranslationY(this.b.f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.c;
        if (i7 == 0) {
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
            q2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            q2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            q2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i7 == 3) {
            q2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        j0 j0Var = this.f;
        if (j0Var != null) {
            j0Var.run();
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}

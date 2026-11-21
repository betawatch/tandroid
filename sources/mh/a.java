package mh;

import kg.i0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.voip.q2;
import te.c;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a implements te.b {
    public final c a;
    public final c b;
    public final te.a c;
    public final te.a d;
    public final q2 e;
    public final i0 f;
    public boolean h;

    public a(q2 q2Var, i0 i0Var) {
        nr nrVar = nr.h;
        this.a = new c(1, this, nrVar, 350L);
        this.b = new c(2, this, nrVar, 350L);
        this.c = new te.a(0, this, nrVar, 350L, true);
        this.d = new te.a(3, this, nrVar, 350L, true);
        this.h = true;
        this.e = q2Var;
        this.f = i0Var;
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
        i0 i0Var = this.f;
        if (i0Var != null) {
            i0Var.run();
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}

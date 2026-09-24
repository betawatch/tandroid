package kh;

import i2.h0;
import le.c;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.voip.w2;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class a implements e {
    public final f a;
    public final f b;
    public final c c;
    public final c d;
    public final w2 e;
    public final h0 f;
    public boolean h;

    public a(w2 w2Var, h0 h0Var) {
        rr rrVar = rr.h;
        this.a = new f(1, this, rrVar, 350L);
        this.b = new f(2, this, rrVar, 350L);
        this.c = new c(0, this, rrVar, 350L, true);
        this.d = new c(3, this, rrVar, 350L, true);
        this.h = true;
        this.e = w2Var;
        this.f = h0Var;
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, f fVar) {
        w2 w2Var = this.e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.b.e);
        }
        c cVar = this.d;
        c cVar2 = this.c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
        }
        h0 h0Var = this.f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}

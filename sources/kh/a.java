package kh;

import i2.h0;
import le.c;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.voip.v2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a implements e {
    public final f a;
    public final f b;
    public final c c;
    public final c d;
    public final v2 e;
    public final h0 f;
    public boolean h;

    public a(v2 v2Var, h0 h0Var) {
        rr rrVar = rr.h;
        this.a = new f(1, this, rrVar, 350L);
        this.b = new f(2, this, rrVar, 350L);
        this.c = new c(0, this, rrVar, 350L, true);
        this.d = new c(3, this, rrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f = h0Var;
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, f fVar) {
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.b.e);
        }
        c cVar = this.d;
        c cVar2 = this.c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
            v2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, cVar.e) * cVar2.e);
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

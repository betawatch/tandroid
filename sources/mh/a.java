package mh;

import kg.i0;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.voip.r2;
import te.c;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a implements te.b {
    public final c a;
    public final c b;
    public final te.a c;
    public final te.a d;
    public final r2 e;
    public final i0 f;
    public boolean h;

    public a(r2 r2Var, i0 i0Var) {
        kr krVar = kr.h;
        this.a = new c(1, this, krVar, 350L);
        this.b = new c(2, this, krVar, 350L);
        this.c = new te.a(0, this, krVar, 350L, true);
        this.d = new te.a(3, this, krVar, 350L, true);
        this.h = true;
        this.e = r2Var;
        this.f = i0Var;
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, c cVar) {
        r2 r2Var = this.e;
        if (i7 == 1) {
            r2Var.setTranslationX(this.a.f);
        }
        if (i7 == 2) {
            r2Var.setTranslationY(this.b.f);
        }
        te.a aVar = this.d;
        te.a aVar2 = this.c;
        if (i7 == 0) {
            r2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
            r2Var.setScaleX(g0.T1(0.3f, 1.0f, f10));
            r2Var.setScaleY(g0.T1(0.3f, 1.0f, f10));
            r2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i7 == 3) {
            r2Var.setAlpha(g0.T1(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        i0 i0Var = this.f;
        if (i0Var != null) {
            i0Var.run();
        }
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}

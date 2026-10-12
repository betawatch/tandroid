package lh;

import ig.t0;
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.voip.u2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final ne.b c;
    public final ne.b d;
    public final u2 e;
    public final t0 f;
    public boolean h;

    public a(u2 u2Var, t0 t0Var) {
        es esVar = es.h;
        this.a = new e(1, this, esVar, 350L);
        this.b = new e(2, this, esVar, 350L);
        this.c = new ne.b(0, this, esVar, 350L, true);
        this.d = new ne.b(3, this, esVar, 350L, true);
        this.h = true;
        this.e = u2Var;
        this.f = t0Var;
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, e eVar) {
        u2 u2Var = this.e;
        if (i10 == 1) {
            u2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            u2Var.setTranslationY(this.b.e);
        }
        ne.b bVar = this.d;
        ne.b bVar2 = this.c;
        if (i10 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            u2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        t0 t0Var = this.f;
        if (t0Var != null) {
            t0Var.run();
        }
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}

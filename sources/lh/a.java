package lh;

import ki.u;
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.voip.t2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final ne.b c;
    public final ne.b d;
    public final t2 e;
    public final u f;
    public boolean h;

    public a(t2 t2Var, u uVar) {
        bs bsVar = bs.h;
        this.a = new e(1, this, bsVar, 350L);
        this.b = new e(2, this, bsVar, 350L);
        this.c = new ne.b(0, this, bsVar, 350L, true);
        this.d = new ne.b(3, this, bsVar, 350L, true);
        this.h = true;
        this.e = t2Var;
        this.f = uVar;
    }

    @Override // ne.d
    public final void r(int i10, float f7, float f10, e eVar) {
        t2 t2Var = this.e;
        if (i10 == 1) {
            t2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            t2Var.setTranslationY(this.b.e);
        }
        ne.b bVar = this.d;
        ne.b bVar2 = this.c;
        if (i10 == 0) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            t2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            t2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            t2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        u uVar = this.f;
        if (uVar != null) {
            uVar.run();
        }
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}

package lh;

import ig.t0;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.voip.t2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final le.b c;
    public final le.b d;
    public final t2 e;
    public final t0 f;
    public boolean h;

    public a(t2 t2Var, t0 t0Var) {
        pr prVar = pr.h;
        this.a = new e(1, this, prVar, 350L);
        this.b = new e(2, this, prVar, 350L);
        this.c = new le.b(0, this, prVar, 350L, true);
        this.d = new le.b(3, this, prVar, 350L, true);
        this.h = true;
        this.e = t2Var;
        this.f = t0Var;
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, e eVar) {
        t2 t2Var = this.e;
        if (i10 == 1) {
            t2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            t2Var.setTranslationY(this.b.e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.c;
        if (i10 == 0) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            t2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            t2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            t2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            t2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        t0 t0Var = this.f;
        if (t0Var != null) {
            t0Var.run();
        }
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}

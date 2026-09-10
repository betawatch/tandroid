package jh;

import gg.v1;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final le.b c;
    public final le.b d;
    public final u2 e;
    public final v1 f;
    public boolean h;

    public a(u2 u2Var, v1 v1Var) {
        wr wrVar = wr.h;
        this.a = new e(1, this, wrVar, 350L);
        this.b = new e(2, this, wrVar, 350L);
        this.c = new le.b(0, this, wrVar, 350L, true);
        this.d = new le.b(3, this, wrVar, 350L, true);
        this.h = true;
        this.e = u2Var;
        this.f = v1Var;
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, e eVar) {
        u2 u2Var = this.e;
        if (i10 == 1) {
            u2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            u2Var.setTranslationY(this.b.e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.c;
        if (i10 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            u2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        v1 v1Var = this.f;
        if (v1Var != null) {
            v1Var.run();
        }
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}

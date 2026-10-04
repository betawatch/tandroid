package kh;

import i2.h0;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.voip.w2;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final le.b c;
    public final le.b d;
    public final w2 e;
    public final h0 f;
    public boolean h;

    public a(w2 w2Var, h0 h0Var) {
        tr trVar = tr.h;
        this.a = new e(1, this, trVar, 350L);
        this.b = new e(2, this, trVar, 350L);
        this.c = new le.b(0, this, trVar, 350L, true);
        this.d = new le.b(3, this, trVar, 350L, true);
        this.h = true;
        this.e = w2Var;
        this.f = h0Var;
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, e eVar) {
        w2 w2Var = this.e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.b.e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        h0 h0Var = this.f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}

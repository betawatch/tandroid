package kh;

import i2.g0;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.voip.v2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final le.b c;
    public final le.b d;
    public final v2 e;
    public final g0 f;
    public boolean h;

    public a(v2 v2Var, g0 g0Var) {
        qr qrVar = qr.h;
        this.a = new e(1, this, qrVar, 350L);
        this.b = new e(2, this, qrVar, 350L);
        this.c = new le.b(0, this, qrVar, 350L, true);
        this.d = new le.b(3, this, qrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f = g0Var;
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, e eVar) {
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.b.e);
        }
        le.b bVar = this.d;
        le.b bVar2 = this.c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            v2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        g0 g0Var = this.f;
        if (g0Var != null) {
            g0Var.run();
        }
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}

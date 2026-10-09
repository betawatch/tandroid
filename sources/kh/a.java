package kh;

import i2.h0;
import me.d;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.voip.v2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final me.b c;
    public final me.b d;
    public final v2 e;
    public final h0 f;
    public boolean h;

    public a(v2 v2Var, h0 h0Var) {
        hs hsVar = hs.h;
        this.a = new e(1, this, hsVar, 350L);
        this.b = new e(2, this, hsVar, 350L);
        this.c = new me.b(0, this, hsVar, 350L, true);
        this.d = new me.b(3, this, hsVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f = h0Var;
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, e eVar) {
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.b.e);
        }
        me.b bVar = this.d;
        me.b bVar2 = this.c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            v2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            v2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        h0 h0Var = this.f;
        if (h0Var != null) {
            h0Var.run();
        }
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}

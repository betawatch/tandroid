package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements o1.g {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ oh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.o1;
                LinearLayout linearLayout2 = viVar.q1;
                float f11 = f7 / 500.0f;
                ji jiVar = viVar.e0;
                ni niVar = viVar.B0;
                Float valueOf = Float.valueOf(f11);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.a1.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                viVar.b2(viVar.B0, 0);
                viVar.b2(viVar.C0, 0);
                if (!(viVar.C0 instanceof en) || this.b) {
                    f11 = 1.0f - f11;
                }
                float clamp = Utilities.clamp(f11, 1.0f, 0.0f);
                linearLayout2.setAlpha(clamp);
                float f12 = 1.0f - clamp;
                linearLayout.setAlpha(f12);
                linearLayout.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f12 * AndroidUtilities.dp(16.0f));
                break;
            default:
                xp0 xp0Var = (xp0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !xp0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !xp0Var.r) {
                }
                xp0Var.s = !z10;
                xp0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ oh(xp0 xp0Var, boolean z10, float f7, float f10) {
        this.e = xp0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}

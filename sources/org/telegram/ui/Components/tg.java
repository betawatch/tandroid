package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements o1.g {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ tg(bi biVar, float f7, float f10, boolean z10) {
        this.e = biVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.e;
                LinearLayout linearLayout = biVar.f3;
                LinearLayout linearLayout2 = biVar.h3;
                float f11 = f7 / 500.0f;
                mh mhVar = biVar.V1;
                uh uhVar = biVar.s2;
                Float valueOf = Float.valueOf(f11);
                mhVar.getClass();
                mhVar.a(uhVar, valueOf);
                biVar.R2.setAlpha(org.telegram.messenger.i0.T1(this.c, this.d, f11));
                biVar.L1(biVar.s2, 0);
                biVar.L1(biVar.t2, 0);
                if (!(biVar.t2 instanceof jm) || this.b) {
                    f11 = 1.0f - f11;
                }
                float i10 = Utilities.i(f11, 1.0f, 0.0f);
                linearLayout2.setAlpha(i10);
                float f12 = 1.0f - i10;
                linearLayout.setAlpha(f12);
                linearLayout.setTranslationX(i10 * (-org.telegram.messenger.i0.L(16.0f)));
                linearLayout2.setTranslationX(f12 * org.telegram.messenger.i0.L(16.0f));
                break;
            default:
                eo0 eo0Var = (eo0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !eo0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !eo0Var.r) {
                }
                eo0Var.s = !z10;
                eo0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ tg(eo0 eo0Var, boolean z10, float f7, float f10) {
        this.e = eo0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}

package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements q1.d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ ug(bi biVar, float f10, float f11, boolean z10) {
        this.e = biVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.e;
                LinearLayout linearLayout = biVar.g3;
                LinearLayout linearLayout2 = biVar.i3;
                float f12 = f10 / 500.0f;
                lh lhVar = biVar.W1;
                th thVar = biVar.t2;
                Float valueOf = Float.valueOf(f12);
                lhVar.getClass();
                lhVar.a(thVar, valueOf);
                biVar.S2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                biVar.M1(biVar.t2, 0);
                biVar.M1(biVar.u2, 0);
                if (!(biVar.u2 instanceof am) || this.b) {
                    f12 = 1.0f - f12;
                }
                float i3 = Utilities.i(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(i3);
                float f13 = 1.0f - i3;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(i3 * (-org.telegram.messenger.g0.L(16.0f)));
                linearLayout2.setTranslationX(f13 * org.telegram.messenger.g0.L(16.0f));
                break;
            default:
                fn0 fn0Var = (fn0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !fn0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !fn0Var.r) {
                }
                fn0Var.s = !z10;
                fn0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ ug(fn0 fn0Var, boolean z10, float f10, float f11) {
        this.e = fn0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}

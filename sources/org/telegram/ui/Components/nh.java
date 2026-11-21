package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements r1.d {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ nh(ui uiVar, float f10, float f11, boolean z10) {
        this.e = uiVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.e;
                LinearLayout linearLayout = uiVar.j3;
                LinearLayout linearLayout2 = uiVar.l3;
                float f12 = f10 / 500.0f;
                fi fiVar = uiVar.Z1;
                mi miVar = uiVar.w2;
                Float valueOf = Float.valueOf(f12);
                fiVar.getClass();
                fiVar.a(miVar, valueOf);
                uiVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                uiVar.N1(uiVar.w2, 0);
                uiVar.N1(uiVar.x2, 0);
                if (!(uiVar.x2 instanceof rm) || this.b) {
                    f12 = 1.0f - f12;
                }
                float i7 = Utilities.i(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(i7);
                float f13 = 1.0f - i7;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(i7 * (-org.telegram.messenger.g0.L(16.0f)));
                linearLayout2.setTranslationX(f13 * org.telegram.messenger.g0.L(16.0f));
                break;
            default:
                rn0 rn0Var = (rn0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !rn0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !rn0Var.r) {
                }
                rn0Var.s = !z10;
                rn0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ nh(rn0 rn0Var, boolean z10, float f10, float f11) {
        this.e = rn0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}

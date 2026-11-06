package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements r1.d {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ xg(di diVar, float f10, float f11, boolean z9) {
        this.e = diVar;
        this.c = f10;
        this.d = f11;
        this.b = z9;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                di diVar = (di) this.e;
                LinearLayout linearLayout = diVar.f3;
                LinearLayout linearLayout2 = diVar.h3;
                float f12 = f10 / 500.0f;
                oh ohVar = diVar.V1;
                vh vhVar = diVar.s2;
                Float valueOf = Float.valueOf(f12);
                ohVar.getClass();
                ohVar.a(vhVar, valueOf);
                diVar.R2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                diVar.M1(diVar.s2, 0);
                diVar.M1(diVar.t2, 0);
                if (!(diVar.t2 instanceof bm) || this.b) {
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
                cn0 cn0Var = (cn0) this.e;
                boolean z9 = this.b;
                if (z9) {
                    if (f10 > this.c / 2.0f || !cn0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !cn0Var.r) {
                }
                cn0Var.s = !z9;
                cn0Var.r = z9;
                break;
        }
    }

    public /* synthetic */ xg(cn0 cn0Var, boolean z9, float f10, float f11) {
        this.e = cn0Var;
        this.b = z9;
        this.c = f10;
        this.d = f11;
    }
}

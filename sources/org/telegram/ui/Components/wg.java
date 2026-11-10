package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements r1.d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ wg(ci ciVar, float f10, float f11, boolean z9) {
        this.e = ciVar;
        this.c = f10;
        this.d = f11;
        this.b = z9;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.e;
                LinearLayout linearLayout = ciVar.i3;
                LinearLayout linearLayout2 = ciVar.k3;
                float f12 = f10 / 500.0f;
                nh nhVar = ciVar.Y1;
                uh uhVar = ciVar.v2;
                Float valueOf = Float.valueOf(f12);
                nhVar.getClass();
                nhVar.a(uhVar, valueOf);
                ciVar.U2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                ciVar.M1(ciVar.v2, 0);
                ciVar.M1(ciVar.w2, 0);
                if (!(ciVar.w2 instanceof am) || this.b) {
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

    public /* synthetic */ wg(cn0 cn0Var, boolean z9, float f10, float f11) {
        this.e = cn0Var;
        this.b = z9;
        this.c = f10;
        this.d = f11;
    }
}

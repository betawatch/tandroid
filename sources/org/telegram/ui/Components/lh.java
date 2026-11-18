package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements r1.d {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ lh(si siVar, float f10, float f11, boolean z10) {
        this.e = siVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                si siVar = (si) this.e;
                LinearLayout linearLayout = siVar.j3;
                LinearLayout linearLayout2 = siVar.l3;
                float f12 = f10 / 500.0f;
                di diVar = siVar.Z1;
                ki kiVar = siVar.w2;
                Float valueOf = Float.valueOf(f12);
                diVar.getClass();
                diVar.a(kiVar, valueOf);
                siVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                siVar.N1(siVar.w2, 0);
                siVar.N1(siVar.x2, 0);
                if (!(siVar.x2 instanceof pm) || this.b) {
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
                pn0 pn0Var = (pn0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !pn0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !pn0Var.r) {
                }
                pn0Var.s = !z10;
                pn0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ lh(pn0 pn0Var, boolean z10, float f10, float f11) {
        this.e = pn0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}

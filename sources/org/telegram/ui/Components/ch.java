package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements r1.d {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ ch(ki kiVar, float f10, float f11, boolean z10) {
        this.e = kiVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.e;
                LinearLayout linearLayout = kiVar.j3;
                LinearLayout linearLayout2 = kiVar.l3;
                float f12 = f10 / 500.0f;
                vh vhVar = kiVar.Z1;
                ci ciVar = kiVar.w2;
                Float valueOf = Float.valueOf(f12);
                vhVar.getClass();
                vhVar.a(ciVar, valueOf);
                kiVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                kiVar.M1(kiVar.w2, 0);
                kiVar.M1(kiVar.x2, 0);
                if (!(kiVar.x2 instanceof im) || this.b) {
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
                gn0 gn0Var = (gn0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !gn0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !gn0Var.r) {
                }
                gn0Var.s = !z10;
                gn0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ ch(gn0 gn0Var, boolean z10, float f10, float f11) {
        this.e = gn0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jg0(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                kg0 kg0Var = (kg0) this.c;
                if (!z4) {
                    mg0 mg0Var = kg0Var.d;
                    mg0Var.J.u.i = (mg0Var.E / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
            case 1:
                ph.da daVar = (ph.da) this.c;
                if (!z4) {
                    daVar.J0.setTranslationY(this.b);
                    daVar.J0.H = false;
                    daVar.l2 = null;
                    daVar.m2 = null;
                    break;
                }
                break;
            default:
                rh.m3 m3Var = (rh.m3) this.c;
                m3Var.v = null;
                float f12 = this.b;
                if (!z4) {
                    m3Var.f = f12;
                    m3Var.c();
                    break;
                } else {
                    m3Var.h = f12;
                    break;
                }
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kg0(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                lg0 lg0Var = (lg0) this.c;
                if (!z4) {
                    ng0 ng0Var = lg0Var.d;
                    ng0Var.J.u.i = (ng0Var.E / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
            case 1:
                qh.ca caVar = (qh.ca) this.c;
                if (!z4) {
                    caVar.J0.setTranslationY(this.b);
                    caVar.J0.H = false;
                    caVar.l2 = null;
                    caVar.m2 = null;
                    break;
                }
                break;
            default:
                sh.m3 m3Var = (sh.m3) this.c;
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

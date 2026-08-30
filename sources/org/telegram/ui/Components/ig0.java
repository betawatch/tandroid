package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ig0(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                jg0 jg0Var = (jg0) this.c;
                if (!z4) {
                    lg0 lg0Var = jg0Var.d;
                    lg0Var.J.u.i = (lg0Var.E / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
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
                rh.n3 n3Var = (rh.n3) this.c;
                n3Var.v = null;
                float f12 = this.b;
                if (!z4) {
                    n3Var.f = f12;
                    n3Var.c();
                    break;
                } else {
                    n3Var.h = f12;
                    break;
                }
        }
    }
}

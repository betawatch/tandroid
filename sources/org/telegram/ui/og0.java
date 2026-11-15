package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class og0 extends hi.d {
    public final /* synthetic */ int l0;
    public final /* synthetic */ org.telegram.ui.Components.ja m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og0(org.telegram.ui.Components.ja jaVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var, true);
        this.l0 = i7;
        this.m0 = jaVar;
    }

    @Override // hi.d
    public final float b(float f10, float f11) {
        switch (this.l0) {
            case 0:
                qg0 qg0Var = (qg0) this.m0;
                boolean z10 = qg0Var.j2 == 0.0f;
                qg0Var.j2 = f10;
                if (z10) {
                    qg0Var.k2 = new org.telegram.ui.Components.hp(qg0Var, 2);
                    qg0Var.e1(false);
                    break;
                }
                break;
            default:
                wg.c1 c1Var = (wg.c1) this.m0;
                boolean z11 = c1Var.p2 == 0.0f;
                c1Var.p2 = f10;
                if (z11) {
                    c1Var.q2 = new org.telegram.ui.Components.hp(c1Var, 3);
                    c1Var.n1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}

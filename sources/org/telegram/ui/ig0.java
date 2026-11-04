package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ig0 extends gi.d {
    public final /* synthetic */ int l0;
    public final /* synthetic */ org.telegram.ui.Components.ma m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var, true);
        this.l0 = i3;
        this.m0 = maVar;
    }

    @Override // gi.d
    public final float b(float f10, float f11) {
        switch (this.l0) {
            case 0:
                kg0 kg0Var = (kg0) this.m0;
                boolean z10 = kg0Var.g2 == 0.0f;
                kg0Var.g2 = f10;
                if (z10) {
                    kg0Var.h2 = new org.telegram.ui.Components.yo(kg0Var, 2);
                    kg0Var.e1(false);
                    break;
                }
                break;
            default:
                xg.e1 e1Var = (xg.e1) this.m0;
                boolean z11 = e1Var.m2 == 0.0f;
                e1Var.m2 = f10;
                if (z11) {
                    e1Var.n2 = new org.telegram.ui.Components.yo(e1Var, 3);
                    e1Var.n1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gj0 extends qh.d {
    public final /* synthetic */ ij0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(ij0 ij0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true);
        this.e0 = ij0Var;
    }

    @Override // qh.d
    public final float a(float f10, float f11) {
        ij0 ij0Var = this.e0;
        boolean z4 = ij0Var.k0 == 0.0f;
        ij0Var.k0 = f10;
        if (z4) {
            ij0Var.l0 = new hg.o2(ij0Var, 2);
            ij0Var.S(false);
        }
        return f10;
    }
}

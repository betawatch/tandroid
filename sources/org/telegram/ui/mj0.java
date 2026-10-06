package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class mj0 extends ci.d {
    public final /* synthetic */ oj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = oj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        oj0 oj0Var = this.h0;
        boolean z10 = oj0Var.n0 == 0.0f;
        oj0Var.n0 = f7;
        if (z10) {
            oj0Var.o0 = new org.telegram.ui.Components.fb0(oj0Var, 1);
            oj0Var.Q(false);
        }
        return f7;
    }
}

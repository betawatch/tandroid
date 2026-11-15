package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.w41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t7 extends org.telegram.ui.Components.i9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 H;
    public final /* synthetic */ v7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(v7 v7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.I = v7Var;
        this.H = e6Var;
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        v7 v7Var = this.I;
        w41 w41Var = v7Var.w;
        if (w41Var == null || !(w41Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        v7Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        fi.h7 h7Var = v7Var.r;
        h7Var.a = false;
        h7Var.b = false;
        h7Var.v = true;
        h7Var.o = false;
        h7Var.z = 1;
        h7Var.J = this.H;
        fi.l7.h(0L, canvas, this.a, h7Var);
    }
}

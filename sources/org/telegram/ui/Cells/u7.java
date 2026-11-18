package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u7 extends org.telegram.ui.Components.q9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 H;
    public final /* synthetic */ w7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = w7Var;
        this.H = i6Var;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        w7 w7Var = this.I;
        z41 z41Var = w7Var.w;
        if (z41Var == null || !(z41Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        w7Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        fi.e7 e7Var = w7Var.r;
        e7Var.a = false;
        e7Var.b = false;
        e7Var.v = true;
        e7Var.o = false;
        e7Var.z = 1;
        e7Var.J = this.H;
        fi.i7.h(0L, canvas, this.a, e7Var);
    }
}

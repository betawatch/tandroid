package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v7 extends org.telegram.ui.Components.q9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 H;
    public final /* synthetic */ x7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(x7 x7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = x7Var;
        this.H = i6Var;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        x7 x7Var = this.I;
        z41 z41Var = x7Var.w;
        if (z41Var == null || !(z41Var.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        x7Var.r.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        fi.e7 e7Var = x7Var.r;
        e7Var.a = false;
        e7Var.b = false;
        e7Var.v = true;
        e7Var.o = false;
        e7Var.z = 1;
        e7Var.J = this.H;
        fi.i7.h(0L, canvas, this.a, e7Var);
    }
}

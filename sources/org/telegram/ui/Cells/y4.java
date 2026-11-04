package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 H;
    public final /* synthetic */ a5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.I = a5Var;
        this.H = e6Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.I;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        a5Var.O.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ei.o7 o7Var = a5Var.O;
        o7Var.a = false;
        o7Var.b = false;
        o7Var.v = true;
        o7Var.o = false;
        o7Var.J = this.H;
        TL_stories.StoryItem storyItem = a5Var.r;
        o7Var.d = storyItem;
        ei.s7.h(storyItem.dialogId, canvas, this.a, o7Var);
    }
}

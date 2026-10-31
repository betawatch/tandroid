package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c5 extends org.telegram.ui.Components.g9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 G;
    public final /* synthetic */ e5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(e5 e5Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.H = e5Var;
        this.G = p6Var;
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        e5 e5Var = this.H;
        if (e5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.i0.L(1.0f);
        e5Var.N.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        th.t5 t5Var = e5Var.N;
        t5Var.a = false;
        t5Var.b = false;
        t5Var.v = true;
        t5Var.o = false;
        t5Var.J = this.G;
        TL_stories.StoryItem storyItem = e5Var.r;
        t5Var.d = storyItem;
        th.w5.h(storyItem.dialogId, canvas, this.a, t5Var);
    }
}

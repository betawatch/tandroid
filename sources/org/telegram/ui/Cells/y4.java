package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 G;
    public final /* synthetic */ a5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = a5Var;
        this.G = g6Var;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.H;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        a5Var.N.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        di.o7 o7Var = a5Var.N;
        o7Var.a = false;
        o7Var.b = false;
        o7Var.v = true;
        o7Var.o = false;
        o7Var.J = this.G;
        TL_stories.StoryItem storyItem = a5Var.r;
        o7Var.d = storyItem;
        di.s7.h(storyItem.dialogId, canvas, this.a, o7Var);
    }
}

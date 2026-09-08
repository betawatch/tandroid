package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.x9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ a5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = a5Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.H;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        bi.j9 j9Var = a5Var.N;
        j9Var.a = false;
        j9Var.b = false;
        j9Var.v = true;
        j9Var.o = false;
        j9Var.J = this.G;
        TL_stories.StoryItem storyItem = a5Var.r;
        j9Var.d = storyItem;
        bi.p9.h(storyItem.dialogId, canvas, this.a, j9Var);
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z4 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 D;
    public final /* synthetic */ b5 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = b5Var;
        this.D = g6Var;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        b5 b5Var = this.E;
        if (b5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        b5Var.K.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        oh.i7 i7Var = b5Var.K;
        i7Var.a = false;
        i7Var.b = false;
        i7Var.v = true;
        i7Var.o = false;
        i7Var.J = this.D;
        TL_stories.StoryItem storyItem = b5Var.r;
        i7Var.d = storyItem;
        oh.m7.h(storyItem.dialogId, canvas, this.a, i7Var);
    }
}

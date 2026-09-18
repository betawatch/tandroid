package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z4 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 G;
    public final /* synthetic */ b5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = b5Var;
        this.G = e6Var;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        b5 b5Var = this.H;
        if (b5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        b5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ai.ca caVar = b5Var.N;
        caVar.a = false;
        caVar.b = false;
        caVar.v = true;
        caVar.o = false;
        caVar.J = this.G;
        TL_stories.StoryItem storyItem = b5Var.r;
        caVar.d = storyItem;
        ai.ia.h(storyItem.dialogId, canvas, this.a, caVar);
    }
}

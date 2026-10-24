package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 G;
    public final /* synthetic */ a5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = a5Var;
        this.G = g6Var;
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.H;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ci.x7 x7Var = a5Var.N;
        x7Var.a = false;
        x7Var.b = false;
        x7Var.v = true;
        x7Var.o = false;
        x7Var.J = this.G;
        TL_stories.StoryItem storyItem = a5Var.r;
        x7Var.d = storyItem;
        ci.c8.h(storyItem.dialogId, canvas, this.a, x7Var);
    }
}

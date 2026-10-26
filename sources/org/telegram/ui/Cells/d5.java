package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d5 extends org.telegram.ui.Components.y9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 G;
    public final /* synthetic */ f5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(f5 f5Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.H = f5Var;
        this.G = u6Var;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        f5 f5Var = this.H;
        if (f5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        f5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        di.w7 w7Var = f5Var.N;
        w7Var.a = false;
        w7Var.b = false;
        w7Var.v = true;
        w7Var.o = false;
        w7Var.J = this.G;
        TL_stories.StoryItem storyItem = f5Var.r;
        w7Var.d = storyItem;
        di.a8.h(storyItem.dialogId, canvas, this.a, w7Var);
    }
}

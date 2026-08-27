package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w4 extends org.telegram.ui.Components.n9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 C;
    public final /* synthetic */ y4 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(y4 y4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = y4Var;
        this.C = c6Var;
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        y4 y4Var = this.D;
        if (y4Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        y4Var.J.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        jh.h7 h7Var = y4Var.J;
        h7Var.a = false;
        h7Var.b = false;
        h7Var.v = true;
        h7Var.o = false;
        h7Var.J = this.C;
        TL_stories.StoryItem storyItem = y4Var.r;
        h7Var.d = storyItem;
        jh.l7.h(storyItem.dialogId, canvas, this.a, h7Var);
    }
}

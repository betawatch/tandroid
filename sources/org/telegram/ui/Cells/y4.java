package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 D;
    public final /* synthetic */ a5 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = a5Var;
        this.D = f6Var;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.E;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a5Var.K.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        nh.i7 i7Var = a5Var.K;
        i7Var.a = false;
        i7Var.b = false;
        i7Var.v = true;
        i7Var.o = false;
        i7Var.J = this.D;
        TL_stories.StoryItem storyItem = a5Var.r;
        i7Var.d = storyItem;
        nh.m7.h(storyItem.dialogId, canvas, this.a, i7Var);
    }
}

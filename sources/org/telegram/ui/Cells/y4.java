package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.u9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ a5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = a5Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.H;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        a5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ai.ca caVar = a5Var.N;
        caVar.a = false;
        caVar.b = false;
        caVar.v = true;
        caVar.o = false;
        caVar.J = this.G;
        TL_stories.StoryItem storyItem = a5Var.r;
        caVar.d = storyItem;
        ai.ia.h(storyItem.dialogId, canvas, this.a, caVar);
    }
}

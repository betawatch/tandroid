package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x4 extends org.telegram.ui.Components.t9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 C;
    public final /* synthetic */ z4 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(z4 z4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = z4Var;
        this.C = c6Var;
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        z4 z4Var = this.D;
        if (z4Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        z4Var.J.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        lh.h7 h7Var = z4Var.J;
        h7Var.a = false;
        h7Var.b = false;
        h7Var.v = true;
        h7Var.o = false;
        h7Var.J = this.C;
        TL_stories.StoryItem storyItem = z4Var.r;
        h7Var.d = storyItem;
        lh.l7.h(storyItem.dialogId, canvas, this.a, h7Var);
    }
}

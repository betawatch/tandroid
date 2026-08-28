package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z4 extends org.telegram.ui.Components.o9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 C;
    public final /* synthetic */ b5 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = b5Var;
        this.C = b6Var;
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        b5 b5Var = this.D;
        if (b5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        b5Var.J.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ih.l7 l7Var = b5Var.J;
        l7Var.a = false;
        l7Var.b = false;
        l7Var.v = true;
        l7Var.o = false;
        l7Var.J = this.C;
        TL_stories.StoryItem storyItem = b5Var.r;
        l7Var.d = storyItem;
        ih.p7.h(storyItem.dialogId, canvas, this.a, l7Var);
    }
}

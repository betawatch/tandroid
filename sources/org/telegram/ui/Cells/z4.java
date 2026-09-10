package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z4 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ b5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = b5Var;
        this.G = f6Var;
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
        zh.x5 x5Var = b5Var.N;
        x5Var.a = false;
        x5Var.b = false;
        x5Var.v = true;
        x5Var.o = false;
        x5Var.J = this.G;
        TL_stories.StoryItem storyItem = b5Var.r;
        x5Var.d = storyItem;
        zh.a6.h(storyItem.dialogId, canvas, this.a, x5Var);
    }
}

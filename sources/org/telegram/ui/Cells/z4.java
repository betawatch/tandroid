package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z4 extends org.telegram.ui.Components.y9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 G;
    public final /* synthetic */ b5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = b5Var;
        this.G = e6Var;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        b5 b5Var = this.H;
        if (b5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        b5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ai.da daVar = b5Var.N;
        daVar.a = false;
        daVar.b = false;
        daVar.v = true;
        daVar.o = false;
        daVar.J = this.G;
        TL_stories.StoryItem storyItem = b5Var.r;
        daVar.d = storyItem;
        ai.ja.h(storyItem.dialogId, canvas, this.a, daVar);
    }
}

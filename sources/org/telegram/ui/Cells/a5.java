package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a5 extends org.telegram.ui.Components.v9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ c5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(c5 c5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = c5Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
    public final void onDraw(Canvas canvas) {
        c5 c5Var = this.H;
        if (c5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float dp = AndroidUtilities.dp(1.0f);
        c5Var.N.F.set(dp, dp, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        ai.ca caVar = c5Var.N;
        caVar.a = false;
        caVar.b = false;
        caVar.v = true;
        caVar.o = false;
        caVar.J = this.G;
        TL_stories.StoryItem storyItem = c5Var.r;
        caVar.d = storyItem;
        ai.ia.h(storyItem.dialogId, canvas, this.a, caVar);
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 G;
    public final /* synthetic */ a5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = a5Var;
        this.G = f6Var;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.H;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        a5Var.N.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        di.n7 n7Var = a5Var.N;
        n7Var.a = false;
        n7Var.b = false;
        n7Var.v = true;
        n7Var.o = false;
        n7Var.J = this.G;
        TL_stories.StoryItem storyItem = a5Var.r;
        n7Var.d = storyItem;
        di.r7.h(storyItem.dialogId, canvas, this.a, n7Var);
    }
}

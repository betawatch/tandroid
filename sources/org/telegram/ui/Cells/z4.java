package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class z4 extends org.telegram.ui.Components.q9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 H;
    public final /* synthetic */ b5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.I = b5Var;
        this.H = h6Var;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        b5 b5Var = this.I;
        if (b5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        b5Var.O.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        fi.e7 e7Var = b5Var.O;
        e7Var.a = false;
        e7Var.b = false;
        e7Var.v = true;
        e7Var.o = false;
        e7Var.J = this.H;
        TL_stories.StoryItem storyItem = b5Var.r;
        e7Var.d = storyItem;
        fi.i7.h(storyItem.dialogId, canvas, this.a, e7Var);
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.q9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 H;
    public final /* synthetic */ a5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = a5Var;
        this.H = i6Var;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.I;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        a5Var.O.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        fi.e7 e7Var = a5Var.O;
        e7Var.a = false;
        e7Var.b = false;
        e7Var.v = true;
        e7Var.o = false;
        e7Var.J = this.H;
        TL_stories.StoryItem storyItem = a5Var.r;
        e7Var.d = storyItem;
        fi.i7.h(storyItem.dialogId, canvas, this.a, e7Var);
    }
}

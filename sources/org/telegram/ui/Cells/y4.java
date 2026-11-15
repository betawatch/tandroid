package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y4 extends org.telegram.ui.Components.i9 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 H;
    public final /* synthetic */ a5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.I = a5Var;
        this.H = e6Var;
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        a5 a5Var = this.I;
        if (a5Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = org.telegram.messenger.g0.L(1.0f);
        a5Var.O.F.set(L, L, getMeasuredWidth() - r1, getMeasuredHeight() - r1);
        fi.h7 h7Var = a5Var.O;
        h7Var.a = false;
        h7Var.b = false;
        h7Var.v = true;
        h7Var.o = false;
        h7Var.J = this.H;
        TL_stories.StoryItem storyItem = a5Var.r;
        h7Var.d = storyItem;
        fi.l7.h(storyItem.dialogId, canvas, this.a, h7Var);
    }
}

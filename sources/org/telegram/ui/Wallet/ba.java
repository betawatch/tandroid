package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class ba extends FrameLayout {
    public final /* synthetic */ da a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(da daVar, Context context) {
        super(context);
        this.a = daVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        da daVar = this.a;
        daVar.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (daVar.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}

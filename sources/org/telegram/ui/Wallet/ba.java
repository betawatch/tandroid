package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

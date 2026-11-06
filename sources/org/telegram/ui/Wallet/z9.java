package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class z9 extends FrameLayout {
    public final /* synthetic */ ba a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(ba baVar, Context context) {
        super(context);
        this.a = baVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        ba baVar = this.a;
        baVar.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (baVar.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}

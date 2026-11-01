package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class da extends FrameLayout {
    public final /* synthetic */ fa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(fa faVar, Context context) {
        super(context);
        this.a = faVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        fa faVar = this.a;
        faVar.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (faVar.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}

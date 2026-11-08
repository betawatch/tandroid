package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class y9 extends FrameLayout {
    public final /* synthetic */ aa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(aa aaVar, Context context) {
        super(context);
        this.a = aaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        aa aaVar = this.a;
        aaVar.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (aaVar.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}

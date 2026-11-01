package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b50 extends g50 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ d50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(d50 d50Var, Context context) {
        super(context);
        this.c = d50Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d50 d50Var = this.c;
        FrameLayout frameLayout = d50Var.x;
        kl0 kl0Var = d50Var.w;
        nh.f fVar = d50Var.y;
        super.dispatchDraw(canvas);
        if (this.a == null) {
            return;
        }
        float f7 = this.b;
        if (f7 < 1.0f) {
            this.b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(fVar.getLeft() + frameLayout.getLeft() + kl0Var.getLeft(), fVar.getTop() + frameLayout.getTop() + kl0Var.getTop());
        if (this.a.M0 != fVar.getWidth()) {
            float width = fVar.getWidth() / this.a.M0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.a;
        canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.h(canvas, null);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.g50
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

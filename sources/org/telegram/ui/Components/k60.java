package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class k60 extends p60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ m60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(m60 m60Var, Context context) {
        super(context);
        this.c = m60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m60 m60Var = this.c;
        FrameLayout frameLayout = m60Var.x;
        ym0 ym0Var = m60Var.w;
        j60 j60Var = m60Var.y;
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
        canvas.translate(j60Var.getLeft() + frameLayout.getLeft() + ym0Var.getLeft(), j60Var.getTop() + frameLayout.getTop() + ym0Var.getTop());
        if (this.a.getImageWidth() != j60Var.getWidth()) {
            float width = j60Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.p60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

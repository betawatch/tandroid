package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class p50 extends FrameLayout {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ w50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(w50 w50Var, Context context) {
        super(context);
        this.c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.b = f10;
            if (f10 > 1.0f) {
                this.b = 1.0f;
            }
            invalidate();
        }
        if (this.a != null) {
            canvas.save();
            float imageWidth = this.a.getImageWidth();
            int i10 = this.c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.a.getImageX(), -this.a.getImageY());
            float alpha = this.a.getAlpha();
            this.a.setAlpha(this.b);
            this.a.draw(canvas);
            this.a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

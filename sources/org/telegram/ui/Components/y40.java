package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class y40 extends FrameLayout {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ f50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(f50 f50Var, Context context) {
        super(context);
        this.c = f50Var;
        f50Var.setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.b = f11;
            if (f11 > 1.0f) {
                this.b = 1.0f;
            }
            invalidate();
        }
        if (this.a != null) {
            canvas.save();
            float imageWidth = this.a.getImageWidth();
            int i9 = this.c.J0;
            if (imageWidth != i9) {
                float imageWidth2 = i9 / this.a.getImageWidth();
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

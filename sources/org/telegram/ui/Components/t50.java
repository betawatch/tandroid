package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class t50 extends FrameLayout {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ z50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(z50 z50Var, Context context) {
        super(context);
        this.c = z50Var;
        z50Var.setWillNotDraw(false);
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
            int i10 = this.c.K0;
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

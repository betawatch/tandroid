package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class m50 extends FrameLayout {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ s50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(s50 s50Var, Context context) {
        super(context);
        this.c = s50Var;
        s50Var.setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f9 = this.b;
        if (f9 != 1.0f) {
            float f10 = f9 + 0.064f;
            this.b = f10;
            if (f10 > 1.0f) {
                this.b = 1.0f;
            }
            invalidate();
        }
        if (this.a != null) {
            canvas.save();
            float imageWidth = this.a.getImageWidth();
            int i10 = this.c.J0;
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

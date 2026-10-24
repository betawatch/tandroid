package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class z50 extends p60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ n60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(n60 n60Var, Context context) {
        super(context);
        this.c = n60Var;
        n60Var.setWillNotDraw(false);
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
            int i10 = this.c.X0;
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

    @Override // org.telegram.ui.Components.p60
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

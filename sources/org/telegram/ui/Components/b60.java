package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class b60 extends g60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ d60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(d60 d60Var, Context context) {
        super(context);
        this.c = d60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.c;
        FrameLayout frameLayout = d60Var.x;
        km0 km0Var = d60Var.w;
        a60 a60Var = d60Var.y;
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
        canvas.translate(a60Var.getLeft() + frameLayout.getLeft() + km0Var.getLeft(), a60Var.getTop() + frameLayout.getTop() + km0Var.getTop());
        if (this.a.getImageWidth() != a60Var.getWidth()) {
            float width = a60Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.g60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

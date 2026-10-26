package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l60 extends q60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ n60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(n60 n60Var, Context context) {
        super(context);
        this.c = n60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n60 n60Var = this.c;
        FrameLayout frameLayout = n60Var.x;
        dn0 dn0Var = n60Var.w;
        k60 k60Var = n60Var.y;
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
        canvas.translate(k60Var.getLeft() + frameLayout.getLeft() + dn0Var.getLeft(), k60Var.getTop() + frameLayout.getTop() + dn0Var.getTop());
        if (this.a.getImageWidth() != k60Var.getWidth()) {
            float width = k60Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.q60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

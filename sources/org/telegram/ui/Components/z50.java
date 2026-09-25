package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class z50 extends e60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ b60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(b60 b60Var, Context context) {
        super(context);
        this.c = b60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b60 b60Var = this.c;
        FrameLayout frameLayout = b60Var.x;
        im0 im0Var = b60Var.w;
        y50 y50Var = b60Var.y;
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
        canvas.translate(y50Var.getLeft() + frameLayout.getLeft() + im0Var.getLeft(), y50Var.getTop() + frameLayout.getTop() + im0Var.getTop());
        if (this.a.getImageWidth() != y50Var.getWidth()) {
            float width = y50Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.e60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

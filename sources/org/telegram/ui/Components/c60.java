package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class c60 extends h60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ e60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(e60 e60Var, Context context) {
        super(context);
        this.c = e60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.c;
        FrameLayout frameLayout = e60Var.x;
        om0 om0Var = e60Var.w;
        b60 b60Var = e60Var.y;
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
        canvas.translate(b60Var.getLeft() + frameLayout.getLeft() + om0Var.getLeft(), b60Var.getTop() + frameLayout.getTop() + om0Var.getTop());
        if (this.a.getImageWidth() != b60Var.getWidth()) {
            float width = b60Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.h60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

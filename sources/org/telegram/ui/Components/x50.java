package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x50 extends c60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ z50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(z50 z50Var, Context context) {
        super(context);
        this.c = z50Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
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
        z50 z50Var = this.c;
        canvas.translate(z50Var.w.getLeft() + z50Var.v.getLeft() + z50Var.s.getLeft(), z50Var.w.getTop() + z50Var.v.getTop() + z50Var.s.getTop());
        if (this.a.getImageWidth() != z50Var.w.getWidth()) {
            float width = z50Var.w.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.c60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

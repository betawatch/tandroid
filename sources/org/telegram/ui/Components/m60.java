package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m60 extends r60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ o60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(o60 o60Var, Context context) {
        super(context);
        this.c = o60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o60 o60Var = this.c;
        FrameLayout frameLayout = o60Var.x;
        ym0 ym0Var = o60Var.w;
        l60 l60Var = o60Var.y;
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
        canvas.translate(l60Var.getLeft() + frameLayout.getLeft() + ym0Var.getLeft(), l60Var.getTop() + frameLayout.getTop() + ym0Var.getTop());
        if (this.a.getImageWidth() != l60Var.getWidth()) {
            float width = l60Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.r60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q60 extends v60 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ s60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(s60 s60Var, Context context) {
        super(context);
        this.c = s60Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s60 s60Var = this.c;
        FrameLayout frameLayout = s60Var.x;
        cn0 cn0Var = s60Var.w;
        p60 p60Var = s60Var.y;
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
        canvas.translate(p60Var.getLeft() + frameLayout.getLeft() + cn0Var.getLeft(), p60Var.getTop() + frameLayout.getTop() + cn0Var.getTop());
        if (this.a.getImageWidth() != p60Var.getWidth()) {
            float width = p60Var.getWidth() / this.a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.a.getImageX(), -this.a.getImageY());
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.draw(canvas);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.v60
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

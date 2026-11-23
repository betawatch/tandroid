package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z40 extends e50 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ b50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(b50 b50Var, Context context) {
        super(context);
        this.c = b50Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b50 b50Var = this.c;
        FrameLayout frameLayout = b50Var.x;
        uk0 uk0Var = b50Var.w;
        y40 y40Var = b50Var.y;
        super.dispatchDraw(canvas);
        if (this.a == null) {
            return;
        }
        float f10 = this.b;
        if (f10 < 1.0f) {
            this.b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(y40Var.getLeft() + frameLayout.getLeft() + uk0Var.getLeft(), y40Var.getTop() + frameLayout.getTop() + uk0Var.getTop());
        if (this.a.N0 != y40Var.getWidth()) {
            float width = y40Var.getWidth() / this.a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.h(canvas, null);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.e50
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

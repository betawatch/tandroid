package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o40 extends t40 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ q40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(q40 q40Var, Context context) {
        super(context);
        this.c = q40Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q40 q40Var = this.c;
        FrameLayout frameLayout = q40Var.x;
        kk0 kk0Var = q40Var.w;
        n40 n40Var = q40Var.y;
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
        canvas.translate(n40Var.getLeft() + frameLayout.getLeft() + kk0Var.getLeft(), n40Var.getTop() + frameLayout.getTop() + kk0Var.getTop());
        if (this.a.N0 != n40Var.getWidth()) {
            float width = n40Var.getWidth() / this.a.N0;
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

    @Override // org.telegram.ui.Components.t40
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

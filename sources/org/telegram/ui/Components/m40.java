package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m40 extends r40 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ o40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(o40 o40Var, Context context) {
        super(context);
        this.c = o40Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o40 o40Var = this.c;
        FrameLayout frameLayout = o40Var.x;
        gk0 gk0Var = o40Var.w;
        l40 l40Var = o40Var.y;
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
        canvas.translate(l40Var.getLeft() + frameLayout.getLeft() + gk0Var.getLeft(), l40Var.getTop() + frameLayout.getTop() + gk0Var.getTop());
        if (this.a.M0 != l40Var.getWidth()) {
            float width = l40Var.getWidth() / this.a.M0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.a;
        canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.h(canvas, null);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.r40
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

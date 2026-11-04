package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h40 extends m40 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ j40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(j40 j40Var, Context context) {
        super(context);
        this.c = j40Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j40 j40Var = this.c;
        FrameLayout frameLayout = j40Var.x;
        jk0 jk0Var = j40Var.w;
        g40 g40Var = j40Var.y;
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
        canvas.translate(g40Var.getLeft() + frameLayout.getLeft() + jk0Var.getLeft(), g40Var.getTop() + frameLayout.getTop() + jk0Var.getTop());
        if (this.a.N0 != g40Var.getWidth()) {
            float width = g40Var.getWidth() / this.a.N0;
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

    @Override // org.telegram.ui.Components.m40
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

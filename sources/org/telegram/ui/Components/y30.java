package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class y30 extends m40 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ k40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(k40 k40Var, Context context) {
        super(context);
        this.c = k40Var;
        k40Var.setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.b = f11;
            if (f11 > 1.0f) {
                this.b = 1.0f;
            }
            invalidate();
        }
        if (this.a != null) {
            canvas.save();
            float f12 = this.a.N0;
            int i3 = this.c.X0;
            if (f12 != i3) {
                float f13 = i3 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.a;
            canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
            float alpha = this.a.getAlpha();
            this.a.setAlpha(this.b);
            this.a.h(canvas, null);
            this.a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.m40
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

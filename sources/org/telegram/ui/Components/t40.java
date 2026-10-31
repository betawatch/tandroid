package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class t40 extends g50 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ e50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(e50 e50Var, Context context) {
        super(context);
        this.c = e50Var;
        e50Var.setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.b = f10;
            if (f10 > 1.0f) {
                this.b = 1.0f;
            }
            invalidate();
        }
        if (this.a != null) {
            canvas.save();
            float f11 = this.a.M0;
            int i10 = this.c.W0;
            if (f11 != i10) {
                float f12 = i10 / f11;
                canvas.scale(f12, f12);
            }
            ImageReceiver imageReceiver = this.a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.a.getAlpha();
            this.a.setAlpha(this.b);
            this.a.h(canvas, null);
            this.a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.g50
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

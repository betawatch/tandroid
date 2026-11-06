package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l40 extends q40 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ n40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(n40 n40Var, Context context) {
        super(context);
        this.c = n40Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n40 n40Var = this.c;
        FrameLayout frameLayout = n40Var.x;
        fk0 fk0Var = n40Var.w;
        k40 k40Var = n40Var.y;
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
        canvas.translate(k40Var.getLeft() + frameLayout.getLeft() + fk0Var.getLeft(), k40Var.getTop() + frameLayout.getTop() + fk0Var.getTop());
        if (this.a.M0 != k40Var.getWidth()) {
            float width = k40Var.getWidth() / this.a.M0;
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

    @Override // org.telegram.ui.Components.q40
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

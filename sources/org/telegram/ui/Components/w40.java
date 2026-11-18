package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w40 extends b50 {
    public ImageReceiver a;
    public float b;
    public final /* synthetic */ y40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(y40 y40Var, Context context) {
        super(context);
        this.c = y40Var;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y40 y40Var = this.c;
        FrameLayout frameLayout = y40Var.x;
        sk0 sk0Var = y40Var.w;
        v40 v40Var = y40Var.y;
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
        canvas.translate(v40Var.getLeft() + frameLayout.getLeft() + sk0Var.getLeft(), v40Var.getTop() + frameLayout.getTop() + sk0Var.getTop());
        if (this.a.N0 != v40Var.getWidth()) {
            float width = v40Var.getWidth() / this.a.N0;
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

    @Override // org.telegram.ui.Components.b50
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}

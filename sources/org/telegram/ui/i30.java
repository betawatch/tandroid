package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i30 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ b50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = b50Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b50 b50Var = this.e;
        j30 j30Var = b50Var.w1;
        float y3 = j30Var.getY() + j30Var.getMeasuredHeight();
        fe.f fVar = b50Var.s5;
        float f7 = y3 - fVar.f;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f7, measuredWidth, measuredHeight);
        float y10 = j30Var.getY() + j30Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y10, measuredWidth2, measuredHeight2);
        float y11 = (j30Var.getY() + j30Var.getMeasuredHeight()) - fVar.f;
        float measuredWidth3 = getMeasuredWidth();
        float y12 = j30Var.getY() + j30Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y11, measuredWidth3, y12);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || b50Var.H4 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.b.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = b50Var.I4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(b50Var.H4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}

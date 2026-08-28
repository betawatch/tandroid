package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q30 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ o50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = o50Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o50 o50Var = this.e;
        r30 r30Var = o50Var.B;
        float y10 = r30Var.getY() + r30Var.getMeasuredHeight();
        td.c cVar = o50Var.x3;
        float f10 = y10 - cVar.e;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f10, measuredWidth, measuredHeight);
        float y11 = r30Var.getY() + r30Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y11, measuredWidth2, measuredHeight2);
        float y12 = (r30Var.getY() + r30Var.getMeasuredHeight()) - cVar.e;
        float measuredWidth3 = getMeasuredWidth();
        float y13 = r30Var.getY() + r30Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y12, measuredWidth3, y13);
        int i9 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i9 < 29 || o50Var.M2 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.h(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f11 = o50Var.N2;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(o50Var.M2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}

package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h40 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ e60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = e60Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.e;
        i40 i40Var = e60Var.C;
        float y10 = i40Var.getY() + i40Var.getMeasuredHeight();
        xd.c cVar = e60Var.y3;
        float f10 = y10 - cVar.e;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, f10, measuredWidth, measuredHeight);
        float y11 = i40Var.getY() + i40Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.b;
        rectF2.set(0.0f, y11, measuredWidth2, measuredHeight2);
        float y12 = (i40Var.getY() + i40Var.getMeasuredHeight()) - cVar.e;
        float measuredWidth3 = getMeasuredWidth();
        float y13 = i40Var.getY() + i40Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, y12, measuredWidth3, y13);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || e60Var.N2 == null || !canvas.isHardwareAccelerated()) {
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
            float f11 = e60Var.O2;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(e60Var.N2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}

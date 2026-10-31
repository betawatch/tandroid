package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class u8 extends View {
    public final t8 a;
    public kg.k1 b;
    public qz0 c;
    public Paint d;

    public u8(Context context, boolean z10) {
        super(context);
        this.a = new t8(this, z10);
    }

    public final void a(boolean z10) {
        this.a.a(z10, true);
    }

    public final void b(int i10, int i11, TLObject tLObject) {
        this.a.j(i10, i11, tLObject);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
        if (this.c != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getWidth() - org.telegram.messenger.i0.L(22.0f), getHeight() - org.telegram.messenger.i0.L(22.0f), getWidth() - org.telegram.messenger.i0.L(0.0f), getHeight() - org.telegram.messenger.i0.L(0.0f));
            this.b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.i0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.b.f);
            this.c.c(rectF.centerX() - (this.c.c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        t8 t8Var = this.a;
        t8Var.p = measuredWidth;
        t8Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.a.h(i10);
    }

    public void setCentered(boolean z10) {
        this.a.l = z10;
    }

    public void setCount(int i10) {
        this.a.i(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i10) {
        this.a.s = i10;
    }

    public void setStepFactor(float f7) {
        this.a.t = f7;
    }

    public void setStyle(int i10) {
        t8 t8Var = this.a;
        t8Var.k = i10;
        t8Var.d();
    }
}

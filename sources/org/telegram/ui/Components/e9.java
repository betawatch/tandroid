package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class e9 extends View {
    public final d9 a;
    public ug.a1 b;
    public xy0 c;
    public Paint d;

    public e9(Context context, boolean z10) {
        super(context);
        this.a = new d9(this, z10);
    }

    public final void a(boolean z10) {
        this.a.a(z10, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.a.j(i7, i10, tLObject);
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
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.b.f);
            this.c.c(rectF.centerX() - (this.c.c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        d9 d9Var = this.a;
        d9Var.p = measuredWidth;
        d9Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.a.h(i7);
    }

    public void setCentered(boolean z10) {
        this.a.l = z10;
    }

    public void setCount(int i7) {
        this.a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i7) {
        this.a.s = i7;
    }

    public void setStepFactor(float f10) {
        this.a.t = f10;
    }

    public void setStyle(int i7) {
        d9 d9Var = this.a;
        d9Var.k = i7;
        d9Var.d();
    }
}

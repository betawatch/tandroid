package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class c9 extends View {
    public final b9 a;
    public zf.z0 b;
    public nz0 c;
    public Paint d;

    public c9(Context context, boolean z10) {
        super(context);
        this.a = new b9(this, z10);
    }

    public final void a(boolean z10) {
        this.a.b(z10, true);
    }

    public final void b(int i9, TLObject tLObject, int i10) {
        this.a.l(i9, tLObject, i10);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.i(canvas);
        if (this.c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.b.f);
            this.c.c(rectF.centerX() - (this.c.c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredWidth = getMeasuredWidth();
        b9 b9Var = this.a;
        b9Var.p = measuredWidth;
        b9Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i9) {
        this.a.j(i9);
    }

    public void setCentered(boolean z10) {
        this.a.l = z10;
    }

    public void setCount(int i9) {
        this.a.k(i9);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i9) {
        this.a.s = i9;
    }

    public void setStepFactor(float f10) {
        this.a.t = f10;
    }

    public void setStyle(int i9) {
        b9 b9Var = this.a;
        b9Var.k = i9;
        b9Var.f();
    }
}

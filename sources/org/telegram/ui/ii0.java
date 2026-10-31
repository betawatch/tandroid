package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ii0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final Paint a;
    public final Paint b;
    public final org.telegram.ui.Components.t5 c;
    public final org.telegram.ui.Components.e6 d;
    public int e;
    public float f;
    public ValueAnimator h;

    public ii0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.c = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.d = e6Var;
        this.f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        e6Var.setCallback(this);
        e6Var.n(0.35f, 200L, grVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = e6Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.i0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        e6Var.w(org.telegram.messenger.i0.L(13.3f));
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
        e6Var.M = org.telegram.messenger.i0.L(64.0f);
        e6Var.b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.e;
        if (i11 != i10) {
            r1 = i11 < i10;
            this.e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.e;
            }
            this.d.t(str, true, true);
            if (r1) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 16));
                this.h.addListener(new org.telegram.ui.Components.voip.h2(this, 17));
                org.telegram.messenger.z20.j(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return r1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e = this.c.e(false, this.e > 0 ? 1.0f : 0.0f);
        canvas.save();
        float f7 = this.f;
        canvas.scale(f7 * e, f7 * e, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.e6 e6Var = this.d;
        float N = org.telegram.messenger.i0.N(12.66f) + e6Var.c();
        float N2 = org.telegram.messenger.i0.N(20.3f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i10 = (int) (e * 255.0f);
        Paint paint = this.b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), paint);
        Paint paint2 = this.a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.i0.L(1.0f));
        e6Var.setBounds(0, 0, getWidth(), getHeight());
        e6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.a.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
            this.b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

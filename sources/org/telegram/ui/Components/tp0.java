package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tp0 extends View implements org.telegram.ui.ActionBar.k6 {
    public Random a;
    public Paint b;
    public Paint c;
    public Paint d;
    public Paint e;
    public float f;
    public float h;
    public float n;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        Paint paint2 = this.b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.messenger.zs.e4, 31);
        float f7 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(3.0f);
        int L = org.telegram.messenger.i0.L(1.0f) + ((org.telegram.messenger.i0.L(1.0f) + measuredWidth) * 7);
        gr grVar = gr.g;
        float f10 = this.f;
        float interpolation = grVar.getInterpolation(f10 > 0.4f ? (f10 - 0.4f) / 0.6f : 0.0f);
        float f11 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.m5.B(4.0f, getMeasuredHeight(), L)) * f11);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            int L2 = ((org.telegram.messenger.i0.L(1.0f) + measuredWidth) * i10) + org.telegram.messenger.i0.L(f7);
            RectF rectF = org.telegram.messenger.i0.P;
            float f12 = L2;
            float f13 = L2 + measuredWidth;
            rectF.set(0.0f, f12, measuredWidth, f13);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint2);
            rectF.set(org.telegram.messenger.i0.L(1.0f) + measuredWidth, f12, org.telegram.messenger.m5.C(1.0f, measuredWidth, measuredWidth), f13);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint2);
            i10++;
            f7 = f7;
        }
        float f14 = f7;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - org.telegram.messenger.i0.L(21.0f)) * f11) + org.telegram.messenger.i0.L(f14);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(getMeasuredWidth() - org.telegram.messenger.i0.L(f14), measuredHeight, getMeasuredWidth(), org.telegram.messenger.i0.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = org.telegram.messenger.i0.L(0.5f) + measuredWidth;
        rectF2.set(L3 - org.telegram.messenger.i0.L(8.0f), centerY - org.telegram.messenger.i0.L(f14), L3 + org.telegram.messenger.i0.L(8.0f), centerY + org.telegram.messenger.i0.L(f14));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), paint);
        float f15 = this.f + 0.016f;
        this.f = f15;
        if (f15 > 1.0f) {
            this.h = this.n;
            float abs = Math.abs(this.a.nextInt() % 1001) / 1000.0f;
            this.n = abs;
            if (abs > this.h) {
                this.n = abs + 0.3f;
            } else {
                this.n = abs - 0.3f;
            }
            this.n = Math.max(0.0f, Math.min(1.0f, this.n));
            this.f = 0.0f;
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i10 = org.telegram.ui.ActionBar.t6.dg;
            paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 76));
            this.c.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

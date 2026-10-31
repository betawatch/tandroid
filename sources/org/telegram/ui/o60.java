package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o60 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final float c;
    public float d;
    public final View e;
    public boolean f;
    public float h;
    public int n;

    public o60(float f7, int i10, View view) {
        d5 d5Var = new d5(this, 3);
        this.f = true;
        this.n = org.telegram.messenger.zs.e4;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.d = i10;
        this.c = f7;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), 855638016);
        View view2 = this.e;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(d5Var);
            if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.R();
            }
        }
        View view3 = this.e;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        this.e = view;
        imageReceiver.H0(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(d5Var);
        }
    }

    public final void a(float f7) {
        float L = org.telegram.messenger.i0.L(f7);
        this.d = L;
        this.b.J0((int) L);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f;
        Paint paint2 = this.a;
        if (z10 && this.n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float L = (((i12 + i14) / 2.0f) + 0.0f) - (org.telegram.messenger.i0.L(this.c) / 2.0f);
        if (this.f) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(f10, L, org.telegram.messenger.i0.L(this.c) + f10, org.telegram.messenger.i0.L(this.c) + L);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        float L2 = org.telegram.messenger.i0.L(this.c);
        float L3 = org.telegram.messenger.i0.L(this.c);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f10, L, L2, L3);
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(this.c);
    }
}

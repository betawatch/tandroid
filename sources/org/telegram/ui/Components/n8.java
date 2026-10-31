package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class n8 extends FrameLayout {
    public float D;
    public float E;
    public final /* synthetic */ o8 F;
    public long a;
    public TLRPC.Document b;
    public final ag.d2 c;
    public final u10 d;
    public final u10 e;
    public float f;
    public k8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final t5 s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(o8 o8Var, Context context) {
        super(context);
        this.F = o8Var;
        this.d = new u10();
        this.e = new u10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new t5(this, 200L, gr.g);
        this.x = -1.0f;
        ag.d2 d2Var = new ag.d2(this, context, 6);
        this.c = d2Var;
        d2Var.getImageReceiver().X(1);
        d2Var.getImageReceiver().R0 = true;
        setClipChildren(false);
        addView(d2Var, w7.b6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.s.c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float T1 = org.telegram.messenger.i0.T1(f11, 0.0f, f13);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(k8 k8Var, boolean z10) {
        k8 k8Var2 = this.h;
        if (k8Var2 != null) {
            this.e.d(k8Var2.c, k8Var2.d, k8Var2.e, k8Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = k8Var;
        this.n = z10;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        n8 n8Var;
        Canvas canvas2;
        f5 f5Var;
        this.D = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        o8 o8Var = this.F;
        float measuredWidth = o8Var.U ? getMeasuredWidth() * 0.3f : org.telegram.messenger.i0.L(50.0f);
        float f7 = this.w ? 1.0f : 0.0f;
        t5 t5Var = this.s;
        t5Var.e(false, f7);
        float f10 = this.x;
        if (f10 >= 0.0f) {
            t5Var.e(true, f10);
        }
        float T1 = org.telegram.messenger.i0.T1(measuredWidth, getMeasuredWidth() / 2.0f, t5Var.c);
        this.y = T1;
        this.y = org.telegram.messenger.i0.T1(T1, org.telegram.messenger.i0.L(21.0f), o8Var.N);
        this.D = org.telegram.messenger.i0.T1(this.D, (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(21.0f), o8Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((o8Var.d - o8Var.c) / 2.0f) * o8Var.E) + getMeasuredHeight());
        k8 k8Var = this.h;
        if (k8Var != null) {
            int i10 = k8Var.c;
            int i11 = k8Var.d;
            int i12 = k8Var.e;
            int i13 = k8Var.f;
            u10 u10Var = this.d;
            u10Var.d(i10, i11, i12, i13);
            Paint paint = u10Var.c;
            float f11 = this.D;
            float f12 = this.y;
            float f13 = this.E;
            u10Var.b(f11 - f12, f13 - f12, f11 + f12, f13 + f12);
            if (this.f == 1.0f) {
                n8Var = this;
                paint.setAlpha(org.telegram.messenger.zs.e4);
                canvas2 = canvas;
                n8Var.a(canvas2, n8Var.D, n8Var.E, measuredWidth, n8Var.y, paint);
                float T12 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.W1(t5Var.c, !o8Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.i0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.i0.L(42.0f) * 0.7f), o8Var.N) / 2.0f;
                ag.d2 d2Var = n8Var.c;
                f5Var = d2Var.e;
                if (f5Var != null) {
                    ImageReceiver imageReceiver = d2Var.a;
                    float f14 = n8Var.D - T12;
                    float f15 = n8Var.E - T12;
                    float f16 = T12 * 2.0f;
                    imageReceiver.y0(f14, f15, f16, f16);
                    d2Var.a.J0((int) (f16 * 0.13f));
                    d2Var.a.h(canvas2, null);
                    return;
                }
                ag.c2 c2Var = f5Var.k;
                if (c2Var != null) {
                    c2Var.J0((int) (2.0f * T12 * 0.13f));
                }
                f5 f5Var2 = d2Var.e;
                float f17 = n8Var.D;
                float f18 = n8Var.E;
                f5Var2.setBounds((int) (f17 - T12), (int) (f18 - T12), (int) (f17 + T12), (int) (f18 + T12));
                d2Var.e.setColorFilter(n8Var.r);
                d2Var.e.draw(canvas2);
                return;
            }
            float f19 = this.D;
            float f20 = this.y;
            float f21 = f19 - f20;
            float f22 = this.E;
            float f23 = f22 - f20;
            float f24 = f19 + f20;
            float f25 = f22 + f20;
            u10 u10Var2 = this.e;
            u10Var2.b(f21, f23, f24, f25);
            Paint paint2 = u10Var2.c;
            paint2.setAlpha(org.telegram.messenger.zs.e4);
            n8Var = this;
            n8Var.a(canvas, this.D, this.E, measuredWidth, this.y, paint2);
            paint.setAlpha((int) (n8Var.f * 255.0f));
            n8Var.a(canvas, n8Var.D, n8Var.E, measuredWidth, n8Var.y, paint);
            canvas = canvas;
            float f26 = n8Var.f + 0.064f;
            n8Var.f = f26;
            if (f26 > 1.0f) {
                n8Var.f = 1.0f;
            }
            invalidate();
        } else {
            n8Var = this;
        }
        canvas2 = canvas;
        if (!o8Var.U) {
        }
        float T122 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.W1(t5Var.c, !o8Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.i0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.i0.L(42.0f) * 0.7f), o8Var.N) / 2.0f;
        ag.d2 d2Var2 = n8Var.c;
        f5Var = d2Var2.e;
        if (f5Var != null) {
        }
    }

    public long getDuration() {
        ag.d2 d2Var = this.c;
        ImageReceiver imageReceiver = d2Var.getImageReceiver();
        f5 f5Var = d2Var.e;
        if (f5Var != null) {
            imageReceiver = f5Var.k;
        }
        if (imageReceiver == null || imageReceiver.B() == null) {
            return 5000L;
        }
        return imageReceiver.B().r();
    }

    public ImageReceiver getImageReceiver() {
        ag.d2 d2Var = this.c;
        ImageReceiver imageReceiver = d2Var.getImageReceiver();
        f5 f5Var = d2Var.e;
        if (f5Var == null) {
            return imageReceiver;
        }
        ag.c2 c2Var = f5Var.k;
        f5Var.setColorFilter(this.r);
        return c2Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.F.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.F.U) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z10) {
        ag.c2 c2Var;
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        if (z10) {
            ag.d2 d2Var = this.c;
            f5 f5Var = d2Var.e;
            if (f5Var != null && (c2Var = f5Var.k) != null) {
                c2Var.P0(false);
            }
            d2Var.a.P0(false);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
        invalidate();
    }
}

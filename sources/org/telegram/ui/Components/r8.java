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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class r8 extends FrameLayout {
    public float D;
    public float E;
    public final /* synthetic */ s8 F;
    public long a;
    public TLRPC.Document b;
    public final di.d4 c;
    public final e10 d;
    public final e10 e;
    public float f;
    public o8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final v5 s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(s8 s8Var, Context context) {
        super(context);
        this.F = s8Var;
        this.d = new e10();
        this.e = new e10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new v5(this, 200L, wq.g);
        this.x = -1.0f;
        di.d4 d4Var = new di.d4(7, context, this);
        this.c = d4Var;
        d4Var.getImageReceiver().X(1);
        d4Var.getImageReceiver().R0 = true;
        setClipChildren(false);
        addView(d4Var, c8.ha.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.s.c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(o8 o8Var, boolean z9) {
        o8 o8Var2 = this.h;
        if (o8Var2 != null) {
            this.e.d(o8Var2.c, o8Var2.d, o8Var2.e, o8Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = o8Var;
        this.n = z9;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
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
        r8 r8Var;
        Canvas canvas2;
        h5 h5Var;
        this.D = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        s8 s8Var = this.F;
        float measuredWidth = s8Var.U ? getMeasuredWidth() * 0.3f : org.telegram.messenger.g0.L(50.0f);
        float f10 = this.w ? 1.0f : 0.0f;
        v5 v5Var = this.s;
        v5Var.e(false, f10);
        float f11 = this.x;
        if (f11 >= 0.0f) {
            v5Var.e(true, f11);
        }
        float T1 = org.telegram.messenger.g0.T1(measuredWidth, getMeasuredWidth() / 2.0f, v5Var.c);
        this.y = T1;
        this.y = org.telegram.messenger.g0.T1(T1, org.telegram.messenger.g0.L(21.0f), s8Var.N);
        this.D = org.telegram.messenger.g0.T1(this.D, (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(21.0f), s8Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((s8Var.d - s8Var.c) / 2.0f) * s8Var.E) + getMeasuredHeight());
        o8 o8Var = this.h;
        if (o8Var != null) {
            int i7 = o8Var.c;
            int i10 = o8Var.d;
            int i11 = o8Var.e;
            int i12 = o8Var.f;
            e10 e10Var = this.d;
            e10Var.d(i7, i10, i11, i12);
            Paint paint = e10Var.c;
            float f12 = this.D;
            float f13 = this.y;
            float f14 = this.E;
            e10Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                r8Var = this;
                paint.setAlpha(org.telegram.messenger.qs.e4);
                canvas2 = canvas;
                r8Var.a(canvas2, r8Var.D, r8Var.E, measuredWidth, r8Var.y, paint);
                float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(v5Var.c, !s8Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), s8Var.N) / 2.0f;
                di.d4 d4Var = r8Var.c;
                h5Var = d4Var.e;
                if (h5Var != null) {
                    ImageReceiver imageReceiver = d4Var.a;
                    float f15 = r8Var.D - T12;
                    float f16 = r8Var.E - T12;
                    float f17 = T12 * 2.0f;
                    imageReceiver.y0(f15, f16, f17, f17);
                    d4Var.a.J0((int) (f17 * 0.13f));
                    d4Var.a.h(canvas2, null);
                    return;
                }
                di.z2 z2Var = h5Var.k;
                if (z2Var != null) {
                    z2Var.J0((int) (2.0f * T12 * 0.13f));
                }
                h5 h5Var2 = d4Var.e;
                float f18 = r8Var.D;
                float f19 = r8Var.E;
                h5Var2.setBounds((int) (f18 - T12), (int) (f19 - T12), (int) (f18 + T12), (int) (f19 + T12));
                d4Var.e.setColorFilter(r8Var.r);
                d4Var.e.draw(canvas2);
                return;
            }
            float f20 = this.D;
            float f21 = this.y;
            float f22 = f20 - f21;
            float f23 = this.E;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            e10 e10Var2 = this.e;
            e10Var2.b(f22, f24, f25, f26);
            Paint paint2 = e10Var2.c;
            paint2.setAlpha(org.telegram.messenger.qs.e4);
            r8Var = this;
            r8Var.a(canvas, this.D, this.E, measuredWidth, this.y, paint2);
            paint.setAlpha((int) (r8Var.f * 255.0f));
            r8Var.a(canvas, r8Var.D, r8Var.E, measuredWidth, r8Var.y, paint);
            canvas = canvas;
            float f27 = r8Var.f + 0.064f;
            r8Var.f = f27;
            if (f27 > 1.0f) {
                r8Var.f = 1.0f;
            }
            invalidate();
        } else {
            r8Var = this;
        }
        canvas2 = canvas;
        if (!s8Var.U) {
        }
        float T122 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(v5Var.c, !s8Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), s8Var.N) / 2.0f;
        di.d4 d4Var2 = r8Var.c;
        h5Var = d4Var2.e;
        if (h5Var != null) {
        }
    }

    public long getDuration() {
        di.d4 d4Var = this.c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        h5 h5Var = d4Var.e;
        if (h5Var != null) {
            imageReceiver = h5Var.k;
        }
        if (imageReceiver == null || imageReceiver.B() == null) {
            return 5000L;
        }
        return imageReceiver.B().r();
    }

    public ImageReceiver getImageReceiver() {
        di.d4 d4Var = this.c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        h5 h5Var = d4Var.e;
        if (h5Var == null) {
            return imageReceiver;
        }
        di.z2 z2Var = h5Var.k;
        h5Var.setColorFilter(this.r);
        return z2Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.F.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.F.U) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z9) {
        di.z2 z2Var;
        if (this.w == z9) {
            return;
        }
        this.w = z9;
        if (z9) {
            di.d4 d4Var = this.c;
            h5 h5Var = d4Var.e;
            if (h5Var != null && (z2Var = h5Var.k) != null) {
                z2Var.P0(false);
            }
            d4Var.a.P0(false);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        invalidate();
    }
}

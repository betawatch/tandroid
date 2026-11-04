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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class q8 extends FrameLayout {
    public float E;
    public float F;
    public final /* synthetic */ r8 G;
    public long a;
    public TLRPC.Document b;
    public final ei.d4 c;
    public final b10 d;
    public final b10 e;
    public float f;
    public n8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final u5 s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(r8 r8Var, Context context) {
        super(context);
        this.G = r8Var;
        this.d = new b10();
        this.e = new b10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new u5(this, 200L, xq.g);
        this.x = -1.0f;
        ei.d4 d4Var = new ei.d4(7, context, this);
        this.c = d4Var;
        d4Var.getImageReceiver().X(1);
        d4Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(d4Var, b8.mf.e(70, 70, 17));
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

    public final void b(n8 n8Var, boolean z10) {
        n8 n8Var2 = this.h;
        if (n8Var2 != null) {
            this.e.d(n8Var2.c, n8Var2.d, n8Var2.e, n8Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = n8Var;
        this.n = z10;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
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
        q8 q8Var;
        Canvas canvas2;
        g5 g5Var;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        r8 r8Var = this.G;
        float measuredWidth = r8Var.V ? getMeasuredWidth() * 0.3f : org.telegram.messenger.g0.L(50.0f);
        float f10 = this.w ? 1.0f : 0.0f;
        u5 u5Var = this.s;
        u5Var.e(false, f10);
        float f11 = this.x;
        if (f11 >= 0.0f) {
            u5Var.e(true, f11);
        }
        float T1 = org.telegram.messenger.g0.T1(measuredWidth, getMeasuredWidth() / 2.0f, u5Var.c);
        this.y = T1;
        this.y = org.telegram.messenger.g0.T1(T1, org.telegram.messenger.g0.L(21.0f), r8Var.O);
        this.E = org.telegram.messenger.g0.T1(this.E, (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(21.0f), r8Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((r8Var.d - r8Var.c) / 2.0f) * r8Var.F) + getMeasuredHeight());
        n8 n8Var = this.h;
        if (n8Var != null) {
            int i3 = n8Var.c;
            int i10 = n8Var.d;
            int i11 = n8Var.e;
            int i12 = n8Var.f;
            b10 b10Var = this.d;
            b10Var.d(i3, i10, i11, i12);
            Paint paint = b10Var.c;
            float f12 = this.E;
            float f13 = this.y;
            float f14 = this.F;
            b10Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                q8Var = this;
                paint.setAlpha(org.telegram.messenger.hs.e4);
                canvas2 = canvas;
                q8Var.a(canvas2, q8Var.E, q8Var.F, measuredWidth, q8Var.y, paint);
                float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(u5Var.c, !r8Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), r8Var.O) / 2.0f;
                ei.d4 d4Var = q8Var.c;
                g5Var = d4Var.e;
                if (g5Var != null) {
                    ImageReceiver imageReceiver = d4Var.a;
                    float f15 = q8Var.E - T12;
                    float f16 = q8Var.F - T12;
                    float f17 = T12 * 2.0f;
                    imageReceiver.y0(f15, f16, f17, f17);
                    d4Var.a.J0((int) (f17 * 0.13f));
                    d4Var.a.h(canvas2, null);
                    return;
                }
                ei.c3 c3Var = g5Var.k;
                if (c3Var != null) {
                    c3Var.J0((int) (2.0f * T12 * 0.13f));
                }
                g5 g5Var2 = d4Var.e;
                float f18 = q8Var.E;
                float f19 = q8Var.F;
                g5Var2.setBounds((int) (f18 - T12), (int) (f19 - T12), (int) (f18 + T12), (int) (f19 + T12));
                d4Var.e.setColorFilter(q8Var.r);
                d4Var.e.draw(canvas2);
                return;
            }
            float f20 = this.E;
            float f21 = this.y;
            float f22 = f20 - f21;
            float f23 = this.F;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            b10 b10Var2 = this.e;
            b10Var2.b(f22, f24, f25, f26);
            Paint paint2 = b10Var2.c;
            paint2.setAlpha(org.telegram.messenger.hs.e4);
            q8Var = this;
            q8Var.a(canvas, this.E, this.F, measuredWidth, this.y, paint2);
            paint.setAlpha((int) (q8Var.f * 255.0f));
            q8Var.a(canvas, q8Var.E, q8Var.F, measuredWidth, q8Var.y, paint);
            canvas = canvas;
            float f27 = q8Var.f + 0.064f;
            q8Var.f = f27;
            if (f27 > 1.0f) {
                q8Var.f = 1.0f;
            }
            invalidate();
        } else {
            q8Var = this;
        }
        canvas2 = canvas;
        if (!r8Var.V) {
        }
        float T122 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(u5Var.c, !r8Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), r8Var.O) / 2.0f;
        ei.d4 d4Var2 = q8Var.c;
        g5Var = d4Var2.e;
        if (g5Var != null) {
        }
    }

    public long getDuration() {
        ei.d4 d4Var = this.c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        g5 g5Var = d4Var.e;
        if (g5Var != null) {
            imageReceiver = g5Var.k;
        }
        if (imageReceiver == null || imageReceiver.B() == null) {
            return 5000L;
        }
        return imageReceiver.B().r();
    }

    public ImageReceiver getImageReceiver() {
        ei.d4 d4Var = this.c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        g5 g5Var = d4Var.e;
        if (g5Var == null) {
            return imageReceiver;
        }
        ei.c3 c3Var = g5Var.k;
        g5Var.setColorFilter(this.r);
        return c3Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.G.V) {
            super.onMeasure(i3, i10);
        } else {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z10) {
        ei.c3 c3Var;
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        if (z10) {
            ei.d4 d4Var = this.c;
            g5 g5Var = d4Var.e;
            if (g5Var != null && (c3Var = g5Var.k) != null) {
                c3Var.P0(false);
            }
            d4Var.a.P0(false);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
        invalidate();
    }
}

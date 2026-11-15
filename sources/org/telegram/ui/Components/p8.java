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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class p8 extends FrameLayout {
    public float E;
    public float F;
    public final /* synthetic */ q8 G;
    public long a;
    public TLRPC.Document b;
    public final fi.v3 c;
    public final i10 d;
    public final i10 e;
    public float f;
    public m8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final u5 s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(q8 q8Var, Context context) {
        super(context);
        this.G = q8Var;
        this.d = new i10();
        this.e = new i10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new u5(this, 200L, er.g);
        this.x = -1.0f;
        fi.v3 v3Var = new fi.v3(7, context, this);
        this.c = v3Var;
        v3Var.getImageReceiver().X(1);
        v3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(v3Var, c8.ja.e(70, 70, 17));
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

    public final void b(m8 m8Var, boolean z10) {
        m8 m8Var2 = this.h;
        if (m8Var2 != null) {
            this.e.d(m8Var2.c, m8Var2.d, m8Var2.e, m8Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = m8Var;
        this.n = z10;
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, new Object[0]);
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
        p8 p8Var;
        Canvas canvas2;
        g5 g5Var;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        q8 q8Var = this.G;
        float measuredWidth = q8Var.V ? getMeasuredWidth() * 0.3f : org.telegram.messenger.g0.L(50.0f);
        float f10 = this.w ? 1.0f : 0.0f;
        u5 u5Var = this.s;
        u5Var.e(false, f10);
        float f11 = this.x;
        if (f11 >= 0.0f) {
            u5Var.e(true, f11);
        }
        float T1 = org.telegram.messenger.g0.T1(measuredWidth, getMeasuredWidth() / 2.0f, u5Var.c);
        this.y = T1;
        this.y = org.telegram.messenger.g0.T1(T1, org.telegram.messenger.g0.L(21.0f), q8Var.O);
        this.E = org.telegram.messenger.g0.T1(this.E, (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(21.0f), q8Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((q8Var.d - q8Var.c) / 2.0f) * q8Var.F) + getMeasuredHeight());
        m8 m8Var = this.h;
        if (m8Var != null) {
            int i7 = m8Var.c;
            int i10 = m8Var.d;
            int i11 = m8Var.e;
            int i12 = m8Var.f;
            i10 i10Var = this.d;
            i10Var.d(i7, i10, i11, i12);
            Paint paint = i10Var.c;
            float f12 = this.E;
            float f13 = this.y;
            float f14 = this.F;
            i10Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                p8Var = this;
                paint.setAlpha(org.telegram.messenger.ns.e4);
                canvas2 = canvas;
                p8Var.a(canvas2, p8Var.E, p8Var.F, measuredWidth, p8Var.y, paint);
                float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(u5Var.c, !q8Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), q8Var.O) / 2.0f;
                fi.v3 v3Var = p8Var.c;
                g5Var = v3Var.e;
                if (g5Var != null) {
                    ImageReceiver imageReceiver = v3Var.a;
                    float f15 = p8Var.E - T12;
                    float f16 = p8Var.F - T12;
                    float f17 = T12 * 2.0f;
                    imageReceiver.y0(f15, f16, f17, f17);
                    v3Var.a.J0((int) (f17 * 0.13f));
                    v3Var.a.h(canvas2, null);
                    return;
                }
                fi.u2 u2Var = g5Var.k;
                if (u2Var != null) {
                    u2Var.J0((int) (2.0f * T12 * 0.13f));
                }
                g5 g5Var2 = v3Var.e;
                float f18 = p8Var.E;
                float f19 = p8Var.F;
                g5Var2.setBounds((int) (f18 - T12), (int) (f19 - T12), (int) (f18 + T12), (int) (f19 + T12));
                v3Var.e.setColorFilter(p8Var.r);
                v3Var.e.draw(canvas2);
                return;
            }
            float f20 = this.E;
            float f21 = this.y;
            float f22 = f20 - f21;
            float f23 = this.F;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            i10 i10Var2 = this.e;
            i10Var2.b(f22, f24, f25, f26);
            Paint paint2 = i10Var2.c;
            paint2.setAlpha(org.telegram.messenger.ns.e4);
            p8Var = this;
            p8Var.a(canvas, this.E, this.F, measuredWidth, this.y, paint2);
            paint.setAlpha((int) (p8Var.f * 255.0f));
            p8Var.a(canvas, p8Var.E, p8Var.F, measuredWidth, p8Var.y, paint);
            canvas = canvas;
            float f27 = p8Var.f + 0.064f;
            p8Var.f = f27;
            if (f27 > 1.0f) {
                p8Var.f = 1.0f;
            }
            invalidate();
        } else {
            p8Var = this;
        }
        canvas2 = canvas;
        if (!q8Var.V) {
        }
        float T122 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(u5Var.c, !q8Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), q8Var.O) / 2.0f;
        fi.v3 v3Var2 = p8Var.c;
        g5Var = v3Var2.e;
        if (g5Var != null) {
        }
    }

    public long getDuration() {
        fi.v3 v3Var = this.c;
        ImageReceiver imageReceiver = v3Var.getImageReceiver();
        g5 g5Var = v3Var.e;
        if (g5Var != null) {
            imageReceiver = g5Var.k;
        }
        if (imageReceiver == null || imageReceiver.B() == null) {
            return 5000L;
        }
        return imageReceiver.B().r();
    }

    public ImageReceiver getImageReceiver() {
        fi.v3 v3Var = this.c;
        ImageReceiver imageReceiver = v3Var.getImageReceiver();
        g5 g5Var = v3Var.e;
        if (g5Var == null) {
            return imageReceiver;
        }
        fi.u2 u2Var = g5Var.k;
        g5Var.setColorFilter(this.r);
        return u2Var;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.G.V) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), TLObject.FLAG_30));
        }
    }

    public void setExpanded(boolean z10) {
        fi.u2 u2Var;
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        if (z10) {
            fi.v3 v3Var = this.c;
            g5 g5Var = v3Var.e;
            if (g5Var != null && (u2Var = g5Var.k) != null) {
                u2Var.P0(false);
            }
            v3Var.a.P0(false);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, new Object[0]);
        invalidate();
    }
}

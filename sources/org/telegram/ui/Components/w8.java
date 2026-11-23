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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class w8 extends FrameLayout {
    public float E;
    public float F;
    public final /* synthetic */ x8 G;
    public long a;
    public TLRPC.Document b;
    public final fi.t3 c;
    public final q10 d;
    public final q10 e;
    public float f;
    public t8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final c6 s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(x8 x8Var, Context context) {
        super(context);
        this.G = x8Var;
        this.d = new q10();
        this.e = new q10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new c6(this, 200L, kr.g);
        this.x = -1.0f;
        fi.t3 t3Var = new fi.t3(7, context, this);
        this.c = t3Var;
        t3Var.getImageReceiver().Y(1);
        t3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(t3Var, c8.na.e(70, 70, 17));
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

    public final void b(t8 t8Var, boolean z10) {
        t8 t8Var2 = this.h;
        if (t8Var2 != null) {
            this.e.d(t8Var2.c, t8Var2.d, t8Var2.e, t8Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = t8Var;
        this.n = z10;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
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
        w8 w8Var;
        Canvas canvas2;
        o5 o5Var;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        x8 x8Var = this.G;
        float measuredWidth = x8Var.V ? getMeasuredWidth() * 0.3f : org.telegram.messenger.g0.L(50.0f);
        float f10 = this.w ? 1.0f : 0.0f;
        c6 c6Var = this.s;
        c6Var.e(false, f10);
        float f11 = this.x;
        if (f11 >= 0.0f) {
            c6Var.e(true, f11);
        }
        float T1 = org.telegram.messenger.g0.T1(measuredWidth, getMeasuredWidth() / 2.0f, c6Var.c);
        this.y = T1;
        this.y = org.telegram.messenger.g0.T1(T1, org.telegram.messenger.g0.L(21.0f), x8Var.O);
        this.E = org.telegram.messenger.g0.T1(this.E, (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(21.0f), x8Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((x8Var.d - x8Var.c) / 2.0f) * x8Var.F) + getMeasuredHeight());
        t8 t8Var = this.h;
        if (t8Var != null) {
            int i7 = t8Var.c;
            int i10 = t8Var.d;
            int i11 = t8Var.e;
            int i12 = t8Var.f;
            q10 q10Var = this.d;
            q10Var.d(i7, i10, i11, i12);
            Paint paint = q10Var.c;
            float f12 = this.E;
            float f13 = this.y;
            float f14 = this.F;
            q10Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                w8Var = this;
                paint.setAlpha(org.telegram.messenger.ks.e4);
                canvas2 = canvas;
                w8Var.a(canvas2, w8Var.E, w8Var.F, measuredWidth, w8Var.y, paint);
                float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(c6Var.c, !x8Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), x8Var.O) / 2.0f;
                fi.t3 t3Var = w8Var.c;
                o5Var = t3Var.e;
                if (o5Var != null) {
                    ImageReceiver imageReceiver = t3Var.a;
                    float f15 = w8Var.E - T12;
                    float f16 = w8Var.F - T12;
                    float f17 = T12 * 2.0f;
                    imageReceiver.z0(f15, f16, f17, f17);
                    t3Var.a.K0((int) (f17 * 0.13f));
                    t3Var.a.h(canvas2, null);
                    return;
                }
                fi.s2 s2Var = o5Var.k;
                if (s2Var != null) {
                    s2Var.K0((int) (2.0f * T12 * 0.13f));
                }
                o5 o5Var2 = t3Var.e;
                float f18 = w8Var.E;
                float f19 = w8Var.F;
                o5Var2.setBounds((int) (f18 - T12), (int) (f19 - T12), (int) (f18 + T12), (int) (f19 + T12));
                t3Var.e.setColorFilter(w8Var.r);
                t3Var.e.draw(canvas2);
                return;
            }
            float f20 = this.E;
            float f21 = this.y;
            float f22 = f20 - f21;
            float f23 = this.F;
            float f24 = f23 - f21;
            float f25 = f20 + f21;
            float f26 = f23 + f21;
            q10 q10Var2 = this.e;
            q10Var2.b(f22, f24, f25, f26);
            Paint paint2 = q10Var2.c;
            paint2.setAlpha(org.telegram.messenger.ks.e4);
            w8Var = this;
            w8Var.a(canvas, this.E, this.F, measuredWidth, this.y, paint2);
            paint.setAlpha((int) (w8Var.f * 255.0f));
            w8Var.a(canvas, w8Var.E, w8Var.F, measuredWidth, w8Var.y, paint);
            canvas = canvas;
            float f27 = w8Var.f + 0.064f;
            w8Var.f = f27;
            if (f27 > 1.0f) {
                w8Var.f = 1.0f;
            }
            invalidate();
        } else {
            w8Var = this;
        }
        canvas2 = canvas;
        if (!x8Var.V) {
        }
        float T122 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(c6Var.c, !x8Var.V ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), x8Var.O) / 2.0f;
        fi.t3 t3Var2 = w8Var.c;
        o5Var = t3Var2.e;
        if (o5Var != null) {
        }
    }

    public long getDuration() {
        fi.t3 t3Var = this.c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        o5 o5Var = t3Var.e;
        if (o5Var != null) {
            imageReceiver = o5Var.k;
        }
        if (imageReceiver == null || imageReceiver.C() == null) {
            return 5000L;
        }
        return imageReceiver.C().r();
    }

    public ImageReceiver getImageReceiver() {
        fi.t3 t3Var = this.c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        o5 o5Var = t3Var.e;
        if (o5Var == null) {
            return imageReceiver;
        }
        fi.s2 s2Var = o5Var.k;
        o5Var.setColorFilter(this.r);
        return s2Var;
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
        fi.s2 s2Var;
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        if (z10) {
            fi.t3 t3Var = this.c;
            o5 o5Var = t3Var.e;
            if (o5Var != null && (s2Var = o5Var.k) != null) {
                s2Var.Q0(false);
            }
            t3Var.a.Q0(false);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
        invalidate();
    }
}

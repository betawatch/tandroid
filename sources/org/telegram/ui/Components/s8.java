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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class s8 extends FrameLayout {
    public float D;
    public float E;
    public final /* synthetic */ t8 F;
    public long a;
    public TLRPC.Document b;
    public final di.c4 c;
    public final e10 d;
    public final e10 e;
    public float f;
    public p8 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final w5 s;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(t8 t8Var, Context context) {
        super(context);
        this.F = t8Var;
        this.d = new e10();
        this.e = new e10();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new w5(this, 200L, xq.g);
        this.x = -1.0f;
        di.c4 c4Var = new di.c4(7, context, this);
        this.c = c4Var;
        c4Var.getImageReceiver().X(1);
        c4Var.getImageReceiver().R0 = true;
        setClipChildren(false);
        addView(c4Var, c8.ha.e(70, 70, 17));
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

    public final void b(p8 p8Var, boolean z9) {
        p8 p8Var2 = this.h;
        if (p8Var2 != null) {
            this.e.d(p8Var2.c, p8Var2.d, p8Var2.e, p8Var2.f);
            this.f = 0.0f;
            this.F.n = true;
        }
        this.h = p8Var;
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
        s8 s8Var;
        Canvas canvas2;
        i5 i5Var;
        this.D = getMeasuredWidth() / 2.0f;
        this.E = getMeasuredHeight() / 2.0f;
        t8 t8Var = this.F;
        float measuredWidth = t8Var.U ? getMeasuredWidth() * 0.3f : org.telegram.messenger.g0.L(50.0f);
        float f10 = this.w ? 1.0f : 0.0f;
        w5 w5Var = this.s;
        w5Var.e(false, f10);
        float f11 = this.x;
        if (f11 >= 0.0f) {
            w5Var.e(true, f11);
        }
        float T1 = org.telegram.messenger.g0.T1(measuredWidth, getMeasuredWidth() / 2.0f, w5Var.c);
        this.y = T1;
        this.y = org.telegram.messenger.g0.T1(T1, org.telegram.messenger.g0.L(21.0f), t8Var.N);
        this.D = org.telegram.messenger.g0.T1(this.D, (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(21.0f), t8Var.N);
        canvas.save();
        canvas.clipRect(0.0f, (-r2) / 2.0f, getMeasuredWidth(), (((t8Var.d - t8Var.c) / 2.0f) * t8Var.E) + getMeasuredHeight());
        p8 p8Var = this.h;
        if (p8Var != null) {
            int i7 = p8Var.c;
            int i10 = p8Var.d;
            int i11 = p8Var.e;
            int i12 = p8Var.f;
            e10 e10Var = this.d;
            e10Var.d(i7, i10, i11, i12);
            Paint paint = e10Var.c;
            float f12 = this.D;
            float f13 = this.y;
            float f14 = this.E;
            e10Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f == 1.0f) {
                s8Var = this;
                paint.setAlpha(org.telegram.messenger.qs.e4);
                canvas2 = canvas;
                s8Var.a(canvas2, s8Var.D, s8Var.E, measuredWidth, s8Var.y, paint);
                float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(w5Var.c, !t8Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), t8Var.N) / 2.0f;
                di.c4 c4Var = s8Var.c;
                i5Var = c4Var.e;
                if (i5Var != null) {
                    ImageReceiver imageReceiver = c4Var.a;
                    float f15 = s8Var.D - T12;
                    float f16 = s8Var.E - T12;
                    float f17 = T12 * 2.0f;
                    imageReceiver.y0(f15, f16, f17, f17);
                    c4Var.a.J0((int) (f17 * 0.13f));
                    c4Var.a.h(canvas2, null);
                    return;
                }
                di.z2 z2Var = i5Var.k;
                if (z2Var != null) {
                    z2Var.J0((int) (2.0f * T12 * 0.13f));
                }
                i5 i5Var2 = c4Var.e;
                float f18 = s8Var.D;
                float f19 = s8Var.E;
                i5Var2.setBounds((int) (f18 - T12), (int) (f19 - T12), (int) (f18 + T12), (int) (f19 + T12));
                c4Var.e.setColorFilter(s8Var.r);
                c4Var.e.draw(canvas2);
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
            s8Var = this;
            s8Var.a(canvas, this.D, this.E, measuredWidth, this.y, paint2);
            paint.setAlpha((int) (s8Var.f * 255.0f));
            s8Var.a(canvas, s8Var.D, s8Var.E, measuredWidth, s8Var.y, paint);
            canvas = canvas;
            float f27 = s8Var.f + 0.064f;
            s8Var.f = f27;
            if (f27 > 1.0f) {
                s8Var.f = 1.0f;
            }
            invalidate();
        } else {
            s8Var = this;
        }
        canvas2 = canvas;
        if (!t8Var.U) {
        }
        float T122 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(w5Var.c, !t8Var.U ? (int) ((measuredWidth * 2.0f) * 0.7f) : org.telegram.messenger.g0.L(70.0f), (int) (getMeasuredWidth() * 0.7f)), (int) (org.telegram.messenger.g0.L(42.0f) * 0.7f), t8Var.N) / 2.0f;
        di.c4 c4Var2 = s8Var.c;
        i5Var = c4Var2.e;
        if (i5Var != null) {
        }
    }

    public long getDuration() {
        di.c4 c4Var = this.c;
        ImageReceiver imageReceiver = c4Var.getImageReceiver();
        i5 i5Var = c4Var.e;
        if (i5Var != null) {
            imageReceiver = i5Var.k;
        }
        if (imageReceiver == null || imageReceiver.B() == null) {
            return 5000L;
        }
        return imageReceiver.B().r();
    }

    public ImageReceiver getImageReceiver() {
        di.c4 c4Var = this.c;
        ImageReceiver imageReceiver = c4Var.getImageReceiver();
        i5 i5Var = c4Var.e;
        if (i5Var == null) {
            return imageReceiver;
        }
        di.z2 z2Var = i5Var.k;
        i5Var.setColorFilter(this.r);
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
            di.c4 c4Var = this.c;
            i5 i5Var = c4Var.e;
            if (i5Var != null && (z2Var = i5Var.k) != null) {
                z2Var.P0(false);
            }
            c4Var.a.P0(false);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        invalidate();
    }
}

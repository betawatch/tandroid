package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i1 extends FrameLayout {
    public static final kr I0 = new kr(0.34d, 1.32d, 0.5d, 1.0d);
    public static final float J0 = org.telegram.messenger.g0.L(36.0f);
    public static final float K0 = org.telegram.messenger.g0.L(8.0f);
    public boolean A0;
    public float B0;
    public final c6 C0;
    public final c6 D0;
    public final Paint E;
    public final c6 E0;
    public final Paint F;
    public final c6 F0;
    public final Paint G;
    public bi.b1 G0;
    public final Path H;
    public final c6 H0;
    public fh.g I;
    public fh.g J;
    public fh.g K;
    public fh.g L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final int[] S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final c6 W;
    public final l0 a;
    public final c6 a0;
    public final i6 b;
    public final c6 b0;
    public final View c;
    public final c6 c0;
    public final View d;
    public final c6 d0;
    public final v2 e;
    public final c6 e0;
    public final Drawable f;
    public final c6 f0;
    public int g0;
    public final Drawable h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public boolean n0;
    public final RectF o0;
    public float p0;
    public final Path q0;
    public final Drawable r;
    public boolean r0;
    public final m6 s;
    public final c6 s0;
    public final Paint t0;
    public long u0;
    public final c6 v0;
    public final Paint w;
    public final String w0;
    public final Paint x;
    public final m6 x0;
    public final Paint y;
    public boolean y0;
    public boolean z0;

    public i1(Context context, i6 i6Var, l0 l0Var) {
        super(context);
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.E = new Paint(1);
        new Paint(1);
        this.F = new Paint(1);
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Path path = new Path();
        this.H = path;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new int[2];
        this.W = new c6(this, 0L, 280L, new kr(0.0f, 0.0f, 1.0f, 1.0f));
        kr krVar = kr.h;
        this.a0 = new c6(this, 0L, 240L, krVar);
        kr krVar2 = I0;
        this.b0 = new c6(this, 0L, 460L, krVar2);
        kr krVar3 = kr.g;
        this.c0 = new c6(this, 0L, 260L, krVar3);
        this.d0 = new c6(this, 0L, 160L, krVar);
        this.e0 = new c6(this, 0L, 160L, krVar);
        this.f0 = new c6(this, 0L, 160L, krVar);
        this.g0 = -1;
        this.o0 = new RectF();
        this.p0 = -1.0f;
        this.q0 = new Path();
        this.s0 = new c6(this, 0L, 300L, krVar);
        this.t0 = new Paint(1);
        this.v0 = new c6(this, 0L, 260L, krVar3);
        String N0 = gd.N0(2131745065, null);
        this.w0 = N0;
        this.z0 = true;
        this.C0 = new c6(this, 0L, 380L, krVar2);
        this.D0 = new c6(this, 0L, 260L, krVar3);
        this.E0 = new c6(this, 0L, 260L, krVar3);
        this.F0 = new c6(this, 0L, 160L, krVar);
        this.H0 = new c6(this, 0L, 300L, krVar);
        this.a = l0Var;
        this.b = i6Var;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.c = view;
        addView(view, new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)));
        v2 v2Var = new v2(context);
        this.e = v2Var;
        v2Var.setCallback(this);
        this.f = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.h = i5.c.g(context, R.drawable.chats_undo);
        this.n = i5.c.g(context, R.drawable.msg_settings);
        this.r = i5.c.g(context, R.drawable.msg_language);
        m6 m6Var = new m6(false, false, false);
        this.s = m6Var;
        m6Var.n(0.33f, 260L, krVar3);
        m6Var.A = true;
        m6Var.w(org.telegram.messenger.g0.L(15.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.setCallback(this);
        m6Var.t(gd.N0(2131745060, null), false, true);
        m6 m6Var2 = new m6(false, false, false);
        this.x0 = m6Var2;
        m6Var2.n(0.33f, 260L, krVar3);
        m6Var2.w(org.telegram.messenger.g0.L(15.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.setCallback(this);
        m6Var2.t(N0, false, true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(-org.telegram.messenger.g0.N(3.8f), org.telegram.messenger.g0.N(3.8f));
        path.lineTo(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.N(3.8f), org.telegram.messenger.g0.N(3.8f));
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
        e();
    }

    public final void a() {
        bi.b1 b1Var = this.G0;
        if (b1Var == null || b1Var.O) {
            return;
        }
        b1Var.c(null);
        invalidate();
    }

    public final void b(Canvas canvas, fh.g gVar, RectF rectF, float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (gVar != null) {
            if (gVar == this.I && Math.abs(this.p0 - height) > 0.5f) {
                this.p0 = height;
                gVar.r(height);
            }
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            gVar.setAlpha((int) (f10 * 255.0f));
            gVar.draw(canvas);
            return;
        }
        Paint paint = this.y;
        paint.setAlpha((int) (255.0f * f10));
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = this.w;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, height, height, paint2);
        paint2.setAlpha(alpha);
        Paint paint3 = this.x;
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha((int) (alpha2 * f10));
        canvas.drawRoundRect(rectF, height, height, paint3);
        paint3.setAlpha(alpha2);
    }

    public final int c(float f10, float f11) {
        float L = org.telegram.messenger.g0.L(4.0f);
        if (this.y0 && this.C0.c > 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                RectF rectF2 = this.R;
                float f12 = rectF2.left - L;
                float f13 = K0;
                if (f10 >= f12) {
                    if (f10 < (f13 / 2.0f) + rectF2.right) {
                        return 3;
                    }
                }
                if (f10 >= rectF.left - (f13 / 2.0f) && f10 <= rectF.right + L) {
                    return 4;
                }
            }
        }
        if (this.T && this.W.c >= 0.7f) {
            RectF rectF3 = this.O;
            if (!rectF3.isEmpty() && f10 >= rectF3.left - L && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
                return 2;
            }
            RectF rectF4 = this.N;
            if (!rectF4.isEmpty() && f11 >= rectF4.top - L && f11 <= rectF4.bottom + L && f10 >= rectF4.left - L && f10 <= rectF4.right + L) {
                RectF rectF5 = this.Q;
                return (rectF5.isEmpty() || !rectF5.contains(f10, Math.max(rectF4.top, Math.min(rectF4.bottom - 1.0f, f11)))) ? 0 : 1;
            }
        }
        return -1;
    }

    public final void d(String str, boolean z10) {
        if (z10 && !this.V) {
            this.u0 = SystemClock.uptimeMillis();
        }
        this.V = z10;
        String str2 = str == null ? "" : str.toString();
        if (str2.endsWith("…")) {
            str2 = com.google.android.gms.internal.vision.e2.k(str2, 1, 0);
        } else if (str2.endsWith("...")) {
            str2 = com.google.android.gms.internal.vision.e2.k(str2, 3, 0);
        }
        this.s.t(str2, true, true);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v104, types: [int] */
    /* JADX WARN: Type inference failed for: r2v125 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        m6 m6Var;
        RectF rectF;
        Path path;
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        Path path2;
        float f13;
        float f14;
        TextPaint textPaint;
        float f15;
        RectF rectF2;
        float f16;
        float T1;
        float min;
        float f17;
        float f18;
        float f19;
        float f20;
        RectF rectF3;
        RectF rectF4;
        float f21;
        float f22;
        float f23;
        float L;
        int L2;
        Canvas canvas2 = canvas;
        boolean z13 = this.T;
        c6 c6Var = this.W;
        float d = c6Var.d(z13);
        float d2 = this.a0.d(!this.T);
        if (!this.T) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (this.T || d2 < 1.0f) {
            f10 = d;
        } else {
            c6Var.e(true, 0.0f);
            f10 = 0.0f;
        }
        float d10 = this.C0.d(this.y0);
        float L3 = org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(12.0f);
        m6 m6Var2 = this.x0;
        float L4 = L3 + m6Var2.d + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(13.0f);
        boolean z14 = this.z0;
        c6 c6Var2 = this.D0;
        if (z14) {
            this.z0 = false;
            c6Var2.e(true, L4);
        }
        this.B0 = c6Var2.e(false, L4);
        RectF rectF5 = this.M;
        if ((f10 > 0.0f || d10 > 0.0f) && this.a.k(rectF5)) {
            getLocationInWindow(this.S);
            rectF5.offset(-r5[0], -r5[1]);
            z10 = true;
        } else {
            z10 = false;
        }
        Path path3 = this.H;
        float f24 = K0;
        float f25 = J0;
        RectF rectF6 = this.N;
        RectF rectF7 = this.O;
        Paint paint = this.G;
        if (f10 <= 0.0f || !z10) {
            m6Var = m6Var2;
            rectF = rectF5;
            path = path3;
            z11 = false;
            z12 = true;
            f11 = d10;
            f12 = 3.0f;
            rectF6.setEmpty();
            rectF7.setEmpty();
        } else {
            boolean z15 = this.T;
            float L5 = org.telegram.messenger.g0.L(36.0f);
            f12 = 3.0f;
            float d11 = this.v0.d(this.V);
            m6 m6Var3 = this.s;
            float f26 = m6Var3.d;
            TextPaint textPaint2 = m6Var3.a;
            float L6 = ((this.V ? 1.0f : 0.0f) * org.telegram.messenger.g0.L(16.0f)) + f26;
            float d12 = this.s0.d(this.r0);
            float L7 = ((org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(1.0f)) * (1.0f - (this.r0 ? 1.0f : 0.0f))) + org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(12.0f) + L6 + org.telegram.messenger.g0.L(12.0f) + (this.r0 ? org.telegram.messenger.g0.L(4.0f) : 0);
            boolean z16 = this.n0;
            c6 c6Var3 = this.c0;
            if (z16) {
                path2 = path3;
                this.n0 = false;
                c6Var3.e(true, L7);
            } else {
                path2 = path3;
            }
            float e10 = c6Var3.e(false, L7);
            float L8 = rectF5.left + org.telegram.messenger.g0.L(2.0f);
            if (this.y0) {
                f13 = e10;
                f14 = f25 + f24 + this.B0 + f24;
            } else {
                f13 = e10;
                f14 = 0.0f;
            }
            float f27 = L8 + f14;
            float L9 = rectF5.top - org.telegram.messenger.g0.L(8.0f);
            rectF6.set(f27, L9 - L5, f27 + f13, L9);
            View view = this.c;
            if (Math.abs(view.getLeft() - rectF6.left) > 1.0f || Math.abs(view.getTop() - rectF6.top) > 1.0f || Math.abs(view.getWidth() - rectF6.width()) > 1.0f || view.getHeight() != ((int) L5)) {
                textPaint = textPaint2;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            } else {
                textPaint = textPaint2;
            }
            bi.b1 b1Var = this.G0;
            float d13 = this.H0.d((b1Var == null || b1Var.O) ? false : true);
            int i7 = this.g0;
            float d14 = this.d0.d(i7 == 0 || i7 == 1);
            RectF rectF8 = this.o0;
            if (!z15 || f10 >= 1.0f) {
                f15 = d14;
                rectF2 = rectF8;
                f16 = 1.0f;
                rectF2.set(rectF6);
                T1 = z15 ? 1.0f : org.telegram.messenger.g0.T1(0.85f, 1.0f, f10);
                min = Math.min(1.0f, f10) * 1.0f;
                f17 = min;
            } else {
                float max = Math.max(0.0f, f10);
                float f28 = 1.0f - max;
                float pow = 1.0f - ((float) Math.pow(f28, 3.0d));
                float min2 = 1.0f - Math.min(1.0f, max / 0.55f);
                float sin = ((((float) Math.sin(Math.min(1.0f, max / 0.8f) * 3.141592653589793d)) * 0.07f * f28) + ((1.0f - (min2 * min2)) * 0.38f) + 0.62f) * L5;
                float max2 = Math.max(sin, org.telegram.messenger.g0.T1(L5 * 0.62f, rectF6.width(), pow));
                float f29 = rectF6.left;
                float f30 = rectF6.bottom;
                f15 = d14;
                rectF2 = rectF8;
                rectF2.set(f29, f30 - sin, max2 + f29, f30);
                f16 = 1.0f;
                min = Math.min(1.0f, max * 3.0f) * 1.0f;
                T1 = 1.0f;
                f17 = Math.max(0.0f, Math.min(1.0f, (max - 0.62f) / 0.38f)) * 1.0f;
            }
            canvas2.save();
            float f31 = (f16 - (f15 * 0.04f)) * T1;
            float f32 = f16;
            canvas2.scale(f31, f31, rectF6.left + org.telegram.messenger.g0.L(18.0f), rectF6.bottom);
            if (!z15 || f10 >= f32 || rectF2.width() <= 0.0f) {
                float f33 = min;
                f18 = L5;
                f19 = d11;
                f20 = f10;
                f11 = d10;
                m6Var = m6Var2;
                path = path2;
                rectF = rectF5;
                z11 = false;
                z12 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                b(canvas2, this.I, rectF3, f33);
                canvas2 = canvas;
                d2.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.i0, this.m0 * f33, this.l0);
            } else {
                b(canvas2, this.I, rectF2, min);
                f18 = L5;
                RectF rectF9 = rectF2;
                rectF4 = rectF7;
                f11 = d10;
                f19 = d11;
                f20 = f10;
                m6Var = m6Var2;
                path = path2;
                rectF = rectF5;
                z11 = false;
                z12 = true;
                rectF3 = rectF6;
                d2.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.i0, min * this.m0, this.l0);
                Path path4 = this.q0;
                path4.rewind();
                path4.addRoundRect(rectF9, rectF9.height() / 2.0f, rectF9.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path4);
                canvas2 = canvas;
            }
            if (f17 > 0.0f) {
                float L10 = rectF3.left + org.telegram.messenger.g0.L(12.0f);
                float centerY = rectF3.centerY();
                int i10 = (int) (f17 * 255.0f);
                if (d12 < 1.0f) {
                    f21 = 0.01f;
                    v2 v2Var = this.e;
                    v2Var.setAlpha((int) (i10 * (1.0f - d12)));
                    canvas2.save();
                    float T12 = org.telegram.messenger.g0.T1(1.0f, 0.6f, d12);
                    canvas2.scale(T12, T12, org.telegram.messenger.g0.L(12.0f) + L10, centerY);
                    f22 = 0.4f;
                    v2Var.setBounds((int) L10, (int) (centerY - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(24.0f) + L10), (int) (org.telegram.messenger.g0.L(12.0f) + centerY));
                    v2Var.draw(canvas2);
                    canvas2.restore();
                } else {
                    f21 = 0.01f;
                    f22 = 0.4f;
                }
                if (d12 > 0.0f) {
                    int i11 = this.j0;
                    Paint paint2 = this.t0;
                    paint2.setColor(i11);
                    paint2.setAlpha((int) (i10 * d12));
                    float T13 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d12) * org.telegram.messenger.g0.N(5.0f);
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    f23 = L10;
                    rectF10.set((org.telegram.messenger.g0.L(12.0f) + L10) - T13, centerY - T13, f23 + org.telegram.messenger.g0.L(12.0f) + T13, T13 + centerY);
                    canvas2.drawRoundRect(rectF10, org.telegram.messenger.g0.N(2.2f), org.telegram.messenger.g0.N(2.2f), paint2);
                } else {
                    f23 = L10;
                }
                float L11 = f23 + org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f);
                m6Var3.C = i10;
                m6Var3.setBounds((int) L11, (int) (centerY - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(240.0f) + L11), (int) (org.telegram.messenger.g0.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L12 = L11 - org.telegram.messenger.g0.L(2.0f);
                float f34 = rectF3.top;
                if (this.r0) {
                    L = rectF3.right;
                    L2 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    L = (((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
                    L2 = org.telegram.messenger.g0.L(4.0f);
                }
                canvas2.clipRect(L12, f34, L - L2, rectF3.bottom);
                m6Var3.draw(canvas2);
                if (f19 > f21) {
                    float c10 = m6Var3.c() + L11 + org.telegram.messenger.g0.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i12 = this.j0;
                    Paint paint3 = this.F;
                    paint3.setColor(i12);
                    for (?? r22 = z11; r22 < 3; r22++) {
                        float f35 = c10;
                        paint3.setAlpha((int) (i10 * f19 * ((Math.max(0.0f, (float) Math.sin((((r53 - this.u0) / 1200.0f) - (((float) r22) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((org.telegram.messenger.g0.L(4.5f) * r22) + f35, org.telegram.messenger.g0.L(4.5f) + centerY, org.telegram.messenger.g0.N(1.4f), paint3);
                        c10 = f35;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L13 = (((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
                int r12 = (n6.r1(0.14f, this.j0) >>> 24) & ks.e4;
                Paint paint4 = this.E;
                paint4.setAlpha(r12);
                int alpha = paint4.getAlpha();
                float f36 = 1.0f - d12;
                paint4.setAlpha((int) (alpha * f17 * f36));
                canvas2.drawRect(L13, centerY - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.N(1.0f) + L13, org.telegram.messenger.g0.L(9.0f) + centerY, paint4);
                paint4.setAlpha(alpha);
                boolean z17 = this.r0;
                RectF rectF11 = this.Q;
                if (z17) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L13 - org.telegram.messenger.g0.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L14 = (rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(7.0f);
                paint.setAlpha((int) (i10 * f36));
                canvas2.save();
                canvas2.translate(L14, ((centerY - org.telegram.messenger.g0.N(1.9f)) - org.telegram.messenger.g0.N(f22)) - (org.telegram.messenger.g0.N(1.0f) * d13));
                canvas2.drawPath(path, paint);
                canvas2.restore();
            } else {
                f21 = 0.01f;
                f22 = 0.4f;
            }
            canvas2.restore();
            float d15 = this.b0.d(this.U) * f20;
            if (d15 > f21) {
                float d16 = this.e0.d(this.g0 == 2 ? z12 : z11);
                rectF4.set(rectF3.right + org.telegram.messenger.g0.L(6.0f), rectF3.top, rectF3.right + org.telegram.messenger.g0.L(6.0f) + f18, rectF3.bottom);
                float T14 = (1.0f - (d16 * 0.08f)) * org.telegram.messenger.g0.T1(f22, 1.0f, d15);
                canvas2.save();
                canvas2.scale(T14, T14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d15 * 1.5f) * 1.0f;
                b(canvas2, this.J, rectF4, min3);
                d2.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.i0, this.m0 * min3, this.l0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L15 = centerX - org.telegram.messenger.g0.L(12.0f);
                int L16 = centerY2 - org.telegram.messenger.g0.L(12.0f);
                int L17 = org.telegram.messenger.g0.L(12.0f) + centerX;
                int L18 = org.telegram.messenger.g0.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L15, L16, L17, L18);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        }
        RectF rectF12 = this.P;
        if (f11 <= 0.0f || !z10) {
            rectF12.setEmpty();
        } else {
            float L19 = org.telegram.messenger.g0.L(36.0f);
            RectF rectF13 = rectF;
            float L20 = rectF13.top - org.telegram.messenger.g0.L(8.0f);
            float f37 = L20 - L19;
            float L21 = rectF13.left + org.telegram.messenger.g0.L(2.0f);
            float L22 = rectF13.left + org.telegram.messenger.g0.L(2.0f) + f25;
            RectF rectF14 = this.R;
            rectF14.set(L21, f37, L22, L20);
            float f38 = rectF14.right + f24;
            rectF12.set(f38, f37, this.B0 + f38, L20);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - rectF12.right) > 1.0f || view2.getHeight() != ((int) L19)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) rectF12.right, (int) rectF12.bottom);
            }
            float f39 = f11;
            float max3 = Math.max(0.0f, Math.min(1.0f, f39));
            float C = com.google.android.gms.internal.vision.e2.C(max3, 2.0f, f12, max3 * max3);
            float max4 = Math.max(0.0f, Math.min(1.0f, f39 * 1.5f));
            float d17 = this.f0.d(this.g0 == 3 ? z12 : z11);
            canvas2.save();
            float f40 = 1.0f - C;
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * f40);
            float f41 = (C * 0.1f) + 0.9f;
            float C2 = com.google.android.gms.internal.vision.e2.C(d17, 0.06f, 1.0f, f41);
            canvas2.scale(C2, C2, rectF14.centerX(), rectF14.centerY());
            b(canvas2, this.L, rectF14, max4);
            float f42 = L19 / 2.0f;
            d2.a(canvas2, rectF14.left, rectF14.top, rectF14.right, rectF14.bottom, f42, this.i0, this.m0 * max4, this.l0);
            int centerX2 = (int) rectF14.centerX();
            int centerY3 = (int) rectF14.centerY();
            int L23 = org.telegram.messenger.g0.L(18.5f);
            float f43 = L23 / 2.0f;
            float f44 = centerX2 - f43;
            int round = Math.round(f44);
            float f45 = centerY3 - f43;
            int round2 = Math.round(f45);
            int round3 = Math.round(f44) + L23;
            int round4 = Math.round(f45) + L23;
            Drawable drawable2 = this.n;
            drawable2.setBounds(round, round2, round3, round4);
            float f46 = max4 * 255.0f;
            int i13 = (int) f46;
            drawable2.setAlpha(i13);
            drawable2.draw(canvas2);
            canvas2.restore();
            float d18 = this.F0.d(this.g0 == 4 ? z12 : z11);
            canvas2.save();
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * f40);
            float f47 = (1.0f - (d18 * 0.04f)) * f41;
            canvas2.scale(f47, f47, rectF12.left + org.telegram.messenger.g0.L(18.0f), rectF12.bottom);
            b(canvas2, this.K, rectF12, max4);
            d2.a(canvas2, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, f42, this.i0, this.m0 * max4, this.l0);
            float centerY4 = rectF12.centerY();
            int L24 = (int) (rectF12.left + org.telegram.messenger.g0.L(12.0f));
            int L25 = (int) (centerY4 - org.telegram.messenger.g0.L(9.0f));
            int L26 = org.telegram.messenger.g0.L(18.0f) + L24;
            int L27 = org.telegram.messenger.g0.L(18.0f) + L25;
            Drawable drawable3 = this.r;
            drawable3.setBounds(L24, L25, L26, L27);
            drawable3.setAlpha(i13);
            drawable3.draw(canvas2);
            float L28 = (rectF12.right - org.telegram.messenger.g0.L(13.0f)) - org.telegram.messenger.g0.L(4.0f);
            float L29 = rectF12.left + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(6.0f);
            m6 m6Var4 = m6Var;
            m6Var4.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E0.d(this.A0)) * f46);
            float N = centerY4 - org.telegram.messenger.g0.N(1.0f);
            m6Var4.setBounds((int) L29, (int) (N - org.telegram.messenger.g0.L(12.0f)), (int) (L29 + org.telegram.messenger.g0.L(240.0f)), (int) (N + org.telegram.messenger.g0.L(12.0f)));
            canvas2.save();
            canvas2.clipRect(rectF12.left, rectF12.top, L28 - org.telegram.messenger.g0.L(8.0f), rectF12.bottom);
            m6Var4.draw(canvas2);
            canvas2.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max4));
            canvas2.save();
            canvas2.translate(L28, centerY4 - org.telegram.messenger.g0.N(1.9f));
            canvas2.drawPath(path, paint);
            canvas2.restore();
            paint.setAlpha(alpha2);
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11 = 3;
        int i12 = 0;
        int i13 = 1;
        if (this.G0 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                RectF rectF = this.N;
                if (!rectF.isEmpty()) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(rectF);
                    rectF2.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                    this.h0 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                }
            }
            if (!this.h0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (actionMasked == 1) {
                this.h0 = false;
                a();
                return true;
            }
            if (actionMasked == 3) {
                this.h0 = false;
                return true;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 != 0) {
                int i14 = this.g0;
                if (i14 >= 0) {
                    if (actionMasked2 == 1) {
                        this.g0 = -1;
                        invalidate();
                        if (c(motionEvent.getX(), motionEvent.getY()) == i14) {
                            int i15 = 2;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            l0 l0Var = this.a;
                            if (i14 == 0) {
                                int i16 = l0Var.r;
                                if (i16 == 1) {
                                    l0Var.s();
                                } else if (i16 == 3) {
                                    l0Var.c(l0Var.K);
                                }
                            } else {
                                c cVar = d.c;
                                int i17 = 4;
                                int i18 = 44;
                                if (i14 == 1) {
                                    Context context = l0Var.h;
                                    i6 i6Var = l0Var.n;
                                    int i19 = l0Var.r;
                                    if (i19 == 3 || i19 == 4) {
                                        bi.b1 b1Var = new bi.b1(context, this.c, i6Var, new w(l0Var, i11));
                                        b1Var.T = true;
                                        b1Var.n = org.telegram.messenger.g0.L(ks.n5);
                                        b1Var.M = org.telegram.messenger.g0.L(ks.x3);
                                        b1Var.S = true;
                                        b1Var.L = 0;
                                        int w02 = n6.w0(n6.G6, i6Var);
                                        b1Var.a(new h0(context, w02, n6.w0(n6.F8, i6Var)), 44, new x(l0Var, i17));
                                        ArrayList c10 = l0Var.H.c();
                                        c10.add(cVar);
                                        int size = c10.size();
                                        int i20 = 0;
                                        while (i20 < size) {
                                            Object obj = c10.get(i20);
                                            i20++;
                                            c cVar2 = (c) obj;
                                            int i21 = w02;
                                            b1Var.a(new k0(l0Var.h, cVar2, i21, l0Var.f.a.R, cVar2 == l0Var.K && l0Var.J != null), 44, new a1.e(13, l0Var, cVar2));
                                            w02 = i21;
                                        }
                                        i1 i1Var = l0Var.w;
                                        i1Var.G0 = b1Var;
                                        i1Var.addView(b1Var, new FrameLayout.LayoutParams(-1, -1));
                                        i1Var.invalidate();
                                        b1Var.setFocusableInTouchMode(true);
                                        b1Var.setOnKeyListener(new b0(1, b1Var));
                                        b1Var.requestFocus();
                                        b1Var.R = new x(l0Var, 5);
                                        b1Var.f();
                                    }
                                } else if (i14 == 3) {
                                    if (l0Var.r == 1) {
                                        l0Var.s();
                                    }
                                    rf rfVar = l0Var.f;
                                    r2 r2Var = new r2();
                                    bn bnVar = rfVar.a.F3;
                                    if (bnVar != null) {
                                        bnVar.presentFragment(r2Var);
                                    }
                                } else {
                                    Runnable runnable = null;
                                    if (i14 == 4) {
                                        l0Var.w.a();
                                        Context context2 = l0Var.h;
                                        i6 i6Var2 = l0Var.n;
                                        bi.b1 b1Var2 = new bi.b1(context2, this.d, i6Var2, new w(l0Var, i13));
                                        b1Var2.T = true;
                                        b1Var2.n = org.telegram.messenger.g0.L(ks.n5);
                                        b1Var2.M = org.telegram.messenger.g0.L(ks.e3);
                                        b1Var2.S = true;
                                        b1Var2.L = 0;
                                        int w03 = n6.w0(n6.G6, i6Var2);
                                        boolean z10 = DictationAsr.z();
                                        b1Var2.a(new i0(l0Var.h, gd.N0(2131745068, null), null, w03, z10), 44, new k(1));
                                        String[] H = DictationAsr.H();
                                        int length = H.length;
                                        int i22 = 0;
                                        while (i22 < length) {
                                            String str = H[i22];
                                            boolean z11 = (z10 || !DictationAsr.B(str)) ? i12 : 1;
                                            int i23 = i22;
                                            q M = DictationAsr.M(str);
                                            String[] d = M != null ? M.d(str) : new String[i12];
                                            if (d.length < 2) {
                                                b1Var2.a(new i0(l0Var.h, l0.o(str), null, w03, z11), i18, new a1.e(12, l0Var, str));
                                                i7 = length;
                                                i10 = i23;
                                            } else {
                                                i0 i0Var = new i0(l0Var.h, l0.o(str), l0.N(DictationAsr.g0(M, str)), w03, z11);
                                                b1Var2.a(i0Var, 54, runnable);
                                                i7 = length;
                                                i10 = i23;
                                                i0Var.setOnClickListener(new a0(l0Var, M, str, d, w03, z11, b1Var2));
                                            }
                                            i22 = i10 + 1;
                                            length = i7;
                                            i12 = 0;
                                            runnable = null;
                                            i18 = 44;
                                        }
                                        i1 i1Var2 = l0Var.w;
                                        i1Var2.G0 = b1Var2;
                                        i1Var2.addView(b1Var2, new FrameLayout.LayoutParams(-1, -1));
                                        i1Var2.invalidate();
                                        b1Var2.setFocusableInTouchMode(true);
                                        b1Var2.setOnKeyListener(new b0(0, b1Var2));
                                        b1Var2.requestFocus();
                                        b1Var2.R = new x(l0Var, i15);
                                        b1Var2.f();
                                    } else {
                                        String str2 = l0Var.J;
                                        if (str2 != null && l0Var.r == 3) {
                                            l0Var.J = null;
                                            l0Var.u(str2);
                                            l0Var.K = cVar;
                                            l0Var.w.setRevert(false);
                                            l0Var.w.d(cVar.a(), false);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked2 == 3) {
                        this.g0 = -1;
                        invalidate();
                    }
                }
                return false;
            }
            this.g0 = c(motionEvent.getX(), motionEvent.getY());
            invalidate();
            if (this.g0 < 0) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        int i7 = n6.d6;
        i6 i6Var = this.b;
        this.i0 = org.telegram.messenger.g0.B(n6.w0(i7, i6Var)) < 0.5f;
        int w02 = n6.w0(n6.G6, i6Var);
        this.j0 = w02;
        this.k0 = w02;
        this.s.u(w02);
        this.x0.u(this.j0);
        int i10 = this.k0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.G.setColor(this.k0);
        this.h.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.r.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.w.setColor(this.i0 ? -651810255 : -335544321);
        this.x.setColor(this.i0 ? 654311423 : 335544320);
        this.E.setColor(n6.r1(0.14f, this.j0));
        Paint paint = this.y;
        paint.setColor(16777216);
        paint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), this.i0 ? 1426063360 : 570425344);
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.K;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        fh.g gVar4 = this.L;
        if (gVar4 != null) {
            gVar4.updateColors();
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != this.c && childAt != this.d) {
                childAt.layout(0, 0, i11 - i7, i12 - i10);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.G0) {
            this.G0 = null;
            invalidate();
        }
    }

    public void setGearGlass(fh.g gVar) {
        this.L = gVar;
        if (gVar != null) {
            gVar.r(org.telegram.messenger.g0.L(18.0f));
        }
    }

    public void setIsland(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        if (z10) {
            this.a0.e(true, 0.0f);
            this.W.e(true, 0.0f);
            this.n0 = true;
            v2 v2Var = this.e;
            Objects.requireNonNull(v2Var);
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.s0(v2Var, 1), 160L);
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        boolean z10 = false;
        boolean z11 = charSequence != null;
        if (this.y0 && this.C0.c > 0.0f) {
            z10 = true;
        }
        if (!z10) {
            this.E0.a(z11);
            this.z0 = true;
        }
        this.A0 = z11;
        if (!z11) {
            charSequence = this.w0;
        }
        this.x0.t(charSequence, z10, true);
        invalidate();
    }

    public void setRevert(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        invalidate();
    }

    public void setSettings(boolean z10) {
        if (this.y0 == z10) {
            return;
        }
        this.y0 = z10;
        if (z10 && this.C0.c <= 0.0f) {
            this.z0 = true;
        }
        invalidate();
    }

    public void setStopMode(boolean z10) {
        if (this.r0 == z10) {
            return;
        }
        this.r0 = z10;
        if (!this.T) {
            this.s0.e(true, z10 ? 1.0f : 0.0f);
        }
        if (!z10) {
            v2 v2Var = this.e;
            Objects.requireNonNull(v2Var);
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.s0(v2Var, 1), 120L);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || drawable == this.s || drawable == this.x0 || super.verifyDrawable(drawable);
    }
}

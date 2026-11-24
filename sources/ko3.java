// default package

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
import org.telegram.ui.Components.d;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ko3 extends FrameLayout {
    public static final d53 I0 = new d53(0.34d, 1.32d, 0.5d, 1.0d);
    public static final float J0 = gm.L(36.0f);
    public static final float K0 = gm.L(8.0f);
    public boolean A0;
    public float B0;
    public final ln C0;
    public final ln D0;
    public final Paint E;
    public final ln E0;
    public final Paint F;
    public final ln F0;
    public final Paint G;
    public xv4 G0;
    public final Path H;
    public final ln H0;
    public im0 I;
    public im0 J;
    public im0 K;
    public im0 L;
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
    public final ln W;
    public final un3 a;
    public final ln a0;
    public final ylb b;
    public final ln b0;
    public final View c;
    public final ln c0;
    public final View d;
    public final ln d0;
    public final hd e;
    public final ln e0;
    public final Drawable f;
    public final ln f0;
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
    public final ho s;
    public final ln s0;
    public final Paint t0;
    public long u0;
    public final ln v0;
    public final Paint w;
    public final String w0;
    public final Paint x;
    public final ho x0;
    public final Paint y;
    public boolean y0;
    public boolean z0;

    public ko3(Context context, ylb ylbVar, un3 un3Var) {
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
        this.W = new ln(this, 0L, 280L, new d53(0.0f, 0.0f, 1.0f, 1.0f));
        d53 d53Var = d53.h;
        this.a0 = new ln(this, 0L, 240L, d53Var);
        d53 d53Var2 = I0;
        this.b0 = new ln(this, 0L, 460L, d53Var2);
        d53 d53Var3 = d53.g;
        this.c0 = new ln(this, 0L, 260L, d53Var3);
        this.d0 = new ln(this, 0L, 160L, d53Var);
        this.e0 = new ln(this, 0L, 160L, d53Var);
        this.f0 = new ln(this, 0L, 160L, d53Var);
        this.g0 = -1;
        this.o0 = new RectF();
        this.p0 = -1.0f;
        this.q0 = new Path();
        this.s0 = new ln(this, 0L, 300L, d53Var);
        this.t0 = new Paint(1);
        this.v0 = new ln(this, 0L, 260L, d53Var3);
        String M0 = jb6.M0(2131744995, null);
        this.w0 = M0;
        this.z0 = true;
        this.C0 = new ln(this, 0L, 380L, d53Var2);
        this.D0 = new ln(this, 0L, 260L, d53Var3);
        this.E0 = new ln(this, 0L, 260L, d53Var3);
        this.F0 = new ln(this, 0L, 160L, d53Var);
        this.H0 = new ln(this, 0L, 300L, d53Var);
        this.a = un3Var;
        this.b = ylbVar;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.c = view;
        addView(view, new FrameLayout.LayoutParams(gm.L(10.0f), gm.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(gm.L(10.0f), gm.L(10.0f)));
        hd hdVar = new hd(context);
        this.e = hdVar;
        hdVar.setCallback(this);
        this.f = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.h = b10.d(context, R.drawable.chats_undo);
        this.n = b10.d(context, R.drawable.msg_settings);
        this.r = b10.d(context, R.drawable.msg_language);
        ho hoVar = new ho(false, false, false);
        this.s = hoVar;
        hoVar.n(0.33f, 260L, d53Var3);
        hoVar.A = true;
        hoVar.w(gm.L(15.0f));
        hoVar.x(gm.o());
        hoVar.setCallback(this);
        hoVar.t(jb6.M0(2131744990, null), false, true);
        ho hoVar2 = new ho(false, false, false);
        this.x0 = hoVar2;
        hoVar2.n(0.33f, 260L, d53Var3);
        hoVar2.w(gm.L(15.0f));
        hoVar2.x(gm.o());
        hoVar2.setCallback(this);
        hoVar2.t(M0, false, true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.N(1.75f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(-gm.N(3.8f), gm.N(3.8f));
        path.lineTo(0.0f, 0.0f);
        path.lineTo(gm.N(3.8f), gm.N(3.8f));
        paint.setStyle(style);
        paint.setStrokeWidth(gm.N(0.66f));
        e();
    }

    public final void a() {
        xv4 xv4Var = this.G0;
        if (xv4Var == null || xv4Var.O) {
            return;
        }
        xv4Var.c(null);
        invalidate();
    }

    public final void b(Canvas canvas, im0 im0Var, RectF rectF, float f) {
        if (f <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (im0Var != null) {
            if (im0Var == this.I && Math.abs(this.p0 - height) > 0.5f) {
                this.p0 = height;
                im0Var.r(height);
            }
            im0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            im0Var.setAlpha((int) (f * 255.0f));
            im0Var.draw(canvas);
            return;
        }
        Paint paint = this.y;
        paint.setAlpha((int) (255.0f * f));
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = this.w;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f));
        canvas.drawRoundRect(rectF, height, height, paint2);
        paint2.setAlpha(alpha);
        Paint paint3 = this.x;
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha((int) (alpha2 * f));
        canvas.drawRoundRect(rectF, height, height, paint3);
        paint3.setAlpha(alpha2);
    }

    public final int c(float f, float f2) {
        float L = gm.L(4.0f);
        if (this.y0 && this.C0.c > 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                RectF rectF2 = this.R;
                float f3 = rectF2.left - L;
                float f4 = K0;
                if (f >= f3) {
                    if (f < (f4 / 2.0f) + rectF2.right) {
                        return 3;
                    }
                }
                if (f >= rectF.left - (f4 / 2.0f) && f <= rectF.right + L) {
                    return 4;
                }
            }
        }
        if (this.T && this.W.c >= 0.7f) {
            RectF rectF3 = this.O;
            if (!rectF3.isEmpty() && f >= rectF3.left - L && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                return 2;
            }
            RectF rectF4 = this.N;
            if (!rectF4.isEmpty() && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L && f >= rectF4.left - L && f <= rectF4.right + L) {
                RectF rectF5 = this.Q;
                return (rectF5.isEmpty() || !rectF5.contains(f, Math.max(rectF4.top, Math.min(rectF4.bottom - 1.0f, f2)))) ? 0 : 1;
            }
        }
        return -1;
    }

    public final void d(String str, boolean z) {
        if (z && !this.V) {
            this.u0 = SystemClock.uptimeMillis();
        }
        this.V = z;
        String str2 = str == null ? "" : str.toString();
        if (str2.endsWith("…")) {
            str2 = ts2.m(1, 0, str2);
        } else if (str2.endsWith("...")) {
            str2 = ts2.m(3, 0, str2);
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
        float f;
        boolean z;
        ho hoVar;
        RectF rectF;
        Path path;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        Path path2;
        float f4;
        float f5;
        TextPaint textPaint;
        float f6;
        RectF rectF2;
        float f7;
        float R1;
        float min;
        float f8;
        float f9;
        float f10;
        float f11;
        RectF rectF3;
        RectF rectF4;
        float f12;
        float f13;
        float f14;
        int L;
        Canvas canvas2 = canvas;
        boolean z4 = this.T;
        ln lnVar = this.W;
        float d = lnVar.d(z4);
        float d2 = this.a0.d(!this.T);
        if (!this.T) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (this.T || d2 < 1.0f) {
            f = d;
        } else {
            lnVar.e(true, 0.0f);
            f = 0.0f;
        }
        float d3 = this.C0.d(this.y0);
        float L2 = gm.L(6.0f) + gm.L(18.0f) + gm.L(12.0f);
        ho hoVar2 = this.x0;
        float L3 = L2 + hoVar2.d + gm.L(8.0f) + gm.L(8.0f) + gm.L(13.0f);
        boolean z5 = this.z0;
        ln lnVar2 = this.D0;
        if (z5) {
            this.z0 = false;
            lnVar2.e(true, L3);
        }
        this.B0 = lnVar2.e(false, L3);
        RectF rectF5 = this.M;
        if ((f > 0.0f || d3 > 0.0f) && this.a.n(rectF5)) {
            getLocationInWindow(this.S);
            rectF5.offset(-r5[0], -r5[1]);
            z = true;
        } else {
            z = false;
        }
        Path path3 = this.H;
        float f15 = K0;
        float f16 = J0;
        RectF rectF6 = this.N;
        RectF rectF7 = this.O;
        Paint paint = this.G;
        if (f <= 0.0f || !z) {
            hoVar = hoVar2;
            rectF = rectF5;
            path = path3;
            z2 = false;
            z3 = true;
            f2 = d3;
            f3 = 3.0f;
            rectF6.setEmpty();
            rectF7.setEmpty();
        } else {
            boolean z6 = this.T;
            float L4 = gm.L(36.0f);
            f3 = 3.0f;
            float d4 = this.v0.d(this.V);
            ho hoVar3 = this.s;
            float f17 = hoVar3.d;
            TextPaint textPaint2 = hoVar3.a;
            float L5 = ((this.V ? 1.0f : 0.0f) * gm.L(16.0f)) + f17;
            float d5 = this.s0.d(this.r0);
            float L6 = ((gm.L(10.0f) + gm.L(14.0f) + gm.L(8.0f) + gm.L(1.0f)) * (1.0f - (this.r0 ? 1.0f : 0.0f))) + gm.L(6.0f) + gm.L(24.0f) + gm.L(12.0f) + L5 + gm.L(12.0f) + (this.r0 ? gm.L(4.0f) : 0);
            boolean z7 = this.n0;
            ln lnVar3 = this.c0;
            if (z7) {
                path2 = path3;
                this.n0 = false;
                lnVar3.e(true, L6);
            } else {
                path2 = path3;
            }
            float e = lnVar3.e(false, L6);
            float L7 = rectF5.left + gm.L(2.0f);
            if (this.y0) {
                f4 = e;
                f5 = f16 + f15 + this.B0 + f15;
            } else {
                f4 = e;
                f5 = 0.0f;
            }
            float f18 = L7 + f5;
            float L8 = rectF5.top - gm.L(8.0f);
            rectF6.set(f18, L8 - L4, f18 + f4, L8);
            View view = this.c;
            if (Math.abs(view.getLeft() - rectF6.left) > 1.0f || Math.abs(view.getTop() - rectF6.top) > 1.0f || Math.abs(view.getWidth() - rectF6.width()) > 1.0f || view.getHeight() != ((int) L4)) {
                textPaint = textPaint2;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            } else {
                textPaint = textPaint2;
            }
            xv4 xv4Var = this.G0;
            float d6 = this.H0.d((xv4Var == null || xv4Var.O) ? false : true);
            int i = this.g0;
            float d7 = this.d0.d(i == 0 || i == 1);
            RectF rectF8 = this.o0;
            if (!z6 || f >= 1.0f) {
                f6 = d7;
                rectF2 = rectF8;
                f7 = 1.0f;
                rectF2.set(rectF6);
                R1 = z6 ? 1.0f : gm.R1(0.85f, 1.0f, f);
                min = Math.min(1.0f, f) * 1.0f;
                f8 = min;
            } else {
                float max = Math.max(0.0f, f);
                float f19 = 1.0f - max;
                float pow = 1.0f - ((float) Math.pow(f19, 3.0d));
                float min2 = 1.0f - Math.min(1.0f, max / 0.55f);
                float sin = ((((float) Math.sin(Math.min(1.0f, max / 0.8f) * 3.141592653589793d)) * 0.07f * f19) + ((1.0f - (min2 * min2)) * 0.38f) + 0.62f) * L4;
                float max2 = Math.max(sin, gm.R1(L4 * 0.62f, rectF6.width(), pow));
                float f20 = rectF6.left;
                float f21 = rectF6.bottom;
                f6 = d7;
                rectF2 = rectF8;
                rectF2.set(f20, f21 - sin, max2 + f20, f21);
                f7 = 1.0f;
                min = Math.min(1.0f, max * 3.0f) * 1.0f;
                R1 = 1.0f;
                f8 = Math.max(0.0f, Math.min(1.0f, (max - 0.62f) / 0.38f)) * 1.0f;
            }
            canvas2.save();
            float f22 = (f7 - (f6 * 0.04f)) * R1;
            float f23 = f7;
            canvas2.scale(f22, f22, rectF6.left + gm.L(18.0f), rectF6.bottom);
            if (!z6 || f >= f23 || rectF2.width() <= 0.0f) {
                float f24 = min;
                f9 = L4;
                f10 = d4;
                f11 = f;
                f2 = d3;
                hoVar = hoVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                b(canvas2, this.I, rectF3, f24);
                canvas2 = canvas;
                az4.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.i0, this.m0 * f24, this.l0);
            } else {
                b(canvas2, this.I, rectF2, min);
                f9 = L4;
                RectF rectF9 = rectF2;
                rectF4 = rectF7;
                f2 = d3;
                f10 = d4;
                f11 = f;
                hoVar = hoVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                az4.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.i0, min * this.m0, this.l0);
                Path path4 = this.q0;
                path4.rewind();
                path4.addRoundRect(rectF9, rectF9.height() / 2.0f, rectF9.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path4);
                canvas2 = canvas;
            }
            if (f8 > 0.0f) {
                float L9 = rectF3.left + gm.L(12.0f);
                float centerY = rectF3.centerY();
                int i2 = (int) (f8 * 255.0f);
                if (d5 < 1.0f) {
                    f12 = 0.01f;
                    hd hdVar = this.e;
                    hdVar.setAlpha((int) (i2 * (1.0f - d5)));
                    canvas2.save();
                    float R12 = gm.R1(1.0f, 0.6f, d5);
                    canvas2.scale(R12, R12, gm.L(12.0f) + L9, centerY);
                    f13 = 0.4f;
                    hdVar.setBounds((int) L9, (int) (centerY - gm.L(12.0f)), (int) (gm.L(24.0f) + L9), (int) (gm.L(12.0f) + centerY));
                    hdVar.draw(canvas2);
                    canvas2.restore();
                } else {
                    f12 = 0.01f;
                    f13 = 0.4f;
                }
                if (d5 > 0.0f) {
                    int i3 = this.j0;
                    Paint paint2 = this.t0;
                    paint2.setColor(i3);
                    paint2.setAlpha((int) (i2 * d5));
                    float R13 = gm.R1(0.6f, 1.0f, d5) * gm.N(5.0f);
                    RectF rectF10 = gm.P;
                    f14 = L9;
                    rectF10.set((gm.L(12.0f) + L9) - R13, centerY - R13, f14 + gm.L(12.0f) + R13, R13 + centerY);
                    canvas2.drawRoundRect(rectF10, gm.N(2.2f), gm.N(2.2f), paint2);
                } else {
                    f14 = L9;
                }
                float L10 = f14 + gm.L(6.0f) + gm.L(24.0f);
                hoVar3.C = i2;
                hoVar3.setBounds((int) L10, (int) (centerY - gm.L(12.0f)), (int) (gm.L(240.0f) + L10), (int) (gm.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L11 = L10 - gm.L(2.0f);
                float f25 = rectF3.top;
                boolean z8 = this.r0;
                float f26 = rectF3.right;
                if (z8) {
                    L = gm.L(6.0f);
                } else {
                    f26 = (((f26 - gm.L(10.0f)) - gm.L(14.0f)) - gm.L(8.0f)) - gm.L(1.0f);
                    L = gm.L(4.0f);
                }
                canvas2.clipRect(L11, f25, f26 - L, rectF3.bottom);
                hoVar3.draw(canvas2);
                if (f10 > f12) {
                    float c = hoVar3.c() + L10 + gm.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i4 = this.j0;
                    Paint paint3 = this.F;
                    paint3.setColor(i4);
                    for (?? r2 = z2; r2 < 3; r2++) {
                        float f27 = c;
                        paint3.setAlpha((int) (i2 * f10 * ((Math.max(0.0f, (float) Math.sin((((r53 - this.u0) / 1200.0f) - (((float) r2) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((gm.L(4.5f) * r2) + f27, gm.L(4.5f) + centerY, gm.N(1.4f), paint3);
                        c = f27;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L12 = (((rectF3.right - gm.L(10.0f)) - gm.L(14.0f)) - gm.L(8.0f)) - gm.L(1.0f);
                int p1 = (cmb.p1(0.14f, this.j0) >>> 24) & nm7.d4;
                Paint paint4 = this.E;
                paint4.setAlpha(p1);
                int alpha = paint4.getAlpha();
                float f28 = 1.0f - d5;
                paint4.setAlpha((int) (alpha * f8 * f28));
                canvas2.drawRect(L12, centerY - gm.L(9.0f), gm.N(1.0f) + L12, gm.L(9.0f) + centerY, paint4);
                paint4.setAlpha(alpha);
                boolean z9 = this.r0;
                RectF rectF11 = this.Q;
                if (z9) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L12 - gm.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L13 = (rectF3.right - gm.L(10.0f)) - gm.L(7.0f);
                paint.setAlpha((int) (i2 * f28));
                canvas2.save();
                canvas2.translate(L13, ((centerY - gm.N(1.9f)) - gm.N(f13)) - (gm.N(1.0f) * d6));
                canvas2.drawPath(path, paint);
                canvas2.restore();
            } else {
                f12 = 0.01f;
                f13 = 0.4f;
            }
            canvas2.restore();
            float d8 = this.b0.d(this.U) * f11;
            if (d8 > f12) {
                float d9 = this.e0.d(this.g0 == 2 ? z3 : z2);
                rectF4.set(rectF3.right + gm.L(6.0f), rectF3.top, rectF3.right + gm.L(6.0f) + f9, rectF3.bottom);
                float R14 = (1.0f - (d9 * 0.08f)) * gm.R1(f13, 1.0f, d8);
                canvas2.save();
                canvas2.scale(R14, R14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d8 * 1.5f) * 1.0f;
                b(canvas2, this.J, rectF4, min3);
                az4.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.i0, this.m0 * min3, this.l0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L14 = centerX - gm.L(12.0f);
                int L15 = centerY2 - gm.L(12.0f);
                int L16 = gm.L(12.0f) + centerX;
                int L17 = gm.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L14, L15, L16, L17);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        }
        RectF rectF12 = this.P;
        if (f2 <= 0.0f || !z) {
            rectF12.setEmpty();
        } else {
            float L18 = gm.L(36.0f);
            RectF rectF13 = rectF;
            float L19 = rectF13.top - gm.L(8.0f);
            float f29 = L19 - L18;
            float L20 = rectF13.left + gm.L(2.0f);
            float L21 = rectF13.left + gm.L(2.0f) + f16;
            RectF rectF14 = this.R;
            rectF14.set(L20, f29, L21, L19);
            float f30 = rectF14.right + f15;
            rectF12.set(f30, f29, this.B0 + f30, L19);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - rectF12.right) > 1.0f || view2.getHeight() != ((int) L18)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) rectF12.right, (int) rectF12.bottom);
            }
            float f31 = f2;
            float max3 = Math.max(0.0f, Math.min(1.0f, f31));
            float B = mlb.B(max3, 2.0f, f3, max3 * max3);
            float max4 = Math.max(0.0f, Math.min(1.0f, f31 * 1.5f));
            float d10 = this.f0.d(this.g0 == 3 ? z3 : z2);
            canvas2.save();
            float f32 = 1.0f - B;
            canvas2.translate(0.0f, gm.L(6.0f) * f32);
            float f33 = (B * 0.1f) + 0.9f;
            float B2 = mlb.B(d10, 0.06f, 1.0f, f33);
            canvas2.scale(B2, B2, rectF14.centerX(), rectF14.centerY());
            b(canvas2, this.L, rectF14, max4);
            float f34 = L18 / 2.0f;
            az4.a(canvas2, rectF14.left, rectF14.top, rectF14.right, rectF14.bottom, f34, this.i0, this.m0 * max4, this.l0);
            int centerX2 = (int) rectF14.centerX();
            int centerY3 = (int) rectF14.centerY();
            int L22 = gm.L(18.5f);
            float f35 = L22 / 2.0f;
            float f36 = centerX2 - f35;
            int round = Math.round(f36);
            float f37 = centerY3 - f35;
            int round2 = Math.round(f37);
            int round3 = Math.round(f36) + L22;
            int round4 = Math.round(f37) + L22;
            Drawable drawable2 = this.n;
            drawable2.setBounds(round, round2, round3, round4);
            float f38 = max4 * 255.0f;
            int i5 = (int) f38;
            drawable2.setAlpha(i5);
            drawable2.draw(canvas2);
            canvas2.restore();
            float d11 = this.F0.d(this.g0 == 4 ? z3 : z2);
            canvas2.save();
            canvas2.translate(0.0f, gm.L(6.0f) * f32);
            float f39 = (1.0f - (d11 * 0.04f)) * f33;
            canvas2.scale(f39, f39, rectF12.left + gm.L(18.0f), rectF12.bottom);
            b(canvas2, this.K, rectF12, max4);
            az4.a(canvas2, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, f34, this.i0, this.m0 * max4, this.l0);
            float centerY4 = rectF12.centerY();
            int L23 = (int) (rectF12.left + gm.L(12.0f));
            int L24 = (int) (centerY4 - gm.L(9.0f));
            int L25 = gm.L(18.0f) + L23;
            int L26 = gm.L(18.0f) + L24;
            Drawable drawable3 = this.r;
            drawable3.setBounds(L23, L24, L25, L26);
            drawable3.setAlpha(i5);
            drawable3.draw(canvas2);
            float L27 = (rectF12.right - gm.L(13.0f)) - gm.L(4.0f);
            float L28 = rectF12.left + gm.L(12.0f) + gm.L(18.0f) + gm.L(6.0f);
            ho hoVar4 = hoVar;
            hoVar4.C = (int) (gm.R1(0.5f, 1.0f, this.E0.d(this.A0)) * f38);
            float N = centerY4 - gm.N(1.0f);
            hoVar4.setBounds((int) L28, (int) (N - gm.L(12.0f)), (int) (L28 + gm.L(240.0f)), (int) (N + gm.L(12.0f)));
            canvas2.save();
            canvas2.clipRect(rectF12.left, rectF12.top, L27 - gm.L(8.0f), rectF12.bottom);
            hoVar4.draw(canvas2);
            canvas2.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max4));
            canvas2.save();
            canvas2.translate(L27, centerY4 - gm.N(1.9f));
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
        Runnable runnable;
        int i;
        byte b = 3;
        int i2 = 0;
        byte b2 = 1;
        if (this.G0 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                RectF rectF = this.N;
                if (!rectF.isEmpty()) {
                    RectF rectF2 = gm.P;
                    rectF2.set(rectF);
                    rectF2.inset(-gm.L(4.0f), -gm.L(4.0f));
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
                int i3 = this.g0;
                if (i3 >= 0) {
                    if (actionMasked2 == 1) {
                        this.g0 = -1;
                        invalidate();
                        if (c(motionEvent.getX(), motionEvent.getY()) == i3) {
                            byte b3 = 2;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            un3 un3Var = this.a;
                            if (i3 == 0) {
                                byte b4 = un3Var.r;
                                if (b4 == 1) {
                                    un3Var.u();
                                } else if (b4 == 3) {
                                    un3Var.c(un3Var.K);
                                }
                            } else {
                                vm3 vm3Var = wm3.c;
                                byte b5 = 4;
                                int i4 = 44;
                                if (i3 == 1) {
                                    Context context = un3Var.h;
                                    ylb ylbVar = un3Var.n;
                                    byte b6 = un3Var.r;
                                    if (b6 == 3 || b6 == 4) {
                                        xv4 xv4Var = new xv4(context, this.c, ylbVar, new mn3(un3Var, b));
                                        xv4Var.T = true;
                                        xv4Var.n = gm.L(316.0f);
                                        xv4Var.M = gm.L(220.0f);
                                        xv4Var.S = true;
                                        xv4Var.L = 0;
                                        int v0 = cmb.v0(cmb.F6, ylbVar);
                                        xv4Var.a(new su(context, v0, cmb.v0(cmb.E8, ylbVar)), 44, new nn3(un3Var, b5));
                                        ArrayList c = un3Var.H.c();
                                        c.add(vm3Var);
                                        int size = c.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj = c.get(i5);
                                            i5++;
                                            vm3 vm3Var2 = (vm3) obj;
                                            int i6 = v0;
                                            xv4Var.a(new tn3(un3Var.h, vm3Var2, i6, un3Var.f.a.R, vm3Var2 == un3Var.K && un3Var.J != null), 44, new rd3(un3Var, vm3Var2, (byte) 20));
                                            v0 = i6;
                                        }
                                        ko3 ko3Var = un3Var.w;
                                        ko3Var.G0 = xv4Var;
                                        ko3Var.addView(xv4Var, new FrameLayout.LayoutParams(-1, -1));
                                        ko3Var.invalidate();
                                        xv4Var.setFocusableInTouchMode(true);
                                        xv4Var.setOnKeyListener(new qn3(xv4Var, (byte) 1));
                                        xv4Var.requestFocus();
                                        xv4Var.R = new nn3(un3Var, (byte) 5);
                                        xv4Var.f();
                                    }
                                } else if (i3 == 3) {
                                    if (un3Var.r == 1) {
                                        un3Var.u();
                                    }
                                    d dVar = un3Var.f;
                                    ana anaVar = new ana();
                                    yv1 yv1Var = dVar.a.F3;
                                    if (yv1Var != null) {
                                        yv1Var.presentFragment(anaVar);
                                    }
                                } else {
                                    Runnable runnable2 = null;
                                    if (i3 == 4) {
                                        un3Var.w.a();
                                        Context context2 = un3Var.h;
                                        ylb ylbVar2 = un3Var.n;
                                        xv4 xv4Var2 = new xv4(context2, this.d, ylbVar2, new mn3(un3Var, b2));
                                        xv4Var2.T = true;
                                        xv4Var2.n = gm.L(316.0f);
                                        xv4Var2.M = gm.L(200.0f);
                                        xv4Var2.S = true;
                                        xv4Var2.L = 0;
                                        int v02 = cmb.v0(cmb.F6, ylbVar2);
                                        boolean x = DictationAsr.x();
                                        xv4Var2.a(new k7(un3Var.h, jb6.M0(2131744998, null), null, v02, x), 44, new bn3((byte) 1));
                                        String[] G = DictationAsr.G();
                                        int length = G.length;
                                        int i7 = 0;
                                        while (i7 < length) {
                                            String str = G[i7];
                                            boolean z = (x || !DictationAsr.z(str)) ? i2 : 1;
                                            gn3 L = DictationAsr.L(str);
                                            String[] d = L != null ? L.d(str) : new String[i2];
                                            int length2 = d.length;
                                            Context context3 = un3Var.h;
                                            if (length2 < 2) {
                                                xv4Var2.a(new k7(context3, un3.r(str), null, v02, z), i4, new rd3(un3Var, str, (byte) 19));
                                                i = i7;
                                                runnable = runnable2;
                                            } else {
                                                k7 k7Var = new k7(context3, un3.r(str), un3.O(DictationAsr.g0(L, str)), v02, z);
                                                xv4Var2.a(k7Var, 54, runnable2);
                                                runnable = runnable2;
                                                i = i7;
                                                k7Var.setOnClickListener(new pn3(un3Var, L, str, d, v02, z, xv4Var2));
                                            }
                                            i7 = i + 1;
                                            runnable2 = runnable;
                                            i2 = 0;
                                            i4 = 44;
                                        }
                                        ko3 ko3Var2 = un3Var.w;
                                        ko3Var2.G0 = xv4Var2;
                                        ko3Var2.addView(xv4Var2, new FrameLayout.LayoutParams(-1, -1));
                                        ko3Var2.invalidate();
                                        xv4Var2.setFocusableInTouchMode(true);
                                        xv4Var2.setOnKeyListener(new qn3(xv4Var2, (byte) 0));
                                        xv4Var2.requestFocus();
                                        xv4Var2.R = new nn3(un3Var, b3);
                                        xv4Var2.f();
                                    } else {
                                        String str2 = un3Var.J;
                                        if (str2 != null && un3Var.r == 3) {
                                            un3Var.J = null;
                                            un3Var.w(str2);
                                            un3Var.K = vm3Var;
                                            un3Var.w.setRevert(false);
                                            un3Var.w.d(vm3Var.a(), false);
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
        int i = cmb.c6;
        ylb ylbVar = this.b;
        this.i0 = gm.B(cmb.v0(i, ylbVar)) < 0.5f;
        int v0 = cmb.v0(cmb.F6, ylbVar);
        this.j0 = v0;
        this.k0 = v0;
        this.s.u(v0);
        this.x0.u(this.j0);
        int i2 = this.k0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(new PorterDuffColorFilter(i2, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.G.setColor(this.k0);
        this.h.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.r.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.w.setColor(this.i0 ? -651810255 : -335544321);
        this.x.setColor(this.i0 ? 654311423 : 335544320);
        this.E.setColor(cmb.p1(0.14f, this.j0));
        Paint paint = this.y;
        paint.setColor(16777216);
        paint.setShadowLayer(gm.L(8.0f), 0.0f, gm.L(2.0f), this.i0 ? 1426063360 : 570425344);
        im0 im0Var = this.I;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.J;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        im0 im0Var3 = this.K;
        if (im0Var3 != null) {
            im0Var3.updateColors();
        }
        im0 im0Var4 = this.L;
        if (im0Var4 != null) {
            im0Var4.updateColors();
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.c && childAt != this.d) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.G0) {
            this.G0 = null;
            invalidate();
        }
    }

    public void setGearGlass(im0 im0Var) {
        this.L = im0Var;
        if (im0Var != null) {
            im0Var.r(gm.L(18.0f));
        }
    }

    public void setIsland(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        if (z) {
            this.a0.e(true, 0.0f);
            this.W.e(true, 0.0f);
            this.n0 = true;
            hd hdVar = this.e;
            Objects.requireNonNull(hdVar);
            gm.d3(new gd(hdVar, (byte) 1), 160L);
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        boolean z = false;
        boolean z2 = charSequence != null;
        if (this.y0 && this.C0.c > 0.0f) {
            z = true;
        }
        if (!z) {
            this.E0.a(z2);
            this.z0 = true;
        }
        this.A0 = z2;
        if (!z2) {
            charSequence = this.w0;
        }
        this.x0.t(charSequence, z, true);
        invalidate();
    }

    public void setRevert(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        invalidate();
    }

    public void setSettings(boolean z) {
        if (this.y0 == z) {
            return;
        }
        this.y0 = z;
        if (z && this.C0.c <= 0.0f) {
            this.z0 = true;
        }
        invalidate();
    }

    public void setStopMode(boolean z) {
        if (this.r0 == z) {
            return;
        }
        this.r0 = z;
        if (!this.T) {
            this.s0.e(true, z ? 1.0f : 0.0f);
        }
        if (!z) {
            hd hdVar = this.e;
            Objects.requireNonNull(hdVar);
            gm.d3(new gd(hdVar, (byte) 1), 120L);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || drawable == this.s || drawable == this.x0 || super.verifyDrawable(drawable);
    }
}

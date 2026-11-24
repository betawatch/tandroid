// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kc2 implements gk7 {
    public int E;
    public int F;
    public final ImageReceiver G;
    public TLRPC.Chat H;
    public TLRPC.TL_forumTopic I;
    public long J;
    public AnimatorSet K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public float P;
    public long Q;
    public float R;
    public boolean S;
    public float T;
    public final View U;
    public long V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public hq1 Z;
    public int a;
    public long a0;
    public int b;
    public jq1 b0;
    public int c;
    public boolean c0;
    public float d;
    public final jx2 d0;
    public final Paint e;
    public final int[] e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final int h0;
    public final long i0;
    public final long j0;
    public final wjb k0;
    public vl l0;
    public lm4 m0;
    public final Paint n;
    public int n0;
    public int o0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public int y;

    public kc2(int i, View view, long j, int i2, int i3, long j2, wjb wjbVar) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.r = new Path();
        this.J = 0L;
        this.c0 = true;
        jx2 jx2Var = new jx2(null, true, null);
        this.d0 = jx2Var;
        this.e0 = new int[3];
        this.U = view;
        this.f0 = i;
        this.j0 = j;
        this.g0 = i2;
        this.h0 = i3;
        this.i0 = j2;
        this.Y = na7.q1(i).r2(j);
        this.k0 = wjbVar;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(gl.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        jx2Var.z = 3;
        jx2Var.H = (byte) 1;
        jx2Var.g = true;
        jx2Var.d = d("paintChatActionBackground");
        jx2Var.e = textPaint;
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setTypeface(gl.o());
        textPaint2.setTextSize(gl.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList U0;
        TLRPC.Dialog c;
        TLRPC.Dialog c2;
        na7 q1 = na7.q1(j5.a(y6c.t0).a);
        SparseArray sparseArray = q1.w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
            iArr[2] = i2;
        }
        if (i2 != 0) {
            t97 t97Var = (t97) q1.J0.get(i2);
            if (t97Var == null) {
                return null;
            }
            U0 = t97Var.k;
        } else {
            U0 = q1.U0(i);
        }
        for (int i3 = 0; i3 < U0.size(); i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(i3);
            TLRPC.Chat K0 = q1.K0(Long.valueOf(-dialog.id));
            if (K0 != null && dialog.id != j && dialog.unread_count > 0 && cf3.x(dialog) && !K0.megagroup && !q1.B2(dialog.id, false) && q1.C1(K0.restriction_reason) == null) {
                return dialog;
            }
        }
        if (!z) {
            return null;
        }
        if (i2 != 0) {
            for (int i4 = 0; i4 < q1.G0.size(); i4++) {
                int i5 = ((t97) q1.G0.get(i4)).a;
                if (i2 != i5 && (c2 = c(j, i, i5, false, iArr)) != null) {
                    if (iArr != null) {
                        iArr[0] = 1;
                    }
                    return c2;
                }
            }
        }
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            int keyAt = sparseArray.keyAt(i6);
            if (i != keyAt && (c = c(j, keyAt, 0, false, iArr)) != null) {
                if (iArr != null) {
                    iArr[0] = 1;
                }
                return c;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0547  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, jq1 jq1Var, float f, float f2) {
        float f3;
        TextPaint textPaint;
        Paint paint;
        int alpha;
        int alpha2;
        int i;
        int i2;
        TextPaint textPaint2;
        RectF rectF;
        int i3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i4;
        jx2 jx2Var;
        float f10;
        float f11;
        float f12;
        int i5;
        float f13;
        int i6;
        TextPaint textPaint3;
        float f14;
        Paint paint2;
        vl vlVar;
        ImageReceiver imageReceiver;
        float f15;
        float f16;
        RectF rectF2;
        float A;
        int v0;
        TLRPC.TL_forumTopic tL_forumTopic;
        int v02;
        Canvas canvas2 = canvas;
        wjb wjbVar = this.k0;
        if (this.b0 != jq1Var) {
            this.b0 = jq1Var;
            vl vlVar2 = this.l0;
            if (vlVar2 != null) {
                vlVar2.b(jq1Var);
            }
        }
        jx2 jx2Var2 = this.d0;
        jx2Var2.G = jq1Var;
        RectF rectF3 = jx2Var2.f;
        float L = gl.L(110.0f) * f;
        if (L < gl.L(8.0f)) {
            return;
        }
        float f17 = f < 0.2f ? 5.0f * f * f2 : f2;
        bkb.q(0.0f, jq1Var.getMeasuredHeight() - L, this.c, jq1Var.getMeasuredHeight());
        try {
            if (this.m0 != null && (tL_forumTopic = this.I) != null && tL_forumTopic.id == 1 && (v02 = bkb.v0(bkb.qd, wjbVar)) != this.n0) {
                this.n0 = v02;
                this.m0.a(v02);
            }
            if (this.l0 == null || (v0 = bkb.v0(bkb.Yc, wjbVar)) == this.o0) {
                f3 = 0.2f;
            } else {
                this.o0 = v0;
                f3 = 0.2f;
                try {
                    this.l0.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                } catch (Exception e) {
                    e = e;
                    fa4.g(e, true);
                    int v03 = bkb.v0(!bkb.g1(wjbVar) ? bkb.Ha : bkb.Yc, wjbVar);
                    textPaint = this.f;
                    textPaint.setColor(v03);
                    paint = this.e;
                    paint.setColor(v03);
                    this.h.setColor(bkb.v0(bkb.Le, wjbVar));
                    alpha = d("paintChatActionBackground").getAlpha();
                    alpha2 = bkb.g2.getAlpha();
                    int alpha3 = textPaint.getAlpha();
                    int alpha4 = paint.getAlpha();
                    bkb.g2.setAlpha((int) (alpha2 * f17));
                    int i7 = (int) (alpha * f17);
                    d("paintChatActionBackground").setAlpha(i7);
                    i = (int) (alpha3 * f17);
                    textPaint.setAlpha(i);
                    if (f >= 1.0f) {
                    }
                    i2 = i;
                    textPaint2 = textPaint;
                    rectF = rectF3;
                    i3 = alpha2;
                    boolean z = this.N;
                    if (f != 1.0f) {
                    }
                    f4 = this.c / 2.0f;
                    f5 = this.M * (-gl.L(4.0f));
                    if (!this.S) {
                    }
                    float f18 = f6 / 2.0f;
                    float max = Math.max(0.0f, Math.min(this.d, (f18 - (gl.L(16.0f) * f)) - gl.L(4.0f)));
                    float max2 = (1.0f - this.L) * ((Math.max(0.0f, Math.min(this.d * f, f18 - (gl.L(8.0f) * f))) * 2.0f) - gl.M(16.0f));
                    float L2 = gl.L(56.0f);
                    f7 = this.L;
                    float f19 = max2 + (L2 * f7);
                    if (f7 >= 1.0f) {
                    }
                    float f20 = -f6;
                    float f21 = f6;
                    float L3 = (this.L * (gl.L(56.0f) + f20)) + ((1.0f - this.L) * (-gl.L(8.0f)));
                    RectF rectF4 = gl.P;
                    TextPaint textPaint4 = textPaint2;
                    rectF4.set(f4 - max, f20, f4 + max, L3);
                    if (this.L > 0.0f) {
                    }
                    f8 = 1.0f;
                    if (this.X) {
                    }
                    float A2 = tb4.A(1.0f, f, gl.L(8.0f), f9 + gl.L(24.0f)) - (gl.L(36.0f) * this.L);
                    canvas2.save();
                    rectF4.inset(gl.L(1.0f), gl.L(1.0f));
                    canvas2.clipRect(rectF4);
                    f12 = this.L;
                    if (f12 > 0.0f) {
                    }
                    canvas2.save();
                    float L4 = (gl.L(24.0f) * f) / gl.N(24.0f);
                    canvas2.scale(L4, L4, f4, A2 - gl.L(20.0f));
                    canvas2.translate(f4 - gl.M(12.0f), A2 - gl.L(12.0f));
                    i5 = i2;
                    f13 = f5;
                    i6 = alpha;
                    textPaint3 = textPaint4;
                    f14 = f21;
                    canvas2.drawLine(gl.N(12.5f), gl.N(4.0f), gl.N(12.5f), gl.N(22.0f), paint);
                    canvas.drawLine(gl.N(3.5f), gl.N(12.0f), gl.N(12.5f), gl.N(3.5f), paint);
                    canvas2 = canvas;
                    canvas2.drawLine(gl.N(21.5f), gl.N(12.0f), gl.N(12.5f), gl.N(3.5f), paint);
                    canvas2.restore();
                    if (this.S) {
                    }
                    canvas2.restore();
                    if (this.s != null) {
                        d("paintChatActionBackground").setAlpha(i4);
                        textPaint3.setAlpha(i5);
                        float L5 = (((1.0f - this.L) * gl.L(20.0f)) - (gl.L(36.0f) * this.L)) + f13;
                        RectF rectF5 = gl.P;
                        float f22 = (r4 - this.y) / 2.0f;
                        rectF5.set(f22, L5, this.c - f22, this.s.getHeight() + L5);
                        rectF5.inset(-gl.L(8.0f), -gl.L(4.0f));
                        canvas2.drawRoundRect(rectF5, gl.L(15.0f), gl.L(15.0f), d("paintChatActionBackground"));
                        if (wjbVar == null ? wjbVar.g() : bkb.b1()) {
                        }
                        canvas2.save();
                        canvas2.translate((this.c - this.y) / 2.0f, L5);
                        this.s.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!this.S) {
                        float i8 = ir2.i((-f14) + gl.L(4.0f), this.L, (1.0f - this.L) * (((-gl.L(8.0f)) - (gl.M(8.0f) * f)) - f10), f13);
                        vlVar = this.l0;
                        if (vlVar != null) {
                        }
                        ImageReceiver imageReceiver2 = this.G;
                        imageReceiver = imageReceiver2;
                        imageReceiver.setAlpha(f11);
                        float f23 = f10 / 2.0f;
                        imageReceiver.q0((int) f23);
                        float f24 = f10;
                        imageReceiver.i0(f4 - f23, i8, f24, f24);
                        if (this.Y) {
                            ((o06) ((fm2) imageReceiver.t()).b).i = f;
                        }
                        if (this.L > 0.0f) {
                        }
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(1.0f);
                    }
                    d("paintChatActionBackground").setAlpha(i6);
                    bkb.g2.setAlpha(i3);
                    textPaint3.setAlpha(alpha3);
                    paint2.setAlpha(alpha4);
                }
            }
        } catch (Exception e2) {
            e = e2;
            f3 = 0.2f;
        }
        int v032 = bkb.v0(!bkb.g1(wjbVar) ? bkb.Ha : bkb.Yc, wjbVar);
        textPaint = this.f;
        textPaint.setColor(v032);
        paint = this.e;
        paint.setColor(v032);
        this.h.setColor(bkb.v0(bkb.Le, wjbVar));
        alpha = d("paintChatActionBackground").getAlpha();
        alpha2 = bkb.g2.getAlpha();
        int alpha32 = textPaint.getAlpha();
        int alpha42 = paint.getAlpha();
        bkb.g2.setAlpha((int) (alpha2 * f17));
        int i72 = (int) (alpha * f17);
        d("paintChatActionBackground").setAlpha(i72);
        i = (int) (alpha32 * f17);
        textPaint.setAlpha(i);
        if ((f >= 1.0f || this.R >= 1.0f) && (f >= 1.0f || this.R != 1.0f)) {
            i2 = i;
            textPaint2 = textPaint;
            rectF = rectF3;
            i3 = alpha2;
        } else {
            i2 = i;
            textPaint2 = textPaint;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i3 = alpha2;
            if (currentTimeMillis - this.Q > 100) {
                try {
                    jq1Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.Q = currentTimeMillis;
            }
            this.R = f;
        }
        boolean z2 = this.N;
        if (f != 1.0f) {
            if (!z2) {
                this.N = true;
                this.O = true;
                e(true, jq1Var);
                this.V = System.currentTimeMillis();
            }
        } else if (z2) {
            this.N = false;
            e(false, jq1Var);
        }
        f4 = this.c / 2.0f;
        f5 = this.M * (-gl.L(4.0f));
        f6 = !this.S ? L - f5 : L;
        float f182 = f6 / 2.0f;
        float max3 = Math.max(0.0f, Math.min(this.d, (f182 - (gl.L(16.0f) * f)) - gl.L(4.0f)));
        float max22 = (1.0f - this.L) * ((Math.max(0.0f, Math.min(this.d * f, f182 - (gl.L(8.0f) * f))) * 2.0f) - gl.M(16.0f));
        float L22 = gl.L(56.0f);
        f7 = this.L;
        float f192 = max22 + (L22 * f7);
        if (f7 >= 1.0f || this.S) {
            float f202 = -f6;
            float f212 = f6;
            float L32 = (this.L * (gl.L(56.0f) + f202)) + ((1.0f - this.L) * (-gl.L(8.0f)));
            RectF rectF42 = gl.P;
            TextPaint textPaint42 = textPaint2;
            rectF42.set(f4 - max3, f202, f4 + max3, L32);
            if (this.L > 0.0f || this.S) {
                f8 = 1.0f;
            } else {
                float L6 = gl.L(16.0f) * this.L;
                rectF42.inset(L6, L6);
                f8 = 1.0f - this.L;
            }
            if (this.X) {
                f9 = f202;
                i4 = i72;
                jx2Var = jx2Var2;
                f10 = f192;
                f11 = f17;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f8));
                float f25 = this.d;
                canvas2.drawRoundRect(rectF42, f25, f25, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (wjbVar != null ? wjbVar.g() : bkb.b1()) {
                    int alpha6 = bkb.g2.getAlpha();
                    bkb.g2.setAlpha((int) (alpha6 * f8));
                    float f26 = this.d;
                    canvas2.drawRoundRect(rectF42, f26, f26, bkb.g2);
                    bkb.g2.setAlpha(alpha6);
                }
            } else {
                Path path = this.r;
                path.reset();
                float width = rectF42.width() * f3;
                float width2 = rectF42.width() * 0.1f;
                float width3 = rectF42.width() * 0.03f;
                f9 = f202;
                float f27 = width2 / 2.0f;
                float height = rectF42.height() - width2;
                jx2Var = jx2Var2;
                f10 = f192;
                path.moveTo(rectF42.right, rectF42.top + width + width2);
                float f28 = -width;
                path.rQuadTo(0.0f, f28, f28, f28);
                float f29 = width * 2.0f;
                float f30 = f27 * 2.0f;
                f11 = f17;
                path.rLineTo((((-(rectF42.width() - f29)) / 2.0f) + f30) - width3, 0.0f);
                float f31 = -f27;
                float f32 = f31 / 2.0f;
                float f33 = f31 * 2.0f;
                i4 = i72;
                float f34 = (-width2) / 2.0f;
                path.rQuadTo(f32, 0.0f, f33, f34);
                path.rQuadTo(f32, f34, f33, f34);
                path.rLineTo(((-(rectF42.width() - f29)) / 2.0f) + f30 + width3, 0.0f);
                path.rQuadTo(f28, 0.0f, f28, width);
                path.rLineTo(0.0f, (height + width2) - f29);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF42.width() - f29, 0.0f);
                path.rQuadTo(width, 0.0f, width, f28);
                path.rLineTo(0.0f, -(height - f29));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (wjbVar != null ? wjbVar.g() : bkb.b1()) {
                    canvas2.drawPath(path, bkb.g2);
                }
            }
            float A22 = tb4.A(1.0f, f, gl.L(8.0f), f9 + gl.L(24.0f)) - (gl.L(36.0f) * this.L);
            canvas2.save();
            rectF42.inset(gl.L(1.0f), gl.L(1.0f));
            canvas2.clipRect(rectF42);
            f12 = this.L;
            if (f12 > 0.0f) {
                paint.setAlpha((int) ((1.0f - f12) * 255.0f));
            }
            canvas2.save();
            float L42 = (gl.L(24.0f) * f) / gl.N(24.0f);
            canvas2.scale(L42, L42, f4, A22 - gl.L(20.0f));
            canvas2.translate(f4 - gl.M(12.0f), A22 - gl.L(12.0f));
            i5 = i2;
            f13 = f5;
            i6 = alpha;
            textPaint3 = textPaint42;
            f14 = f212;
            canvas2.drawLine(gl.N(12.5f), gl.N(4.0f), gl.N(12.5f), gl.N(22.0f), paint);
            canvas.drawLine(gl.N(3.5f), gl.N(12.0f), gl.N(12.5f), gl.N(3.5f), paint);
            canvas2 = canvas;
            canvas2.drawLine(gl.N(21.5f), gl.N(12.0f), gl.N(12.5f), gl.N(3.5f), paint);
            canvas2.restore();
            if (this.S) {
                paint2 = paint;
            } else {
                float i9 = ir2.i(f9 - gl.L(2.0f), this.L, (1.0f - this.L) * (((-gl.L(8.0f)) - (gl.M(8.0f) * f)) - f10), f13);
                paint.setAlpha(alpha42);
                canvas2.save();
                canvas2.scale(f, f, f4, gl.L(28.0f) + i9);
                float L7 = i9 + gl.L(28.0f);
                if (this.O) {
                    float f35 = this.P;
                    if (f35 < 1.0f) {
                        f35 += 0.07272727f;
                        this.P = f35;
                        if (f35 > 1.0f) {
                            this.P = 1.0f;
                            f35 = 1.0f;
                        }
                    }
                    float f36 = f35 > 0.5f ? 1.0f : f35 / 0.5f;
                    float f37 = f35 < 0.5f ? 0.0f : (f35 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF42);
                    canvas2.translate(f4 - gl.L(24.0f), L7 - gl.L(24.0f));
                    float L8 = gl.L(16.0f);
                    float L9 = gl.L(26.0f);
                    float L10 = gl.L(22.0f);
                    float L11 = gl.L(32.0f);
                    float L12 = gl.L(32.0f);
                    float L13 = gl.L(20.0f);
                    float f38 = 1.0f - f36;
                    canvas.drawLine(L8, L9, (L10 * f36) + (L8 * f38), (f36 * L11) + (f38 * L9), paint);
                    if (f37 > 0.0f) {
                        float f39 = 1.0f - f37;
                        float f40 = (L12 * f37) + (L10 * f39);
                        float f41 = (L13 * f37) + (f39 * L11);
                        canvas2 = canvas;
                        canvas2.drawLine(L10, L11, f40, f41, paint);
                    } else {
                        canvas2 = canvas;
                    }
                    paint2 = paint;
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i4 = i72;
            jx2Var = jx2Var2;
            f10 = f192;
            f11 = f17;
            textPaint3 = textPaint2;
            i5 = i2;
            f13 = f5;
            f14 = f6;
            i6 = alpha;
            paint2 = paint;
        }
        if (this.s != null && this.L > 0.0f) {
            d("paintChatActionBackground").setAlpha(i4);
            textPaint3.setAlpha(i5);
            float L52 = (((1.0f - this.L) * gl.L(20.0f)) - (gl.L(36.0f) * this.L)) + f13;
            RectF rectF52 = gl.P;
            float f222 = (r4 - this.y) / 2.0f;
            rectF52.set(f222, L52, this.c - f222, this.s.getHeight() + L52);
            rectF52.inset(-gl.L(8.0f), -gl.L(4.0f));
            canvas2.drawRoundRect(rectF52, gl.L(15.0f), gl.L(15.0f), d("paintChatActionBackground"));
            if (wjbVar == null ? wjbVar.g() : bkb.b1()) {
                canvas2.drawRoundRect(rectF52, gl.L(15.0f), gl.L(15.0f), bkb.g2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.y) / 2.0f, L52);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.S && f10 > 0.0f) {
            float i82 = ir2.i((-f14) + gl.L(4.0f), this.L, (1.0f - this.L) * (((-gl.L(8.0f)) - (gl.M(8.0f) * f)) - f10), f13);
            vlVar = this.l0;
            if (vlVar != null || (imageReceiver2 = vlVar.k) == null) {
                ImageReceiver imageReceiver22 = this.G;
            }
            imageReceiver = imageReceiver22;
            imageReceiver.setAlpha(f11);
            float f232 = f10 / 2.0f;
            imageReceiver.q0((int) f232);
            float f242 = f10;
            imageReceiver.i0(f4 - f232, i82, f242, f242);
            if (this.Y && imageReceiver.t() != null && (imageReceiver.t() instanceof fm2) && (((fm2) imageReceiver.t()).b instanceof o06)) {
                ((o06) ((fm2) imageReceiver.t()).b).i = f;
            }
            if (this.L > 0.0f || !this.c0) {
                imageReceiver.h(canvas2, null);
            } else {
                float f42 = imageReceiver.L0;
                float f43 = imageReceiver.M0;
                canvas2.saveLayerAlpha(f42, f43, imageReceiver.N0 + f42, imageReceiver.O0 + f43, kk7.d4, 31);
                imageReceiver.h(canvas2, null);
                float f44 = this.L;
                jx2 jx2Var3 = jx2Var;
                jx2Var3.e(jx2Var3.s);
                canvas2.scale(f44, f44, (jx2Var3.s / 2.0f) + jx2Var3.A + gl.L(12.0f) + f4, (i82 - gl.L(6.0f)) + gl.L(14.0f));
                canvas2.translate(gl.L(12.0f) + f4, i82 - gl.L(6.0f));
                float f45 = jx2Var3.l;
                if (f45 != 1.0f) {
                    int i10 = jx2Var3.c;
                    f15 = 6.0f;
                    if (i10 == 0 || i10 == 1) {
                        f16 = 14.0f;
                        rectF2 = rectF;
                        jx2Var3.e(jx2Var3.s);
                        float L14 = (jx2Var3.x - gl.L(23.0f)) / 2.0f;
                        float f46 = jx2Var3.B;
                        rectF2.set(f46, L14, jx2Var3.s + f46 + gl.L(11.0f), gl.L(23.0f) + L14);
                    } else {
                        float f47 = f45 * 2.0f;
                        if (f47 > 1.0f) {
                            f47 = 1.0f;
                        }
                        float L15 = (jx2Var3.x - gl.L(23.0f)) / 2.0f;
                        int i11 = jx2Var3.s;
                        int i12 = jx2Var3.r;
                        if (i11 == i12) {
                            A = i11;
                            f16 = 14.0f;
                        } else {
                            f16 = 14.0f;
                            A = tb4.A(1.0f, f47, i12, i11 * f47);
                        }
                        jx2Var3.e(A);
                        float f48 = jx2Var3.B;
                        rectF2 = rectF;
                        rectF2.set(f48, L15, A + f48 + gl.L(11.0f), gl.L(23.0f) + L15);
                    }
                } else {
                    f15 = 6.0f;
                    f16 = 14.0f;
                    rectF2 = rectF;
                    jx2Var3.e(jx2Var3.s);
                    float L16 = (jx2Var3.x - gl.L(23.0f)) / 2.0f;
                    float f49 = jx2Var3.B;
                    rectF2.set(f49, L16, jx2Var3.s + f49 + gl.L(11.0f), gl.L(23.0f) + L16);
                }
                rectF2.inset(-gl.L(2.0f), -gl.L(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f50 = this.L;
                jx2Var3.e(jx2Var3.s);
                canvas2.scale(f50, f50, (jx2Var3.s / 2.0f) + jx2Var3.A + gl.L(12.0f) + f4, (i82 - gl.L(f15)) + gl.L(f16));
                canvas2.translate(f4 + gl.L(12.0f), i82 - gl.L(f15));
                jx2Var3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i6);
        bkb.g2.setAlpha(i3);
        textPaint3.setAlpha(alpha32);
        paint2.setAlpha(alpha42);
    }

    public final void b(Canvas canvas, int i, int i2) {
        int v0 = bkb.v0(bkb.Nl, this.k0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v0);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.T));
        if (this.w != null) {
            float f = this.L;
            if (f < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f) * alpha2 * this.T));
                float height = ((((i2 - i) - this.w.getHeight()) / 2.0f) + i) - (gl.L(10.0f) * this.L);
                canvas.save();
                canvas.translate((this.c - this.E) / 2.0f, height);
                this.w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.x != null) {
            float f2 = this.L;
            if (f2 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f2 * this.T));
                float L = ((1.0f - this.L) * gl.L(10.0f)) + (((i2 - i) - this.x.getHeight()) / 2.0f) + i;
                canvas.save();
                canvas.translate((this.c - this.F) / 2.0f, L);
                this.x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        wjb wjbVar = this.k0;
        Paint d = wjbVar != null ? wjbVar.d(str) : null;
        return d != null ? d : bkb.T0(str);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.a0 == 0 || (dialog = (TLRPC.Dialog) na7.q1(this.f0).R.f(this.a0)) == null) {
            return;
        }
        int i3 = dialog.unread_count;
        this.d0.c(i3, true);
        this.c0 = i3 > 0;
        jq1 jq1Var = this.b0;
        if (jq1Var != null) {
            jq1Var.invalidate();
        }
    }

    public final void e(boolean z, final jq1 jq1Var) {
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.K.cancel();
        }
        float f = this.L;
        final byte b = 1;
        final byte b2 = 0;
        final byte b3 = 2;
        if (!z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            final byte b4 = 4;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ic2
                public final /* synthetic */ kc2 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b5 = b4;
                    jq1 jq1Var2 = jq1Var;
                    kc2 kc2Var = this.b;
                    switch (b5) {
                        case 0:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            kc2Var.U.invalidate();
                            break;
                        case 1:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            break;
                        case 2:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            break;
                        case 3:
                            kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jq1Var2.invalidate();
                            break;
                        default:
                            kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kc2Var.U.invalidate();
                            jq1Var2.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(s33.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ic2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b2;
                jq1 jq1Var2 = jq1Var;
                kc2 kc2Var = this.b;
                switch (b5) {
                    case 0:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        kc2Var.U.invalidate();
                        break;
                    case 1:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 2:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 3:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    default:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kc2Var.U.invalidate();
                        jq1Var2.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(s33.h);
        ofFloat2.setDuration(250L);
        this.M = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ic2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b;
                jq1 jq1Var2 = jq1Var;
                kc2 kc2Var = this.b;
                switch (b5) {
                    case 0:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        kc2Var.U.invalidate();
                        break;
                    case 1:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 2:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 3:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    default:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kc2Var.U.invalidate();
                        jq1Var2.invalidate();
                        break;
                }
            }
        });
        s33 s33Var = s33.j;
        ofFloat3.setInterpolator(s33Var);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ic2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b3;
                jq1 jq1Var2 = jq1Var;
                kc2 kc2Var = this.b;
                switch (b5) {
                    case 0:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        kc2Var.U.invalidate();
                        break;
                    case 1:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 2:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 3:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    default:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kc2Var.U.invalidate();
                        jq1Var2.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(s33Var);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final byte b5 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ic2
            public final /* synthetic */ kc2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b52 = b5;
                jq1 jq1Var2 = jq1Var;
                kc2 kc2Var = this.b;
                switch (b52) {
                    case 0:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        kc2Var.U.invalidate();
                        break;
                    case 1:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 2:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    case 3:
                        kc2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jq1Var2.invalidate();
                        break;
                    default:
                        kc2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kc2Var.U.invalidate();
                        jq1Var2.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(s33Var);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.K = animatorSet3;
        animatorSet3.addListener(new u5(this, jq1Var, (byte) 15));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ofFloat3, ofFloat4, ofFloat5);
        this.K.playTogether(ofFloat2, animatorSet4);
        this.K.start();
    }

    public final void f() {
        this.W = false;
        this.I = null;
        TLRPC.Dialog c = c(this.j0, this.g0, this.h0, true, this.e0);
        if (c == null) {
            this.H = null;
            this.X = false;
            this.S = true;
            return;
        }
        this.a0 = c.id;
        int[] iArr = this.e0;
        this.X = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.S = false;
        int i = this.f0;
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-c.id));
        this.H = K0;
        if (K0 == null) {
            this.H = na7.q1(i).K0(Long.valueOf(c.id));
        }
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.p(this.H);
        this.G.d0(gl5.a(1, this.H), "50_50", pb0Var, null, y6c.h(0).f(), 0);
        na7.q1(i).p0(c.id, 0, null);
        int i2 = c.unread_count;
        this.d0.c(i2, false);
        this.c0 = i2 > 0;
    }

    public final void g(TLRPC.Chat chat) {
        if (chat == null) {
            f();
            return;
        }
        this.a0 = -chat.id;
        int[] iArr = this.e0;
        this.X = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.S = false;
        this.H = chat;
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.p(this.H);
        this.G.d0(gl5.a(1, this.H), "50_50", pb0Var, null, y6c.h(0).f(), 0);
        int i = this.f0;
        na7.q1(i).p0(-chat.id, 0, null);
        TLRPC.Dialog Q0 = na7.q1(i).Q0(-chat.id);
        int i2 = Q0 == null ? 0 : Q0.unread_count;
        this.d0.c(i2, false);
        this.c0 = i2 > 0;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        vl vlVar;
        jq1 jq1Var;
        jq1 jq1Var2;
        vl vlVar2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.W = false;
        this.X = false;
        this.H = null;
        this.a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        long j = -this.j0;
        int i = this.f0;
        ArrayList l = na7.q1(i).g4.l(j);
        if (l == null || l.size() <= 1) {
            tL_forumTopic = null;
        } else {
            tL_forumTopic = null;
            for (int i2 = 0; i2 < l.size(); i2++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l.get(i2);
                if (tL_forumTopic2.id != this.i0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        }
        if (tL_forumTopic == null) {
            this.I = null;
            this.S = true;
            return;
        }
        this.S = false;
        this.I = tL_forumTopic;
        int i3 = tL_forumTopic.id;
        wjb wjbVar = this.k0;
        if (i3 == 1) {
            jq1 jq1Var3 = this.b0;
            if (jq1Var3 != null && (vlVar2 = this.l0) != null) {
                vlVar2.o(jq1Var3);
            }
            this.l0 = null;
            Context context = this.U.getContext();
            int i4 = bkb.qd;
            lm4 d = mm4.d(context, 1.0f, bkb.v0(i4, wjbVar), true);
            this.m0 = d != null ? d : null;
            this.n0 = bkb.v0(i4, wjbVar);
            imageReceiver.g0(d);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            vl vlVar3 = this.l0;
            if (vlVar3 == null || vlVar3.h() != tL_forumTopic.icon_emoji_id) {
                vl vlVar4 = this.l0;
                if (vlVar4 != null && (jq1Var = this.b0) != null) {
                    vlVar4.o(jq1Var);
                }
                vl vlVar5 = new vl(22, i, tL_forumTopic.icon_emoji_id);
                this.l0 = vlVar5;
                int v0 = bkb.v0(bkb.Yc, wjbVar);
                this.o0 = v0;
                vlVar5.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            vl vlVar6 = this.l0;
            if (vlVar6 != null && (jq1Var2 = this.b0) != null) {
                vlVar6.b(jq1Var2);
            }
            imageReceiver.g0(null);
        } else {
            jq1 jq1Var4 = this.b0;
            if (jq1Var4 != null && (vlVar = this.l0) != null) {
                vlVar.o(jq1Var4);
            }
            this.l0 = null;
            imageReceiver.g0(mm4.f(tL_forumTopic));
        }
        int i5 = tL_forumTopic.unread_count;
        this.d0.c(i5, false);
        this.c0 = i5 > 0;
    }
}

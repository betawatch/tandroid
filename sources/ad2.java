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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ad2 implements fn7 {
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
    public go1 Z;
    public int a;
    public long a0;
    public int b;
    public wq1 b0;
    public int c;
    public boolean c0;
    public float d;
    public final dy2 d0;
    public final Paint e;
    public final int[] e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final int h0;
    public final long i0;
    public final long j0;
    public final vnb k0;
    public wl l0;
    public qo4 m0;
    public final Paint n;
    public int n0;
    public int o0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public int y;

    public ad2(int i, View view, long j, int i2, int i3, long j2, vnb vnbVar) {
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
        dy2 dy2Var = new dy2(null, true, null);
        this.d0 = dy2Var;
        this.e0 = new int[3];
        this.U = view;
        this.f0 = i;
        this.j0 = j;
        this.g0 = i2;
        this.h0 = i3;
        this.i0 = j2;
        this.Y = uc7.s1(i).v2(j);
        this.k0 = vnbVar;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(hl.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        dy2Var.z = 3;
        dy2Var.H = (byte) 1;
        dy2Var.g = true;
        dy2Var.d = d("paintChatActionBackground");
        dy2Var.e = textPaint;
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList W0;
        TLRPC.Dialog c;
        TLRPC.Dialog c2;
        uc7 s1 = uc7.s1(k5.a(yac.t0).a);
        SparseArray sparseArray = s1.w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
            iArr[2] = i2;
        }
        if (i2 != 0) {
            ac7 ac7Var = (ac7) s1.J0.get(i2);
            if (ac7Var == null) {
                return null;
            }
            W0 = ac7Var.k;
        } else {
            W0 = s1.W0(i);
        }
        for (int i3 = 0; i3 < W0.size(); i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i3);
            TLRPC.Chat M0 = s1.M0(Long.valueOf(-dialog.id));
            if (M0 != null && dialog.id != j && dialog.unread_count > 0 && wf3.x(dialog) && !M0.megagroup && !s1.G2(dialog.id, false) && s1.E1(M0.restriction_reason) == null) {
                return dialog;
            }
        }
        if (!z) {
            return null;
        }
        if (i2 != 0) {
            for (int i4 = 0; i4 < s1.G0.size(); i4++) {
                int i5 = ((ac7) s1.G0.get(i4)).a;
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
    public final void a(Canvas canvas, wq1 wq1Var, float f, float f2) {
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
        dy2 dy2Var;
        float f10;
        float f11;
        float f12;
        int i5;
        float f13;
        int i6;
        TextPaint textPaint3;
        float f14;
        Paint paint2;
        wl wlVar;
        ImageReceiver imageReceiver;
        float f15;
        float f16;
        RectF rectF2;
        float A;
        int v0;
        TLRPC.TL_forumTopic tL_forumTopic;
        int v02;
        Canvas canvas2 = canvas;
        vnb vnbVar = this.k0;
        if (this.b0 != wq1Var) {
            this.b0 = wq1Var;
            wl wlVar2 = this.l0;
            if (wlVar2 != null) {
                wlVar2.b(wq1Var);
            }
        }
        dy2 dy2Var2 = this.d0;
        dy2Var2.G = wq1Var;
        RectF rectF3 = dy2Var2.f;
        float L = hl.L(110.0f) * f;
        if (L < hl.L(8.0f)) {
            return;
        }
        float f17 = f < 0.2f ? 5.0f * f * f2 : f2;
        aob.q(0.0f, wq1Var.getMeasuredHeight() - L, this.c, wq1Var.getMeasuredHeight());
        try {
            if (this.m0 != null && (tL_forumTopic = this.I) != null && tL_forumTopic.id == 1 && (v02 = aob.v0(aob.rd, vnbVar)) != this.n0) {
                this.n0 = v02;
                this.m0.a(v02);
            }
            if (this.l0 == null || (v0 = aob.v0(aob.Zc, vnbVar)) == this.o0) {
                f3 = 0.2f;
            } else {
                this.o0 = v0;
                f3 = 0.2f;
                try {
                    this.l0.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                } catch (Exception e) {
                    e = e;
                    cc4.g(e, true);
                    int v03 = aob.v0(!aob.g1(vnbVar) ? aob.Ia : aob.Zc, vnbVar);
                    textPaint = this.f;
                    textPaint.setColor(v03);
                    paint = this.e;
                    paint.setColor(v03);
                    this.h.setColor(aob.v0(aob.Me, vnbVar));
                    alpha = d("paintChatActionBackground").getAlpha();
                    alpha2 = aob.h2.getAlpha();
                    int alpha3 = textPaint.getAlpha();
                    int alpha4 = paint.getAlpha();
                    aob.h2.setAlpha((int) (alpha2 * f17));
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
                    f5 = this.M * (-hl.L(4.0f));
                    if (!this.S) {
                    }
                    float f18 = f6 / 2.0f;
                    float max = Math.max(0.0f, Math.min(this.d, (f18 - (hl.L(16.0f) * f)) - hl.L(4.0f)));
                    float max2 = (1.0f - this.L) * ((Math.max(0.0f, Math.min(this.d * f, f18 - (hl.L(8.0f) * f))) * 2.0f) - hl.M(16.0f));
                    float L2 = hl.L(56.0f);
                    f7 = this.L;
                    float f19 = max2 + (L2 * f7);
                    if (f7 >= 1.0f) {
                    }
                    float f20 = -f6;
                    float f21 = f6;
                    float L3 = (this.L * (hl.L(56.0f) + f20)) + ((1.0f - this.L) * (-hl.L(8.0f)));
                    RectF rectF4 = hl.P;
                    TextPaint textPaint4 = textPaint2;
                    rectF4.set(f4 - max, f20, f4 + max, L3);
                    if (this.L > 0.0f) {
                    }
                    f8 = 1.0f;
                    if (this.X) {
                    }
                    float A2 = qd4.A(1.0f, f, hl.L(8.0f), f9 + hl.L(24.0f)) - (hl.L(36.0f) * this.L);
                    canvas2.save();
                    rectF4.inset(hl.L(1.0f), hl.L(1.0f));
                    canvas2.clipRect(rectF4);
                    f12 = this.L;
                    if (f12 > 0.0f) {
                    }
                    canvas2.save();
                    float L4 = (hl.L(24.0f) * f) / hl.N(24.0f);
                    canvas2.scale(L4, L4, f4, A2 - hl.L(20.0f));
                    canvas2.translate(f4 - hl.M(12.0f), A2 - hl.L(12.0f));
                    i5 = i2;
                    f13 = f5;
                    i6 = alpha;
                    textPaint3 = textPaint4;
                    f14 = f21;
                    canvas2.drawLine(hl.N(12.5f), hl.N(4.0f), hl.N(12.5f), hl.N(22.0f), paint);
                    canvas.drawLine(hl.N(3.5f), hl.N(12.0f), hl.N(12.5f), hl.N(3.5f), paint);
                    canvas2 = canvas;
                    canvas2.drawLine(hl.N(21.5f), hl.N(12.0f), hl.N(12.5f), hl.N(3.5f), paint);
                    canvas2.restore();
                    if (this.S) {
                    }
                    canvas2.restore();
                    if (this.s != null) {
                        d("paintChatActionBackground").setAlpha(i4);
                        textPaint3.setAlpha(i5);
                        float L5 = (((1.0f - this.L) * hl.L(20.0f)) - (hl.L(36.0f) * this.L)) + f13;
                        RectF rectF5 = hl.P;
                        float f22 = (r4 - this.y) / 2.0f;
                        rectF5.set(f22, L5, this.c - f22, this.s.getHeight() + L5);
                        rectF5.inset(-hl.L(8.0f), -hl.L(4.0f));
                        canvas2.drawRoundRect(rectF5, hl.L(15.0f), hl.L(15.0f), d("paintChatActionBackground"));
                        if (vnbVar == null ? vnbVar.g() : aob.b1()) {
                        }
                        canvas2.save();
                        canvas2.translate((this.c - this.y) / 2.0f, L5);
                        this.s.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!this.S) {
                        float i8 = bs2.i((-f14) + hl.L(4.0f), this.L, (1.0f - this.L) * (((-hl.L(8.0f)) - (hl.M(8.0f) * f)) - f10), f13);
                        wlVar = this.l0;
                        if (wlVar != null) {
                        }
                        ImageReceiver imageReceiver2 = this.G;
                        imageReceiver = imageReceiver2;
                        imageReceiver.setAlpha(f11);
                        float f23 = f10 / 2.0f;
                        imageReceiver.q0((int) f23);
                        float f24 = f10;
                        imageReceiver.i0(f4 - f23, i8, f24, f24);
                        if (this.Y) {
                            ((s26) ((zm2) imageReceiver.t()).b).i = f;
                        }
                        if (this.L > 0.0f) {
                        }
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(1.0f);
                    }
                    d("paintChatActionBackground").setAlpha(i6);
                    aob.h2.setAlpha(i3);
                    textPaint3.setAlpha(alpha3);
                    paint2.setAlpha(alpha4);
                }
            }
        } catch (Exception e2) {
            e = e2;
            f3 = 0.2f;
        }
        int v032 = aob.v0(!aob.g1(vnbVar) ? aob.Ia : aob.Zc, vnbVar);
        textPaint = this.f;
        textPaint.setColor(v032);
        paint = this.e;
        paint.setColor(v032);
        this.h.setColor(aob.v0(aob.Me, vnbVar));
        alpha = d("paintChatActionBackground").getAlpha();
        alpha2 = aob.h2.getAlpha();
        int alpha32 = textPaint.getAlpha();
        int alpha42 = paint.getAlpha();
        aob.h2.setAlpha((int) (alpha2 * f17));
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
                    wq1Var.performHapticFeedback(3, 2);
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
                e(true, wq1Var);
                this.V = System.currentTimeMillis();
            }
        } else if (z2) {
            this.N = false;
            e(false, wq1Var);
        }
        f4 = this.c / 2.0f;
        f5 = this.M * (-hl.L(4.0f));
        f6 = !this.S ? L - f5 : L;
        float f182 = f6 / 2.0f;
        float max3 = Math.max(0.0f, Math.min(this.d, (f182 - (hl.L(16.0f) * f)) - hl.L(4.0f)));
        float max22 = (1.0f - this.L) * ((Math.max(0.0f, Math.min(this.d * f, f182 - (hl.L(8.0f) * f))) * 2.0f) - hl.M(16.0f));
        float L22 = hl.L(56.0f);
        f7 = this.L;
        float f192 = max22 + (L22 * f7);
        if (f7 >= 1.0f || this.S) {
            float f202 = -f6;
            float f212 = f6;
            float L32 = (this.L * (hl.L(56.0f) + f202)) + ((1.0f - this.L) * (-hl.L(8.0f)));
            RectF rectF42 = hl.P;
            TextPaint textPaint42 = textPaint2;
            rectF42.set(f4 - max3, f202, f4 + max3, L32);
            if (this.L > 0.0f || this.S) {
                f8 = 1.0f;
            } else {
                float L6 = hl.L(16.0f) * this.L;
                rectF42.inset(L6, L6);
                f8 = 1.0f - this.L;
            }
            if (this.X) {
                f9 = f202;
                i4 = i72;
                dy2Var = dy2Var2;
                f10 = f192;
                f11 = f17;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f8));
                float f25 = this.d;
                canvas2.drawRoundRect(rectF42, f25, f25, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (vnbVar != null ? vnbVar.g() : aob.b1()) {
                    int alpha6 = aob.h2.getAlpha();
                    aob.h2.setAlpha((int) (alpha6 * f8));
                    float f26 = this.d;
                    canvas2.drawRoundRect(rectF42, f26, f26, aob.h2);
                    aob.h2.setAlpha(alpha6);
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
                dy2Var = dy2Var2;
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
                if (vnbVar != null ? vnbVar.g() : aob.b1()) {
                    canvas2.drawPath(path, aob.h2);
                }
            }
            float A22 = qd4.A(1.0f, f, hl.L(8.0f), f9 + hl.L(24.0f)) - (hl.L(36.0f) * this.L);
            canvas2.save();
            rectF42.inset(hl.L(1.0f), hl.L(1.0f));
            canvas2.clipRect(rectF42);
            f12 = this.L;
            if (f12 > 0.0f) {
                paint.setAlpha((int) ((1.0f - f12) * 255.0f));
            }
            canvas2.save();
            float L42 = (hl.L(24.0f) * f) / hl.N(24.0f);
            canvas2.scale(L42, L42, f4, A22 - hl.L(20.0f));
            canvas2.translate(f4 - hl.M(12.0f), A22 - hl.L(12.0f));
            i5 = i2;
            f13 = f5;
            i6 = alpha;
            textPaint3 = textPaint42;
            f14 = f212;
            canvas2.drawLine(hl.N(12.5f), hl.N(4.0f), hl.N(12.5f), hl.N(22.0f), paint);
            canvas.drawLine(hl.N(3.5f), hl.N(12.0f), hl.N(12.5f), hl.N(3.5f), paint);
            canvas2 = canvas;
            canvas2.drawLine(hl.N(21.5f), hl.N(12.0f), hl.N(12.5f), hl.N(3.5f), paint);
            canvas2.restore();
            if (this.S) {
                paint2 = paint;
            } else {
                float i9 = bs2.i(f9 - hl.L(2.0f), this.L, (1.0f - this.L) * (((-hl.L(8.0f)) - (hl.M(8.0f) * f)) - f10), f13);
                paint.setAlpha(alpha42);
                canvas2.save();
                canvas2.scale(f, f, f4, hl.L(28.0f) + i9);
                float L7 = i9 + hl.L(28.0f);
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
                    canvas2.translate(f4 - hl.L(24.0f), L7 - hl.L(24.0f));
                    float L8 = hl.L(16.0f);
                    float L9 = hl.L(26.0f);
                    float L10 = hl.L(22.0f);
                    float L11 = hl.L(32.0f);
                    float L12 = hl.L(32.0f);
                    float L13 = hl.L(20.0f);
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
            dy2Var = dy2Var2;
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
            float L52 = (((1.0f - this.L) * hl.L(20.0f)) - (hl.L(36.0f) * this.L)) + f13;
            RectF rectF52 = hl.P;
            float f222 = (r4 - this.y) / 2.0f;
            rectF52.set(f222, L52, this.c - f222, this.s.getHeight() + L52);
            rectF52.inset(-hl.L(8.0f), -hl.L(4.0f));
            canvas2.drawRoundRect(rectF52, hl.L(15.0f), hl.L(15.0f), d("paintChatActionBackground"));
            if (vnbVar == null ? vnbVar.g() : aob.b1()) {
                canvas2.drawRoundRect(rectF52, hl.L(15.0f), hl.L(15.0f), aob.h2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.y) / 2.0f, L52);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.S && f10 > 0.0f) {
            float i82 = bs2.i((-f14) + hl.L(4.0f), this.L, (1.0f - this.L) * (((-hl.L(8.0f)) - (hl.M(8.0f) * f)) - f10), f13);
            wlVar = this.l0;
            if (wlVar != null || (imageReceiver2 = wlVar.k) == null) {
                ImageReceiver imageReceiver22 = this.G;
            }
            imageReceiver = imageReceiver22;
            imageReceiver.setAlpha(f11);
            float f232 = f10 / 2.0f;
            imageReceiver.q0((int) f232);
            float f242 = f10;
            imageReceiver.i0(f4 - f232, i82, f242, f242);
            if (this.Y && imageReceiver.t() != null && (imageReceiver.t() instanceof zm2) && (((zm2) imageReceiver.t()).b instanceof s26)) {
                ((s26) ((zm2) imageReceiver.t()).b).i = f;
            }
            if (this.L > 0.0f || !this.c0) {
                imageReceiver.h(canvas2, null);
            } else {
                float f42 = imageReceiver.L0;
                float f43 = imageReceiver.M0;
                canvas2.saveLayerAlpha(f42, f43, imageReceiver.N0 + f42, imageReceiver.O0 + f43, jn7.d4, 31);
                imageReceiver.h(canvas2, null);
                float f44 = this.L;
                dy2 dy2Var3 = dy2Var;
                dy2Var3.e(dy2Var3.s);
                canvas2.scale(f44, f44, (dy2Var3.s / 2.0f) + dy2Var3.A + hl.L(12.0f) + f4, (i82 - hl.L(6.0f)) + hl.L(14.0f));
                canvas2.translate(hl.L(12.0f) + f4, i82 - hl.L(6.0f));
                float f45 = dy2Var3.l;
                if (f45 != 1.0f) {
                    int i10 = dy2Var3.c;
                    f15 = 6.0f;
                    if (i10 == 0 || i10 == 1) {
                        f16 = 14.0f;
                        rectF2 = rectF;
                        dy2Var3.e(dy2Var3.s);
                        float L14 = (dy2Var3.x - hl.L(23.0f)) / 2.0f;
                        float f46 = dy2Var3.B;
                        rectF2.set(f46, L14, dy2Var3.s + f46 + hl.L(11.0f), hl.L(23.0f) + L14);
                    } else {
                        float f47 = f45 * 2.0f;
                        if (f47 > 1.0f) {
                            f47 = 1.0f;
                        }
                        float L15 = (dy2Var3.x - hl.L(23.0f)) / 2.0f;
                        int i11 = dy2Var3.s;
                        int i12 = dy2Var3.r;
                        if (i11 == i12) {
                            A = i11;
                            f16 = 14.0f;
                        } else {
                            f16 = 14.0f;
                            A = qd4.A(1.0f, f47, i12, i11 * f47);
                        }
                        dy2Var3.e(A);
                        float f48 = dy2Var3.B;
                        rectF2 = rectF;
                        rectF2.set(f48, L15, A + f48 + hl.L(11.0f), hl.L(23.0f) + L15);
                    }
                } else {
                    f15 = 6.0f;
                    f16 = 14.0f;
                    rectF2 = rectF;
                    dy2Var3.e(dy2Var3.s);
                    float L16 = (dy2Var3.x - hl.L(23.0f)) / 2.0f;
                    float f49 = dy2Var3.B;
                    rectF2.set(f49, L16, dy2Var3.s + f49 + hl.L(11.0f), hl.L(23.0f) + L16);
                }
                rectF2.inset(-hl.L(2.0f), -hl.L(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f50 = this.L;
                dy2Var3.e(dy2Var3.s);
                canvas2.scale(f50, f50, (dy2Var3.s / 2.0f) + dy2Var3.A + hl.L(12.0f) + f4, (i82 - hl.L(f15)) + hl.L(f16));
                canvas2.translate(f4 + hl.L(12.0f), i82 - hl.L(f15));
                dy2Var3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i6);
        aob.h2.setAlpha(i3);
        textPaint3.setAlpha(alpha32);
        paint2.setAlpha(alpha42);
    }

    public final void b(Canvas canvas, int i, int i2) {
        int v0 = aob.v0(aob.Ol, this.k0);
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
                float height = ((((i2 - i) - this.w.getHeight()) / 2.0f) + i) - (hl.L(10.0f) * this.L);
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
                float L = ((1.0f - this.L) * hl.L(10.0f)) + (((i2 - i) - this.x.getHeight()) / 2.0f) + i;
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
        vnb vnbVar = this.k0;
        Paint d = vnbVar != null ? vnbVar.d(str) : null;
        return d != null ? d : aob.T0(str);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.a0 == 0 || (dialog = (TLRPC.Dialog) uc7.s1(this.f0).R.f(this.a0)) == null) {
            return;
        }
        int i3 = dialog.unread_count;
        this.d0.c(i3, true);
        this.c0 = i3 > 0;
        wq1 wq1Var = this.b0;
        if (wq1Var != null) {
            wq1Var.invalidate();
        }
    }

    public final void e(boolean z, final wq1 wq1Var) {
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zc2
                public final /* synthetic */ ad2 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b5 = b4;
                    wq1 wq1Var2 = wq1Var;
                    ad2 ad2Var = this.b;
                    switch (b5) {
                        case 0:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            ad2Var.U.invalidate();
                            break;
                        case 1:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            break;
                        case 2:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            break;
                        case 3:
                            ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            wq1Var2.invalidate();
                            break;
                        default:
                            ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ad2Var.U.invalidate();
                            wq1Var2.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(k43.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zc2
            public final /* synthetic */ ad2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b2;
                wq1 wq1Var2 = wq1Var;
                ad2 ad2Var = this.b;
                switch (b5) {
                    case 0:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        ad2Var.U.invalidate();
                        break;
                    case 1:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 2:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 3:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    default:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ad2Var.U.invalidate();
                        wq1Var2.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(k43.h);
        ofFloat2.setDuration(250L);
        this.M = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zc2
            public final /* synthetic */ ad2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b;
                wq1 wq1Var2 = wq1Var;
                ad2 ad2Var = this.b;
                switch (b5) {
                    case 0:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        ad2Var.U.invalidate();
                        break;
                    case 1:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 2:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 3:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    default:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ad2Var.U.invalidate();
                        wq1Var2.invalidate();
                        break;
                }
            }
        });
        k43 k43Var = k43.j;
        ofFloat3.setInterpolator(k43Var);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zc2
            public final /* synthetic */ ad2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b3;
                wq1 wq1Var2 = wq1Var;
                ad2 ad2Var = this.b;
                switch (b5) {
                    case 0:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        ad2Var.U.invalidate();
                        break;
                    case 1:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 2:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 3:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    default:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ad2Var.U.invalidate();
                        wq1Var2.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(k43Var);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final byte b5 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zc2
            public final /* synthetic */ ad2 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b52 = b5;
                wq1 wq1Var2 = wq1Var;
                ad2 ad2Var = this.b;
                switch (b52) {
                    case 0:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        ad2Var.U.invalidate();
                        break;
                    case 1:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 2:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    case 3:
                        ad2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        wq1Var2.invalidate();
                        break;
                    default:
                        ad2Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ad2Var.U.invalidate();
                        wq1Var2.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(k43Var);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.K = animatorSet3;
        animatorSet3.addListener(new v5(this, wq1Var, (byte) 15));
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
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-c.id));
        this.H = M0;
        if (M0 == null) {
            this.H = uc7.s1(i).M0(Long.valueOf(c.id));
        }
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.p(this.H);
        this.G.d0(jn5.a(1, this.H), "50_50", rb0Var, null, yac.h(0).f(), 0);
        uc7.s1(i).r0(c.id, 0, null);
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
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.p(this.H);
        this.G.d0(jn5.a(1, this.H), "50_50", rb0Var, null, yac.h(0).f(), 0);
        int i = this.f0;
        uc7.s1(i).r0(-chat.id, 0, null);
        TLRPC.Dialog S0 = uc7.s1(i).S0(-chat.id);
        int i2 = S0 == null ? 0 : S0.unread_count;
        this.d0.c(i2, false);
        this.c0 = i2 > 0;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        wl wlVar;
        wq1 wq1Var;
        wq1 wq1Var2;
        wl wlVar2;
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
        ArrayList l = uc7.s1(i).g4.l(j);
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
        vnb vnbVar = this.k0;
        if (i3 == 1) {
            wq1 wq1Var3 = this.b0;
            if (wq1Var3 != null && (wlVar2 = this.l0) != null) {
                wlVar2.o(wq1Var3);
            }
            this.l0 = null;
            Context context = this.U.getContext();
            int i4 = aob.rd;
            qo4 d = ro4.d(context, 1.0f, aob.v0(i4, vnbVar), true);
            this.m0 = d != null ? d : null;
            this.n0 = aob.v0(i4, vnbVar);
            imageReceiver.g0(d);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            wl wlVar3 = this.l0;
            if (wlVar3 == null || wlVar3.h() != tL_forumTopic.icon_emoji_id) {
                wl wlVar4 = this.l0;
                if (wlVar4 != null && (wq1Var = this.b0) != null) {
                    wlVar4.o(wq1Var);
                }
                wl wlVar5 = new wl(22, i, tL_forumTopic.icon_emoji_id);
                this.l0 = wlVar5;
                int v0 = aob.v0(aob.Zc, vnbVar);
                this.o0 = v0;
                wlVar5.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            wl wlVar6 = this.l0;
            if (wlVar6 != null && (wq1Var2 = this.b0) != null) {
                wlVar6.b(wq1Var2);
            }
            imageReceiver.g0(null);
        } else {
            wq1 wq1Var4 = this.b0;
            if (wq1Var4 != null && (wlVar = this.l0) != null) {
                wlVar.o(wq1Var4);
            }
            this.l0 = null;
            imageReceiver.g0(ro4.f(tL_forumTopic));
        }
        int i5 = tL_forumTopic.unread_count;
        this.d0.c(i5, false);
        this.c0 = i5 > 0;
    }
}

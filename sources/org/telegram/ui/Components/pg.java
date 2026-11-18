package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pg extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public fh.g A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final hi.m E;
    public final Paint E0;
    public final Drawable F;
    public final Paint F0;
    public final Drawable G;
    public final Path G0;
    public final og H;
    public final Matrix H0;
    public int I;
    public final RectF I0;
    public final RectF J;
    public final fh.g[] J0;
    public final RectF K;
    public final pb.b K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final c6 P;
    public boolean P0;
    public final RectF Q;
    public final /* synthetic */ ChatActivityEnterView Q0;
    public fh.g R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final c6 V;
    public final c6 W;
    public hi.m3 a;
    public final c6 a0;
    public hi.m3 b;
    public final c6 b0;
    public ShapeDrawable c;
    public boolean c0;
    public final Drawable d;
    public final Path d0;
    public final String e;
    public final Path e0;
    public StaticLayout f;
    public final Path f0;
    public final Paint g0;
    public float h;
    public final c6 h0;
    public final c6 i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public fh.g o0;
    public final RectF p0;
    public final Paint q0;
    public final Paint r;
    public final c6 r0;
    public final Paint s;
    public final c6 s0;
    public final c6 t0;
    public int u0;
    public final int[] v0;
    public final Paint w;
    public final int[] w0;
    public final Path x;
    public gh.b x0;
    public final Paint y;
    public boolean y0;
    public fh.g z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.Q0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = new float[]{r5, r5, 0.0f, 0.0f, 0.0f, 0.0f, r5, r5};
        this.O = new float[]{0.0f, 0.0f, r3, r3, r3, r3, 0.0f, 0.0f};
        lr lrVar = lr.h;
        this.P = new c6(this, 0L, 350L, lrVar);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new c6(this, 0L, 320L, lrVar);
        this.W = new c6(this, 0L, 260L, lr.k);
        this.a0 = new c6(this, 0L, 60L, lrVar);
        this.b0 = new c6(this, 0L, 180L, lrVar);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new c6(this, 0L, 220L, lrVar);
        this.i0 = new c6(this, 0L, 220L, lrVar);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.q0 = new Paint(1);
        new Path();
        new Path();
        this.r0 = new c6(this, 0L, 380L, lrVar);
        this.s0 = new c6(this, 0L, 300L, lrVar);
        this.t0 = new c6(this, 0L, 180L, lrVar);
        this.u0 = -1;
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new fh.g[3];
        this.K0 = new pb.b(18);
        og ogVar = new og(this, this);
        this.H = ogVar;
        r0.i0.j(this, ogVar);
        hi.m mVar = new hi.m(5);
        this.E = mVar;
        mVar.setCallback(this);
        mVar.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.J4 = drawable;
        org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.Se, chatActivityEnterView.K4, PorterDuff.Mode.MULTIPLY);
        this.c = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = org.telegram.messenger.gd.M0(2131745117, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.F = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.G = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public static float g() {
        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
        return currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f);
    }

    private void setupHintPaint(float f10) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.g0;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        paint.setColor(org.telegram.messenger.g0.B(chatActivityEnterView.C0(i7)) < 0.5f ? this.s.getColor() : chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.eg));
        paint.setAlpha((int) (Color.alpha(r0) * f10));
    }

    public final void b() {
        Path path = this.d0;
        if (path.isEmpty()) {
            float N = org.telegram.messenger.g0.N(0.3f);
            float N2 = org.telegram.messenger.g0.N(3.9f) + N;
            float f10 = -org.telegram.messenger.g0.N(6.2f);
            float N3 = org.telegram.messenger.g0.N(6.2f);
            float N4 = org.telegram.messenger.g0.N(4.6f);
            path.moveTo(N2 - N4, N3);
            path.lineTo(N2, f10);
            path.lineTo(N2 + N4, N3);
            float f11 = N4 * 0.6f;
            path.moveTo(N2 - f11, org.telegram.messenger.g0.N(2.1f));
            path.lineTo(N2 + f11, org.telegram.messenger.g0.N(2.1f));
            float f12 = -org.telegram.messenger.g0.N(0.6f);
            float N5 = N - org.telegram.messenger.g0.N(2.6f);
            float N6 = N - org.telegram.messenger.g0.N(9.2f);
            Path path2 = this.e0;
            path2.moveTo(N6, f12);
            path2.lineTo(N5, f12);
            path2.moveTo(N5 - org.telegram.messenger.g0.N(3.2f), f12 - org.telegram.messenger.g0.N(4.0f));
            path2.lineTo(N5, f12);
            path2.lineTo(N5 - org.telegram.messenger.g0.N(3.2f), org.telegram.messenger.g0.N(4.0f) + f12);
            float f13 = -org.telegram.messenger.g0.N(5.0f);
            float N7 = org.telegram.messenger.g0.N(4.0f);
            Path path3 = this.f0;
            path3.moveTo(f13, N7);
            path3.lineTo(0.0f, 0.0f);
            path3.lineTo(org.telegram.messenger.g0.N(5.0f), org.telegram.messenger.g0.N(4.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(float f10, float f11, float f12, float f13, Canvas canvas) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Canvas canvas2;
        float f21;
        int i7;
        float f22;
        float f23;
        boolean z10;
        float f24;
        RectF rectF;
        float f25;
        int i10;
        float f26;
        Canvas canvas3;
        int W1;
        ChatActivityEnterView chatActivityEnterView;
        int i11;
        int i12;
        float f27;
        boolean z11;
        float i13;
        ChatActivityEnterView chatActivityEnterView2 = this.Q0;
        float max = Math.max(0.0f, f12) * this.V.d(chatActivityEnterView2.n0() && !chatActivityEnterView2.f5 && chatActivityEnterView2.d5 == 0.0f && chatActivityEnterView2.t3 && !chatActivityEnterView2.g5);
        RectF rectF2 = this.Q;
        if (max <= 0.01f) {
            rectF2.setEmpty();
            return;
        }
        b();
        c6 c6Var = this.W;
        c6Var.getClass();
        float max2 = Math.max(c6Var.e(false, 0.0f), this.b0.d(this.c0));
        float max3 = Math.max(this.a0.e(false, chatActivityEnterView2.u1), this.c0 ? 1.0f : 0.0f);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f28 = L / 2.0f;
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(64.0f), L, max3);
        float L2 = org.telegram.messenger.g0.L(79.0f);
        float L3 = ((org.telegram.messenger.g0.L(64.0f) - T1) / 2.0f) * ((float) Math.sqrt(0.5d));
        float round = Math.round(f10 - L2) - L3;
        float round2 = Math.round(((f11 + org.telegram.messenger.g0.L(170.0f)) - L2) + f13) - L3;
        float f29 = T1 / 2.0f;
        float f30 = round2 - f29;
        float f31 = round2 + f29;
        rectF2.set(round - f29, f30, round + f29, f31);
        float max4 = ((Math.max(0.0f, max2) * 0.08f) + (0.04f * max3) + 1.0f) * ((0.4f * max) + 0.6f);
        canvas.save();
        float L4 = f11 + org.telegram.messenger.g0.L(170.0f) + f13;
        if (max < 0.999f) {
            f16 = 0.01f;
            f14 = L4;
            f15 = f30;
            f17 = max3;
            f18 = max4;
            f20 = round2;
            f21 = 0.6f;
            canvas2 = canvas;
            f19 = round;
            i7 = canvas2.saveLayerAlpha(round - T1, round2 - T1, org.telegram.messenger.g0.L(30.0f) + f10, org.telegram.messenger.g0.L(30.0f) + L4, (int) (max * 255.0f));
        } else {
            f14 = L4;
            f15 = f30;
            f16 = 0.01f;
            f17 = max3;
            f18 = max4;
            f19 = round;
            f20 = round2;
            canvas2 = canvas;
            f21 = 0.6f;
            i7 = -1;
        }
        canvas2.scale(f18, f18, org.telegram.messenger.g0.T1(f19, f10, f21), org.telegram.messenger.g0.T1(f20, f14, f21));
        int C0 = chatActivityEnterView2.C0(org.telegram.ui.ActionBar.n6.Pe);
        if (max2 > f16) {
            float f32 = T1 * 0.95f;
            RadialGradient radialGradient = new RadialGradient(f19, f20, f32, new int[]{org.telegram.ui.ActionBar.n6.r1(0.5f, C0), org.telegram.ui.ActionBar.n6.r1(0.16f, C0), 0}, new float[]{0.3f, 0.62f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint = this.T;
            paint.setShader(radialGradient);
            paint.setAlpha((int) (Math.min(1.0f, max2) * 255.0f));
            canvas2.drawCircle(f19, f20, f32, paint);
        }
        boolean z12 = org.telegram.messenger.g0.B(chatActivityEnterView2.C0(org.telegram.ui.ActionBar.n6.d6)) < 0.5f;
        RectF rectF3 = org.telegram.messenger.g0.P;
        float f33 = f19 - f28;
        float f34 = f19 + f28;
        float f35 = f15;
        rectF3.set(f33, f35, f34, f31);
        if (this.y0) {
            float f36 = f19;
            i10 = i7;
            f23 = f36;
            f22 = f20;
            z10 = z12;
            f24 = f34;
            f25 = f35;
            f26 = f28;
            d(canvas, rectF3, f26, -45.0f, f23, f22, e(2));
            canvas3 = canvas;
            rectF = rectF3;
        } else {
            f22 = f20;
            f23 = f19;
            z10 = z12;
            f24 = f34;
            rectF = rectF3;
            f25 = f35;
            i10 = i7;
            f26 = f28;
            canvas3 = canvas;
        }
        if (this.B0) {
            W1 = this.C0;
        } else {
            gh.b bVar = this.x0;
            W1 = bVar != null ? bVar.W1() : 0;
        }
        if (this.y0 || Color.alpha(W1) <= 0) {
            chatActivityEnterView = chatActivityEnterView2;
            i11 = C0;
            i12 = i10;
            f27 = max2;
        } else {
            Path path = this.l0;
            path.rewind();
            rectF.set(f33, f25, f24, f31);
            i12 = i10;
            path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
            Matrix matrix = this.m0;
            chatActivityEnterView = chatActivityEnterView2;
            matrix.setRotate(-45.0f, f23, f22);
            path.transform(matrix);
            Paint paint2 = this.k0;
            paint2.setColor(0);
            i11 = C0;
            f27 = max2;
            paint2.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), W1);
            canvas3.drawPath(path, paint2);
        }
        canvas3.save();
        canvas3.rotate(-45.0f, f23, f22);
        rectF.set(f33, f25, f24, f31);
        if (!this.y0) {
            fh.g gVar = this.R;
            if (gVar != null) {
                gVar.setBounds((int) (rectF.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.bottom));
                this.R.setAlpha(org.telegram.messenger.ks.e4);
                this.R.draw(canvas3);
            } else {
                canvas3.drawRoundRect(rectF, f26, f26, this.r);
            }
        }
        float i14 = Utilities.i(f27, 1.0f, 0.0f);
        if (i14 > 0.0f) {
            Paint paint3 = this.S;
            paint3.setColor(i11);
            paint3.setAlpha((int) (Color.alpha(r9) * i14));
            canvas3.drawRoundRect(rectF, f26, f26, paint3);
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint4 = this.j0;
        paint4.setStyle(style);
        paint4.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
        paint4.setColor(z10 ? 654311423 : 436207616);
        paint4.setAlpha((int) ((1.0f - i14) * Color.alpha(paint4.getColor())));
        rectF.inset(org.telegram.messenger.g0.N(0.33f), org.telegram.messenger.g0.N(0.33f));
        canvas3.drawRoundRect(rectF, f26, f26, paint4);
        canvas3.restore();
        float f37 = -((float) Math.sqrt(0.5d));
        float f38 = f29 - f26;
        Paint paint5 = this.U;
        paint5.setStyle(style);
        paint5.setStrokeWidth(org.telegram.messenger.g0.N(1.9f));
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(i0.a.f(i14, this.s.getColor(), -1));
        canvas3.save();
        canvas3.translate(((f38 - org.telegram.messenger.g0.N(2.0f)) * f37) + f23, ((f38 - org.telegram.messenger.g0.N(2.0f)) * f37) + f22);
        canvas3.drawPath(this.d0, paint5);
        c6 c6Var2 = this.i0;
        float f39 = f17 * 1.4f;
        float N = org.telegram.messenger.g0.N(1.5f) * (1.0f - Utilities.i(f39, 1.0f, 0.0f)) * c6Var2.c;
        float g10 = (g() + 1.0f) / 2.0f;
        canvas3.translate((3.0f - (g10 * 2.0f)) * g10 * g10 * N, 0.0f);
        paint5.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        canvas3.drawPath(this.e0, paint5);
        paint5.setStrokeWidth(org.telegram.messenger.g0.N(1.9f));
        canvas3.restore();
        if (!this.c0) {
            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
            if (chatActivityEnterView3.t3 && !chatActivityEnterView3.g5) {
                z11 = true;
                i13 = (1.0f - Utilities.i(f39, 1.0f, 0.0f)) * c6Var2.d(z11);
                if (i13 > f16) {
                    setupHintPaint(i13);
                    float g11 = (g() * org.telegram.messenger.g0.N(2.5f)) + (-(f38 - org.telegram.messenger.g0.N(3.0f)));
                    canvas3.save();
                    float f40 = g11 * f37;
                    canvas3.translate(f23 + f40, f22 + f40);
                    canvas3.rotate(-45.0f);
                    canvas3.drawPath(this.f0, this.g0);
                    canvas3.restore();
                }
                if (i12 >= 0) {
                    canvas3.restoreToCount(i12);
                }
                canvas3.restore();
                invalidate();
            }
        }
        z11 = false;
        i13 = (1.0f - Utilities.i(f39, 1.0f, 0.0f)) * c6Var2.d(z11);
        if (i13 > f16) {
        }
        if (i12 >= 0) {
        }
        canvas3.restore();
        invalidate();
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, fh.g gVar) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        boolean z10 = org.telegram.messenger.g0.B(chatActivityEnterView.C0(i10)) < 0.5f;
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        if (f11 != 0.0f) {
            Matrix matrix = this.H0;
            matrix.setRotate(f11, f12, f13);
            path.transform(matrix);
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        Paint paint = this.F0;
        paint.setColor(-16777216);
        ji.m mVar = chatActivityEnterView.p1;
        if (mVar == null || (!((i7 = mVar.c) == 2 || i7 == 3) || mVar.J)) {
            paint.setShadowLayer(org.telegram.messenger.g0.N(8.0f), 0.0f, org.telegram.messenger.g0.N(2.0f), org.telegram.ui.ActionBar.n6.r1((z10 ? 0.4f : 0.16f) * 1.0f, -16777216));
        } else {
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.2f), 0.0f, 0.0f, org.telegram.ui.ActionBar.n6.r1((z10 ? 0.36f : 0.12f) * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (gVar != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            gVar.setBounds(((int) rectF2.left) - org.telegram.messenger.g0.L(3.0f), ((int) rectF2.top) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + ((int) rectF2.right), org.telegram.messenger.g0.L(3.0f) + ((int) rectF2.bottom));
            gVar.setAlpha((int) 255.0f);
            gVar.draw(canvas);
        }
        int i11 = z10 ? -1943655888 : -989855745;
        Paint paint2 = this.D0;
        paint2.setColor(i11);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.E0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        paint3.setColor(z10 ? 620756991 : 385875968);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.H.f(motionEvent);
    }

    public final fh.g e(int i7) {
        dh.c cVar = this.Q0.J1;
        if (cVar == null) {
            return null;
        }
        fh.g[] gVarArr = this.J0;
        if (gVarArr[i7] == null) {
            fh.g c10 = cVar.c(this, this.K0, false);
            gVarArr[i7] = c10;
            c10.r(0.0f);
            gVarArr[i7].W = 0.0f;
        }
        return gVarArr[i7];
    }

    public final void f() {
        hi.m3 m3Var = this.a;
        if (m3Var != null) {
            m3Var.r0 = new ng(this, m3Var, 1);
            m3Var.f(true);
            this.a = null;
        }
        hi.m3 m3Var2 = this.b;
        if (m3Var2 != null) {
            m3Var2.r0 = new ng(this, m3Var2, 2);
            m3Var2.f(true);
            this.b = null;
        }
    }

    public final int h(float f10, float f11) {
        RectF rectF = this.p0;
        if (!rectF.isEmpty() && this.r0.c >= 0.8f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF);
            rectF2.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            if (rectF2.contains(f10, f11)) {
                return 0;
            }
        }
        return -1;
    }

    public final void i() {
        f();
        hi.m3 m3Var = new hi.m3(getContext(), 2);
        this.b = m3Var;
        m3Var.o(1.0f, 0.0f);
        hi.m3 m3Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(m3Var2);
        this.b.r(true);
        this.b.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(chatActivityEnterView.d1 ? chatActivityEnterView.P ? 2131743345 : 2131743346 : chatActivityEnterView.P ? 2131743273 : 2131743274, null)));
        hi.m3 m3Var3 = this.b;
        m3Var3.h = hi.m3.a(m3Var3.getText(), this.b.getTextPaint());
        boolean z10 = chatActivityEnterView.P;
        int i7 = 0;
        if (z10) {
            hi.m3 m3Var4 = this.b;
            m3Var4.getClass();
            mh0 mh0Var = new mh0(R.raw.fire_on, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            mh0Var.start();
            m3Var4.m(mh0Var);
        } else {
            org.telegram.messenger.mp.g1().edit().putInt("voiceoncehint", org.telegram.messenger.mp.g1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 54.0f, 58.0f));
        hi.m3 m3Var5 = this.b;
        m3Var5.r0 = new ng(this, m3Var5, i7);
        m3Var5.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05d0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float L;
        float L2;
        float e10;
        float f12;
        float f13;
        long j3;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i10;
        int i11;
        float f23;
        boolean z10;
        RectF rectF;
        float f24;
        int i12;
        float f25;
        float f26;
        float f27;
        char c10;
        pg pgVar;
        float f28;
        Paint paint;
        Canvas canvas2;
        hi.m3 m3Var;
        RectF rectF2;
        float interpolation;
        float i13;
        float f29;
        RectF rectF3;
        float f30;
        Drawable drawable;
        Paint paint2;
        RectF rectF4;
        float i14;
        boolean z11;
        pg pgVar2;
        Canvas canvas3;
        float e11;
        RectF rectF5;
        RectF rectF6;
        de deVar;
        float f31;
        float x10;
        int i15;
        jh.f z02;
        fh.g gVar;
        gh.a aVar;
        boolean z12 = this.B0;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (!z12 && chatActivityEnterView.J1 != null && (z02 = chatActivityEnterView.z0()) != null && (gVar = z02.n) != null && (aVar = gVar.w) != null) {
            fh.g c11 = chatActivityEnterView.J1.c(this, aVar, false);
            this.z0 = c11;
            c11.r(org.telegram.messenger.g0.L(18.0f));
            this.z0.q(org.telegram.messenger.g0.L(3.0f));
            this.z0.W = 0.0f;
            fh.g c12 = chatActivityEnterView.J1.c(this, aVar, false);
            this.A0 = c12;
            c12.r(org.telegram.messenger.g0.L(18.0f));
            this.A0.q(org.telegram.messenger.g0.L(3.0f));
            this.A0.W = 0.0f;
            fh.g c13 = chatActivityEnterView.J1.c(this, aVar, false);
            this.R = c13;
            c13.r(0.0f);
            fh.g gVar2 = this.R;
            gVar2.W = 0.0f;
            gVar2.q(org.telegram.messenger.g0.L(3.0f));
            this.C0 = aVar.W1();
            this.B0 = true;
        }
        float f32 = chatActivityEnterView.V4;
        float f33 = f32 <= 0.5f ? f32 / 0.5f : f32 <= 0.75f ? 1.0f - (((f32 - 0.5f) / 0.25f) * 0.1f) : (((f32 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        this.L = System.currentTimeMillis();
        float f34 = chatActivityEnterView.Z4;
        if (f34 != 10000.0f) {
            float max = Math.max(0.0f, chatActivityEnterView.Y4 - f34);
            float L3 = org.telegram.messenger.g0.L(5.0f);
            if (max <= L3) {
                f10 = 5.0f;
                f11 = 0.0f;
            } else {
                f10 = 5.0f;
                f11 = Math.round(((max - L3) * org.telegram.messenger.g0.L(57.0f)) / (org.telegram.messenger.g0.L(57.0f) - L3));
            }
            if (f11 > org.telegram.messenger.g0.L(57.0f)) {
                f11 = org.telegram.messenger.g0.L(57.0f);
            }
        } else {
            f10 = 5.0f;
            f11 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
        float L4 = 1.0f - (f11 / org.telegram.messenger.g0.L(57.0f));
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(194.0f);
        if (chatActivityEnterView.g5) {
            L = org.telegram.messenger.g0.L(36.0f);
            L2 = org.telegram.ui.Cells.c0.e(14.0f, L4, (((1.0f - f33) * org.telegram.messenger.g0.N(30.0f)) + (org.telegram.messenger.g0.L(60.0f) + measuredHeight)) - f11);
            e10 = org.telegram.messenger.g0.N(2.0f) + (((L / 2.0f) + L2) - org.telegram.messenger.g0.N(8.0f));
            float f35 = L4 > 0.4f ? 1.0f : L4 / 0.4f;
            float f36 = chatActivityEnterView.b5;
            f12 = com.google.android.gms.internal.vision.e2.t(1.0f, f35, f36 * 15.0f, (1.0f - L4) * 9.0f * (1.0f - f36));
            f13 = L4;
        } else {
            L = org.telegram.messenger.g0.L(36.0f) + ((int) (org.telegram.messenger.g0.L(28.0f) * L4));
            L2 = (((org.telegram.messenger.g0.L(60.0f) - (org.telegram.messenger.g0.L(14.0f) * L4)) + measuredHeight) + ((int) ((1.0f - f33) * org.telegram.messenger.g0.L(30.0f)))) - ((int) f11);
            e10 = org.telegram.ui.Cells.c0.e(2.0f, L4, org.telegram.messenger.g0.N(2.0f) + (((L / 2.0f) + L2) - org.telegram.messenger.g0.N(8.0f))) - (org.telegram.messenger.g0.N(10.0f) * L4);
            f12 = (1.0f - L4) * 9.0f;
            chatActivityEnterView.b5 = 0.0f;
            f13 = 0.0f;
        }
        float f37 = e10;
        float f38 = L2;
        float f39 = L;
        float f40 = f12;
        boolean z13 = chatActivityEnterView.S4;
        RectF rectF7 = this.J;
        if (z13) {
            j3 = currentTimeMillis;
            i7 = 2;
            if (System.currentTimeMillis() - chatActivityEnterView.T4 > 200) {
                f14 = 0.0f;
                if (L4 >= 0.8f || chatActivityEnterView.g5 || chatActivityEnterView.a5 != f14 || chatActivityEnterView.d5 != f14) {
                    chatActivityEnterView.S4 = false;
                }
                if (chatActivityEnterView.S4) {
                    i15 = i7;
                    float f41 = chatActivityEnterView.U4 - (j3 / 150.0f);
                    chatActivityEnterView.U4 = f41;
                    if (f41 < 0.0f) {
                        chatActivityEnterView.U4 = 0.0f;
                    }
                } else {
                    float f42 = chatActivityEnterView.U4;
                    if (f42 != 1.0f) {
                        i15 = i7;
                        float f43 = (j3 / 150.0f) + f42;
                        chatActivityEnterView.U4 = f43;
                        if (f43 >= 1.0f) {
                            chatActivityEnterView.U4 = 1.0f;
                            int i16 = org.telegram.messenger.bz.a;
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                            int i17 = org.telegram.messenger.bz.O + 1;
                            org.telegram.messenger.bz.O = i17;
                            edit.putInt("lockRecordAudioVideoHint", i17);
                            edit.apply();
                        }
                    } else {
                        i15 = i7;
                    }
                }
                int i18 = (int) (chatActivityEnterView.U4 * 255.0f);
                this.c.setAlpha(i18);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i18);
                this.n.setAlpha(i18);
                if (this.f == null) {
                    canvas.save();
                    f17 = 1.0f;
                    rectF7.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.N(16.0f) + measuredHeight);
                    f15 = measuredHeight;
                    f16 = f39;
                    this.c.setBounds(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(2.0f), (int) (this.h + org.telegram.messenger.g0.L(36.0f)), (int) (org.telegram.messenger.g0.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - org.telegram.messenger.g0.L(26.0f), ((this.f.getHeight() / 2.0f) + (org.telegram.messenger.g0.N(17.0f) + f15)) - (org.telegram.messenger.g0.N(3.0f) * chatActivityEnterView.c5));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(4.0f));
                    Paint paint3 = this.y;
                    paint3.setColor(-1);
                    paint3.setAlpha(i18);
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeCap(Paint.Cap.ROUND);
                    paint3.setStrokeJoin(Paint.Join.ROUND);
                    paint3.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                    canvas.drawPath(path, paint3);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + f15), org.telegram.ui.Cells.c0.y(i15, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + f15)));
                    drawable2.draw(canvas);
                    canvas.restore();
                } else {
                    f15 = measuredHeight;
                    f16 = f39;
                    f17 = 1.0f;
                }
                float d = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.W1 >= 59000);
                f18 = chatActivityEnterView.d5;
                if (f18 != 0.0f || chatActivityEnterView.i1 == null) {
                    f19 = chatActivityEnterView.a5;
                    if (f19 != 0.0f) {
                        float f44 = f19 > 0.6f ? f17 : f19 / 0.6f;
                        if (!chatActivityEnterView.h0) {
                            f19 = org.telegram.ui.Cells.c0.x(f19, 0.6f, 0.4f, 0.0f);
                        }
                        lr lrVar = lr.j;
                        float interpolation2 = lrVar.getInterpolation(f44);
                        f20 = lrVar.getInterpolation(f19);
                        f21 = interpolation2;
                    } else {
                        f20 = 0.0f;
                        f21 = 0.0f;
                    }
                } else {
                    float f45 = f18 > 0.38f ? f17 : f18 / 0.38f;
                    if (f18 > 0.63f) {
                        x10 = f17;
                        f31 = 0.0f;
                    } else {
                        f31 = 0.0f;
                        x10 = org.telegram.ui.Cells.c0.x(f18, 0.38f, 0.25f, 0.0f);
                    }
                    lr lrVar2 = lr.j;
                    float interpolation3 = lrVar2.getInterpolation(f45);
                    lrVar2.getInterpolation(x10);
                    f20 = f31;
                    f21 = interpolation3;
                }
                canvas.save();
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight() - chatActivityEnterView.n2.getMeasuredHeight();
                if (chatActivityEnterView.I1 || !chatActivityEnterView.P5 || (deVar = chatActivityEnterView.f1) == null || deVar.getVisibility() != 0) {
                    f22 = f20;
                    i10 = 0;
                    i11 = 0;
                } else {
                    f22 = f20;
                    i10 = 0;
                    i11 = i5.c.d(44.0f, chatActivityEnterView.m2.getMeasuredHeight(), 0);
                }
                canvas.clipRect(i10, i10, measuredWidth2, measuredHeight2 + i11);
                float f46 = chatActivityEnterView.W4;
                float f47 = f17 - f46 != 0.0f ? f17 - f46 : f22 != 0.0f ? f22 : 0.0f;
                if (chatActivityEnterView.X4 >= 0.7f || chatActivityEnterView.f5) {
                    chatActivityEnterView.S4 = false;
                    f23 = chatActivityEnterView.e5;
                    if (f23 != 0.0f) {
                        float f48 = f23 - 0.12f;
                        chatActivityEnterView.e5 = f48;
                        if (f48 < 0.0f) {
                            chatActivityEnterView.e5 = 0.0f;
                        }
                    }
                } else {
                    float f49 = chatActivityEnterView.e5;
                    if (f49 != f17) {
                        float f50 = f49 + 0.12f;
                        chatActivityEnterView.e5 = f50;
                        if (f50 > f17) {
                            chatActivityEnterView.e5 = f17;
                        }
                    }
                }
                float N = org.telegram.messenger.g0.N(72.0f);
                float z14 = com.google.android.gms.internal.vision.e2.z(1.0f, f47, org.telegram.messenger.g0.N(24.0f) * f21, N * f47);
                float f51 = chatActivityEnterView.e5;
                float z15 = com.google.android.gms.internal.vision.e2.z(1.0f, f51, N, z14);
                float f52 = z15 > N ? N : z15;
                float f53 = 1.0f - d;
                float f54 = 1.0f - f22;
                float f55 = chatActivityEnterView.W4 * f53 * f54 * f51;
                float f56 = measuredWidth;
                float f57 = f37 + f52;
                canvas.scale(f55, f55, f56, f57);
                float f58 = f38 + f52;
                float f59 = f58 + f16;
                rectF7.set(f56 - org.telegram.messenger.g0.N(18.0f), f58, org.telegram.messenger.g0.N(18.0f) + f56, f59);
                z10 = this.y0;
                Paint paint4 = this.r;
                if (z10) {
                    i12 = measuredWidth;
                    f24 = f59;
                    f25 = d;
                    f26 = 2.0f;
                    paint = paint4;
                    f27 = 0.4f;
                    c10 = 2;
                    f28 = f56;
                    d(canvas, rectF7, org.telegram.messenger.g0.N(18.0f), 0.0f, 0.0f, 0.0f, e(0));
                    pgVar = this;
                    canvas2 = canvas;
                    rectF = rectF7;
                } else {
                    rectF = rectF7;
                    f24 = f59;
                    i12 = measuredWidth;
                    f25 = d;
                    f26 = 2.0f;
                    f27 = 0.4f;
                    c10 = 2;
                    pgVar = this;
                    f28 = f56;
                    paint = paint4;
                    canvas2 = canvas;
                    fh.g gVar3 = pgVar.z0;
                    if (gVar3 != null) {
                        gVar3.setBounds((int) (rectF.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.bottom));
                        pgVar.z0.draw(canvas2);
                    } else {
                        chatActivityEnterView.J4.setBounds((int) (rectF.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.bottom));
                        chatActivityEnterView.J4.draw(canvas2);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint);
                    }
                }
                chatActivityEnterView.G4.set(rectF);
                RectF rectF8 = chatActivityEnterView.G4;
                float centerX = rectF8.centerX();
                float centerY = rectF8.centerY();
                rectF8.left = org.telegram.messenger.g0.T1(centerX, rectF8.left, f55);
                rectF8.right = org.telegram.messenger.g0.T1(centerX, rectF8.right, f55);
                rectF8.top = org.telegram.messenger.g0.T1(centerY, rectF8.top, f55);
                rectF8.bottom = org.telegram.messenger.g0.T1(centerY, rectF8.bottom, f55);
                m3Var = pgVar.a;
                if (m3Var != null) {
                    m3Var.p(0.0f, rectF.centerY());
                    pgVar.a.invalidate();
                }
                float f60 = 1.0f - f13;
                float f61 = f26;
                rectF.set((f28 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(f26) * f60), f57 - (org.telegram.messenger.g0.N(f26) * f60), org.telegram.ui.Cells.c0.e(f61, f60, org.telegram.messenger.g0.L(6.0f) + i12), org.telegram.ui.Cells.c0.e(f61, f60, f57 + org.telegram.messenger.g0.L(12.0f)));
                float f62 = rectF.bottom;
                float centerX2 = rectF.centerX();
                float centerY2 = rectF.centerY();
                canvas2.save();
                float i19 = Utilities.i(Math.max(chatActivityEnterView.d5, chatActivityEnterView.z6) * f61, 1.0f, 0.0f);
                Paint paint5 = pgVar.s;
                int alpha = paint5.getAlpha();
                rectF2 = rectF;
                float f63 = f21;
                Paint paint6 = paint;
                Canvas canvas4 = canvas;
                int saveLayerAlpha = canvas4.saveLayerAlpha(centerX2 - org.telegram.messenger.g0.L(24.0f), centerY2 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX2, org.telegram.messenger.g0.L(24.0f) + centerY2, (int) (alpha * (1.0f - i19)), 31);
                Paint paint7 = pgVar.w;
                paint7.setAlpha(org.telegram.messenger.ks.e4);
                paint5.setAlpha(org.telegram.messenger.ks.e4);
                float f64 = 1.0f - L4;
                canvas4.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f64);
                canvas4.rotate(f40, centerX2, centerY2);
                interpolation = lr.j.getInterpolation(Utilities.i(f13, 1.0f, 0.0f));
                i13 = Utilities.i(interpolation / f27, 1.0f, 0.0f);
                float interpolation4 = lr.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
                float i20 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
                if (interpolation < 1.0f || i20 <= 0.0f) {
                    f29 = L4;
                    rectF3 = rectF2;
                    f30 = 0.0f;
                } else {
                    RectF rectF9 = org.telegram.messenger.g0.P;
                    rectF9.set(0.0f, 0.0f, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f));
                    canvas4.save();
                    float e12 = org.telegram.ui.Cells.c0.e(2.0f, f64, f52 + f62);
                    float measuredWidth3 = pgVar.getMeasuredWidth();
                    if (f13 > 0.0f) {
                        e12 = Math.min(e12, org.telegram.messenger.g0.N(0.5f) + rectF2.top);
                    }
                    canvas4.clipRect(0.0f, 0.0f, measuredWidth3, e12);
                    float N2 = org.telegram.messenger.g0.N(1.75f) * pgVar.n0;
                    float g10 = (g() + 1.0f) / 2.0f;
                    float f65 = (3.0f - (g10 * 2.0f)) * g10 * g10 * N2;
                    canvas4.translate(f28 - org.telegram.messenger.g0.N(4.0f), ((chatActivityEnterView.b5 * org.telegram.messenger.g0.N(2.0f)) + org.telegram.ui.Cells.c0.e(11.0f, interpolation, (rectF2.top - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(2.0f), org.telegram.messenger.g0.N(1.5f), L4))) - f65);
                    if (f40 > 0.0f) {
                        canvas4.rotate(f40, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    }
                    paint7.setAlpha((int) (i20 * 255.0f));
                    rectF3 = rectF2;
                    f29 = L4;
                    canvas4.drawLine(org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(8.0f), ((1.0f - interpolation) * org.telegram.messenger.g0.N(4.0f)) + org.telegram.messenger.g0.N(6.0f) + f65, paint7);
                    canvas.drawArc(rectF9, 0.0f, -180.0f, false, paint7);
                    canvas4 = canvas;
                    canvas4.drawLine(0.0f, org.telegram.messenger.g0.N(4.0f), 0.0f, com.google.android.gms.internal.vision.e2.x(chatActivityEnterView.b5, org.telegram.messenger.g0.N(4.0f), f64, org.telegram.messenger.g0.N(4.0f)), paint7);
                    paint7.setAlpha(org.telegram.messenger.ks.e4);
                    canvas4.restore();
                    f30 = 0.0f;
                }
                Drawable drawable3 = pgVar.F;
                drawable = i19 > f30 ? chatActivityEnterView.d1 ? pgVar.G : drawable3 : null;
                if (f13 > f30) {
                    if (pgVar.A0 == null) {
                        paint2 = paint6;
                        rectF4 = rectF3;
                        canvas4.drawRoundRect(rectF4, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint2);
                    } else {
                        paint2 = paint6;
                        rectF4 = rectF3;
                    }
                    float N3 = org.telegram.messenger.g0.N(1.66f) * interpolation4;
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(1.5f), interpolation);
                    float N4 = org.telegram.messenger.g0.N(1.5f) * interpolation4;
                    Path path2 = pgVar.M;
                    path2.rewind();
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    rectF10.set(rectF4);
                    rectF10.right = rectF4.centerX() - N3;
                    float[] fArr = pgVar.N;
                    fArr[7] = T1;
                    fArr[6] = T1;
                    fArr[1] = T1;
                    fArr[0] = T1;
                    fArr[5] = N4;
                    fArr[4] = N4;
                    fArr[3] = N4;
                    fArr[c10] = N4;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addRoundRect(rectF10, fArr, direction);
                    rectF10.set(rectF4);
                    rectF10.left = rectF4.centerX() + N3;
                    float[] fArr2 = pgVar.O;
                    fArr2[5] = T1;
                    fArr2[4] = T1;
                    fArr2[3] = T1;
                    fArr2[c10] = T1;
                    fArr2[7] = N4;
                    fArr2[6] = N4;
                    fArr2[1] = N4;
                    fArr2[0] = N4;
                    path2.addRoundRect(rectF10, fArr2, direction);
                    canvas4.drawPath(path2, paint5);
                } else {
                    paint2 = paint6;
                    rectF4 = rectF3;
                    canvas4.drawRoundRect(rectF4, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint5);
                }
                if (i13 < 1.0f) {
                    canvas4.drawCircle(rectF4.centerX(), rectF4.centerY(), (1.0f - i13) * org.telegram.messenger.g0.N(2.0f), paint2);
                }
                paint5.setAlpha(alpha);
                paint7.setAlpha(alpha);
                canvas4.restoreToCount(saveLayerAlpha);
                if (drawable != null) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set((int) (rectF4.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF4.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF4.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF4.centerY()));
                    drawable.setBounds(rect);
                    drawable.setAlpha((int) (i19 * 255.0f));
                    drawable.draw(canvas4);
                }
                i14 = Utilities.i((f29 - 0.55f) / 0.45f, 1.0f, 0.0f) * pgVar.h0.d((chatActivityEnterView.o0() || chatActivityEnterView.g5 || chatActivityEnterView.v1 || chatActivityEnterView.f5 || chatActivityEnterView.d5 != 0.0f || !chatActivityEnterView.t3) ? false : true);
                pgVar.n0 = i14;
                if (i14 > 0.01f) {
                    pgVar.b();
                    pgVar.setupHintPaint(i14);
                    canvas4.save();
                    canvas4.translate(Math.round(f28), (f24 - org.telegram.messenger.g0.L(17.0f)) - (g() * org.telegram.messenger.g0.N(2.5f)));
                    canvas4.drawPath(pgVar.f0, pgVar.g0);
                    canvas4.restore();
                    pgVar.invalidate();
                }
                canvas4.restore();
                canvas4.restore();
                Canvas canvas5 = canvas4;
                pg pgVar3 = pgVar;
                float f66 = f52;
                pgVar3.c(f28, f15, chatActivityEnterView.e5 * chatActivityEnterView.W4 * f53 * f54, f66, canvas5);
                float L5 = (org.telegram.messenger.g0.L(38.0f) * f25) + org.telegram.messenger.g0.T1(f38, pgVar3.getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView.a5, Math.min(f63, chatActivityEnterView.e5))) + f66;
                rectF4.set(f28 - org.telegram.messenger.g0.N(18.0f), L5, org.telegram.messenger.g0.N(18.0f) + f28, L5 + f16);
                kg kgVar = chatActivityEnterView.N3;
                z11 = kgVar == null && kgVar.m1() && !chatActivityEnterView.l1;
                chatActivityEnterView.Q = z11;
                if (z11) {
                    float N5 = org.telegram.messenger.g0.N(12.0f);
                    rectF4.set(rectF4.left, (rectF4.top - org.telegram.messenger.g0.N(36.0f)) - N5, rectF4.right, rectF4.top - N5);
                    hi.m3 m3Var2 = pgVar3.b;
                    if (m3Var2 != null) {
                        m3Var2.p(0.0f, rectF4.centerY());
                        pgVar3.b.invalidate();
                    }
                    pgVar3.K.set(rectF4);
                    canvas5.save();
                    float f67 = chatActivityEnterView.b5 * chatActivityEnterView.e5 * (1.0f - chatActivityEnterView.a5) * chatActivityEnterView.W4;
                    canvas5.scale(f67, f67, rectF4.centerX(), rectF4.centerY());
                    if (pgVar3.y0) {
                        rectF6 = rectF4;
                        pgVar3.d(canvas5, rectF6, org.telegram.messenger.g0.N(18.0f), 0.0f, 0.0f, 0.0f, pgVar3.e(1));
                        pgVar2 = pgVar3;
                        canvas3 = canvas5;
                    } else {
                        pgVar2 = pgVar3;
                        canvas3 = canvas5;
                        rectF6 = rectF4;
                        fh.g gVar4 = pgVar2.A0;
                        if (gVar4 != null) {
                            gVar4.setBounds((int) (rectF6.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF6.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.bottom));
                            pgVar2.A0.draw(canvas3);
                        } else {
                            chatActivityEnterView.J4.setBounds((int) (rectF6.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF6.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.bottom));
                            chatActivityEnterView.J4.draw(canvas3);
                            canvas3.drawRoundRect(rectF6, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint2);
                        }
                    }
                    pgVar2.E.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                    pgVar2.E.draw(canvas3);
                    canvas3.restore();
                } else {
                    pgVar2 = pgVar3;
                    canvas3 = canvas5;
                }
                c6 c6Var = pgVar2.r0;
                c6Var.getClass();
                e11 = c6Var.e(false, 0.0f);
                ChatActivityEnterView chatActivityEnterView2 = pgVar2.Q0;
                RectF rectF11 = chatActivityEnterView2.G4;
                float d2 = pgVar2.s0.d(chatActivityEnterView2.S1);
                float d10 = pgVar2.t0.d(pgVar2.u0 >= 0);
                rectF5 = pgVar2.p0;
                if (e11 > 0.0f || rectF11.isEmpty()) {
                    rectF5.setEmpty();
                } else {
                    float width = rectF11.width();
                    float measuredWidth4 = pgVar2.getMeasuredWidth() - rectF11.right;
                    rectF5.set(measuredWidth4, rectF11.top, width + measuredWidth4, rectF11.bottom);
                    float T12 = (1.0f - (d10 * 0.06f)) * org.telegram.messenger.g0.T1(0.6f, 1.0f, e11);
                    canvas3.save();
                    canvas3.scale(T12, T12, rectF5.centerX(), rectF5.centerY());
                    float f68 = e11 * 255.0f;
                    int i21 = (int) f68;
                    fh.g gVar5 = pgVar2.o0;
                    if (gVar5 != null) {
                        gVar5.setBounds((int) (rectF5.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF5.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF5.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF5.bottom));
                        pgVar2.o0.setAlpha(i21);
                        pgVar2.o0.draw(canvas3);
                    } else {
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (alpha2 * e11));
                        canvas3.drawRoundRect(rectF5, rectF5.width() / 2.0f, rectF5.width() / 2.0f, paint2);
                        paint2.setAlpha(alpha2);
                    }
                    float centerX3 = rectF5.centerX();
                    float centerY3 = rectF5.centerY();
                    if (d2 < 1.0f) {
                        Paint.Style style = Paint.Style.STROKE;
                        Paint paint8 = pgVar2.q0;
                        paint8.setStyle(style);
                        paint8.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                        paint8.setStrokeCap(Paint.Cap.ROUND);
                        paint8.setStrokeJoin(Paint.Join.ROUND);
                        paint8.setColor(paint5.getColor());
                        paint8.setAlpha((int) ((1.0f - d2) * Color.alpha(paint5.getColor()) * e11));
                        canvas3.save();
                        float T13 = org.telegram.messenger.g0.T1(1.0f, 0.6f, d2);
                        canvas3.scale(T13, T13, centerX3, centerY3);
                        float N6 = org.telegram.messenger.g0.N(3.6f) + centerX3;
                        float N7 = centerY3 - org.telegram.messenger.g0.N(5.85f);
                        float N8 = org.telegram.messenger.g0.N(5.85f) + centerY3;
                        float N9 = org.telegram.messenger.g0.N(4.3f);
                        canvas3.drawLine(N6 - N9, N8, N6, N7, paint8);
                        canvas.drawLine(N6, N7, N6 + N9, N8, paint8);
                        float f69 = N9 * 0.6f;
                        canvas.drawLine(N6 - f69, org.telegram.messenger.g0.N(1.9f) + centerY3, N6 + f69, org.telegram.messenger.g0.N(1.9f) + centerY3, paint8);
                        float N10 = centerY3 - org.telegram.messenger.g0.N(0.6f);
                        float N11 = centerX3 - org.telegram.messenger.g0.N(2.6f);
                        canvas.drawLine(centerX3 - org.telegram.messenger.g0.N(9.4f), N10, N11, N10, paint8);
                        canvas.drawLine(N11 - org.telegram.messenger.g0.N(2.6f), N10 - org.telegram.messenger.g0.N(2.6f), N11, N10, paint8);
                        canvas3 = canvas;
                        canvas3.drawLine(N11 - org.telegram.messenger.g0.N(2.6f), org.telegram.messenger.g0.N(2.6f) + N10, N11, N10, paint8);
                        canvas3.restore();
                    }
                    if (d2 > 0.0f) {
                        float T14 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d2) * 0.9285f;
                        int intrinsicWidth = (int) ((drawable3.getIntrinsicWidth() / 2.0f) * T14);
                        int intrinsicHeight = (int) ((drawable3.getIntrinsicHeight() / 2.0f) * T14);
                        int i22 = (int) centerX3;
                        int i23 = (int) centerY3;
                        drawable3.setBounds(i22 - intrinsicWidth, i23 - intrinsicHeight, i22 + intrinsicWidth, i23 + intrinsicHeight);
                        drawable3.setAlpha((int) (f68 * d2));
                        drawable3.draw(canvas3);
                        drawable3.setAlpha(org.telegram.messenger.ks.e4);
                    }
                    canvas3.restore();
                }
                pgVar2.getLocationInWindow(pgVar2.w0);
                chatActivityEnterView2.getLocationInWindow(pgVar2.v0);
                chatActivityEnterView2.t0(pgVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
            }
        } else {
            j3 = currentTimeMillis;
            i7 = 2;
        }
        f14 = 0.0f;
        if (chatActivityEnterView.U4 == 0.0f) {
            f15 = measuredHeight;
            f16 = f39;
            f17 = 1.0f;
            float d11 = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.W1 >= 59000);
            f18 = chatActivityEnterView.d5;
            if (f18 != 0.0f) {
            }
            f19 = chatActivityEnterView.a5;
            if (f19 != 0.0f) {
            }
            canvas.save();
            int measuredWidth22 = getMeasuredWidth();
            int measuredHeight22 = getMeasuredHeight() - chatActivityEnterView.n2.getMeasuredHeight();
            if (chatActivityEnterView.I1) {
            }
            f22 = f20;
            i10 = 0;
            i11 = 0;
            canvas.clipRect(i10, i10, measuredWidth22, measuredHeight22 + i11);
            float f462 = chatActivityEnterView.W4;
            if (f17 - f462 != 0.0f) {
            }
            if (chatActivityEnterView.X4 >= 0.7f) {
            }
            chatActivityEnterView.S4 = false;
            f23 = chatActivityEnterView.e5;
            if (f23 != 0.0f) {
            }
            float N12 = org.telegram.messenger.g0.N(72.0f);
            float z142 = com.google.android.gms.internal.vision.e2.z(1.0f, f47, org.telegram.messenger.g0.N(24.0f) * f21, N12 * f47);
            float f512 = chatActivityEnterView.e5;
            float z152 = com.google.android.gms.internal.vision.e2.z(1.0f, f512, N12, z142);
            if (z152 > N12) {
            }
            float f532 = 1.0f - d11;
            float f542 = 1.0f - f22;
            float f552 = chatActivityEnterView.W4 * f532 * f542 * f512;
            float f562 = measuredWidth;
            float f572 = f37 + f52;
            canvas.scale(f552, f552, f562, f572);
            float f582 = f38 + f52;
            float f592 = f582 + f16;
            rectF7.set(f562 - org.telegram.messenger.g0.N(18.0f), f582, org.telegram.messenger.g0.N(18.0f) + f562, f592);
            z10 = this.y0;
            Paint paint42 = this.r;
            if (z10) {
            }
            chatActivityEnterView.G4.set(rectF);
            RectF rectF82 = chatActivityEnterView.G4;
            float centerX4 = rectF82.centerX();
            float centerY4 = rectF82.centerY();
            rectF82.left = org.telegram.messenger.g0.T1(centerX4, rectF82.left, f552);
            rectF82.right = org.telegram.messenger.g0.T1(centerX4, rectF82.right, f552);
            rectF82.top = org.telegram.messenger.g0.T1(centerY4, rectF82.top, f552);
            rectF82.bottom = org.telegram.messenger.g0.T1(centerY4, rectF82.bottom, f552);
            m3Var = pgVar.a;
            if (m3Var != null) {
            }
            float f602 = 1.0f - f13;
            float f612 = f26;
            rectF.set((f28 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(f26) * f602), f572 - (org.telegram.messenger.g0.N(f26) * f602), org.telegram.ui.Cells.c0.e(f612, f602, org.telegram.messenger.g0.L(6.0f) + i12), org.telegram.ui.Cells.c0.e(f612, f602, f572 + org.telegram.messenger.g0.L(12.0f)));
            float f622 = rectF.bottom;
            float centerX22 = rectF.centerX();
            float centerY22 = rectF.centerY();
            canvas2.save();
            float i192 = Utilities.i(Math.max(chatActivityEnterView.d5, chatActivityEnterView.z6) * f612, 1.0f, 0.0f);
            Paint paint52 = pgVar.s;
            int alpha3 = paint52.getAlpha();
            rectF2 = rectF;
            float f632 = f21;
            Paint paint62 = paint;
            Canvas canvas42 = canvas;
            int saveLayerAlpha2 = canvas42.saveLayerAlpha(centerX22 - org.telegram.messenger.g0.L(24.0f), centerY22 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX22, org.telegram.messenger.g0.L(24.0f) + centerY22, (int) (alpha3 * (1.0f - i192)), 31);
            Paint paint72 = pgVar.w;
            paint72.setAlpha(org.telegram.messenger.ks.e4);
            paint52.setAlpha(org.telegram.messenger.ks.e4);
            float f642 = 1.0f - L4;
            canvas42.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f642);
            canvas42.rotate(f40, centerX22, centerY22);
            interpolation = lr.j.getInterpolation(Utilities.i(f13, 1.0f, 0.0f));
            i13 = Utilities.i(interpolation / f27, 1.0f, 0.0f);
            float interpolation42 = lr.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
            float i202 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
            if (interpolation < 1.0f) {
            }
            f29 = L4;
            rectF3 = rectF2;
            f30 = 0.0f;
            Drawable drawable32 = pgVar.F;
            if (i192 > f30) {
            }
            if (f13 > f30) {
            }
            if (i13 < 1.0f) {
            }
            paint52.setAlpha(alpha3);
            paint72.setAlpha(alpha3);
            canvas42.restoreToCount(saveLayerAlpha2);
            if (drawable != null) {
            }
            i14 = Utilities.i((f29 - 0.55f) / 0.45f, 1.0f, 0.0f) * pgVar.h0.d((chatActivityEnterView.o0() || chatActivityEnterView.g5 || chatActivityEnterView.v1 || chatActivityEnterView.f5 || chatActivityEnterView.d5 != 0.0f || !chatActivityEnterView.t3) ? false : true);
            pgVar.n0 = i14;
            if (i14 > 0.01f) {
            }
            canvas42.restore();
            canvas42.restore();
            Canvas canvas52 = canvas42;
            pg pgVar32 = pgVar;
            float f662 = f52;
            pgVar32.c(f28, f15, chatActivityEnterView.e5 * chatActivityEnterView.W4 * f532 * f542, f662, canvas52);
            float L52 = (org.telegram.messenger.g0.L(38.0f) * f25) + org.telegram.messenger.g0.T1(f38, pgVar32.getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView.a5, Math.min(f632, chatActivityEnterView.e5))) + f662;
            rectF4.set(f28 - org.telegram.messenger.g0.N(18.0f), L52, org.telegram.messenger.g0.N(18.0f) + f28, L52 + f16);
            kg kgVar2 = chatActivityEnterView.N3;
            if (kgVar2 == null) {
            }
            chatActivityEnterView.Q = z11;
            if (z11) {
            }
            c6 c6Var2 = pgVar2.r0;
            c6Var2.getClass();
            e11 = c6Var2.e(false, 0.0f);
            ChatActivityEnterView chatActivityEnterView22 = pgVar2.Q0;
            RectF rectF112 = chatActivityEnterView22.G4;
            float d22 = pgVar2.s0.d(chatActivityEnterView22.S1);
            float d102 = pgVar2.t0.d(pgVar2.u0 >= 0);
            rectF5 = pgVar2.p0;
            if (e11 > 0.0f) {
            }
            rectF5.setEmpty();
            pgVar2.getLocationInWindow(pgVar2.w0);
            chatActivityEnterView22.getLocationInWindow(pgVar2.v0);
            chatActivityEnterView22.t0(pgVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
        }
        if (L4 >= 0.8f) {
        }
        chatActivityEnterView.S4 = false;
        if (chatActivityEnterView.S4) {
        }
        int i182 = (int) (chatActivityEnterView.U4 * 255.0f);
        this.c.setAlpha(i182);
        Drawable drawable22 = this.d;
        drawable22.setAlpha(i182);
        this.n.setAlpha(i182);
        if (this.f == null) {
        }
        float d112 = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.W1 >= 59000);
        f18 = chatActivityEnterView.d5;
        if (f18 != 0.0f) {
        }
        f19 = chatActivityEnterView.a5;
        if (f19 != 0.0f) {
        }
        canvas.save();
        int measuredWidth222 = getMeasuredWidth();
        int measuredHeight222 = getMeasuredHeight() - chatActivityEnterView.n2.getMeasuredHeight();
        if (chatActivityEnterView.I1) {
        }
        f22 = f20;
        i10 = 0;
        i11 = 0;
        canvas.clipRect(i10, i10, measuredWidth222, measuredHeight222 + i11);
        float f4622 = chatActivityEnterView.W4;
        if (f17 - f4622 != 0.0f) {
        }
        if (chatActivityEnterView.X4 >= 0.7f) {
        }
        chatActivityEnterView.S4 = false;
        f23 = chatActivityEnterView.e5;
        if (f23 != 0.0f) {
        }
        float N122 = org.telegram.messenger.g0.N(72.0f);
        float z1422 = com.google.android.gms.internal.vision.e2.z(1.0f, f47, org.telegram.messenger.g0.N(24.0f) * f21, N122 * f47);
        float f5122 = chatActivityEnterView.e5;
        float z1522 = com.google.android.gms.internal.vision.e2.z(1.0f, f5122, N122, z1422);
        if (z1522 > N122) {
        }
        float f5322 = 1.0f - d112;
        float f5422 = 1.0f - f22;
        float f5522 = chatActivityEnterView.W4 * f5322 * f5422 * f5122;
        float f5622 = measuredWidth;
        float f5722 = f37 + f52;
        canvas.scale(f5522, f5522, f5622, f5722);
        float f5822 = f38 + f52;
        float f5922 = f5822 + f16;
        rectF7.set(f5622 - org.telegram.messenger.g0.N(18.0f), f5822, org.telegram.messenger.g0.N(18.0f) + f5622, f5922);
        z10 = this.y0;
        Paint paint422 = this.r;
        if (z10) {
        }
        chatActivityEnterView.G4.set(rectF);
        RectF rectF822 = chatActivityEnterView.G4;
        float centerX42 = rectF822.centerX();
        float centerY42 = rectF822.centerY();
        rectF822.left = org.telegram.messenger.g0.T1(centerX42, rectF822.left, f5522);
        rectF822.right = org.telegram.messenger.g0.T1(centerX42, rectF822.right, f5522);
        rectF822.top = org.telegram.messenger.g0.T1(centerY42, rectF822.top, f5522);
        rectF822.bottom = org.telegram.messenger.g0.T1(centerY42, rectF822.bottom, f5522);
        m3Var = pgVar.a;
        if (m3Var != null) {
        }
        float f6022 = 1.0f - f13;
        float f6122 = f26;
        rectF.set((f28 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(f26) * f6022), f5722 - (org.telegram.messenger.g0.N(f26) * f6022), org.telegram.ui.Cells.c0.e(f6122, f6022, org.telegram.messenger.g0.L(6.0f) + i12), org.telegram.ui.Cells.c0.e(f6122, f6022, f5722 + org.telegram.messenger.g0.L(12.0f)));
        float f6222 = rectF.bottom;
        float centerX222 = rectF.centerX();
        float centerY222 = rectF.centerY();
        canvas2.save();
        float i1922 = Utilities.i(Math.max(chatActivityEnterView.d5, chatActivityEnterView.z6) * f6122, 1.0f, 0.0f);
        Paint paint522 = pgVar.s;
        int alpha32 = paint522.getAlpha();
        rectF2 = rectF;
        float f6322 = f21;
        Paint paint622 = paint;
        Canvas canvas422 = canvas;
        int saveLayerAlpha22 = canvas422.saveLayerAlpha(centerX222 - org.telegram.messenger.g0.L(24.0f), centerY222 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX222, org.telegram.messenger.g0.L(24.0f) + centerY222, (int) (alpha32 * (1.0f - i1922)), 31);
        Paint paint722 = pgVar.w;
        paint722.setAlpha(org.telegram.messenger.ks.e4);
        paint522.setAlpha(org.telegram.messenger.ks.e4);
        float f6422 = 1.0f - L4;
        canvas422.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f6422);
        canvas422.rotate(f40, centerX222, centerY222);
        interpolation = lr.j.getInterpolation(Utilities.i(f13, 1.0f, 0.0f));
        i13 = Utilities.i(interpolation / f27, 1.0f, 0.0f);
        float interpolation422 = lr.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
        float i2022 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
        if (interpolation < 1.0f) {
        }
        f29 = L4;
        rectF3 = rectF2;
        f30 = 0.0f;
        Drawable drawable322 = pgVar.F;
        if (i1922 > f30) {
        }
        if (f13 > f30) {
        }
        if (i13 < 1.0f) {
        }
        paint522.setAlpha(alpha32);
        paint722.setAlpha(alpha32);
        canvas422.restoreToCount(saveLayerAlpha22);
        if (drawable != null) {
        }
        i14 = Utilities.i((f29 - 0.55f) / 0.45f, 1.0f, 0.0f) * pgVar.h0.d((chatActivityEnterView.o0() || chatActivityEnterView.g5 || chatActivityEnterView.v1 || chatActivityEnterView.f5 || chatActivityEnterView.d5 != 0.0f || !chatActivityEnterView.t3) ? false : true);
        pgVar.n0 = i14;
        if (i14 > 0.01f) {
        }
        canvas422.restore();
        canvas422.restore();
        Canvas canvas522 = canvas422;
        pg pgVar322 = pgVar;
        float f6622 = f52;
        pgVar322.c(f28, f15, chatActivityEnterView.e5 * chatActivityEnterView.W4 * f5322 * f5422, f6622, canvas522);
        float L522 = (org.telegram.messenger.g0.L(38.0f) * f25) + org.telegram.messenger.g0.T1(f38, pgVar322.getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView.a5, Math.min(f6322, chatActivityEnterView.e5))) + f6622;
        rectF4.set(f28 - org.telegram.messenger.g0.N(18.0f), L522, org.telegram.messenger.g0.N(18.0f) + f28, L522 + f16);
        kg kgVar22 = chatActivityEnterView.N3;
        if (kgVar22 == null) {
        }
        chatActivityEnterView.Q = z11;
        if (z11) {
        }
        c6 c6Var22 = pgVar2.r0;
        c6Var22.getClass();
        e11 = c6Var22.e(false, 0.0f);
        ChatActivityEnterView chatActivityEnterView222 = pgVar2.Q0;
        RectF rectF1122 = chatActivityEnterView222.G4;
        float d222 = pgVar2.s0.d(chatActivityEnterView222.S1);
        float d1022 = pgVar2.t0.d(pgVar2.u0 >= 0);
        rectF5 = pgVar2.p0;
        if (e11 > 0.0f) {
        }
        rectF5.setEmpty();
        pgVar2.getLocationInWindow(pgVar2.w0);
        chatActivityEnterView222.getLocationInWindow(pgVar2.v0);
        chatActivityEnterView222.t0(pgVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i7) {
        return super.onSetAlpha(i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        RectF rectF = chatActivityEnterView.G4;
        if (chatActivityEnterView.I1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int h = h(x10, y10);
                this.u0 = h;
                if (h >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.u0 >= 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.u0 = -1;
                        invalidate();
                        return true;
                    }
                }
                if (h(x10, y10) >= 0) {
                    chatActivityEnterView.O1(!chatActivityEnterView.S1, true);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.u0 = -1;
                invalidate();
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        int i7 = 0;
        if (action == 0) {
            if (chatActivityEnterView.g5) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(rectF);
                rectF3.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
                this.P0 = !rectF.isEmpty() && rectF3.contains((float) x10, (float) y10);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.B2 != null && chatActivityEnterView.b5 > 0.1f) {
                this.O0 = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(rectF);
            rectF4.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
            if (this.P0 && rectF4.contains(x10, y10)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.t3) {
                        if (chatActivityEnterView.y6) {
                            chatActivityEnterView.l0(false, true);
                            chatActivityEnterView.w0().F(true);
                        } else {
                            gf gfVar = chatActivityEnterView.F0;
                            if (gfVar == null || gfVar.length() == 0) {
                                chatActivityEnterView.k0();
                                return true;
                            }
                            chatActivityEnterView.l0(true, true);
                            ai.n0 n0Var = chatActivityEnterView.j1;
                            if (n0Var != null && n0Var.o0 && n0Var.r == 1) {
                                n0Var.s();
                            }
                        }
                        try {
                            chatActivityEnterView.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                if (chatActivityEnterView.d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.N3.l1();
                } else {
                    lg lgVar = new lg(this, i7);
                    hi.m3 m3Var = this.a;
                    if (m3Var != null && m3Var.W) {
                        f();
                    }
                    if (chatActivityEnterView.I1) {
                        chatActivityEnterView.O1(false, false);
                        org.telegram.messenger.g0.r(chatActivityEnterView.V1);
                        chatActivityEnterView.H1(true);
                    }
                    xi0 xi0Var = chatActivityEnterView.i1;
                    if (xi0Var != null) {
                        xi0Var.setPlaying(false);
                    }
                    if (!MediaController.B().K() || (chatActivityEnterView.i1.getAudioLeft() <= 0.01f && chatActivityEnterView.i1.getAudioRight() >= 0.99f)) {
                        lgVar.run();
                    } else {
                        mg mgVar = new mg(i7, this, lgVar);
                        if (org.telegram.messenger.mp.g1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.K4);
                            String M0 = org.telegram.messenger.gd.M0(2131746153, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M0;
                            u1Var.U = org.telegram.messenger.gd.M0(2131746154, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new b0(mgVar, 18));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            alertDialog$Builder.p();
                        } else {
                            mgVar.run();
                        }
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            }
            if (this.O0 && rectF2.contains(x10, y10)) {
                boolean z10 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z10;
                this.E.d(1, z10, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(chatActivityEnterView.R);
                long j3 = chatActivityEnterView.E3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                d02.j2(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.d(), chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    i();
                } else {
                    f();
                }
                invalidate();
                this.O0 = false;
                this.P0 = false;
                return true;
            }
            this.O0 = false;
            this.P0 = false;
        } else if (motionEvent.getAction() == 3) {
            this.O0 = false;
            this.P0 = false;
        }
        return this.P0 || this.O0;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(dh.c cVar) {
        this.y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.J1 = cVar;
        if (this.x0 == null) {
            this.x0 = new gh.b(org.telegram.ui.ActionBar.n6.Re, chatActivityEnterView.K4);
        }
        fh.g c10 = cVar.c(this, this.x0, false);
        this.z0 = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.z0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c11 = cVar.c(this, this.x0, false);
        this.A0 = c11;
        c11.r(org.telegram.messenger.g0.L(18.0f));
        this.A0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c12 = cVar.c(this, this.x0, false);
        this.o0 = c12;
        c12.r(org.telegram.messenger.g0.L(18.0f));
        this.o0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c13 = cVar.c(this, this.x0, false);
        this.R = c13;
        c13.r(org.telegram.messenger.g0.L(18.0f));
        fh.g gVar = this.R;
        gVar.W = 0.0f;
        gVar.q(org.telegram.messenger.g0.L(3.0f));
        this.B0 = false;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        hi.m mVar = this.E;
        if (mVar == null || (textPaint = this.n) == null || (drawable = this.F) == null || (drawable2 = this.G) == null) {
            return;
        }
        gh.b bVar = this.x0;
        if (bVar != null) {
            bVar.d();
        }
        fh.g gVar = this.z0;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.A0;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.o0;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        fh.g gVar4 = this.R;
        if (gVar4 != null) {
            gVar4.updateColors();
        }
        int i7 = this.y0 ? org.telegram.ui.ActionBar.n6.Nl : org.telegram.ui.ActionBar.n6.Qe;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        mVar.e(chatActivityEnterView.C0(i7), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Uf), -1);
        textPaint.setColor(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.gg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.n6.C1(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg), shapeDrawable);
        } else {
            this.c = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg));
        }
        int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg);
        Drawable drawable3 = this.d;
        if (drawable3 != null && C0 != this.L0) {
            this.L0 = C0;
            drawable3.setColorFilter(new PorterDuffColorFilter(C0, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Re));
        this.s.setColor(chatActivityEnterView.C0(this.y0 ? org.telegram.ui.ActionBar.n6.Nl : org.telegram.ui.ActionBar.n6.Qe));
        this.w.setColor(chatActivityEnterView.C0(this.y0 ? org.telegram.ui.ActionBar.n6.Nl : org.telegram.ui.ActionBar.n6.Qe));
        int C02 = chatActivityEnterView.C0(this.y0 ? org.telegram.ui.ActionBar.n6.Nl : org.telegram.ui.ActionBar.n6.Qe);
        if (this.N0 && C02 == this.M0) {
            return;
        }
        this.N0 = true;
        this.M0 = C02;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(C02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(C02, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

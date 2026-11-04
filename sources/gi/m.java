package gi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.cd;
import b8.mf;
import b8.pf;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.ro0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public ly0 D0;
    public final Paint E;
    public ly0 E0;
    public final LinearGradient F;
    public Path F0;
    public final Matrix G;
    public Paint G0;
    public Bitmap H;
    public Path H0;
    public final TextPaint I;
    public float[] I0;
    public final Paint J;
    public final Path J0;
    public final FrameLayout K;
    public boolean K0;
    public final qt0 L;
    public int L0;
    public final p3 M;
    public final org.telegram.ui.Components.u5 M0;
    public i N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.x9 P;
    public Paint P0;
    public final org.telegram.ui.Components.ba Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.ba R;
    public Matrix R0;
    public final org.telegram.ui.Components.ba S;
    public final org.telegram.ui.Components.ba T;
    public org.telegram.ui.Components.ba U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.e6 a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final eh.j c;
    public int c0;
    public final eh.j d;
    public final e d0;
    public final Paint e;
    public boolean e0;
    public final g f;
    public final gc f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public eh.c h0;
    public gh.g i0;
    public u10 j0;
    public u10 k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final xp n;
    public final e n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final j r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final org.telegram.ui.Components.u5 v0;
    public final org.telegram.ui.Components.h6 w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public m(Context context, FrameLayout frameLayout, qt0 qt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        eh.j jVar = new eh.j();
        this.c = jVar;
        eh.j jVar2 = new eh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = h10.t0;
        this.d0 = new e(this, 0);
        this.f0 = new gc(this, 1.0f, 3.0f);
        this.n0 = new e(this, 1);
        xq xqVar = xq.h;
        this.v0 = new org.telegram.ui.Components.u5(this, 0L, 300L, xqVar);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.u5(this, 500L, xqVar);
        this.a = e6Var;
        this.K = frameLayout;
        this.L = qt0Var;
        this.b = frameLayout2;
        this.P = x9Var;
        this.S = new org.telegram.ui.Components.ba(x9Var, this, 0, !g());
        this.T = new org.telegram.ui.Components.ba(x9Var, this, 8, false);
        this.R = new org.telegram.ui.Components.ba(x9Var, this, 9, false);
        jVar.l = true;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        jVar.a = new f(e6Var, i3, 0.0f, 0);
        jVar.a();
        jVar.g.setColor(0);
        jVar.invalidateSelf();
        jVar2.l = true;
        jVar2.a = new f(e6Var, i3, 0.0f, 1);
        jVar2.a();
        jVar2.g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.M = new p3(frameLayout, false, new ai.v2(this, 19));
        g gVar = new g(this, context, qt0Var, getEditTextStyle(), new ei.b(), e6Var, x9Var);
        this.f = gVar;
        gVar.T = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().r0 = true;
        gVar.getEditText().t0 = new ai.c(this, 25);
        gVar.getEditText().setSupportRtlHint(true);
        this.Q = new org.telegram.ui.Components.ba(x9Var, gVar.getEditText(), g() ? 1 : 2, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().r(bd.M0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z10 = this instanceof ro0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        gVar.getEmojiButton().setTranslationY(org.telegram.messenger.g0.L(z10 ? 1.0f : -1.0f));
        gVar.setTranslationY(org.telegram.messenger.g0.L(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        addView(gVar, mf.d(-1, -2.0f, (z10 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.r = jVar3;
        pf.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.SRC_IN);
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ng, e6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.n = xpVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        xpVar.h = L;
        xpVar.n = L2;
        jVar3.setImageDrawable(xpVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(bd.M0(2131751355, null));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ai.b(this, 23));
        addView(jVar3, mf.d(44, 44.0f, (z10 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.w = h6Var;
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTextColor(-1);
        h6Var.b(0.4f, 320L, xqVar);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        frameLayout3.addView(h6Var, mf.e(52, 16, (z10 ? 48 : 80) | 5));
        addView(frameLayout3, mf.d(52, 16.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 50 : 0, 0.0f, z10 ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z10);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0221, code lost:
    
        if ((r2 <= 0.0f ? r10 : 0) != (r11 <= 0.0f ? r10 : 0)) goto L65;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f10;
        m mVar;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        int i3;
        int i10;
        int i11;
        RectF rectF2;
        org.telegram.ui.Components.ba baVar;
        org.telegram.ui.Components.ba baVar2;
        float f14;
        float f15;
        Paint paint;
        RectF rectF3;
        float f16;
        int min;
        Canvas canvas2 = canvas;
        if (this.y0) {
            return;
        }
        g gVar = this.f;
        int height = gVar.getHeight();
        int L = this.K0 ? org.telegram.messenger.g0.L(44.0f) : this.p0 ? Math.max(org.telegram.messenger.g0.L(44.0f), height) : Math.min(org.telegram.messenger.g0.L(82.0f), height);
        if (!this.K0 && this.C0) {
            L += org.telegram.messenger.g0.L(50.0f);
        }
        float f17 = L;
        int e10 = (int) this.v0.e(false, f17);
        if (e10 != this.w0) {
            r(e10);
            u10 u10Var = this.j0;
            if (u10Var != null) {
                u10Var.a(Integer.valueOf(e10));
            }
            this.w0 = L;
        }
        y();
        int L2 = org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        boolean z10 = this instanceof ro0;
        RectF rectF4 = this.B0;
        RectF rectF5 = this.A0;
        if (z10) {
            if (!this.K0) {
                float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-1.0f), org.telegram.messenger.g0.N(1.0f), this.o0);
                xs editText = gVar.getEditText();
                this.x0 = T1;
                editText.setTranslationY(T1);
            }
            float f18 = L2;
            float f19 = L3;
            rectF5.set(f18, f19, getWidth() - L2, L3 + e10);
            rectF4.set(f18, f19, getWidth() - L2, org.telegram.messenger.g0.L(24.0f) + r4);
            f10 = 82.0f;
        } else {
            f10 = 82.0f;
            float T12 = (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(-1.0f), this.o0) + f17) - e10;
            if (Math.abs(this.x0 - T12) >= 1.0f && !this.K0) {
                xs editText2 = gVar.getEditText();
                this.x0 = T12;
                editText2.setTranslationY(T12);
            }
            rectF5.set(L2, (getHeight() - L3) - e10, getWidth() - L2, getHeight() - L3);
            rectF4.set(0.0f, (getHeight() - e10) - org.telegram.messenger.g0.L(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a10 = this.f0.a(0.018f);
        canvas2.scale(a10, a10, rectF5.centerX(), rectF5.centerY());
        float W1 = org.telegram.messenger.g0.W1(this.o0 * 0.0f, org.telegram.messenger.g0.L(21.0f), 0);
        eh.c cVar = this.h0;
        if (cVar != null) {
            if (this.i0 == null) {
                gh.g c2 = cVar.c(this, null, false);
                c2.p(cd.i(this.a));
                c2.q(org.telegram.messenger.g0.L(5.0f));
                c2.r(org.telegram.messenger.g0.L(22.0f));
                this.i0 = c2;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF5.round(rect);
            rect.inset(-org.telegram.messenger.g0.W1(this.o0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f)), -org.telegram.messenger.g0.L(5.0f));
            this.i0.setBounds(rect);
            this.i0.draw(canvas2);
            mVar = this;
            rectF = rectF5;
            f11 = W1;
            f12 = 21.0f;
            f13 = 50.0f;
            i3 = 1;
        } else {
            boolean g7 = g();
            Paint paint2 = this.e;
            if (g7) {
                f13 = 50.0f;
                f12 = 21.0f;
                i3 = 1;
                h(this.S, canvas, rectF5, W1, false, 0.0f, 0.0f, true);
                mVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f11 = W1;
                paint2.setAlpha(org.telegram.messenger.g0.W1(mVar.o0, 38, 64));
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
            } else {
                mVar = this;
                rectF = rectF5;
                f11 = W1;
                f12 = 21.0f;
                f13 = 50.0f;
                i3 = 1;
                Paint[] d = mVar.S.d();
                if (d[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                } else {
                    Paint paint3 = d[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint3);
                    }
                    Paint paint4 = d[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                }
            }
        }
        org.telegram.ui.Components.u5 u5Var = mVar.M0;
        float f20 = u5Var.c;
        float d10 = u5Var.d(mVar.K0);
        if (Math.abs(f20 - d10) <= 0.001f) {
        }
        mVar.n();
        if (d10 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, hs.e4, 31);
        }
        if (!mVar.C0 || (baVar = mVar.T) == null || (baVar2 = mVar.R) == null) {
            i10 = i3;
            i11 = 3;
            rectF2 = rectF;
        } else {
            if (mVar.K0) {
                if (mVar.p0) {
                    f16 = rectF.bottom;
                    min = Math.max(org.telegram.messenger.g0.L(46.0f), gVar.getHeight());
                } else {
                    f16 = rectF.bottom;
                    min = Math.min(org.telegram.messenger.g0.L(f10), gVar.getHeight());
                }
                float f21 = f16 - min;
                f14 = f21 - org.telegram.messenger.g0.L(f13);
                f15 = 1.0f - u5Var.c;
            } else {
                f14 = rectF.top;
                f15 = 1.0f;
            }
            float f22 = f14;
            Paint c10 = baVar.c(f15);
            Paint c11 = baVar2.c(f15);
            RectF rectF6 = org.telegram.messenger.g0.P;
            rectF6.set(rectF.left + org.telegram.messenger.g0.L(10.0f), f22 + org.telegram.messenger.g0.L(10.0f), rectF.right - org.telegram.messenger.g0.L(10.0f), f22 + org.telegram.messenger.g0.L(52.0f));
            if (c10 != null) {
                canvas2.drawRoundRect(rectF6, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), c10);
            }
            if (c11 != null) {
                paint = c11;
                rectF3 = rectF6;
                i10 = i3;
                i11 = 3;
                rectF2 = rectF;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, hs.e4, 31);
                canvas2 = canvas;
            } else {
                paint = c11;
                rectF3 = rectF6;
                i10 = i3;
                i11 = 3;
                rectF2 = rectF;
            }
            Path path = mVar.F0;
            if (path == null) {
                mVar.F0 = new Path();
            } else {
                path.rewind();
            }
            float W12 = org.telegram.messenger.g0.W1(mVar.o0, org.telegram.messenger.g0.L(f12), 0);
            Path path2 = mVar.F0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, W12, W12, direction);
            canvas2.clipPath(mVar.F0);
            ly0 ly0Var = mVar.D0;
            if (ly0Var != null) {
                ly0Var.p = (int) (rectF2.width() - org.telegram.messenger.g0.L(40.0f));
                ly0Var.c(rectF2.left + org.telegram.messenger.g0.L(20.0f), f22 + org.telegram.messenger.g0.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = mVar.H0;
            if (path3 == null) {
                mVar.H0 = new Path();
                float[] fArr = new float[8];
                mVar.I0 = fArr;
                float L4 = org.telegram.messenger.g0.L(5.0f);
                fArr[i10] = L4;
                fArr[0] = L4;
                float[] fArr2 = mVar.I0;
                fArr2[i11] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float L5 = org.telegram.messenger.g0.L(5.0f);
                fArr2[7] = L5;
                fArr2[6] = L5;
            } else {
                path3.rewind();
            }
            float f23 = rectF3.left;
            rectF3.set(f23, rectF3.top, org.telegram.messenger.g0.L(3.0f) + f23, rectF3.bottom);
            mVar.H0.addRoundRect(rectF3, mVar.I0, direction);
            if (mVar.G0 == null) {
                Paint paint5 = new Paint();
                mVar.G0 = paint5;
                paint5.setColor(-1);
            }
            mVar.G0.setAlpha((int) (f15 * 255.0f));
            canvas2.drawPath(mVar.H0, mVar.G0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            ly0 ly0Var2 = mVar.E0;
            if (ly0Var2 != null) {
                ly0Var2.p = (int) (rectF2.width() - org.telegram.messenger.g0.L(40.0f));
                ly0Var2.c(rectF2.left + org.telegram.messenger.g0.L(20.0f), f22 + org.telegram.messenger.g0.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d10 > 0.0f) {
            int i12 = mVar.L0;
            float L6 = i12 == Integer.MAX_VALUE ? rectF2.right - org.telegram.messenger.g0.L(20.0f) : i12 == Integer.MIN_VALUE ? rectF2.left + org.telegram.messenger.g0.L(20.0f) : i12;
            float L7 = rectF2.bottom - org.telegram.messenger.g0.L(20.0f);
            float max = Math.max(Math.max(a7.h.a(rectF2.left, rectF2.top, L6, L7), a7.h.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(a7.h.a(rectF2.right, rectF2.top, L6, L7), a7.h.a(rectF2.right, rectF2.bottom, L6, L7))) * d10;
            if (mVar.N0 == null) {
                Paint paint6 = new Paint(i10);
                mVar.N0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i11];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                mVar.O0 = radialGradient;
                mVar.N0.setShader(radialGradient);
                mVar.R0 = new Matrix();
                Paint paint7 = new Paint(1);
                mVar.P0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                mVar.Q0 = radialGradient2;
                mVar.P0.setShader(radialGradient2);
            }
            mVar.R0.reset();
            mVar.R0.postTranslate(L6, L7);
            mVar.R0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.O0.setLocalMatrix(mVar.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, mVar.N0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, hs.e4, 31);
            mVar.j(canvas2, rectF2);
            mVar.R0.reset();
            mVar.R0.postTranslate(L6, L7);
            mVar.R0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.Q0.setLocalMatrix(mVar.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, mVar.P0);
            canvas2.restore();
            canvas2.restore();
            if (!(mVar instanceof la)) {
                mVar.k(canvas2, rectF2, d10);
            }
        }
        canvas2.restore();
        if (mVar.h0 == null) {
            Path path4 = mVar.J0;
            path4.rewind();
            path4.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            eh.j jVar = mVar.c;
            jVar.m = f11;
            jVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            jVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                gc gcVar = this.f0;
                if (action != 0 || this.p0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        gcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof r) && ((r) this).O1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i3 = 0;
                while (true) {
                    int childCount = getChildCount();
                    g gVar = this.f;
                    if (i3 >= childCount) {
                        this.M.b(false);
                        gVar.getEditText().setForceCursorEnd(true);
                        gVar.getEditText().requestFocus();
                        dt dtVar = gVar.a;
                        dtVar.requestFocus();
                        org.telegram.messenger.g0.K3(dtVar);
                        gVar.getEditText().setScrollY(0);
                        gcVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                        float x10 = childAt.getX();
                        float y9 = childAt.getY();
                        float x11 = childAt.getX() + childAt.getWidth();
                        float y10 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.z0;
                        rectF.set(x10, y9, x11, y10);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float max;
        RectF rectF = this.A0;
        if (view != this.f) {
            if (!f(view)) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        if (this instanceof ro0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.o0) * Math.max(0, (r0.getHeight() - org.telegram.messenger.g0.L(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), hs.e4, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.G;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.F;
        linearGradient.setLocalMatrix(matrix);
        float f10 = rectF.left;
        float f11 = rectF.top;
        Paint paint = this.E;
        canvas.drawRect(f10, f11, rectF.right, org.telegram.messenger.g0.L(10.0f) + f11, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - org.telegram.messenger.g0.L(10.0f), rectF.right, rectF.bottom, paint);
        canvas.restore();
        canvas.restore();
        return drawChild2;
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public abstract boolean g();

    public RectF getBounds() {
        return this.A0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return h10.i(this.V).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.x;
    }

    public int getEditTextHeight() {
        return (int) this.v0.c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.g0.L(82.0f), this.f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.c;
    }

    public int getSelectionLength() {
        g gVar = this.f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.N;
        if (iVar != null) {
            iVar.invalidate();
        }
        if (gVar.getEmojiView() == null || !g()) {
            return;
        }
        gVar.getEmojiView().invalidate();
    }

    public final boolean o() {
        return getCodePointCount() > getCaptionLimit();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            Bitmap bitmap = this.H;
            if (bitmap != null) {
                bitmap.recycle();
                this.H = null;
            }
            TextPaint textPaint = this.I;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            String M0 = bd.M0(2131754454, null);
            this.H = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.H).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.s0 = null;
        this.u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        g gVar = this.f;
        boolean z10 = gVar.y;
        p3 p3Var = this.M;
        if (z10 && gVar.getEmojiView() != null) {
            if (p3Var.c()) {
                gVar.getEmojiView().A();
                return true;
            }
            et etVar = gVar.d;
            if (etVar != null) {
                etVar.A();
                gVar.d.t(false);
            }
            return true;
        }
        if (gVar.e) {
            gVar.k(true);
            return true;
        }
        if ((!gVar.w && !p3Var.c()) || p3Var.d) {
            return false;
        }
        gVar.d();
        gVar.k(true);
        return true;
    }

    public void setAccount(int i3) {
        this.V = i3;
    }

    public void setBlurredBackgroundDrawableForMentions(eh.c cVar) {
        this.h0 = cVar;
    }

    public void setDialogId(long j10) {
        this.y = j10;
        i iVar = this.N;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(u10 u10Var) {
        this.j0 = u10Var;
    }

    public void setOnKeyboardOpen(u10 u10Var) {
        this.k0 = u10Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f0.c(z10 && !this.p0);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f.setText(charSequence);
    }

    public abstract void u(float f10);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.C0 = false;
            invalidate();
            return;
        }
        this.C0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.D0 = new ly0(charSequence2, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new ly0(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof r;
    }

    public void x(int i3) {
        qt0 qt0Var = this.L;
        if (qt0Var != null) {
            qt0Var.R();
        }
        g gVar = this.f;
        if (gVar.e) {
            i3 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.O) {
            i3 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i3 - (qt0Var == null ? 0 : qt0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ro0)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.l0.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                this.l0.setDuration(250L);
            } else {
                this.l0.setInterpolator(xq.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        this.m0 = max > org.telegram.messenger.g0.L(20.0f);
        e eVar = this.n0;
        org.telegram.messenger.g0.r(eVar);
        org.telegram.messenger.g0.h3(eVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.v0.c;
            if (this.N.getY() != translationY) {
                this.N.setTranslationY(translationY);
                this.N.invalidate();
            }
        }
    }

    public void q(boolean z10) {
    }

    public void r(int i3) {
    }

    public void setUiBlurBitmap(w10 w10Var) {
    }

    public void n() {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i3, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}

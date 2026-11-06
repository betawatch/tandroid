package fi;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.e20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.ap0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout {
    public final RectF A0;
    public boolean B0;
    public my0 C0;
    public final Paint D;
    public my0 D0;
    public final LinearGradient E;
    public Path E0;
    public final Matrix F;
    public Paint F0;
    public Bitmap G;
    public Path G0;
    public final TextPaint H;
    public float[] H0;
    public final Paint I;
    public final Path I0;
    public final FrameLayout J;
    public boolean J0;
    public final rt0 K;
    public int K0;
    public final q3 L;
    public final org.telegram.ui.Components.w5 L0;
    public i M;
    public Paint M0;
    public int N;
    public RadialGradient N0;
    public final org.telegram.ui.Components.y9 O;
    public Paint O0;
    public final org.telegram.ui.Components.ca P;
    public RadialGradient P0;
    public final org.telegram.ui.Components.ca Q;
    public Matrix Q0;
    public final org.telegram.ui.Components.ca R;
    public final org.telegram.ui.Components.ca S;
    public org.telegram.ui.Components.ca T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 a;
    public int a0;
    public final FrameLayout b;
    public int b0;
    public final dh.j c;
    public final e c0;
    public final dh.j d;
    public boolean d0;
    public final Paint e;
    public final ic e0;
    public final g f;
    public ObjectAnimator f0;
    public dh.c g0;
    public final Drawable h;
    public fh.g h0;
    public c20 i0;
    public c20 j0;
    public ObjectAnimator k0;
    public boolean l0;
    public final e m0;
    public final xp n;
    public float n0;
    public boolean o0;
    public ValueAnimator p0;
    public Bitmap q0;
    public final j r;
    public BitmapShader r0;
    public final FrameLayout s;
    public Matrix s0;
    public Paint t0;
    public final org.telegram.ui.Components.w5 u0;
    public int v0;
    public final org.telegram.ui.Components.j6 w;
    public float w0;
    public int x;
    public boolean x0;
    public long y;
    public final RectF y0;
    public final RectF z0;

    public m(Context context, FrameLayout frameLayout, rt0 rt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.y9 y9Var) {
        super(context);
        dh.j jVar = new dh.j();
        this.c = jVar;
        dh.j jVar2 = new dh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.D = paint2;
        int i7 = 0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = p10.s0;
        this.c0 = new e(this, i7);
        this.e0 = new ic(this, 1.0f, 3.0f);
        this.m0 = new e(this, 1);
        xq xqVar = xq.h;
        this.u0 = new org.telegram.ui.Components.w5(this, 0L, 300L, xqVar);
        this.x0 = false;
        this.y0 = new RectF();
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.I0 = new Path();
        this.L0 = new org.telegram.ui.Components.w5(this, 500L, xqVar);
        this.a = f6Var;
        this.J = frameLayout;
        this.K = rt0Var;
        this.b = frameLayout2;
        this.O = y9Var;
        this.R = new org.telegram.ui.Components.ca(y9Var, this, 0, !g());
        this.S = new org.telegram.ui.Components.ca(y9Var, this, 8, false);
        this.Q = new org.telegram.ui.Components.ca(y9Var, this, 9, false);
        jVar.l = true;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        float f10 = 0.0f;
        jVar.a = new f(f6Var, i10, f10, i7);
        jVar.a();
        jVar.g.setColor(0);
        jVar.invalidateSelf();
        jVar2.l = true;
        jVar2.a = new f(f6Var, i10, f10, 1);
        jVar2.a();
        jVar2.g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.L = new q3(frameLayout, false, new ai.i(this, 16));
        g gVar = new g(this, context, rt0Var, getEditTextStyle(), new di.b(), f6Var, y9Var);
        this.f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().q0 = true;
        gVar.getEditText().s0 = new ai.e(this, 15);
        gVar.getEditText().setSupportRtlHint(true);
        this.P = new org.telegram.ui.Components.ca(y9Var, gVar.getEditText(), g() ? 1 : 2, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().r(hd.M0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z9 = this instanceof ap0;
        if (z9) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        gVar.getEmojiButton().setTranslationY(org.telegram.messenger.g0.L(z9 ? 1.0f : -1.0f));
        gVar.setTranslationY(org.telegram.messenger.g0.L(z9 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        addView(gVar, c8.ha.d(-1, -2.0f, (z9 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.r = jVar3;
        c8.ka.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.SRC_IN);
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ng, f6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.n = xpVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        xpVar.h = L;
        xpVar.n = L2;
        jVar3.setImageDrawable(xpVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(hd.M0(2131751355, null));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.d(this, 20));
        addView(jVar3, c8.ha.d(44, 44.0f, (z9 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.w = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, xqVar);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        frameLayout3.addView(j6Var, c8.ha.e(52, 16, (z9 ? 48 : 80) | 5));
        addView(frameLayout3, c8.ha.d(52, 16.0f, (z9 ? 48 : 80) | 5, 0.0f, z9 ? 50 : 0, 0.0f, z9 ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z9);

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z9);

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
        int i7;
        int i10;
        int i11;
        RectF rectF2;
        org.telegram.ui.Components.ca caVar;
        org.telegram.ui.Components.ca caVar2;
        float f14;
        float f15;
        Paint paint;
        RectF rectF3;
        float f16;
        int min;
        Canvas canvas2 = canvas;
        if (this.x0) {
            return;
        }
        g gVar = this.f;
        int height = gVar.getHeight();
        int L = this.J0 ? org.telegram.messenger.g0.L(44.0f) : this.o0 ? Math.max(org.telegram.messenger.g0.L(44.0f), height) : Math.min(org.telegram.messenger.g0.L(82.0f), height);
        if (!this.J0 && this.B0) {
            L += org.telegram.messenger.g0.L(50.0f);
        }
        float f17 = L;
        int e10 = (int) this.u0.e(false, f17);
        if (e10 != this.v0) {
            r(e10);
            c20 c20Var = this.i0;
            if (c20Var != null) {
                c20Var.a(Integer.valueOf(e10));
            }
            this.v0 = L;
        }
        y();
        int L2 = org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        boolean z9 = this instanceof ap0;
        RectF rectF4 = this.A0;
        RectF rectF5 = this.z0;
        if (z9) {
            if (!this.J0) {
                float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-1.0f), org.telegram.messenger.g0.N(1.0f), this.n0);
                ys editText = gVar.getEditText();
                this.w0 = T1;
                editText.setTranslationY(T1);
            }
            float f18 = L2;
            float f19 = L3;
            rectF5.set(f18, f19, getWidth() - L2, L3 + e10);
            rectF4.set(f18, f19, getWidth() - L2, org.telegram.messenger.g0.L(24.0f) + r4);
            f10 = 82.0f;
        } else {
            f10 = 82.0f;
            float T12 = (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(-1.0f), this.n0) + f17) - e10;
            if (Math.abs(this.w0 - T12) >= 1.0f && !this.J0) {
                ys editText2 = gVar.getEditText();
                this.w0 = T12;
                editText2.setTranslationY(T12);
            }
            rectF5.set(L2, (getHeight() - L3) - e10, getWidth() - L2, getHeight() - L3);
            rectF4.set(0.0f, (getHeight() - e10) - org.telegram.messenger.g0.L(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a10 = this.e0.a(0.018f);
        canvas2.scale(a10, a10, rectF5.centerX(), rectF5.centerY());
        float W1 = org.telegram.messenger.g0.W1(this.n0 * 0.0f, org.telegram.messenger.g0.L(21.0f), 0);
        dh.c cVar = this.g0;
        if (cVar != null) {
            if (this.h0 == null) {
                fh.g c10 = cVar.c(this, null, false);
                c10.p(c8.g0.i(this.a));
                c10.q(org.telegram.messenger.g0.L(5.0f));
                c10.r(org.telegram.messenger.g0.L(22.0f));
                this.h0 = c10;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF5.round(rect);
            rect.inset(-org.telegram.messenger.g0.W1(this.n0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f)), -org.telegram.messenger.g0.L(5.0f));
            this.h0.setBounds(rect);
            this.h0.draw(canvas2);
            mVar = this;
            rectF = rectF5;
            f11 = W1;
            f12 = 21.0f;
            f13 = 50.0f;
            i7 = 1;
        } else {
            boolean g10 = g();
            Paint paint2 = this.e;
            if (g10) {
                f13 = 50.0f;
                f12 = 21.0f;
                i7 = 1;
                h(this.R, canvas, rectF5, W1, false, 0.0f, 0.0f, true);
                mVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f11 = W1;
                paint2.setAlpha(org.telegram.messenger.g0.W1(mVar.n0, 38, 64));
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
            } else {
                mVar = this;
                rectF = rectF5;
                f11 = W1;
                f12 = 21.0f;
                f13 = 50.0f;
                i7 = 1;
                Paint[] d = mVar.R.d();
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
        org.telegram.ui.Components.w5 w5Var = mVar.L0;
        float f20 = w5Var.c;
        float d2 = w5Var.d(mVar.J0);
        if (Math.abs(f20 - d2) <= 0.001f) {
        }
        mVar.n();
        if (d2 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, qs.e4, 31);
        }
        if (!mVar.B0 || (caVar = mVar.S) == null || (caVar2 = mVar.Q) == null) {
            i10 = i7;
            i11 = 3;
            rectF2 = rectF;
        } else {
            if (mVar.J0) {
                if (mVar.o0) {
                    f16 = rectF.bottom;
                    min = Math.max(org.telegram.messenger.g0.L(46.0f), gVar.getHeight());
                } else {
                    f16 = rectF.bottom;
                    min = Math.min(org.telegram.messenger.g0.L(f10), gVar.getHeight());
                }
                float f21 = f16 - min;
                f14 = f21 - org.telegram.messenger.g0.L(f13);
                f15 = 1.0f - w5Var.c;
            } else {
                f14 = rectF.top;
                f15 = 1.0f;
            }
            float f22 = f14;
            Paint c11 = caVar.c(f15);
            Paint c12 = caVar2.c(f15);
            RectF rectF6 = org.telegram.messenger.g0.P;
            rectF6.set(rectF.left + org.telegram.messenger.g0.L(10.0f), f22 + org.telegram.messenger.g0.L(10.0f), rectF.right - org.telegram.messenger.g0.L(10.0f), f22 + org.telegram.messenger.g0.L(52.0f));
            if (c11 != null) {
                canvas2.drawRoundRect(rectF6, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), c11);
            }
            if (c12 != null) {
                paint = c12;
                rectF3 = rectF6;
                i10 = i7;
                i11 = 3;
                rectF2 = rectF;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, qs.e4, 31);
                canvas2 = canvas;
            } else {
                paint = c12;
                rectF3 = rectF6;
                i10 = i7;
                i11 = 3;
                rectF2 = rectF;
            }
            Path path = mVar.E0;
            if (path == null) {
                mVar.E0 = new Path();
            } else {
                path.rewind();
            }
            float W12 = org.telegram.messenger.g0.W1(mVar.n0, org.telegram.messenger.g0.L(f12), 0);
            Path path2 = mVar.E0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, W12, W12, direction);
            canvas2.clipPath(mVar.E0);
            my0 my0Var = mVar.C0;
            if (my0Var != null) {
                my0Var.p = (int) (rectF2.width() - org.telegram.messenger.g0.L(40.0f));
                my0Var.c(rectF2.left + org.telegram.messenger.g0.L(20.0f), f22 + org.telegram.messenger.g0.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = mVar.G0;
            if (path3 == null) {
                mVar.G0 = new Path();
                float[] fArr = new float[8];
                mVar.H0 = fArr;
                float L4 = org.telegram.messenger.g0.L(5.0f);
                fArr[i10] = L4;
                fArr[0] = L4;
                float[] fArr2 = mVar.H0;
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
            mVar.G0.addRoundRect(rectF3, mVar.H0, direction);
            if (mVar.F0 == null) {
                Paint paint5 = new Paint();
                mVar.F0 = paint5;
                paint5.setColor(-1);
            }
            mVar.F0.setAlpha((int) (f15 * 255.0f));
            canvas2.drawPath(mVar.G0, mVar.F0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            my0 my0Var2 = mVar.D0;
            if (my0Var2 != null) {
                my0Var2.p = (int) (rectF2.width() - org.telegram.messenger.g0.L(40.0f));
                my0Var2.c(rectF2.left + org.telegram.messenger.g0.L(20.0f), f22 + org.telegram.messenger.g0.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d2 > 0.0f) {
            int i12 = mVar.K0;
            float L6 = i12 == Integer.MAX_VALUE ? rectF2.right - org.telegram.messenger.g0.L(20.0f) : i12 == Integer.MIN_VALUE ? rectF2.left + org.telegram.messenger.g0.L(20.0f) : i12;
            float L7 = rectF2.bottom - org.telegram.messenger.g0.L(20.0f);
            float max = Math.max(Math.max(a8.r9.a(rectF2.left, rectF2.top, L6, L7), a8.r9.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(a8.r9.a(rectF2.right, rectF2.top, L6, L7), a8.r9.a(rectF2.right, rectF2.bottom, L6, L7))) * d2;
            if (mVar.M0 == null) {
                Paint paint6 = new Paint(i10);
                mVar.M0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i11];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                mVar.N0 = radialGradient;
                mVar.M0.setShader(radialGradient);
                mVar.Q0 = new Matrix();
                Paint paint7 = new Paint(1);
                mVar.O0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                mVar.P0 = radialGradient2;
                mVar.O0.setShader(radialGradient2);
            }
            mVar.Q0.reset();
            mVar.Q0.postTranslate(L6, L7);
            mVar.Q0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.N0.setLocalMatrix(mVar.Q0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, mVar.M0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, qs.e4, 31);
            mVar.j(canvas2, rectF2);
            mVar.Q0.reset();
            mVar.Q0.postTranslate(L6, L7);
            mVar.Q0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.P0.setLocalMatrix(mVar.Q0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, mVar.O0);
            canvas2.restore();
            canvas2.restore();
            if (!(mVar instanceof la)) {
                mVar.k(canvas2, rectF2, d2);
            }
        }
        canvas2.restore();
        if (mVar.g0 == null) {
            Path path4 = mVar.I0;
            path4.rewind();
            path4.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            dh.j jVar = mVar.c;
            jVar.m = f11;
            jVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            jVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.A0.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) {
                int action = motionEvent.getAction();
                ic icVar = this.e0;
                if (action != 0 || this.o0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        icVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof r) && ((r) this).N1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i7 = 0;
                while (true) {
                    int childCount = getChildCount();
                    g gVar = this.f;
                    if (i7 >= childCount) {
                        this.L.b(false);
                        gVar.getEditText().setForceCursorEnd(true);
                        gVar.getEditText().requestFocus();
                        et etVar = gVar.a;
                        etVar.requestFocus();
                        org.telegram.messenger.g0.K3(etVar);
                        gVar.getEditText().setScrollY(0);
                        icVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i7);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                        float x10 = childAt.getX();
                        float y10 = childAt.getY();
                        float x11 = childAt.getX() + childAt.getWidth();
                        float y11 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.y0;
                        rectF.set(x10, y10, x11, y11);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i7++;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float max;
        RectF rectF = this.z0;
        if (view != this.f) {
            if (!f(view)) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        if (this instanceof ap0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.n0) * Math.max(0, (r0.getHeight() - org.telegram.messenger.g0.L(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.F;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.E;
        linearGradient.setLocalMatrix(matrix);
        float f10 = rectF.left;
        float f11 = rectF.top;
        Paint paint = this.D;
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
        return this.z0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return p10.i(this.U).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.x;
    }

    public int getEditTextHeight() {
        return (int) this.u0.c;
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
        return this.L0.c;
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

    public abstract void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.M;
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
            Bitmap bitmap = this.G;
            if (bitmap != null) {
                bitmap.recycle();
                this.G = null;
            }
            TextPaint textPaint = this.H;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            String M0 = hd.M0(2131754454, null);
            this.G = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.G).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.q0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.r0 = null;
        this.t0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f;
        boolean z9 = gVar.y;
        q3 q3Var = this.L;
        if (z9 && gVar.getEmojiView() != null) {
            if (q3Var.c()) {
                gVar.getEmojiView().A();
                return true;
            }
            ft ftVar = gVar.d;
            if (ftVar != null) {
                ftVar.A();
                gVar.d.t(false);
            }
            return true;
        }
        if (gVar.e) {
            gVar.k(true);
            return true;
        }
        if ((!gVar.w && !q3Var.c()) || q3Var.d) {
            return false;
        }
        gVar.d();
        gVar.k(true);
        return true;
    }

    public void setAccount(int i7) {
        this.U = i7;
    }

    public void setBlurredBackgroundDrawableForMentions(dh.c cVar) {
        this.g0 = cVar;
    }

    public void setDialogId(long j3) {
        this.y = j3;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(c20 c20Var) {
        this.i0 = c20Var;
    }

    public void setOnKeyboardOpen(c20 c20Var) {
        this.j0 = c20Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.e0.c(z9 && !this.o0);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f.setText(charSequence);
    }

    public abstract void u(float f10);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.B0 = false;
            invalidate();
            return;
        }
        this.B0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.C0 = new my0(charSequence2, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.D0 = new my0(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i7) {
        rt0 rt0Var = this.K;
        if (rt0Var != null) {
            rt0Var.R();
        }
        g gVar = this.f;
        if (gVar.e) {
            i7 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i7 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i7 - (rt0Var == null ? 0 : rt0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ap0)) {
            ObjectAnimator objectAnimator = this.k0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.k0.cancel();
                this.k0 = null;
            }
            this.k0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.k0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                this.k0.setDuration(250L);
            } else {
                this.k0.setInterpolator(xq.h);
                this.k0.setDuration(640L);
            }
            this.k0.start();
        }
        this.l0 = max > org.telegram.messenger.g0.L(20.0f);
        e eVar = this.m0;
        org.telegram.messenger.g0.r(eVar);
        org.telegram.messenger.g0.h3(eVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.u0.c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void q(boolean z9) {
    }

    public void r(int i7) {
    }

    public void setUiBlurBitmap(e20 e20Var) {
    }

    public void n() {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i7, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}

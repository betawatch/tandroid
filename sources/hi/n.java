package hi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.bp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class n extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public vy0 D0;
    public final Paint E;
    public vy0 E0;
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
    public final au0 L;
    public int L0;
    public final p3 M;
    public final org.telegram.ui.Components.c6 M0;
    public i N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.ca P;
    public Paint P0;
    public final org.telegram.ui.Components.ga Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.ga R;
    public Matrix R0;
    public final org.telegram.ui.Components.ga S;
    public final org.telegram.ui.Components.ga T;
    public org.telegram.ui.Components.ga U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.i6 a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final dh.j c;
    public int c0;
    public final dh.j d;
    public final e d0;
    public final Paint e;
    public boolean e0;
    public final g f;
    public final mc f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public dh.c h0;
    public fh.g i0;
    public x10 j0;
    public x10 k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final mq n;
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
    public final org.telegram.ui.Components.c6 v0;
    public final org.telegram.ui.Components.n6 w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public n(Context context, FrameLayout frameLayout, au0 au0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ca caVar) {
        super(context);
        dh.j jVar = new dh.j();
        this.c = jVar;
        dh.j jVar2 = new dh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        int i7 = 0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = j10.t0;
        this.d0 = new e(this, i7);
        this.f0 = new mc(this, 1.0f, 3.0f);
        this.n0 = new e(this, 1);
        lr lrVar = lr.h;
        this.v0 = new org.telegram.ui.Components.c6(this, 0L, 300L, lrVar);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.c6(this, 500L, lrVar);
        this.a = i6Var;
        this.K = frameLayout;
        this.L = au0Var;
        this.b = frameLayout2;
        this.P = caVar;
        this.S = new org.telegram.ui.Components.ga(caVar, this, 0, !g());
        this.T = new org.telegram.ui.Components.ga(caVar, this, 8, false);
        this.R = new org.telegram.ui.Components.ga(caVar, this, 9, false);
        jVar.l = true;
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        float f10 = 0.0f;
        jVar.a = new f(i6Var, i10, f10, i7);
        jVar.a();
        jVar.g.setColor(0);
        jVar.invalidateSelf();
        jVar2.l = true;
        jVar2.a = new f(i6Var, i10, f10, 1);
        jVar2.a();
        jVar2.g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.M = new p3(frameLayout, false, new ai.g0(this, 21));
        g gVar = new g(this, context, au0Var, getEditTextStyle(), new fi.b(), i6Var, caVar);
        this.f = gVar;
        gVar.T = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().r0 = true;
        gVar.getEditText().t0 = new bi.b(this, 24);
        gVar.getEditText().setSupportRtlHint(true);
        this.Q = new org.telegram.ui.Components.ga(caVar, gVar.getEditText(), g() ? 1 : 2, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().r(gd.M0(2131754452, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z10 = this instanceof bp0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        gVar.getEmojiButton().setTranslationY(org.telegram.messenger.g0.L(z10 ? 1.0f : -1.0f));
        gVar.setTranslationY(org.telegram.messenger.g0.L(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        addView(gVar, c8.ma.d(-1, -2.0f, (z10 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.r = jVar3;
        c8.ra.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.SRC_IN);
        mq mqVar = new mq(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qg, i6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.n = mqVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        mqVar.h = L;
        mqVar.n = L2;
        jVar3.setImageDrawable(mqVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(gd.M0(2131751343, null));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.d(this, 28));
        addView(jVar3, c8.ma.d(44, 44.0f, (z10 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.w = n6Var;
        n6Var.setGravity(17);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTextColor(-1);
        n6Var.b(0.4f, 320L, lrVar);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        frameLayout3.addView(n6Var, c8.ma.e(52, 16, (z10 ? 48 : 80) | 5));
        addView(frameLayout3, c8.ma.d(52, 16.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 50 : 0, 0.0f, z10 ? 0 : 50));
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
        n nVar;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        int i7;
        int i10;
        int i11;
        RectF rectF2;
        org.telegram.ui.Components.ga gaVar;
        org.telegram.ui.Components.ga gaVar2;
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
            x10 x10Var = this.j0;
            if (x10Var != null) {
                x10Var.a(Integer.valueOf(e10));
            }
            this.w0 = L;
        }
        y();
        int L2 = org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        boolean z10 = this instanceof bp0;
        RectF rectF4 = this.B0;
        RectF rectF5 = this.A0;
        if (z10) {
            if (!this.K0) {
                float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-1.0f), org.telegram.messenger.g0.N(1.0f), this.o0);
                mt editText = gVar.getEditText();
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
                mt editText2 = gVar.getEditText();
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
        dh.c cVar = this.h0;
        if (cVar != null) {
            if (this.i0 == null) {
                fh.g c10 = cVar.c(this, null, false);
                c10.p(c8.i0.j(this.a));
                c10.q(org.telegram.messenger.g0.L(5.0f));
                c10.r(org.telegram.messenger.g0.L(22.0f));
                this.i0 = c10;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF5.round(rect);
            rect.inset(-org.telegram.messenger.g0.W1(this.o0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f)), -org.telegram.messenger.g0.L(5.0f));
            this.i0.setBounds(rect);
            this.i0.draw(canvas2);
            nVar = this;
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
                h(this.S, canvas, rectF5, W1, false, 0.0f, 0.0f, true);
                nVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f11 = W1;
                paint2.setAlpha(org.telegram.messenger.g0.W1(nVar.o0, 38, 64));
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
            } else {
                nVar = this;
                rectF = rectF5;
                f11 = W1;
                f12 = 21.0f;
                f13 = 50.0f;
                i7 = 1;
                Paint[] d = nVar.S.d();
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
        org.telegram.ui.Components.c6 c6Var = nVar.M0;
        float f20 = c6Var.c;
        float d2 = c6Var.d(nVar.K0);
        if (Math.abs(f20 - d2) <= 0.001f) {
        }
        nVar.n();
        if (d2 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, ks.e4, 31);
        }
        if (!nVar.C0 || (gaVar = nVar.T) == null || (gaVar2 = nVar.R) == null) {
            i10 = i7;
            i11 = 3;
            rectF2 = rectF;
        } else {
            if (nVar.K0) {
                if (nVar.p0) {
                    f16 = rectF.bottom;
                    min = Math.max(org.telegram.messenger.g0.L(46.0f), gVar.getHeight());
                } else {
                    f16 = rectF.bottom;
                    min = Math.min(org.telegram.messenger.g0.L(f10), gVar.getHeight());
                }
                float f21 = f16 - min;
                f14 = f21 - org.telegram.messenger.g0.L(f13);
                f15 = 1.0f - c6Var.c;
            } else {
                f14 = rectF.top;
                f15 = 1.0f;
            }
            float f22 = f14;
            Paint c11 = gaVar.c(f15);
            Paint c12 = gaVar2.c(f15);
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
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, ks.e4, 31);
                canvas2 = canvas;
            } else {
                paint = c12;
                rectF3 = rectF6;
                i10 = i7;
                i11 = 3;
                rectF2 = rectF;
            }
            Path path = nVar.F0;
            if (path == null) {
                nVar.F0 = new Path();
            } else {
                path.rewind();
            }
            float W12 = org.telegram.messenger.g0.W1(nVar.o0, org.telegram.messenger.g0.L(f12), 0);
            Path path2 = nVar.F0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, W12, W12, direction);
            canvas2.clipPath(nVar.F0);
            vy0 vy0Var = nVar.D0;
            if (vy0Var != null) {
                vy0Var.p = (int) (rectF2.width() - org.telegram.messenger.g0.L(40.0f));
                vy0Var.c(rectF2.left + org.telegram.messenger.g0.L(20.0f), f22 + org.telegram.messenger.g0.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = nVar.H0;
            if (path3 == null) {
                nVar.H0 = new Path();
                float[] fArr = new float[8];
                nVar.I0 = fArr;
                float L4 = org.telegram.messenger.g0.L(5.0f);
                fArr[i10] = L4;
                fArr[0] = L4;
                float[] fArr2 = nVar.I0;
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
            nVar.H0.addRoundRect(rectF3, nVar.I0, direction);
            if (nVar.G0 == null) {
                Paint paint5 = new Paint();
                nVar.G0 = paint5;
                paint5.setColor(-1);
            }
            nVar.G0.setAlpha((int) (f15 * 255.0f));
            canvas2.drawPath(nVar.H0, nVar.G0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            vy0 vy0Var2 = nVar.E0;
            if (vy0Var2 != null) {
                vy0Var2.p = (int) (rectF2.width() - org.telegram.messenger.g0.L(40.0f));
                vy0Var2.c(rectF2.left + org.telegram.messenger.g0.L(20.0f), f22 + org.telegram.messenger.g0.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d2 > 0.0f) {
            int i12 = nVar.L0;
            float L6 = i12 == Integer.MAX_VALUE ? rectF2.right - org.telegram.messenger.g0.L(20.0f) : i12 == Integer.MIN_VALUE ? rectF2.left + org.telegram.messenger.g0.L(20.0f) : i12;
            float L7 = rectF2.bottom - org.telegram.messenger.g0.L(20.0f);
            float max = Math.max(Math.max(a8.w9.a(rectF2.left, rectF2.top, L6, L7), a8.w9.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(a8.w9.a(rectF2.right, rectF2.top, L6, L7), a8.w9.a(rectF2.right, rectF2.bottom, L6, L7))) * d2;
            if (nVar.N0 == null) {
                Paint paint6 = new Paint(i10);
                nVar.N0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i11];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                nVar.O0 = radialGradient;
                nVar.N0.setShader(radialGradient);
                nVar.R0 = new Matrix();
                Paint paint7 = new Paint(1);
                nVar.P0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                nVar.Q0 = radialGradient2;
                nVar.P0.setShader(radialGradient2);
            }
            nVar.R0.reset();
            nVar.R0.postTranslate(L6, L7);
            nVar.R0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            nVar.O0.setLocalMatrix(nVar.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, nVar.N0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, ks.e4, 31);
            nVar.j(canvas2, rectF2);
            nVar.R0.reset();
            nVar.R0.postTranslate(L6, L7);
            nVar.R0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            nVar.Q0.setLocalMatrix(nVar.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, nVar.P0);
            canvas2.restore();
            canvas2.restore();
            if (!(nVar instanceof ja)) {
                nVar.k(canvas2, rectF2, d2);
            }
        }
        canvas2.restore();
        if (nVar.h0 == null) {
            Path path4 = nVar.J0;
            path4.rewind();
            path4.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            dh.j jVar = nVar.c;
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
                mc mcVar = this.f0;
                if (action != 0 || this.p0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        mcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof s) && ((s) this).O1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i7 = 0;
                while (true) {
                    int childCount = getChildCount();
                    g gVar = this.f;
                    if (i7 >= childCount) {
                        this.M.b(false);
                        gVar.getEditText().setForceCursorEnd(true);
                        gVar.getEditText().requestFocus();
                        rt rtVar = gVar.a;
                        rtVar.requestFocus();
                        org.telegram.messenger.g0.I3(rtVar);
                        gVar.getEditText().setScrollY(0);
                        mcVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i7);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                        float x10 = childAt.getX();
                        float y10 = childAt.getY();
                        float x11 = childAt.getX() + childAt.getWidth();
                        float y11 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.z0;
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
        RectF rectF = this.A0;
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
        if (this instanceof bp0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.o0) * Math.max(0, (r0.getHeight() - org.telegram.messenger.g0.L(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ks.e4, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j3);
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
        return j10.i(this.V).q() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
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

    public abstract void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

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
            String M0 = gd.M0(2131754452, null);
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
            st stVar = gVar.d;
            if (stVar != null) {
                stVar.A();
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

    public void setAccount(int i7) {
        this.V = i7;
    }

    public void setBlurredBackgroundDrawableForMentions(dh.c cVar) {
        this.h0 = cVar;
    }

    public void setDialogId(long j3) {
        this.y = j3;
        i iVar = this.N;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(x10 x10Var) {
        this.j0 = x10Var;
    }

    public void setOnKeyboardOpen(x10 x10Var) {
        this.k0 = x10Var;
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
        this.D0 = new vy0(charSequence2, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new vy0(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof s;
    }

    public void x(int i7) {
        au0 au0Var = this.L;
        if (au0Var != null) {
            au0Var.R();
        }
        g gVar = this.f;
        if (gVar.e) {
            i7 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.O) {
            i7 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i7 - (au0Var == null ? 0 : au0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof bp0)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.l0.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                this.l0.setDuration(250L);
            } else {
                this.l0.setInterpolator(lr.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        this.m0 = max > org.telegram.messenger.g0.L(20.0f);
        e eVar = this.n0;
        org.telegram.messenger.g0.r(eVar);
        org.telegram.messenger.g0.g3(eVar);
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

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z10) {
    }

    public void r(int i7) {
    }

    public void setUiBlurBitmap(z10 z10Var) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i7, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}

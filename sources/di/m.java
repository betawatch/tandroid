package di;

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
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
import org.telegram.ui.bt0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public f01 D0;
    public final LinearGradient E;
    public f01 E0;
    public final Matrix F;
    public Path F0;
    public Bitmap G;
    public Paint G0;
    public final TextPaint H;
    public Path H0;
    public final Paint I;
    public float[] I0;
    public final FrameLayout J;
    public final Path J0;
    public final ov0 K;
    public boolean K0;
    public final j4 L;
    public int L0;
    public i M;
    public final org.telegram.ui.Components.e6 M0;
    public int N;
    public Paint N0;
    public final org.telegram.ui.Components.ja O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.na P;
    public Paint P0;
    public final org.telegram.ui.Components.na Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.na R;
    public Matrix R0;
    public final org.telegram.ui.Components.na S;
    public org.telegram.ui.Components.na T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 a;
    public int a0;
    public final FrameLayout b;
    public int b0;
    public final bh.j c;
    public final e c0;
    public final bh.j d;
    public Utilities.CallbackVoidReturn d0;
    public final Paint e;
    public boolean e0;
    public final g f;
    public final org.telegram.ui.Components.zc f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public bh.b h0;
    public dh.d i0;
    public Utilities.Callback j0;
    public Utilities.Callback k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final oq n;
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
    public final org.telegram.ui.Components.q6 v;
    public final org.telegram.ui.Components.e6 v0;
    public int w;
    public int w0;
    public long x;
    public float x0;
    public final Paint y;
    public boolean y0;
    public final RectF z0;

    public m(Context context, FrameLayout frameLayout, ov0 ov0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar) {
        super(context);
        bh.j jVar = new bh.j();
        this.c = jVar;
        bh.j jVar2 = new bh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = UserConfig.selectedAccount;
        this.c0 = new e(this, 0);
        this.f0 = new org.telegram.ui.Components.zc(this, 1.0f, 3.0f);
        this.n0 = new e(this, 1);
        pr prVar = pr.h;
        this.v0 = new org.telegram.ui.Components.e6(this, 0L, 300L, prVar);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.e6(this, 500L, prVar);
        this.a = f6Var;
        this.J = frameLayout;
        this.K = ov0Var;
        this.b = frameLayout2;
        this.O = jaVar;
        this.R = new org.telegram.ui.Components.na(jaVar, this, 0, !g());
        this.S = new org.telegram.ui.Components.na(jaVar, this, 8, false);
        this.Q = new org.telegram.ui.Components.na(jaVar, this, 9, false);
        jVar.j = true;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        jVar.a(new f(f6Var, i10, 0.0f, 0));
        jVar.g.setColor(0);
        jVar.invalidateSelf();
        jVar2.j = true;
        jVar2.a(new f(f6Var, i10, 0.0f, 1));
        jVar2.g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.L = new j4(frameLayout, false, new bi.o1(this, 5));
        int i11 = 8;
        g gVar = new g(this, context, ov0Var, getEditTextStyle(), new bi.b(), f6Var, jaVar);
        this.f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new ci.u(this, 1);
        gVar.getEditText().setSupportRtlHint(true);
        this.P = new org.telegram.ui.Components.na(jaVar, gVar.getEditText(), g() ? 1 : 2, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof bt0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        gVar.getEmojiButton().setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        addView(gVar, w7.x5.d(-1, -2.0f, (z10 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.r = jVar3;
        w7.z5.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        oq oqVar = new oq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, f6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.n = oqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        oqVar.h = dp;
        oqVar.n = dp2;
        jVar3.setImageDrawable(oqVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(LocaleController.getString(R.string.Done));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.h0(this, i11));
        addView(jVar3, w7.x5.d(44, 44.0f, (z10 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
        this.v = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, prVar);
        q6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        frameLayout3.addView(q6Var, w7.x5.e(52, 16, (z10 ? 48 : 80) | 5));
        addView(frameLayout3, w7.x5.d(52, 16.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 50 : 0, 0.0f, z10 ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return AndroidUtilities.navigationBarHeight;
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0220, code lost:
    
        if ((r2 <= 0.0f) != (r11 <= 0.0f)) goto L65;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f7;
        m mVar;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        RectF rectF2;
        org.telegram.ui.Components.na naVar;
        org.telegram.ui.Components.na naVar2;
        float f13;
        float f14;
        Paint paint;
        RectF rectF3;
        char c10;
        char c11;
        float f15;
        int min;
        Canvas canvas2 = canvas;
        if (this.y0) {
            return;
        }
        g gVar = this.f;
        int height = gVar.getHeight();
        int dp = this.K0 ? AndroidUtilities.dp(44.0f) : this.p0 ? Math.max(AndroidUtilities.dp(44.0f), height) : Math.min(AndroidUtilities.dp(82.0f), height);
        if (!this.K0 && this.C0) {
            dp += AndroidUtilities.dp(50.0f);
        }
        float f16 = dp;
        int d = (int) this.v0.d(f16, false);
        if (d != this.w0) {
            r(d);
            Utilities.Callback callback = this.j0;
            if (callback != null) {
                callback.run(Integer.valueOf(d));
            }
            this.w0 = dp;
        }
        y();
        int dp2 = AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        boolean z10 = this instanceof bt0;
        RectF rectF4 = this.B0;
        RectF rectF5 = this.A0;
        if (z10) {
            if (!this.K0) {
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(-1.0f), AndroidUtilities.dpf2(1.0f), this.o0);
                zt editText = gVar.getEditText();
                this.x0 = lerp;
                editText.setTranslationY(lerp);
            }
            float f17 = dp2;
            float f18 = dp3;
            rectF5.set(f17, f18, getWidth() - dp2, dp3 + d);
            rectF4.set(f17, f18, getWidth() - dp2, AndroidUtilities.dp(24.0f) + r4);
            f7 = 82.0f;
        } else {
            f7 = 82.0f;
            float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(-1.0f), this.o0) + f16) - d;
            if (Math.abs(this.x0 - lerp2) >= 1.0f && !this.K0) {
                zt editText2 = gVar.getEditText();
                this.x0 = lerp2;
                editText2.setTranslationY(lerp2);
            }
            rectF5.set(dp2, (getHeight() - dp3) - d, getWidth() - dp2, getHeight() - dp3);
            rectF4.set(0.0f, (getHeight() - d) - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a2 = this.f0.a(0.018f);
        canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, this.o0 * 0.0f);
        bh.b bVar = this.h0;
        if (bVar != null) {
            if (this.i0 == null) {
                dh.d c12 = bVar.c(this, null, false);
                c12.n(fh.b.i(this.a));
                c12.o(AndroidUtilities.dp(5.0f));
                c12.p(AndroidUtilities.dp(22.0f));
                this.i0 = c12;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF5.round(rect);
            rect.inset(-AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), this.o0), -AndroidUtilities.dp(5.0f));
            this.i0.setBounds(rect);
            this.i0.draw(canvas2);
            mVar = this;
            rectF = rectF5;
            f10 = lerp3;
            f11 = 50.0f;
            f12 = 21.0f;
        } else {
            boolean g10 = g();
            Paint paint2 = this.e;
            if (g10) {
                f11 = 50.0f;
                f12 = 21.0f;
                h(this.R, canvas, rectF5, lerp3, false, 0.0f, 0.0f, true);
                mVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f10 = lerp3;
                paint2.setAlpha(AndroidUtilities.lerp(38, 64, mVar.o0));
                canvas2.drawRoundRect(rectF, f10, f10, paint2);
            } else {
                mVar = this;
                rectF = rectF5;
                f10 = lerp3;
                f11 = 50.0f;
                f12 = 21.0f;
                Paint[] d10 = mVar.R.d();
                if (d10[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f10, f10, paint2);
                } else {
                    Paint paint3 = d10[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f10, f10, paint3);
                    }
                    Paint paint4 = d10[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f10, f10, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f10, f10, paint2);
                }
            }
        }
        org.telegram.ui.Components.e6 e6Var = mVar.M0;
        float f19 = e6Var.c;
        float e7 = e6Var.e(mVar.K0);
        if (Math.abs(f19 - e7) <= 0.001f) {
        }
        mVar.n();
        if (e7 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, 255, 31);
        }
        if (!mVar.C0 || (naVar = mVar.S) == null || (naVar2 = mVar.Q) == null) {
            rectF2 = rectF;
        } else {
            if (mVar.K0) {
                if (mVar.p0) {
                    f15 = rectF.bottom;
                    min = Math.max(AndroidUtilities.dp(46.0f), gVar.getHeight());
                } else {
                    f15 = rectF.bottom;
                    min = Math.min(AndroidUtilities.dp(f7), gVar.getHeight());
                }
                float f20 = f15 - min;
                f13 = f20 - AndroidUtilities.dp(f11);
                f14 = 1.0f - e6Var.c;
            } else {
                f13 = rectF.top;
                f14 = 1.0f;
            }
            float f21 = f13;
            Paint c13 = naVar.c(f14);
            Paint c14 = naVar2.c(f14);
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(rectF.left + AndroidUtilities.dp(10.0f), f21 + AndroidUtilities.dp(10.0f), rectF.right - AndroidUtilities.dp(10.0f), f21 + AndroidUtilities.dp(52.0f));
            if (c13 != null) {
                canvas2.drawRoundRect(rectF6, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), c13);
            }
            if (c14 != null) {
                paint = c14;
                rectF3 = rectF6;
                rectF2 = rectF;
                c10 = 1;
                c11 = 3;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas2 = canvas;
            } else {
                rectF2 = rectF;
                paint = c14;
                rectF3 = rectF6;
                c10 = 1;
                c11 = 3;
            }
            Path path = mVar.F0;
            if (path == null) {
                mVar.F0 = new Path();
            } else {
                path.rewind();
            }
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(f12), 0, mVar.o0);
            Path path2 = mVar.F0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, lerp4, lerp4, direction);
            canvas2.clipPath(mVar.F0);
            f01 f01Var = mVar.D0;
            if (f01Var != null) {
                f01Var.p = (int) (rectF2.width() - AndroidUtilities.dp(40.0f));
                f01Var.c(rectF2.left + AndroidUtilities.dp(20.0f), f21 + AndroidUtilities.dp(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = mVar.H0;
            if (path3 == null) {
                mVar.H0 = new Path();
                float[] fArr = new float[8];
                mVar.I0 = fArr;
                float dp4 = AndroidUtilities.dp(5.0f);
                fArr[c10] = dp4;
                fArr[0] = dp4;
                float[] fArr2 = mVar.I0;
                fArr2[c11] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float dp5 = AndroidUtilities.dp(5.0f);
                fArr2[7] = dp5;
                fArr2[6] = dp5;
            } else {
                path3.rewind();
            }
            float f22 = rectF3.left;
            rectF3.set(f22, rectF3.top, AndroidUtilities.dp(3.0f) + f22, rectF3.bottom);
            mVar.H0.addRoundRect(rectF3, mVar.I0, direction);
            if (mVar.G0 == null) {
                Paint paint5 = new Paint();
                mVar.G0 = paint5;
                paint5.setColor(-1);
            }
            mVar.G0.setAlpha((int) (f14 * 255.0f));
            canvas2.drawPath(mVar.H0, mVar.G0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            f01 f01Var2 = mVar.E0;
            if (f01Var2 != null) {
                f01Var2.p = (int) (rectF2.width() - AndroidUtilities.dp(40.0f));
                f01Var2.c(rectF2.left + AndroidUtilities.dp(20.0f), f21 + AndroidUtilities.dp(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (e7 > 0.0f) {
            int i10 = mVar.L0;
            float dp6 = i10 == Integer.MAX_VALUE ? rectF2.right - AndroidUtilities.dp(20.0f) : i10 == Integer.MIN_VALUE ? rectF2.left + AndroidUtilities.dp(20.0f) : i10;
            float dp7 = rectF2.bottom - AndroidUtilities.dp(20.0f);
            float max = Math.max(Math.max(v7.z6.a(rectF2.left, rectF2.top, dp6, dp7), v7.z6.a(rectF2.left, rectF2.bottom, dp6, dp7)), Math.max(v7.z6.a(rectF2.right, rectF2.top, dp6, dp7), v7.z6.a(rectF2.right, rectF2.bottom, dp6, dp7))) * e7;
            if (mVar.N0 == null) {
                Paint paint6 = new Paint(1);
                mVar.N0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
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
            mVar.R0.postTranslate(dp6, dp7);
            mVar.R0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.O0.setLocalMatrix(mVar.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f10, f10, mVar.N0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, 255, 31);
            mVar.j(canvas2, rectF2);
            mVar.R0.reset();
            mVar.R0.postTranslate(dp6, dp7);
            mVar.R0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.Q0.setLocalMatrix(mVar.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f10, f10, mVar.P0);
            canvas2.restore();
            canvas2.restore();
            if (!(mVar instanceof fc)) {
                mVar.k(canvas2, rectF2, e7);
            }
        }
        canvas2.restore();
        if (mVar.h0 == null) {
            Path path4 = mVar.J0;
            path4.rewind();
            path4.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            bh.j jVar = mVar.c;
            jVar.k = f10;
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
                org.telegram.ui.Components.zc zcVar = this.f0;
                if (action != 0 || this.p0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        zcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof r) && ((r) this).O1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i10 = 0;
                while (true) {
                    int childCount = getChildCount();
                    g gVar = this.f;
                    if (i10 >= childCount) {
                        this.L.b(false);
                        gVar.getEditText().setForceCursorEnd(true);
                        gVar.getEditText().requestFocus();
                        cu cuVar = gVar.a;
                        cuVar.requestFocus();
                        AndroidUtilities.showKeyboard(cuVar);
                        gVar.getEditText().setScrollY(0);
                        zcVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                        float x10 = childAt.getX();
                        float y3 = childAt.getY();
                        float x11 = childAt.getX() + childAt.getWidth();
                        float y10 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.z0;
                        rectF.set(x10, y3, x11, y10);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i10++;
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
        if (this instanceof bt0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.o0) * Math.max(0, (r0.getHeight() - AndroidUtilities.dp(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
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
        float f7 = rectF.left;
        float f10 = rectF.top;
        Paint paint = this.y;
        canvas.drawRect(f7, f10, rectF.right, AndroidUtilities.dp(10.0f) + f10, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, paint);
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
        return UserConfig.getInstance(this.U).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.w;
    }

    public int getEditTextHeight() {
        return (int) this.v0.c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f.getHeight());
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

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
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.G = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.G).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
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
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f;
        boolean z10 = gVar.x;
        j4 j4Var = this.L;
        if (z10 && gVar.getEmojiView() != null) {
            if (j4Var.c()) {
                gVar.getEmojiView().B();
                return true;
            }
            du duVar = gVar.d;
            if (duVar != null) {
                duVar.B();
                gVar.d.t(false);
            }
            return true;
        }
        if (gVar.e) {
            gVar.k(true);
            return true;
        }
        if ((!gVar.v && !j4Var.c()) || j4Var.d) {
            return false;
        }
        gVar.d();
        gVar.k(true);
        return true;
    }

    public void setAccount(int i10) {
        this.U = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(bh.b bVar) {
        this.h0 = bVar;
    }

    public void setDialogId(long j3) {
        this.x = j3;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.j0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.k0 = callback;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f0.c(z10 && !this.p0);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.d0 = callbackVoidReturn;
    }

    public abstract void u(float f7);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
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
        this.D0 = new f01(charSequence2, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new f01(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i10) {
        ov0 ov0Var = this.K;
        if (ov0Var != null) {
            ov0Var.S();
        }
        g gVar = this.f;
        if (gVar.e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i10 - (ov0Var == null ? 0 : ov0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof bt0)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.l0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                this.l0.setDuration(250L);
            } else {
                this.l0.setInterpolator(pr.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        this.m0 = max > AndroidUtilities.dp(20.0f);
        e eVar = this.n0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.v0.c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f7) {
    }
}

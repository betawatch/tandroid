package lh;

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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.as0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class m extends FrameLayout {
    public final LinearGradient A;
    public pz0 A0;
    public final Matrix B;
    public Path B0;
    public Bitmap C;
    public Paint C0;
    public final TextPaint D;
    public Path D0;
    public final Paint E;
    public float[] E0;
    public final FrameLayout F;
    public final Path F0;
    public final zu0 G;
    public boolean G0;
    public final a4 H;
    public int H0;
    public i I;
    public final org.telegram.ui.Components.y5 I0;
    public int J;
    public Paint J0;
    public final org.telegram.ui.Components.z9 K;
    public RadialGradient K0;
    public final org.telegram.ui.Components.da L;
    public Paint L0;
    public final org.telegram.ui.Components.da M;
    public RadialGradient M0;
    public final org.telegram.ui.Components.da N;
    public Matrix N0;
    public final org.telegram.ui.Components.da O;
    public org.telegram.ui.Components.da P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public final e V;
    public Utilities.CallbackVoidReturn W;
    public org.telegram.ui.ActionBar.c6 a;
    public boolean a0;
    public final FrameLayout b;
    public final org.telegram.ui.Components.nc b0;
    public final jg.i c;
    public ObjectAnimator c0;
    public final jg.i d;
    public jg.a d0;
    public final Paint e;
    public lg.d e0;
    public final g f;
    public Utilities.Callback f0;
    public Utilities.Callback g0;
    public final Drawable h;
    public ObjectAnimator h0;
    public boolean i0;
    public final e j0;
    public float k0;
    public boolean l0;
    public ValueAnimator m0;
    public final dq n;
    public Bitmap n0;
    public BitmapShader o0;
    public Matrix p0;
    public Paint q0;
    public final j r;
    public final org.telegram.ui.Components.y5 r0;
    public final FrameLayout s;
    public int s0;
    public float t0;
    public boolean u0;
    public final org.telegram.ui.Components.j6 v;
    public final RectF v0;
    public int w;
    public final RectF w0;
    public long x;
    public final RectF x0;
    public final Paint y;
    public boolean y0;
    public pz0 z0;

    public m(Context context, FrameLayout frameLayout, zu0 zu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var) {
        super(context);
        jg.i iVar = new jg.i();
        this.c = iVar;
        jg.i iVar2 = new jg.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        this.D = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.E = paint3;
        this.J = -4;
        this.Q = UserConfig.selectedAccount;
        this.V = new e(this, 0);
        this.b0 = new org.telegram.ui.Components.nc(this, 1.0f, 3.0f);
        this.j0 = new e(this, 1);
        er erVar = er.h;
        this.r0 = new org.telegram.ui.Components.y5(this, 0L, 300L, erVar);
        this.u0 = false;
        this.v0 = new RectF();
        this.w0 = new RectF();
        this.x0 = new RectF();
        this.F0 = new Path();
        this.I0 = new org.telegram.ui.Components.y5(this, 500L, erVar);
        this.a = c6Var;
        this.F = frameLayout;
        this.G = zu0Var;
        this.b = frameLayout2;
        this.K = z9Var;
        this.N = new org.telegram.ui.Components.da(z9Var, this, 0, !g());
        this.O = new org.telegram.ui.Components.da(z9Var, this, 8, false);
        this.M = new org.telegram.ui.Components.da(z9Var, this, 9, false);
        iVar.j = true;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        iVar.a(new f(c6Var, i10, 0.0f, 0));
        iVar.g.setColor(0);
        iVar.invalidateSelf();
        iVar2.j = true;
        iVar2.a(new f(c6Var, i10, 0.0f, 1));
        iVar2.g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        int i11 = 24;
        this.H = new a4(frameLayout, false, new ag.n0(this, i11));
        g gVar = new g(this, context, zu0Var, getEditTextStyle(), new jh.b(), c6Var, z9Var);
        this.f = gVar;
        gVar.O = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new ch.c(this, i11);
        gVar.getEditText().setSupportRtlHint(true);
        this.L = new org.telegram.ui.Components.da(z9Var, gVar.getEditText(), g() ? 1 : 2, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof as0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        gVar.getEmojiButton().setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        addView(gVar, h7.z5.d(-1, -2.0f, (z10 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar = new j(context);
        this.r = jVar;
        h7.b6.b(jVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.SRC_IN));
        dq dqVar = new dq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zf, c6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.n = dqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        dqVar.h = dp;
        dqVar.n = dp2;
        jVar.setImageDrawable(dqVar);
        jVar.setScaleType(ImageView.ScaleType.CENTER);
        jVar.setContentDescription(LocaleController.getString(R.string.Done));
        jVar.setAlpha(0.0f);
        jVar.setVisibility(8);
        jVar.setOnClickListener(new ag.w0(this, 27));
        addView(jVar, h7.z5.d(44, 44.0f, (z10 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.v = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, erVar);
        j6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        frameLayout3.addView(j6Var, h7.z5.e(52, 16, (z10 ? 48 : 80) | 5));
        addView(frameLayout3, h7.z5.d(52, 16.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 50 : 0, 0.0f, z10 ? 0 : 50));
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
        float f10;
        m mVar;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        RectF rectF2;
        org.telegram.ui.Components.da daVar;
        org.telegram.ui.Components.da daVar2;
        float f14;
        float f15;
        Paint paint;
        RectF rectF3;
        char c10;
        char c11;
        float f16;
        int min;
        Canvas canvas2 = canvas;
        if (this.u0) {
            return;
        }
        g gVar = this.f;
        int height = gVar.getHeight();
        int dp = this.G0 ? AndroidUtilities.dp(44.0f) : this.l0 ? Math.max(AndroidUtilities.dp(44.0f), height) : Math.min(AndroidUtilities.dp(82.0f), height);
        if (!this.G0 && this.y0) {
            dp += AndroidUtilities.dp(50.0f);
        }
        float f17 = dp;
        int d = (int) this.r0.d(f17, false);
        if (d != this.s0) {
            r(d);
            Utilities.Callback callback = this.f0;
            if (callback != null) {
                callback.run(Integer.valueOf(d));
            }
            this.s0 = dp;
        }
        y();
        int dp2 = AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        boolean z10 = this instanceof as0;
        RectF rectF4 = this.x0;
        RectF rectF5 = this.w0;
        if (z10) {
            if (!this.G0) {
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(-1.0f), AndroidUtilities.dpf2(1.0f), this.k0);
                lt editText = gVar.getEditText();
                this.t0 = lerp;
                editText.setTranslationY(lerp);
            }
            float f18 = dp2;
            float f19 = dp3;
            rectF5.set(f18, f19, getWidth() - dp2, dp3 + d);
            rectF4.set(f18, f19, getWidth() - dp2, AndroidUtilities.dp(24.0f) + r4);
            f10 = 82.0f;
        } else {
            f10 = 82.0f;
            float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(-1.0f), this.k0) + f17) - d;
            if (Math.abs(this.t0 - lerp2) >= 1.0f && !this.G0) {
                lt editText2 = gVar.getEditText();
                this.t0 = lerp2;
                editText2.setTranslationY(lerp2);
            }
            rectF5.set(dp2, (getHeight() - dp3) - d, getWidth() - dp2, getHeight() - dp3);
            rectF4.set(0.0f, (getHeight() - d) - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a2 = this.b0.a(0.018f);
        canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, this.k0 * 0.0f);
        jg.a aVar = this.d0;
        if (aVar != null) {
            if (this.e0 == null) {
                lg.d c12 = aVar.c(this, null, false);
                c12.n(ng.c.i(this.a));
                c12.o(AndroidUtilities.dp(5.0f));
                c12.p(AndroidUtilities.dp(22.0f));
                this.e0 = c12;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF5.round(rect);
            rect.inset(-AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), this.k0), -AndroidUtilities.dp(5.0f));
            this.e0.setBounds(rect);
            this.e0.draw(canvas2);
            mVar = this;
            rectF = rectF5;
            f11 = lerp3;
            f12 = 50.0f;
            f13 = 21.0f;
        } else {
            boolean g10 = g();
            Paint paint2 = this.e;
            if (g10) {
                f12 = 50.0f;
                f13 = 21.0f;
                h(this.N, canvas, rectF5, lerp3, false, 0.0f, 0.0f, true);
                mVar = this;
                canvas2 = canvas;
                rectF = rectF5;
                f11 = lerp3;
                paint2.setAlpha(AndroidUtilities.lerp(38, 64, mVar.k0));
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
            } else {
                mVar = this;
                rectF = rectF5;
                f11 = lerp3;
                f12 = 50.0f;
                f13 = 21.0f;
                Paint[] d10 = mVar.N.d();
                if (d10[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                } else {
                    Paint paint3 = d10[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint3);
                    }
                    Paint paint4 = d10[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                }
            }
        }
        org.telegram.ui.Components.y5 y5Var = mVar.I0;
        float f20 = y5Var.c;
        float e9 = y5Var.e(mVar.G0);
        if (Math.abs(f20 - e9) <= 0.001f) {
        }
        mVar.n();
        if (e9 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, 255, 31);
        }
        if (!mVar.y0 || (daVar = mVar.O) == null || (daVar2 = mVar.M) == null) {
            rectF2 = rectF;
        } else {
            if (mVar.G0) {
                if (mVar.l0) {
                    f16 = rectF.bottom;
                    min = Math.max(AndroidUtilities.dp(46.0f), gVar.getHeight());
                } else {
                    f16 = rectF.bottom;
                    min = Math.min(AndroidUtilities.dp(f10), gVar.getHeight());
                }
                float f21 = f16 - min;
                f14 = f21 - AndroidUtilities.dp(f12);
                f15 = 1.0f - y5Var.c;
            } else {
                f14 = rectF.top;
                f15 = 1.0f;
            }
            float f22 = f14;
            Paint c13 = daVar.c(f15);
            Paint c14 = daVar2.c(f15);
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(rectF.left + AndroidUtilities.dp(10.0f), f22 + AndroidUtilities.dp(10.0f), rectF.right - AndroidUtilities.dp(10.0f), f22 + AndroidUtilities.dp(52.0f));
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
            Path path = mVar.B0;
            if (path == null) {
                mVar.B0 = new Path();
            } else {
                path.rewind();
            }
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(f13), 0, mVar.k0);
            Path path2 = mVar.B0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, lerp4, lerp4, direction);
            canvas2.clipPath(mVar.B0);
            pz0 pz0Var = mVar.z0;
            if (pz0Var != null) {
                pz0Var.p = (int) (rectF2.width() - AndroidUtilities.dp(40.0f));
                pz0Var.c(rectF2.left + AndroidUtilities.dp(20.0f), f22 + AndroidUtilities.dp(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = mVar.D0;
            if (path3 == null) {
                mVar.D0 = new Path();
                float[] fArr = new float[8];
                mVar.E0 = fArr;
                float dp4 = AndroidUtilities.dp(5.0f);
                fArr[c10] = dp4;
                fArr[0] = dp4;
                float[] fArr2 = mVar.E0;
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
            float f23 = rectF3.left;
            rectF3.set(f23, rectF3.top, AndroidUtilities.dp(3.0f) + f23, rectF3.bottom);
            mVar.D0.addRoundRect(rectF3, mVar.E0, direction);
            if (mVar.C0 == null) {
                Paint paint5 = new Paint();
                mVar.C0 = paint5;
                paint5.setColor(-1);
            }
            mVar.C0.setAlpha((int) (f15 * 255.0f));
            canvas2.drawPath(mVar.D0, mVar.C0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            pz0 pz0Var2 = mVar.A0;
            if (pz0Var2 != null) {
                pz0Var2.p = (int) (rectF2.width() - AndroidUtilities.dp(40.0f));
                pz0Var2.c(rectF2.left + AndroidUtilities.dp(20.0f), f22 + AndroidUtilities.dp(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (e9 > 0.0f) {
            int i10 = mVar.H0;
            float dp6 = i10 == Integer.MAX_VALUE ? rectF2.right - AndroidUtilities.dp(20.0f) : i10 == Integer.MIN_VALUE ? rectF2.left + AndroidUtilities.dp(20.0f) : i10;
            float dp7 = rectF2.bottom - AndroidUtilities.dp(20.0f);
            float max = Math.max(Math.max(h7.y.a(rectF2.left, rectF2.top, dp6, dp7), h7.y.a(rectF2.left, rectF2.bottom, dp6, dp7)), Math.max(h7.y.a(rectF2.right, rectF2.top, dp6, dp7), h7.y.a(rectF2.right, rectF2.bottom, dp6, dp7))) * e9;
            if (mVar.J0 == null) {
                Paint paint6 = new Paint(1);
                mVar.J0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                mVar.K0 = radialGradient;
                mVar.J0.setShader(radialGradient);
                mVar.N0 = new Matrix();
                Paint paint7 = new Paint(1);
                mVar.L0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                mVar.M0 = radialGradient2;
                mVar.L0.setShader(radialGradient2);
            }
            mVar.N0.reset();
            mVar.N0.postTranslate(dp6, dp7);
            mVar.N0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.K0.setLocalMatrix(mVar.N0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, mVar.J0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, 255, 31);
            mVar.j(canvas2, rectF2);
            mVar.N0.reset();
            mVar.N0.postTranslate(dp6, dp7);
            mVar.N0.preScale(Math.max(1.0f, max) / 16.0f, Math.max(1.0f, max) / 16.0f);
            mVar.M0.setLocalMatrix(mVar.N0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f11, f11, mVar.L0);
            canvas2.restore();
            canvas2.restore();
            if (!(mVar instanceof ib)) {
                mVar.k(canvas2, rectF2, e9);
            }
        }
        canvas2.restore();
        if (mVar.d0 == null) {
            Path path4 = mVar.F0;
            path4.rewind();
            path4.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            jg.i iVar = mVar.c;
            iVar.k = f11;
            iVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            iVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.a0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.x0.contains(motionEvent.getX(), motionEvent.getY()) || this.l0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.nc ncVar = this.b0;
                if (action != 0 || this.l0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ncVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof s) && ((s) this).K1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i10 = 0;
                while (true) {
                    int childCount = getChildCount();
                    g gVar = this.f;
                    if (i10 >= childCount) {
                        this.H.b(false);
                        gVar.getEditText().setForceCursorEnd(true);
                        gVar.getEditText().requestFocus();
                        ot otVar = gVar.a;
                        otVar.requestFocus();
                        AndroidUtilities.showKeyboard(otVar);
                        gVar.getEditText().setScrollY(0);
                        ncVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                        float x8 = childAt.getX();
                        float y10 = childAt.getY();
                        float x10 = childAt.getX() + childAt.getWidth();
                        float y11 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.v0;
                        rectF.set(x8, y10, x10, y11);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float max;
        RectF rectF = this.w0;
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
        if (this instanceof as0) {
            max = 0.0f;
        } else {
            max = (1.0f - this.k0) * Math.max(0, (r0.getHeight() - AndroidUtilities.dp(82.0f)) - r0.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.B;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.A;
        linearGradient.setLocalMatrix(matrix);
        float f10 = rectF.left;
        float f11 = rectF.top;
        Paint paint = this.y;
        canvas.drawRect(f10, f11, rectF.right, AndroidUtilities.dp(10.0f) + f11, paint);
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
        return this.w0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return UserConfig.getInstance(this.Q).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.w;
    }

    public int getEditTextHeight() {
        return (int) this.r0.c;
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
        return this.I0.c;
    }

    public int getSelectionLength() {
        g gVar = this.f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(org.telegram.ui.Components.da daVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.I;
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
            Bitmap bitmap = this.C;
            if (bitmap != null) {
                bitmap.recycle();
                this.C = null;
            }
            TextPaint textPaint = this.D;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.C = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.C).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.n0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.o0 = null;
        this.q0 = null;
        Bitmap bitmap2 = this.C;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.C = null;
        }
    }

    public final boolean p() {
        g gVar = this.f;
        boolean z10 = gVar.x;
        a4 a4Var = this.H;
        if (z10 && gVar.getEmojiView() != null) {
            if (a4Var.c()) {
                gVar.getEmojiView().C();
                return true;
            }
            pt ptVar = gVar.d;
            if (ptVar != null) {
                ptVar.C();
                gVar.d.u(false);
            }
            return true;
        }
        if (gVar.e) {
            gVar.k(true);
            return true;
        }
        if ((!gVar.v && !a4Var.c()) || a4Var.d) {
            return false;
        }
        gVar.d();
        gVar.k(true);
        return true;
    }

    public void setAccount(int i10) {
        this.Q = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(jg.a aVar) {
        this.d0 = aVar;
    }

    public void setDialogId(long j10) {
        this.x = j10;
        i iVar = this.I;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.g0 = callback;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.b0.c(z10 && !this.l0);
    }

    public void setText(CharSequence charSequence) {
        this.R = true;
        this.f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.W = callbackVoidReturn;
    }

    public abstract void u(float f10);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.y0 = false;
            invalidate();
            return;
        }
        this.y0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.z0 = new pz0(charSequence2, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.A0 = new pz0(charSequence, 14.0f, null);
    }

    public void w() {
        this.I.getAdapter().c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().e = false;
        this.I.getAdapter().i0 = this instanceof s;
    }

    public void x(int i10) {
        zu0 zu0Var = this.G;
        if (zu0Var != null) {
            zu0Var.S();
        }
        g gVar = this.f;
        if (gVar.e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.J) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i10 - (zu0Var == null ? 0 : zu0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof as0)) {
            ObjectAnimator objectAnimator = this.h0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.h0.cancel();
                this.h0 = null;
            }
            this.h0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.h0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                this.h0.setDuration(250L);
            } else {
                this.h0.setInterpolator(er.h);
                this.h0.setDuration(640L);
            }
            this.h0.start();
        }
        this.i0 = max > AndroidUtilities.dp(20.0f);
        e eVar = this.j0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.I != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.r0.c;
            if (this.I.getY() != translationY) {
                this.I.setTranslationY(translationY);
                this.I.invalidate();
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

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}

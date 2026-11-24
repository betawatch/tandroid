// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ib1 extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public tgb D0;
    public final Paint E;
    public tgb E0;
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
    public final cja L;
    public int L0;
    public final mv5 M;
    public final lm M0;
    public eb1 N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final sl0 P;
    public Paint P0;
    public final wl0 Q;
    public RadialGradient Q0;
    public final wl0 R;
    public Matrix R0;
    public final wl0 S;
    public final wl0 T;
    public wl0 U;
    public int V;
    public boolean W;
    public wjb a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final u9b c;
    public int c0;
    public final u9b d;
    public final za1 d0;
    public final Paint e;
    public boolean e0;
    public final cb1 f;
    public final n41 f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public kl0 h0;
    public il0 i0;
    public p8c j0;
    public p8c k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final fm2 n;
    public final za1 n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final fb1 r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final lm v0;
    public final hn w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public ib1(Context context, FrameLayout frameLayout, cja cjaVar, FrameLayout frameLayout2, wjb wjbVar, sl0 sl0Var) {
        super(context);
        u9b u9bVar = new u9b();
        this.c = u9bVar;
        u9b u9bVar2 = new u9b();
        this.d = u9bVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        byte b = 0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = y6c.t0;
        this.d0 = new za1(this, b);
        this.f0 = new n41(this, 1.0f, 3.0f);
        this.n0 = new za1(this, (byte) 1);
        s33 s33Var = s33.h;
        this.v0 = new lm(this, 0L, 300L, s33Var);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new lm(500L, this, s33Var);
        this.a = wjbVar;
        this.K = frameLayout;
        this.L = cjaVar;
        this.b = frameLayout2;
        this.P = sl0Var;
        this.S = new wl0(sl0Var, this, 0, !g());
        this.T = new wl0(sl0Var, this, 8, false);
        this.R = new wl0(sl0Var, this, 9, false);
        u9bVar.l = true;
        int i = bkb.c6;
        float f = 0.0f;
        u9bVar.a = new ab1(wjbVar, i, f, b);
        u9bVar.a();
        u9bVar.g.setColor(0);
        u9bVar.invalidateSelf();
        u9bVar2.l = true;
        u9bVar2.a = new ab1(wjbVar, i, f, (byte) 1);
        u9bVar2.a();
        u9bVar2.g.setColor(0);
        u9bVar2.invalidateSelf();
        paint.setColor(TLObject.FLAG_31);
        this.M = new mv5(frameLayout, false, new be2(this, (byte) 11));
        cb1 cb1Var = new cb1(this, context, cjaVar, getEditTextStyle(), new f53(), wjbVar, sl0Var);
        this.f = cb1Var;
        cb1Var.T = true;
        cb1Var.getEditText().addTextChangedListener(new fi());
        cb1Var.setFocusable(true);
        cb1Var.setFocusableInTouchMode(true);
        cb1Var.getEditText().r0 = true;
        cb1Var.getEditText().t0 = new f(this, (byte) 22);
        cb1Var.getEditText().setSupportRtlHint(true);
        this.Q = new wl0(sl0Var, cb1Var.getEditText(), g() ? 1 : 2, false);
        cb1Var.getEditText().setHintColor(-1);
        cb1Var.getEditText().r(k96.M0(2131754451, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        cb1Var.getEditText().setTranslationX(gl.L(-26.0f));
        boolean z = this instanceof z78;
        if (z) {
            cb1Var.getEditText().setGravity(48);
        }
        cb1Var.getEmojiButton().setAlpha(0.0f);
        cb1Var.getEmojiButton().setTranslationY(gl.L(z ? 1.0f : -1.0f));
        cb1Var.setTranslationY(gl.L(z ? 1.0f : -1.0f));
        cb1Var.getEditText().addTextChangedListener(new db1(this));
        cb1Var.getEditText().setLinkTextColor(-1);
        addView(cb1Var, nme.d(-1, -2.0f, (z ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        fb1 fb1Var = new fb1(context);
        this.r = fb1Var;
        ote.b(fb1Var, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        zkb.x(this, mutate, bkb.T5, null, PorterDuff.Mode.SRC_IN);
        fm2 fm2Var = new fm2(bkb.K(gl.L(18.0f), bkb.v0(bkb.pg, wjbVar)), mutate, 0, gl.L(1.0f));
        this.n = fm2Var;
        int L = gl.L(36.0f);
        int L2 = gl.L(36.0f);
        fm2Var.h = L;
        fm2Var.n = L2;
        fb1Var.setImageDrawable(fm2Var);
        fb1Var.setScaleType(ImageView.ScaleType.CENTER);
        fb1Var.setContentDescription(k96.M0(2131751342, null));
        fb1Var.setAlpha(0.0f);
        fb1Var.setVisibility(8);
        fb1Var.setOnClickListener(new x91(this, (byte) 1));
        addView(fb1Var, nme.d(44, 44.0f, (z ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        hn hnVar = new hn(context, false, true, true);
        this.w = hnVar;
        hnVar.setGravity(17);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTextColor(-1);
        hnVar.b(0.4f, 320L, s33Var);
        hnVar.setTypeface(gl.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(gl.L(2.0f));
        frameLayout3.addView(hnVar, nme.e(52, 16, (z ? 48 : 80) | 5));
        addView(frameLayout3, nme.d(52, 16.0f, (z ? 48 : 80) | 5, 0.0f, z ? 50 : 0, 0.0f, z ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return gl.n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z);

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x021c, code lost:
    
        if ((r2 <= 0.0f ? r10 : 0) != (r11 <= 0.0f ? r10 : 0)) goto L64;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f;
        ib1 ib1Var;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        RectF rectF2;
        wl0 wl0Var;
        wl0 wl0Var2;
        float f5;
        float f6;
        Paint paint;
        RectF rectF3;
        Canvas canvas2 = canvas;
        if (this.y0) {
            return;
        }
        cb1 cb1Var = this.f;
        int height = cb1Var.getHeight();
        int L = this.K0 ? gl.L(44.0f) : this.p0 ? Math.max(gl.L(44.0f), height) : Math.min(gl.L(82.0f), height);
        if (!this.K0 && this.C0) {
            L += gl.L(50.0f);
        }
        float f7 = L;
        int e = (int) this.v0.e(false, f7);
        if (e != this.w0) {
            r(e);
            p8c p8cVar = this.j0;
            if (p8cVar != null) {
                p8cVar.a(Integer.valueOf(e));
            }
            this.w0 = L;
        }
        y();
        int L2 = gl.L(7.0f);
        int L3 = gl.L(8.0f);
        boolean z = this instanceof z78;
        RectF rectF4 = this.B0;
        RectF rectF5 = this.A0;
        if (z) {
            if (!this.K0) {
                float R1 = gl.R1(gl.N(-1.0f), gl.N(1.0f), this.o0);
                gt3 editText = cb1Var.getEditText();
                this.x0 = R1;
                editText.setTranslationY(R1);
            }
            float f8 = L2;
            float f9 = L3;
            rectF5.set(f8, f9, getWidth() - L2, L3 + e);
            rectF4.set(f8, f9, getWidth() - L2, gl.L(24.0f) + r4);
            f = 82.0f;
        } else {
            f = 82.0f;
            float R12 = (gl.R1(gl.N(1.0f), gl.N(-1.0f), this.o0) + f7) - e;
            if (Math.abs(this.x0 - R12) >= 1.0f && !this.K0) {
                gt3 editText2 = cb1Var.getEditText();
                this.x0 = R12;
                editText2.setTranslationY(R12);
            }
            rectF5.set(L2, (getHeight() - L3) - e, getWidth() - L2, getHeight() - L3);
            rectF4.set(0.0f, (getHeight() - e) - gl.L(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float a = this.f0.a(0.018f);
        canvas2.scale(a, a, rectF5.centerX(), rectF5.centerY());
        float U1 = gl.U1(this.o0 * 0.0f, gl.L(21.0f), 0);
        kl0 kl0Var = this.h0;
        if (kl0Var != null) {
            if (this.i0 == null) {
                il0 c = kl0Var.c(this, null, false);
                c.p(nod.i(this.a));
                c.q(gl.L(5.0f));
                c.r(gl.L(22.0f));
                this.i0 = c;
            }
            Rect rect = gl.Q;
            rectF5.round(rect);
            rect.inset(-gl.U1(this.o0, gl.L(1.0f), gl.L(5.0f)), -gl.L(5.0f));
            this.i0.setBounds(rect);
            this.i0.draw(canvas2);
            ib1Var = this;
            rectF = rectF5;
            f2 = U1;
            f3 = 21.0f;
            f4 = 50.0f;
            i = 1;
        } else {
            boolean g = g();
            Paint paint2 = this.e;
            wl0 wl0Var3 = this.S;
            if (g) {
                f4 = 50.0f;
                f3 = 21.0f;
                i = 1;
                h(wl0Var3, canvas, rectF5, U1, false, 0.0f, 0.0f, true);
                ib1Var = this;
                canvas2 = canvas;
                rectF = rectF5;
                f2 = U1;
                paint2.setAlpha(gl.U1(ib1Var.o0, 38, 64));
                canvas2.drawRoundRect(rectF, f2, f2, paint2);
            } else {
                ib1Var = this;
                rectF = rectF5;
                f2 = U1;
                f3 = 21.0f;
                f4 = 50.0f;
                i = 1;
                Paint[] d = wl0Var3.d();
                if (d[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f2, f2, paint2);
                } else {
                    Paint paint3 = d[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f2, f2, paint3);
                    }
                    Paint paint4 = d[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f2, f2, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f2, f2, paint2);
                }
            }
        }
        lm lmVar = ib1Var.M0;
        float f10 = lmVar.c;
        float d2 = lmVar.d(ib1Var.K0);
        if (Math.abs(f10 - d2) <= 0.001f) {
        }
        ib1Var.n();
        if (d2 > 0.0f) {
            canvas2.saveLayerAlpha(rectF, kk7.d4, 31);
        }
        if (!ib1Var.C0 || (wl0Var = ib1Var.T) == null || (wl0Var2 = ib1Var.R) == null) {
            i2 = i;
            i3 = 3;
            rectF2 = rectF;
        } else {
            if (ib1Var.K0) {
                float max = rectF.bottom - (ib1Var.p0 ? Math.max(gl.L(46.0f), cb1Var.getHeight()) : Math.min(gl.L(f), cb1Var.getHeight()));
                f5 = max - gl.L(f4);
                f6 = 1.0f - lmVar.c;
            } else {
                f5 = rectF.top;
                f6 = 1.0f;
            }
            float f11 = f5;
            Paint c2 = wl0Var.c(f6);
            Paint c3 = wl0Var2.c(f6);
            RectF rectF6 = gl.P;
            rectF6.set(rectF.left + gl.L(10.0f), f11 + gl.L(10.0f), rectF.right - gl.L(10.0f), f11 + gl.L(52.0f));
            if (c2 != null) {
                canvas2.drawRoundRect(rectF6, gl.L(5.0f), gl.L(5.0f), c2);
            }
            if (c3 != null) {
                paint = c3;
                rectF3 = rectF6;
                i2 = i;
                i3 = 3;
                rectF2 = rectF;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, kk7.d4, 31);
                canvas2 = canvas;
            } else {
                paint = c3;
                rectF3 = rectF6;
                i2 = i;
                i3 = 3;
                rectF2 = rectF;
            }
            Path path = ib1Var.F0;
            if (path == null) {
                ib1Var.F0 = new Path();
            } else {
                path.rewind();
            }
            float U12 = gl.U1(ib1Var.o0, gl.L(f3), 0);
            Path path2 = ib1Var.F0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, U12, U12, direction);
            canvas2.clipPath(ib1Var.F0);
            tgb tgbVar = ib1Var.D0;
            if (tgbVar != null) {
                tgbVar.p = (int) (rectF2.width() - gl.L(40.0f));
                tgbVar.c(rectF2.left + gl.L(20.0f), f11 + gl.L(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = ib1Var.H0;
            if (path3 == null) {
                ib1Var.H0 = new Path();
                float[] fArr = new float[8];
                ib1Var.I0 = fArr;
                float L4 = gl.L(5.0f);
                fArr[i2] = L4;
                fArr[0] = L4;
                float[] fArr2 = ib1Var.I0;
                fArr2[i3] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float L5 = gl.L(5.0f);
                fArr2[7] = L5;
                fArr2[6] = L5;
            } else {
                path3.rewind();
            }
            float f12 = rectF3.left;
            rectF3.set(f12, rectF3.top, gl.L(3.0f) + f12, rectF3.bottom);
            ib1Var.H0.addRoundRect(rectF3, ib1Var.I0, direction);
            if (ib1Var.G0 == null) {
                Paint paint5 = new Paint();
                ib1Var.G0 = paint5;
                paint5.setColor(-1);
            }
            ib1Var.G0.setAlpha((int) (f6 * 255.0f));
            canvas2.drawPath(ib1Var.H0, ib1Var.G0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF2, paint);
                canvas2.restore();
                canvas2.restore();
            }
            tgb tgbVar2 = ib1Var.E0;
            if (tgbVar2 != null) {
                tgbVar2.p = (int) (rectF2.width() - gl.L(40.0f));
                tgbVar2.c(rectF2.left + gl.L(20.0f), f11 + gl.L(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (d2 > 0.0f) {
            int i4 = ib1Var.L0;
            float L6 = i4 == Integer.MAX_VALUE ? rectF2.right - gl.L(20.0f) : i4 == Integer.MIN_VALUE ? rectF2.left + gl.L(20.0f) : i4;
            float L7 = rectF2.bottom - gl.L(20.0f);
            float max2 = Math.max(Math.max(loe.a(rectF2.left, rectF2.top, L6, L7), loe.a(rectF2.left, rectF2.bottom, L6, L7)), Math.max(loe.a(rectF2.right, rectF2.top, L6, L7), loe.a(rectF2.right, rectF2.bottom, L6, L7))) * d2;
            if (ib1Var.N0 == null) {
                Paint paint6 = new Paint(i2);
                ib1Var.N0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                float[] fArr3 = new float[i3];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 0.6f;
                fArr3[2] = 1.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, fArr3, tileMode);
                ib1Var.O0 = radialGradient;
                ib1Var.N0.setShader(radialGradient);
                ib1Var.R0 = new Matrix();
                Paint paint7 = new Paint(1);
                ib1Var.P0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                ib1Var.Q0 = radialGradient2;
                ib1Var.P0.setShader(radialGradient2);
            }
            ib1Var.R0.reset();
            ib1Var.R0.postTranslate(L6, L7);
            ib1Var.R0.preScale(Math.max(1.0f, max2) / 16.0f, Math.max(1.0f, max2) / 16.0f);
            ib1Var.O0.setLocalMatrix(ib1Var.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f2, f2, ib1Var.N0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF2, kk7.d4, 31);
            ib1Var.j(canvas2, rectF2);
            ib1Var.R0.reset();
            ib1Var.R0.postTranslate(L6, L7);
            ib1Var.R0.preScale(Math.max(1.0f, max2) / 16.0f, Math.max(1.0f, max2) / 16.0f);
            ib1Var.Q0.setLocalMatrix(ib1Var.R0);
            canvas2.save();
            canvas2.drawRoundRect(rectF2, f2, f2, ib1Var.P0);
            canvas2.restore();
            canvas2.restore();
            if (!(ib1Var instanceof j7b)) {
                ib1Var.k(canvas2, rectF2, d2);
            }
        }
        canvas2.restore();
        if (ib1Var.h0 == null) {
            Path path4 = ib1Var.J0;
            path4.rewind();
            path4.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            u9b u9bVar = ib1Var.c;
            u9bVar.m = f2;
            u9bVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            u9bVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                n41 n41Var = this.f0;
                if (action != 0 || this.p0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        n41Var.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof rb1) && ((rb1) this).O1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i = 0;
                while (true) {
                    int childCount = getChildCount();
                    cb1 cb1Var = this.f;
                    if (i >= childCount) {
                        this.M.b(false);
                        cb1Var.getEditText().setForceCursorEnd(true);
                        cb1Var.getEditText().requestFocus();
                        mt3 mt3Var = cb1Var.a;
                        mt3Var.requestFocus();
                        gl.F3(mt3Var);
                        cb1Var.getEditText().setScrollY(0);
                        n41Var.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && cb1Var != childAt) {
                        float x = childAt.getX();
                        float y = childAt.getY();
                        float x2 = childAt.getX() + childAt.getWidth();
                        float y2 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.z0;
                        rectF.set(x, y, x2, y2);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i++;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float max;
        RectF rectF = this.A0;
        if (view != this.f) {
            if (!f(view)) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        if (this instanceof z78) {
            max = 0.0f;
        } else {
            max = (1.0f - this.o0) * Math.max(0, (r1.getHeight() - gl.L(82.0f)) - r1.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, max);
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.G;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.F;
        linearGradient.setLocalMatrix(matrix);
        float f = rectF.left;
        float f2 = rectF.top;
        Paint paint = this.E;
        canvas.drawRect(f, f2, rectF.right, gl.L(10.0f) + f2, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - gl.L(10.0f), rectF.right, rectF.bottom, paint);
        canvas.restore();
        canvas.restore();
        return drawChild2;
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public boolean g() {
        return true;
    }

    public RectF getBounds() {
        return this.A0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return y6c.h(this.V).p() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
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
        return Math.min(gl.L(82.0f), this.f.getHeight());
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
        cb1 cb1Var = this.f;
        if (cb1Var != null && cb1Var.getEditText() != null) {
            try {
                return cb1Var.getEditText().getSelectionEnd() - cb1Var.getEditText().getSelectionStart();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(wl0 wl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    public abstract boolean l(float f, float f2);

    public final void m() {
        invalidate();
        cb1 cb1Var = this.f;
        cb1Var.getEditText().invalidate();
        cb1Var.getEmojiButton().invalidate();
        eb1 eb1Var = this.N;
        if (eb1Var != null) {
            eb1Var.invalidate();
        }
        if (cb1Var.getEmojiView() == null || !g()) {
            return;
        }
        cb1Var.getEmojiView().invalidate();
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
            textPaint.setTextSize(gl.L(16.0f));
            String M0 = k96.M0(2131754451, null);
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
        cb1 cb1Var = this.f;
        boolean z = cb1Var.y;
        mv5 mv5Var = this.M;
        if (z && cb1Var.getEmojiView() != null) {
            if (mv5Var.c()) {
                cb1Var.getEmojiView().z();
                return true;
            }
            nt3 nt3Var = cb1Var.d;
            if (nt3Var != null) {
                nt3Var.z();
                cb1Var.d.s(false);
            }
            return true;
        }
        if (cb1Var.e) {
            cb1Var.k(true);
            return true;
        }
        if ((!cb1Var.w && !mv5Var.c()) || mv5Var.d) {
            return false;
        }
        cb1Var.d();
        cb1Var.k(true);
        return true;
    }

    public void setAccount(int i) {
        this.V = i;
    }

    public void setBlurredBackgroundDrawableForMentions(kl0 kl0Var) {
        this.h0 = kl0Var;
    }

    public void setDialogId(long j) {
        this.y = j;
        eb1 eb1Var = this.N;
        if (eb1Var != null) {
            eb1Var.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(p8c p8cVar) {
        this.j0 = p8cVar;
    }

    public void setOnKeyboardOpen(p8c p8cVar) {
        this.k0 = p8cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f0.c(z && !this.p0);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f.setText(charSequence);
    }

    public abstract void u(float f);

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
        this.D0 = new tgb(charSequence2, 14.0f, gl.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new tgb(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof rb1;
    }

    public void x(int i) {
        cja cjaVar = this.L;
        if (cjaVar != null) {
            cjaVar.R();
        }
        cb1 cb1Var = this.f;
        if (cb1Var.e) {
            i = Math.max(0, cb1Var.getEmojiPadding() + a());
        } else if (cb1Var.O) {
            i = Math.max(0, cb1Var.getKeyboardHeight() + a());
        }
        int max = Math.max(0, i - (cjaVar == null ? 0 : cjaVar.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof z78)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            int L = gl.L(20.0f);
            ObjectAnimator objectAnimator2 = this.l0;
            if (max > L) {
                objectAnimator2.setInterpolator(gb.w);
                this.l0.setDuration(250L);
            } else {
                objectAnimator2.setInterpolator(s33.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        this.m0 = max > gl.L(20.0f);
        za1 za1Var = this.n0;
        gl.r(za1Var);
        gl.d3(za1Var);
        if (max < gl.L(20.0f)) {
            cb1Var.getEditText().clearFocus();
            cb1Var.k(true);
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

    public void q(boolean z) {
    }

    public void r(int i) {
    }

    public void setUiBlurBitmap(r8c r8cVar) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i, int i2) {
    }

    public void k(Canvas canvas, RectF rectF, float f) {
    }
}

// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ih3 extends FrameLayout implements jm7, g94 {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final eh3 F;
    public float F0;
    public final eh3 G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final zb1 J;
    public float J0;
    public hg5 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final yh4 M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final sc3 S;
    public final u46 T;
    public final io U;
    public final b6 V;
    public final ImageView W;
    public final fn0 a;
    public final ImageView a0;
    public final int b;
    public final tm b0;
    public final Drawable c;
    public final ArrayList c0;
    public final dh3 d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final nk3 f0;
    public CharSequence g0;
    public final ch3 h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public gh3 l0;
    public boolean m0;
    public u09 n;
    public boolean n0;
    public float o0;
    public int p0;
    public hh3 q0;
    public final ch3 r;
    public a r0;
    public final h4b s;
    public ow0 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final x03 x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public ih3(Context context, nk3 nk3Var, int i, int i2) {
        super(context);
        this.a = new fn0(1, this, d53.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        aj3 aj3Var = (aj3) this;
        byte b = 0;
        eh3 eh3Var = new eh3(aj3Var, false);
        this.F = eh3Var;
        byte b2 = 1;
        eh3 eh3Var2 = new eh3(aj3Var, true);
        this.G = eh3Var2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        zb1 zb1Var = new zb1(this);
        this.J = zb1Var;
        this.O = -1.0f;
        this.P = -1;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = -1.0f;
        this.m0 = true;
        this.u0 = 1.0f;
        this.v0 = 0.95f;
        this.w0 = 0.9f;
        this.x0 = new x03((byte) 11);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        yh4 yh4Var = new yh4(this);
        this.M0 = yh4Var;
        this.b = i2;
        this.f = i;
        this.f0 = nk3Var;
        this.t0 = gm.L(68.0f);
        this.s = oc7.r1(i).N1();
        ch3 ch3Var = new ch3(aj3Var, context, b);
        this.h = ch3Var;
        ch3Var.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        ch3Var.setClipToPadding(false);
        ch3Var.setClipChildren(false);
        zb1Var.h = new zg3(aj3Var, b);
        jd jdVar = new jd(aj3Var, (byte) 27);
        zb1Var.l = true;
        zb1Var.j = jdVar;
        ch3Var.j(new ip2(aj3Var, (byte) 6));
        sc3 sc3Var = new sc3();
        this.S = sc3Var;
        sc3Var.C = false;
        sc3Var.n(150L);
        sc3Var.m = false;
        ch3Var.setItemAnimator(sc3Var);
        u46 u46Var = new u46(0, false);
        this.T = u46Var;
        ch3Var.setLayoutManager(u46Var);
        ch3Var.setOnItemClickListener(new u(aj3Var, (byte) 21));
        ch3Var.setOnItemLongClickListener(new wm2(aj3Var, (byte) 23));
        ch3Var.setAdapter(eh3Var);
        addView(ch3Var, qoe.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        io ioVar = new io(getContext(), true, true, false);
        this.U = ioVar;
        ioVar.setGravity(3);
        ioVar.setTextColor(getTextLogoColor());
        ioVar.setTypeface(gm.o());
        ioVar.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        ioVar.setTextSize(gm.L((gm.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        ioVar.setImportantForAccessibility(1);
        ioVar.setFocusableInTouchMode(true);
        addView(ioVar, qoe.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(jb6.M0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, qoe.c(22.0f, 90));
        tm tmVar = new tm(gm.L(26.0f), null);
        this.b0 = tmVar;
        tmVar.a = true;
        tmVar.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(tmVar);
        addView(imageView2, qoe.c(40.0f, 40));
        b6 b6Var = new b6(aj3Var, context, yh4Var);
        this.V = b6Var;
        addView(b6Var, qoe.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        ch3 ch3Var2 = new ch3(aj3Var, getContext(), b2);
        this.r = ch3Var2;
        getContext();
        ch3Var2.setLayoutManager(new u46(0, false));
        ch3Var2.i(new as1(b2));
        dh3 dh3Var = new dh3();
        this.d = dh3Var;
        dh3Var.C = false;
        dh3Var.m = false;
        ch3Var2.setItemAnimator(dh3Var);
        ch3Var2.setAdapter(eh3Var2);
        ch3Var2.setClipChildren(false);
        addView(ch3Var2, qoe.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(cmb.z8) : f(cmb.O8);
    }

    private int getTextLogoColor() {
        return f(cmb.Wl);
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 1) {
            d();
        }
    }

    public final void b() {
        this.O = 1.0f - gm.R1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
        d();
        float f = this.O;
        byte b = 0;
        int i = f == 1.0f ? 2 : f != 0.0f ? 1 : 0;
        if (this.P != i) {
            this.P = i;
            if (i != 1 && this.L) {
                gm.c3(new xg3(this, b));
            }
            int i2 = this.P;
            ch3 ch3Var = this.r;
            ch3 ch3Var2 = this.h;
            if (i2 == 0) {
                gm.d0(ch3Var2, new bn0((byte) 7));
                ch3Var.setVisibility(4);
                ch3Var2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i3 = this.f;
                if (i2 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.y;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        if (((fh3) arrayList2.get(i4)).c != z8c.h(i3).e() || m()) {
                            arrayList.add(Long.valueOf(((fh3) arrayList2.get(i4)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i4++;
                    }
                    ch3Var.setVisibility(4);
                    ch3Var2.setVisibility(0);
                } else if (i2 == 2) {
                    ch3Var.setVisibility(0);
                    ch3Var2.setVisibility(4);
                    this.T.g1(0, 0);
                    ge7 ge7Var = oc7.r1(i3).N1().K;
                    gm.r(ge7Var);
                    ge7Var.run();
                    ow0 ow0Var = this.s0;
                    if (ow0Var != null) {
                        ow0Var.a();
                        this.s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int M0;
        u46 u46Var = this.T;
        int M02 = u46Var.M0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        h4b h4bVar = this.s;
        if (M02 > size || ((M0 = u46Var.M0() + 9) < arrayList.size() && h4bVar.D(0, ((fh3) arrayList.get(M0)).c) == 0)) {
            boolean z = this.b == 1;
            if (z) {
                if (!h4bVar.z) {
                    return;
                }
            } else if (!h4bVar.p) {
                return;
            }
            h4bVar.S(z);
        }
    }

    public final void d() {
        float a = pqe.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f = this.a.e;
        float f2 = 1.0f - f;
        float f3 = f * a;
        float f4 = f2 * a;
        io ioVar = this.U;
        if (ioVar != null) {
            ioVar.setAlpha(f3);
            ioVar.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setAlpha(f4);
            imageView.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.a0;
        if (imageView2 != null) {
            imageView2.setAlpha(f4);
            imageView2.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.setAlpha(a);
            b6Var.setVisibility(a > 0.0f ? 0 : 8);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.z5 && this.m0) {
            p(getVisibility() == 0, false);
            gm.c3(new xg3(this, (byte) 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bf  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        float f;
        float f2;
        ch3 ch3Var;
        float f3;
        float f4;
        ch3 ch3Var2;
        boolean z;
        Canvas canvas2;
        boolean z2;
        float f5;
        double d;
        boolean z3;
        float f6;
        float f7;
        ch3 ch3Var3;
        float L;
        float f8;
        float R1;
        float f9;
        float R12;
        int i2;
        float f10;
        float f11;
        float R13;
        float f12;
        float f13;
        int R;
        canvas.save();
        int i3 = this.M;
        if (i3 > 0) {
            canvas.clipRect(0, i3, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - a.getCurrentActionBarHeight()) - gm.L(4.0f);
        float f14 = 0.0f;
        float R14 = gm.R1(0.0f, measuredHeight, this.d0);
        ch3 ch3Var4 = this.h;
        ch3Var4.setTranslationY(R14);
        ch3 ch3Var5 = this.r;
        ch3Var5.setTranslationY(R14);
        ch3Var5.setTranslationX(this.t0);
        int i4 = 0;
        while (true) {
            arrayList = this.Q;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((hh3) arrayList.get(i4)).a = false;
            i4++;
        }
        arrayList.clear();
        int i5 = this.P;
        int i6 = -1;
        ArrayList arrayList2 = this.R;
        if ((i5 == 1 || i5 == 0) && !arrayList2.isEmpty()) {
            i = -1;
            f = 4.0f;
            for (int i7 = 0; i7 < ch3Var4.getChildCount(); i7++) {
                hh3 hh3Var = (hh3) ch3Var4.getChildAt(i7);
                i = hh3Var.F == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(hh3Var) : i;
            }
        } else {
            f = 4.0f;
            i = this.P == 2 ? 0 : -1;
        }
        int i8 = this.P;
        if (i8 < 0 || i8 == 2) {
            f2 = R14;
            ch3Var = ch3Var4;
            f3 = 2.0f;
            float f15 = 0.0f;
            for (int i9 = 0; i9 < ch3Var5.getChildCount(); i9++) {
                float x = ((hh3) ch3Var5.getChildAt(i9)).getX() + ch3Var5.getX() + r4.getMeasuredWidth();
                if (f15 == 0.0f || x > f15) {
                    f15 = x;
                }
            }
            f4 = f15;
        } else {
            if (i == -1) {
                u46 u46Var = this.T;
                i = u46Var.H0();
                if (i == -1) {
                    i = u46Var.K0();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            ch3Var4.setAlpha(1.0f - Utilities.i(this.O / this.C0, 1.0f, 0.0f));
            this.p0 = -1;
            if (this.o0 != 0.0f) {
                int i10 = -1;
                int i11 = 0;
                f3 = 2.0f;
                while (i11 < ch3Var4.getChildCount()) {
                    View childAt = ch3Var4.getChildAt(i11);
                    if (childAt.getX() < f14 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i10 != i6 && R >= i10)) {
                        f13 = R14;
                    } else {
                        f13 = R14;
                        if (((fh3) this.y.get(R)).c != z8c.h(this.f).n) {
                            this.q0 = (hh3) childAt;
                            i10 = R;
                        }
                    }
                    i11++;
                    R14 = f13;
                    i6 = -1;
                    f14 = 0.0f;
                }
                f2 = R14;
                this.p0 = i10;
            } else {
                f2 = R14;
                f3 = 2.0f;
            }
            float f16 = 0.0f;
            int i12 = 0;
            while (i12 < ch3Var4.getChildCount()) {
                hh3 hh3Var2 = (hh3) ch3Var4.getChildAt(i12);
                hh3Var2.setClipInParent(false);
                v4b v4bVar = hh3Var2.P;
                int R2 = RecyclerView.R(hh3Var2);
                float f17 = this.O;
                if (R2 < i || R2 >= arrayList2.size() + i) {
                    f5 = measuredHeight;
                } else {
                    int i13 = R2 - i;
                    int i14 = i + 2;
                    float f18 = this.O;
                    if (i13 == i14) {
                        f5 = measuredHeight;
                        f17 = f18;
                    } else if (i13 == i + 1) {
                        f5 = measuredHeight;
                        f17 = (float) Math.pow(f18, 0.5d);
                    } else {
                        f5 = measuredHeight;
                        d = 0.25d;
                        f17 = (float) Math.pow(f18, 0.25d);
                        if (R2 < i) {
                            f17 = (float) Math.pow(this.O, d);
                        }
                        hh3Var2.d(f17, this.e0, this.o0, this.p0 != hh3Var2.b);
                        v4bVar.g = 0.0f;
                        RectF rectF = v4bVar.F;
                        v4bVar.h = 0.0f;
                        v4bVar.i = 0.0f;
                        v4bVar.j = 0.0f;
                        if (R2 > i || R2 >= arrayList2.size() + i) {
                            z3 = z2;
                            f6 = f16;
                            f7 = f17;
                            ch3Var3 = ch3Var4;
                            v4bVar.k = false;
                        } else {
                            hh3 hh3Var3 = (hh3) ch3Var4.getChildAt(i12 - 1);
                            if (hh3Var3 != null) {
                                v4b v4bVar2 = hh3Var3.P;
                                float L2 = gm.L(48.0f);
                                float L3 = gm.L(26.33f);
                                z3 = z2;
                                float R15 = (gm.R1(L2, L3, hh3Var3.K) + gm.L(8.0f)) / f3;
                                float R16 = (gm.R1(L2, L3, hh3Var2.K) + gm.L(8.0f)) / f3;
                                float x2 = hh3Var3.getX() + v4bVar2.F.centerX();
                                float y = hh3Var3.getY() + v4bVar2.F.centerY();
                                float x3 = hh3Var2.getX() + rectF.centerX();
                                float y2 = hh3Var2.getY() + rectF.centerY();
                                float f19 = x3 - x2;
                                float f20 = y2 - y;
                                f6 = f16;
                                if (((float) Math.sqrt((f20 * f20) + (f19 * f19))) < R15 + R16) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f7 = f17;
                                    ch3Var3 = ch3Var4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(f20, f19));
                                    float f21 = degrees / f3;
                                    v4bVar2.g = degrees2 - f21;
                                    v4bVar2.h = degrees2 + f21;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-f20, -f19));
                                    float f22 = -Math.abs(degrees3 - f21);
                                    float abs = Math.abs(degrees3 + f21);
                                    v4bVar.i = f22;
                                    v4bVar.j = abs;
                                } else {
                                    f7 = f17;
                                    ch3Var3 = ch3Var4;
                                    v4bVar2.g = 0.0f;
                                    v4bVar2.h = 0.0f;
                                    v4bVar.i = 0.0f;
                                    v4bVar.j = 0.0f;
                                }
                                v4bVar2.k = false;
                                v4bVar.k = false;
                            } else {
                                z3 = z2;
                                f6 = f16;
                                f7 = f17;
                                ch3Var3 = ch3Var4;
                            }
                        }
                        L = gm.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f23 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 > i) {
                            f8 = 0.0f;
                            R1 = 0.0f;
                        } else if (R2 == i + 1) {
                            R1 = gm.R1(gm.L(16.0f), 0.0f, this.O) + ((gm.L(16.0f) * f7) - gm.N(0.5f));
                            f8 = 0.0f;
                        } else {
                            f8 = 0.0f;
                            R1 = gm.R1(gm.L(32.0f), 0.0f, this.O) + (((gm.L(16.0f) * f7) + gm.L(16.0f)) - gm.N(0.5f));
                        }
                        float f24 = R1 + this.t0;
                        if (this.B0) {
                            if (this.o0 > f8) {
                                int i15 = hh3Var2.b;
                                int i16 = this.p0;
                                if (i15 < i16) {
                                    f12 = -L;
                                } else if (i15 > i16) {
                                    f12 = L;
                                }
                                R12 = gm.R1(f24 - hh3Var2.getLeft(), f12, 1.0f - this.J0);
                                f9 = 0.0f;
                            }
                            f12 = 0.0f;
                            R12 = gm.R1(f24 - hh3Var2.getLeft(), f12, 1.0f - this.J0);
                            f9 = 0.0f;
                        } else {
                            f9 = 0.0f;
                            R12 = gm.R1(0.0f, f24 - hh3Var2.getLeft(), this.K0.getInterpolation(this.F0));
                        }
                        float a = pqe.a((this.d0 - 0.2f) / 0.1f, f9, 1.0f);
                        i2 = R2 - i;
                        if (i2 != 0) {
                            f10 = 0.65f;
                            R13 = gm.R1(f9, f2 - f5, d53.h.getInterpolation(this.O));
                        } else {
                            f10 = 0.65f;
                            if (i2 == 1) {
                                R13 = gm.R1(f9, (f2 - f5) * 0.65f, d53.h.getInterpolation(this.O));
                            } else {
                                f11 = f9;
                                float f25 = (hh3Var2.b == this.p0 || this.o0 <= f9) ? 0.0f : (-L) / f3;
                                float R17 = gm.R1(i2 == 0 ? gm.R1(f25, f2 - f5, this.H0) : i2 == 1 ? gm.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a);
                                if (this.O > 0.0f) {
                                    boolean z4 = R2 >= i && R2 <= i + 2;
                                    if (!z3) {
                                        hh3Var2.setCrossfadeTo(-1L);
                                    } else if (i2 < 0 || i2 >= arrayList2.size()) {
                                        hh3Var2.setCrossfadeTo(-1L);
                                    } else {
                                        hh3Var2.setCrossfadeTo(((Long) arrayList2.get(i2)).longValue());
                                    }
                                    hh3Var2.a = z4;
                                    hh3Var2.d = R2 == i;
                                    hh3Var2.c = R2 >= (arrayList2.size() + i) + (-1);
                                    hh3Var2.setTranslationX(R12);
                                    hh3Var2.setTranslationY(R17);
                                    if (z4) {
                                        arrayList.add(hh3Var2);
                                    }
                                } else if (ch3Var3.getItemAnimator() == null || !ch3Var3.getItemAnimator().k()) {
                                    if (this.o0 > 0.0f) {
                                        int i17 = hh3Var2.b;
                                        int i18 = this.p0;
                                        if (i17 < i18) {
                                            hh3Var2.setAlpha(f23);
                                        } else if (i17 > i18) {
                                            hh3Var2.setAlpha(f23);
                                        } else {
                                            hh3Var2.setAlpha(1.0f);
                                        }
                                    } else {
                                        hh3Var2.setAlpha(1.0f);
                                    }
                                    hh3Var2.setTranslationX(R12);
                                    hh3Var2.setTranslationY(R17);
                                }
                                if (hh3Var2.a) {
                                    float L4 = (gm.L(70.0f) / f3) + (hh3Var2.getMeasuredWidth() / f3) + hh3Var2.getX() + ch3Var3.getX();
                                    if (f6 == 0.0f || L4 > f6) {
                                        f16 = L4;
                                        i12++;
                                        measuredHeight = f5;
                                        z2 = z3;
                                        ch3Var4 = ch3Var3;
                                    }
                                }
                                f16 = f6;
                                i12++;
                                measuredHeight = f5;
                                z2 = z3;
                                ch3Var4 = ch3Var3;
                            }
                        }
                        f11 = R13;
                        if (hh3Var2.b == this.p0) {
                        }
                        float R172 = gm.R1(i2 == 0 ? gm.R1(f25, f2 - f5, this.H0) : i2 == 1 ? gm.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a);
                        if (this.O > 0.0f) {
                        }
                        if (hh3Var2.a) {
                        }
                        f16 = f6;
                        i12++;
                        measuredHeight = f5;
                        z2 = z3;
                        ch3Var4 = ch3Var3;
                    }
                }
                d = 0.25d;
                if (R2 < i) {
                }
                hh3Var2.d(f17, this.e0, this.o0, this.p0 != hh3Var2.b);
                v4bVar.g = 0.0f;
                RectF rectF2 = v4bVar.F;
                v4bVar.h = 0.0f;
                v4bVar.i = 0.0f;
                v4bVar.j = 0.0f;
                if (R2 > i) {
                }
                z3 = z2;
                f6 = f16;
                f7 = f17;
                ch3Var3 = ch3Var4;
                v4bVar.k = false;
                L = gm.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                float f232 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (R2 > i) {
                }
                float f242 = R1 + this.t0;
                if (this.B0) {
                }
                float a2 = pqe.a((this.d0 - 0.2f) / 0.1f, f9, 1.0f);
                i2 = R2 - i;
                if (i2 != 0) {
                }
                f11 = R13;
                if (hh3Var2.b == this.p0) {
                }
                float R1722 = gm.R1(i2 == 0 ? gm.R1(f25, f2 - f5, this.H0) : i2 == 1 ? gm.R1(f25, (f2 - f5) * f10, this.H0) : 0.0f, f11, a2);
                if (this.O > 0.0f) {
                }
                if (hh3Var2.a) {
                }
                f16 = f6;
                i12++;
                measuredHeight = f5;
                z2 = z3;
                ch3Var4 = ch3Var3;
            }
            f4 = f16;
            ch3Var = ch3Var4;
        }
        if (this.K != null) {
            float U1 = gm.U1(d53.g.getInterpolation(this.O), 29, 74);
            ch3Var2 = ch3Var;
            z = false;
            if (ch3Var.getChildCount() > 0) {
                U1 += ch3Var2.getChildAt(0).getLeft();
            }
            this.K.n(0.0f, U1);
        } else {
            ch3Var2 = ch3Var;
            z = false;
        }
        float min = Math.min(this.O, this.e0);
        float visibleItemsMeasuredWidthWithAlpha = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) - gm.L(6.0f);
        boolean z5 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? z : true;
        if (z5) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            b6 b6Var = this.V;
            float totalVisibility = b6Var.getTotalVisibility() * (-gm.L(10.0f));
            io ioVar = this.U;
            ioVar.setPivotX(0.0f);
            ioVar.setScaleX(gm.R1(1.0f, 0.95f, b6Var.getTotalVisibility()));
            ioVar.setScaleY(gm.R1(1.0f, 0.95f, b6Var.getTotalVisibility()));
            float L5 = f2 - ((gm.L(56.0f) - a.getCurrentActionBarHeight()) / f3);
            ioVar.setTranslationY((((gm.L(14.0f) + L5) - ((ioVar.getMeasuredHeight() - ioVar.getTextHeight()) / f3)) + gm.L(f)) - (b6Var.getTotalVisibility() * gm.L(6.0f)));
            int L6 = gm.L(72.0f);
            float f26 = this.O;
            float R18 = gm.R1(gm.L(48.0f), gm.L(26.33f), f26) / f3;
            float i19 = ts2.i(R18, f3, gm.R1((L6 / f3) - R18, 0.0f, f26), -L6) + gm.L(12.0f) + f4;
            ioVar.setTranslationX(i19);
            ho drawable = ioVar.getDrawable();
            drawable.O = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) + (i19 - gm.L(12.0f));
            drawable.invalidateSelf();
            float translationX = ioVar.getTranslationX() + gm.L(1.0f);
            ImageView imageView = this.W;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(gm.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (ioVar.getTranslationX() - gm.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.a0;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(gm.L(11.333f) + L5 + totalVisibility);
            b6Var.setTranslationX(ioVar.getTranslationX());
            b6Var.setTranslationY(L5 + gm.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i20 = this.P;
        if (i20 >= 0 && i20 != 2) {
            Collections.sort(arrayList, this.x0);
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                hh3 hh3Var4 = (hh3) arrayList.get(i21);
                canvas2.save();
                canvas2.translate(hh3Var4.getX() + ch3Var2.getX(), hh3Var4.getY() + ch3Var2.getY());
                hh3Var4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z5) {
            float L7 = gm.L(16.0f);
            if (this.y0 == null) {
                this.y0 = new LinearGradient(0.0f, 0.0f, L7, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.z0 = new Matrix();
                Paint paint = new Paint(1);
                this.A0 = paint;
                paint.setShader(this.y0);
                this.A0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.z0.reset();
            this.z0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f);
            this.y0.setLocalMatrix(this.z0);
            canvas.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f, (getWidth() - visibleItemsMeasuredWidthWithAlpha) + gm.L(1.0f), getHeight(), this.A0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final hh3 e(long j) {
        ch3 ch3Var = this.P == 2 ? this.r : this.h;
        for (int i = 0; i < ch3Var.getChildCount(); i++) {
            View childAt = ch3Var.getChildAt(i);
            if (childAt instanceof hh3) {
                hh3 hh3Var = (hh3) childAt;
                if (hh3Var.F == j) {
                    return hh3Var;
                }
            }
        }
        return null;
    }

    public final int f(int i) {
        nk3 nk3Var = this.f0;
        return (nk3Var == null || nk3Var.getResourceProvider() == null) ? cmb.w0(null, i, false) : nk3Var.getThemedColor(i);
    }

    public final boolean g() {
        int i = this.P;
        return i == 0 || i == 1;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.u0;
    }

    public hg5 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (this.s.I()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(z8c.h(this.f).n));
            this.f0.getOrCreateStoryViewer().K(getContext(), null, arrayList, 0, null, null, q4b.a(this.r), false);
        }
    }

    public final void i(hh3 hh3Var, boolean z) {
        ValueAnimator valueAnimator;
        if ((z && (valueAnimator = this.I0) != null && valueAnimator.isRunning()) || hh3Var == null) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        boolean z2 = hh3Var.G;
        h4b h4bVar = this.s;
        if (z2 && !h4bVar.I()) {
            if (oc7.r1(this.f).e5()) {
                j(0L);
                return;
            } else {
                n();
                return;
            }
        }
        if (h4bVar.J(hh3Var.F) || h4bVar.L(hh3Var.F)) {
            TL_stories.PeerStories x = h4bVar.x(hh3Var.F);
            long j = hh3Var.F;
            ow0 ow0Var = this.s0;
            if (ow0Var != null) {
                ow0Var.a();
                this.s0 = null;
            }
            of2 of2Var = new of2((Object) this, (Object) hh3Var, j, (byte) 20);
            if (z) {
                of2Var.run();
                return;
            }
            ow0 n = y4b.n(x, of2Var);
            hh3Var.e = n;
            this.s0 = n;
            if (n != null) {
                h4bVar.g0(hh3Var.F, true);
            }
        }
    }

    public final void j(long j) {
        hh3 hh3Var;
        xy n;
        nk3 nk3Var = this.f0;
        int i = this.f;
        if (j == 0 && (n = oc7.r1(i).N1().n()) != null && n.a(i, 1)) {
            nk3Var.showDialog(new i46(n.b(), this.f, null, getContext(), this.f0));
            return;
        }
        int i2 = 0;
        while (true) {
            ch3 ch3Var = this.h;
            if (i2 >= ch3Var.getChildCount()) {
                hh3Var = null;
                break;
            }
            hh3Var = (hh3) ch3Var.getChildAt(i2);
            if (j != 0) {
                if (hh3Var.F == j) {
                    break;
                } else {
                    i2++;
                }
            } else if (hh3Var.G) {
                break;
            } else {
                i2++;
            }
        }
        if (hh3Var == null) {
            return;
        }
        if (j == 0) {
            v9b.C(nk3Var.getParentActivity(), i).Q(q9b.c(hh3Var));
            return;
        }
        ylb resourceProvider = nk3Var != null ? nk3Var.getResourceProvider() : null;
        he heVar = new he(3, resourceProvider, getContext());
        heVar.q(500L);
        oc7.r1(i).N1().j(j, new s2c((Object) this, (Object) heVar, j, (Object) hh3Var, (byte) 2), true, resourceProvider);
    }

    public final boolean k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((fh3) arrayList.get(i)).c == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            u46 u46Var = this.T;
            if (i < u46Var.H0()) {
                u46Var.g1(i, 0);
                return true;
            }
            if (i > u46Var.L0()) {
                u46Var.h1(i, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z, float f) {
        if (this.d0 != f) {
            this.d0 = f;
            b();
            final byte b = 0;
            final byte b2 = 1;
            boolean z2 = f > this.C0;
            if (z2 != this.B0) {
                this.B0 = z2;
                AnimatorSet animatorSet = this.L0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.L0.cancel();
                    this.L0 = null;
                }
                if (!z) {
                    this.e0 = z2 ? 1.0f : 0.0f;
                    b();
                    gm.d0(this.h, new bn0((byte) 8));
                    return;
                }
                final byte b3 = 2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                this.D0 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg3
                    public final /* synthetic */ ih3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b;
                        ih3 ih3Var = this.b;
                        switch (b4) {
                            case 0:
                                ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ih3Var.b();
                                break;
                            case 1:
                                ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ih3Var.invalidate();
                                break;
                        }
                    }
                });
                this.D0.setInterpolator(d53.h);
                float f2 = this.d0;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
                this.G0 = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg3
                    public final /* synthetic */ ih3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b2;
                        ih3 ih3Var = this.b;
                        switch (b4) {
                            case 0:
                                ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ih3Var.b();
                                break;
                            case 1:
                                ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ih3Var.invalidate();
                                break;
                        }
                    }
                });
                this.G0.setDuration(100L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L0 = animatorSet2;
                animatorSet2.addListener(new y7((byte) 28, (Object) this, z2));
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.D0);
                arrayList.add(this.G0);
                if (this.B0) {
                    this.L0.setDuration(1000L);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                    this.E0 = ofFloat3;
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg3
                        public final /* synthetic */ ih3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b4 = b3;
                            ih3 ih3Var = this.b;
                            switch (b4) {
                                case 0:
                                    ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.b();
                                    break;
                                case 1:
                                    ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                case 2:
                                    ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                default:
                                    ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.invalidate();
                                    break;
                            }
                        }
                    });
                    OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.v0);
                    this.K0 = overshootInterpolator;
                    this.E0.setInterpolator(overshootInterpolator);
                    this.E0.setDuration(750L);
                    arrayList.add(this.E0);
                } else {
                    this.I0 = ValueAnimator.ofFloat(this.e0, z2 ? 1.0f : 0.0f);
                    this.I0.setInterpolator(new OvershootInterpolator(this.w0));
                    this.I0.setDuration(350L);
                    final byte b4 = 3;
                    this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg3
                        public final /* synthetic */ ih3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b42 = b4;
                            ih3 ih3Var = this.b;
                            switch (b42) {
                                case 0:
                                    ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.b();
                                    break;
                                case 1:
                                    ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                case 2:
                                    ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    break;
                                default:
                                    ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.invalidate();
                                    break;
                            }
                        }
                    });
                    arrayList.add(this.I0);
                }
                this.L0.playTogether(arrayList);
                this.L0.start();
            }
        }
    }

    public final boolean m() {
        long j = z8c.h(this.f).n;
        h4b h4bVar = this.s;
        if (h4bVar.K(j)) {
            return true;
        }
        return h4bVar.I() && h4bVar.g.size() <= 3;
    }

    public final void n() {
        hg5 hg5Var = this.K;
        if (hg5Var == null) {
            hg5 hg5Var2 = new hg5(getContext(), 1);
            hg5Var2.i(f(cmb.vj));
            hg5Var2.p(true);
            hg5Var2.L = Layout.Alignment.ALIGN_CENTER;
            hg5Var2.n(0.0f, 29.0f);
            this.K = hg5Var2;
            SpannableStringBuilder N2 = gm.N2(jb6.N0("StoriesPremiumHint2").replace('\n', ' '), cmb.wj, 0, new xg3(this, (byte) 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) N2.getSpans(0, N2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                N2.setSpan(new z5c(gm.o()), N2.getSpanStart(clickableSpanArr[0]), N2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            hg5 hg5Var3 = this.K;
            hg5Var3.h = hg5.a(N2, hg5Var3.getTextPaint());
            this.K.t(N2);
            this.K.setPadding(gm.L(8.0f), gm.L(24.0f), gm.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, qoe.e(-1, nm7.f2, 51));
            }
            hg5Var = this.K;
        }
        if (hg5Var != null) {
            if (hg5Var.W) {
                xx0.E.a();
            }
            this.K.v();
        }
    }

    public final void o() {
        j15 j15Var = y4b.b;
        byte b = 0;
        if (j15Var != null) {
            j15Var.d(cmb.w0(null, cmb.bl, false), cmb.w0(null, cmb.cl, false), 0, 0);
        }
        j15 j15Var2 = y4b.c;
        if (j15Var2 != null) {
            j15Var2.d(cmb.w0(null, cmb.dl, false), cmb.w0(null, cmb.el, false), 0, 0);
        }
        j15[] j15VarArr = y4b.a;
        j15 j15Var3 = j15VarArr[0];
        if (j15Var3 != null) {
            j15Var3.d(cmb.w0(null, cmb.Zk, false), cmb.w0(null, cmb.al, false), 0, 0);
        }
        j15 j15Var4 = j15VarArr[1];
        if (j15Var4 != null) {
            j15Var4.d(cmb.w0(null, cmb.Xk, false), cmb.w0(null, cmb.Yk, false), 0, 0);
        }
        if (y4b.d != null) {
            int w0 = cmb.w0(null, cmb.nk, false);
            int w02 = cmb.w0(null, cmb.p7, false);
            y4b.d.d(on2.f(0.25f, w0, w02), w02, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.b();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        gm.d0(this.h, new yg3(textColor, b));
        gm.d0(this.r, new bn0((byte) 9));
        try {
            tm tmVar = this.b0;
            if (tmVar != null) {
                tmVar.k(Integer.valueOf(f(cmb.pi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        nm7.f(this.f).b(this, nm7.z5);
        yh4 yh4Var = this.M0;
        yh4Var.a = true;
        AnimatorSet animatorSet = (AnimatorSet) yh4Var.d;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.f).n(this, nm7.z5);
        yh4 yh4Var = this.M0;
        yh4Var.a = false;
        ((AnimatorSet) yh4Var.d).cancel();
        ow0 ow0Var = this.s0;
        if (ow0Var != null) {
            ow0Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.U.setTextSize(gm.L((gm.O1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.N = gm.L(70.0f);
        gm.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int L = gm.L((this.E.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            ch3 ch3Var = this.r;
            int x = (int) ch3Var.getX();
            int y = (int) ch3Var.getY();
            int x2 = (int) (ch3Var.getX() + L);
            int y2 = (int) (ch3Var.getY() + ch3Var.getHeight());
            zb1 zb1Var = this.J;
            zb1Var.getClass();
            RectF rectF = gm.P;
            rectF.set(x, y, x2, y2);
            zb1Var.i = false;
            zb1Var.c = 0;
            zb1Var.a(rectF);
            if (zb1Var.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z3;
        if ((this.P == 1 || this.o0 != 0.0f) && !z2) {
            this.L = true;
            return;
        }
        ArrayList arrayList3 = this.w;
        arrayList3.clear();
        ArrayList arrayList4 = this.y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.x;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i = this.b;
        int i2 = this.f;
        h4b h4bVar = this.s;
        if (i != 1) {
            arrayList4.add(new fh3(z8c.h(i2).e()));
            arrayList = h4bVar.g;
        } else {
            arrayList = h4bVar.h;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (n != z8c.h(i2).e()) {
                arrayList4.add(new fh3(n));
            }
        }
        int size = arrayList4.size();
        if (!h4bVar.I()) {
            size--;
        }
        int max = Math.max(1, Math.max(h4bVar.C(i == 1), size));
        this.g0 = null;
        boolean H = h4bVar.H();
        io ioVar = this.U;
        if (H) {
            arrayList2 = arrayList4;
            if (h4bVar.L(z8c.h(i2).e())) {
                String M0 = jb6.M0(2131743487, null);
                if (M0.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.j0;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(M0);
                        r8c r8cVar = new r8c();
                        spannableStringBuilder.setSpan(r8cVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        r8cVar.a = ioVar;
                        r8cVar.n = true;
                        this.j0 = spannableStringBuilder;
                    }
                    this.g0 = spannableStringBuilder;
                } else {
                    this.g0 = M0;
                }
            } else {
                this.g0 = this.t0 < ((float) gm.L(50.0f)) ? null : jb6.M0(2131748058, null);
            }
        } else {
            arrayList2 = arrayList4;
            this.g0 = this.t0 < ((float) gm.L(50.0f)) ? null : jb6.G(max, "Stories", new Object[0]);
        }
        if (this.h0) {
            z3 = true;
        } else {
            z3 = true;
            ioVar.c(this.g0, z && !jb6.a0, true);
        }
        this.a.a((!TextUtils.isEmpty(this.g0) || this.h0) ? z3 : false, z);
        arrayList6.clear();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (((fh3) arrayList2.get(i4)).c != z8c.h(i2).n || m()) {
                arrayList6.add((fh3) arrayList2.get(i4));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        ch3 ch3Var = this.h;
        ch3 ch3Var2 = this.r;
        if (!z) {
            ch3Var.setItemAnimator(null);
            ch3Var2.setItemAnimator(null);
        } else if (this.P == 2) {
            ch3Var2.setItemAnimator(this.d);
            ch3Var.setItemAnimator(null);
        } else {
            ch3Var.setItemAnimator(this.S);
            ch3Var2.setItemAnimator(null);
        }
        this.F.E(arrayList3, arrayList2);
        this.G.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(a aVar) {
        this.r0 = aVar;
    }

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.M != i) {
            this.M = i;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f) {
        this.t0 = f;
    }

    public void setOverscroll(float f) {
        this.o0 = f / gm.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f) {
        l(true, f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        hg5 hg5Var = this.K;
        if (hg5Var != null) {
            hg5Var.setTranslationY(f);
        }
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}

package fi;

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
import c8.ma;
import hi.na;
import hi.sa;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.cx;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class q extends FrameLayout implements fs, te.b {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final m F;
    public float F0;
    public final m G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final tc J;
    public float J0;
    public hi.l3 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final ab.q M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final v4.k S;
    public final v4.c0 T;
    public final org.telegram.ui.Components.o6 U;
    public final j V;
    public final ImageView W;
    public final te.a a;
    public final ImageView a0;
    public final int b;
    public final org.telegram.ui.Components.n5 b0;
    public final Drawable c;
    public final ArrayList c0;
    public final l d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final cx f0;
    public CharSequence g0;
    public final i h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public o l0;
    public boolean m0;
    public sh0 n;
    public boolean n0;
    public float o0;
    public int p0;
    public p q0;
    public final i r;
    public org.telegram.ui.ActionBar.k r0;
    public final p6 s;
    public f7 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final a3.c x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public q(Context context, cx cxVar, int i7, int i10) {
        super(context);
        this.a = new te.a(1, this, nr.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        tv tvVar = (tv) this;
        int i11 = 0;
        m mVar = new m(tvVar, false);
        this.F = mVar;
        int i12 = 1;
        m mVar2 = new m(tvVar, true);
        this.G = mVar2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        tc tcVar = new tc(this);
        this.J = tcVar;
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
        this.x0 = new a3.c(19);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        ab.q qVar = new ab.q(this);
        this.M0 = qVar;
        this.b = i10;
        this.f = i7;
        this.f0 = cxVar;
        this.t0 = org.telegram.messenger.g0.L(68.0f);
        this.s = mp.u1(i7).R1();
        i iVar = new i(tvVar, context, i11);
        this.h = iVar;
        iVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        iVar.setClipToPadding(false);
        iVar.setClipChildren(false);
        tcVar.h = new f2.a(tvVar, 2);
        ai.n nVar = new ai.n(tvVar, 13);
        tcVar.l = true;
        tcVar.j = nVar;
        iVar.j(new bi.u1(tvVar, 12));
        v4.k kVar = new v4.k();
        this.S = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.m = false;
        iVar.setItemAnimator(kVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.T = c0Var;
        iVar.setLayoutManager(c0Var);
        iVar.setOnItemClickListener(new bi.l8(tvVar, 6));
        iVar.setOnItemLongClickListener(new di.v6(tvVar, 5));
        iVar.setAdapter(mVar);
        addView(iVar, ma.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.U = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        o6Var.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, ma.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(gd.N0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, ma.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(26.0f), null);
        this.b0 = n5Var;
        n5Var.a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, ma.c(40.0f, 40));
        j jVar = new j(tvVar, context, qVar);
        this.V = jVar;
        addView(jVar, ma.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        i iVar2 = new i(tvVar, getContext(), i12);
        this.r = iVar2;
        getContext();
        iVar2.setLayoutManager(new v4.c0(0, false));
        iVar2.i(new k(i11));
        l lVar = new l();
        this.d = lVar;
        lVar.C = false;
        lVar.m = false;
        iVar2.setItemAnimator(lVar);
        iVar2.setAdapter(mVar2);
        iVar2.setClipChildren(false);
        addView(iVar2, ma.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.m6.A8) : f(org.telegram.ui.ActionBar.m6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.m6.Xl);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            d();
        }
    }

    public final void b() {
        this.O = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
        d();
        float f10 = this.O;
        int i7 = f10 == 1.0f ? 2 : f10 != 0.0f ? 1 : 0;
        if (this.P != i7) {
            this.P = i7;
            if (i7 != 1 && this.L) {
                org.telegram.messenger.g0.g3(new d(this, 0));
            }
            int i10 = this.P;
            i iVar = this.r;
            i iVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(iVar2, new e(0));
                iVar.setVisibility(4);
                iVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f;
                if (i10 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.y;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((n) arrayList2.get(i12)).c != j10.i(i11).e() || m()) {
                            arrayList.add(Long.valueOf(((n) arrayList2.get(i12)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i12++;
                    }
                    iVar.setVisibility(4);
                    iVar2.setVisibility(0);
                } else if (i10 == 2) {
                    iVar.setVisibility(0);
                    iVar2.setVisibility(4);
                    this.T.h1(0, 0);
                    ai.y0 y0Var = mp.u1(i11).R1().K;
                    org.telegram.messenger.g0.r(y0Var);
                    y0Var.run();
                    f7 f7Var = this.s0;
                    if (f7Var != null) {
                        f7Var.a();
                        this.s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        v4.c0 c0Var = this.T;
        int N02 = c0Var.N0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        p6 p6Var = this.s;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && p6Var.E(0, ((n) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!p6Var.z) {
                    return;
                }
            } else if (!p6Var.p) {
                return;
            }
            p6Var.T(z10);
        }
    }

    public final void d() {
        float a10 = c8.l9.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f10 = this.a.e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        org.telegram.ui.Components.o6 o6Var = this.U;
        if (o6Var != null) {
            o6Var.setAlpha(f12);
            o6Var.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setAlpha(f13);
            imageView.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.a0;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            imageView2.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        j jVar = this.V;
        if (jVar != null) {
            jVar.setAlpha(a10);
            jVar.setVisibility(a10 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.y5 && this.m0) {
            p(getVisibility() == 0, false);
            org.telegram.messenger.g0.g3(new d(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i7;
        float f10;
        float f11;
        i iVar;
        float f12;
        float f13;
        i iVar2;
        boolean z10;
        Canvas canvas2;
        boolean z11;
        float f14;
        double d;
        boolean z12;
        float f15;
        float f16;
        i iVar3;
        float L;
        float f17;
        float T1;
        float f18;
        float T12;
        int i10;
        float f19;
        float f20;
        float T13;
        float f21;
        float f22;
        int R;
        canvas.save();
        int i11 = this.M;
        if (i11 > 0) {
            canvas.clipRect(0, i11, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(4.0f);
        float f23 = 0.0f;
        float T14 = org.telegram.messenger.g0.T1(0.0f, measuredHeight, this.d0);
        i iVar4 = this.h;
        iVar4.setTranslationY(T14);
        i iVar5 = this.r;
        iVar5.setTranslationY(T14);
        iVar5.setTranslationX(this.t0);
        int i12 = 0;
        while (true) {
            arrayList = this.Q;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((p) arrayList.get(i12)).a = false;
            i12++;
        }
        arrayList.clear();
        int i13 = this.P;
        int i14 = -1;
        ArrayList arrayList2 = this.R;
        if ((i13 == 1 || i13 == 0) && !arrayList2.isEmpty()) {
            i7 = -1;
            f10 = 4.0f;
            for (int i15 = 0; i15 < iVar4.getChildCount(); i15++) {
                p pVar = (p) iVar4.getChildAt(i15);
                i7 = pVar.F == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(pVar) : i7;
            }
        } else {
            f10 = 4.0f;
            i7 = this.P == 2 ? 0 : -1;
        }
        int i16 = this.P;
        if (i16 < 0 || i16 == 2) {
            f11 = T14;
            iVar = iVar4;
            f12 = 2.0f;
            float f24 = 0.0f;
            for (int i17 = 0; i17 < iVar5.getChildCount(); i17++) {
                float x10 = ((p) iVar5.getChildAt(i17)).getX() + iVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x10 > f24) {
                    f24 = x10;
                }
            }
            f13 = f24;
        } else {
            if (i7 == -1) {
                v4.c0 c0Var = this.T;
                i7 = c0Var.I0();
                if (i7 == -1) {
                    i7 = c0Var.L0();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            iVar4.setAlpha(1.0f - Utilities.i(this.O / this.C0, 1.0f, 0.0f));
            this.p0 = -1;
            if (this.o0 != 0.0f) {
                int i18 = -1;
                int i19 = 0;
                f12 = 2.0f;
                while (i19 < iVar4.getChildCount()) {
                    View childAt = iVar4.getChildAt(i19);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i18 != i14 && R >= i18)) {
                        f22 = T14;
                    } else {
                        f22 = T14;
                        if (((n) this.y.get(R)).c != j10.i(this.f).n) {
                            this.q0 = (p) childAt;
                            i18 = R;
                        }
                    }
                    i19++;
                    T14 = f22;
                    i14 = -1;
                    f23 = 0.0f;
                }
                f11 = T14;
                this.p0 = i18;
            } else {
                f11 = T14;
                f12 = 2.0f;
            }
            float f25 = 0.0f;
            int i20 = 0;
            while (i20 < iVar4.getChildCount()) {
                p pVar2 = (p) iVar4.getChildAt(i20);
                pVar2.setClipInParent(false);
                e7 e7Var = pVar2.P;
                int R2 = RecyclerView.R(pVar2);
                float f26 = this.O;
                if (R2 >= i7 && R2 < arrayList2.size() + i7) {
                    int i21 = R2 - i7;
                    if (i21 == i7 + 2) {
                        f26 = this.O;
                    } else if (i21 == i7 + 1) {
                        f14 = measuredHeight;
                        f26 = (float) Math.pow(this.O, 0.5d);
                        d = 0.25d;
                        if (R2 < i7) {
                            f26 = (float) Math.pow(this.O, d);
                        }
                        pVar2.d(f26, this.e0, this.o0, this.p0 == pVar2.b);
                        e7Var.g = 0.0f;
                        RectF rectF = e7Var.F;
                        e7Var.h = 0.0f;
                        e7Var.i = 0.0f;
                        e7Var.j = 0.0f;
                        if (R2 > i7 || R2 >= arrayList2.size() + i7) {
                            z12 = z11;
                            f15 = f25;
                            f16 = f26;
                            iVar3 = iVar4;
                            e7Var.k = false;
                        } else {
                            p pVar3 = (p) iVar4.getChildAt(i20 - 1);
                            if (pVar3 != null) {
                                e7 e7Var2 = pVar3.P;
                                float L2 = org.telegram.messenger.g0.L(48.0f);
                                float L3 = org.telegram.messenger.g0.L(26.33f);
                                z12 = z11;
                                float T15 = (org.telegram.messenger.g0.T1(L2, L3, pVar3.K) + org.telegram.messenger.g0.L(8.0f)) / f12;
                                float T16 = (org.telegram.messenger.g0.T1(L2, L3, pVar2.K) + org.telegram.messenger.g0.L(8.0f)) / f12;
                                float x11 = pVar3.getX() + e7Var2.F.centerX();
                                float y10 = pVar3.getY() + e7Var2.F.centerY();
                                float x12 = pVar2.getX() + rectF.centerX();
                                float y11 = pVar2.getY() + rectF.centerY();
                                float f27 = x12 - x11;
                                float f28 = y11 - y10;
                                f15 = f25;
                                if (((float) Math.sqrt((f28 * f28) + (f27 * f27))) < T15 + T16) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f16 = f26;
                                    iVar3 = iVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(f28, f27));
                                    float f29 = degrees / f12;
                                    e7Var2.g = degrees2 - f29;
                                    e7Var2.h = degrees2 + f29;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-f28, -f27));
                                    float f30 = -Math.abs(degrees3 - f29);
                                    float abs = Math.abs(degrees3 + f29);
                                    e7Var.i = f30;
                                    e7Var.j = abs;
                                } else {
                                    f16 = f26;
                                    iVar3 = iVar4;
                                    e7Var2.g = 0.0f;
                                    e7Var2.h = 0.0f;
                                    e7Var.i = 0.0f;
                                    e7Var.j = 0.0f;
                                }
                                e7Var2.k = false;
                                e7Var.k = false;
                            } else {
                                z12 = z11;
                                f15 = f25;
                                f16 = f26;
                                iVar3 = iVar4;
                            }
                        }
                        L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f31 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 <= i7) {
                            f17 = 0.0f;
                            T1 = 0.0f;
                        } else if (R2 == i7 + 1) {
                            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f), 0.0f, this.O) + ((org.telegram.messenger.g0.L(16.0f) * f16) - org.telegram.messenger.g0.N(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(32.0f), 0.0f, this.O) + (((org.telegram.messenger.g0.L(16.0f) * f16) + org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.N(0.5f));
                        }
                        float f32 = T1 + this.t0;
                        if (this.B0) {
                            f18 = 0.0f;
                            T12 = org.telegram.messenger.g0.T1(0.0f, f32 - pVar2.getLeft(), this.K0.getInterpolation(this.F0));
                        } else {
                            if (this.o0 > f17) {
                                int i22 = pVar2.b;
                                int i23 = this.p0;
                                if (i22 < i23) {
                                    f21 = -L;
                                } else if (i22 > i23) {
                                    f21 = L;
                                }
                                T12 = org.telegram.messenger.g0.T1(f32 - pVar2.getLeft(), f21, 1.0f - this.J0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            T12 = org.telegram.messenger.g0.T1(f32 - pVar2.getLeft(), f21, 1.0f - this.J0);
                            f18 = 0.0f;
                        }
                        float a10 = c8.l9.a((this.d0 - 0.2f) / 0.1f, f18, 1.0f);
                        i10 = R2 - i7;
                        if (i10 == 0) {
                            f19 = 0.65f;
                            T13 = org.telegram.messenger.g0.T1(f18, f11 - f14, nr.h.getInterpolation(this.O));
                        } else {
                            f19 = 0.65f;
                            if (i10 == 1) {
                                T13 = org.telegram.messenger.g0.T1(f18, (f11 - f14) * 0.65f, nr.h.getInterpolation(this.O));
                            } else {
                                f20 = f18;
                                float f33 = (pVar2.b == this.p0 || this.o0 <= f18) ? 0.0f : (-L) / f12;
                                float T17 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a10);
                                if (this.O <= 0.0f) {
                                    boolean z13 = R2 >= i7 && R2 <= i7 + 2;
                                    if (!z12) {
                                        pVar2.setCrossfadeTo(-1L);
                                    } else if (i10 < 0 || i10 >= arrayList2.size()) {
                                        pVar2.setCrossfadeTo(-1L);
                                    } else {
                                        pVar2.setCrossfadeTo(((Long) arrayList2.get(i10)).longValue());
                                    }
                                    pVar2.a = z13;
                                    pVar2.d = R2 == i7;
                                    pVar2.c = R2 >= (arrayList2.size() + i7) + (-1);
                                    pVar2.setTranslationX(T12);
                                    pVar2.setTranslationY(T17);
                                    if (z13) {
                                        arrayList.add(pVar2);
                                    }
                                } else if (iVar3.getItemAnimator() == null || !iVar3.getItemAnimator().k()) {
                                    if (this.o0 > 0.0f) {
                                        int i24 = pVar2.b;
                                        int i25 = this.p0;
                                        if (i24 < i25) {
                                            pVar2.setAlpha(f31);
                                        } else if (i24 > i25) {
                                            pVar2.setAlpha(f31);
                                        } else {
                                            pVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        pVar2.setAlpha(1.0f);
                                    }
                                    pVar2.setTranslationX(T12);
                                    pVar2.setTranslationY(T17);
                                }
                                if (pVar2.a) {
                                    float L4 = (org.telegram.messenger.g0.L(70.0f) / f12) + (pVar2.getMeasuredWidth() / f12) + pVar2.getX() + iVar3.getX();
                                    if (f15 == 0.0f || L4 > f15) {
                                        f25 = L4;
                                        i20++;
                                        measuredHeight = f14;
                                        z11 = z12;
                                        iVar4 = iVar3;
                                    }
                                }
                                f25 = f15;
                                i20++;
                                measuredHeight = f14;
                                z11 = z12;
                                iVar4 = iVar3;
                            }
                        }
                        f20 = T13;
                        if (pVar2.b == this.p0) {
                        }
                        float T172 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a10);
                        if (this.O <= 0.0f) {
                        }
                        if (pVar2.a) {
                        }
                        f25 = f15;
                        i20++;
                        measuredHeight = f14;
                        z11 = z12;
                        iVar4 = iVar3;
                    } else {
                        f14 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.O, 0.25d);
                        if (R2 < i7) {
                        }
                        pVar2.d(f26, this.e0, this.o0, this.p0 == pVar2.b);
                        e7Var.g = 0.0f;
                        RectF rectF2 = e7Var.F;
                        e7Var.h = 0.0f;
                        e7Var.i = 0.0f;
                        e7Var.j = 0.0f;
                        if (R2 > i7) {
                        }
                        z12 = z11;
                        f15 = f25;
                        f16 = f26;
                        iVar3 = iVar4;
                        e7Var.k = false;
                        L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f312 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 <= i7) {
                        }
                        float f322 = T1 + this.t0;
                        if (this.B0) {
                        }
                        float a102 = c8.l9.a((this.d0 - 0.2f) / 0.1f, f18, 1.0f);
                        i10 = R2 - i7;
                        if (i10 == 0) {
                        }
                        f20 = T13;
                        if (pVar2.b == this.p0) {
                        }
                        float T1722 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a102);
                        if (this.O <= 0.0f) {
                        }
                        if (pVar2.a) {
                        }
                        f25 = f15;
                        i20++;
                        measuredHeight = f14;
                        z11 = z12;
                        iVar4 = iVar3;
                    }
                }
                f14 = measuredHeight;
                d = 0.25d;
                if (R2 < i7) {
                }
                pVar2.d(f26, this.e0, this.o0, this.p0 == pVar2.b);
                e7Var.g = 0.0f;
                RectF rectF22 = e7Var.F;
                e7Var.h = 0.0f;
                e7Var.i = 0.0f;
                e7Var.j = 0.0f;
                if (R2 > i7) {
                }
                z12 = z11;
                f15 = f25;
                f16 = f26;
                iVar3 = iVar4;
                e7Var.k = false;
                L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                float f3122 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (R2 <= i7) {
                }
                float f3222 = T1 + this.t0;
                if (this.B0) {
                }
                float a1022 = c8.l9.a((this.d0 - 0.2f) / 0.1f, f18, 1.0f);
                i10 = R2 - i7;
                if (i10 == 0) {
                }
                f20 = T13;
                if (pVar2.b == this.p0) {
                }
                float T17222 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a1022);
                if (this.O <= 0.0f) {
                }
                if (pVar2.a) {
                }
                f25 = f15;
                i20++;
                measuredHeight = f14;
                z11 = z12;
                iVar4 = iVar3;
            }
            f13 = f25;
            iVar = iVar4;
        }
        if (this.K != null) {
            float W1 = org.telegram.messenger.g0.W1(nr.g.getInterpolation(this.O), 29, 74);
            iVar2 = iVar;
            z10 = false;
            if (iVar.getChildCount() > 0) {
                W1 += iVar2.getChildAt(0).getLeft();
            }
            this.K.o(0.0f, W1);
        } else {
            iVar2 = iVar;
            z10 = false;
        }
        float min = Math.min(this.O, this.e0);
        float visibleItemsMeasuredWidthWithAlpha = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) - org.telegram.messenger.g0.L(6.0f);
        boolean z14 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? z10 : true;
        if (z14) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            j jVar = this.V;
            float totalVisibility = jVar.getTotalVisibility() * (-org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Components.o6 o6Var = this.U;
            o6Var.setPivotX(0.0f);
            o6Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, jVar.getTotalVisibility()));
            o6Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, jVar.getTotalVisibility()));
            float L5 = f11 - ((org.telegram.messenger.g0.L(56.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) / f12);
            o6Var.setTranslationY((((org.telegram.messenger.g0.L(14.0f) + L5) - ((o6Var.getMeasuredHeight() - o6Var.getTextHeight()) / f12)) + org.telegram.messenger.g0.L(f10)) - (jVar.getTotalVisibility() * org.telegram.messenger.g0.L(6.0f)));
            int L6 = org.telegram.messenger.g0.L(72.0f);
            float f34 = this.O;
            float T18 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(26.33f), f34) / f12;
            float e10 = p5.c.e(T18, f12, org.telegram.messenger.g0.T1((L6 / f12) - T18, 0.0f, f34), -L6) + org.telegram.messenger.g0.L(12.0f) + f13;
            o6Var.setTranslationX(e10);
            org.telegram.ui.Components.n6 drawable = o6Var.getDrawable();
            drawable.O = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) + (e10 - org.telegram.messenger.g0.L(12.0f));
            drawable.invalidateSelf();
            float translationX = o6Var.getTranslationX() + org.telegram.messenger.g0.L(1.0f);
            ImageView imageView = this.W;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(org.telegram.messenger.g0.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (o6Var.getTranslationX() - org.telegram.messenger.g0.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.a0;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(org.telegram.messenger.g0.L(11.333f) + L5 + totalVisibility);
            jVar.setTranslationX(o6Var.getTranslationX());
            jVar.setTranslationY(L5 + org.telegram.messenger.g0.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i26 = this.P;
        if (i26 >= 0 && i26 != 2) {
            Collections.sort(arrayList, this.x0);
            for (int i27 = 0; i27 < arrayList.size(); i27++) {
                p pVar4 = (p) arrayList.get(i27);
                canvas2.save();
                canvas2.translate(pVar4.getX() + iVar2.getX(), pVar4.getY() + iVar2.getY());
                pVar4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z14) {
            float L7 = org.telegram.messenger.g0.L(16.0f);
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
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f, org.telegram.messenger.g0.L(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.A0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final p e(long j3) {
        i iVar = this.P == 2 ? this.r : this.h;
        for (int i7 = 0; i7 < iVar.getChildCount(); i7++) {
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof p) {
                p pVar = (p) childAt;
                if (pVar.F == j3) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final int f(int i7) {
        cx cxVar = this.f0;
        return (cxVar == null || cxVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.m6.x0(null, i7, false) : cxVar.getThemedColor(i7);
    }

    public final boolean g() {
        int i7 = this.P;
        return i7 == 0 || i7 == 1;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.u0;
    }

    public hi.l3 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (this.s.J()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(j10.i(this.f).n));
            this.f0.getOrCreateStoryViewer().M(getContext(), null, arrayList, 0, null, null, y6.a(this.r), false);
        }
    }

    public final void i(p pVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && pVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = pVar.G;
            p6 p6Var = this.s;
            if (!z11 || p6Var.J()) {
                if (p6Var.K(pVar.F) || p6Var.M(pVar.F)) {
                    TL_stories.PeerStories y10 = p6Var.y(pVar.F);
                    long j3 = pVar.F;
                    f7 f7Var = this.s0;
                    if (f7Var != null) {
                        f7Var.a();
                        this.s0 = null;
                    }
                    bi.q2 q2Var = new bi.q2(this, pVar, j3, 5);
                    if (z10) {
                        q2Var.run();
                        return;
                    }
                    f7 n10 = i7.n(y10, q2Var);
                    pVar.e = n10;
                    this.s0 = n10;
                    if (n10 != null) {
                        p6Var.h0(pVar.F, true);
                    }
                }
            } else if (mp.u1(this.f).i5()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j3) {
        p pVar;
        j6 o4;
        cx cxVar = this.f0;
        int i7 = this.f;
        if (j3 == 0 && (o4 = mp.u1(i7).R1().o()) != null && o4.a(i7, 1)) {
            cxVar.showDialog(new ug.k0(o4.b(), this.f, getContext(), this.f0, null));
            return;
        }
        int i10 = 0;
        while (true) {
            i iVar = this.h;
            if (i10 >= iVar.getChildCount()) {
                pVar = null;
                break;
            }
            pVar = (p) iVar.getChildAt(i10);
            if (j3 == 0) {
                if (pVar.G) {
                    break;
                } else {
                    i10++;
                }
            } else if (pVar.F == j3) {
                break;
            } else {
                i10++;
            }
        }
        if (pVar == null) {
            return;
        }
        if (j3 == 0) {
            sa.D(cxVar.getParentActivity(), i7).Q(na.c(pVar));
            return;
        }
        org.telegram.ui.ActionBar.h6 resourceProvider = cxVar != null ? cxVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), resourceProvider);
        t1Var.r(500L);
        mp.u1(i7).R1().k(j3, new bi.i2(this, t1Var, j3, pVar, 2), true, resourceProvider);
    }

    public final boolean k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            }
            if (((n) arrayList.get(i7)).c == j3) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            v4.c0 c0Var = this.T;
            if (i7 < c0Var.I0()) {
                c0Var.h1(i7, 0);
                return true;
            }
            if (i7 > c0Var.M0()) {
                c0Var.i1(i7, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z10, float f10) {
        if (this.d0 == f10) {
            return;
        }
        this.d0 = f10;
        b();
        final int i7 = 0;
        final int i10 = 1;
        boolean z11 = f10 > this.C0;
        if (z11 != this.B0) {
            this.B0 = z11;
            AnimatorSet animatorSet = this.L0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.L0.cancel();
                this.L0 = null;
            }
            if (!z10) {
                this.e0 = z11 ? 1.0f : 0.0f;
                b();
                org.telegram.messenger.g0.d0(this.h, new e(i10));
                return;
            }
            final int i11 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z11 ? 1.0f : 0.0f);
            this.D0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: fi.c
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i7) {
                        case 0:
                            q qVar = this.b;
                            qVar.getClass();
                            qVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar.b();
                            break;
                        case 1:
                            q qVar2 = this.b;
                            qVar2.getClass();
                            qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            q qVar3 = this.b;
                            qVar3.getClass();
                            qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            q qVar4 = this.b;
                            qVar4.getClass();
                            qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar4.invalidate();
                            break;
                    }
                }
            });
            this.D0.setInterpolator(nr.h);
            float f11 = this.d0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, z11 ? f11 : 0.0f);
            this.G0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: fi.c
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            q qVar = this.b;
                            qVar.getClass();
                            qVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar.b();
                            break;
                        case 1:
                            q qVar2 = this.b;
                            qVar2.getClass();
                            qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            q qVar3 = this.b;
                            qVar3.getClass();
                            qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            q qVar4 = this.b;
                            qVar4.getClass();
                            qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar4.invalidate();
                            break;
                    }
                }
            });
            this.G0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L0 = animatorSet2;
            animatorSet2.addListener(new bi.h7(i11, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.D0);
            arrayList.add(this.G0);
            if (this.B0) {
                this.L0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.e0, z11 ? 1.0f : 0.0f);
                this.E0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: fi.c
                    public final /* synthetic */ q b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                q qVar = this.b;
                                qVar.getClass();
                                qVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar.b();
                                break;
                            case 1:
                                q qVar2 = this.b;
                                qVar2.getClass();
                                qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                q qVar3 = this.b;
                                qVar3.getClass();
                                qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                q qVar4 = this.b;
                                qVar4.getClass();
                                qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar4.invalidate();
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
                this.I0 = ValueAnimator.ofFloat(this.e0, z11 ? 1.0f : 0.0f);
                this.I0.setInterpolator(new OvershootInterpolator(this.w0));
                this.I0.setDuration(350L);
                final int i12 = 3;
                this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: fi.c
                    public final /* synthetic */ q b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                q qVar = this.b;
                                qVar.getClass();
                                qVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar.b();
                                break;
                            case 1:
                                q qVar2 = this.b;
                                qVar2.getClass();
                                qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                q qVar3 = this.b;
                                qVar3.getClass();
                                qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                q qVar4 = this.b;
                                qVar4.getClass();
                                qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar4.invalidate();
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

    public final boolean m() {
        long j3 = j10.i(this.f).n;
        p6 p6Var = this.s;
        if (p6Var.L(j3)) {
            return true;
        }
        return p6Var.J() && p6Var.g.size() <= 3;
    }

    public final void n() {
        if (this.K == null) {
            hi.l3 l3Var = new hi.l3(getContext(), 1);
            l3Var.j(f(org.telegram.ui.ActionBar.m6.wj));
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_CENTER;
            l3Var.o(0.0f, 29.0f);
            this.K = l3Var;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(gd.O0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.m6.xj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) R2.getSpans(0, R2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                R2.setSpan(new l41(org.telegram.messenger.g0.o()), R2.getSpanStart(clickableSpanArr[0]), R2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            hi.l3 l3Var2 = this.K;
            l3Var2.h = hi.l3.a(R2, l3Var2.getTextPaint());
            this.K.v(R2);
            this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, ma.e(-1, ks.g2, 51));
            }
        }
        hi.l3 l3Var3 = this.K;
        if (l3Var3 != null) {
            if (l3Var3.W) {
                org.telegram.messenger.q2.E.a();
            }
            this.K.x();
        }
    }

    public final void o() {
        s10 s10Var = i7.b;
        if (s10Var != null) {
            s10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.cl, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dl, false), 0, 0);
        }
        s10 s10Var2 = i7.c;
        if (s10Var2 != null) {
            s10Var2.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.el, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.fl, false), 0, 0);
        }
        s10[] s10VarArr = i7.a;
        s10 s10Var3 = s10VarArr[0];
        if (s10Var3 != null) {
            s10Var3.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.al, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bl, false), 0, 0);
        }
        s10 s10Var4 = s10VarArr[1];
        if (s10Var4 != null) {
            s10Var4.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), 0, 0);
        }
        if (i7.d != null) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ok, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q7, false);
            i7.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        j jVar = this.V;
        if (jVar != null) {
            jVar.c();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.d0(this.h, new f(textColor, 0));
        org.telegram.messenger.g0.d0(this.r, new e(2));
        try {
            org.telegram.ui.Components.n5 n5Var = this.b0;
            if (n5Var != null) {
                n5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.m6.qi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        ks.f(this.f).c(this, ks.y5);
        ab.q qVar = this.M0;
        qVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) qVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f).n(this, ks.y5);
        ab.q qVar = this.M0;
        qVar.a = false;
        ((AnimatorSet) qVar.c).cancel();
        f7 f7Var = this.s0;
        if (f7Var != null) {
            f7Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.U.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.N = org.telegram.messenger.g0.L(70.0f);
        org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int L = org.telegram.messenger.g0.L((this.E.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            i iVar = this.r;
            int x10 = (int) iVar.getX();
            int y10 = (int) iVar.getY();
            int x11 = (int) (iVar.getX() + L);
            int y11 = (int) (iVar.getY() + iVar.getHeight());
            tc tcVar = this.J;
            tcVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, x11, y11);
            tcVar.i = false;
            tcVar.c = 0;
            tcVar.a(rectF);
            if (tcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        if ((this.P == 1 || this.o0 != 0.0f) && !z11) {
            this.L = true;
            return;
        }
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.y;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.x;
        arrayList4.clear();
        ArrayList arrayList5 = this.E;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i7 = this.b;
        int i10 = this.f;
        if (i7 != 1) {
            arrayList3.add(new n(j10.i(i10).e()));
        }
        p6 p6Var = this.s;
        ArrayList arrayList6 = i7 == 1 ? p6Var.h : p6Var.g;
        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
            long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList6.get(i11)).peer);
            if (o4 != j10.i(i10).e()) {
                arrayList3.add(new n(o4));
            }
        }
        int size = arrayList3.size();
        if (!p6Var.J()) {
            size--;
        }
        int max = Math.max(1, Math.max(p6Var.D(i7 == 1), size));
        this.g0 = null;
        boolean I = p6Var.I();
        org.telegram.ui.Components.o6 o6Var = this.U;
        if (I) {
            arrayList = arrayList3;
            if (p6Var.M(j10.i(i10).e())) {
                String N0 = gd.N0(2131743557, null);
                if (N0.indexOf("…") > 0) {
                    if (this.j0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(N0);
                        l9 l9Var = new l9();
                        valueOf.setSpan(l9Var, valueOf.length() - 1, valueOf.length(), 0);
                        l9Var.a = o6Var;
                        l9Var.n = true;
                        this.j0 = valueOf;
                    }
                    this.g0 = this.j0;
                } else {
                    this.g0 = N0;
                }
            } else {
                this.g0 = this.t0 < ((float) org.telegram.messenger.g0.L(50.0f)) ? null : gd.N0(2131748108, null);
            }
        } else {
            arrayList = arrayList3;
            this.g0 = this.t0 < ((float) org.telegram.messenger.g0.L(50.0f)) ? null : gd.G(max, "Stories", new Object[0]);
        }
        if (this.h0) {
            z12 = true;
        } else {
            z12 = true;
            o6Var.c(this.g0, z10 && !gd.a0, true);
        }
        this.a.a((!TextUtils.isEmpty(this.g0) || this.h0) ? z12 : false, z10);
        arrayList5.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((n) arrayList.get(i12)).c != j10.i(i10).n || m()) {
                arrayList5.add((n) arrayList.get(i12));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        i iVar = this.h;
        i iVar2 = this.r;
        if (!z10) {
            iVar.setItemAnimator(null);
            iVar2.setItemAnimator(null);
        } else if (this.P == 2) {
            iVar2.setItemAnimator(this.d);
            iVar.setItemAnimator(null);
        } else {
            iVar.setItemAnimator(this.S);
            iVar2.setItemAnimator(null);
        }
        this.F.E(arrayList2, arrayList);
        this.G.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.r0 = kVar;
    }

    public void setClipTop(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (this.M != i7) {
            this.M = i7;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.t0 = f10;
    }

    public void setOverscroll(float f10) {
        this.o0 = f10 / org.telegram.messenger.g0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(true, f10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        hi.l3 l3Var = this.K;
        if (l3Var != null) {
            l3Var.setTranslationY(f10);
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}

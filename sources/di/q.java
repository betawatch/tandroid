package di;

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
import bi.ab;
import c8.ha;
import fi.qa;
import fi.va;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.pv;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class q extends FrameLayout implements ls, te.b {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public final ArrayList D;
    public ValueAnimator D0;
    public final m E;
    public float E0;
    public final m F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final pc I;
    public float I0;
    public fi.m3 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final ab.q L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final v4.k R;
    public final v4.b0 S;
    public final org.telegram.ui.Components.j6 T;
    public final j U;
    public final ImageView V;
    public final ImageView W;
    public final te.a a;
    public final org.telegram.ui.Components.g5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final l d;
    public float d0;
    public int e;
    public final ww e0;
    public final int f;
    public CharSequence f0;
    public boolean g0;
    public final i h;
    public int h0;
    public SpannableStringBuilder i0;
    public ValueAnimator j0;
    public o k0;
    public boolean l0;
    public boolean m0;
    public dh0 n;
    public float n0;
    public int o0;
    public p p0;
    public org.telegram.ui.ActionBar.k q0;
    public final i r;
    public o7 r0;
    public final y6 s;
    public float s0;
    public final float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final a3.c w0;
    public final ArrayList x;
    public LinearGradient x0;
    public final ArrayList y;
    public Matrix y0;
    public Paint z0;

    public q(Context context, ww wwVar, int i7, int i10) {
        super(context);
        this.a = new te.a(1, this, xq.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.D = new ArrayList();
        pv pvVar = (pv) this;
        int i11 = 0;
        m mVar = new m(pvVar, false);
        this.E = mVar;
        int i12 = 1;
        m mVar2 = new m(pvVar, true);
        this.F = mVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        pc pcVar = new pc(this);
        this.I = pcVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = -1.0f;
        this.l0 = true;
        this.t0 = 1.0f;
        this.u0 = 0.95f;
        this.v0 = 0.9f;
        this.w0 = new a3.c(19);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        ab.q qVar = new ab.q(this);
        this.L0 = qVar;
        this.b = i10;
        this.f = i7;
        this.e0 = wwVar;
        this.s0 = org.telegram.messenger.g0.L(68.0f);
        this.s = qp.s1(i7).P1();
        i iVar = new i(pvVar, context, i11);
        this.h = iVar;
        iVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        iVar.setClipToPadding(false);
        iVar.setClipChildren(false);
        pcVar.h = new ab(pvVar, 14);
        ai.m0 m0Var = new ai.m0(pvVar, 7);
        pcVar.l = true;
        pcVar.j = m0Var;
        iVar.j(new ai.b(pvVar, 8));
        v4.k kVar = new v4.k();
        this.R = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.m = false;
        iVar.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.S = b0Var;
        iVar.setLayoutManager(b0Var);
        iVar.setOnItemClickListener(new ai.k(pvVar, 5));
        iVar.setOnItemLongClickListener(new a1.c(pvVar, 27));
        iVar.setAdapter(mVar);
        addView(iVar, ha.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), true, true, false);
        this.T = j6Var;
        j6Var.setGravity(3);
        j6Var.setTextColor(getTextLogoColor());
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        j6Var.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        j6Var.setImportantForAccessibility(1);
        j6Var.setFocusableInTouchMode(true);
        addView(j6Var, ha.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(hd.M0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, ha.c(22.0f, 90));
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(26.0f), null);
        this.a0 = g5Var;
        g5Var.a = true;
        g5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(g5Var);
        addView(imageView2, ha.c(40.0f, 40));
        j jVar = new j(pvVar, context, qVar);
        this.U = jVar;
        addView(jVar, ha.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        i iVar2 = new i(pvVar, getContext(), i12);
        this.r = iVar2;
        getContext();
        iVar2.setLayoutManager(new v4.b0(0, false));
        iVar2.i(new k(i11));
        l lVar = new l();
        this.d = lVar;
        lVar.C = false;
        lVar.m = false;
        iVar2.setItemAnimator(lVar);
        iVar2.setAdapter(mVar2);
        iVar2.setClipChildren(false);
        addView(iVar2, ha.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.k6.A8) : f(org.telegram.ui.ActionBar.k6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.k6.Ul);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            d();
        }
    }

    public final void b() {
        this.N = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.c0, 1.0f, 1.0f - this.d0);
        d();
        float f10 = this.N;
        int i7 = f10 == 1.0f ? 2 : f10 != 0.0f ? 1 : 0;
        if (this.O != i7) {
            this.O = i7;
            if (i7 != 1 && this.K) {
                org.telegram.messenger.g0.h3(new d(this, 0));
            }
            int i10 = this.O;
            i iVar = this.r;
            i iVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(iVar2, new e(0));
                iVar.setVisibility(4);
                iVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f;
                if (i10 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.y;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((n) arrayList2.get(i12)).c != p10.i(i11).e() || m()) {
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
                    this.S.h1(0, 0);
                    bg.m0 m0Var = qp.s1(i11).P1().K;
                    org.telegram.messenger.g0.r(m0Var);
                    m0Var.run();
                    o7 o7Var = this.r0;
                    if (o7Var != null) {
                        o7Var.a();
                        this.r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        v4.b0 b0Var = this.S;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        y6 y6Var = this.s;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && y6Var.E(0, ((n) arrayList.get(N0)).c) == 0)) {
            boolean z9 = this.b == 1;
            if (z9) {
                if (!y6Var.z) {
                    return;
                }
            } else if (!y6Var.p) {
                return;
            }
            y6Var.T(z9);
        }
    }

    public final void d() {
        float a10 = c8.j9.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
        float f10 = this.a.e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        org.telegram.ui.Components.j6 j6Var = this.T;
        if (j6Var != null) {
            j6Var.setAlpha(f12);
            j6Var.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setAlpha(f13);
            imageView.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            imageView2.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        j jVar = this.U;
        if (jVar != null) {
            jVar.setAlpha(a10);
            jVar.setVisibility(a10 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.v5 && this.l0) {
            p(getVisibility() == 0, false);
            org.telegram.messenger.g0.h3(new d(this, 2));
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
        boolean z9;
        Canvas canvas2;
        boolean z10;
        float f14;
        double d;
        boolean z11;
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
        int i11 = this.L;
        if (i11 > 0) {
            canvas.clipRect(0, i11, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(4.0f);
        float f23 = 0.0f;
        float T14 = org.telegram.messenger.g0.T1(0.0f, measuredHeight, this.c0);
        i iVar4 = this.h;
        iVar4.setTranslationY(T14);
        i iVar5 = this.r;
        iVar5.setTranslationY(T14);
        iVar5.setTranslationX(this.s0);
        int i12 = 0;
        while (true) {
            arrayList = this.P;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((p) arrayList.get(i12)).a = false;
            i12++;
        }
        arrayList.clear();
        int i13 = this.O;
        int i14 = -1;
        ArrayList arrayList2 = this.Q;
        if ((i13 == 1 || i13 == 0) && !arrayList2.isEmpty()) {
            i7 = -1;
            f10 = 4.0f;
            for (int i15 = 0; i15 < iVar4.getChildCount(); i15++) {
                p pVar = (p) iVar4.getChildAt(i15);
                i7 = pVar.E == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(pVar) : i7;
            }
        } else {
            f10 = 4.0f;
            i7 = this.O == 2 ? 0 : -1;
        }
        int i16 = this.O;
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
                v4.b0 b0Var = this.S;
                i7 = b0Var.I0();
                if (i7 == -1) {
                    i7 = b0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            iVar4.setAlpha(1.0f - Utilities.i(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i18 = -1;
                int i19 = 0;
                f12 = 2.0f;
                while (i19 < iVar4.getChildCount()) {
                    View childAt = iVar4.getChildAt(i19);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i18 != i14 && R >= i18)) {
                        f22 = T14;
                    } else {
                        f22 = T14;
                        if (((n) this.y.get(R)).c != p10.i(this.f).n) {
                            this.p0 = (p) childAt;
                            i18 = R;
                        }
                    }
                    i19++;
                    T14 = f22;
                    i14 = -1;
                    f23 = 0.0f;
                }
                f11 = T14;
                this.o0 = i18;
            } else {
                f11 = T14;
                f12 = 2.0f;
            }
            float f25 = 0.0f;
            int i20 = 0;
            while (i20 < iVar4.getChildCount()) {
                p pVar2 = (p) iVar4.getChildAt(i20);
                pVar2.setClipInParent(false);
                n7 n7Var = pVar2.O;
                int R2 = RecyclerView.R(pVar2);
                float f26 = this.N;
                if (R2 >= i7 && R2 < arrayList2.size() + i7) {
                    int i21 = R2 - i7;
                    if (i21 == i7 + 2) {
                        f26 = this.N;
                    } else if (i21 == i7 + 1) {
                        f14 = measuredHeight;
                        f26 = (float) Math.pow(this.N, 0.5d);
                        d = 0.25d;
                        if (R2 < i7) {
                            f26 = (float) Math.pow(this.N, d);
                        }
                        pVar2.d(f26, this.d0, this.n0, this.o0 == pVar2.b);
                        n7Var.g = 0.0f;
                        RectF rectF = n7Var.F;
                        n7Var.h = 0.0f;
                        n7Var.i = 0.0f;
                        n7Var.j = 0.0f;
                        if (R2 > i7 || R2 >= arrayList2.size() + i7) {
                            z11 = z10;
                            f15 = f25;
                            f16 = f26;
                            iVar3 = iVar4;
                            n7Var.k = false;
                        } else {
                            p pVar3 = (p) iVar4.getChildAt(i20 - 1);
                            if (pVar3 != null) {
                                n7 n7Var2 = pVar3.O;
                                float L2 = org.telegram.messenger.g0.L(48.0f);
                                float L3 = org.telegram.messenger.g0.L(26.33f);
                                z11 = z10;
                                float T15 = (org.telegram.messenger.g0.T1(L2, L3, pVar3.J) + org.telegram.messenger.g0.L(8.0f)) / f12;
                                float T16 = (org.telegram.messenger.g0.T1(L2, L3, pVar2.J) + org.telegram.messenger.g0.L(8.0f)) / f12;
                                float x11 = pVar3.getX() + n7Var2.F.centerX();
                                float y10 = pVar3.getY() + n7Var2.F.centerY();
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
                                    n7Var2.g = degrees2 - f29;
                                    n7Var2.h = degrees2 + f29;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-f28, -f27));
                                    float f30 = -Math.abs(degrees3 - f29);
                                    float abs = Math.abs(degrees3 + f29);
                                    n7Var.i = f30;
                                    n7Var.j = abs;
                                } else {
                                    f16 = f26;
                                    iVar3 = iVar4;
                                    n7Var2.g = 0.0f;
                                    n7Var2.h = 0.0f;
                                    n7Var.i = 0.0f;
                                    n7Var.j = 0.0f;
                                }
                                n7Var2.k = false;
                                n7Var.k = false;
                            } else {
                                z11 = z10;
                                f15 = f25;
                                f16 = f26;
                                iVar3 = iVar4;
                            }
                        }
                        L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.n0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f31 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 <= i7) {
                            f17 = 0.0f;
                            T1 = 0.0f;
                        } else if (R2 == i7 + 1) {
                            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f), 0.0f, this.N) + ((org.telegram.messenger.g0.L(16.0f) * f16) - org.telegram.messenger.g0.N(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(32.0f), 0.0f, this.N) + (((org.telegram.messenger.g0.L(16.0f) * f16) + org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.N(0.5f));
                        }
                        float f32 = T1 + this.s0;
                        if (this.A0) {
                            f18 = 0.0f;
                            T12 = org.telegram.messenger.g0.T1(0.0f, f32 - pVar2.getLeft(), this.J0.getInterpolation(this.E0));
                        } else {
                            if (this.n0 > f17) {
                                int i22 = pVar2.b;
                                int i23 = this.o0;
                                if (i22 < i23) {
                                    f21 = -L;
                                } else if (i22 > i23) {
                                    f21 = L;
                                }
                                T12 = org.telegram.messenger.g0.T1(f32 - pVar2.getLeft(), f21, 1.0f - this.I0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            T12 = org.telegram.messenger.g0.T1(f32 - pVar2.getLeft(), f21, 1.0f - this.I0);
                            f18 = 0.0f;
                        }
                        float a10 = c8.j9.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i10 = R2 - i7;
                        if (i10 == 0) {
                            f19 = 0.65f;
                            T13 = org.telegram.messenger.g0.T1(f18, f11 - f14, xq.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i10 == 1) {
                                T13 = org.telegram.messenger.g0.T1(f18, (f11 - f14) * 0.65f, xq.h.getInterpolation(this.N));
                            } else {
                                f20 = f18;
                                float f33 = (pVar2.b == this.o0 || this.n0 <= f18) ? 0.0f : (-L) / f12;
                                float T17 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.G0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.G0) : 0.0f, f20, a10);
                                if (this.N <= 0.0f) {
                                    boolean z12 = R2 >= i7 && R2 <= i7 + 2;
                                    if (!z11) {
                                        pVar2.setCrossfadeTo(-1L);
                                    } else if (i10 < 0 || i10 >= arrayList2.size()) {
                                        pVar2.setCrossfadeTo(-1L);
                                    } else {
                                        pVar2.setCrossfadeTo(((Long) arrayList2.get(i10)).longValue());
                                    }
                                    pVar2.a = z12;
                                    pVar2.d = R2 == i7;
                                    pVar2.c = R2 >= (arrayList2.size() + i7) + (-1);
                                    pVar2.setTranslationX(T12);
                                    pVar2.setTranslationY(T17);
                                    if (z12) {
                                        arrayList.add(pVar2);
                                    }
                                } else if (iVar3.getItemAnimator() == null || !iVar3.getItemAnimator().k()) {
                                    if (this.n0 > 0.0f) {
                                        int i24 = pVar2.b;
                                        int i25 = this.o0;
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
                                        z10 = z11;
                                        iVar4 = iVar3;
                                    }
                                }
                                f25 = f15;
                                i20++;
                                measuredHeight = f14;
                                z10 = z11;
                                iVar4 = iVar3;
                            }
                        }
                        f20 = T13;
                        if (pVar2.b == this.o0) {
                        }
                        float T172 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.G0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.G0) : 0.0f, f20, a10);
                        if (this.N <= 0.0f) {
                        }
                        if (pVar2.a) {
                        }
                        f25 = f15;
                        i20++;
                        measuredHeight = f14;
                        z10 = z11;
                        iVar4 = iVar3;
                    } else {
                        f14 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.N, 0.25d);
                        if (R2 < i7) {
                        }
                        pVar2.d(f26, this.d0, this.n0, this.o0 == pVar2.b);
                        n7Var.g = 0.0f;
                        RectF rectF2 = n7Var.F;
                        n7Var.h = 0.0f;
                        n7Var.i = 0.0f;
                        n7Var.j = 0.0f;
                        if (R2 > i7) {
                        }
                        z11 = z10;
                        f15 = f25;
                        f16 = f26;
                        iVar3 = iVar4;
                        n7Var.k = false;
                        L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.n0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f312 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 <= i7) {
                        }
                        float f322 = T1 + this.s0;
                        if (this.A0) {
                        }
                        float a102 = c8.j9.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i10 = R2 - i7;
                        if (i10 == 0) {
                        }
                        f20 = T13;
                        if (pVar2.b == this.o0) {
                        }
                        float T1722 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.G0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.G0) : 0.0f, f20, a102);
                        if (this.N <= 0.0f) {
                        }
                        if (pVar2.a) {
                        }
                        f25 = f15;
                        i20++;
                        measuredHeight = f14;
                        z10 = z11;
                        iVar4 = iVar3;
                    }
                }
                f14 = measuredHeight;
                d = 0.25d;
                if (R2 < i7) {
                }
                pVar2.d(f26, this.d0, this.n0, this.o0 == pVar2.b);
                n7Var.g = 0.0f;
                RectF rectF22 = n7Var.F;
                n7Var.h = 0.0f;
                n7Var.i = 0.0f;
                n7Var.j = 0.0f;
                if (R2 > i7) {
                }
                z11 = z10;
                f15 = f25;
                f16 = f26;
                iVar3 = iVar4;
                n7Var.k = false;
                L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.n0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                float f3122 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (R2 <= i7) {
                }
                float f3222 = T1 + this.s0;
                if (this.A0) {
                }
                float a1022 = c8.j9.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                i10 = R2 - i7;
                if (i10 == 0) {
                }
                f20 = T13;
                if (pVar2.b == this.o0) {
                }
                float T17222 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.G0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.G0) : 0.0f, f20, a1022);
                if (this.N <= 0.0f) {
                }
                if (pVar2.a) {
                }
                f25 = f15;
                i20++;
                measuredHeight = f14;
                z10 = z11;
                iVar4 = iVar3;
            }
            f13 = f25;
            iVar = iVar4;
        }
        if (this.J != null) {
            float W1 = org.telegram.messenger.g0.W1(xq.g.getInterpolation(this.N), 29, 74);
            iVar2 = iVar;
            z9 = false;
            if (iVar.getChildCount() > 0) {
                W1 += iVar2.getChildAt(0).getLeft();
            }
            this.J.o(0.0f, W1);
        } else {
            iVar2 = iVar;
            z9 = false;
        }
        float min = Math.min(this.N, this.d0);
        float visibleItemsMeasuredWidthWithAlpha = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) - org.telegram.messenger.g0.L(6.0f);
        boolean z13 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? z9 : true;
        if (z13) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            j jVar = this.U;
            float totalVisibility = jVar.getTotalVisibility() * (-org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Components.j6 j6Var = this.T;
            j6Var.setPivotX(0.0f);
            j6Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, jVar.getTotalVisibility()));
            j6Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, jVar.getTotalVisibility()));
            float L5 = f11 - ((org.telegram.messenger.g0.L(56.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) / f12);
            j6Var.setTranslationY((((org.telegram.messenger.g0.L(14.0f) + L5) - ((j6Var.getMeasuredHeight() - j6Var.getTextHeight()) / f12)) + org.telegram.messenger.g0.L(f10)) - (jVar.getTotalVisibility() * org.telegram.messenger.g0.L(6.0f)));
            int L6 = org.telegram.messenger.g0.L(72.0f);
            float f34 = this.N;
            float T18 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(26.33f), f34) / f12;
            float d2 = rf.b.d(T18, f12, org.telegram.messenger.g0.T1((L6 / f12) - T18, 0.0f, f34), -L6) + org.telegram.messenger.g0.L(12.0f) + f13;
            j6Var.setTranslationX(d2);
            org.telegram.ui.Components.i6 drawable = j6Var.getDrawable();
            drawable.N = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (d2 - org.telegram.messenger.g0.L(12.0f));
            drawable.invalidateSelf();
            float translationX = j6Var.getTranslationX() + org.telegram.messenger.g0.L(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(org.telegram.messenger.g0.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (j6Var.getTranslationX() - org.telegram.messenger.g0.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(org.telegram.messenger.g0.L(11.333f) + L5 + totalVisibility);
            jVar.setTranslationX(j6Var.getTranslationX());
            jVar.setTranslationY(L5 + org.telegram.messenger.g0.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i26 = this.O;
        if (i26 >= 0 && i26 != 2) {
            Collections.sort(arrayList, this.w0);
            for (int i27 = 0; i27 < arrayList.size(); i27++) {
                p pVar4 = (p) arrayList.get(i27);
                canvas2.save();
                canvas2.translate(pVar4.getX() + iVar2.getX(), pVar4.getY() + iVar2.getY());
                pVar4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z13) {
            float L7 = org.telegram.messenger.g0.L(16.0f);
            if (this.x0 == null) {
                this.x0 = new LinearGradient(0.0f, 0.0f, L7, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y0 = new Matrix();
                Paint paint = new Paint(1);
                this.z0 = paint;
                paint.setShader(this.x0);
                this.z0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.y0.reset();
            this.y0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f);
            this.x0.setLocalMatrix(this.y0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - L7, 0.0f, org.telegram.messenger.g0.L(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.z0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final p e(long j3) {
        i iVar = this.O == 2 ? this.r : this.h;
        for (int i7 = 0; i7 < iVar.getChildCount(); i7++) {
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof p) {
                p pVar = (p) childAt;
                if (pVar.E == j3) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final int f(int i7) {
        ww wwVar = this.e0;
        return (wwVar == null || wwVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.k6.x0(null, i7, false) : wwVar.getThemedColor(i7);
    }

    public final boolean g() {
        int i7 = this.O;
        return i7 == 0 || i7 == 1;
    }

    public float getCollapsedProgress() {
        return this.N;
    }

    public float getOverScrollCoef() {
        return this.t0;
    }

    public fi.m3 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.J()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(p10.i(this.f).n));
            this.e0.getOrCreateStoryViewer().M(getContext(), null, arrayList, 0, null, null, h7.a(this.r), false);
        }
    }

    public final void i(p pVar, boolean z9) {
        ValueAnimator valueAnimator;
        if ((!z9 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && pVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z10 = pVar.F;
            y6 y6Var = this.s;
            if (!z10 || y6Var.J()) {
                if (y6Var.K(pVar.E) || y6Var.M(pVar.E)) {
                    TL_stories.PeerStories y10 = y6Var.y(pVar.E);
                    long j3 = pVar.E;
                    o7 o7Var = this.r0;
                    if (o7Var != null) {
                        o7Var.a();
                        this.r0 = null;
                    }
                    bi.d3 d3Var = new bi.d3(this, pVar, j3, 4);
                    if (z9) {
                        d3Var.run();
                        return;
                    }
                    o7 n10 = r7.n(y10, d3Var);
                    pVar.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        y6Var.h0(pVar.E, true);
                    }
                }
            } else if (qp.s1(this.f).W4()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j3) {
        p pVar;
        s6 o4;
        ww wwVar = this.e0;
        int i7 = this.f;
        if (j3 == 0 && (o4 = qp.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            wwVar.showDialog(new ug.i0(o4.b(), this.f, getContext(), this.e0, null));
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
                if (pVar.F) {
                    break;
                } else {
                    i10++;
                }
            } else if (pVar.E == j3) {
                break;
            } else {
                i10++;
            }
        }
        if (pVar == null) {
            return;
        }
        if (j3 == 0) {
            va.D(wwVar.getParentActivity(), i7).Q(qa.c(pVar));
            return;
        }
        org.telegram.ui.ActionBar.f6 resourceProvider = wwVar != null ? wwVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), resourceProvider);
        u1Var.r(500L);
        qp.s1(i7).P1().k(j3, new bi.r2(this, u1Var, j3, pVar, 1), true, resourceProvider);
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
            v4.b0 b0Var = this.S;
            if (i7 < b0Var.I0()) {
                b0Var.h1(i7, 0);
                return true;
            }
            if (i7 > b0Var.M0()) {
                b0Var.i1(i7, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z9, float f10) {
        if (this.c0 == f10) {
            return;
        }
        this.c0 = f10;
        b();
        final int i7 = 0;
        final int i10 = 1;
        boolean z10 = f10 > this.B0;
        if (z10 != this.A0) {
            this.A0 = z10;
            AnimatorSet animatorSet = this.K0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.K0.cancel();
                this.K0 = null;
            }
            if (!z9) {
                this.d0 = z10 ? 1.0f : 0.0f;
                b();
                org.telegram.messenger.g0.d0(this.h, new e(i10));
                return;
            }
            final int i11 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z10 ? 1.0f : 0.0f);
            this.C0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: di.c
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
                            qVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar.b();
                            break;
                        case 1:
                            q qVar2 = this.b;
                            qVar2.getClass();
                            qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            q qVar3 = this.b;
                            qVar3.getClass();
                            qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            q qVar4 = this.b;
                            qVar4.getClass();
                            qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setInterpolator(xq.h);
            float f11 = this.c0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, z10 ? f11 : 0.0f);
            this.F0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: di.c
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
                            qVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar.b();
                            break;
                        case 1:
                            q qVar2 = this.b;
                            qVar2.getClass();
                            qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            q qVar3 = this.b;
                            qVar3.getClass();
                            qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            q qVar4 = this.b;
                            qVar4.getClass();
                            qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            qVar4.invalidate();
                            break;
                    }
                }
            });
            this.F0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K0 = animatorSet2;
            animatorSet2.addListener(new ch.y(i10, this, z10));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.C0);
            arrayList.add(this.F0);
            if (this.A0) {
                this.K0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.d0, z10 ? 1.0f : 0.0f);
                this.D0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: di.c
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
                                qVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar.b();
                                break;
                            case 1:
                                q qVar2 = this.b;
                                qVar2.getClass();
                                qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                q qVar3 = this.b;
                                qVar3.getClass();
                                qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                q qVar4 = this.b;
                                qVar4.getClass();
                                qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.u0);
                this.J0 = overshootInterpolator;
                this.D0.setInterpolator(overshootInterpolator);
                this.D0.setDuration(750L);
                arrayList.add(this.D0);
            } else {
                this.H0 = ValueAnimator.ofFloat(this.d0, z10 ? 1.0f : 0.0f);
                this.H0.setInterpolator(new OvershootInterpolator(this.v0));
                this.H0.setDuration(350L);
                final int i12 = 3;
                this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: di.c
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
                                qVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar.b();
                                break;
                            case 1:
                                q qVar2 = this.b;
                                qVar2.getClass();
                                qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                q qVar3 = this.b;
                                qVar3.getClass();
                                qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                q qVar4 = this.b;
                                qVar4.getClass();
                                qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qVar4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.H0);
            }
            this.K0.playTogether(arrayList);
            this.K0.start();
        }
    }

    public final boolean m() {
        long j3 = p10.i(this.f).n;
        y6 y6Var = this.s;
        if (y6Var.L(j3)) {
            return true;
        }
        return y6Var.J() && y6Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            fi.m3 m3Var = new fi.m3(getContext(), 1);
            m3Var.j(f(org.telegram.ui.ActionBar.k6.tj));
            m3Var.r(true);
            m3Var.K = Layout.Alignment.ALIGN_CENTER;
            m3Var.o(0.0f, 29.0f);
            this.J = m3Var;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(hd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.uj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) S2.getSpans(0, S2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                S2.setSpan(new u31(org.telegram.messenger.g0.o()), S2.getSpanStart(clickableSpanArr[0]), S2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            fi.m3 m3Var2 = this.J;
            m3Var2.h = fi.m3.a(S2, m3Var2.getTextPaint());
            this.J.u(S2);
            this.J.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, ha.e(-1, qs.g2, 51));
            }
        }
        fi.m3 m3Var3 = this.J;
        if (m3Var3 != null) {
            if (m3Var3.V) {
                org.telegram.messenger.p2.D.a();
            }
            this.J.w();
        }
    }

    public final void o() {
        e10 e10Var = r7.b;
        if (e10Var != null) {
            e10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.al, false), 0, 0);
        }
        e10 e10Var2 = r7.c;
        if (e10Var2 != null) {
            e10Var2.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bl, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.cl, false), 0, 0);
        }
        e10[] e10VarArr = r7.a;
        e10 e10Var3 = e10VarArr[0];
        if (e10Var3 != null) {
            e10Var3.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yk, false), 0, 0);
        }
        e10 e10Var4 = e10VarArr[1];
        if (e10Var4 != null) {
            e10Var4.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), 0, 0);
        }
        if (r7.d != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lk, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false);
            r7.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        j jVar = this.U;
        if (jVar != null) {
            jVar.c();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.d0(this.h, new f(textColor, 0));
        org.telegram.messenger.g0.d0(this.r, new e(2));
        try {
            org.telegram.ui.Components.g5 g5Var = this.a0;
            if (g5Var != null) {
                g5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.k6.ni)));
            }
            ImageView imageView = this.W;
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
        qs.f(this.f).c(this, qs.v5);
        ab.q qVar = this.L0;
        qVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) qVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.a0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f).n(this, qs.v5);
        ab.q qVar = this.L0;
        qVar.a = false;
        ((AnimatorSet) qVar.c).cancel();
        o7 o7Var = this.r0;
        if (o7Var != null) {
            o7Var.a();
            this.r0 = null;
        }
        this.a0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.T.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.M = org.telegram.messenger.g0.L(70.0f);
        org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int L = org.telegram.messenger.g0.L((this.D.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            i iVar = this.r;
            int x10 = (int) iVar.getX();
            int y10 = (int) iVar.getY();
            int x11 = (int) (iVar.getX() + L);
            int y11 = (int) (iVar.getY() + iVar.getHeight());
            pc pcVar = this.I;
            pcVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, x11, y11);
            pcVar.i = false;
            pcVar.c = 0;
            pcVar.a(rectF);
            if (pcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z9, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        if ((this.O == 1 || this.n0 != 0.0f) && !z10) {
            this.K = true;
            return;
        }
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.y;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.x;
        arrayList4.clear();
        ArrayList arrayList5 = this.D;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i7 = this.b;
        int i10 = this.f;
        if (i7 != 1) {
            arrayList3.add(new n(p10.i(i10).e()));
        }
        y6 y6Var = this.s;
        ArrayList arrayList6 = i7 == 1 ? y6Var.h : y6Var.g;
        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
            long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList6.get(i11)).peer);
            if (o4 != p10.i(i10).e()) {
                arrayList3.add(new n(o4));
            }
        }
        int size = arrayList3.size();
        if (!y6Var.J()) {
            size--;
        }
        int max = Math.max(1, Math.max(y6Var.D(i7 == 1), size));
        this.f0 = null;
        boolean I = y6Var.I();
        org.telegram.ui.Components.j6 j6Var = this.T;
        if (I) {
            arrayList = arrayList3;
            if (y6Var.M(p10.i(i10).e())) {
                String M0 = hd.M0(2131743801, null);
                if (M0.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
                        v9 v9Var = new v9();
                        valueOf.setSpan(v9Var, valueOf.length() - 1, valueOf.length(), 0);
                        v9Var.a = j6Var;
                        v9Var.n = true;
                        this.i0 = valueOf;
                    }
                    this.f0 = this.i0;
                } else {
                    this.f0 = M0;
                }
            } else {
                this.f0 = this.s0 < ((float) org.telegram.messenger.g0.L(50.0f)) ? null : hd.M0(2131748300, null);
            }
        } else {
            arrayList = arrayList3;
            this.f0 = this.s0 < ((float) org.telegram.messenger.g0.L(50.0f)) ? null : hd.G(max, "Stories", new Object[0]);
        }
        if (this.g0) {
            z11 = true;
        } else {
            z11 = true;
            j6Var.c(this.f0, z9 && !hd.a0, true);
        }
        this.a.a((!TextUtils.isEmpty(this.f0) || this.g0) ? z11 : false, z9);
        arrayList5.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((n) arrayList.get(i12)).c != p10.i(i10).n || m()) {
                arrayList5.add((n) arrayList.get(i12));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        i iVar = this.h;
        i iVar2 = this.r;
        if (!z9) {
            iVar.setItemAnimator(null);
            iVar2.setItemAnimator(null);
        } else if (this.O == 2) {
            iVar2.setItemAnimator(this.d);
            iVar.setItemAnimator(null);
        } else {
            iVar.setItemAnimator(this.R);
            iVar2.setItemAnimator(null);
        }
        this.E.E(arrayList2, arrayList);
        this.F.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.q0 = kVar;
    }

    public void setClipTop(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (this.L != i7) {
            this.L = i7;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.s0 = f10;
    }

    public void setOverscroll(float f10) {
        this.n0 = f10 / org.telegram.messenger.g0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(true, f10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        fi.m3 m3Var = this.J;
        if (m3Var != null) {
            m3Var.setTranslationY(f10);
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}

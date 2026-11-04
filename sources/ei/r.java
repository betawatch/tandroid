package ei;

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
import b8.be;
import b8.mf;
import gi.qa;
import gi.va;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mv;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class r extends FrameLayout implements cs, qe.b {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final n F;
    public float F0;
    public final n G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final nc J;
    public float J0;
    public gi.l3 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final b4.n M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final u4.k S;
    public final u4.b0 T;
    public final org.telegram.ui.Components.h6 U;
    public final k V;
    public final ImageView W;
    public final qe.a a;
    public final ImageView a0;
    public final int b;
    public final org.telegram.ui.Components.e5 b0;
    public final Drawable c;
    public final ArrayList c0;
    public final m d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final uw f0;
    public CharSequence g0;
    public final j h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public p l0;
    public boolean m0;
    public gh0 n;
    public boolean n0;
    public float o0;
    public int p0;
    public q q0;
    public final j r;
    public org.telegram.ui.ActionBar.k r0;
    public final z6 s;
    public p7 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final a3.u x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public r(Context context, uw uwVar, int i3, int i10) {
        super(context);
        this.a = new qe.a(1, this, xq.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        mv mvVar = (mv) this;
        int i11 = 0;
        n nVar = new n(mvVar, false);
        this.F = nVar;
        int i12 = 1;
        n nVar2 = new n(mvVar, true);
        this.G = nVar2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        nc ncVar = new nc(this);
        this.J = ncVar;
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
        this.x0 = new a3.u(9);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        b4.n nVar3 = new b4.n(this);
        this.M0 = nVar3;
        this.b = i10;
        this.f = i3;
        this.f0 = uwVar;
        this.t0 = org.telegram.messenger.g0.L(68.0f);
        this.s = hp.s1(i3).P1();
        j jVar = new j(mvVar, context, i11);
        this.h = jVar;
        jVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        jVar.setClipToPadding(false);
        jVar.setClipChildren(false);
        ncVar.h = new ci.d1(mvVar, 20);
        ai.y1 y1Var = new ai.y1(mvVar, 8);
        ncVar.l = true;
        ncVar.j = y1Var;
        jVar.j(new ai.j5(mvVar, 11));
        u4.k kVar = new u4.k();
        this.S = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.m = false;
        jVar.setItemAnimator(kVar);
        u4.b0 b0Var = new u4.b0(0, false);
        this.T = b0Var;
        jVar.setLayoutManager(b0Var);
        jVar.setOnItemClickListener(new ai.j6(mvVar, 6));
        jVar.setOnItemLongClickListener(new a1.c(mvVar, 23));
        jVar.setAdapter(nVar);
        addView(jVar, mf.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), true, true, false);
        this.U = h6Var;
        h6Var.setGravity(3);
        h6Var.setTextColor(getTextLogoColor());
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        h6Var.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        h6Var.setImportantForAccessibility(1);
        h6Var.setFocusableInTouchMode(true);
        addView(h6Var, mf.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(bd.M0(R.string.AppName, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, mf.c(22.0f, 90));
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(26.0f), null);
        this.b0 = e5Var;
        e5Var.a = true;
        e5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(e5Var);
        addView(imageView2, mf.c(40.0f, 40));
        k kVar2 = new k(mvVar, context, nVar3);
        this.V = kVar2;
        addView(kVar2, mf.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        j jVar2 = new j(mvVar, getContext(), i12);
        this.r = jVar2;
        getContext();
        jVar2.setLayoutManager(new u4.b0(0, false));
        jVar2.i(new l(i11));
        m mVar = new m();
        this.d = mVar;
        mVar.C = false;
        mVar.m = false;
        jVar2.setItemAnimator(mVar);
        jVar2.setAdapter(nVar2);
        jVar2.setClipChildren(false);
        addView(jVar2, mf.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
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

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 1) {
            d();
        }
    }

    public final void b() {
        this.O = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
        d();
        float f10 = this.O;
        int i3 = f10 == 1.0f ? 2 : f10 != 0.0f ? 1 : 0;
        if (this.P != i3) {
            this.P = i3;
            if (i3 != 1 && this.L) {
                org.telegram.messenger.g0.h3(new d(this, 0));
            }
            int i10 = this.P;
            j jVar = this.r;
            j jVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(jVar2, new e(0));
                jVar.setVisibility(4);
                jVar2.setVisibility(0);
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
                        if (((o) arrayList2.get(i12)).c != h10.i(i11).e() || m()) {
                            arrayList.add(Long.valueOf(((o) arrayList2.get(i12)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i12++;
                    }
                    jVar.setVisibility(4);
                    jVar2.setVisibility(0);
                } else if (i10 == 2) {
                    jVar.setVisibility(0);
                    jVar2.setVisibility(4);
                    this.T.h1(0, 0);
                    cg.l0 l0Var = hp.s1(i11).P1().K;
                    org.telegram.messenger.g0.r(l0Var);
                    l0Var.run();
                    p7 p7Var = this.s0;
                    if (p7Var != null) {
                        p7Var.a();
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
        u4.b0 b0Var = this.T;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        z6 z6Var = this.s;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && z6Var.E(0, ((o) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!z6Var.z) {
                    return;
                }
            } else if (!z6Var.p) {
                return;
            }
            z6Var.T(z10);
        }
    }

    public final void d() {
        float a10 = be.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f10 = this.a.e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        org.telegram.ui.Components.h6 h6Var = this.U;
        if (h6Var != null) {
            h6Var.setAlpha(f12);
            h6Var.setVisibility(f12 > 0.0f ? 0 : 8);
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
        k kVar = this.V;
        if (kVar != null) {
            kVar.setAlpha(a10);
            kVar.setVisibility(a10 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.v5 && this.m0) {
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
        int i3;
        float f10;
        float f11;
        j jVar;
        float f12;
        float f13;
        j jVar2;
        boolean z10;
        Canvas canvas2;
        boolean z11;
        float f14;
        double d;
        boolean z12;
        float f15;
        float f16;
        j jVar3;
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
        j jVar4 = this.h;
        jVar4.setTranslationY(T14);
        j jVar5 = this.r;
        jVar5.setTranslationY(T14);
        jVar5.setTranslationX(this.t0);
        int i12 = 0;
        while (true) {
            arrayList = this.Q;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((q) arrayList.get(i12)).a = false;
            i12++;
        }
        arrayList.clear();
        int i13 = this.P;
        int i14 = -1;
        ArrayList arrayList2 = this.R;
        if ((i13 == 1 || i13 == 0) && !arrayList2.isEmpty()) {
            i3 = -1;
            f10 = 4.0f;
            for (int i15 = 0; i15 < jVar4.getChildCount(); i15++) {
                q qVar = (q) jVar4.getChildAt(i15);
                i3 = qVar.F == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(qVar) : i3;
            }
        } else {
            f10 = 4.0f;
            i3 = this.P == 2 ? 0 : -1;
        }
        int i16 = this.P;
        if (i16 < 0 || i16 == 2) {
            f11 = T14;
            jVar = jVar4;
            f12 = 2.0f;
            float f24 = 0.0f;
            for (int i17 = 0; i17 < jVar5.getChildCount(); i17++) {
                float x10 = ((q) jVar5.getChildAt(i17)).getX() + jVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x10 > f24) {
                    f24 = x10;
                }
            }
            f13 = f24;
        } else {
            if (i3 == -1) {
                u4.b0 b0Var = this.T;
                i3 = b0Var.I0();
                if (i3 == -1) {
                    i3 = b0Var.L0();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            jVar4.setAlpha(1.0f - Utilities.i(this.O / this.C0, 1.0f, 0.0f));
            this.p0 = -1;
            if (this.o0 != 0.0f) {
                int i18 = -1;
                int i19 = 0;
                f12 = 2.0f;
                while (i19 < jVar4.getChildCount()) {
                    View childAt = jVar4.getChildAt(i19);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i18 != i14 && R >= i18)) {
                        f22 = T14;
                    } else {
                        f22 = T14;
                        if (((o) this.y.get(R)).c != h10.i(this.f).n) {
                            this.q0 = (q) childAt;
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
            while (i20 < jVar4.getChildCount()) {
                q qVar2 = (q) jVar4.getChildAt(i20);
                qVar2.setClipInParent(false);
                o7 o7Var = qVar2.P;
                int R2 = RecyclerView.R(qVar2);
                float f26 = this.O;
                if (R2 >= i3 && R2 < arrayList2.size() + i3) {
                    int i21 = R2 - i3;
                    if (i21 == i3 + 2) {
                        f26 = this.O;
                    } else if (i21 == i3 + 1) {
                        f14 = measuredHeight;
                        f26 = (float) Math.pow(this.O, 0.5d);
                        d = 0.25d;
                        if (R2 < i3) {
                            f26 = (float) Math.pow(this.O, d);
                        }
                        qVar2.d(f26, this.e0, this.o0, this.p0 == qVar2.b);
                        o7Var.g = 0.0f;
                        RectF rectF = o7Var.F;
                        o7Var.h = 0.0f;
                        o7Var.i = 0.0f;
                        o7Var.j = 0.0f;
                        if (R2 > i3 || R2 >= arrayList2.size() + i3) {
                            z12 = z11;
                            f15 = f25;
                            f16 = f26;
                            jVar3 = jVar4;
                            o7Var.k = false;
                        } else {
                            q qVar3 = (q) jVar4.getChildAt(i20 - 1);
                            if (qVar3 != null) {
                                o7 o7Var2 = qVar3.P;
                                float L2 = org.telegram.messenger.g0.L(48.0f);
                                float L3 = org.telegram.messenger.g0.L(26.33f);
                                z12 = z11;
                                float T15 = (org.telegram.messenger.g0.T1(L2, L3, qVar3.K) + org.telegram.messenger.g0.L(8.0f)) / f12;
                                float T16 = (org.telegram.messenger.g0.T1(L2, L3, qVar2.K) + org.telegram.messenger.g0.L(8.0f)) / f12;
                                float x11 = qVar3.getX() + o7Var2.F.centerX();
                                float y9 = qVar3.getY() + o7Var2.F.centerY();
                                float x12 = qVar2.getX() + rectF.centerX();
                                float y10 = qVar2.getY() + rectF.centerY();
                                float f27 = x12 - x11;
                                float f28 = y10 - y9;
                                f15 = f25;
                                if (((float) Math.sqrt((f28 * f28) + (f27 * f27))) < T15 + T16) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f16 = f26;
                                    jVar3 = jVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(f28, f27));
                                    float f29 = degrees / f12;
                                    o7Var2.g = degrees2 - f29;
                                    o7Var2.h = degrees2 + f29;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-f28, -f27));
                                    float f30 = -Math.abs(degrees3 - f29);
                                    float abs = Math.abs(degrees3 + f29);
                                    o7Var.i = f30;
                                    o7Var.j = abs;
                                } else {
                                    f16 = f26;
                                    jVar3 = jVar4;
                                    o7Var2.g = 0.0f;
                                    o7Var2.h = 0.0f;
                                    o7Var.i = 0.0f;
                                    o7Var.j = 0.0f;
                                }
                                o7Var2.k = false;
                                o7Var.k = false;
                            } else {
                                z12 = z11;
                                f15 = f25;
                                f16 = f26;
                                jVar3 = jVar4;
                            }
                        }
                        L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f31 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 <= i3) {
                            f17 = 0.0f;
                            T1 = 0.0f;
                        } else if (R2 == i3 + 1) {
                            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f), 0.0f, this.O) + ((org.telegram.messenger.g0.L(16.0f) * f16) - org.telegram.messenger.g0.N(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(32.0f), 0.0f, this.O) + (((org.telegram.messenger.g0.L(16.0f) * f16) + org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.N(0.5f));
                        }
                        float f32 = T1 + this.t0;
                        if (this.B0) {
                            f18 = 0.0f;
                            T12 = org.telegram.messenger.g0.T1(0.0f, f32 - qVar2.getLeft(), this.K0.getInterpolation(this.F0));
                        } else {
                            if (this.o0 > f17) {
                                int i22 = qVar2.b;
                                int i23 = this.p0;
                                if (i22 < i23) {
                                    f21 = -L;
                                } else if (i22 > i23) {
                                    f21 = L;
                                }
                                T12 = org.telegram.messenger.g0.T1(f32 - qVar2.getLeft(), f21, 1.0f - this.J0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            T12 = org.telegram.messenger.g0.T1(f32 - qVar2.getLeft(), f21, 1.0f - this.J0);
                            f18 = 0.0f;
                        }
                        float a10 = be.a((this.d0 - 0.2f) / 0.1f, f18, 1.0f);
                        i10 = R2 - i3;
                        if (i10 == 0) {
                            f19 = 0.65f;
                            T13 = org.telegram.messenger.g0.T1(f18, f11 - f14, xq.h.getInterpolation(this.O));
                        } else {
                            f19 = 0.65f;
                            if (i10 == 1) {
                                T13 = org.telegram.messenger.g0.T1(f18, (f11 - f14) * 0.65f, xq.h.getInterpolation(this.O));
                            } else {
                                f20 = f18;
                                float f33 = (qVar2.b == this.p0 || this.o0 <= f18) ? 0.0f : (-L) / f12;
                                float T17 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a10);
                                if (this.O <= 0.0f) {
                                    boolean z13 = R2 >= i3 && R2 <= i3 + 2;
                                    if (!z12) {
                                        qVar2.setCrossfadeTo(-1L);
                                    } else if (i10 < 0 || i10 >= arrayList2.size()) {
                                        qVar2.setCrossfadeTo(-1L);
                                    } else {
                                        qVar2.setCrossfadeTo(((Long) arrayList2.get(i10)).longValue());
                                    }
                                    qVar2.a = z13;
                                    qVar2.d = R2 == i3;
                                    qVar2.c = R2 >= (arrayList2.size() + i3) + (-1);
                                    qVar2.setTranslationX(T12);
                                    qVar2.setTranslationY(T17);
                                    if (z13) {
                                        arrayList.add(qVar2);
                                    }
                                } else if (jVar3.getItemAnimator() == null || !jVar3.getItemAnimator().k()) {
                                    if (this.o0 > 0.0f) {
                                        int i24 = qVar2.b;
                                        int i25 = this.p0;
                                        if (i24 < i25) {
                                            qVar2.setAlpha(f31);
                                        } else if (i24 > i25) {
                                            qVar2.setAlpha(f31);
                                        } else {
                                            qVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        qVar2.setAlpha(1.0f);
                                    }
                                    qVar2.setTranslationX(T12);
                                    qVar2.setTranslationY(T17);
                                }
                                if (qVar2.a) {
                                    float L4 = (org.telegram.messenger.g0.L(70.0f) / f12) + (qVar2.getMeasuredWidth() / f12) + qVar2.getX() + jVar3.getX();
                                    if (f15 == 0.0f || L4 > f15) {
                                        f25 = L4;
                                        i20++;
                                        measuredHeight = f14;
                                        z11 = z12;
                                        jVar4 = jVar3;
                                    }
                                }
                                f25 = f15;
                                i20++;
                                measuredHeight = f14;
                                z11 = z12;
                                jVar4 = jVar3;
                            }
                        }
                        f20 = T13;
                        if (qVar2.b == this.p0) {
                        }
                        float T172 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a10);
                        if (this.O <= 0.0f) {
                        }
                        if (qVar2.a) {
                        }
                        f25 = f15;
                        i20++;
                        measuredHeight = f14;
                        z11 = z12;
                        jVar4 = jVar3;
                    } else {
                        f14 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.O, 0.25d);
                        if (R2 < i3) {
                        }
                        qVar2.d(f26, this.e0, this.o0, this.p0 == qVar2.b);
                        o7Var.g = 0.0f;
                        RectF rectF2 = o7Var.F;
                        o7Var.h = 0.0f;
                        o7Var.i = 0.0f;
                        o7Var.j = 0.0f;
                        if (R2 > i3) {
                        }
                        z12 = z11;
                        f15 = f25;
                        f16 = f26;
                        jVar3 = jVar4;
                        o7Var.k = false;
                        L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                        float f312 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                        if (R2 <= i3) {
                        }
                        float f322 = T1 + this.t0;
                        if (this.B0) {
                        }
                        float a102 = be.a((this.d0 - 0.2f) / 0.1f, f18, 1.0f);
                        i10 = R2 - i3;
                        if (i10 == 0) {
                        }
                        f20 = T13;
                        if (qVar2.b == this.p0) {
                        }
                        float T1722 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a102);
                        if (this.O <= 0.0f) {
                        }
                        if (qVar2.a) {
                        }
                        f25 = f15;
                        i20++;
                        measuredHeight = f14;
                        z11 = z12;
                        jVar4 = jVar3;
                    }
                }
                f14 = measuredHeight;
                d = 0.25d;
                if (R2 < i3) {
                }
                qVar2.d(f26, this.e0, this.o0, this.p0 == qVar2.b);
                o7Var.g = 0.0f;
                RectF rectF22 = o7Var.F;
                o7Var.h = 0.0f;
                o7Var.i = 0.0f;
                o7Var.j = 0.0f;
                if (R2 > i3) {
                }
                z12 = z11;
                f15 = f25;
                f16 = f26;
                jVar3 = jVar4;
                o7Var.k = false;
                L = org.telegram.messenger.g0.L(16.0f) * Utilities.i((this.o0 - 0.5f) / 0.5f, 1.0f, 0.0f);
                float f3122 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (R2 <= i3) {
                }
                float f3222 = T1 + this.t0;
                if (this.B0) {
                }
                float a1022 = be.a((this.d0 - 0.2f) / 0.1f, f18, 1.0f);
                i10 = R2 - i3;
                if (i10 == 0) {
                }
                f20 = T13;
                if (qVar2.b == this.p0) {
                }
                float T17222 = org.telegram.messenger.g0.T1(i10 != 0 ? org.telegram.messenger.g0.T1(f33, f11 - f14, this.H0) : i10 == 1 ? org.telegram.messenger.g0.T1(f33, (f11 - f14) * f19, this.H0) : 0.0f, f20, a1022);
                if (this.O <= 0.0f) {
                }
                if (qVar2.a) {
                }
                f25 = f15;
                i20++;
                measuredHeight = f14;
                z11 = z12;
                jVar4 = jVar3;
            }
            f13 = f25;
            jVar = jVar4;
        }
        if (this.K != null) {
            float W1 = org.telegram.messenger.g0.W1(xq.g.getInterpolation(this.O), 29, 74);
            jVar2 = jVar;
            z10 = false;
            if (jVar.getChildCount() > 0) {
                W1 += jVar2.getChildAt(0).getLeft();
            }
            this.K.o(0.0f, W1);
        } else {
            jVar2 = jVar;
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
            k kVar = this.V;
            float totalVisibility = kVar.getTotalVisibility() * (-org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Components.h6 h6Var = this.U;
            h6Var.setPivotX(0.0f);
            h6Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, kVar.getTotalVisibility()));
            h6Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, kVar.getTotalVisibility()));
            float L5 = f11 - ((org.telegram.messenger.g0.L(56.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) / f12);
            h6Var.setTranslationY((((org.telegram.messenger.g0.L(14.0f) + L5) - ((h6Var.getMeasuredHeight() - h6Var.getTextHeight()) / f12)) + org.telegram.messenger.g0.L(f10)) - (kVar.getTotalVisibility() * org.telegram.messenger.g0.L(6.0f)));
            int L6 = org.telegram.messenger.g0.L(72.0f);
            float f34 = this.O;
            float T18 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(26.33f), f34) / f12;
            float c2 = t4.c.c(T18, f12, org.telegram.messenger.g0.T1((L6 / f12) - T18, 0.0f, f34), -L6) + org.telegram.messenger.g0.L(12.0f) + f13;
            h6Var.setTranslationX(c2);
            org.telegram.ui.Components.g6 drawable = h6Var.getDrawable();
            drawable.N = (this.r0.F.getVisibleItemsMeasuredWidthWithAlpha() * min) + (c2 - org.telegram.messenger.g0.L(12.0f));
            drawable.invalidateSelf();
            float translationX = h6Var.getTranslationX() + org.telegram.messenger.g0.L(1.0f);
            ImageView imageView = this.W;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(org.telegram.messenger.g0.L(22.333f) + L5 + totalVisibility);
            float translationX2 = (h6Var.getTranslationX() - org.telegram.messenger.g0.N(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.a0;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(org.telegram.messenger.g0.L(11.333f) + L5 + totalVisibility);
            kVar.setTranslationX(h6Var.getTranslationX());
            kVar.setTranslationY(L5 + org.telegram.messenger.g0.L(31.333f));
        }
        super.dispatchDraw(canvas);
        int i26 = this.P;
        if (i26 >= 0 && i26 != 2) {
            Collections.sort(arrayList, this.x0);
            for (int i27 = 0; i27 < arrayList.size(); i27++) {
                q qVar4 = (q) arrayList.get(i27);
                canvas2.save();
                canvas2.translate(qVar4.getX() + jVar2.getX(), qVar4.getY() + jVar2.getY());
                qVar4.draw(canvas2);
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

    public final q e(long j10) {
        j jVar = this.P == 2 ? this.r : this.h;
        for (int i3 = 0; i3 < jVar.getChildCount(); i3++) {
            View childAt = jVar.getChildAt(i3);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (qVar.F == j10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public final int f(int i3) {
        uw uwVar = this.f0;
        return (uwVar == null || uwVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.k6.x0(null, i3, false) : uwVar.getThemedColor(i3);
    }

    public final boolean g() {
        int i3 = this.P;
        return i3 == 0 || i3 == 1;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.u0;
    }

    public gi.l3 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (this.s.J()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(h10.i(this.f).n));
            this.f0.getOrCreateStoryViewer().U(getContext(), null, arrayList, 0, null, null, i7.a(this.r), false);
        }
    }

    public final void i(q qVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && qVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = qVar.G;
            z6 z6Var = this.s;
            if (!z11 || z6Var.J()) {
                if (z6Var.K(qVar.F) || z6Var.M(qVar.F)) {
                    TL_stories.PeerStories y9 = z6Var.y(qVar.F);
                    long j10 = qVar.F;
                    p7 p7Var = this.s0;
                    if (p7Var != null) {
                        p7Var.a();
                        this.s0 = null;
                    }
                    ai.r1 r1Var = new ai.r1(this, qVar, j10, 5);
                    if (z10) {
                        r1Var.run();
                        return;
                    }
                    p7 n4 = s7.n(y9, r1Var);
                    qVar.e = n4;
                    this.s0 = n4;
                    if (n4 != null) {
                        z6Var.h0(qVar.F, true);
                    }
                }
            } else if (hp.s1(this.f).W4()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j10) {
        q qVar;
        t6 o10;
        uw uwVar = this.f0;
        int i3 = this.f;
        if (j10 == 0 && (o10 = hp.s1(i3).P1().o()) != null && o10.a(i3, 1)) {
            uwVar.showDialog(new vg.i0(o10.b(), this.f, getContext(), this.f0, null));
            return;
        }
        int i10 = 0;
        while (true) {
            j jVar = this.h;
            if (i10 >= jVar.getChildCount()) {
                qVar = null;
                break;
            }
            qVar = (q) jVar.getChildAt(i10);
            if (j10 == 0) {
                if (qVar.G) {
                    break;
                } else {
                    i10++;
                }
            } else if (qVar.F == j10) {
                break;
            } else {
                i10++;
            }
        }
        if (qVar == null) {
            return;
        }
        if (j10 == 0) {
            va.D(uwVar.getParentActivity(), i3).Q(qa.c(qVar));
            return;
        }
        org.telegram.ui.ActionBar.e6 resourceProvider = uwVar != null ? uwVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getContext(), resourceProvider);
        s1Var.r(500L);
        hp.s1(i3).P1().k(j10, new ai.m1(this, s1Var, j10, qVar, 2), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i3 >= arrayList.size()) {
                i3 = -1;
                break;
            }
            if (((o) arrayList.get(i3)).c == j10) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            u4.b0 b0Var = this.T;
            if (i3 < b0Var.I0()) {
                b0Var.h1(i3, 0);
                return true;
            }
            if (i3 > b0Var.M0()) {
                b0Var.i1(i3, 0, true);
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
        final int i3 = 0;
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ei.c
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i3) {
                        case 0:
                            r rVar = this.b;
                            rVar.getClass();
                            rVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar.b();
                            break;
                        case 1:
                            r rVar2 = this.b;
                            rVar2.getClass();
                            rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            r rVar3 = this.b;
                            rVar3.getClass();
                            rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            r rVar4 = this.b;
                            rVar4.getClass();
                            rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar4.invalidate();
                            break;
                    }
                }
            });
            this.D0.setInterpolator(xq.h);
            float f11 = this.d0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, z11 ? f11 : 0.0f);
            this.G0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ei.c
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            r rVar = this.b;
                            rVar.getClass();
                            rVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar.b();
                            break;
                        case 1:
                            r rVar2 = this.b;
                            rVar2.getClass();
                            rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            r rVar3 = this.b;
                            rVar3.getClass();
                            rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            r rVar4 = this.b;
                            rVar4.getClass();
                            rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar4.invalidate();
                            break;
                    }
                }
            });
            this.G0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L0 = animatorSet2;
            animatorSet2.addListener(new dh.x(i10, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.D0);
            arrayList.add(this.G0);
            if (this.B0) {
                this.L0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.e0, z11 ? 1.0f : 0.0f);
                this.E0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ei.c
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                rVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar.b();
                                break;
                            case 1:
                                r rVar2 = this.b;
                                rVar2.getClass();
                                rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                r rVar3 = this.b;
                                rVar3.getClass();
                                rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                r rVar4 = this.b;
                                rVar4.getClass();
                                rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar4.invalidate();
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
                this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ei.c
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                rVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar.b();
                                break;
                            case 1:
                                r rVar2 = this.b;
                                rVar2.getClass();
                                rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                r rVar3 = this.b;
                                rVar3.getClass();
                                rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                r rVar4 = this.b;
                                rVar4.getClass();
                                rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar4.invalidate();
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
        long j10 = h10.i(this.f).n;
        z6 z6Var = this.s;
        if (z6Var.L(j10)) {
            return true;
        }
        return z6Var.J() && z6Var.g.size() <= 3;
    }

    public final void n() {
        if (this.K == null) {
            gi.l3 l3Var = new gi.l3(getContext(), 1);
            l3Var.j(f(org.telegram.ui.ActionBar.k6.tj));
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_CENTER;
            l3Var.o(0.0f, 29.0f);
            this.K = l3Var;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(bd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.uj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) S2.getSpans(0, S2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                S2.setSpan(new o31(org.telegram.messenger.g0.o()), S2.getSpanStart(clickableSpanArr[0]), S2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            gi.l3 l3Var2 = this.K;
            l3Var2.h = gi.l3.a(S2, l3Var2.getTextPaint());
            this.K.u(S2);
            this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, mf.e(-1, hs.g2, 51));
            }
        }
        gi.l3 l3Var3 = this.K;
        if (l3Var3 != null) {
            if (l3Var3.W) {
                org.telegram.messenger.p2.E.a();
            }
            this.K.w();
        }
    }

    public final void o() {
        b10 b10Var = s7.b;
        if (b10Var != null) {
            b10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.al, false), 0, 0);
        }
        b10 b10Var2 = s7.c;
        if (b10Var2 != null) {
            b10Var2.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bl, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.cl, false), 0, 0);
        }
        b10[] b10VarArr = s7.a;
        b10 b10Var3 = b10VarArr[0];
        if (b10Var3 != null) {
            b10Var3.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yk, false), 0, 0);
        }
        b10 b10Var4 = b10VarArr[1];
        if (b10Var4 != null) {
            b10Var4.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), 0, 0);
        }
        if (s7.d != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lk, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false);
            s7.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        k kVar = this.V;
        if (kVar != null) {
            kVar.d();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.d0(this.h, new g(textColor, 0));
        org.telegram.messenger.g0.d0(this.r, new e(2));
        try {
            org.telegram.ui.Components.e5 e5Var = this.b0;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.k6.ni)));
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
        hs.f(this.f).c(this, hs.v5);
        b4.n nVar = this.M0;
        nVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) nVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f).n(this, hs.v5);
        b4.n nVar = this.M0;
        nVar.a = false;
        ((AnimatorSet) nVar.c).cancel();
        p7 p7Var = this.s0;
        if (p7Var != null) {
            p7Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.U.setTextSize(org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.N = org.telegram.messenger.g0.L(70.0f);
        org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int L = org.telegram.messenger.g0.L((this.E.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            j jVar = this.r;
            int x10 = (int) jVar.getX();
            int y9 = (int) jVar.getY();
            int x11 = (int) (jVar.getX() + L);
            int y10 = (int) (jVar.getY() + jVar.getHeight());
            nc ncVar = this.J;
            ncVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y9, x11, y10);
            ncVar.i = false;
            ncVar.c = 0;
            ncVar.a(rectF);
            if (ncVar.b(motionEvent)) {
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
        int i3 = this.b;
        int i10 = this.f;
        if (i3 != 1) {
            arrayList3.add(new o(h10.i(i10).e()));
        }
        z6 z6Var = this.s;
        ArrayList arrayList6 = i3 == 1 ? z6Var.h : z6Var.g;
        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
            long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList6.get(i11)).peer);
            if (o10 != h10.i(i10).e()) {
                arrayList3.add(new o(o10));
            }
        }
        int size = arrayList3.size();
        if (!z6Var.J()) {
            size--;
        }
        int max = Math.max(1, Math.max(z6Var.D(i3 == 1), size));
        this.g0 = null;
        boolean I = z6Var.I();
        org.telegram.ui.Components.h6 h6Var = this.U;
        if (I) {
            arrayList = arrayList3;
            if (z6Var.M(h10.i(i10).e())) {
                String M0 = bd.M0(2131743810, null);
                if (M0.indexOf("…") > 0) {
                    if (this.j0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
                        x9 x9Var = new x9();
                        valueOf.setSpan(x9Var, valueOf.length() - 1, valueOf.length(), 0);
                        x9Var.a = h6Var;
                        x9Var.n = true;
                        this.j0 = valueOf;
                    }
                    this.g0 = this.j0;
                } else {
                    this.g0 = M0;
                }
            } else {
                this.g0 = this.t0 < ((float) org.telegram.messenger.g0.L(50.0f)) ? null : bd.M0(2131748309, null);
            }
        } else {
            arrayList = arrayList3;
            this.g0 = this.t0 < ((float) org.telegram.messenger.g0.L(50.0f)) ? null : bd.G(max, "Stories", new Object[0]);
        }
        if (this.h0) {
            z12 = true;
        } else {
            z12 = true;
            h6Var.c(this.g0, z10 && !bd.a0, true);
        }
        this.a.a((!TextUtils.isEmpty(this.g0) || this.h0) ? z12 : false, z10);
        arrayList5.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((o) arrayList.get(i12)).c != h10.i(i10).n || m()) {
                arrayList5.add((o) arrayList.get(i12));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        j jVar = this.h;
        j jVar2 = this.r;
        if (!z10) {
            jVar.setItemAnimator(null);
            jVar2.setItemAnimator(null);
        } else if (this.P == 2) {
            jVar2.setItemAnimator(this.d);
            jVar.setItemAnimator(null);
        } else {
            jVar.setItemAnimator(this.S);
            jVar2.setItemAnimator(null);
        }
        this.F.E(arrayList2, arrayList);
        this.G.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.r0 = kVar;
    }

    public void setClipTop(int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.M != i3) {
            this.M = i3;
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
        gi.l3 l3Var = this.K;
        if (l3Var != null) {
            l3Var.setTranslationY(f10);
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}

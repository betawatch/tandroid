package ki;

import a8.r7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.h7;
import bi.s8;
import bi.y5;
import c8.ma;
import hi.d7;
import hi.e9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bh;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.hq0;
import org.telegram.ui.t51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class s2 extends Dialog implements fs, org.telegram.ui.ActionBar.j3 {
    public static final HashSet b1 = new HashSet();
    public static final xt0 c1;
    public static int d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public v0 D0;
    public final k2 E;
    public boolean E0;
    public final q2 F;
    public org.telegram.ui.ActionBar.e3 F0;
    public final h6 G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public int I;
    public float I0;
    public long J;
    public boolean J0;
    public long K;
    public boolean K0;
    public long L;
    public int L0;
    public int M;
    public t51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public a70 P0;
    public final Paint Q;
    public f0 Q0;
    public final Paint R;
    public boolean R0;
    public int S;
    public float S0;
    public int T;
    public ValueAnimator T0;
    public boolean U;
    public ValueAnimator U0;
    public final Paint V;
    public boolean V0;
    public boolean W;
    public ValueAnimator W0;
    public boolean X;
    public boolean X0;
    public final p2 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public org.telegram.ui.b3 Z0;
    public int a;
    public final Drawable a0;
    public boolean a1;
    public int b;
    public org.telegram.ui.ActionBar.q0 b0;
    public float c;
    public org.telegram.messenger.g2 c0;
    public r1.g d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final r2 f;
    public boolean f0;
    public boolean g0;
    public final Rect h;
    public float h0;
    public float i0;
    public boolean j0;
    public int k0;
    public int l0;
    public Activity m0;
    public final Rect n;
    public final o2 n0;
    public final org.telegram.messenger.h2 o0;
    public gc p0;
    public e0 q0;
    public int r;
    public final FrameLayout r0;
    public final org.telegram.ui.ActionBar.f3 s;
    public final FrameLayout.LayoutParams s0;
    public boolean t0;
    public final qc0 u0;
    public final s1 v0;
    public final r7 w;
    public int w0;
    public final j2 x;
    public e4 x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        xt0 xt0Var = new xt0(new e9(16), new e9(17));
        xt0Var.c = 100.0f;
        c1 = xt0Var;
        d1 = 0;
    }

    public s2(Context context, h6 h6Var) {
        super(context, R.style.TransparentDialog);
        this.c = 0.0f;
        this.h = new Rect();
        this.n = new Rect();
        int i7 = 0;
        this.r = 0;
        int i10 = 1;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.v0 = new s1(this, i10);
        this.w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.a1 = false;
        this.G = h6Var;
        int x02 = m6.x0(null, m6.zj, false);
        this.b = x02;
        this.a = x02;
        j2 j2Var = new j2(i7, context, this);
        this.x = j2Var;
        j2Var.setAllowFullSizeSwipe(true);
        j2Var.setShouldWaitWebViewScroll(true);
        int i11 = m6.d6;
        k2 k2Var = new k2(this, context, h6Var, m6.w0(i11, h6Var), 0);
        this.E = k2Var;
        k2Var.setOnVerifiedAge(this.M0);
        k2Var.setDelegate(new n2(this, context, h6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.S = m6.w0(i11, h6Var);
        int w02 = m6.w0(m6.a7, h6Var);
        this.T = w02;
        org.telegram.messenger.g0.s3(this, w02, false, null);
        r2 r2Var = new r2(this, context);
        this.f = r2Var;
        r2Var.setDelegate(new u1(this, i7));
        FrameLayout.LayoutParams e10 = ma.e(-1, -1, 49);
        this.y = e10;
        r2Var.addView(j2Var, e10);
        o2 o2Var = new o2(this, getContext(), h6Var);
        this.n0 = o2Var;
        o2Var.setOnButtonClickListener(new v1(this, i7));
        o2Var.setOnResizeListener(new s1(this, 3));
        r2Var.addView(o2Var, ma.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        boolean z10 = !mp.u1(this.I).J6 && bz.o() >= 2;
        this.g0 = z10;
        h2Var.setParentRenderNode(z10 ? j2Var.getRenderNode() : null);
        r2Var.addView(h2Var, ma.e(-1, -1, ks.E1));
        int i12 = 4;
        h2Var.setOnCloseClickListener(new s1(this, i12));
        h2Var.setOnCollapseClickListener(new s1(this, 5));
        h2Var.setOnMenuClickListener(new s1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        FrameLayout.LayoutParams e11 = ma.e(-1, ks.e3, 55);
        this.s0 = e11;
        r2Var.addView(frameLayout, e11);
        this.a0 = getContext().getDrawable(R.drawable.header_shadow).mutate();
        p2 p2Var = new p2(context, h6Var);
        this.Y = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setBackButtonImage(R.drawable.ic_close_white);
        F();
        p2Var.setActionBarMenuOnItemClick(new d2(this, i10));
        p2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = ma.e(-1, -2, 49);
        this.Z = e12;
        r2Var.addView(p2Var, e12);
        q2 q2Var = new q2(context, h6Var);
        this.F = q2Var;
        r2Var.addView(q2Var, ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        k2Var.setWebViewProgressListener(new s8(this, i12));
        j2Var.addView(k2Var, ma.c(-1.0f, -1));
        j2Var.setScrollListener(new s1(this, 7));
        j2Var.setScrollEndListener(new s1(this, 8));
        j2Var.setDelegate(new t1(this));
        j2Var.setIsKeyboardVisible(new t1(this));
        qc0 qc0Var = new qc0(context);
        this.u0 = qc0Var;
        r2Var.addView(qc0Var, ma.c(-1.0f, -1));
        setContentView(r2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.f3 N = launchActivity != null ? launchActivity.N() : null;
        this.s = N;
        if (N != null) {
            kg.i0 i0Var = new kg.i0(r2Var, 13);
            s1 s1Var = new s1(this, 2);
            N.J.add(i0Var);
            N.K.add(s1Var);
            this.w = new r7(N);
        }
    }

    public static /* synthetic */ void f(s2 s2Var) {
        if (s2Var.R0) {
            return;
        }
        super.dismiss();
        s2Var.R0 = true;
    }

    public static WindowInsets h(s2 s2Var, View view, WindowInsets windowInsets) {
        r0.i1 i1Var = r0.l1.h(view, windowInsets).a;
        i0.b f10 = i1Var.f(2);
        s2Var.h.set(f10.a, f10.b, f10.c, f10.d);
        i0.b f11 = i1Var.f(647);
        Rect rect = s2Var.n;
        rect.set(Math.max(f11.a, windowInsets.getStableInsetLeft()), Math.max(f11.b, windowInsets.getStableInsetTop()), Math.max(f11.c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 29) {
            Activity W = org.telegram.messenger.g0.W(s2Var.getContext());
            WindowInsets rootWindowInsets = (W == null || W.getWindow() == null) ? null : W.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                rect.set(Math.max(rect.left, rootWindowInsets.getStableInsetLeft()), Math.max(rect.top, rootWindowInsets.getStableInsetTop()), Math.max(rect.right, rootWindowInsets.getStableInsetRight()), Math.max(rect.bottom, rootWindowInsets.getStableInsetBottom()));
            }
        }
        if (i7 <= 29) {
            int i10 = rect.top;
            Context context = s2Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            rect.top = Math.max(i10, identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
        }
        int i11 = i1Var.f(8).d;
        if (i11 <= rect.bottom || i11 <= org.telegram.messenger.g0.L(20.0f)) {
            s2Var.r = 0;
        } else {
            s2Var.r = i11;
        }
        s2Var.I();
        return i7 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(i7).b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            if (tL_attachMenuBot3.bot_id == j3) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String a02 = gd.a0(null, null, 2131752990, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String N0 = gd.N0(2131752989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(gd.N0(2131747637, null), new l1(i7, j3, tL_attachMenuBot, runnable));
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public static JSONObject u(h6 h6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = m6.w(-16777216, m6.w0(m6.h5, h6Var));
            y10 y10Var = new y10() { // from class: ki.a2
                @Override // org.telegram.messenger.y10
                public final Object a(Object obj) {
                    int w11 = m6.w(w10, ((Integer) obj).intValue());
                    return z10 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11))) : Integer.valueOf(w11);
                }
            };
            jSONObject.put("bg_color", y10Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", y10Var.a(Integer.valueOf(m6.w0(m6.d6, h6Var))));
            int i7 = m6.a7;
            jSONObject.put("secondary_bg_color", y10Var.a(Integer.valueOf(m6.w0(i7, h6Var))));
            jSONObject.put("text_color", y10Var.a(Integer.valueOf(m6.w0(m6.G6, h6Var))));
            jSONObject.put("hint_color", y10Var.a(Integer.valueOf(m6.w0(m6.H6, h6Var))));
            jSONObject.put("link_color", y10Var.a(Integer.valueOf(m6.w0(m6.J6, h6Var))));
            jSONObject.put("button_color", y10Var.a(Integer.valueOf(m6.w0(m6.Fi, h6Var))));
            jSONObject.put("button_text_color", y10Var.a(Integer.valueOf(m6.w0(m6.Ji, h6Var))));
            jSONObject.put("header_bg_color", y10Var.a(Integer.valueOf(m6.w0(m6.s8, h6Var))));
            jSONObject.put("accent_text_color", y10Var.a(Integer.valueOf(m6.w0(m6.q6, h6Var))));
            jSONObject.put("section_header_text_color", y10Var.a(Integer.valueOf(m6.w0(m6.L6, h6Var))));
            jSONObject.put("subtitle_text_color", y10Var.a(Integer.valueOf(m6.w0(m6.z6, h6Var))));
            jSONObject.put("destructive_text_color", y10Var.a(Integer.valueOf(m6.w0(m6.p7, h6Var))));
            jSONObject.put("section_separator_color", y10Var.a(Integer.valueOf(m6.w0(m6.d7, h6Var))));
            jSONObject.put("bottom_bar_bg_color", y10Var.a(Integer.valueOf(m6.w0(i7, h6Var))));
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void A(int i7, boolean z10) {
        Paint paint = this.R;
        int color = paint.getColor();
        this.X = true;
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.U0 = duration;
            duration.setInterpolator(nr.f);
            this.U0.addUpdateListener(new q1(this, color, i7, i10));
            this.U0.addListener(new e2(this, i7, i10));
            this.U0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f.invalidate();
        org.telegram.ui.b3 b3Var = this.Z0;
        if (b3Var != null) {
            b3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            j2 j2Var = this.x;
            if (j2Var != null) {
                j2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        this.g0 = z12 && !mp.u1(this.I).J6 && bz.o() >= 2;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.o0;
        j2 j2Var = this.x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.h3(aVar, 2500L);
            }
            h2Var.setParentRenderNode(this.g0 ? j2Var.getRenderNode() : null);
        }
        this.k0 = j2Var.getWidth();
        this.l0 = j2Var.getHeight();
        this.V0 = false;
        o2 o2Var = this.n0;
        k2 k2Var = this.E;
        p2 p2Var = this.Y;
        if (!z11) {
            this.j0 = false;
            this.h0 = z10 ? 1.0f : 0.0f;
            this.i0 = 0.0f;
            I();
            L();
            p2Var.setVisibility(z10 ? 8 : 0);
            p2Var.setAlpha(1.0f - this.h0);
            p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.h0);
            o2Var.setTranslationX(0.0f);
            h2Var.setAlpha(this.h0);
            k2Var.setViewPortHeightOffset(0.0f);
            k2Var.n(true, true);
            H();
            return;
        }
        I();
        L();
        H();
        if (!org.telegram.messenger.g0.Q1() || org.telegram.messenger.g0.E || org.telegram.messenger.g0.P1()) {
            f10 = 0.0f;
        } else {
            int i7 = org.telegram.messenger.g0.q.x;
            f10 = (i7 - ((int) (Math.min(i7, r12.y) * 0.8f))) / 2.0f;
        }
        float f11 = z10 ? this.n.left + f10 : (-r13) - f10;
        if (!z10) {
            f10 = -f10;
        }
        float translationY = z10 ? j2Var.getTranslationY() : -org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight = z10 ? -org.telegram.messenger.g0.L(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        r1.g gVar = j2Var.w;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = j2Var.H;
        if (gVar2 != null) {
            gVar2.d();
        }
        j2Var.setSwipeOffsetAnimationDisallowed(true);
        p2Var.setVisibility(0);
        if (z10) {
            j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
        } else {
            j2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
        }
        j2Var.c();
        j2Var.invalidate();
        this.i0 = 0.0f;
        float f12 = z10 ? 0.0f : 1.0f;
        this.h0 = f12;
        p2Var.setAlpha(1.0f - f12);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.h0);
        j2Var.setTranslationY(org.telegram.messenger.g0.T1(translationY, currentActionBarHeight, this.i0));
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.i0));
        o2Var.setTranslationX(org.telegram.messenger.g0.T1(f10, 0.0f, this.i0));
        h2Var.setAlpha(this.h0);
        this.f.invalidate();
        k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - currentActionBarHeight);
        k2Var.n(false, false);
        this.j0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W0 = ofFloat;
        float f13 = f11;
        ofFloat.addUpdateListener(new f2(this, z10, translationY, currentActionBarHeight, f13, f10));
        this.W0.addListener(new g2(this, z10, currentActionBarHeight2, f13));
        this.W0.setDuration(280L);
        this.W0.setInterpolator(nr.h);
        this.W0.start();
    }

    public final void D(int i7, boolean z10) {
        int i10 = 0;
        this.J0 = false;
        int i11 = this.T;
        o2 o2Var = this.n0;
        Paint paint = o2Var.a;
        o2Var.e.b = i7;
        paint.setColor(i7);
        int i12 = 1;
        if (!z10) {
            o2Var.d.a(i7, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(nr.f);
            duration.addUpdateListener(new q1(this, i11, i7, i12));
            duration.addListener(new h2(this, i11, i7, i10));
            duration.start();
        } else {
            this.T = i7;
            l();
        }
        org.telegram.messenger.g0.s3(this, this.T, false, null);
    }

    public final void E(boolean z10) {
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.S0 - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S0, z10 ? 1.0f : 0.0f);
        this.T0 = ofFloat;
        ofFloat.addListener(new h7(16, this, z10));
        this.T0.addUpdateListener(new r1(this, 0));
        this.T0.setInterpolator(nr.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i7 = m6.G6;
            h6 h6Var = this.G;
            int w02 = m6.w0(i7, h6Var);
            p2 p2Var = this.Y;
            p2Var.setTitleColor(w02);
            p2Var.G(m6.w0(i7, h6Var), false);
            p2Var.F(m6.w0(m6.u8, h6Var), false);
            p2Var.I(m6.w0(m6.G8, h6Var), false);
            p2Var.J(m6.w0(m6.E8, h6Var), false, false);
            p2Var.J(m6.w0(m6.F8, h6Var), true, false);
            p2Var.K(m6.w0(m6.I5, h6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        gc gcVar;
        boolean z10;
        g0 c10 = g0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c10.e;
        f0 f0Var = c10.f;
        boolean z11 = true;
        if (f0Var == null) {
            gc gcVar2 = this.p0;
            if (gcVar2 != null) {
                gcVar2.b();
                this.p0 = null;
            }
        } else if ((!f0Var.c() || f0Var.l) && !f0Var.k) {
            e0 e0Var = this.q0;
            if (e0Var != null) {
                this.Q0 = f0Var;
                if (e0Var.c(f0Var)) {
                    this.p0 = null;
                }
            }
        } else {
            if (this.Q0 != f0Var && (gcVar = this.p0) != null) {
                gcVar.b();
                this.p0 = null;
            }
            gc gcVar3 = this.p0;
            if (gcVar3 == null || !gcVar3.l) {
                this.Q0 = f0Var;
                e0 e0Var2 = new e0(getContext(), this.G);
                this.q0 = e0Var2;
                gc f10 = gc.f(this.r0, e0Var2, 5000);
                this.p0 = f10;
                f10.k(true);
            }
            if (this.q0.c(f0Var)) {
                this.p0 = null;
            }
            f0Var.k = false;
            f0Var.l = true;
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) entry.getValue();
            f0 f0Var2 = (f0) entry.getKey();
            y0Var.setText(f0Var2.c);
            if (f0Var2.c()) {
                Pair b10 = f0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            } else {
                y0Var.setSubtext(org.telegram.messenger.g0.i0(f0Var2.g, false, false));
            }
            if (f0Var2.c()) {
                y0Var.setRightIcon(R.drawable.msg_close);
                y0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (f0Var2.i) {
                y0Var.setVisibility(8);
            } else {
                y0Var.setRightIcon(0);
                y0Var.b.setPadding(0, 0, 0, 0);
            }
            y0Var.setOnClickListener(new ai.x2(27, this, f0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.c0;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            if (((f0) obj).c()) {
                z10 = true;
                break;
            }
        }
        if (g2Var.e != z10) {
            g2Var.e = z10;
            g2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                z11 = false;
                break;
            }
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((f0) obj2).c()) {
                break;
            }
        }
        this.o0.setDownloading(z11);
    }

    public final void H() {
        e0 e0Var = this.q0;
        if (e0Var == null) {
            return;
        }
        if (this.f0) {
            e0Var.setArrow(org.telegram.messenger.g0.W1(this.h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.c > 0.5f) {
            e0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            e0Var.setArrow(-1);
        }
    }

    public final void I() {
        org.telegram.messenger.h2 h2Var = this.o0;
        Rect rect = this.n;
        h2Var.setInsets(rect);
        boolean z10 = this.f0;
        k2 k2Var = this.E;
        r2 r2Var = this.f;
        o2 o2Var = this.n0;
        if (z10) {
            int i7 = (o2Var == null || o2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.r <= i7 && (o2Var == null || o2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int L = org.telegram.messenger.g0.L(46.0f);
            k2Var.Q(rect2, false);
            k2Var.P(L, false);
            r2Var.setPadding(0, 0, 0, Math.max(this.r, i7));
        } else {
            k2Var.Q(new Rect(0, 0, 0, 0), false);
            k2Var.P(0, false);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = this.r;
            org.telegram.ui.ActionBar.f3 f3Var = this.s;
            r2Var.setPadding(i10, 0, i11, Math.max(i12, (f3Var != null ? f3Var.I : 0) + rect.bottom));
        }
        this.y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z11 = this.f0;
        int i13 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.Z;
        layoutParams.leftMargin = i13;
        layoutParams.rightMargin = 0;
        int i14 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.s0;
        layoutParams2.leftMargin = i14;
        layoutParams2.rightMargin = !z11 ? 0 : rect.right;
        boolean z12 = this.j0;
        j2 j2Var = this.x;
        if (!z12) {
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f0) {
                j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                j2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f));
            }
            j2Var.setSwipeOffsetAnimationDisallowed(false);
            j2Var.c();
            j2Var.invalidate();
            j2Var.requestLayout();
        }
        if (j2Var != null) {
            j2Var.setFullSize(r());
        }
        o2Var.requestLayout();
        r2Var.requestLayout();
        h2Var.setVisibility(this.f0 ? 0 : 8);
    }

    public final void J() {
        boolean z10;
        if (this.W) {
            z10 = !this.U;
        } else {
            z10 = !org.telegram.messenger.g0.Q1() && i0.a.h(m6.x0(null, m6.d6, true)) >= 0.7210000157356262d && this.c >= 0.85f;
        }
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z10) {
            this.e = Boolean.valueOf(z10);
            r2 r2Var = this.f;
            int systemUiVisibility = r2Var.getSystemUiVisibility();
            r2Var.setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
    }

    public final void K() {
        org.telegram.ui.web.s0 webView;
        k2 k2Var = this.E;
        if (k2Var == null || (webView = k2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        o2 o2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i7 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z10 = this.f0;
            if (z10) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            r2 r2Var = this.f;
            if (!z10 || (((o2Var = this.n0) != null && o2Var.getTotalHeight() > 0) || r2Var.h0)) {
                r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() & (-3));
            } else {
                r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final void a(boolean z10) {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final org.telegram.ui.ActionBar.e3 c() {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3();
        e3Var.q = this.S;
        e3Var.p = this.w0;
        e3Var.n = this.W;
        e3Var.o = this.X;
        e3Var.r = this.R.getColor();
        e3Var.a = this.x0;
        k2 k2Var = this.E;
        e3Var.t = k2Var != null && k2Var.O;
        e3Var.D = m6.I.q();
        e3Var.x = k2Var != null ? k2Var.getUrlLoaded() : null;
        e3Var.e = k2Var != null && k2Var.u0;
        e3Var.f = k2Var != null ? k2Var.getTrustedOrigin() : null;
        j2 j2Var = this.x;
        e3Var.j = (j2Var != null && j2Var.getSwipeOffsetY() < 0.0f) || this.z0 || r() || this.f0;
        e3Var.z = this.f0;
        e3Var.A = this.g0;
        Boolean bool = this.B0;
        e3Var.B = bool == null ? this.A0 : bool.booleanValue();
        e3Var.k = j2Var != null ? j2Var.getOffsetY() : Float.MAX_VALUE;
        e3Var.C = this.C0;
        e3Var.u = this.y0;
        e3Var.y = this.t0;
        e3Var.v = this.d0;
        e3Var.l = j2Var == null || j2Var.N;
        e3Var.w = this.n0.e;
        e3Var.s = this.T;
        v0 v0Var = this.D0;
        if (v0Var != null) {
            v0Var.b();
        }
        e3Var.K = this.D0;
        org.telegram.ui.web.s0 webView = k2Var != null ? k2Var.getWebView() : null;
        if (webView != null) {
            k2Var.M();
            e3Var.b = webView;
            e3Var.d = k2Var.getBotProxy();
            e3Var.g = webView.getWidth();
            e3Var.h = webView.getHeight();
            webView.onPause();
        }
        boolean z10 = this.X0;
        e3Var.G = z10;
        if (z10) {
            e3Var.H = this.Y0;
        }
        e3Var.L = this.E0;
        this.F0 = e3Var;
        return e3Var;
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final org.telegram.ui.ActionBar.k3 d() {
        return this.f;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
                return;
            }
            return;
        }
        if (i7 != ks.q4) {
            if (i7 == ks.M3) {
                G();
            }
        } else {
            this.f.invalidate();
            this.E.n.b(m6.w0(m6.d6, this.G), ks.j2);
            F();
            J();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final int e(int i7) {
        return i0.a.f(this.S0, i7, this.T);
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        if (botappsettings == null) {
            return;
        }
        boolean q10 = m6.I.q();
        int i7 = botappsettings.flags;
        boolean z11 = ((q10 ? 4 : 2) & i7) != 0;
        if ((i7 & (q10 ? 16 : 8)) != 0) {
            y((q10 ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z10);
        }
        if (z11) {
            A((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
            D((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.R0 && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.F(true, true, true);
        }
        r2 r2Var = this.f;
        if (r2Var != null) {
            r2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Z0 = b3Var;
            this.x.addView(b3Var, ma.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new x1(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.X3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        LaunchActivity launchActivity;
        if (this.e0) {
            return;
        }
        if (this.M0 != null) {
            z10 = false;
        }
        this.e0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.v0);
        ks.f(this.I).n(this, ks.z1);
        ks.f(this.I).n(this, ks.M3);
        ks.e().n(this, ks.q4);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.x0 == null)) {
            z10 = false;
        }
        if (z10) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.m.i = 0.0f;
                gVar.h();
            }
            LaunchActivity.H1.x0.b(this);
        } else {
            o2 o2Var = this.n0;
            if (o2Var != null) {
                o2Var.animate().translationY(o2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(nr.h).start();
            }
            this.E.h();
            j2 j2Var = this.x;
            int height = j2Var.getHeight() + (o2Var != null ? o2Var.getTotalHeight() : 0);
            Rect rect = this.n;
            j2Var.f(this.f.Q() + height + rect.top + rect.bottom + (r() ? org.telegram.messenger.g0.L(200.0f) : 0), true, new s1(this, 0));
        }
        b1.remove(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, c1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.m = hVar;
            this.d = gVar;
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.u0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.E.D()) {
                return;
            }
            o(true);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        o2 o2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags;
        int i11 = i10 & (-3);
        attributes.flags = i11;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i7 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        r2 r2Var = this.f;
        r2Var.setFitsSystemWindows(true);
        r2Var.setSystemUiVisibility(1792);
        r2Var.setOnApplyWindowInsetsListener(new w1(this, 0));
        if (!this.f0 || ((o2Var = this.n0) != null && o2Var.getTotalHeight() > 0)) {
            r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() & (-3));
        } else {
            r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() | 2);
        }
        if (i7 >= 26) {
            org.telegram.messenger.g0.m3(this, i0.a.h(this.T) >= 0.7210000157356262d);
        }
        ks.e().c(this, ks.q4);
        ks.f(this.I).c(this, ks.M3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        r1.g gVar = this.d;
        if (gVar != null) {
            gVar.d();
            this.d = null;
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.u0);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.u0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        return ownerActivity == null ? org.telegram.messenger.g0.W(getContext()) : ownerActivity;
    }

    public final boolean q() {
        e4 e4Var = this.x0;
        return e4Var != null && e4Var.g == 6;
    }

    public final boolean r() {
        if (this.f0) {
            return true;
        }
        Boolean bool = this.B0;
        return bool == null ? this.A0 : bool.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final void release() {
        if (this.R0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        E(false);
    }

    public final void s() {
        String str;
        boolean z10;
        if (this.x0 == null) {
            return;
        }
        long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.x0.r));
        TLRPC.TL_topPeer tL_topPeer = null;
        this.B0 = null;
        TLObject tLObject = this.x0.q;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.L = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z10 = tL_webViewResultUrl.same_origin;
            this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z11 = this.G0;
            if (!z11) {
                C(tL_webViewResultUrl.fullscreen, !z11, this.g0);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.L = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.L = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            } else {
                str = null;
            }
            z10 = false;
        }
        if (str != null && !this.G0) {
            ri d02 = ri.d0(this.I);
            long j3 = this.x0.c;
            TLRPC.User c22 = d02.getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null && c22.bot) {
                int max2 = d02.getUserConfig().H != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - d02.getUserConfig().H) : 60;
                int i7 = 0;
                while (true) {
                    if (i7 >= d02.m1.size()) {
                        break;
                    }
                    TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) d02.m1.get(i7);
                    if (tL_topPeer2.peer.user_id == j3) {
                        tL_topPeer = tL_topPeer2;
                        break;
                    }
                    i7++;
                }
                if (tL_topPeer == null) {
                    tL_topPeer = new TLRPC.TL_topPeer();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_topPeer.peer = tL_peerUser;
                    tL_peerUser.user_id = j3;
                    d02.m1.add(tL_topPeer);
                }
                tL_topPeer.rating = Math.exp(max2 / d02.getMessagesController().c3) + tL_topPeer.rating;
                Collections.sort(d02.m1, new jg.w(20));
                if (d02.m1.size() > 20) {
                    a8.p0.z(1, d02.m1);
                }
                d02.getMessagesStorage().a.c(new bh(d02, j3, 2, tL_topPeer.rating));
                d02.getNotificationCenter().k(ks.V0, new Object[0]);
            }
            this.E.t(this.I, str, z10);
        }
        org.telegram.messenger.g0.h3(this.v0, max);
        j2 j2Var = this.x;
        if (j2Var != null) {
            j2Var.setFullSize(r());
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            E(true);
            r2 r2Var = this.f;
            r2Var.setAlpha(0.0f);
            r2Var.addOnLayoutChangeListener(new kg.m(this, 1));
            super.show();
            this.R0 = false;
            b1.add(this);
        }
    }

    public final void t(boolean z10) {
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (this.a1) {
            if (z10) {
                d1++;
            } else {
                d1--;
            }
        }
        if (d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    public final boolean v() {
        if (!this.t0) {
            o(false);
            return true;
        }
        TLRPC.User c22 = mp.u1(this.I).c2(Long.valueOf(this.J));
        String m10 = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = m10;
        t1Var.U = gd.N0(2131752905, null);
        alertDialog$Builder.k(gd.N0(2131752904, null), new t1(this));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        t1Var.show();
        ((TextView) t1Var.d(-1)).setTextColor(m6.w0(m6.q7, this.G));
        return false;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i7;
        ArrayList arrayList;
        int i10;
        boolean q10 = q();
        TLRPC.User c22 = mp.u1(this.I).c2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = ri.d0(this.I).b.bots;
        int size = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == this.J) {
                break;
            }
        }
        a70 a70Var = this.P0;
        if (a70Var != null) {
            a70Var.v();
        }
        a70 H = a70.H(this.f, this.G, this.f0 ? this.o0 : this.b0, true);
        this.P0 = H;
        ArrayList arrayList3 = g0.c(getContext(), this.I, this.J).e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (arrayList3.isEmpty()) {
            i7 = -1;
        } else {
            a70 K = H.K();
            K.c(R.drawable.msg_arrow_back, gd.N0(2131753753, null), new hq0(H, 27), false);
            K.k();
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList3.get(i12);
                i12++;
                f0 f0Var = (f0) obj;
                String str = f0Var.c;
                ai.n nVar = new ai.n(22);
                h6 h6Var = K.d;
                if (K.e == null) {
                    arrayList = arrayList3;
                    i10 = size2;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, K.e, K.d, false, false);
                    arrayList = arrayList3;
                    i10 = size2;
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    y0Var.setText(str);
                    y0Var.setSubtext("");
                    Integer num = K.m0;
                    if (num == null && K.n0 == null) {
                        y0Var.c(m6.E8, m6.F8);
                    } else {
                        int intValue = num != null ? num.intValue() : m6.w0(m6.E8, h6Var);
                        Integer num2 = K.n0;
                        y0Var.d(intValue, num2 != null ? num2.intValue() : m6.w0(m6.F8, h6Var));
                    }
                    Integer num3 = K.o0;
                    if (num3 != null) {
                        y0Var.setSelectorColor(num3.intValue());
                    } else {
                        y0Var.h(0.12f, m6.E8);
                    }
                    y0Var.setOnClickListener(new org.telegram.ui.Components.o0(K, nVar));
                    int i13 = K.V;
                    if (i13 > 0) {
                        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
                        K.r(y0Var, ma.o(K.V, -2));
                    } else {
                        K.r(y0Var, ma.o(-1, -2));
                        hashMap.put(f0Var, K.z());
                        size2 = i10;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(f0Var, K.z());
                size2 = i10;
                arrayList3 = arrayList;
            }
            i7 = -1;
            G();
            K.V = org.telegram.messenger.g0.L(180.0f);
            H.c(R.drawable.menu_download_round, gd.N0(2131753091, null), new y5(H, K, 1), false);
            H.k();
        }
        H.l(R.drawable.msg_bot, gd.N0(2131752900, null), new s1(this, 9), this.M0 == null && !q10);
        int i14 = 10;
        H.l(R.drawable.msg_settings, gd.N0(2131752885, null), new s1(this, i14), this.M0 == null && this.d0);
        H.c(R.drawable.msg_retry, gd.N0(2131752899, null), new ch.k(i14, this, q10), false);
        H.l(R.drawable.msg_home, gd.N0(2131754387, null), new s1(this, 11), this.M0 == null && c22 != null && c22.bot_has_main_app);
        H.l(R.drawable.menu_intro, gd.N0(2131752882, null), new s1(this, 12), this.M0 == null && !q10);
        H.l(R.drawable.msg_report, gd.N0(2131752898, null), new s1(this, 13), this.M0 == null && !q10);
        H.l(R.drawable.msg_delete, gd.N0(2131752903, null), new s1(this, 14), this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.S != m6.x0(null, m6.d6, false)) {
            int i15 = org.telegram.messenger.g0.B(this.S) >= 0.721f ? i7 : -15198183;
            int i16 = org.telegram.messenger.g0.B(i15) >= 0.721f ? -16777216 : i7;
            int r12 = m6.r1(0.85f, i16);
            int r13 = m6.r1(0.1f, i16);
            H.Q(i15);
            for (int i17 = 0; i17 < H.y(); i17++) {
                View x10 = H.x(i17);
                if (x10 instanceof org.telegram.ui.ActionBar.y0) {
                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) x10;
                    y0Var2.d(i16, r12);
                    y0Var2.setSelectorColor(r13);
                }
            }
        }
        H.W(5);
        H.b0(-this.n.right, 0.0f);
        H.X = true;
        H.t = false;
        H.s = 0;
        H.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(org.telegram.ui.ActionBar.g2 g2Var, e4 e4Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        TLRPC.InputPeer p12;
        TLRPC.InputPeer l1;
        boolean z10;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        this.x0 = e4Var;
        int i7 = e4Var.a;
        this.I = i7;
        this.K = e4Var.b;
        this.J = e4Var.c;
        this.M = e4Var.h;
        this.N = e4Var.i;
        this.O = e4Var.e;
        int i10 = 1;
        Object[] objArr = e4Var.g == 6;
        TLRPC.User c22 = objArr != false ? null : mp.u1(i7).c2(Long.valueOf(this.J));
        CharSequence q10 = objArr != false ? e4Var.e : o10.q(c22);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        p2 p2Var = this.Y;
        p2Var.setTitle(q10);
        TLRPC.UserFull d2 = objArr != false ? null : mp.u1(this.I).d2(this.J);
        h6 h6Var = this.G;
        if ((c22 != null && c22.verified) || (d2 != null && (user = d2.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            t6.x(p2Var.getTitleTextView(), this.N0, m6.Fi, h6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(ks.e4);
            p2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            p2Var.getTitleTextView().i(new hi.k3(this, i10));
        }
        org.telegram.messenger.h2 h2Var = this.o0;
        if (h2Var != null) {
            String q11 = objArr != false ? e4Var.e : o10.q(c22);
            Object[] objArr2 = c22 != null && c22.verified;
            h2Var.U = new xy0(q11, 13.0f, org.telegram.messenger.g0.o());
            if (objArr2 == true) {
                h2Var.V = h2Var.getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
            } else {
                h2Var.V = null;
                h2Var.W = null;
            }
        }
        org.telegram.ui.ActionBar.y s5 = p2Var.s();
        s5.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(this.I).b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                yVar = s5;
                userFull = d2;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            yVar = s5;
            userFull = d2;
            if (tL_attachMenuBot.bot_id == this.J) {
                break;
            }
            s5 = yVar;
            d2 = userFull;
        }
        if (!this.G0 && objArr == false) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo == null || (botappsettings = botInfo.app_settings) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    k(botappsettings, false);
                }
                z11 = true;
            } else {
                z10 = false;
                z11 = true;
                mp.u1(this.I).c3(c22, 0, true, new v1(this, 1 == true ? 1 : 0));
            }
            if (e4Var.p) {
                C(z11, z10, this.g0);
            }
        }
        if (this.M0 == null) {
            yVar2 = yVar;
            yVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var2 = new org.telegram.messenger.g2(getContext());
        this.c0 = g2Var2;
        org.telegram.ui.ActionBar.q0 d = yVar2.d(0, g2Var2);
        this.b0 = d;
        d.setOnClickListener(new x1(this, 1));
        p2Var.setActionBarMenuOnItemClick(new d2(this, 0));
        JSONObject u10 = u(h6Var, false);
        k2 k2Var = this.E;
        k2Var.setBotUser(c22);
        if (objArr == false) {
            k2Var.s(this.I, this.J);
            TLRPC.User user2 = e4Var.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ri.d0(this.I);
                if (!ri.C0(ri.f2, this.J)) {
                    if (user2 == null) {
                        user2 = mp.u1(this.I).c2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            ri.d0(this.I).o1(fc.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (e4Var.q != null) {
            s();
            return;
        }
        int i12 = e4Var.g;
        int i13 = ks.z1;
        int i14 = 4;
        int i15 = 2;
        switch (i12) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = mp.u1(this.I).l1(this.K);
                tL_messages_requestWebView.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = e4Var.o;
                tL_messages_requestWebView.fullscreen = e4Var.p;
                String str = e4Var.f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    zy.C(this.I);
                    int i16 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i16;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = mp.u1(this.I).l1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = mp.u1(this.I).l1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new c2(this, 3));
                ks.f(this.I).c(this, i13);
                break;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (e4Var.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                tL_messages_requestSimpleWebView.from_side_menu = (e4Var.n & 2) != 0;
                tL_messages_requestSimpleWebView.compact = e4Var.o;
                tL_messages_requestSimpleWebView.fullscreen = e4Var.p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(e4Var.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = e4Var.f;
                }
                if (!TextUtils.isEmpty(e4Var.l)) {
                    tL_messages_requestSimpleWebView.start_param = e4Var.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new c2(this, i15));
                break;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestWebView2.peer = mp.u1(this.I).l1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = e4Var.o;
                tL_messages_requestWebView2.fullscreen = e4Var.p;
                tL_messages_requestWebView2.url = e4Var.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new c2(this, 1));
                ks.f(this.I).c(this, i13);
                break;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = e4Var.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = e4Var.k;
                tL_messages_requestAppWebView.platform = "android";
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    p12 = bnVar.j() != null ? mp.p1(bnVar.j()) : mp.n1(bnVar.e);
                } else {
                    p12 = mp.p1(e4Var.m);
                }
                tL_messages_requestAppWebView.peer = p12;
                tL_messages_requestAppWebView.compact = e4Var.o;
                tL_messages_requestAppWebView.fullscreen = e4Var.p;
                if (!TextUtils.isEmpty(e4Var.l)) {
                    tL_messages_requestAppWebView.start_param = e4Var.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new c2(this, i14), 66);
                break;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = mp.u1(this.I).q1(e4Var.c);
                tL_messages_requestMainWebView.platform = "android";
                if (g2Var instanceof bn) {
                    bn bnVar2 = (bn) g2Var;
                    l1 = bnVar2.j() != null ? mp.p1(bnVar2.j()) : mp.n1(bnVar2.e);
                } else {
                    l1 = mp.u1(this.I).l1(e4Var.b);
                }
                tL_messages_requestMainWebView.peer = l1;
                tL_messages_requestMainWebView.compact = e4Var.o;
                tL_messages_requestMainWebView.fullscreen = e4Var.p;
                if (!TextUtils.isEmpty(e4Var.l)) {
                    tL_messages_requestMainWebView.start_param = e4Var.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new c2(this, 5), 66);
                break;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = e4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new d7(this, 20), 66);
                break;
            case 6:
                if (!this.G0) {
                    k2Var.t(this.I, e4Var.f, false);
                    break;
                }
                break;
        }
    }

    public final void y(final int i7, boolean z10, boolean z11) {
        final int i10 = this.S;
        m6.b(0.35f, -0.1f, i7);
        final p1 p1Var = new p1();
        int i11 = this.W ? this.S : 0;
        SparseIntArray sparseIntArray = p1Var.a;
        h6 h6Var = this.G;
        p1Var.c(sparseIntArray, i11, h6Var);
        this.W = z10;
        this.U = i0.a.h(i7) < 0.7210000157356262d;
        p1Var.c(p1Var.b, this.W ? i7 : 0, h6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(nr.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ki.y1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i10, i7);
                    s2 s2Var = s2.this;
                    s2Var.S = f10;
                    s2Var.l();
                    r2 r2Var = s2Var.f;
                    r2Var.invalidate();
                    p2 p2Var = s2Var.Y;
                    p2Var.setBackgroundColor(s2Var.S);
                    p1 p1Var2 = p1Var;
                    p1Var2.b(p2Var, floatValue);
                    s2Var.a = p1Var2.a(m6.zj);
                    r2Var.invalidate();
                }
            });
            duration.addListener(new i2(this, i10, i7, p1Var));
            duration.start();
        } else {
            this.S = i7;
            l();
            r2 r2Var = this.f;
            r2Var.invalidate();
            int i12 = this.S;
            p2 p2Var = this.Y;
            p2Var.setBackgroundColor(i12);
            p1Var.b(p2Var, 1.0f);
            this.a = p1Var.a(m6.zj);
            r2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.a1 == z10) {
            return;
        }
        this.a1 = z10;
        if (z10) {
            if (this.E0) {
                d1++;
            }
        } else if (this.E0) {
            d1--;
        }
        if (d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final /* synthetic */ void b(boolean z10) {
    }
}

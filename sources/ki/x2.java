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
import bi.i6;
import bi.v4;
import c8.ja;
import hi.q4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.g5;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.zg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.fq0;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class x2 extends Dialog implements is, org.telegram.ui.ActionBar.g3 {
    public static final HashSet b1 = new HashSet();
    public static final mt0 c1;
    public static int d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public w0 D0;
    public final p2 E;
    public boolean E0;
    public final v2 F;
    public org.telegram.ui.ActionBar.b3 F0;
    public final e6 G;
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
    public p51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public m60 P0;
    public final Paint Q;
    public h0 Q0;
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
    public final u2 Y;
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
    public final w2 f;
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
    public final t2 n0;
    public final org.telegram.messenger.h2 o0;
    public xb p0;
    public g0 q0;
    public int r;
    public final FrameLayout r0;
    public final org.telegram.ui.ActionBar.c3 s;
    public final FrameLayout.LayoutParams s0;
    public boolean t0;
    public final fc0 u0;
    public final x1 v0;
    public final r7 w;
    public int w0;
    public final o2 x;
    public k4 x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        mt0 mt0Var = new mt0(new i0.b(15), new i0.b(16));
        mt0Var.c = 100.0f;
        c1 = mt0Var;
        d1 = 0;
    }

    public x2(Context context, e6 e6Var) {
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
        this.v0 = new x1(this, i10);
        this.w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.a1 = false;
        this.G = e6Var;
        int x02 = j6.x0(null, j6.zj, false);
        this.b = x02;
        this.a = x02;
        o2 o2Var = new o2(i7, context, this);
        this.x = o2Var;
        o2Var.setAllowFullSizeSwipe(true);
        o2Var.setShouldWaitWebViewScroll(true);
        int i11 = j6.d6;
        p2 p2Var = new p2(this, context, e6Var, j6.w0(i11, e6Var), 0);
        this.E = p2Var;
        p2Var.setOnVerifiedAge(this.M0);
        p2Var.setDelegate(new s2(this, context, e6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.S = j6.w0(i11, e6Var);
        int w02 = j6.w0(j6.a7, e6Var);
        this.T = w02;
        org.telegram.messenger.g0.t3(this, w02, false, null);
        w2 w2Var = new w2(this, context);
        this.f = w2Var;
        w2Var.setDelegate(new z1(this, i7));
        FrameLayout.LayoutParams e10 = ja.e(-1, -1, 49);
        this.y = e10;
        w2Var.addView(o2Var, e10);
        t2 t2Var = new t2(this, getContext(), e6Var);
        this.n0 = t2Var;
        t2Var.setOnButtonClickListener(new a2(this, i7));
        t2Var.setOnResizeListener(new x1(this, 3));
        w2Var.addView(t2Var, ja.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        boolean z10 = !np.s1(this.I).H6 && gz.o() >= 2;
        this.g0 = z10;
        h2Var.setParentRenderNode(z10 ? o2Var.getRenderNode() : null);
        w2Var.addView(h2Var, ja.e(-1, -1, ns.E1));
        int i12 = 4;
        h2Var.setOnCloseClickListener(new x1(this, i12));
        h2Var.setOnCollapseClickListener(new x1(this, 5));
        h2Var.setOnMenuClickListener(new x1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        FrameLayout.LayoutParams e11 = ja.e(-1, ns.e3, 55);
        this.s0 = e11;
        w2Var.addView(frameLayout, e11);
        this.a0 = getContext().getDrawable(R.drawable.header_shadow).mutate();
        u2 u2Var = new u2(context, e6Var);
        this.Y = u2Var;
        u2Var.setBackgroundColor(0);
        u2Var.setBackButtonImage(R.drawable.ic_close_white);
        F();
        u2Var.setActionBarMenuOnItemClick(new i2(this, i10));
        u2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = ja.e(-1, -2, 49);
        this.Z = e12;
        w2Var.addView(u2Var, e12);
        v2 v2Var = new v2(context, e6Var);
        this.F = v2Var;
        w2Var.addView(v2Var, ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        p2Var.setWebViewProgressListener(new i6(this, i12));
        o2Var.addView(p2Var, ja.c(-1.0f, -1));
        o2Var.setScrollListener(new x1(this, 7));
        o2Var.setScrollEndListener(new x1(this, 8));
        o2Var.setDelegate(new y1(this));
        o2Var.setIsKeyboardVisible(new y1(this));
        fc0 fc0Var = new fc0(context);
        this.u0 = fc0Var;
        w2Var.addView(fc0Var, ja.c(-1.0f, -1));
        setContentView(w2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.c3 N = launchActivity != null ? launchActivity.N() : null;
        this.s = N;
        if (N != null) {
            kg.j1 j1Var = new kg.j1(w2Var, 9);
            x1 x1Var = new x1(this, 2);
            N.J.add(j1Var);
            N.K.add(x1Var);
            this.w = new r7(N);
        }
    }

    public static /* synthetic */ void f(x2 x2Var) {
        if (x2Var.R0) {
            return;
        }
        super.dismiss();
        x2Var.R0 = true;
    }

    public static WindowInsets h(x2 x2Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).a;
        i0.c f10 = h1Var.f(2);
        x2Var.h.set(f10.a, f10.b, f10.c, f10.d);
        i0.c f11 = h1Var.f(647);
        Rect rect = x2Var.n;
        rect.set(Math.max(f11.a, windowInsets.getStableInsetLeft()), Math.max(f11.b, windowInsets.getStableInsetTop()), Math.max(f11.c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 29) {
            Activity W = org.telegram.messenger.g0.W(x2Var.getContext());
            WindowInsets rootWindowInsets = (W == null || W.getWindow() == null) ? null : W.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                rect.set(Math.max(rect.left, rootWindowInsets.getStableInsetLeft()), Math.max(rect.top, rootWindowInsets.getStableInsetTop()), Math.max(rect.right, rootWindowInsets.getStableInsetRight()), Math.max(rect.bottom, rootWindowInsets.getStableInsetBottom()));
            }
        }
        if (i7 <= 29) {
            int i10 = rect.top;
            Context context = x2Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            rect.top = Math.max(i10, identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
        }
        int i11 = h1Var.f(8).d;
        if (i11 <= rect.bottom || i11 <= org.telegram.messenger.g0.L(20.0f)) {
            x2Var.r = 0;
        } else {
            x2Var.r = i11;
        }
        x2Var.I();
        return i7 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(i7).b.bots;
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
        String a02 = hd.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = hd.M0(2131753001, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(hd.M0(2131747831, null), new o1(i7, j3, tL_attachMenuBot, runnable));
        i5.c.x(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(e6 e6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = j6.w(-16777216, j6.w0(j6.h5, e6Var));
            a20 a20Var = new a20() { // from class: ki.f2
                @Override // org.telegram.messenger.a20
                public final Object a(Object obj) {
                    int w11 = j6.w(w10, ((Integer) obj).intValue());
                    return z10 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11))) : Integer.valueOf(w11);
                }
            };
            jSONObject.put("bg_color", a20Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", a20Var.a(Integer.valueOf(j6.w0(j6.d6, e6Var))));
            int i7 = j6.a7;
            jSONObject.put("secondary_bg_color", a20Var.a(Integer.valueOf(j6.w0(i7, e6Var))));
            jSONObject.put("text_color", a20Var.a(Integer.valueOf(j6.w0(j6.G6, e6Var))));
            jSONObject.put("hint_color", a20Var.a(Integer.valueOf(j6.w0(j6.H6, e6Var))));
            jSONObject.put("link_color", a20Var.a(Integer.valueOf(j6.w0(j6.J6, e6Var))));
            jSONObject.put("button_color", a20Var.a(Integer.valueOf(j6.w0(j6.Fi, e6Var))));
            jSONObject.put("button_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.Ji, e6Var))));
            jSONObject.put("header_bg_color", a20Var.a(Integer.valueOf(j6.w0(j6.s8, e6Var))));
            jSONObject.put("accent_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.q6, e6Var))));
            jSONObject.put("section_header_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.L6, e6Var))));
            jSONObject.put("subtitle_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.z6, e6Var))));
            jSONObject.put("destructive_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.p7, e6Var))));
            jSONObject.put("section_separator_color", a20Var.a(Integer.valueOf(j6.w0(j6.d7, e6Var))));
            jSONObject.put("bottom_bar_bg_color", a20Var.a(Integer.valueOf(j6.w0(i7, e6Var))));
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
            duration.setInterpolator(er.f);
            this.U0.addUpdateListener(new v1(this, color, i7, i10));
            this.U0.addListener(new j2(this, i7, i10));
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
            o2 o2Var = this.x;
            if (o2Var != null) {
                o2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        this.g0 = z12 && !np.s1(this.I).H6 && gz.o() >= 2;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.o0;
        o2 o2Var = this.x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.i3(aVar, 2500L);
            }
            h2Var.setParentRenderNode(this.g0 ? o2Var.getRenderNode() : null);
        }
        this.k0 = o2Var.getWidth();
        this.l0 = o2Var.getHeight();
        this.V0 = false;
        t2 t2Var = this.n0;
        p2 p2Var = this.E;
        u2 u2Var = this.Y;
        if (!z11) {
            this.j0 = false;
            this.h0 = z10 ? 1.0f : 0.0f;
            this.i0 = 0.0f;
            I();
            L();
            u2Var.setVisibility(z10 ? 8 : 0);
            u2Var.setAlpha(1.0f - this.h0);
            u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.h0);
            t2Var.setTranslationX(0.0f);
            h2Var.setAlpha(this.h0);
            p2Var.setViewPortHeightOffset(0.0f);
            p2Var.n(true, true);
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
        float translationY = z10 ? o2Var.getTranslationY() : -org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight = z10 ? -org.telegram.messenger.g0.L(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        r1.g gVar = o2Var.w;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = o2Var.H;
        if (gVar2 != null) {
            gVar2.d();
        }
        o2Var.setSwipeOffsetAnimationDisallowed(true);
        u2Var.setVisibility(0);
        if (z10) {
            o2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
        } else {
            o2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
        }
        o2Var.c();
        o2Var.invalidate();
        this.i0 = 0.0f;
        float f12 = z10 ? 0.0f : 1.0f;
        this.h0 = f12;
        u2Var.setAlpha(1.0f - f12);
        u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.h0);
        o2Var.setTranslationY(org.telegram.messenger.g0.T1(translationY, currentActionBarHeight, this.i0));
        o2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.i0));
        t2Var.setTranslationX(org.telegram.messenger.g0.T1(f10, 0.0f, this.i0));
        h2Var.setAlpha(this.h0);
        this.f.invalidate();
        p2Var.setViewPortHeightOffset(o2Var.getTranslationY() - currentActionBarHeight);
        p2Var.n(false, false);
        this.j0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W0 = ofFloat;
        float f13 = f11;
        ofFloat.addUpdateListener(new k2(this, z10, translationY, currentActionBarHeight, f13, f10));
        this.W0.addListener(new l2(this, z10, currentActionBarHeight2, f13));
        this.W0.setDuration(280L);
        this.W0.setInterpolator(er.h);
        this.W0.start();
    }

    public final void D(int i7, boolean z10) {
        int i10 = 0;
        this.J0 = false;
        int i11 = this.T;
        t2 t2Var = this.n0;
        Paint paint = t2Var.a;
        t2Var.e.b = i7;
        paint.setColor(i7);
        int i12 = 1;
        if (!z10) {
            t2Var.d.a(i7, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(er.f);
            duration.addUpdateListener(new v1(this, i11, i7, i12));
            duration.addListener(new m2(this, i11, i7, i10));
            duration.start();
        } else {
            this.T = i7;
            l();
        }
        org.telegram.messenger.g0.t3(this, this.T, false, null);
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
        ofFloat.addListener(new v4(16, this, z10));
        this.T0.addUpdateListener(new w1(this, 0));
        this.T0.setInterpolator(er.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i7 = j6.G6;
            e6 e6Var = this.G;
            int w02 = j6.w0(i7, e6Var);
            u2 u2Var = this.Y;
            u2Var.setTitleColor(w02);
            u2Var.H(j6.w0(i7, e6Var), false);
            u2Var.F(j6.w0(j6.u8, e6Var), false);
            u2Var.I(j6.w0(j6.G8, e6Var), false);
            u2Var.J(j6.w0(j6.E8, e6Var), false, false);
            u2Var.J(j6.w0(j6.F8, e6Var), true, false);
            u2Var.K(j6.w0(j6.I5, e6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        xb xbVar;
        boolean z10;
        i0 c10 = i0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c10.e;
        h0 h0Var = c10.f;
        boolean z11 = true;
        if (h0Var == null) {
            xb xbVar2 = this.p0;
            if (xbVar2 != null) {
                xbVar2.b();
                this.p0 = null;
            }
        } else if ((!h0Var.c() || h0Var.l) && !h0Var.k) {
            g0 g0Var = this.q0;
            if (g0Var != null) {
                this.Q0 = h0Var;
                if (g0Var.c(h0Var)) {
                    this.p0 = null;
                }
            }
        } else {
            if (this.Q0 != h0Var && (xbVar = this.p0) != null) {
                xbVar.b();
                this.p0 = null;
            }
            xb xbVar3 = this.p0;
            if (xbVar3 == null || !xbVar3.l) {
                this.Q0 = h0Var;
                g0 g0Var2 = new g0(getContext(), this.G);
                this.q0 = g0Var2;
                xb f10 = xb.f(this.r0, g0Var2, 5000);
                this.p0 = f10;
                f10.k(true);
            }
            if (this.q0.c(h0Var)) {
                this.p0 = null;
            }
            h0Var.k = false;
            h0Var.l = true;
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) entry.getValue();
            h0 h0Var2 = (h0) entry.getKey();
            z0Var.setText(h0Var2.c);
            if (h0Var2.c()) {
                Pair b10 = h0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            } else {
                z0Var.setSubtext(org.telegram.messenger.g0.i0(h0Var2.g, false, false));
            }
            if (h0Var2.c()) {
                z0Var.setRightIcon(R.drawable.msg_close);
                z0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (h0Var2.i) {
                z0Var.setVisibility(8);
            } else {
                z0Var.setRightIcon(0);
                z0Var.b.setPadding(0, 0, 0, 0);
            }
            z0Var.setOnClickListener(new ai.v2(26, this, h0Var2));
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
            if (((h0) obj).c()) {
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
            if (((h0) obj2).c()) {
                break;
            }
        }
        this.o0.setDownloading(z11);
    }

    public final void H() {
        g0 g0Var = this.q0;
        if (g0Var == null) {
            return;
        }
        if (this.f0) {
            g0Var.setArrow(org.telegram.messenger.g0.W1(this.h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.c > 0.5f) {
            g0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            g0Var.setArrow(-1);
        }
    }

    public final void I() {
        org.telegram.messenger.h2 h2Var = this.o0;
        Rect rect = this.n;
        h2Var.setInsets(rect);
        boolean z10 = this.f0;
        p2 p2Var = this.E;
        w2 w2Var = this.f;
        t2 t2Var = this.n0;
        if (z10) {
            int i7 = (t2Var == null || t2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.r <= i7 && (t2Var == null || t2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int L = org.telegram.messenger.g0.L(46.0f);
            p2Var.Q(rect2, false);
            p2Var.P(L, false);
            w2Var.setPadding(0, 0, 0, Math.max(this.r, i7));
        } else {
            p2Var.Q(new Rect(0, 0, 0, 0), false);
            p2Var.P(0, false);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = this.r;
            org.telegram.ui.ActionBar.c3 c3Var = this.s;
            w2Var.setPadding(i10, 0, i11, Math.max(i12, (c3Var != null ? c3Var.I : 0) + rect.bottom));
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
        o2 o2Var = this.x;
        if (!z12) {
            o2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f0) {
                o2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                o2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f));
            }
            o2Var.setSwipeOffsetAnimationDisallowed(false);
            o2Var.c();
            o2Var.invalidate();
            o2Var.requestLayout();
        }
        if (o2Var != null) {
            o2Var.setFullSize(r());
        }
        t2Var.requestLayout();
        w2Var.requestLayout();
        h2Var.setVisibility(this.f0 ? 0 : 8);
    }

    public final void J() {
        boolean z10;
        if (this.W) {
            z10 = !this.U;
        } else {
            z10 = !org.telegram.messenger.g0.Q1() && i0.a.h(j6.x0(null, j6.d6, true)) >= 0.7210000157356262d && this.c >= 0.85f;
        }
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z10) {
            this.e = Boolean.valueOf(z10);
            w2 w2Var = this.f;
            int systemUiVisibility = w2Var.getSystemUiVisibility();
            w2Var.setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
    }

    public final void K() {
        org.telegram.ui.web.s0 webView;
        p2 p2Var = this.E;
        if (p2Var == null || (webView = p2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        t2 t2Var;
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
            w2 w2Var = this.f;
            if (!z10 || (((t2Var = this.n0) != null && t2Var.getTotalHeight() > 0) || w2Var.h0)) {
                w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() & (-3));
            } else {
                w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void a(boolean z10) {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final org.telegram.ui.ActionBar.b3 c() {
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3();
        b3Var.q = this.S;
        b3Var.p = this.w0;
        b3Var.n = this.W;
        b3Var.o = this.X;
        b3Var.r = this.R.getColor();
        b3Var.a = this.x0;
        p2 p2Var = this.E;
        b3Var.t = p2Var != null && p2Var.O;
        b3Var.D = j6.I.q();
        b3Var.x = p2Var != null ? p2Var.getUrlLoaded() : null;
        b3Var.e = p2Var != null && p2Var.u0;
        b3Var.f = p2Var != null ? p2Var.getTrustedOrigin() : null;
        o2 o2Var = this.x;
        b3Var.j = (o2Var != null && o2Var.getSwipeOffsetY() < 0.0f) || this.z0 || r() || this.f0;
        b3Var.z = this.f0;
        b3Var.A = this.g0;
        Boolean bool = this.B0;
        b3Var.B = bool == null ? this.A0 : bool.booleanValue();
        b3Var.k = o2Var != null ? o2Var.getOffsetY() : Float.MAX_VALUE;
        b3Var.C = this.C0;
        b3Var.u = this.y0;
        b3Var.y = this.t0;
        b3Var.v = this.d0;
        b3Var.l = o2Var == null || o2Var.N;
        b3Var.w = this.n0.e;
        b3Var.s = this.T;
        w0 w0Var = this.D0;
        if (w0Var != null) {
            w0Var.b();
        }
        b3Var.K = this.D0;
        org.telegram.ui.web.s0 webView = p2Var != null ? p2Var.getWebView() : null;
        if (webView != null) {
            p2Var.M();
            b3Var.b = webView;
            b3Var.d = p2Var.getBotProxy();
            b3Var.g = webView.getWidth();
            b3Var.h = webView.getHeight();
            webView.onPause();
        }
        boolean z10 = this.X0;
        b3Var.G = z10;
        if (z10) {
            b3Var.H = this.Y0;
        }
        b3Var.L = this.E0;
        this.F0 = b3Var;
        return b3Var;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final org.telegram.ui.ActionBar.h3 d() {
        return this.f;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
                return;
            }
            return;
        }
        if (i7 != ns.n4) {
            if (i7 == ns.J3) {
                G();
            }
        } else {
            this.f.invalidate();
            this.E.n.b(j6.w0(j6.d6, this.G), ns.j2);
            F();
            J();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final int e(int i7) {
        return i0.a.f(this.S0, i7, this.T);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean i(org.telegram.ui.ActionBar.y2 y2Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        if (botappsettings == null) {
            return;
        }
        boolean q10 = j6.I.q();
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
        w2 w2Var = this.f;
        if (w2Var != null) {
            w2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Z0 = b3Var;
            this.x.addView(b3Var, ja.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new c2(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.Y3(this.Z0, this.X0, 1.0f, true, false);
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
        ns.f(this.I).n(this, ns.z1);
        ns.f(this.I).n(this, ns.J3);
        ns.e().n(this, ns.n4);
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
            t2 t2Var = this.n0;
            if (t2Var != null) {
                t2Var.animate().translationY(t2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(er.h).start();
            }
            this.E.h();
            o2 o2Var = this.x;
            int height = o2Var.getHeight() + (t2Var != null ? t2Var.getTotalHeight() : 0);
            Rect rect = this.n;
            o2Var.f(this.f.Q() + height + rect.top + rect.bottom + (r() ? org.telegram.messenger.g0.L(200.0f) : 0), true, new x1(this, 0));
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
        t2 t2Var;
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
        w2 w2Var = this.f;
        w2Var.setFitsSystemWindows(true);
        w2Var.setSystemUiVisibility(1792);
        w2Var.setOnApplyWindowInsetsListener(new b2(this, 0));
        if (!this.f0 || ((t2Var = this.n0) != null && t2Var.getTotalHeight() > 0)) {
            w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() & (-3));
        } else {
            w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() | 2);
        }
        if (i7 >= 26) {
            org.telegram.messenger.g0.n3(this, i0.a.h(this.T) >= 0.7210000157356262d);
        }
        ns.e().c(this, ns.n4);
        ns.f(this.I).c(this, ns.J3);
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
        k4 k4Var = this.x0;
        return k4Var != null && k4Var.g == 6;
    }

    public final boolean r() {
        if (this.f0) {
            return true;
        }
        Boolean bool = this.B0;
        return bool == null ? this.A0 : bool.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.g3
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
            si b02 = si.b0(this.I);
            long j3 = this.x0.c;
            TLRPC.User a22 = b02.getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null && a22.bot) {
                int max2 = b02.getUserConfig().H != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().H) : 60;
                int i7 = 0;
                while (true) {
                    if (i7 >= b02.m1.size()) {
                        break;
                    }
                    TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.m1.get(i7);
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
                    b02.m1.add(tL_topPeer);
                }
                tL_topPeer.rating = Math.exp(max2 / b02.getMessagesController().a3) + tL_topPeer.rating;
                Collections.sort(b02.m1, new jg.w(20));
                if (b02.m1.size() > 20) {
                    a8.p0.z(1, b02.m1);
                }
                b02.getMessagesStorage().a.c(new zg(b02, j3, 2, tL_topPeer.rating));
                b02.getNotificationCenter().k(ns.V0, new Object[0]);
            }
            this.E.t(this.I, str, z10);
        }
        org.telegram.messenger.g0.i3(this.v0, max);
        o2 o2Var = this.x;
        if (o2Var != null) {
            o2Var.setFullSize(r());
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            E(true);
            w2 w2Var = this.f;
            w2Var.setAlpha(0.0f);
            w2Var.addOnLayoutChangeListener(new kg.m(this, 1));
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
            org.telegram.messenger.g0.P3(p());
        }
    }

    public final boolean v() {
        if (!this.t0) {
            o(false);
            return true;
        }
        TLRPC.User a22 = np.s1(this.I).a2(Long.valueOf(this.J));
        String m10 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = m10;
        t1Var.U = hd.M0(2131752917, null);
        alertDialog$Builder.k(hd.M0(2131752916, null), new y1(this));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        t1Var.show();
        ((TextView) t1Var.d(-1)).setTextColor(j6.w0(j6.q7, this.G));
        return false;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i7;
        ArrayList arrayList;
        int i10;
        boolean q10 = q();
        TLRPC.User a22 = np.s1(this.I).a2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = si.b0(this.I).b.bots;
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
        m60 m60Var = this.P0;
        if (m60Var != null) {
            m60Var.u();
        }
        m60 G = m60.G(this.f, this.G, this.f0 ? this.o0 : this.b0, true);
        this.P0 = G;
        ArrayList arrayList3 = i0.c(getContext(), this.I, this.J).e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (arrayList3.isEmpty()) {
            i7 = -1;
        } else {
            m60 J = G.J();
            J.c(R.drawable.msg_arrow_back, hd.M0(2131753756, null), new fq0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList3.get(i12);
                i12++;
                h0 h0Var = (h0) obj;
                String str = h0Var.c;
                ai.o oVar = new ai.o(20);
                e6 e6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i10 = size2;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i10 = size2;
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    z0Var.setText(str);
                    z0Var.setSubtext("");
                    Integer num = J.j0;
                    if (num == null && J.k0 == null) {
                        z0Var.c(j6.E8, j6.F8);
                    } else {
                        int intValue = num != null ? num.intValue() : j6.w0(j6.E8, e6Var);
                        Integer num2 = J.k0;
                        z0Var.d(intValue, num2 != null ? num2.intValue() : j6.w0(j6.F8, e6Var));
                    }
                    Integer num3 = J.l0;
                    if (num3 != null) {
                        z0Var.setSelectorColor(num3.intValue());
                    } else {
                        z0Var.h(0.12f, j6.E8);
                    }
                    z0Var.setOnClickListener(new org.telegram.ui.Components.e0(J, oVar));
                    int i13 = J.S;
                    if (i13 > 0) {
                        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
                        J.r(z0Var, ja.o(J.S, -2));
                    } else {
                        J.r(z0Var, ja.o(-1, -2));
                        hashMap.put(h0Var, J.y());
                        size2 = i10;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(h0Var, J.y());
                size2 = i10;
                arrayList3 = arrayList;
            }
            i7 = -1;
            G();
            J.S = org.telegram.messenger.g0.L(180.0f);
            G.c(R.drawable.menu_download_round, hd.M0(2131753094, null), new bi.n3(G, J, 1), false);
            G.k();
        }
        G.l(R.drawable.msg_bot, hd.M0(2131752912, null), new x1(this, 9), this.M0 == null && !q10);
        G.l(R.drawable.msg_settings, hd.M0(2131752897, null), new x1(this, 10), this.M0 == null && this.d0);
        int i14 = 11;
        G.c(R.drawable.msg_retry, hd.M0(2131752911, null), new ai.q(i14, this, q10), false);
        G.l(R.drawable.msg_home, hd.M0(2131754390, null), new x1(this, i14), this.M0 == null && a22 != null && a22.bot_has_main_app);
        G.l(R.drawable.menu_intro, hd.M0(2131752894, null), new x1(this, 12), this.M0 == null && !q10);
        G.l(R.drawable.msg_report, hd.M0(2131752910, null), new x1(this, 13), this.M0 == null && !q10);
        G.l(R.drawable.msg_delete, hd.M0(2131752915, null), new x1(this, 14), this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.S != j6.x0(null, j6.d6, false)) {
            int i15 = org.telegram.messenger.g0.B(this.S) >= 0.721f ? i7 : -15198183;
            int i16 = org.telegram.messenger.g0.B(i15) >= 0.721f ? -16777216 : i7;
            int r12 = j6.r1(0.85f, i16);
            int r13 = j6.r1(0.1f, i16);
            G.P(i15);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w10 = G.w(i17);
                if (w10 instanceof org.telegram.ui.ActionBar.z0) {
                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) w10;
                    z0Var2.d(i16, r12);
                    z0Var2.setSelectorColor(r13);
                }
            }
        }
        G.V(5);
        G.a0(-this.n.right, 0.0f);
        G.U = true;
        G.t = false;
        G.s = 0;
        G.Z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(org.telegram.ui.ActionBar.e2 e2Var, k4 k4Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        TLRPC.InputPeer n1;
        TLRPC.InputPeer j12;
        boolean z10;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        this.x0 = k4Var;
        int i7 = k4Var.a;
        this.I = i7;
        this.K = k4Var.b;
        this.J = k4Var.c;
        this.M = k4Var.h;
        this.N = k4Var.i;
        this.O = k4Var.e;
        int i10 = 1;
        Object[] objArr = k4Var.g == 6;
        TLRPC.User a22 = objArr != false ? null : np.s1(i7).a2(Long.valueOf(this.J));
        CharSequence p10 = objArr != false ? k4Var.e : q10.p(a22);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = org.telegram.messenger.j6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        u2 u2Var = this.Y;
        u2Var.setTitle(p10);
        TLRPC.UserFull b22 = objArr != false ? null : np.s1(this.I).b2(this.J);
        e6 e6Var = this.G;
        if ((a22 != null && a22.verified) || (b22 != null && (user = b22.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            q6.x(u2Var.getTitleTextView(), this.N0, j6.Fi, e6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(ns.e4);
            u2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            u2Var.getTitleTextView().i(new hi.k3(this, i10));
        }
        org.telegram.messenger.h2 h2Var = this.o0;
        if (h2Var != null) {
            String p11 = objArr != false ? k4Var.e : q10.p(a22);
            Object[] objArr2 = a22 != null && a22.verified;
            h2Var.U = new oy0(p11, 13.0f, org.telegram.messenger.g0.o());
            if (objArr2 == true) {
                h2Var.V = h2Var.getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
            } else {
                h2Var.V = null;
                h2Var.W = null;
            }
        }
        org.telegram.ui.ActionBar.y s5 = u2Var.s();
        s5.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(this.I).b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                yVar = s5;
                userFull = b22;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            yVar = s5;
            userFull = b22;
            if (tL_attachMenuBot.bot_id == this.J) {
                break;
            }
            s5 = yVar;
            b22 = userFull;
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
                np.s1(this.I).W2(a22, 0, true, new a2(this, 1 == true ? 1 : 0));
            }
            if (k4Var.p) {
                C(z11, z10, this.g0);
            }
        }
        if (this.M0 == null) {
            yVar2 = yVar;
            yVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.c0 = g2Var;
        org.telegram.ui.ActionBar.q0 d = yVar2.d(0, g2Var);
        this.b0 = d;
        d.setOnClickListener(new c2(this, 1));
        u2Var.setActionBarMenuOnItemClick(new i2(this, 0));
        JSONObject u10 = u(e6Var, false);
        p2 p2Var = this.E;
        p2Var.setBotUser(a22);
        if (objArr == false) {
            p2Var.s(this.I, this.J);
            TLRPC.User user2 = k4Var.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                si.b0(this.I);
                if (!si.z0(si.d2, this.J)) {
                    if (user2 == null) {
                        user2 = np.s1(this.I).a2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            si.b0(this.I).l1(gc.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (k4Var.q != null) {
            s();
            return;
        }
        int i12 = k4Var.g;
        int i13 = ns.z1;
        int i14 = 4;
        int i15 = 2;
        switch (i12) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = np.s1(this.I).j1(this.K);
                tL_messages_requestWebView.bot = np.s1(this.I).o1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = k4Var.o;
                tL_messages_requestWebView.fullscreen = k4Var.p;
                String str = k4Var.f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    ez.C(this.I);
                    int i16 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i16;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = np.s1(this.I).j1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = np.s1(this.I).j1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new h2(this, 3));
                ns.f(this.I).c(this, i13);
                break;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (k4Var.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = np.s1(this.I).o1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                tL_messages_requestSimpleWebView.from_side_menu = (k4Var.n & 2) != 0;
                tL_messages_requestSimpleWebView.compact = k4Var.o;
                tL_messages_requestSimpleWebView.fullscreen = k4Var.p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(k4Var.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = k4Var.f;
                }
                if (!TextUtils.isEmpty(k4Var.l)) {
                    tL_messages_requestSimpleWebView.start_param = k4Var.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new h2(this, i15));
                break;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = np.s1(this.I).o1(this.J);
                tL_messages_requestWebView2.peer = np.s1(this.I).j1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = k4Var.o;
                tL_messages_requestWebView2.fullscreen = k4Var.p;
                tL_messages_requestWebView2.url = k4Var.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new h2(this, 1));
                ns.f(this.I).c(this, i13);
                break;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = k4Var.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = k4Var.k;
                tL_messages_requestAppWebView.platform = "android";
                if (e2Var instanceof an) {
                    an anVar = (an) e2Var;
                    n1 = anVar.j() != null ? np.n1(anVar.j()) : np.l1(anVar.e);
                } else {
                    n1 = np.n1(k4Var.m);
                }
                tL_messages_requestAppWebView.peer = n1;
                tL_messages_requestAppWebView.compact = k4Var.o;
                tL_messages_requestAppWebView.fullscreen = k4Var.p;
                if (!TextUtils.isEmpty(k4Var.l)) {
                    tL_messages_requestAppWebView.start_param = k4Var.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new h2(this, i14), 66);
                break;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = np.s1(this.I).o1(k4Var.c);
                tL_messages_requestMainWebView.platform = "android";
                if (e2Var instanceof an) {
                    an anVar2 = (an) e2Var;
                    j12 = anVar2.j() != null ? np.n1(anVar2.j()) : np.l1(anVar2.e);
                } else {
                    j12 = np.s1(this.I).j1(k4Var.b);
                }
                tL_messages_requestMainWebView.peer = j12;
                tL_messages_requestMainWebView.compact = k4Var.o;
                tL_messages_requestMainWebView.fullscreen = k4Var.p;
                if (!TextUtils.isEmpty(k4Var.l)) {
                    tL_messages_requestMainWebView.start_param = k4Var.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new h2(this, 5), 66);
                break;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = k4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new q4(this, 20), 66);
                break;
            case 6:
                if (!this.G0) {
                    p2Var.t(this.I, k4Var.f, false);
                    break;
                }
                break;
        }
    }

    public final void y(final int i7, boolean z10, boolean z11) {
        final int i10 = this.S;
        j6.b(0.35f, -0.1f, i7);
        final u1 u1Var = new u1();
        int i11 = this.W ? this.S : 0;
        SparseIntArray sparseIntArray = u1Var.a;
        e6 e6Var = this.G;
        u1Var.c(sparseIntArray, i11, e6Var);
        this.W = z10;
        this.U = i0.a.h(i7) < 0.7210000157356262d;
        u1Var.c(u1Var.b, this.W ? i7 : 0, e6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(er.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ki.d2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i10, i7);
                    x2 x2Var = x2.this;
                    x2Var.S = f10;
                    x2Var.l();
                    w2 w2Var = x2Var.f;
                    w2Var.invalidate();
                    u2 u2Var = x2Var.Y;
                    u2Var.setBackgroundColor(x2Var.S);
                    u1 u1Var2 = u1Var;
                    u1Var2.b(u2Var, floatValue);
                    x2Var.a = u1Var2.a(j6.zj);
                    w2Var.invalidate();
                }
            });
            duration.addListener(new n2(this, i10, i7, u1Var));
            duration.start();
        } else {
            this.S = i7;
            l();
            w2 w2Var = this.f;
            w2Var.invalidate();
            int i12 = this.S;
            u2 u2Var = this.Y;
            u2Var.setBackgroundColor(i12);
            u1Var.b(u2Var, 1.0f);
            this.a = u1Var.a(j6.zj);
            w2Var.invalidate();
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
            org.telegram.messenger.g0.P3(p());
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final /* synthetic */ void b(boolean z10) {
    }
}

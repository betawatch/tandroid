package ii;

import ai.q6;
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
import b8.ke;
import b8.mf;
import gi.f6;
import gi.i8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.sg;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i51;
import org.telegram.ui.wm;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a3 extends Dialog implements cs, org.telegram.ui.ActionBar.g3 {
    public static final HashSet b1 = new HashSet();
    public static final kt0 c1;
    public static int d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public w0 D0;
    public final s2 E;
    public boolean E0;
    public final y2 F;
    public org.telegram.ui.ActionBar.a3 F0;
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
    public i51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public f60 P0;
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
    public final x2 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public org.telegram.ui.c3 Z0;
    public int a;
    public final Drawable a0;
    public boolean a1;
    public int b;
    public org.telegram.ui.ActionBar.q0 b0;
    public float c;
    public org.telegram.messenger.g2 c0;
    public q1.g d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final z2 f;
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
    public final w2 n0;
    public final org.telegram.messenger.h2 o0;
    public ac p0;
    public g0 q0;
    public int r;
    public final FrameLayout r0;
    public final org.telegram.ui.ActionBar.b3 s;
    public final FrameLayout.LayoutParams s0;
    public boolean t0;
    public final zb0 u0;
    public final x1 v0;
    public final ke w;
    public int w0;
    public final r2 x;
    public q4 x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        kt0 kt0Var = new kt0(new i8(25), new i8(26));
        kt0Var.c = 100.0f;
        c1 = kt0Var;
        d1 = 0;
    }

    public a3(Context context, e6 e6Var) {
        super(context, R.style.TransparentDialog);
        this.c = 0.0f;
        this.h = new Rect();
        this.n = new Rect();
        int i3 = 0;
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
        int x02 = k6.x0(null, k6.wj, false);
        this.b = x02;
        this.a = x02;
        r2 r2Var = new r2(i3, context, this);
        this.x = r2Var;
        r2Var.setAllowFullSizeSwipe(true);
        r2Var.setShouldWaitWebViewScroll(true);
        int i11 = k6.d6;
        s2 s2Var = new s2(this, context, e6Var, k6.w0(i11, e6Var), 0);
        this.E = s2Var;
        s2Var.setOnVerifiedAge(this.M0);
        s2Var.setDelegate(new v2(this, context, e6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.S = k6.w0(i11, e6Var);
        int w02 = k6.w0(k6.a7, e6Var);
        this.T = w02;
        org.telegram.messenger.g0.u3(this, w02, false, null);
        z2 z2Var = new z2(this, context);
        this.f = z2Var;
        z2Var.setDelegate(new z1(this, i3));
        FrameLayout.LayoutParams e10 = mf.e(-1, -1, 49);
        this.y = e10;
        z2Var.addView(r2Var, e10);
        w2 w2Var = new w2(this, getContext(), e6Var);
        this.n0 = w2Var;
        w2Var.setOnButtonClickListener(new a2(this, i3));
        int i12 = 3;
        w2Var.setOnResizeListener(new x1(this, i12));
        z2Var.addView(w2Var, mf.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        boolean z10 = !hp.s1(this.I).G6 && az.o() >= 2;
        this.g0 = z10;
        h2Var.setParentRenderNode(z10 ? r2Var.getRenderNode() : null);
        z2Var.addView(h2Var, mf.e(-1, -1, hs.E1));
        h2Var.setOnCloseClickListener(new x1(this, 4));
        h2Var.setOnCollapseClickListener(new x1(this, 5));
        h2Var.setOnMenuClickListener(new x1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        FrameLayout.LayoutParams e11 = mf.e(-1, hs.e3, 55);
        this.s0 = e11;
        z2Var.addView(frameLayout, e11);
        this.a0 = getContext().getDrawable(R.drawable.header_shadow).mutate();
        x2 x2Var = new x2(context, e6Var);
        this.Y = x2Var;
        x2Var.setBackgroundColor(0);
        x2Var.setBackButtonImage(R.drawable.ic_close_white);
        F();
        x2Var.setActionBarMenuOnItemClick(new j2(this, i10));
        x2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = mf.e(-1, -2, 49);
        this.Z = e12;
        z2Var.addView(x2Var, e12);
        y2 y2Var = new y2(context, e6Var);
        this.F = y2Var;
        z2Var.addView(y2Var, mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        s2Var.setWebViewProgressListener(new q6(this, i12));
        r2Var.addView(s2Var, mf.c(-1.0f, -1));
        r2Var.setScrollListener(new x1(this, 7));
        r2Var.setScrollEndListener(new x1(this, 8));
        r2Var.setDelegate(new y1(this));
        r2Var.setIsKeyboardVisible(new y1(this));
        zb0 zb0Var = new zb0(context);
        this.u0 = zb0Var;
        z2Var.addView(zb0Var, mf.c(-1.0f, -1));
        setContentView(z2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.K1;
        org.telegram.ui.ActionBar.b3 O = launchActivity != null ? launchActivity.O() : null;
        this.s = O;
        if (O != null) {
            f6 f6Var = new f6(z2Var, 21);
            x1 x1Var = new x1(this, 2);
            O.J.add(f6Var);
            O.K.add(x1Var);
            this.w = new ke(O);
        }
    }

    public static /* synthetic */ void f(a3 a3Var) {
        if (a3Var.R0) {
            return;
        }
        super.dismiss();
        a3Var.R0 = true;
    }

    public static WindowInsets h(a3 a3Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).a;
        i0.b f10 = h1Var.f(2);
        a3Var.h.set(f10.a, f10.b, f10.c, f10.d);
        i0.b f11 = h1Var.f(647);
        Rect rect = a3Var.n;
        rect.set(Math.max(f11.a, windowInsets.getStableInsetLeft()), Math.max(f11.b, windowInsets.getStableInsetTop()), Math.max(f11.c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 29) {
            Activity W = org.telegram.messenger.g0.W(a3Var.getContext());
            WindowInsets rootWindowInsets = (W == null || W.getWindow() == null) ? null : W.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                rect.set(Math.max(rect.left, rootWindowInsets.getStableInsetLeft()), Math.max(rect.top, rootWindowInsets.getStableInsetTop()), Math.max(rect.right, rootWindowInsets.getStableInsetRight()), Math.max(rect.bottom, rootWindowInsets.getStableInsetBottom()));
            }
        }
        if (i3 <= 29) {
            int i10 = rect.top;
            Context context = a3Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            rect.top = Math.max(i10, identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
        }
        int i11 = h1Var.f(8).d;
        if (i11 <= rect.bottom || i11 <= org.telegram.messenger.g0.L(20.0f)) {
            a3Var.r = 0;
        } else {
            a3Var.r = i11;
        }
        a3Var.I();
        return i3 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void n(int i3, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(i3).b.bots;
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
            if (tL_attachMenuBot3.bot_id == j10) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String a02 = bd.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = bd.M0(2131753001, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(bd.M0(2131747839, null), new o1(i3, j10, tL_attachMenuBot, runnable));
        k2.p1.v(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(e6 e6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = k6.w(-16777216, k6.w0(k6.h5, e6Var));
            v10 v10Var = new v10() { // from class: ii.f2
                @Override // org.telegram.messenger.v10
                public final Object a(Object obj) {
                    int w11 = k6.w(w10, ((Integer) obj).intValue());
                    return z10 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11))) : Integer.valueOf(w11);
                }
            };
            jSONObject.put("bg_color", v10Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", v10Var.a(Integer.valueOf(k6.w0(k6.d6, e6Var))));
            int i3 = k6.a7;
            jSONObject.put("secondary_bg_color", v10Var.a(Integer.valueOf(k6.w0(i3, e6Var))));
            jSONObject.put("text_color", v10Var.a(Integer.valueOf(k6.w0(k6.G6, e6Var))));
            jSONObject.put("hint_color", v10Var.a(Integer.valueOf(k6.w0(k6.H6, e6Var))));
            jSONObject.put("link_color", v10Var.a(Integer.valueOf(k6.w0(k6.J6, e6Var))));
            jSONObject.put("button_color", v10Var.a(Integer.valueOf(k6.w0(k6.Ci, e6Var))));
            jSONObject.put("button_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.Gi, e6Var))));
            jSONObject.put("header_bg_color", v10Var.a(Integer.valueOf(k6.w0(k6.s8, e6Var))));
            jSONObject.put("accent_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.q6, e6Var))));
            jSONObject.put("section_header_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.L6, e6Var))));
            jSONObject.put("subtitle_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.z6, e6Var))));
            jSONObject.put("destructive_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.p7, e6Var))));
            jSONObject.put("section_separator_color", v10Var.a(Integer.valueOf(k6.w0(k6.d7, e6Var))));
            jSONObject.put("bottom_bar_bg_color", v10Var.a(Integer.valueOf(k6.w0(i3, e6Var))));
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void A(int i3, boolean z10) {
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
            duration.setInterpolator(xq.f);
            this.U0.addUpdateListener(new v1(this, color, i3, i10));
            this.U0.addListener(new m2(this, i3, i10));
            this.U0.start();
            return;
        }
        paint.setColor(i3);
        F();
        this.f.invalidate();
        org.telegram.ui.c3 c3Var = this.Z0;
        if (c3Var != null) {
            c3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            r2 r2Var = this.x;
            if (r2Var != null) {
                r2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        this.g0 = z12 && !hp.s1(this.I).G6 && az.o() >= 2;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.o0;
        r2 r2Var = this.x;
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
            h2Var.setParentRenderNode(this.g0 ? r2Var.getRenderNode() : null);
        }
        this.k0 = r2Var.getWidth();
        this.l0 = r2Var.getHeight();
        this.V0 = false;
        w2 w2Var = this.n0;
        s2 s2Var = this.E;
        x2 x2Var = this.Y;
        if (!z11) {
            this.j0 = false;
            this.h0 = z10 ? 1.0f : 0.0f;
            this.i0 = 0.0f;
            I();
            L();
            x2Var.setVisibility(z10 ? 8 : 0);
            x2Var.setAlpha(1.0f - this.h0);
            x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.h0);
            w2Var.setTranslationX(0.0f);
            h2Var.setAlpha(this.h0);
            s2Var.setViewPortHeightOffset(0.0f);
            s2Var.n(true, true);
            H();
            return;
        }
        I();
        L();
        H();
        if (!org.telegram.messenger.g0.Q1() || org.telegram.messenger.g0.E || org.telegram.messenger.g0.P1()) {
            f10 = 0.0f;
        } else {
            int i3 = org.telegram.messenger.g0.q.x;
            f10 = (i3 - ((int) (Math.min(i3, r12.y) * 0.8f))) / 2.0f;
        }
        float f11 = z10 ? this.n.left + f10 : (-r13) - f10;
        if (!z10) {
            f10 = -f10;
        }
        float translationY = z10 ? r2Var.getTranslationY() : -org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight = z10 ? -org.telegram.messenger.g0.L(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        q1.g gVar = r2Var.w;
        if (gVar != null) {
            gVar.d();
        }
        q1.g gVar2 = r2Var.H;
        if (gVar2 != null) {
            gVar2.d();
        }
        r2Var.setSwipeOffsetAnimationDisallowed(true);
        x2Var.setVisibility(0);
        if (z10) {
            r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
        } else {
            r2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
        }
        r2Var.c();
        r2Var.invalidate();
        this.i0 = 0.0f;
        float f12 = z10 ? 0.0f : 1.0f;
        this.h0 = f12;
        x2Var.setAlpha(1.0f - f12);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.h0);
        r2Var.setTranslationY(org.telegram.messenger.g0.T1(translationY, currentActionBarHeight, this.i0));
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.i0));
        w2Var.setTranslationX(org.telegram.messenger.g0.T1(f10, 0.0f, this.i0));
        h2Var.setAlpha(this.h0);
        this.f.invalidate();
        s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - currentActionBarHeight);
        s2Var.n(false, false);
        this.j0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W0 = ofFloat;
        float f13 = f11;
        ofFloat.addUpdateListener(new n2(this, z10, translationY, currentActionBarHeight, f13, f10));
        this.W0.addListener(new o2(this, z10, currentActionBarHeight2, f13));
        this.W0.setDuration(280L);
        this.W0.setInterpolator(xq.h);
        this.W0.start();
    }

    public final void D(int i3, boolean z10) {
        int i10 = 0;
        this.J0 = false;
        int i11 = this.T;
        w2 w2Var = this.n0;
        Paint paint = w2Var.a;
        w2Var.e.b = i3;
        paint.setColor(i3);
        int i12 = 1;
        if (!z10) {
            w2Var.d.a(i3, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(xq.f);
            duration.addUpdateListener(new v1(this, i11, i3, i12));
            duration.addListener(new p2(this, i11, i3, i10));
            duration.start();
        } else {
            this.T = i3;
            l();
        }
        org.telegram.messenger.g0.u3(this, this.T, false, null);
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
        ofFloat.addListener(new dh.x(15, this, z10));
        this.T0.addUpdateListener(new w1(this, 0));
        this.T0.setInterpolator(xq.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i3 = k6.G6;
            e6 e6Var = this.G;
            int w02 = k6.w0(i3, e6Var);
            x2 x2Var = this.Y;
            x2Var.setTitleColor(w02);
            x2Var.D(k6.w0(i3, e6Var), false);
            x2Var.C(k6.w0(k6.u8, e6Var), false);
            x2Var.E(k6.w0(k6.G8, e6Var), false);
            x2Var.G(k6.w0(k6.E8, e6Var), false, false);
            x2Var.G(k6.w0(k6.F8, e6Var), true, false);
            x2Var.H(k6.w0(k6.I5, e6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        ac acVar;
        boolean z10;
        i0 c2 = i0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c2.e;
        h0 h0Var = c2.f;
        boolean z11 = true;
        if (h0Var == null) {
            ac acVar2 = this.p0;
            if (acVar2 != null) {
                acVar2.b();
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
            if (this.Q0 != h0Var && (acVar = this.p0) != null) {
                acVar.b();
                this.p0 = null;
            }
            ac acVar3 = this.p0;
            if (acVar3 == null || !acVar3.l) {
                this.Q0 = h0Var;
                g0 g0Var2 = new g0(getContext(), this.G);
                this.q0 = g0Var2;
                ac f10 = ac.f(this.r0, g0Var2, 5000);
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
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) entry.getValue();
            h0 h0Var2 = (h0) entry.getKey();
            y0Var.setText(h0Var2.c);
            if (h0Var2.c()) {
                Pair b10 = h0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            } else {
                y0Var.setSubtext(org.telegram.messenger.g0.i0(h0Var2.g, false, false));
            }
            if (h0Var2.c()) {
                y0Var.setRightIcon(R.drawable.msg_close);
                y0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (h0Var2.i) {
                y0Var.setVisibility(8);
            } else {
                y0Var.setRightIcon(0);
                y0Var.b.setPadding(0, 0, 0, 0);
            }
            y0Var.setOnClickListener(new ai.d(23, this, h0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.c0;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
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
        s2 s2Var = this.E;
        z2 z2Var = this.f;
        w2 w2Var = this.n0;
        if (z10) {
            int i3 = (w2Var == null || w2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.r <= i3 && (w2Var == null || w2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int L = org.telegram.messenger.g0.L(46.0f);
            s2Var.P(rect2, false);
            s2Var.O(L, false);
            z2Var.setPadding(0, 0, 0, Math.max(this.r, i3));
        } else {
            s2Var.P(new Rect(0, 0, 0, 0), false);
            s2Var.O(0, false);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = this.r;
            org.telegram.ui.ActionBar.b3 b3Var = this.s;
            z2Var.setPadding(i10, 0, i11, Math.max(i12, (b3Var != null ? b3Var.I : 0) + rect.bottom));
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
        r2 r2Var = this.x;
        if (!z12) {
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f0) {
                r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                r2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f));
            }
            r2Var.setSwipeOffsetAnimationDisallowed(false);
            r2Var.c();
            r2Var.invalidate();
            r2Var.requestLayout();
        }
        if (r2Var != null) {
            r2Var.setFullSize(r());
        }
        w2Var.requestLayout();
        z2Var.requestLayout();
        h2Var.setVisibility(this.f0 ? 0 : 8);
    }

    public final void J() {
        boolean z10;
        if (this.W) {
            z10 = !this.U;
        } else {
            z10 = !org.telegram.messenger.g0.Q1() && i0.a.h(k6.x0(null, k6.d6, true)) >= 0.7210000157356262d && this.c >= 0.85f;
        }
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z10) {
            this.e = Boolean.valueOf(z10);
            z2 z2Var = this.f;
            int systemUiVisibility = z2Var.getSystemUiVisibility();
            z2Var.setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
    }

    public final void K() {
        org.telegram.ui.web.t0 webView;
        s2 s2Var = this.E;
        if (s2Var == null || (webView = s2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        w2 w2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z10 = this.f0;
            if (z10) {
                attributes.flags = i3 | attributes.flags;
            } else {
                attributes.flags = (~i3) & attributes.flags;
            }
            z2 z2Var = this.f;
            if (!z10 || (((w2Var = this.n0) != null && w2Var.getTotalHeight() > 0) || z2Var.h0)) {
                z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
            } else {
                z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
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
    public final org.telegram.ui.ActionBar.a3 c() {
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3();
        a3Var.q = this.S;
        a3Var.p = this.w0;
        a3Var.n = this.W;
        a3Var.o = this.X;
        a3Var.r = this.R.getColor();
        a3Var.a = this.x0;
        s2 s2Var = this.E;
        a3Var.t = s2Var != null && s2Var.O;
        a3Var.D = k6.I.q();
        a3Var.x = s2Var != null ? s2Var.getUrlLoaded() : null;
        a3Var.e = s2Var != null && s2Var.u0;
        a3Var.f = s2Var != null ? s2Var.getTrustedOrigin() : null;
        r2 r2Var = this.x;
        a3Var.j = (r2Var != null && r2Var.getSwipeOffsetY() < 0.0f) || this.z0 || r() || this.f0;
        a3Var.z = this.f0;
        a3Var.A = this.g0;
        Boolean bool = this.B0;
        a3Var.B = bool == null ? this.A0 : bool.booleanValue();
        a3Var.k = r2Var != null ? r2Var.getOffsetY() : Float.MAX_VALUE;
        a3Var.C = this.C0;
        a3Var.u = this.y0;
        a3Var.y = this.t0;
        a3Var.v = this.d0;
        a3Var.l = r2Var == null || r2Var.N;
        a3Var.w = this.n0.e;
        a3Var.s = this.T;
        w0 w0Var = this.D0;
        if (w0Var != null) {
            w0Var.b();
        }
        a3Var.K = this.D0;
        org.telegram.ui.web.t0 webView = s2Var != null ? s2Var.getWebView() : null;
        if (webView != null) {
            s2Var.L();
            a3Var.b = webView;
            a3Var.d = s2Var.getBotProxy();
            a3Var.g = webView.getWidth();
            a3Var.h = webView.getHeight();
            webView.onPause();
        }
        boolean z10 = this.X0;
        a3Var.G = z10;
        if (z10) {
            a3Var.H = this.Y0;
        }
        a3Var.L = this.E0;
        this.F0 = a3Var;
        return a3Var;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final org.telegram.ui.ActionBar.h3 d() {
        return this.f;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
                return;
            }
            return;
        }
        if (i3 != hs.n4) {
            if (i3 == hs.J3) {
                G();
            }
        } else {
            this.f.invalidate();
            this.E.n.b(k6.w0(k6.d6, this.G), hs.j2);
            F();
            J();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final int e(int i3) {
        return i0.a.f(this.S0, i3, this.T);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean i(org.telegram.ui.ActionBar.x2 x2Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        if (botappsettings == null) {
            return;
        }
        boolean q10 = k6.I.q();
        int i3 = botappsettings.flags;
        boolean z11 = ((q10 ? 4 : 2) & i3) != 0;
        if ((i3 & (q10 ? 16 : 8)) != 0) {
            y((q10 ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z10);
        }
        if (z11) {
            A((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
            D((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.R0 && (launchActivity = LaunchActivity.K1) != null) {
            launchActivity.F(true, true, true);
        }
        z2 z2Var = this.f;
        if (z2Var != null) {
            z2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.c3 c3Var = new org.telegram.ui.c3(getContext());
            this.Z0 = c3Var;
            this.x.addView(c3Var, mf.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new c2(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.Z3(this.Z0, this.X0, 1.0f, true, false);
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
        hs.f(this.I).n(this, hs.z1);
        hs.f(this.I).n(this, hs.J3);
        hs.e().n(this, hs.n4);
        if (z10 && ((launchActivity = LaunchActivity.K1) == null || launchActivity.z0 == null)) {
            z10 = false;
        }
        if (z10) {
            q1.g gVar = this.d;
            if (gVar != null) {
                gVar.m.i = 0.0f;
                gVar.h();
            }
            LaunchActivity.K1.z0.b(this);
        } else {
            w2 w2Var = this.n0;
            if (w2Var != null) {
                w2Var.animate().translationY(w2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(xq.h).start();
            }
            this.E.h();
            r2 r2Var = this.x;
            int height = r2Var.getHeight() + (w2Var != null ? w2Var.getTotalHeight() : 0);
            Rect rect = this.n;
            r2Var.f(this.f.Q() + height + rect.top + rect.bottom + (r() ? org.telegram.messenger.g0.L(200.0f) : 0), true, new x1(this, 0));
        }
        b1.remove(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            q1.g gVar = new q1.g(this, c1);
            q1.h hVar = new q1.h();
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
            if (this.E.C()) {
                return;
            }
            o(true);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        w2 w2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
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
        if (i3 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        z2 z2Var = this.f;
        z2Var.setFitsSystemWindows(true);
        z2Var.setSystemUiVisibility(1792);
        z2Var.setOnApplyWindowInsetsListener(new b2(this, 0));
        if (!this.f0 || ((w2Var = this.n0) != null && w2Var.getTotalHeight() > 0)) {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
        } else {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
        }
        if (i3 >= 26) {
            org.telegram.messenger.g0.n3(this, i0.a.h(this.T) >= 0.7210000157356262d);
        }
        hs.e().c(this, hs.n4);
        hs.f(this.I).c(this, hs.J3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        q1.g gVar = this.d;
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
            ((LaunchActivity) context).C0.add(this.u0);
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
            ((LaunchActivity) context).C0.remove(this.u0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.K1;
        }
        return ownerActivity == null ? org.telegram.messenger.g0.W(getContext()) : ownerActivity;
    }

    public final boolean q() {
        q4 q4Var = this.x0;
        return q4Var != null && q4Var.g == 6;
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
            li b02 = li.b0(this.I);
            long j10 = this.x0.c;
            TLRPC.User a22 = b02.getMessagesController().a2(Long.valueOf(j10));
            if (a22 != null && a22.bot) {
                int max2 = b02.getUserConfig().H != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().H) : 60;
                int i3 = 0;
                while (true) {
                    if (i3 >= b02.m1.size()) {
                        break;
                    }
                    TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.m1.get(i3);
                    if (tL_topPeer2.peer.user_id == j10) {
                        tL_topPeer = tL_topPeer2;
                        break;
                    }
                    i3++;
                }
                if (tL_topPeer == null) {
                    tL_topPeer = new TLRPC.TL_topPeer();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_topPeer.peer = tL_peerUser;
                    tL_peerUser.user_id = j10;
                    b02.m1.add(tL_topPeer);
                }
                tL_topPeer.rating = Math.exp(max2 / b02.getMessagesController().a3) + tL_topPeer.rating;
                Collections.sort(b02.m1, new o0.a(11));
                if (b02.m1.size() > 20) {
                    a1.g.y(1, b02.m1);
                }
                b02.getMessagesStorage().a.c(new sg(b02, j10, 2, tL_topPeer.rating));
                b02.getNotificationCenter().k(hs.V0, new Object[0]);
            }
            this.E.t(this.I, str, z10);
        }
        org.telegram.messenger.g0.i3(this.v0, max);
        r2 r2Var = this.x;
        if (r2Var != null) {
            r2Var.setFullSize(r());
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            E(true);
            z2 z2Var = this.f;
            z2Var.setAlpha(0.0f);
            z2Var.addOnLayoutChangeListener(new l2(this, 0));
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
            org.telegram.messenger.g0.Q3(p());
        }
    }

    public final boolean v() {
        if (!this.t0) {
            o(false);
            return true;
        }
        TLRPC.User a22 = hp.s1(this.I).a2(Long.valueOf(this.J));
        String m10 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = m10;
        s1Var.U = bd.M0(2131752917, null);
        alertDialog$Builder.k(bd.M0(2131752916, null), new y1(this));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        s1Var.show();
        ((TextView) s1Var.d(-1)).setTextColor(k6.w0(k6.q7, this.G));
        return false;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i3;
        ArrayList arrayList;
        int i10;
        boolean q10 = q();
        TLRPC.User a22 = hp.s1(this.I).a2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = li.b0(this.I).b.bots;
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
        f60 f60Var = this.P0;
        if (f60Var != null) {
            f60Var.u();
        }
        f60 G = f60.G(this.f, this.G, this.f0 ? this.o0 : this.b0, true);
        this.P0 = G;
        ArrayList arrayList3 = i0.c(getContext(), this.I, this.J).e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (arrayList3.isEmpty()) {
            i3 = -1;
        } else {
            f60 J = G.J();
            J.c(R.drawable.msg_arrow_back, bd.M0(2131753756, null), new xp0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList3.get(i12);
                i12++;
                h0 h0Var = (h0) obj;
                String str = h0Var.c;
                ai.y1 y1Var = new ai.y1(18);
                e6 e6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i10 = size2;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i10 = size2;
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    y0Var.setText(str);
                    y0Var.setSubtext("");
                    Integer num = J.j0;
                    if (num == null && J.k0 == null) {
                        y0Var.c(k6.E8, k6.F8);
                    } else {
                        int intValue = num != null ? num.intValue() : k6.w0(k6.E8, e6Var);
                        Integer num2 = J.k0;
                        y0Var.d(intValue, num2 != null ? num2.intValue() : k6.w0(k6.F8, e6Var));
                    }
                    Integer num3 = J.l0;
                    if (num3 != null) {
                        y0Var.setSelectorColor(num3.intValue());
                    } else {
                        y0Var.h(0.12f, k6.E8);
                    }
                    y0Var.setOnClickListener(new org.telegram.ui.Components.f0(J, y1Var));
                    int i13 = J.S;
                    if (i13 > 0) {
                        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
                        J.r(y0Var, mf.o(J.S, -2));
                    } else {
                        J.r(y0Var, mf.o(-1, -2));
                        hashMap.put(h0Var, J.y());
                        size2 = i10;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(h0Var, J.y());
                size2 = i10;
                arrayList3 = arrayList;
            }
            i3 = -1;
            G();
            J.S = org.telegram.messenger.g0.L(180.0f);
            G.c(R.drawable.menu_download_round, bd.M0(2131753094, null), new ai.y3(G, J, 1), false);
            G.k();
        }
        G.l(R.drawable.msg_bot, bd.M0(2131752912, null), new x1(this, 9), this.M0 == null && !q10);
        int i14 = 10;
        G.l(R.drawable.msg_settings, bd.M0(2131752897, null), new x1(this, i14), this.M0 == null && this.d0);
        G.c(R.drawable.msg_retry, bd.M0(2131752911, null), new ci.e1(i14, this, q10), false);
        G.l(R.drawable.msg_home, bd.M0(2131754390, null), new x1(this, 11), this.M0 == null && a22 != null && a22.bot_has_main_app);
        G.l(R.drawable.menu_intro, bd.M0(2131752894, null), new x1(this, 12), this.M0 == null && !q10);
        G.l(R.drawable.msg_report, bd.M0(2131752910, null), new x1(this, 13), this.M0 == null && !q10);
        G.l(R.drawable.msg_delete, bd.M0(2131752915, null), new x1(this, 14), this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.S != k6.x0(null, k6.d6, false)) {
            int i15 = org.telegram.messenger.g0.B(this.S) >= 0.721f ? i3 : -15198183;
            int i16 = org.telegram.messenger.g0.B(i15) >= 0.721f ? -16777216 : i3;
            int r12 = k6.r1(0.85f, i16);
            int r13 = k6.r1(0.1f, i16);
            G.P(i15);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w10 = G.w(i17);
                if (w10 instanceof org.telegram.ui.ActionBar.y0) {
                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) w10;
                    y0Var2.d(i16, r12);
                    y0Var2.setSelectorColor(r13);
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
    public final void x(org.telegram.ui.ActionBar.d2 d2Var, q4 q4Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.x xVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.x xVar2;
        TLRPC.InputPeer n12;
        TLRPC.InputPeer j12;
        boolean z10;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        this.x0 = q4Var;
        int i3 = q4Var.a;
        this.I = i3;
        this.K = q4Var.b;
        this.J = q4Var.c;
        this.M = q4Var.h;
        this.N = q4Var.i;
        this.O = q4Var.e;
        int i10 = 1;
        Object[] objArr = q4Var.g == 6;
        TLRPC.User a22 = objArr != false ? null : hp.s1(i3).a2(Long.valueOf(this.J));
        CharSequence p10 = objArr != false ? q4Var.e : l10.p(a22);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        x2 x2Var = this.Y;
        x2Var.setTitle(p10);
        TLRPC.UserFull b22 = objArr != false ? null : hp.s1(this.I).b2(this.J);
        e6 e6Var = this.G;
        if ((a22 != null && a22.verified) || (b22 != null && (user = b22.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            r6.y(x2Var.getTitleTextView(), this.N0, k6.Ci, e6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(hs.e4);
            x2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            x2Var.getTitleTextView().i(new gi.k3(this, i10));
        }
        org.telegram.messenger.h2 h2Var = this.o0;
        if (h2Var != null) {
            String p11 = objArr != false ? q4Var.e : l10.p(a22);
            Object[] objArr2 = a22 != null && a22.verified;
            h2Var.U = new ly0(p11, 13.0f, org.telegram.messenger.g0.o());
            if (objArr2 == true) {
                h2Var.V = h2Var.getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
            } else {
                h2Var.V = null;
                h2Var.W = null;
            }
        }
        org.telegram.ui.ActionBar.x q10 = x2Var.q();
        q10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(this.I).b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                xVar = q10;
                userFull = b22;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            xVar = q10;
            userFull = b22;
            if (tL_attachMenuBot.bot_id == this.J) {
                break;
            }
            q10 = xVar;
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
                hp.s1(this.I).W2(a22, 0, true, new a2(this, 1 == true ? 1 : 0));
            }
            if (q4Var.p) {
                C(z11, z10, this.g0);
            }
        }
        if (this.M0 == null) {
            xVar2 = xVar;
            xVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            xVar2 = xVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.c0 = g2Var;
        org.telegram.ui.ActionBar.q0 d = xVar2.d(0, g2Var);
        this.b0 = d;
        d.setOnClickListener(new c2(this, 1));
        x2Var.setActionBarMenuOnItemClick(new j2(this, 0));
        JSONObject u10 = u(e6Var, false);
        s2 s2Var = this.E;
        s2Var.setBotUser(a22);
        if (objArr == false) {
            s2Var.s(this.I, this.J);
            TLRPC.User user2 = q4Var.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                li.b0(this.I);
                if (!li.z0(li.d2, this.J)) {
                    if (user2 == null) {
                        user2 = hp.s1(this.I).a2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.K(user2.photo.photo_small, null, true, true).exists()) {
                            li.b0(this.I).l1(org.telegram.messenger.ac.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (q4Var.q != null) {
            s();
            return;
        }
        int i12 = q4Var.g;
        int i13 = hs.z1;
        int i14 = 4;
        int i15 = 2;
        switch (i12) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = hp.s1(this.I).j1(this.K);
                tL_messages_requestWebView.bot = hp.s1(this.I).o1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = q4Var.o;
                tL_messages_requestWebView.fullscreen = q4Var.p;
                String str = q4Var.f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    yy.C(this.I);
                    int i16 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i16;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = hp.s1(this.I).j1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = hp.s1(this.I).j1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new h2(this, 3));
                hs.f(this.I).c(this, i13);
                break;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (q4Var.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = hp.s1(this.I).o1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                tL_messages_requestSimpleWebView.from_side_menu = (q4Var.n & 2) != 0;
                tL_messages_requestSimpleWebView.compact = q4Var.o;
                tL_messages_requestSimpleWebView.fullscreen = q4Var.p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(q4Var.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = q4Var.f;
                }
                if (!TextUtils.isEmpty(q4Var.l)) {
                    tL_messages_requestSimpleWebView.start_param = q4Var.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new h2(this, i15));
                break;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = hp.s1(this.I).o1(this.J);
                tL_messages_requestWebView2.peer = hp.s1(this.I).j1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = q4Var.o;
                tL_messages_requestWebView2.fullscreen = q4Var.p;
                tL_messages_requestWebView2.url = q4Var.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new h2(this, 1));
                hs.f(this.I).c(this, i13);
                break;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = q4Var.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = q4Var.k;
                tL_messages_requestAppWebView.platform = "android";
                if (d2Var instanceof wm) {
                    wm wmVar = (wm) d2Var;
                    n12 = wmVar.j() != null ? hp.n1(wmVar.j()) : hp.l1(wmVar.e);
                } else {
                    n12 = hp.n1(q4Var.m);
                }
                tL_messages_requestAppWebView.peer = n12;
                tL_messages_requestAppWebView.compact = q4Var.o;
                tL_messages_requestAppWebView.fullscreen = q4Var.p;
                if (!TextUtils.isEmpty(q4Var.l)) {
                    tL_messages_requestAppWebView.start_param = q4Var.l;
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
                tL_messages_requestMainWebView.bot = hp.s1(this.I).o1(q4Var.c);
                tL_messages_requestMainWebView.platform = "android";
                if (d2Var instanceof wm) {
                    wm wmVar2 = (wm) d2Var;
                    j12 = wmVar2.j() != null ? hp.n1(wmVar2.j()) : hp.l1(wmVar2.e);
                } else {
                    j12 = hp.s1(this.I).j1(q4Var.b);
                }
                tL_messages_requestMainWebView.peer = j12;
                tL_messages_requestMainWebView.compact = q4Var.o;
                tL_messages_requestMainWebView.fullscreen = q4Var.p;
                if (!TextUtils.isEmpty(q4Var.l)) {
                    tL_messages_requestMainWebView.start_param = q4Var.l;
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
                tL_messages_requestChatJoinWebView.query_id = q4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new c3.b(1), new gi.q4(this, 10), 66);
                break;
            case 6:
                if (!this.G0) {
                    s2Var.t(this.I, q4Var.f, false);
                    break;
                }
                break;
        }
    }

    public final void y(final int i3, boolean z10, boolean z11) {
        final int i10 = this.S;
        k6.b(0.35f, -0.1f, i3);
        final u1 u1Var = new u1();
        int i11 = this.W ? this.S : 0;
        SparseIntArray sparseIntArray = u1Var.a;
        e6 e6Var = this.G;
        u1Var.c(sparseIntArray, i11, e6Var);
        this.W = z10;
        this.U = i0.a.h(i3) < 0.7210000157356262d;
        u1Var.c(u1Var.b, this.W ? i3 : 0, e6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(xq.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ii.d2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i10, i3);
                    a3 a3Var = a3.this;
                    a3Var.S = f10;
                    a3Var.l();
                    z2 z2Var = a3Var.f;
                    z2Var.invalidate();
                    x2 x2Var = a3Var.Y;
                    x2Var.setBackgroundColor(a3Var.S);
                    u1 u1Var2 = u1Var;
                    u1Var2.b(x2Var, floatValue);
                    a3Var.a = u1Var2.a(k6.wj);
                    z2Var.invalidate();
                }
            });
            duration.addListener(new q2(this, i10, i3, u1Var));
            duration.start();
        } else {
            this.S = i3;
            l();
            z2 z2Var = this.f;
            z2Var.invalidate();
            int i12 = this.S;
            x2 x2Var = this.Y;
            x2Var.setBackgroundColor(i12);
            u1Var.b(x2Var, 1.0f);
            this.a = u1Var.a(k6.wj);
            z2Var.invalidate();
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
            org.telegram.messenger.g0.Q3(p());
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final /* synthetic */ void b(boolean z10) {
    }
}

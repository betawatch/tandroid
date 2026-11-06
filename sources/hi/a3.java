package hi;

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
import bi.q9;
import c8.ha;
import fi.h9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ah;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.gq0;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class a3 extends Dialog implements ls, org.telegram.ui.ActionBar.h3 {
    public static final HashSet a1 = new HashSet();
    public static final lt0 b1;
    public static int c1;
    public Boolean A0;
    public boolean B0;
    public v0 C0;
    public final s2 D;
    public boolean D0;
    public final y2 E;
    public org.telegram.ui.ActionBar.c3 E0;
    public final f6 F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public float H0;
    public long I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public int K0;
    public int L;
    public s51 L0;
    public long M;
    public Drawable M0;
    public String N;
    public final HashMap N0;
    public final Paint O;
    public k60 O0;
    public final Paint P;
    public f0 P0;
    public final Paint Q;
    public boolean Q0;
    public int R;
    public float R0;
    public int S;
    public ValueAnimator S0;
    public boolean T;
    public ValueAnimator T0;
    public final Paint U;
    public boolean U0;
    public boolean V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final x2 X;
    public String X0;
    public final FrameLayout.LayoutParams Y;
    public org.telegram.ui.b3 Y0;
    public final Drawable Z;
    public boolean Z0;
    public int a;
    public org.telegram.ui.ActionBar.r0 a0;
    public int b;
    public org.telegram.messenger.g2 b0;
    public float c;
    public boolean c0;
    public r1.g d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final z2 f;
    public boolean f0;
    public float g0;
    public final Rect h;
    public float h0;
    public boolean i0;
    public int j0;
    public int k0;
    public Activity l0;
    public final w2 m0;
    public final Rect n;
    public final org.telegram.messenger.h2 n0;
    public cc o0;
    public e0 p0;
    public final FrameLayout q0;
    public int r;
    public final FrameLayout.LayoutParams r0;
    public final org.telegram.ui.ActionBar.d3 s;
    public boolean s0;
    public final ec0 t0;
    public final x1 u0;
    public int v0;
    public final r7 w;
    public q4 w0;
    public final r2 x;
    public boolean x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        lt0 lt0Var = new lt0(new g2.c(25), new g2.c(26));
        lt0Var.c = 100.0f;
        b1 = lt0Var;
        c1 = 0;
    }

    public a3(Context context, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.c = 0.0f;
        this.h = new Rect();
        this.n = new Rect();
        int i7 = 0;
        this.r = 0;
        int i10 = 1;
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint();
        this.P = paint2;
        this.Q = new Paint(1);
        this.U = new Paint(1);
        this.u0 = new x1(this, i10);
        this.v0 = -1;
        this.z0 = false;
        this.A0 = null;
        this.I0 = true;
        this.N0 = new HashMap();
        this.Q0 = false;
        this.U0 = true;
        this.Z0 = false;
        this.F = f6Var;
        int x02 = k6.x0(null, k6.wj, false);
        this.b = x02;
        this.a = x02;
        r2 r2Var = new r2(i7, context, this);
        this.x = r2Var;
        r2Var.setAllowFullSizeSwipe(true);
        r2Var.setShouldWaitWebViewScroll(true);
        int i11 = k6.d6;
        s2 s2Var = new s2(this, context, f6Var, k6.w0(i11, f6Var), 0);
        this.D = s2Var;
        s2Var.setOnVerifiedAge(this.L0);
        s2Var.setDelegate(new v2(this, context, f6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.R = k6.w0(i11, f6Var);
        int w02 = k6.w0(k6.a7, f6Var);
        this.S = w02;
        org.telegram.messenger.g0.u3(this, w02, false, null);
        z2 z2Var = new z2(this, context);
        this.f = z2Var;
        z2Var.setDelegate(new z1(this, i7));
        FrameLayout.LayoutParams e10 = ha.e(-1, -1, 49);
        this.y = e10;
        z2Var.addView(r2Var, e10);
        w2 w2Var = new w2(this, getContext(), f6Var);
        this.m0 = w2Var;
        w2Var.setOnButtonClickListener(new a2(this, i7));
        w2Var.setOnResizeListener(new x1(this, 3));
        z2Var.addView(w2Var, ha.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.n0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        int i12 = 2;
        boolean z9 = !qp.s1(this.H).G6 && iz.o() >= 2;
        this.f0 = z9;
        h2Var.setParentRenderNode(z9 ? r2Var.getRenderNode() : null);
        z2Var.addView(h2Var, ha.e(-1, -1, qs.E1));
        h2Var.setOnCloseClickListener(new x1(this, 4));
        h2Var.setOnCollapseClickListener(new x1(this, 5));
        h2Var.setOnMenuClickListener(new x1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.q0 = frameLayout;
        FrameLayout.LayoutParams e11 = ha.e(-1, qs.e3, 55);
        this.r0 = e11;
        z2Var.addView(frameLayout, e11);
        this.Z = getContext().getDrawable(R.drawable.header_shadow).mutate();
        x2 x2Var = new x2(context, f6Var);
        this.X = x2Var;
        x2Var.setBackgroundColor(0);
        x2Var.setBackButtonImage(R.drawable.ic_close_white);
        F();
        x2Var.setActionBarMenuOnItemClick(new k2(this, i10));
        x2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = ha.e(-1, -2, 49);
        this.Y = e12;
        z2Var.addView(x2Var, e12);
        y2 y2Var = new y2(context, f6Var);
        this.E = y2Var;
        z2Var.addView(y2Var, ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        s2Var.setWebViewProgressListener(new q9(this, i12));
        r2Var.addView(s2Var, ha.c(-1.0f, -1));
        r2Var.setScrollListener(new x1(this, 7));
        r2Var.setScrollEndListener(new x1(this, 8));
        r2Var.setDelegate(new y1(this));
        r2Var.setIsKeyboardVisible(new y1(this));
        ec0 ec0Var = new ec0(context);
        this.t0 = ec0Var;
        z2Var.addView(ec0Var, ha.c(-1.0f, -1));
        setContentView(z2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.d3 O = launchActivity != null ? launchActivity.O() : null;
        this.s = O;
        if (O != null) {
            h9 h9Var = new h9(z2Var, 18);
            x1 x1Var = new x1(this, i12);
            O.I.add(h9Var);
            O.J.add(x1Var);
            this.w = new r7(O);
        }
    }

    public static /* synthetic */ void f(a3 a3Var) {
        if (a3Var.Q0) {
            return;
        }
        super.dismiss();
        a3Var.Q0 = true;
    }

    public static WindowInsets h(a3 a3Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).a;
        i0.b f10 = h1Var.f(2);
        a3Var.h.set(f10.a, f10.b, f10.c, f10.d);
        i0.b f11 = h1Var.f(647);
        Rect rect = a3Var.n;
        rect.set(Math.max(f11.a, windowInsets.getStableInsetLeft()), Math.max(f11.b, windowInsets.getStableInsetTop()), Math.max(f11.c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 29) {
            Activity W = org.telegram.messenger.g0.W(a3Var.getContext());
            WindowInsets rootWindowInsets = (W == null || W.getWindow() == null) ? null : W.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                rect.set(Math.max(rect.left, rootWindowInsets.getStableInsetLeft()), Math.max(rect.top, rootWindowInsets.getStableInsetTop()), Math.max(rect.right, rootWindowInsets.getStableInsetRight()), Math.max(rect.bottom, rootWindowInsets.getStableInsetBottom()));
            }
        }
        if (i7 <= 29) {
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
        return i7 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i7).b.bots;
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
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(hd.M0(2131747830, null), new n1(i7, j3, tL_attachMenuBot, runnable));
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(f6 f6Var, final boolean z9) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = k6.w(-16777216, k6.w0(k6.h5, f6Var));
            d20 d20Var = new d20() { // from class: hi.f2
                @Override // org.telegram.messenger.d20
                public final Object a(Object obj) {
                    int w11 = k6.w(w10, ((Integer) obj).intValue());
                    return z9 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11))) : Integer.valueOf(w11);
                }
            };
            jSONObject.put("bg_color", d20Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", d20Var.a(Integer.valueOf(k6.w0(k6.d6, f6Var))));
            int i7 = k6.a7;
            jSONObject.put("secondary_bg_color", d20Var.a(Integer.valueOf(k6.w0(i7, f6Var))));
            jSONObject.put("text_color", d20Var.a(Integer.valueOf(k6.w0(k6.G6, f6Var))));
            jSONObject.put("hint_color", d20Var.a(Integer.valueOf(k6.w0(k6.H6, f6Var))));
            jSONObject.put("link_color", d20Var.a(Integer.valueOf(k6.w0(k6.J6, f6Var))));
            jSONObject.put("button_color", d20Var.a(Integer.valueOf(k6.w0(k6.Ci, f6Var))));
            jSONObject.put("button_text_color", d20Var.a(Integer.valueOf(k6.w0(k6.Gi, f6Var))));
            jSONObject.put("header_bg_color", d20Var.a(Integer.valueOf(k6.w0(k6.s8, f6Var))));
            jSONObject.put("accent_text_color", d20Var.a(Integer.valueOf(k6.w0(k6.q6, f6Var))));
            jSONObject.put("section_header_text_color", d20Var.a(Integer.valueOf(k6.w0(k6.L6, f6Var))));
            jSONObject.put("subtitle_text_color", d20Var.a(Integer.valueOf(k6.w0(k6.z6, f6Var))));
            jSONObject.put("destructive_text_color", d20Var.a(Integer.valueOf(k6.w0(k6.p7, f6Var))));
            jSONObject.put("section_separator_color", d20Var.a(Integer.valueOf(k6.w0(k6.d7, f6Var))));
            jSONObject.put("bottom_bar_bg_color", d20Var.a(Integer.valueOf(k6.w0(i7, f6Var))));
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void A(int i7, boolean z9) {
        Paint paint = this.Q;
        int color = paint.getColor();
        this.W = true;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (z9) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.T0 = duration;
            duration.setInterpolator(xq.f);
            this.T0.addUpdateListener(new v1(this, color, i7, i10));
            this.T0.addListener(new m2(this, i7, i10));
            this.T0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f.invalidate();
        org.telegram.ui.b3 b3Var = this.Y0;
        if (b3Var != null) {
            b3Var.b(org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f, false);
            this.Y0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z9) {
        if (this.z0 != z9) {
            this.z0 = z9;
            r2 r2Var = this.x;
            if (r2Var != null) {
                r2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z9, boolean z10, boolean z11) {
        float f10;
        if (this.e0 == z9) {
            return;
        }
        this.e0 = z9;
        this.f0 = z11 && !qp.s1(this.H).G6 && iz.o() >= 2;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.n0;
        r2 r2Var = this.x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.a0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.M = z9;
            if (!z10) {
                h2Var.N.f(z9, true);
            }
            h2Var.invalidate();
            if (z9) {
                org.telegram.messenger.g0.i3(aVar, 2500L);
            }
            h2Var.setParentRenderNode(this.f0 ? r2Var.getRenderNode() : null);
        }
        this.j0 = r2Var.getWidth();
        this.k0 = r2Var.getHeight();
        this.U0 = false;
        w2 w2Var = this.m0;
        s2 s2Var = this.D;
        x2 x2Var = this.X;
        if (!z10) {
            this.i0 = false;
            this.g0 = z9 ? 1.0f : 0.0f;
            this.h0 = 0.0f;
            I();
            L();
            x2Var.setVisibility(z9 ? 8 : 0);
            x2Var.setAlpha(1.0f - this.g0);
            x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.g0);
            w2Var.setTranslationX(0.0f);
            h2Var.setAlpha(this.g0);
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
            int i7 = org.telegram.messenger.g0.q.x;
            f10 = (i7 - ((int) (Math.min(i7, r12.y) * 0.8f))) / 2.0f;
        }
        float f11 = z9 ? this.n.left + f10 : (-r13) - f10;
        if (!z9) {
            f10 = -f10;
        }
        float translationY = z9 ? r2Var.getTranslationY() : -org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight = z9 ? -org.telegram.messenger.g0.L(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        r1.g gVar = r2Var.w;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = r2Var.G;
        if (gVar2 != null) {
            gVar2.d();
        }
        r2Var.setSwipeOffsetAnimationDisallowed(true);
        x2Var.setVisibility(0);
        if (z9) {
            r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
        } else {
            r2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
        }
        r2Var.c();
        r2Var.invalidate();
        this.h0 = 0.0f;
        float f12 = z9 ? 0.0f : 1.0f;
        this.g0 = f12;
        x2Var.setAlpha(1.0f - f12);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.g0);
        r2Var.setTranslationY(org.telegram.messenger.g0.T1(translationY, currentActionBarHeight, this.h0));
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.h0));
        w2Var.setTranslationX(org.telegram.messenger.g0.T1(f10, 0.0f, this.h0));
        h2Var.setAlpha(this.g0);
        this.f.invalidate();
        s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - currentActionBarHeight);
        s2Var.n(false, false);
        this.i0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V0 = ofFloat;
        float f13 = f11;
        ofFloat.addUpdateListener(new n2(this, z9, translationY, currentActionBarHeight, f13, f10));
        this.V0.addListener(new o2(this, z9, currentActionBarHeight2, f13));
        this.V0.setDuration(280L);
        this.V0.setInterpolator(xq.h);
        this.V0.start();
    }

    public final void D(int i7, boolean z9) {
        int i10 = 0;
        this.I0 = false;
        int i11 = this.S;
        w2 w2Var = this.m0;
        Paint paint = w2Var.a;
        w2Var.e.b = i7;
        paint.setColor(i7);
        int i12 = 1;
        if (!z9) {
            w2Var.d.a(i7, true);
        }
        if (z9) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(xq.f);
            duration.addUpdateListener(new v1(this, i11, i7, i12));
            duration.addListener(new p2(this, i11, i7, i10));
            duration.start();
        } else {
            this.S = i7;
            l();
        }
        org.telegram.messenger.g0.u3(this, this.S, false, null);
    }

    public final void E(boolean z9) {
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.R0 - (z9 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, z9 ? 1.0f : 0.0f);
        this.S0 = ofFloat;
        ofFloat.addListener(new ch.y(14, this, z9));
        this.S0.addUpdateListener(new w1(this, 0));
        this.S0.setInterpolator(xq.h);
        this.S0.setDuration(220L);
        this.S0.start();
    }

    public final void F() {
        if (!this.V) {
            int i7 = k6.G6;
            f6 f6Var = this.F;
            int w02 = k6.w0(i7, f6Var);
            x2 x2Var = this.X;
            x2Var.setTitleColor(w02);
            x2Var.D(k6.w0(i7, f6Var), false);
            x2Var.C(k6.w0(k6.u8, f6Var), false);
            x2Var.E(k6.w0(k6.G8, f6Var), false);
            x2Var.G(k6.w0(k6.E8, f6Var), false, false);
            x2Var.G(k6.w0(k6.F8, f6Var), true, false);
            x2Var.H(k6.w0(k6.I5, f6Var), false);
        }
        this.D.setFlickerViewColor(this.Q.getColor());
    }

    public final void G() {
        cc ccVar;
        boolean z9;
        g0 c10 = g0.c(getContext(), this.H, this.I);
        ArrayList arrayList = c10.e;
        f0 f0Var = c10.f;
        boolean z10 = true;
        if (f0Var == null) {
            cc ccVar2 = this.o0;
            if (ccVar2 != null) {
                ccVar2.b();
                this.o0 = null;
            }
        } else if ((!f0Var.c() || f0Var.l) && !f0Var.k) {
            e0 e0Var = this.p0;
            if (e0Var != null) {
                this.P0 = f0Var;
                if (e0Var.c(f0Var)) {
                    this.o0 = null;
                }
            }
        } else {
            if (this.P0 != f0Var && (ccVar = this.o0) != null) {
                ccVar.b();
                this.o0 = null;
            }
            cc ccVar3 = this.o0;
            if (ccVar3 == null || !ccVar3.l) {
                this.P0 = f0Var;
                e0 e0Var2 = new e0(getContext(), this.F);
                this.p0 = e0Var2;
                cc f10 = cc.f(this.q0, e0Var2, 5000);
                this.o0 = f10;
                f10.k(true);
            }
            if (this.p0.c(f0Var)) {
                this.o0 = null;
            }
            f0Var.k = false;
            f0Var.l = true;
        }
        H();
        for (Map.Entry entry : this.N0.entrySet()) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) entry.getValue();
            f0 f0Var2 = (f0) entry.getKey();
            z0Var.setText(f0Var2.c);
            if (f0Var2.c()) {
                Pair b10 = f0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            } else {
                z0Var.setSubtext(org.telegram.messenger.g0.i0(f0Var2.g, false, false));
            }
            if (f0Var2.c()) {
                z0Var.setRightIcon(R.drawable.msg_close);
                z0Var.b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (f0Var2.i) {
                z0Var.setVisibility(8);
            } else {
                z0Var.setRightIcon(0);
                z0Var.b.setPadding(0, 0, 0, 0);
            }
            z0Var.setOnClickListener(new bi.r(17, this, f0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.b0;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z9 = false;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            if (((f0) obj).c()) {
                z9 = true;
                break;
            }
        }
        if (g2Var.e != z9) {
            g2Var.e = z9;
            g2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                z10 = false;
                break;
            }
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((f0) obj2).c()) {
                break;
            }
        }
        this.n0.setDownloading(z10);
    }

    public final void H() {
        e0 e0Var = this.p0;
        if (e0Var == null) {
            return;
        }
        if (this.e0) {
            e0Var.setArrow(org.telegram.messenger.g0.W1(this.g0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.c > 0.5f) {
            e0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            e0Var.setArrow(-1);
        }
    }

    public final void I() {
        org.telegram.messenger.h2 h2Var = this.n0;
        Rect rect = this.n;
        h2Var.setInsets(rect);
        boolean z9 = this.e0;
        s2 s2Var = this.D;
        z2 z2Var = this.f;
        w2 w2Var = this.m0;
        if (z9) {
            int i7 = (w2Var == null || w2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.r <= i7 && (w2Var == null || w2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int L = org.telegram.messenger.g0.L(46.0f);
            s2Var.Q(rect2, false);
            s2Var.P(L, false);
            z2Var.setPadding(0, 0, 0, Math.max(this.r, i7));
        } else {
            s2Var.Q(new Rect(0, 0, 0, 0), false);
            s2Var.P(0, false);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = this.r;
            org.telegram.ui.ActionBar.d3 d3Var = this.s;
            z2Var.setPadding(i10, 0, i11, Math.max(i12, (d3Var != null ? d3Var.H : 0) + rect.bottom));
        }
        this.y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z10 = this.e0;
        int i13 = !z10 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.Y;
        layoutParams.leftMargin = i13;
        layoutParams.rightMargin = 0;
        int i14 = !z10 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.r0;
        layoutParams2.leftMargin = i14;
        layoutParams2.rightMargin = !z10 ? 0 : rect.right;
        boolean z11 = this.i0;
        r2 r2Var = this.x;
        if (!z11) {
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.e0) {
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
        h2Var.setVisibility(this.e0 ? 0 : 8);
    }

    public final void J() {
        boolean z9;
        if (this.V) {
            z9 = !this.T;
        } else {
            z9 = !org.telegram.messenger.g0.Q1() && i0.a.h(k6.x0(null, k6.d6, true)) >= 0.7210000157356262d && this.c >= 0.85f;
        }
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z9) {
            this.e = Boolean.valueOf(z9);
            z2 z2Var = this.f;
            int systemUiVisibility = z2Var.getSystemUiVisibility();
            z2Var.setSystemUiVisibility(z9 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
    }

    public final void K() {
        org.telegram.ui.web.u0 webView;
        s2 s2Var = this.D;
        if (s2Var == null || (webView = s2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.Q.getColor());
    }

    public final void L() {
        w2 w2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i7 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z9 = this.e0;
            if (z9) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            z2 z2Var = this.f;
            if (!z9 || (((w2Var = this.m0) != null && w2Var.getTotalHeight() > 0) || z2Var.g0)) {
                z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
            } else {
                z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void a(boolean z9) {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final org.telegram.ui.ActionBar.c3 c() {
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3();
        c3Var.q = this.R;
        c3Var.p = this.v0;
        c3Var.n = this.V;
        c3Var.o = this.W;
        c3Var.r = this.Q.getColor();
        c3Var.a = this.w0;
        s2 s2Var = this.D;
        c3Var.t = s2Var != null && s2Var.N;
        c3Var.D = k6.I.q();
        c3Var.x = s2Var != null ? s2Var.getUrlLoaded() : null;
        c3Var.e = s2Var != null && s2Var.t0;
        c3Var.f = s2Var != null ? s2Var.getTrustedOrigin() : null;
        r2 r2Var = this.x;
        c3Var.j = (r2Var != null && r2Var.getSwipeOffsetY() < 0.0f) || this.y0 || r() || this.e0;
        c3Var.z = this.e0;
        c3Var.A = this.f0;
        Boolean bool = this.A0;
        c3Var.B = bool == null ? this.z0 : bool.booleanValue();
        c3Var.k = r2Var != null ? r2Var.getOffsetY() : Float.MAX_VALUE;
        c3Var.C = this.B0;
        c3Var.u = this.x0;
        c3Var.y = this.s0;
        c3Var.v = this.c0;
        c3Var.l = r2Var == null || r2Var.M;
        c3Var.w = this.m0.e;
        c3Var.s = this.S;
        v0 v0Var = this.C0;
        if (v0Var != null) {
            v0Var.b();
        }
        c3Var.K = this.C0;
        org.telegram.ui.web.u0 webView = s2Var != null ? s2Var.getWebView() : null;
        if (webView != null) {
            s2Var.M();
            c3Var.b = webView;
            c3Var.d = s2Var.getBotProxy();
            c3Var.g = webView.getWidth();
            c3Var.h = webView.getHeight();
            webView.onPause();
        }
        boolean z9 = this.W0;
        c3Var.G = z9;
        if (z9) {
            c3Var.H = this.X0;
        }
        c3Var.L = this.D0;
        this.E0 = c3Var;
        return c3Var;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final org.telegram.ui.ActionBar.i3 d() {
        return this.f;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.z1) {
            if (this.K == ((Long) objArr[0]).longValue()) {
                o(false);
                return;
            }
            return;
        }
        if (i7 != qs.n4) {
            if (i7 == qs.J3) {
                G();
            }
        } else {
            this.f.invalidate();
            this.D.n.b(k6.w0(k6.d6, this.F), qs.j2);
            F();
            J();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final int e(int i7) {
        return i0.a.f(this.R0, i7, this.S);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean i(org.telegram.ui.ActionBar.z2 z2Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z9) {
        if (botappsettings == null) {
            return;
        }
        boolean q10 = k6.I.q();
        int i7 = botappsettings.flags;
        boolean z10 = ((q10 ? 4 : 2) & i7) != 0;
        if ((i7 & (q10 ? 16 : 8)) != 0) {
            y((q10 ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z9);
        }
        if (z10) {
            A((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z9);
            D((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z9);
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.Q0 && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.F(true, true, true);
        }
        z2 z2Var = this.f;
        if (z2Var != null) {
            z2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Y0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Y0 = b3Var;
            this.x.addView(b3Var, ha.c(-1.0f, -1));
            this.Y0.setTranslationY(-1.0f);
            this.Y0.h.setOnClickListener(new c2(this, 0));
            this.Y0.setBackgroundColor(this.Q.getColor());
            org.telegram.messenger.g0.Z3(this.Y0, this.W0, 1.0f, true, false);
        }
    }

    public final void o(boolean z9) {
        LaunchActivity launchActivity;
        if (this.d0) {
            return;
        }
        if (this.L0 != null) {
            z9 = false;
        }
        this.d0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.u0);
        qs.f(this.H).n(this, qs.z1);
        qs.f(this.H).n(this, qs.J3);
        qs.e().n(this, qs.n4);
        if (z9 && ((launchActivity = LaunchActivity.G1) == null || launchActivity.w0 == null)) {
            z9 = false;
        }
        if (z9) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.m.i = 0.0f;
                gVar.h();
            }
            LaunchActivity.G1.w0.b(this);
        } else {
            w2 w2Var = this.m0;
            if (w2Var != null) {
                w2Var.animate().translationY(w2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(xq.h).start();
            }
            this.D.h();
            r2 r2Var = this.x;
            int height = r2Var.getHeight() + (w2Var != null ? w2Var.getTotalHeight() : 0);
            Rect rect = this.n;
            r2Var.f(this.f.Q() + height + rect.top + rect.bottom + (r() ? org.telegram.messenger.g0.L(200.0f) : 0), true, new x1(this, 0));
        }
        a1.remove(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, b1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.m = hVar;
            this.d = gVar;
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.t0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.D.D()) {
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
        if (this.e0) {
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
        if (!this.e0 || ((w2Var = this.m0) != null && w2Var.getTotalHeight() > 0)) {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
        } else {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
        }
        if (i7 >= 26) {
            org.telegram.messenger.g0.n3(this, i0.a.h(this.S) >= 0.7210000157356262d);
        }
        qs.e().c(this, qs.n4);
        qs.f(this.H).c(this, qs.J3);
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
            ((LaunchActivity) context).z0.add(this.t0);
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
            ((LaunchActivity) context).z0.remove(this.t0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.G1;
        }
        return ownerActivity == null ? org.telegram.messenger.g0.W(getContext()) : ownerActivity;
    }

    public final boolean q() {
        q4 q4Var = this.w0;
        return q4Var != null && q4Var.g == 6;
    }

    public final boolean r() {
        if (this.e0) {
            return true;
        }
        Boolean bool = this.A0;
        return bool == null ? this.z0 : bool.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void release() {
        if (this.Q0) {
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
        boolean z9;
        if (this.w0 == null) {
            return;
        }
        long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.w0.r));
        TLRPC.TL_topPeer tL_topPeer = null;
        this.A0 = null;
        TLObject tLObject = this.w0.q;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.K = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z9 = tL_webViewResultUrl.same_origin;
            this.A0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z10 = this.F0;
            if (!z10) {
                C(tL_webViewResultUrl.fullscreen, !z10, this.f0);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.K = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.K = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            } else {
                str = null;
            }
            z9 = false;
        }
        if (str != null && !this.F0) {
            ui b02 = ui.b0(this.H);
            long j3 = this.w0.c;
            TLRPC.User a22 = b02.getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null && a22.bot) {
                int max2 = b02.getUserConfig().G != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().G) : 60;
                int i7 = 0;
                while (true) {
                    if (i7 >= b02.l1.size()) {
                        break;
                    }
                    TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.l1.get(i7);
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
                    b02.l1.add(tL_topPeer);
                }
                tL_topPeer.rating = Math.exp(max2 / b02.getMessagesController().Z2) + tL_topPeer.rating;
                Collections.sort(b02.l1, new jg.x(21));
                if (b02.l1.size() > 20) {
                    a8.p0.z(1, b02.l1);
                }
                b02.getMessagesStorage().a.c(new ah(b02, j3, 2, tL_topPeer.rating));
                b02.getNotificationCenter().k(qs.V0, new Object[0]);
            }
            this.D.t(this.H, str, z9);
        }
        org.telegram.messenger.g0.i3(this.u0, max);
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
            this.Q0 = false;
            a1.add(this);
        }
    }

    public final void t(boolean z9) {
        if (this.D0 == z9) {
            return;
        }
        this.D0 = z9;
        if (this.Z0) {
            if (z9) {
                c1++;
            } else {
                c1--;
            }
        }
        if (c1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.Q3(p());
        }
    }

    public final boolean v() {
        if (!this.s0) {
            o(false);
            return true;
        }
        TLRPC.User a22 = qp.s1(this.H).a2(Long.valueOf(this.I));
        String m10 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = m10;
        u1Var.T = hd.M0(2131752917, null);
        alertDialog$Builder.k(hd.M0(2131752916, null), new y1(this));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        u1Var.show();
        ((TextView) u1Var.d(-1)).setTextColor(k6.w0(k6.q7, this.F));
        return false;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i7;
        ArrayList arrayList;
        int i10;
        boolean q10 = q();
        TLRPC.User a22 = qp.s1(this.H).a2(Long.valueOf(this.I));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = ui.b0(this.H).b.bots;
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
            if (tL_attachMenuBot.bot_id == this.I) {
                break;
            }
        }
        k60 k60Var = this.O0;
        if (k60Var != null) {
            k60Var.u();
        }
        k60 G = k60.G(this.f, this.F, this.e0 ? this.n0 : this.a0, true);
        this.O0 = G;
        ArrayList arrayList3 = g0.c(getContext(), this.H, this.I).e;
        HashMap hashMap = this.N0;
        hashMap.clear();
        int i12 = 14;
        if (arrayList3.isEmpty()) {
            i7 = -1;
        } else {
            k60 J = G.J();
            J.c(R.drawable.msg_arrow_back, hd.M0(2131753756, null), new gq0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                f0 f0Var = (f0) obj;
                String str = f0Var.c;
                ai.m0 m0Var = new ai.m0(i12);
                f6 f6Var = J.d;
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
                        z0Var.c(k6.E8, k6.F8);
                    } else {
                        int intValue = num != null ? num.intValue() : k6.w0(k6.E8, f6Var);
                        Integer num2 = J.k0;
                        z0Var.d(intValue, num2 != null ? num2.intValue() : k6.w0(k6.F8, f6Var));
                    }
                    Integer num3 = J.l0;
                    if (num3 != null) {
                        z0Var.setSelectorColor(num3.intValue());
                    } else {
                        z0Var.h(0.12f, k6.E8);
                    }
                    z0Var.setOnClickListener(new org.telegram.ui.Components.h0(J, m0Var));
                    int i14 = J.S;
                    if (i14 > 0) {
                        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i14));
                        J.r(z0Var, ha.o(J.S, -2));
                    } else {
                        J.r(z0Var, ha.o(-1, -2));
                        hashMap.put(f0Var, J.y());
                        size2 = i10;
                        arrayList3 = arrayList;
                        i12 = 14;
                    }
                }
                hashMap.put(f0Var, J.y());
                size2 = i10;
                arrayList3 = arrayList;
                i12 = 14;
            }
            i7 = -1;
            G();
            J.S = org.telegram.messenger.g0.L(180.0f);
            G.c(R.drawable.menu_download_round, hd.M0(2131753094, null), new h2(G, J, 0), false);
            G.k();
        }
        G.l(R.drawable.msg_bot, hd.M0(2131752912, null), new x1(this, 9), this.L0 == null && !q10);
        int i15 = 10;
        G.l(R.drawable.msg_settings, hd.M0(2131752897, null), new x1(this, i15), this.L0 == null && this.c0);
        G.c(R.drawable.msg_retry, hd.M0(2131752911, null), new bi.k1(i15, this, q10), false);
        G.l(R.drawable.msg_home, hd.M0(2131754390, null), new x1(this, 11), this.L0 == null && a22 != null && a22.bot_has_main_app);
        G.l(R.drawable.menu_intro, hd.M0(2131752894, null), new x1(this, 12), this.L0 == null && !q10);
        G.l(R.drawable.msg_report, hd.M0(2131752910, null), new x1(this, 13), this.L0 == null && !q10);
        G.l(R.drawable.msg_delete, hd.M0(2131752915, null), new x1(this, 14), this.L0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.R != k6.x0(null, k6.d6, false)) {
            int i16 = org.telegram.messenger.g0.B(this.R) >= 0.721f ? i7 : -15198183;
            int i17 = org.telegram.messenger.g0.B(i16) >= 0.721f ? -16777216 : i7;
            int r12 = k6.r1(0.85f, i17);
            int r13 = k6.r1(0.1f, i17);
            G.P(i16);
            for (int i18 = 0; i18 < G.x(); i18++) {
                View w10 = G.w(i18);
                if (w10 instanceof org.telegram.ui.ActionBar.z0) {
                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) w10;
                    z0Var2.d(i17, r12);
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
    public final void x(org.telegram.ui.ActionBar.f2 f2Var, q4 q4Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        TLRPC.InputPeer n1;
        TLRPC.InputPeer j12;
        boolean z9;
        boolean z10;
        TL_bots.botAppSettings botappsettings;
        this.w0 = q4Var;
        int i7 = q4Var.a;
        this.H = i7;
        this.J = q4Var.b;
        this.I = q4Var.c;
        this.L = q4Var.h;
        this.M = q4Var.i;
        this.N = q4Var.e;
        int i10 = 1;
        Object[] objArr = q4Var.g == 6;
        TLRPC.User a22 = objArr != false ? null : qp.s1(i7).a2(Long.valueOf(this.I));
        CharSequence p10 = objArr != false ? q4Var.e : t10.p(a22);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        x2 x2Var = this.X;
        x2Var.setTitle(p10);
        TLRPC.UserFull b22 = objArr != false ? null : qp.s1(this.H).b2(this.I);
        f6 f6Var = this.F;
        if ((a22 != null && a22.verified) || (b22 != null && (user = b22.user) != null && user.verified)) {
            this.M0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            r6.y(x2Var.getTitleTextView(), this.M0, k6.Ci, f6Var, PorterDuff.Mode.SRC_IN);
            this.M0.setAlpha(qs.e4);
            x2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            x2Var.getTitleTextView().i(new fi.l3(this, i10));
        }
        org.telegram.messenger.h2 h2Var = this.n0;
        if (h2Var != null) {
            String p11 = objArr != false ? q4Var.e : t10.p(a22);
            Object[] objArr2 = a22 != null && a22.verified;
            h2Var.T = new my0(p11, 13.0f, org.telegram.messenger.g0.o());
            if (objArr2 == true) {
                h2Var.U = h2Var.getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
                h2Var.V = h2Var.getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
            } else {
                h2Var.U = null;
                h2Var.V = null;
            }
        }
        org.telegram.ui.ActionBar.y q10 = x2Var.q();
        q10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.H).b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                yVar = q10;
                userFull = b22;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            yVar = q10;
            userFull = b22;
            if (tL_attachMenuBot.bot_id == this.I) {
                break;
            }
            q10 = yVar;
            b22 = userFull;
        }
        if (!this.F0 && objArr == false) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo == null || (botappsettings = botInfo.app_settings) == null) {
                    z9 = false;
                } else {
                    z9 = false;
                    k(botappsettings, false);
                }
                z10 = true;
            } else {
                z9 = false;
                z10 = true;
                qp.s1(this.H).W2(a22, 0, true, new a2(this, 1 == true ? 1 : 0));
            }
            if (q4Var.p) {
                C(z10, z9, this.f0);
            }
        }
        if (this.L0 == null) {
            yVar2 = yVar;
            yVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.b0 = g2Var;
        org.telegram.ui.ActionBar.r0 d = yVar2.d(0, g2Var);
        this.a0 = d;
        d.setOnClickListener(new c2(this, 1));
        x2Var.setActionBarMenuOnItemClick(new k2(this, 0));
        JSONObject u10 = u(f6Var, false);
        s2 s2Var = this.D;
        s2Var.setBotUser(a22);
        if (objArr == false) {
            s2Var.s(this.H, this.I);
            TLRPC.User user2 = q4Var.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ui.b0(this.H);
                if (!ui.z0(ui.c2, this.I)) {
                    if (user2 == null) {
                        user2 = qp.s1(this.H).a2(Long.valueOf(this.I));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.H);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            ui.b0(this.H).l1(hc.l(this.H, 1, user2), 0);
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
        int i13 = qs.z1;
        int i14 = 4;
        int i15 = 2;
        switch (i12) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = qp.s1(this.H).j1(this.J);
                tL_messages_requestWebView.bot = qp.s1(this.H).o1(this.I);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = q4Var.o;
                tL_messages_requestWebView.fullscreen = q4Var.p;
                String str = q4Var.f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.L != 0) {
                    gz.C(this.H);
                    int i16 = this.L;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i16;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.M != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = qp.s1(this.H).j1(this.M);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.M != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = qp.s1(this.H).j1(this.M);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView, new i2(this, 3));
                qs.f(this.H).c(this, i13);
                break;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (q4Var.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = qp.s1(this.H).o1(this.I);
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
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestSimpleWebView, new i2(this, i15));
                break;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = qp.s1(this.H).o1(this.I);
                tL_messages_requestWebView2.peer = qp.s1(this.H).j1(this.I);
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
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView2, new i2(this, 1));
                qs.f(this.H).c(this, i13);
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
                if (f2Var instanceof an) {
                    an anVar = (an) f2Var;
                    n1 = anVar.j() != null ? qp.n1(anVar.j()) : qp.l1(anVar.e);
                } else {
                    n1 = qp.n1(q4Var.m);
                }
                tL_messages_requestAppWebView.peer = n1;
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
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestAppWebView, new i2(this, i14), 66);
                break;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = qp.s1(this.H).o1(q4Var.c);
                tL_messages_requestMainWebView.platform = "android";
                if (f2Var instanceof an) {
                    an anVar2 = (an) f2Var;
                    j12 = anVar2.j() != null ? qp.n1(anVar2.j()) : qp.l1(anVar2.e);
                } else {
                    j12 = qp.s1(this.H).j1(q4Var.b);
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
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestMainWebView, new i2(this, 5), 66);
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
                ConnectionsManager.getInstance(this.H).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new u1(this, 0), 66);
                break;
            case 6:
                if (!this.F0) {
                    s2Var.t(this.H, q4Var.f, false);
                    break;
                }
                break;
        }
    }

    public final void y(final int i7, boolean z9, boolean z10) {
        final int i10 = this.R;
        k6.b(0.35f, -0.1f, i7);
        final t1 t1Var = new t1();
        int i11 = this.V ? this.R : 0;
        SparseIntArray sparseIntArray = t1Var.a;
        f6 f6Var = this.F;
        t1Var.c(sparseIntArray, i11, f6Var);
        this.V = z9;
        this.T = i0.a.h(i7) < 0.7210000157356262d;
        t1Var.c(t1Var.b, this.V ? i7 : 0, f6Var);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(xq.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hi.d2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i10, i7);
                    a3 a3Var = a3.this;
                    a3Var.R = f10;
                    a3Var.l();
                    z2 z2Var = a3Var.f;
                    z2Var.invalidate();
                    x2 x2Var = a3Var.X;
                    x2Var.setBackgroundColor(a3Var.R);
                    t1 t1Var2 = t1Var;
                    t1Var2.b(x2Var, floatValue);
                    a3Var.a = t1Var2.a(k6.wj);
                    z2Var.invalidate();
                }
            });
            duration.addListener(new q2(this, i10, i7, t1Var));
            duration.start();
        } else {
            this.R = i7;
            l();
            z2 z2Var = this.f;
            z2Var.invalidate();
            int i12 = this.R;
            x2 x2Var = this.X;
            x2Var.setBackgroundColor(i12);
            t1Var.b(x2Var, 1.0f);
            this.a = t1Var.a(k6.wj);
            z2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z9) {
        if (this.Z0 == z9) {
            return;
        }
        this.Z0 = z9;
        if (z9) {
            if (this.D0) {
                c1++;
            }
        } else if (this.D0) {
            c1--;
        }
        if (c1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.Q3(p());
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final /* synthetic */ void b(boolean z9) {
    }
}

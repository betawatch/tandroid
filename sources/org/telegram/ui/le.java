package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class le extends org.telegram.ui.Components.ku0 implements org.telegram.ui.ActionBar.k6 {
    public static le t1;
    public static HashMap u1;
    public final vh.d A0;
    public int B0;
    public final jg.z2 C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.f6 E0;
    public final org.telegram.ui.Components.f6 F0;
    public final be G0;
    public final org.telegram.ui.Components.dq[] H0;
    public final LinearLayout I0;
    public final vh.d J0;
    public final yd K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final zd O0;
    public org.telegram.ui.Components.wb P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final bi.t0 T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.u51 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final he a1;
    public final boolean b1;
    public final boolean c1;
    public final ei.r d1;
    public SpannableStringBuilder e1;
    public final nd f1;
    public double g1;
    public double h1;
    public org.telegram.ui.ActionBar.l i1;
    public boolean j1;
    public boolean k1;
    public g61 l1;
    public final u61 m0;
    public g61 m1;
    public final org.telegram.ui.ActionBar.p6 n0;
    public g61 n1;
    public final int o0;
    public boolean o1;
    public final long p0;
    public final ie p1;
    public TL_stories.TL_premium_boostsStatus q0;
    public final ie q1;
    public int r0;
    public final ie r1;
    public final SpannableStringBuilder s0;
    public final md s1;
    public final SpannableStringBuilder t0;
    public final SpannableStringBuilder u0;
    public final SpannableStringBuilder v0;
    public final jg.z2 w0;
    public final RelativeSizeSpan x0;
    public final org.telegram.ui.Components.f6 y0;
    public final org.telegram.ui.Components.f6 z0;

    public le(Activity activity, u61 u61Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, ei.r rVar, boolean z10, boolean z11) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.dq[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.j1 = false;
        this.k1 = false;
        this.o1 = false;
        String L0 = org.telegram.messenger.cd.L0(2131748399, null);
        ie ieVar = new ie();
        ieVar.a = false;
        ieVar.b = "TON";
        ieVar.h = "XTR";
        ieVar.c = L0;
        this.p1 = ieVar;
        String L02 = org.telegram.messenger.cd.L0(2131748398, null);
        ie ieVar2 = new ie();
        ieVar2.a = false;
        ieVar2.b = "TON";
        ieVar2.h = "XTR";
        ieVar2.c = L02;
        this.q1 = ieVar2;
        String L03 = org.telegram.messenger.cd.L0(2131748397, null);
        ie ieVar3 = new ie();
        ieVar3.a = false;
        ieVar3.b = "TON";
        ieVar3.h = "XTR";
        ieVar3.c = L03;
        this.r1 = ieVar3;
        this.s1 = new md(this, 7);
        this.d1 = rVar;
        this.b1 = z10;
        this.c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        int i11 = 2;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = u61Var;
        this.n0 = p6Var;
        this.o0 = i10;
        this.p0 = j10;
        long j11 = -j10;
        TLRPC.Chat L04 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11));
        if (L04 != null) {
            this.r0 = L04.level;
        }
        org.telegram.messenger.vp.r1(i10).G0().a(j10, new s3(this, i11));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(j11);
            if (M0 != null) {
                boolean z12 = M0.restricted_sponsored;
                this.j1 = z12;
                this.k1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new td(this, 1), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat L05 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11));
        int i12 = 3;
        this.s0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, 2131748414, 50), -1, 3, new p1(u61Var, activity, p6Var, 12), p6Var), true);
        this.t0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(org.telegram.messenger.vp.r1(i10).J5 ? 2131748420 : 2131748418, null), -1, 3, new md(this, 0), null), true);
        int i13 = 1;
        this.u0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0((z11 && z10) ? 2131748394 : z11 ? 2131748396 : 2131748392, null), -1, 3, new nd(this, (z11 && z10) ? 2131748393 : z11 ? 2131748395 : 2131748391, 0), p6Var), true);
        this.v0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(L05) ? 2131748387 : 2131748386, null), new md(this, i13)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new e(this, 11));
        this.T0 = new bi.t0(this, activity, 20);
        he heVar = new he(this, activity, i10, j10, u61Var.getClassGuid(), new md(this, 2), p6Var);
        this.a1 = heVar;
        jg.z2 z2Var = new jg.z2(activity, i12);
        this.w0 = z2Var;
        z2Var.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i14, z2Var, p6Var);
        z2Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(activity, false, true, true);
        this.y0 = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int i15 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i15, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(32.0f));
        f6Var.setGravity(17);
        this.x0 = new RelativeSizeSpan(0.6770833f);
        z2Var.addView(f6Var, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(activity, true, true, true);
        this.z0 = f6Var2;
        f6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i16, p6Var);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        z2Var.addView(f6Var2, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(org.telegram.messenger.vp.r1(i10).J5);
        dVar.i(org.telegram.messenger.cd.L0(2131748366, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ag.t0(29, this, u61Var));
        z2Var.addView(dVar, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        jg.z2 z2Var2 = new jg.z2(activity, 4);
        this.C0 = z2Var2;
        z2Var2.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(i14, z2Var2, p6Var);
        z2Var2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(activity, false, true, true);
        this.E0 = f6Var3;
        f6Var3.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var3, i15, p6Var);
        f6Var3.setTextSize(org.telegram.messenger.i0.L(32.0f));
        f6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        z2Var2.addView(f6Var3, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var4 = new org.telegram.ui.Components.f6(activity, true, true, true);
        this.F0 = f6Var4;
        f6Var4.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var4, i16, p6Var);
        f6Var4.setTextSize(org.telegram.messenger.i0.L(14.0f));
        z2Var2.addView(f6Var4, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        int i17 = 0;
        yd ydVar = new yd(this, activity, i17);
        this.K0 = ydVar;
        ydVar.setVisibility(8);
        ydVar.setText(org.telegram.messenger.cd.L0(2131752953, null));
        ydVar.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        zd zdVar = new zd(activity, i17);
        this.O0 = zdVar;
        zdVar.setFocusable(false);
        org.telegram.ui.ActionBar.a7.V(zdVar, i15, p6Var);
        zdVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        zdVar.setCursorWidth(1.5f);
        zdVar.setBackground(null);
        zdVar.setTextSize(1, 18.0f);
        zdVar.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        zdVar.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        zdVar.setInputType(2);
        zdVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.D(zdVar, org.telegram.ui.ActionBar.t6.ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(zdVar, 36, org.telegram.ui.ActionBar.t6.jg, p6Var);
        zdVar.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        zdVar.setOnFocusChangeListener(new od(this, 0));
        zdVar.addTextChangedListener(new ae(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(zdVar, w7.b6.p(-1, -2, 1.0f, org.telegram.messenger.zs.E1));
        ydVar.e(zdVar);
        ydVar.addView(linearLayout, w7.b6.e(-1, -2, 48));
        z2Var2.addView(ydVar, w7.b6.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        be beVar = new be(activity, p6Var, true);
        beVar.setRoundRadius(24);
        this.G0 = beVar;
        beVar.setEnabled(false);
        beVar.i(org.telegram.messenger.cd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        beVar.setVisibility(0);
        beVar.setOnClickListener(new jg.w1(this, i10, u61Var, 4));
        vh.d dVar2 = new vh.d(activity, p6Var, true);
        dVar2.setRoundRadius(24);
        this.J0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.cd.L0(2131748389, null), false, true);
        dVar2.setOnClickListener(new qd(this, i10, j10, activity));
        linearLayout2.addView(beVar, w7.b6.p(-1, 48, 1.0f, org.telegram.messenger.zs.E1));
        if (org.telegram.messenger.w3.V(L05)) {
            linearLayout2.addView(new Space(activity), w7.b6.p(8, 48, 0.0f, org.telegram.messenger.zs.E1));
            linearLayout2.addView(dVar2, w7.b6.p(-1, 48, 1.0f, org.telegram.messenger.zs.E1));
        }
        z2Var2.addView(linearLayout2, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zdVar.setOnEditorActionListener(new xd(0, this, u61Var));
        int i18 = 2;
        this.f1 = new nd(this, i10, i18);
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(u61Var, new z4(this, i18), new ld(this), new org.telegram.ui.Cells.m5(this));
        this.X0 = u51Var;
        br brVar = new br((Object) this, 4);
        u51Var.e3 = brVar;
        u51Var.setLayoutManager(brVar);
        u51Var.setClipToPadding(false);
        u51Var.r1();
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u51Var.f3.r = false;
        u(u51Var, new ld(this));
        x(heVar, heVar.b, new org.telegram.ui.Cells.m5(3));
        View view = heVar.d;
        y(view);
        view.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (rVar != null) {
            rVar.b(u51Var);
        }
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout, p6Var);
        frameLayout.addView(e, w7.b6.e(-2, -2, 17));
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(activity);
        ei0Var.setAutoRepeat(true);
        ei0Var.f(R.raw.statistic_preload, 120, 120, null);
        ei0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i19 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(textView, i19, null);
        textView.setTag(Integer.valueOf(i19));
        textView.setText(org.telegram.messenger.cd.L0(2131748787, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i20 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView2, i20, null);
        textView2.setTag(Integer.valueOf(i20));
        textView2.setText(org.telegram.messenger.cd.L0(2131748786, null));
        textView2.setGravity(1);
        e.addView(ei0Var, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        e.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        e.addView(textView2, w7.b6.r(-2, -2, 1));
        addView(frameLayout, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
    }

    public static org.telegram.ui.ActionBar.z2 I(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        int i10 = 0;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.setImageResource(R.drawable.large_monetize);
        ei0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        ei0Var.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(ei0Var, L2, N, null, p6Var);
        f7.addView(ei0Var, w7.b6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        sc.e.t(textView, 1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
        textView.setText(org.telegram.messenger.cd.L0(z10 ? 2131753035 : 2131748404, null));
        f7.addView(textView, w7.b6.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        f7.addView(new org.telegram.ui.Cells.a5(context, R.drawable.msg_channel, org.telegram.messenger.cd.L0(z10 ? 2131753044 : 2131748413, null), org.telegram.messenger.cd.L0(z10 ? 2131753043 : 2131748412, null), p6Var), w7.b6.t(-1, -2, 49, 8, 0, 8, 16));
        f7.addView(new org.telegram.ui.Cells.a5(context, R.drawable.menu_feature_split, org.telegram.messenger.cd.L0(z10 ? 2131753042 : 2131748411, null), org.telegram.messenger.cd.L0(z10 ? 2131753041 : 2131748410, null), p6Var), w7.b6.t(-1, -2, 49, 8, 0, 8, 16));
        f7.addView(new org.telegram.ui.Cells.a5(context, R.drawable.menu_feature_withdrawals, org.telegram.messenger.cd.L0(z10 ? 2131753040 : 2131748409, null), org.telegram.messenger.cd.L0(z10 ? 2131753039 : 2131748408, null), p6Var), w7.b6.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, p6Var);
        f7.addView(view, w7.b6.n(1.0f / org.telegram.messenger.i0.p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        n5Var.setGravity(17);
        n5Var.setTextSize(1, 20.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(n5Var, i12, p6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.mini_gram_72, 0);
        dqVar.d = false;
        dqVar.H = 0.9f;
        dqVar.I = 0.9f;
        dqVar.b(n5Var.getPaint().getFontMetricsInt());
        dqVar.G = 0.9f;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        n5Var.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(z10 ? 2131753036 : 2131748405, null), spannableString, "💎"));
        f7.addView(n5Var, w7.b6.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, p6Var);
        p80Var.setGravity(17);
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, i12, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setText(org.telegram.messenger.i0.c4(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(z10 ? 2131753037 : 2131748406, null)), new k2.v(9, context, z10)));
        f7.addView(p80Var, w7.b6.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        i13.i(org.telegram.messenger.cd.L0(2131749540, null), false, true);
        i13.setOnClickListener(new pd(k10, i10));
        f7.addView(i13, w7.b6.t(-1, 48, 55, 10, 25, 10, 14));
        k10.N = f7;
        return k10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        if (u1 == null) {
            u1 = new HashMap();
        }
        int i10 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) u1.get(Integer.valueOf(i10));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.mini_gram_72, 0);
                dqVar.d = false;
                dqVar.H = f7;
                dqVar.I = f7;
                dqVar.a(org.telegram.ui.ActionBar.t6.o6);
                dqVar.b(textPaint.getFontMetricsInt());
                dqVar.G = 0.9f;
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(R.drawable.mini_gram_16, 0);
                dqVar2.d = false;
                dqVar2.H = f7;
                dqVar2.I = f7;
                dqVar2.s = f10;
                dqVar2.G = 0.95f;
                spannableString.setSpan(dqVar2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i10), spannableString);
        }
        return org.telegram.messenger.i0.L2(charSequence, spannableString, "TON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        long j11;
        String L0;
        long j12;
        long j13;
        long j14;
        char c10;
        boolean z10;
        boolean z11;
        String p5;
        TLRPC.User user;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            L0 = org.telegram.messenger.cd.L0(2131748376, null);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            j13 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z13 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z10 = z13;
            j14 = 0;
            c10 = 65535;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                L0 = org.telegram.messenger.cd.L0(2131748378, null);
                j12 = tL_broadcastRevenueTransactionProceeds.from_date;
                j14 = tL_broadcastRevenueTransactionProceeds.to_date;
                j13 = tL_broadcastRevenueTransactionProceeds.amount;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                L0 = org.telegram.messenger.cd.L0(2131748377, null);
                j12 = tL_broadcastRevenueTransactionRefund.from_date;
                j13 = tL_broadcastRevenueTransactionRefund.amount;
                j14 = 0;
            }
            c10 = 1;
            z10 = false;
            z11 = false;
        }
        long j15 = j13;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.z20.n(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(textView, c10 < 0 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.l8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c10 < 0 ? "-" : "+"));
        long j16 = j12;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j15) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f7.addView(textView, w7.b6.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.y6, p6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.cd.L0(2131748373, null));
        } else if (j16 == j11) {
            textView2.setText(org.telegram.messenger.cd.Q(j14));
        } else if (j14 == j11) {
            textView2.setText(org.telegram.messenger.cd.Q(j16));
        } else {
            textView2.setText(org.telegram.messenger.cd.Q(j16) + " - " + org.telegram.messenger.cd.Q(j14));
        }
        if (z11) {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, p6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.cd.L0(2131748374, null)));
        }
        f7.addView(textView2, w7.b6.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.z20.n(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView3.setText(L0);
        f7.addView(textView3, w7.b6.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(28.0f);
            int L2 = org.telegram.messenger.i0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.t6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.t6.e0(L, L2, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.a7.k(frameLayout, e02, N, null, p6Var);
            if (j10 < j11) {
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
                if (L02 == 0) {
                    p5 = "";
                    user = L02;
                } else {
                    p5 = L02.title;
                    user = L02;
                }
            } else {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10));
                p5 = org.telegram.messenger.h20.p(Z1);
                user = Z1;
            }
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.l(user);
            g9Var.e(user, r8Var);
            frameLayout.addView(g9Var, w7.b6.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.j5, p6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p5);
            frameLayout.addView(textView4, w7.b6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f7.addView(frameLayout, w7.b6.t(-2, 28, 1, 42, 10, 42, 0));
        }
        int i12 = 1;
        vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                i13.i(org.telegram.messenger.cd.L0(2131748375, null), false, true);
                i13.setOnClickListener(new ud(0, context, tL_broadcastRevenueTransactionWithdrawal2));
                f7.addView(i13, w7.b6.t(-1, 48, 55, 18, 30, 18, 14));
                k10.N = f7;
                k10.show();
            }
        }
        i13.i(org.telegram.messenger.cd.L0(2131747847, null), false, true);
        i13.setOnClickListener(new pd(k10, i12));
        f7.addView(i13, w7.b6.t(-1, 48, 55, 18, 30, 18, 14));
        k10.N = f7;
        k10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        cg.b bVar;
        ArrayList arrayList;
        boolean z10 = this.n1 == null;
        this.h1 = tL_payments_starsRevenueStats.usd_rate;
        g61 h02 = u61.h0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.cd.L0(2131748415, null), 2, false);
        this.n1 = h02;
        if (h02 != null && (bVar = h02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((cg.a) this.n1.d.d.get(0)).g = org.telegram.ui.ActionBar.t6.Yj;
            this.n1.d.h = (float) ((1.0d / this.h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new md(this, 6)).start();
        }
        org.telegram.ui.Components.u51 u51Var = this.X0;
        if (u51Var != null) {
            u51Var.f3.O(!z10);
            if (z10) {
                u51Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.b1 && this.o1 && org.telegram.messenger.vp.d1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.n0, false));
            org.telegram.messenger.vp.d1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        u61 u61Var = this.m0;
        if (u61Var == null) {
            return;
        }
        Activity parentActivity = u61Var.getParentActivity();
        int i10 = this.o0;
        TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
        if (parentActivity == null || f7 == null) {
            return;
        }
        long j10 = this.p0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new org.telegram.messenger.s6(this, twoStepVerificationActivity, parentActivity, z10, 1));
    }

    public final boolean G(float f7, float f10) {
        return this.Y0.getVisibility() != 0 && c() && f7 >= 0.0f && f7 < ((float) getWidth()) && f10 >= getTabsTop() && f10 < ((float) getHeight());
    }

    public final void H(boolean z10) {
        if (this.c1) {
            int i10 = this.o0;
            rh.r g10 = rh.r.g(i10);
            long j10 = this.p0;
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
            if (h != null) {
                org.telegram.messenger.i0.g3(new h0(22, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new td(this, 2));
        }
    }

    public final void J() {
        he heVar = this.a1;
        md mdVar = heVar.f;
        boolean[] zArr = heVar.w;
        boolean a2 = heVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zArr[i10]) {
                return;
            }
            if (i10 == 1) {
                heVar.n.clear();
                heVar.h = "";
            } else {
                heVar.r.clear();
                heVar.s = "";
            }
            zArr[i10] = false;
            heVar.c(i10);
        }
        if (heVar.a() == a2 || mdVar == null) {
            return;
        }
        heVar.e();
        mdVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ie ieVar;
        int i10;
        int i11;
        org.telegram.ui.Components.p51 p51Var;
        ie ieVar2;
        int i12;
        le leVar = this;
        ie ieVar3 = leVar.r1;
        ie ieVar4 = leVar.q1;
        org.telegram.ui.Components.f6 f6Var = leVar.z0;
        RelativeSizeSpan relativeSizeSpan = leVar.x0;
        org.telegram.ui.Components.f6 f6Var2 = leVar.y0;
        ie ieVar5 = leVar.p1;
        if (z10) {
            ieVar5.a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            ieVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (leVar.g1 * d * 100.0d);
            ieVar5.e = j11;
            if (leVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                ieVar2 = ieVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                leVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i12 = 6;
                leVar.Z0.setMaximumFractionDigits(6);
                leVar.Z0.setGroupingUsed(false);
            } else {
                ieVar2 = ieVar3;
                i12 = 6;
            }
            DecimalFormat decimalFormat2 = leVar.Z0;
            if (d > 1.5d) {
                i12 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + leVar.Z0.format(d), f6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            f6Var2.setText(spannableStringBuilder);
            f6Var.setText("≈" + org.telegram.messenger.u1.i().f(j11, "USD"));
            ieVar5.f = "USD";
            ieVar4.a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            ieVar4.d = j12;
            leVar = this;
            double d10 = leVar.g1;
            ieVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            ieVar4.f = "USD";
            ie ieVar6 = ieVar2;
            ieVar6.a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            ieVar6.d = j13;
            ieVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            ieVar6.f = "USD";
            leVar.o1 = true;
            leVar.A0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = leVar.h1;
            if (d11 == 0.0d) {
                return;
            }
            ieVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            ieVar5.i = starsAmount;
            ieVar5.j = (long) (starsAmount.amount * d11 * 100.0d);
            int i13 = tL_starsRevenueStatus.next_withdrawal_at;
            be beVar = leVar.G0;
            if (f6Var2 == null || f6Var == null) {
                ieVar = ieVar3;
                i10 = 0;
            } else {
                ieVar = ieVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(rh.h8.Z0(false, TextUtils.concat("XTR ", rh.h8.L0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                leVar.D0 = starsAmount;
                leVar.E0.setText(spannableStringBuilder2);
                leVar.F0.setText("≈" + org.telegram.messenger.u1.i().f((long) (leVar.h1 * starsAmount.amount * 100.0d), "USD"));
                leVar.K0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (leVar.M0) {
                    leVar.L0 = true;
                    long j14 = starsAmount.amount;
                    leVar.N0 = j14;
                    String l4 = Long.toString(j14);
                    zd zdVar = leVar.O0;
                    zdVar.setText(l4);
                    zdVar.setSelection(zdVar.getText().length());
                    i10 = 0;
                    leVar.L0 = false;
                    beVar.setEnabled(leVar.N0 > 0);
                } else {
                    i10 = 0;
                }
                vh.d dVar = leVar.J0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0 ? 1 : i10);
                }
                leVar.B0 = i13;
                nd ndVar = leVar.f1;
                org.telegram.messenger.i0.r(ndVar);
                ndVar.run();
            }
            ieVar5.f = "USD";
            ieVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            ieVar4.i = starsAmount2;
            double d12 = starsAmount2.amount;
            double d13 = leVar.h1;
            ieVar4.j = (long) (d12 * d13 * 100.0d);
            ieVar4.f = "USD";
            ie ieVar7 = ieVar;
            ieVar7.g = true;
            ieVar7.i = tL_starsRevenueStatus.overall_revenue;
            ieVar7.j = (long) (r4.amount * d13 * 100.0d);
            ieVar7.f = "USD";
            leVar.o1 = true;
            LinearLayout linearLayout = leVar.I0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i10 : 8);
            }
            if (beVar != null) {
                if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                    boolean z11 = org.telegram.messenger.v2.a;
                    i11 = 8;
                } else {
                    i11 = i10;
                }
                beVar.setVisibility(i11);
            }
        }
        org.telegram.ui.Components.u51 u51Var = leVar.X0;
        if (u51Var == null || (p51Var = u51Var.f3) == null) {
            return;
        }
        p51Var.O(true);
    }

    public View getTransactionTabs() {
        return this.a1.d;
    }

    @Override // org.telegram.ui.Components.ku0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override // org.telegram.ui.Components.ku0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.l lVar = this.i1;
        if (lVar != null) {
            lVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.i1 = lVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            zd zdVar = this.O0;
            if (zdVar != null) {
                zdVar.setHandlesColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.jg, this.n0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

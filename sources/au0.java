// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class au0 extends d implements jm7 {
    public final fk1 E;
    public final fk1 F;
    public final fk1 G;
    public final fk1 H;
    public final fk1 I;
    public final fk1 J;
    public final SpannableStringBuilder K;
    public mxa L;
    public FrameLayout M;
    public FrameLayout N;
    public wgc O;
    public boolean P;
    public int Q;
    public t1 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public io U;
    public io V;
    public wt0 W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final boolean a;
    public vc a0;
    public final long b;
    public tb b0;
    public final boolean c;
    public b61 c0;
    public z82 d;
    public final pn2[] d0;
    public q7c e;
    public t1 e0;
    public fja f;
    public RelativeSizeSpan f0;
    public io g0;
    public xd9 h;
    public io h0;
    public b61 i0;
    public double j0;
    public u31 k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public SpannableStringBuilder n0;
    public boolean o0;
    public jza p0;
    public jza q0;
    public View r;
    public DecimalFormat r0;
    public fn0 s;
    public SpannableStringBuilder s0;
    public final mt0 t0;
    public final int u0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public jza y;

    /* JADX WARN: Multi-variable type inference failed */
    public au0(int i, long j) {
        super(null);
        this.n = -1;
        this.E = fk1.a("XTR", jb6.M0(2131752914, null));
        this.F = fk1.a("XTR", jb6.M0(2131752912, null));
        this.G = fk1.a("XTR", jb6.M0(2131752911, null));
        this.H = fk1.a("TON", jb6.M0(2131752989, null));
        this.I = fk1.a("TON", jb6.M0(2131752988, null));
        this.J = fk1.a("TON", jb6.M0(2131752987, null));
        this.X = false;
        this.Y = true;
        this.d0 = new pn2[1];
        this.t0 = new mt0(this, (byte) 0);
        this.u0 = -1;
        this.a = i;
        this.b = j;
        boolean z = j == getUserConfig().e();
        this.c = z;
        if (i == 0) {
            ku0.g(this.currentAccount).r(j);
            if (!z) {
                ku0.g(this.currentAccount).l(j);
            }
        } else if (i == 1) {
            ku0 g = ku0.g(this.currentAccount);
            Long l = (Long) g.d.get(Long.valueOf(j));
            g.j(j, l == null || System.currentTimeMillis() - l.longValue() > 30000);
        }
        this.K = gm.D2(gm.N2(z ? jb6.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().l4.q2.f()) : jb6.M0(2131752910, null), -1, 0, new mt0(this, (byte) 2), null), true);
    }

    public static String x0(int i) {
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = i3 - (i4 * 3600);
        int i6 = i5 / 60;
        int i7 = i5 - (i6 * 60);
        if (i2 == 0) {
            return i4 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7));
        }
        Locale locale = Locale.ENGLISH;
        return jb6.a0(null, null, 2131747055, String.format(locale, "%02d", Integer.valueOf(i2)), String.format(locale, "%02d", Integer.valueOf(i4)), String.format(locale, "%02d", Integer.valueOf(i6)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v131, types: [android.widget.FrameLayout] */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        fja fjaVar;
        byte b = 1;
        if (this.a || !this.c) {
            fja fjaVar2 = new fja(context);
            this.f = fjaVar2;
            fjaVar2.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new sz4(this));
            fja fjaVar3 = this.f;
            fjaVar3.getClass();
            this.h = new xd9((byte) 7, context, fjaVar3);
            fjaVar = this.f;
        } else {
            this.f = null;
            this.h = null;
            fjaVar = new FrameLayout(context);
        }
        FrameLayout frameLayout = fjaVar;
        frameLayout.setBackgroundColor(getThemedColor(cmb.Z6));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        this.d = new z82(context, null, false, getResourceProvider());
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.b));
        this.d.k(W1, true);
        this.simpleActionBar.setTitle(m9c.r(W1));
        boolean z6 = this.a;
        rja rjaVar = this.simpleActionBar;
        if (z6) {
            rjaVar.setSubtitle(jb6.M0(2131752901, null));
        } else {
            rjaVar.setSubtitle(jb6.M0(2131752902, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 10));
        this.simpleActionBar.setBackground(null);
        mxa mxaVar = (this.a || this.f == null) ? null : new mxa(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.L = mxaVar;
        if (this.a) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.M = frameLayout2;
            frameLayout2.setClipChildren(false);
            this.M.setClipToPadding(false);
            v59 v59Var = new v59(context, this.resourceProvider, this.f);
            this.O = v59Var;
            v59Var.setAdapter(new xt0(this, context, v59Var));
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.N = frameLayout3;
            frameLayout3.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
            this.N.addView(v59Var.l(-2, true), qoe.e(-1, 48, 48));
            this.M.addView(v59Var, qoe.c(-1.0f, -1));
        } else if (mxaVar != null) {
            this.O = mxaVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        t1 t1Var = new t1(b, context, z);
        this.R = t1Var;
        t1Var.setOrientation(1);
        t1 t1Var2 = this.R;
        int i = cmb.c6;
        anb.h(i, getResourceProvider(), t1Var2);
        this.R.setPadding(0, 0, 0, gm.L(17.0f));
        io ioVar = new io(context, false, true, true);
        this.U = ioVar;
        ioVar.setTypeface(gm.o());
        io ioVar2 = this.U;
        int i2 = cmb.F6;
        anb.U(ioVar2, i2, getResourceProvider());
        this.U.setTextSize(gm.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, qoe.t(-1, 38, 49, 22, 15, 22, 0));
        io ioVar3 = new io(context, true, true, true);
        this.V = ioVar3;
        ioVar3.setGravity(17);
        io ioVar4 = this.V;
        int i3 = cmb.x6;
        anb.U(ioVar4, i3, getResourceProvider());
        this.V.setTextSize(gm.L(14.0f));
        this.R.addView(this.V, qoe.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        wt0 wt0Var = new wt0(z5 ? 1 : 0, context, this);
        this.W = wt0Var;
        wt0Var.setText(jb6.M0(2131752906, null));
        this.W.setLeftPadding(gm.L(36.0f));
        vc vcVar = new vc(context, b);
        this.a0 = vcVar;
        vcVar.setFocusable(false);
        anb.X(this.a0, i2, getResourceProvider());
        this.a0.setCursorSize(gm.L(20.0f));
        this.a0.setCursorWidth(1.5f);
        this.a0.setBackground(null);
        this.a0.setTextSize(1, 18.0f);
        this.a0.setMaxLines(1);
        int L = gm.L(16.0f);
        this.a0.setPadding(gm.L(6.0f), L, L, L);
        this.a0.setInputType(2);
        this.a0.setTypeface(Typeface.DEFAULT);
        anb.C(this.a0, cmb.kg, getResourceProvider());
        anb.y(this.a0, cmb.lg, getResourceProvider());
        byte b2 = 3;
        this.a0.setGravity(jb6.a0 ? 5 : 3);
        this.a0.setOnFocusChangeListener(new tt0(this, z4 ? 1 : 0));
        this.a0.addTextChangedListener(new b7(this, b2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, qoe.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.a0, qoe.p(-1, -2, 1.0f, nm7.D1));
        this.W.e(this.a0);
        this.W.addView(linearLayout, qoe.e(-1, -2, 48));
        this.a0.setOnEditorActionListener(new j(this, (byte) 4));
        this.R.addView(this.W, qoe.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        tb tbVar = new tb(context, true, getResourceProvider(), b2);
        tbVar.setRoundRadius(24);
        this.b0 = tbVar;
        tbVar.setEnabled(oc7.r1(this.currentAccount).l4.T2.f);
        this.b0.i(jb6.M0(2131752922, null), false, true);
        tb tbVar2 = this.b0;
        final boolean z7 = z3 ? 1 : 0;
        tbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: vt0
            public final /* synthetic */ au0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = z7;
                au0 au0Var = this.b;
                switch (b3) {
                    case 0:
                        au0Var.z0();
                        break;
                    default:
                        au0Var.q0(view);
                        break;
                }
            }
        });
        b61 b61Var = new b61(getResourceProvider(), context, true);
        b61Var.setRoundRadius(24);
        this.c0 = b61Var;
        b61Var.setEnabled(true);
        this.c0.i(jb6.M0(2131748131, null), false, true);
        this.c0.setOnClickListener(new t(this, context, (byte) 24));
        this.S.addView(this.b0, qoe.p(-1, 48, 1.0f, nm7.D1));
        if (!this.c) {
            this.S.addView(new Space(context), qoe.p(8, 48, 0.0f, nm7.D1));
            this.S.addView(this.c0, qoe.p(-1, 48, 1.0f, nm7.D1));
        }
        this.R.addView(this.S, qoe.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        t1 t1Var3 = new t1((byte) 2, context, z2 ? 1 : 0);
        this.e0 = t1Var3;
        t1Var3.setOrientation(1);
        anb.h(i, this.resourceProvider, this.e0);
        this.e0.setPadding(0, 0, 0, gm.L(17.0f));
        io ioVar5 = new io(context, false, true, true);
        this.g0 = ioVar5;
        ioVar5.setTypeface(gm.o());
        anb.U(this.g0, i2, this.resourceProvider);
        this.g0.setTextSize(gm.L(32.0f));
        this.g0.setGravity(17);
        this.f0 = new RelativeSizeSpan(0.6770833f);
        this.e0.addView(this.g0, qoe.t(-1, 38, 49, 22, 15, 22, 0));
        io ioVar6 = new io(context, true, true, true);
        this.h0 = ioVar6;
        ioVar6.setGravity(17);
        anb.U(this.h0, i3, this.resourceProvider);
        this.h0.setTextSize(gm.L(14.0f));
        this.e0.addView(this.h0, qoe.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        b61 b61Var2 = new b61(this.resourceProvider, context, true);
        b61Var2.setRoundRadius(24);
        this.i0 = b61Var2;
        b61Var2.setEnabled(oc7.r1(this.currentAccount).l4.T2.f);
        final byte b3 = 1;
        this.i0.i(jb6.M0(this.c ? 2131748132 : 2131748108, null), false, true);
        this.i0.setVisibility(8);
        this.i0.setOnClickListener(new View.OnClickListener(this) { // from class: vt0
            public final /* synthetic */ au0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                au0 au0Var = this.b;
                switch (b32) {
                    case 0:
                        au0Var.z0();
                        break;
                    default:
                        au0Var.q0(view);
                        break;
                }
            }
        });
        this.e0.addView(this.i0, qoe.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        q7c q7cVar = new q7c(this, new qt0(this, (byte) 1), new nt0(this), new qn0(this, (byte) 4));
        this.e = q7cVar;
        q7cVar.r1();
        q7c q7cVar2 = this.e;
        q7cVar2.g3.r = false;
        q7cVar2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        fja fjaVar4 = this.f;
        q7c q7cVar3 = this.e;
        if (fjaVar4 != null) {
            getParentActivity();
            jg2 jg2Var = new jg2((Object) fjaVar4, (byte) 5);
            q7cVar3.f3 = jg2Var;
            q7cVar3.setLayoutManager(jg2Var);
            this.f.v(this.e, new nt0(this));
            this.f.y(this.a ? this.M : this.L, this.O, new nt0(this));
            FrameLayout frameLayout4 = this.N;
            this.f.z(frameLayout4);
            frameLayout4.setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout.addView(q7cVar3, qoe.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout;
        getBaseSimpleGlass().f(frameLayout, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout.addView(this.r, frameLayout.indexOfChild(this.f != null ? this.N : this.simpleActionBar), qoe.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        fn0 fn0Var = new fn0(0, new nt0(this), d53.h, 380L, false);
        this.s = fn0Var;
        fja fjaVar5 = this.f;
        fn0Var.a(fjaVar5 != null && fjaVar5.f0, false);
        if (this.f != null) {
            getBaseSimpleGlass().n = this.f;
            mxa mxaVar2 = this.L;
            sy4 sy4Var = this.glassEngine;
            if (mxaVar2 != null) {
                mxaVar2.setGlassEngine(sy4Var);
            } else {
                sy4Var.c(this.O);
            }
            getBaseSimpleGlass().o = new dh0(this, new je(frameLayout, (byte) 1), (byte) 2);
            View view = this.N;
            im0 c = getBaseSimpleGlass().c.c(view, null, false);
            c.p(qqd.l(this.resourceProvider));
            c.q(gm.L(9.66f));
            c.r(gm.L(18.0f));
            view.setBackground(c);
        }
        gm.B2(this.d.e);
        frameLayout.addView(this.d.e, qoe.e(42, 42, 53));
        m0();
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.E3 && ((Long) objArr[0]).longValue() == this.b) {
            n0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return gm.B(cmb.w0(null, cmb.c6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wgc wgcVar = this.O;
        if (wgcVar == null || !wgcVar.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void m0() {
        if (this.e != null) {
            gm.v3(this.d.e, 0, ((a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
            q7c q7cVar = this.e;
            iq5 iq5Var = this.mSystemInsets;
            eh0.e(q7cVar, iq5Var.b, iq5Var.d, a.getCurrentActionBarHeight(), 0);
            if (this.f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                this.f.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                fja fjaVar = this.f;
                fjaVar.C();
                fjaVar.requestLayout();
                fjaVar.invalidate();
            }
            if (this.r != null) {
                int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? gm.L(44.0f) : 0);
                ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
                if (layoutParams.height != currentActionBarHeight) {
                    layoutParams.height = currentActionBarHeight;
                    this.r.setLayoutParams(layoutParams);
                }
                y0();
            }
        }
    }

    public final void n0() {
        nl1 nl1Var;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = ku0.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if ((h == null ? null : h.status) == this.x) {
                return;
            }
        }
        this.w = h;
        this.x = h == null ? null : h.status;
        if (h != null) {
            this.j0 = h.usd_rate;
            jza g0 = xza.g0(h.revenue_graph, jb6.M0(2131752916, null), 2, false);
            this.y = g0;
            if (g0 != null && (nl1Var = g0.d) != null && (arrayList = nl1Var.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                jza jzaVar = this.y;
                jzaVar.h = true;
                ((ml1) jzaVar.d.d.get(0)).g = cmb.ok;
                this.y.d.h = (float) ((1.0d / this.j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            w0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            q7c q7cVar = this.e;
            if (q7cVar != null) {
                fja fjaVar = this.f;
                boolean z = fjaVar != null && fjaVar.f0;
                q7cVar.g3.O(fjaVar == null);
                if (z) {
                    this.f.a();
                }
            }
        }
    }

    public final void o0(ArrayList arrayList) {
        int i;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i2;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        this.n = -1;
        ku0 g = ku0.g(this.currentAccount);
        boolean z = this.a;
        if (!z) {
            arrayList.add(c6c.h(2, this.u0, this.y));
            arrayList.add(c6c.B(-1, null));
            arrayList.add(c6c.b(jb6.M0(2131752915, null)));
            TLRPC.TL_payments_starsRevenueStats h = g.h(this.b, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                fk1 fk1Var = this.E;
                fk1Var.a = false;
                fk1Var.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                fk1Var.i = starsAmount;
                fk1Var.h = "XTR";
                fk1Var.f = "USD";
                double d = starsAmount.amount;
                double d2 = this.j0;
                fk1Var.j = (long) (d * d2 * 100.0d);
                fk1 fk1Var2 = this.F;
                fk1Var2.a = false;
                fk1Var2.g = true;
                fk1Var2.i = tL_starsRevenueStatus2.current_balance;
                fk1Var2.h = "XTR";
                fk1Var2.j = (long) (r5.amount * d2 * 100.0d);
                fk1Var2.f = "USD";
                fk1 fk1Var3 = this.G;
                fk1Var3.a = false;
                fk1Var3.g = true;
                fk1Var3.i = tL_starsRevenueStatus2.overall_revenue;
                fk1Var3.h = "XTR";
                fk1Var3.j = (long) (r5.amount * d2 * 100.0d);
                fk1Var3.f = "USD";
                w0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                this.S.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(c6c.v(this.E));
            arrayList.add(c6c.v(this.F));
            arrayList.add(c6c.v(this.G));
            arrayList.add(c6c.B(-2, jb6.M0(this.c ? 2131745379 : 2131752913, null)));
            arrayList.add(c6c.b(jb6.M0(2131752925, null)));
            arrayList.add(c6c.j(1, this.R));
            arrayList.add(c6c.B(-3, this.K));
            if (this.c) {
                return;
            }
            if (getMessagesController().l4.C2.f) {
                arrayList.add(xb.i(2, cmb.v0(cmb.kk, this.resourceProvider), ba2.b0(jb6.M0(2131753110, null)), jb6.M0(2131753111, null)));
                arrayList.add(c6c.B(-4, null));
            }
            this.n = arrayList.size();
            arrayList.add(c6c.n(this.h, -2));
            return;
        }
        if (z) {
            TLRPC.TL_payments_starsRevenueStats j = g.j(this.b, true);
            byte b = 3;
            if (!this.c) {
                SpannableStringBuilder spannableStringBuilder = this.l0;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = gm.D2(gm.N2(jb6.a0(null, null, 2131753001, 50), -1, 3, new mt0(this, b), this.resourceProvider), true);
                    this.l0 = spannableStringBuilder;
                }
                arrayList.add(c6c.g(spannableStringBuilder));
            }
            jza jzaVar = this.p0;
            if (jzaVar == null && j != null) {
                jzaVar = xza.g0(j.top_hours_graph, jb6.M0(2131753003, null), 0, false);
                this.p0 = jzaVar;
                if (jzaVar != null) {
                    jzaVar.n = true;
                }
            }
            if (jzaVar != null && !jzaVar.l) {
                arrayList.add(c6c.h(5, this.u0, jzaVar));
                arrayList.add(c6c.B(-1, null));
            }
            jza jzaVar2 = this.q0;
            if (jzaVar2 != null || j == null) {
                i = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j.usd_rate);
                }
                i = 2;
                jzaVar2 = xza.g0(statsGraph, jb6.M0(2131753002, null), 2, false);
                this.q0 = jzaVar2;
            }
            if (jzaVar2 != null && !jzaVar2.l) {
                arrayList.add(c6c.h(i, this.u0, jzaVar2));
                arrayList.add(c6c.B(-2, null));
            }
            if (!this.o0 && j != null && (tL_starsRevenueStatus = j.status) != null) {
                double d3 = j.usd_rate;
                fk1 fk1Var4 = this.H;
                long j2 = tL_starsRevenueStatus.available_balance.amount;
                fk1Var4.d = j2;
                double d4 = j2 / 1.0E9d;
                long j3 = (long) (d4 * d3 * 100.0d);
                fk1Var4.e = j3;
                if (this.r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    this.r0 = decimalFormat;
                    i2 = 2;
                    decimalFormat.setMinimumFractionDigits(2);
                    this.r0.setMaximumFractionDigits(6);
                    this.r0.setGroupingUsed(false);
                } else {
                    i2 = 2;
                }
                DecimalFormat decimalFormat2 = this.r0;
                if (d4 <= 1.5d) {
                    i2 = 6;
                }
                decimalFormat2.setMaximumFractionDigits(i2);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ik1.L("TON " + this.r0.format(d4), this.g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder2.setSpan(this.f0, indexOf, spannableStringBuilder2.length(), 33);
                }
                this.g0.setText(spannableStringBuilder2);
                this.h0.setText("≈" + cj0.h().e(j3, "USD"));
                this.H.f = "USD";
                fk1 fk1Var5 = this.I;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j.status;
                long j4 = tL_starsRevenueStatus3.current_balance.amount;
                fk1Var5.d = j4;
                fk1Var5.e = (long) ((j4 / 1.0E9d) * d3 * 100.0d);
                fk1Var5.f = "USD";
                fk1 fk1Var6 = this.J;
                fk1Var6.a = true;
                long j5 = tL_starsRevenueStatus3.overall_revenue.amount;
                fk1Var6.d = j5;
                fk1Var6.e = (long) ((j5 / 1.0E9d) * d3 * 100.0d);
                fk1Var6.f = "USD";
                this.o0 = true;
                this.i0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (this.o0) {
                arrayList.add(c6c.b(jb6.M0(2131752990, null)));
                arrayList.add(c6c.v(this.H));
                arrayList.add(c6c.v(this.I));
                arrayList.add(c6c.v(this.J));
                SpannableStringBuilder spannableStringBuilder3 = this.m0;
                if (spannableStringBuilder3 == null) {
                    spannableStringBuilder3 = gm.D2(gm.N2(jb6.M0(2131752986, null), -1, 3, new mt0(this, (byte) 4), this.resourceProvider), true);
                    this.m0 = spannableStringBuilder3;
                }
                arrayList.add(c6c.B(-4, spannableStringBuilder3));
            }
            arrayList.add(c6c.b(jb6.M0(2131753007, null)));
            arrayList.add(c6c.k(this.e0));
            SpannableStringBuilder spannableStringBuilder4 = this.n0;
            if (spannableStringBuilder4 == null) {
                spannableStringBuilder4 = gm.D2(gm.N2(jb6.M0(oc7.r1(this.currentAccount).l4.T2.f ? 2131753006 : 2131753004, null), -1, 3, new mt0(this, (byte) 5), null), true);
                this.n0 = spannableStringBuilder4;
            }
            arrayList.add(c6c.B(-5, spannableStringBuilder4));
            this.n = arrayList.size();
            arrayList.add(c6c.n(this.h, -2));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.E3);
        n0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        this.P = true;
        nm7.f(this.currentAccount).n(this, nm7.E3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        m0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            z82 z82Var = this.d;
            if (z82Var != null) {
                z82Var.i(cmb.w0(null, cmb.Ej, false), cmb.w0(null, cmb.Fj, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(boolean z, long j, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f = z8c.h(this.currentAccount).f();
        if (parentActivity == null || f == null) {
            return;
        }
        long j2 = this.b;
        if (z) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = oc7.r1(this.currentAccount).i1(j2);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = oc7.r1(this.currentAccount).i1(j2);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new rt0(this, twoStepVerificationActivity, parentActivity, z, j));
    }

    public final void q0(View view) {
        if (!view.isEnabled() || this.i0.R) {
            return;
        }
        if (this.c && u15.c(this.currentAccount)) {
            u15.g(this, this.H.d, new qt0(this, (byte) 0));
            return;
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        o oVar = new o(this, twoStepVerificationActivity, (byte) 24);
        twoStepVerificationActivity.a0 = (byte) 1;
        twoStepVerificationActivity.c0 = oVar;
        this.i0.setLoading(true);
        twoStepVerificationActivity.x0(new ot0(this, twoStepVerificationActivity, (byte) 0));
    }

    public final void r0(Context context, View view) {
        if (view.isEnabled()) {
            b61 b61Var = this.c0;
            if (b61Var.R) {
                return;
            }
            b61Var.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = oc7.r1(this.currentAccount).i1(this.b);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new pm(this, context, (byte) 5));
        }
    }

    public final void s0() {
        showDialog(ik1.J(this.resourceProvider, getParentActivity(), true));
    }

    public final void t0(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        int i;
        if (tL_error == null) {
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                l11.w(getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    this.Y = true;
                    l11.w(getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new j87((byte) 1, j, this, twoStepVerificationActivity, z), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            c41.e0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = jb6.M0(2131751234, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(activity);
        int i2 = cmb.i5;
        anb.X(textView, i2, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView.setText(gm.S2(jb6.M0(2131742527, null)));
        linearLayout.addView(textView, qoe.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i2, null, mode);
        TextView textView2 = new TextView(activity);
        anb.X(textView2, i2, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView2.setText(gm.S2(jb6.M0(2131751237, null)));
        if (jb6.a0) {
            linearLayout2.addView(textView2, qoe.o(-1, -2));
            linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, qoe.o(-2, -2));
            linearLayout2.addView(textView2, qoe.o(-1, -2));
        }
        LinearLayout l = td4.l(activity, 0);
        linearLayout.addView(l, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
        anb.s(imageView2, i2, null, mode);
        TextView textView3 = new TextView(activity);
        anb.X(textView3, i2, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView3.setText(gm.S2(jb6.M0(2131751236, null)));
        if (jb6.a0) {
            l.addView(textView3, qoe.o(-1, -2));
            i = 5;
            l.addView(imageView2, qoe.r(-2, -2, 5));
        } else {
            i = 5;
            l.addView(imageView2, qoe.o(-2, -2));
            l.addView(textView3, qoe.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.j(jb6.M0(2131751228, null), new nt0(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            anb.X(textView4, i2, null);
            textView4.setTextSize(1, 16.0f);
            hg9.p(textView4, (jb6.a0 ? i : 3) | 48, null, 2131751235);
            linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.g(jb6.M0(2131747564, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(heVar);
        } else {
            showDialog(heVar);
        }
    }

    public final void u0() {
        u31.e();
        TLRPC.TL_payments_starsRevenueStats h = ku0.g(this.currentAccount).h(this.b, false);
        long j = h == null ? 0L : h.status.available_balance.amount;
        if (j < getMessagesController().l4.q2.f()) {
            this.Y = true;
            this.Z = j;
        } else {
            this.Y = false;
            j = getMessagesController().l4.q2.f();
            this.Z = j;
        }
        this.X = true;
        this.a0.setText(Long.toString(j));
        vc vcVar = this.a0;
        vcVar.setSelection(vcVar.getText().length());
        this.X = false;
        mt0 mt0Var = this.t0;
        gm.r(mt0Var);
        mt0Var.run();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(c6c c6cVar) {
        boolean H = c6cVar.H(hxa.class);
        Object obj = c6cVar.H;
        if (H) {
            Activity parentActivity = getParentActivity();
            int i = this.currentAccount;
            ylb resourceProvider = getResourceProvider();
            nxa.l1(parentActivity, true, this.b, i, (TL_stars.StarsTransaction) obj, resourceProvider);
            return;
        }
        if (obj instanceof TL_stats.BroadcastRevenueTransaction) {
            ik1.N(getParentActivity(), this.currentAccount, (TL_stats.BroadcastRevenueTransaction) c6cVar.H, this.b, this.resourceProvider);
        } else if (c6cVar.d == 2) {
            presentFragment(new mh1(this.b));
        }
    }

    public final void w0(TL_stars.StarsAmount starsAmount, int i) {
        if (this.U == null || this.V == null) {
            return;
        }
        long j = (long) (this.j0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nxa.b1(false, TextUtils.concat("XTR ", nxa.H0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
        }
        this.U.setText(spannableStringBuilder);
        this.V.setText("≈" + cj0.h().e(j, "USD"));
        this.W.setVisibility(j > 0 ? 0 : 8);
        if (this.Y) {
            this.X = true;
            vc vcVar = this.a0;
            long j2 = starsAmount.amount;
            this.Z = j2;
            vcVar.setText(Long.toString(j2));
            vc vcVar2 = this.a0;
            vcVar2.setSelection(vcVar2.getText().length());
            this.X = false;
            this.b0.setEnabled(this.Z > 0);
        }
        this.Q = i;
        mt0 mt0Var = this.t0;
        gm.r(mt0Var);
        mt0Var.run();
    }

    public final void y0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        fn0 fn0Var = this.s;
        view.setTranslationY(this.f != null ? (-(1.0f - (fn0Var == null ? 0.0f : fn0Var.e))) * gm.L(44.0f) : 0.0f);
    }

    public final void z0() {
        tb tbVar = this.b0;
        if (!tbVar.e0 || tbVar.R) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        byte b = 1;
        if (this.Q > currentTime) {
            this.k0 = c41.b0(this).Q(R.raw.timer_3, 36, gm.S2(jb6.a0(null, null, 2131752905, x0(this.Q - currentTime)))).j();
            return;
        }
        if (this.Z < getMessagesController().l4.q2.f()) {
            c41.b0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), gm.N2(jb6.G((int) getMessagesController().l4.q2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new mt0(this, b), null)).j();
            return;
        }
        long j = this.Z;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        pt0 pt0Var = new pt0((Object) this, j, (Object) twoStepVerificationActivity, (byte) 0);
        twoStepVerificationActivity.a0 = (byte) 1;
        twoStepVerificationActivity.c0 = pt0Var;
        this.b0.setLoading(true);
        twoStepVerificationActivity.x0(new ot0(this, twoStepVerificationActivity, b));
    }
}

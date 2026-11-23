package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.o4 {
    public boolean a;
    public org.telegram.ui.Components.qc0 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.du0 e;
    public org.telegram.ui.ActionBar.o3 f;
    public Intent h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public m4 x;
    public static final ArrayList y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override // org.telegram.ui.ActionBar.o4
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.d) {
            this.c.X(z10, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.g2 g2Var) {
        return true;
    }

    public final boolean d(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (z12 || !(org.telegram.messenger.g0.p2(true) || org.telegram.messenger.cz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.n = z10;
        this.w = z11;
        this.r = i7;
        this.s = i10;
        org.telegram.messenger.k10.i(i7).v(false);
        return false;
    }

    public void e(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i7, int i10) {
        if (d(intent, z10, z11, z12, i7, i10)) {
            if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
                if (org.telegram.messenger.g0.Q1()) {
                    if (this.d.getFragmentStack().isEmpty()) {
                        this.d.c(-1, new x6());
                    }
                } else if (this.c.getFragmentStack().isEmpty()) {
                    this.c.c(-1, new x6());
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    this.e.setVisibility(8);
                }
                this.c.f0();
                if (org.telegram.messenger.g0.Q1()) {
                    this.d.f0();
                }
                intent.setAction(null);
                return;
            }
            if (i10 == 0) {
                int c10 = org.telegram.messenger.k10.c();
                if (c10 == 0) {
                    this.h = intent;
                    this.n = z10;
                    this.w = z11;
                    this.r = i7;
                    this.s = i10;
                    de0 de0Var = new de0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.c(-1, de0Var);
                    } else {
                        this.c.c(-1, de0Var);
                    }
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.e.setVisibility(8);
                    }
                    this.c.f0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.f0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.hd.N0(2131747012, null);
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                    return;
                }
                if (c10 >= 2) {
                    org.telegram.ui.ActionBar.t1 i11 = org.telegram.ui.Components.c5.i(this, new org.telegram.ui.Components.y4() { // from class: org.telegram.ui.sx
                        @Override // org.telegram.ui.Components.y4
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i7;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.y;
                            if (i12 != i14 && i12 != (i13 = org.telegram.messenger.k10.t0)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                org.telegram.messenger.k10.t0 = i12;
                                org.telegram.messenger.k10.i(0).v(false);
                                if (!org.telegram.messenger.t0.x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.k10.t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.e(intent2, z13, z14, z15, i12, 1);
                        }
                    });
                    i11.show();
                    i11.setCanceledOnTouchOutside(false);
                    i11.setOnDismissListener(new q5(this, 6));
                    return;
                }
            }
            long longExtra = intent.getLongExtra("bot_id", intent.getIntExtra("bot_id", 0));
            String stringExtra = intent.getStringExtra("nonce");
            String stringExtra2 = intent.getStringExtra("payload");
            TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
            getauthorizationform.bot_id = longExtra;
            getauthorizationform.scope = intent.getStringExtra("scope");
            getauthorizationform.public_key = intent.getStringExtra("public_key");
            if (longExtra == 0 || ((TextUtils.isEmpty(stringExtra2) && TextUtils.isEmpty(stringExtra)) || TextUtils.isEmpty(getauthorizationform.scope) || TextUtils.isEmpty(getauthorizationform.public_key))) {
                finish();
                return;
            }
            int[] iArr = {0};
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, this, null);
            t1Var2.setOnCancelListener(new tx(i7, 0, iArr));
            t1Var2.show();
            iArr[0] = ConnectionsManager.getInstance(i7).sendRequest(getauthorizationform, new t8(this, iArr, i7, t1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
        }
    }

    public final void g() {
        ActionBarLayout actionBarLayout;
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.d) == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
        Point point = org.telegram.messenger.g0.q;
        layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
        int i7 = org.telegram.messenger.g0.m;
        layoutParams.topMargin = (((point.y - layoutParams.height) - i7) / 2) + i7;
        this.d.getView().setLayoutParams(layoutParams);
        if (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            this.c.getView().setLayoutParams(layoutParams2);
            return;
        }
        int i10 = (point.x / 100) * 35;
        if (i10 < org.telegram.messenger.g0.L(320.0f)) {
            i10 = org.telegram.messenger.g0.L(320.0f);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
        layoutParams3.width = i10;
        layoutParams3.height = -1;
        this.c.getView().setLayoutParams(layoutParams3);
        if (org.telegram.messenger.g0.P1() && this.c.getFragmentStack().size() == 2) {
            ((org.telegram.ui.ActionBar.g2) this.c.getFragmentStack().get(1)).onPause();
            this.c.getFragmentStack().remove(1);
            this.c.f0();
        }
    }

    public final void h() {
        if (this.a) {
            return;
        }
        m4 m4Var = this.x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.x = null;
        }
        this.a = true;
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        org.telegram.messenger.cz.x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        this.b.m(false, -1, -1, null);
        org.telegram.messenger.cz.C = true;
        this.b.setDelegate(new zr(this, 10));
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.c && actionBarLayout.getFragmentStack().size() <= 1) {
                h();
                finish();
                return false;
            }
            if (actionBarLayout == this.d && this.c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
                h();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            h();
            finish();
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.p4 p4Var) {
        org.telegram.ui.ActionBar.g2 g2Var = p4Var.a;
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.b.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
            return;
        }
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.d) == null) {
            this.c.I();
        } else if (actionBarLayout.getView().getVisibility() == 0) {
            this.d.I();
        } else {
            this.c.I();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.v3(getWindow());
        super.onConfigurationChanged(configuration);
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.c) != null) {
            actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new ux(this));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.s6(1));
        if (!org.telegram.messenger.cz.s.isEmpty() && !org.telegram.messenger.cz.A) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.cz.s.isEmpty() && org.telegram.messenger.cz.x) {
            org.telegram.messenger.cz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        org.telegram.ui.ActionBar.m6.T(this);
        org.telegram.ui.ActionBar.m6.K(this, false);
        this.c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3(this);
        this.f = o3Var;
        setContentView(o3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            kg.n1 n1Var = new kg.n1(this, null, 2);
            this.e = n1Var;
            n1Var.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.m6.s0());
            relativeLayout.addView(this.e, c8.ma.w(-1, -1));
            relativeLayout.addView(this.c.getView(), c8.ma.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, c8.ma.w(-1, -1));
            frameLayout.setOnTouchListener(new c0(this, 2));
            frameLayout.setOnClickListener(new bi.o(21));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.d.getView(), c8.ma.w(530, org.telegram.messenger.g0.P1() ? 528 : 700));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, c8.ma.c(-1.0f, -1));
            kg.n1 n1Var2 = new kg.n1(this, null, 3);
            this.e = n1Var2;
            n1Var2.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.m6.s0());
            relativeLayout2.addView(this.e, c8.ma.w(-1, -1));
            relativeLayout2.addView(this.c.getView(), c8.ma.w(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(y);
        this.c.setDelegate(this);
        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(this);
        this.b = qc0Var;
        this.f.addView(qc0Var, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.n4, this);
        this.c.a0();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.a0();
        }
        e(getIntent(), false, bundle != null, false, org.telegram.messenger.k10.t0, 0);
        g();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        h();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        ActionBarLayout actionBarLayout;
        super.onLowMemory();
        this.c.M();
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.d) == null) {
            return;
        }
        actionBarLayout.M();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e(intent, true, false, false, org.telegram.messenger.k10.t0, 0);
    }

    @Override // android.app.Activity
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.c.O();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.O();
        }
        org.telegram.messenger.t0.E = true;
        m4 m4Var = this.x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.x = null;
        }
        if (org.telegram.messenger.cz.s.isEmpty()) {
            org.telegram.messenger.cz.B = 0;
        } else {
            org.telegram.messenger.cz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.x = m4Var2;
            if (org.telegram.messenger.cz.x) {
                org.telegram.messenger.g0.h3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.cz.y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.h3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        }
        org.telegram.messenger.cz.y();
        org.telegram.ui.Components.qc0 qc0Var = this.b;
        if (qc0Var != null) {
            qc0Var.k();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.c.P();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.P();
        }
        org.telegram.messenger.t0.E = false;
        m4 m4Var = this.x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.x = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.cz.B != 0) {
            org.telegram.messenger.cz.B = 0;
            org.telegram.messenger.cz.y();
        }
        if (this.b.getVisibility() != 0) {
            this.c.P();
            if (!org.telegram.messenger.g0.Q1() || (actionBarLayout2 = this.d) == null) {
                return;
            }
            actionBarLayout2.P();
            return;
        }
        this.c.n();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.b.l();
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ void f(int[] iArr) {
    }
}

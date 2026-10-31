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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.v4 {
    public boolean a;
    public org.telegram.ui.Components.zc0 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.uu0 e;
    public org.telegram.ui.ActionBar.s3 f;
    public Intent h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public m4 x;
    public static final ArrayList y = new ArrayList();
    public static final ArrayList D = new ArrayList();

    @Override // org.telegram.ui.ActionBar.v4
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.i0.Q1() && actionBarLayout == this.d) {
            this.c.W(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || !(org.telegram.messenger.i0.p2(true) || org.telegram.messenger.tz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.n = z10;
        this.w = z11;
        this.r = i10;
        this.s = i11;
        org.telegram.messenger.d20.i(i10).v(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i10, int i11) {
        if (c(intent, z10, z11, z12, i10, i11)) {
            if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
                if (org.telegram.messenger.i0.Q1()) {
                    if (this.d.getFragmentStack().isEmpty()) {
                        this.d.c(-1, new y6());
                    }
                } else if (this.c.getFragmentStack().isEmpty()) {
                    this.c.c(-1, new y6());
                }
                if (!org.telegram.messenger.i0.Q1()) {
                    this.e.setVisibility(8);
                }
                this.c.e0();
                if (org.telegram.messenger.i0.Q1()) {
                    this.d.e0();
                }
                intent.setAction(null);
                return;
            }
            if (i11 == 0) {
                int c10 = org.telegram.messenger.d20.c();
                if (c10 == 0) {
                    this.h = intent;
                    this.n = z10;
                    this.w = z11;
                    this.r = i10;
                    this.s = i11;
                    hf0 hf0Var = new hf0();
                    if (org.telegram.messenger.i0.Q1()) {
                        this.d.c(-1, hf0Var);
                    } else {
                        this.c.c(-1, hf0Var);
                    }
                    if (!org.telegram.messenger.i0.Q1()) {
                        this.e.setVisibility(8);
                    }
                    this.c.e0();
                    if (org.telegram.messenger.i0.Q1()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131747221, null);
                    i0.a.w(null, 2131747847, alertDialog$Builder, null);
                    return;
                }
                if (c10 >= 2) {
                    org.telegram.ui.ActionBar.x1 i12 = org.telegram.ui.Components.s4.i(this, new org.telegram.ui.Components.o4() { // from class: org.telegram.ui.ry
                        @Override // org.telegram.ui.Components.o4
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.y;
                            if (i13 != i15 && i13 != (i14 = org.telegram.messenger.d20.s0)) {
                                ConnectionsManager.getInstance(i14).setAppPaused(true, false);
                                org.telegram.messenger.d20.s0 = i13;
                                org.telegram.messenger.d20.i(0).v(false);
                                if (!org.telegram.messenger.w0.x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i13, 1);
                        }
                    });
                    i12.show();
                    i12.setCanceledOnTouchOutside(false);
                    i12.setOnDismissListener(new q5(this, 6));
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
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, this, null);
            x1Var2.setOnCancelListener(new sy(i10, 0, iArr));
            x1Var2.show();
            iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new t8(this, iArr, i10, x1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
        }
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (!org.telegram.messenger.i0.Q1() || (actionBarLayout = this.d) == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
        Point point = org.telegram.messenger.i0.q;
        layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
        int i10 = org.telegram.messenger.i0.m;
        layoutParams.topMargin = (((point.y - layoutParams.height) - i10) / 2) + i10;
        this.d.getView().setLayoutParams(layoutParams);
        if (org.telegram.messenger.i0.P1() && getResources().getConfiguration().orientation != 2) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            this.c.getView().setLayoutParams(layoutParams2);
            return;
        }
        int i11 = (point.x / 100) * 35;
        if (i11 < org.telegram.messenger.i0.L(320.0f)) {
            i11 = org.telegram.messenger.i0.L(320.0f);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
        layoutParams3.width = i11;
        layoutParams3.height = -1;
        this.c.getView().setLayoutParams(layoutParams3);
        if (org.telegram.messenger.i0.P1() && this.c.getFragmentStack().size() == 2) {
            ((org.telegram.ui.ActionBar.k2) this.c.getFragmentStack().get(1)).onPause();
            this.c.getFragmentStack().remove(1);
            this.c.e0();
        }
    }

    public final void g() {
        if (this.a) {
            return;
        }
        m4 m4Var = this.x;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.x = null;
        }
        this.a = true;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean h(org.telegram.ui.ActionBar.k2 k2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        org.telegram.messenger.tz.x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (h4.G() && h4.v().V) {
            h4.v().m(false, true);
        }
        this.b.m(false, -1, -1, null);
        org.telegram.messenger.tz.C = true;
        this.b.setDelegate(new tt(this, 9));
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.i0.Q1()) {
            if (actionBarLayout == this.c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            }
            if (actionBarLayout == this.d && this.c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
                g();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            g();
            finish();
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.w4 w4Var) {
        org.telegram.ui.ActionBar.k2 k2Var = w4Var.a;
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.b.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
            return;
        }
        if (!org.telegram.messenger.i0.Q1() || (actionBarLayout = this.d) == null) {
            this.c.H();
        } else if (actionBarLayout.getView().getVisibility() == 0) {
            this.d.H();
        } else {
            this.c.H();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.i0.v(this, configuration);
        org.telegram.messenger.i0.w3(getWindow());
        super.onConfigurationChanged(configuration);
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.c) != null) {
            actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new ty(this));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.w0.w();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.v6(1));
        if (!org.telegram.messenger.tz.s.isEmpty() && !org.telegram.messenger.tz.A) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.i0.h2();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.tz.s.isEmpty() && org.telegram.messenger.tz.x) {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.i0.a;
        org.telegram.ui.ActionBar.t6.T(this);
        org.telegram.ui.ActionBar.t6.K(this, false);
        this.c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this);
        this.f = s3Var;
        setContentView(s3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.i0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            ag.t2 t2Var = new ag.t2(this, null, 2);
            this.e = t2Var;
            t2Var.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.t6.s0());
            relativeLayout.addView(this.e, w7.b6.w(-1, -1));
            relativeLayout.addView(this.c.getView(), w7.b6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.b6.w(-1, -1));
            frameLayout.setOnTouchListener(new d0(this, 2));
            frameLayout.setOnClickListener(new bh.c(14));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.d.getView(), w7.b6.w(530, org.telegram.messenger.i0.P1() ? 528 : 700));
            this.d.setFragmentStack(D);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, w7.b6.c(-1.0f, -1));
            ag.t2 t2Var2 = new ag.t2(this, null, 3);
            this.e = t2Var2;
            t2Var2.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.t6.s0());
            relativeLayout2.addView(this.e, w7.b6.w(-1, -1));
            relativeLayout2.addView(this.c.getView(), w7.b6.w(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(y);
        this.c.setDelegate(this);
        org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(this);
        this.b = zc0Var;
        this.f.addView(zc0Var, w7.b6.c(-1.0f, -1));
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k4, this);
        this.c.Z();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.Z();
        }
        d(getIntent(), false, bundle != null, false, org.telegram.messenger.d20.s0, 0);
        f();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        ActionBarLayout actionBarLayout;
        super.onLowMemory();
        this.c.L();
        if (!org.telegram.messenger.i0.Q1() || (actionBarLayout = this.d) == null) {
            return;
        }
        actionBarLayout.L();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, org.telegram.messenger.d20.s0, 0);
    }

    @Override // android.app.Activity
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.c.N();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.N();
        }
        org.telegram.messenger.w0.D = true;
        m4 m4Var = this.x;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.x = null;
        }
        if (org.telegram.messenger.tz.s.isEmpty()) {
            org.telegram.messenger.tz.B = 0;
        } else {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.x = m4Var2;
            if (org.telegram.messenger.tz.x) {
                org.telegram.messenger.i0.h3(m4Var2, 1000L);
            } else {
                int i10 = org.telegram.messenger.tz.y;
                if (i10 != 0) {
                    org.telegram.messenger.i0.h3(m4Var2, (i10 * 1000) + 1000);
                }
            }
        }
        org.telegram.messenger.tz.y();
        org.telegram.ui.Components.zc0 zc0Var = this.b;
        if (zc0Var != null) {
            zc0Var.k();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.c.O();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.O();
        }
        org.telegram.messenger.w0.D = false;
        m4 m4Var = this.x;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.x = null;
        }
        if (org.telegram.messenger.i0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.tz.B != 0) {
            org.telegram.messenger.tz.B = 0;
            org.telegram.messenger.tz.y();
        }
        if (this.b.getVisibility() != 0) {
            this.c.O();
            if (!org.telegram.messenger.i0.Q1() || (actionBarLayout2 = this.d) == null) {
                return;
            }
            actionBarLayout2.O();
            return;
        }
        this.c.n();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.b.l();
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ void a(float f7) {
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ void e(int[] iArr) {
    }
}

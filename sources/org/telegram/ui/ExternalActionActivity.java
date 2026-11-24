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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ExternalActionActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ExternalActionActivity extends Activity implements pk5 {
    public boolean a;
    public by7 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public ela e;
    public wr3 f;
    public Intent h;
    public boolean n;
    public int r;
    public boolean s;
    public boolean w;
    public o04 x;
    public static final ArrayList y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override // pk5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (gm.O1() && actionBarLayout == this.d) {
            this.c.W(z, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) {
        if (z3 || !(gm.n2(true) || gda.B)) {
            return true;
        }
        i();
        this.h = intent;
        this.n = z;
        this.w = z2;
        this.r = i;
        this.s = i2;
        z8c.h(i).u(false);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(final Intent intent, final boolean z, final boolean z2, final boolean z3, final int i, int i2) {
        if (c(intent, z, z2, z3, i, i2)) {
            if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
                if (gm.O1()) {
                    if (this.d.getFragmentStack().isEmpty()) {
                        this.d.b(-1, new y71());
                    }
                } else if (this.c.getFragmentStack().isEmpty()) {
                    this.c.b(-1, new y71());
                }
                if (!gm.O1()) {
                    this.e.setVisibility(8);
                }
                this.c.e0();
                if (gm.O1()) {
                    this.d.e0();
                }
                intent.setAction(null);
                return;
            }
            if (i2 == 0) {
                int c = z8c.c();
                if (c == 0) {
                    this.h = intent;
                    this.n = z;
                    this.w = z2;
                    this.r = i;
                    this.s = i2;
                    mh6 mh6Var = new mh6();
                    if (gm.O1()) {
                        this.d.b(-1, mh6Var);
                    } else {
                        this.c.b(-1, mh6Var);
                    }
                    if (!gm.O1()) {
                        this.e.setVisibility(8);
                    }
                    this.c.e0();
                    if (gm.O1()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = jb6.M0(R.string.AppName, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131746939, null);
                    b10.t(null, 2131747564, alertDialog$Builder, null);
                    return;
                }
                if (c >= 2) {
                    he i3 = ik.i(this, new ek() { // from class: n84
                        @Override // ek
                        public final void a(int i4) {
                            int i5;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i6 = i;
                            Intent intent2 = intent;
                            boolean z4 = z;
                            boolean z5 = z2;
                            boolean z6 = z3;
                            ArrayList arrayList = ExternalActionActivity.y;
                            if (i4 != i6 && i4 != (i5 = z8c.t0)) {
                                ConnectionsManager.getInstance(i5).setAppPaused(true, false);
                                z8c.t0 = i4;
                                z8c.h(0).u(false);
                                if (!a.x) {
                                    ConnectionsManager.getInstance(z8c.t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z4, z5, z6, i4, 1);
                        }
                    });
                    i3.show();
                    i3.setCanceledOnTouchOutside(false);
                    i3.setOnDismissListener(new n1(this, (byte) 19));
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
            he heVar2 = new he(3, null, this);
            heVar2.setOnCancelListener(new o84((byte) 0, i, iArr));
            heVar2.show();
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new u91(this, iArr, i, heVar2, getauthorizationform, stringExtra2, stringExtra, (byte) 1), 10);
        }
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (!gm.O1() || (actionBarLayout = this.d) == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
        Point point = gm.q;
        layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
        int i = gm.m;
        layoutParams.topMargin = (((point.y - layoutParams.height) - i) / 2) + i;
        this.d.getView().setLayoutParams(layoutParams);
        if (gm.N1() && getResources().getConfiguration().orientation != 2) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            this.c.getView().setLayoutParams(layoutParams2);
            return;
        }
        int i2 = (point.x / 100) * 35;
        if (i2 < gm.L(320.0f)) {
            i2 = gm.L(320.0f);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
        layoutParams3.width = i2;
        layoutParams3.height = -1;
        this.c.getView().setLayoutParams(layoutParams3);
        if (gm.N1() && this.c.getFragmentStack().size() == 2) {
            ((org.telegram.ui.ActionBar.d) this.c.getFragmentStack().get(1)).onPause();
            this.c.getFragmentStack().remove(1);
            this.c.e0();
        }
    }

    public final void g() {
        if (this.a) {
            return;
        }
        o04 o04Var = this.x;
        if (o04Var != null) {
            gm.r(o04Var);
            this.x = null;
        }
        this.a = true;
    }

    @Override // pk5
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        gda.w = true;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer.r0().A(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        this.b.m(false, -1, -1, null);
        gda.B = true;
        this.b.setDelegate(new yu3(this, (byte) 16));
    }

    @Override // pk5
    public final boolean j() {
        return false;
    }

    @Override // pk5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (gm.O1()) {
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

    @Override // pk5
    public final boolean l(ActionBarLayout actionBarLayout, qk5 qk5Var) {
        org.telegram.ui.ActionBar.d dVar = qk5Var.a;
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.b.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.r0().V0()) {
            PhotoViewer.r0().A(true, false);
            return;
        }
        if (!gm.O1() || (actionBarLayout = this.d) == null) {
            this.c.G();
        } else if (actionBarLayout.getView().getVisibility() == 0) {
            this.d.G();
        } else {
            this.c.G();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        gm.v(this, configuration);
        gm.r3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!gm.O1() || (actionBarLayout = this.c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new uq(this, (byte) 3));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new x9((byte) 0));
        if (!gda.r.isEmpty() && !gda.z) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                gm.f2();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!gda.r.isEmpty() && gda.w) {
            gda.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = gm.a;
        cmb.S(this);
        cmb.J(this, false);
        this.c = new ActionBarLayout(this, false);
        wr3 wr3Var = new wr3(this);
        this.f = wr3Var;
        setContentView(wr3Var, new ViewGroup.LayoutParams(-1, -1));
        if (gm.O1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            p84 p84Var = new p84(this, null, (byte) 0);
            this.e = p84Var;
            p84Var.setOccupyStatusBar(false);
            this.e.U(cmb.r0());
            relativeLayout.addView(this.e, qoe.w(-1, -1));
            relativeLayout.addView(this.c.getView(), qoe.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, qoe.w(-1, -1));
            frameLayout.setOnTouchListener(new a7(this, (byte) 5));
            frameLayout.setOnClickListener(new x10((byte) 4));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.d.getView(), qoe.w(530, gm.N1() ? 528 : 700));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, qoe.c(-1.0f, -1));
            p84 p84Var2 = new p84(this, null, (byte) 1);
            this.e = p84Var2;
            p84Var2.setOccupyStatusBar(false);
            this.e.U(cmb.r0());
            relativeLayout2.addView(this.e, qoe.w(-1, -1));
            relativeLayout2.addView(this.c.getView(), qoe.w(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(y);
        this.c.setDelegate(this);
        by7 by7Var = new by7(this);
        this.b = by7Var;
        this.f.addView(by7Var, qoe.c(-1.0f, -1));
        nm7.e().k(nm7.o4, this);
        this.c.Z();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.Z();
        }
        d(getIntent(), false, bundle != null, false, z8c.t0, 0);
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
        this.c.K();
        if (!gm.O1() || (actionBarLayout = this.d) == null) {
            return;
        }
        actionBarLayout.K();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, z8c.t0, 0);
    }

    @Override // android.app.Activity
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.c.M();
        if (gm.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
        org.telegram.messenger.a.E = true;
        o04 o04Var = this.x;
        if (o04Var != null) {
            gm.r(o04Var);
            this.x = null;
        }
        if (gda.r.isEmpty()) {
            gda.A = 0;
        } else {
            gda.A = (int) (SystemClock.elapsedRealtime() / 1000);
            o04 o04Var2 = new o04(this, (byte) 1);
            this.x = o04Var2;
            if (gda.w) {
                gm.d3(o04Var2, 1000L);
            } else {
                int i = gda.x;
                if (i != 0) {
                    gm.d3(o04Var2, (i * 1000) + 1000);
                }
            }
        }
        gda.x();
        by7 by7Var = this.b;
        if (by7Var != null) {
            by7Var.k();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.c.N();
        if (gm.O1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.N();
        }
        org.telegram.messenger.a.E = false;
        o04 o04Var = this.x;
        if (o04Var != null) {
            gm.r(o04Var);
            this.x = null;
        }
        if (gm.n2(true)) {
            i();
        }
        if (gda.A != 0) {
            gda.A = 0;
            gda.x();
        }
        int visibility = this.b.getVisibility();
        ActionBarLayout actionBarLayout4 = this.c;
        if (visibility != 0) {
            actionBarLayout4.N();
            if (!gm.O1() || (actionBarLayout2 = this.d) == null) {
                return;
            }
            actionBarLayout2.N();
            return;
        }
        actionBarLayout4.l();
        if (gm.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.l();
        }
        this.b.l();
    }

    @Override // pk5
    public final void a(float f) {
    }

    @Override // pk5
    public final void e(int[] iArr) {
    }
}

package org.telegram.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class BubbleActivity extends th0 implements pk5 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public by7 S;
    public ActionBarLayout T;
    public wr3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public o1 Z;
    public long a0;

    public final void A() {
        if (this.S == null) {
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
        this.S.m(false, -1, -1, null);
        gda.B = true;
        this.S.setDelegate(new xg0(this, (byte) 18));
    }

    @Override // pk5
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // pk5
    public final boolean j() {
        return false;
    }

    @Override // pk5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.Q) {
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gm.r(o1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override // pk5
    public final boolean l(ActionBarLayout actionBarLayout, qk5 qk5Var) {
        org.telegram.ui.ActionBar.d dVar = qk5Var.a;
        return true;
    }

    @Override // gp4, hr2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        sm2 sm2Var;
        super.onActivityResult(i, i2, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (sm2Var = themeEditorView.m) != null) {
            sm2Var.E(i, i2, intent);
        }
        if (this.T.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.d) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i, i2, intent);
    }

    @Override // hr2, android.app.Activity
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.r0().V0()) {
            PhotoViewer.r0().A(true, false);
        } else {
            this.T.G();
        }
    }

    @Override // hr2, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        gm.v(this, configuration);
        gm.r3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // gp4, hr2, gr2, android.app.Activity
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
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        wr3 wr3Var = new wr3(this);
        this.U = wr3Var;
        setContentView(wr3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, qoe.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), qoe.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        by7 by7Var = new by7(this);
        this.S = by7Var;
        this.U.addView(by7Var, qoe.c(-1.0f, -1));
        nm7.e().k(nm7.o4, this);
        this.T.Z();
        z(getIntent(), false, bundle != null, false, z8c.t0);
        b0 = this;
    }

    @Override // gp4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i = this.P;
        if (i != -1) {
            boolean z = false;
            lo7.l0.c(new vp2((jm7) lo7.n(j5.a(i).a), z, this.a0, (byte) 1));
            ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gm.r(o1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        b0 = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.T.K();
    }

    @Override // hr2, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        z(intent, true, false, false, z8c.t0);
    }

    @Override // gp4, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.T.M();
        org.telegram.messenger.a.E = true;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gm.r(o1Var);
            this.Z = null;
        }
        if (gda.r.isEmpty()) {
            gda.A = 0;
        } else {
            gda.A = (int) (SystemClock.elapsedRealtime() / 1000);
            o1 o1Var2 = new o1(this, (byte) 10);
            this.Z = o1Var2;
            if (gda.w) {
                gm.d3(o1Var2, 1000L);
            } else {
                int i = gda.x;
                if (i != 0) {
                    gm.d3(o1Var2, (i * 1000) + 1000);
                }
            }
        }
        gda.x();
        by7 by7Var = this.S;
        if (by7Var != null) {
            by7Var.k();
        }
        b0 = null;
    }

    @Override // gp4, hr2, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (w(i, strArr, iArr)) {
            if (!this.T.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.d) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            iic.h(iArr, i);
        }
    }

    @Override // gp4, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.T.N();
        org.telegram.messenger.a.E = false;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gm.r(o1Var);
            this.Z = null;
        }
        if (gm.n2(true)) {
            A();
        }
        if (gda.A != 0) {
            gda.A = 0;
            gda.x();
        }
        int visibility = this.S.getVisibility();
        ActionBarLayout actionBarLayout = this.T;
        if (visibility != 0) {
            actionBarLayout.N();
        } else {
            actionBarLayout.l();
            this.S.l();
        }
        b0 = this;
    }

    public final void z(Intent intent, boolean z, boolean z2, boolean z3, int i) {
        yv1 yv1Var;
        boolean z4 = true;
        if (!z3 && (gm.n2(true) || gda.B)) {
            A();
            this.V = intent;
            this.W = z;
            this.Y = z2;
            this.X = i;
            z8c.h(i).u(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
        this.P = intExtra;
        if (!z8c.q(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            yv1Var = null;
        } else {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.a0 = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.a0 = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            yv1Var = new yv1(bundle);
            yv1Var.setInBubbleMode(true);
            yv1Var.setCurrentAccount(this.P);
        }
        if (yv1Var == null) {
            finish();
            return;
        }
        nm7.f(this.P).k(nm7.s, Long.valueOf(this.a0));
        this.T.Z();
        this.T.b(-1, yv1Var);
        lo7.l0.c(new vp2((jm7) lo7.n(j5.a(this.P).a), z4, this.a0, (byte) 1));
        ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        this.T.e0();
    }

    @Override // pk5
    public final void a(float f) {
    }

    @Override // pk5
    public final void e(int[] iArr) {
    }

    @Override // pk5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
    }
}

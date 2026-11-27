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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class BubbleActivity extends ug0 implements sk5 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public fz7 S;
    public ActionBarLayout T;
    public dr3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public p1 Z;
    public long a0;

    public final void A() {
        if (this.S == null) {
            return;
        }
        xea.w = true;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        this.S.m(false, -1, -1, null);
        xea.B = true;
        this.S.setDelegate(new tg0(this, (byte) 16));
    }

    @Override // sk5
    public final boolean h(org.telegram.ui.ActionBar.e eVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // sk5
    public final boolean j() {
        return false;
    }

    @Override // sk5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.Q) {
            p1 p1Var = this.Z;
            if (p1Var != null) {
                hl.r(p1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override // sk5
    public final boolean l(ActionBarLayout actionBarLayout, tk5 tk5Var) {
        org.telegram.ui.ActionBar.e eVar = tk5Var.a;
        return true;
    }

    @Override // jp4, pq2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        am2 am2Var;
        super.onActivityResult(i, i2, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (am2Var = themeEditorView.m) != null) {
            am2Var.E(i, i2, intent);
        }
        if (this.T.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.e) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i, i2, intent);
    }

    @Override // pq2, android.app.Activity
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(true, false);
        } else {
            this.T.G();
        }
    }

    @Override // pq2, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        hl.v(this, configuration);
        hl.r3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // jp4, pq2, oq2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new y9((byte) 0));
        if (!xea.r.isEmpty() && !xea.z) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                hl.f2();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!xea.r.isEmpty() && xea.w) {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = hl.a;
        aob.S(this);
        aob.J(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        dr3 dr3Var = new dr3(this);
        this.U = dr3Var;
        setContentView(dr3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, tre.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), tre.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        fz7 fz7Var = new fz7(this);
        this.S = fz7Var;
        this.U.addView(fz7Var, tre.c(-1.0f, -1));
        jn7.e().k(jn7.n4, this);
        this.T.Z();
        z(getIntent(), false, bundle != null, false, yac.t0);
        b0 = this;
    }

    @Override // jp4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i = this.P;
        if (i != -1) {
            boolean z = false;
            ip7.l0.c(new dp2((fn7) ip7.n(k5.a(i).a), z, this.a0, (byte) 1));
            ConnectionsManager.getInstance(k5.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            p1 p1Var = this.Z;
            if (p1Var != null) {
                hl.r(p1Var);
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

    @Override // pq2, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        z(intent, true, false, false, yac.t0);
    }

    @Override // jp4, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.T.M();
        org.telegram.messenger.a.E = true;
        p1 p1Var = this.Z;
        if (p1Var != null) {
            hl.r(p1Var);
            this.Z = null;
        }
        if (xea.r.isEmpty()) {
            xea.A = 0;
        } else {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
            p1 p1Var2 = new p1(this, (byte) 10);
            this.Z = p1Var2;
            if (xea.w) {
                hl.d3(p1Var2, 1000L);
            } else {
                int i = xea.x;
                if (i != 0) {
                    hl.d3(p1Var2, (i * 1000) + 1000);
                }
            }
        }
        xea.x();
        fz7 fz7Var = this.S;
        if (fz7Var != null) {
            fz7Var.k();
        }
        b0 = null;
    }

    @Override // jp4, pq2, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (w(i, strArr, iArr)) {
            if (!this.T.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.e) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            mkc.h(iArr, i);
        }
    }

    @Override // jp4, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.T.N();
        org.telegram.messenger.a.E = false;
        p1 p1Var = this.Z;
        if (p1Var != null) {
            hl.r(p1Var);
            this.Z = null;
        }
        if (hl.n2(true)) {
            A();
        }
        if (xea.A != 0) {
            xea.A = 0;
            xea.x();
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
        zu1 zu1Var;
        boolean z4 = true;
        if (!z3 && (hl.n2(true) || xea.B)) {
            A();
            this.V = intent;
            this.W = z;
            this.Y = z2;
            this.X = i;
            yac.h(i).u(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", yac.t0);
        this.P = intExtra;
        if (!yac.q(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            zu1Var = null;
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
            zu1Var = new zu1(bundle);
            zu1Var.setInBubbleMode(true);
            zu1Var.setCurrentAccount(this.P);
        }
        if (zu1Var == null) {
            finish();
            return;
        }
        jn7.f(this.P).k(jn7.s, Long.valueOf(this.a0));
        this.T.Z();
        this.T.b(-1, zu1Var);
        ip7.l0.c(new dp2((fn7) ip7.n(k5.a(this.P).a), z4, this.a0, (byte) 1));
        ConnectionsManager.getInstance(k5.a(this.P).a).setAppPaused(false, false);
        this.T.e0();
    }

    @Override // sk5
    public final void a(float f) {
    }

    @Override // sk5
    public final void e(int[] iArr) {
    }

    @Override // sk5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
    }
}

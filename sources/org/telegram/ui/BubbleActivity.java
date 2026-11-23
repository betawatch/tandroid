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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class BubbleActivity extends g5 implements org.telegram.ui.ActionBar.o4 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public org.telegram.ui.Components.qc0 S;
    public ActionBarLayout T;
    public org.telegram.ui.ActionBar.o3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public m4 Z;
    public long a0;

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.g2 g2Var) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.Q) {
            m4 m4Var = this.Z;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.p4 p4Var) {
        org.telegram.ui.ActionBar.g2 g2Var = p4Var.a;
        return true;
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        a8.r7 r7Var;
        super.onActivityResult(i7, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (r7Var = themeEditorView.m) != null) {
            r7Var.w(i7, i10, intent);
        }
        if (this.T.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.g2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i7, i10, intent);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else {
            this.T.I();
        }
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.v3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, e0.e, android.app.Activity
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
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3(this);
        this.U = o3Var;
        setContentView(o3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, c8.ma.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), c8.ma.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(this);
        this.S = qc0Var;
        this.U.addView(qc0Var, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.n4, this);
        this.T.a0();
        x(getIntent(), false, bundle != null, false, org.telegram.messenger.k10.t0);
        b0 = this;
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i7 = this.P;
        if (i7 != -1) {
            boolean z10 = false;
            org.telegram.messenger.ys.l0.c(new di.vb(org.telegram.messenger.ys.t(org.telegram.messenger.c.a(i7).a), z10, this.a0, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            m4 m4Var = this.Z;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
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
        this.T.M();
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.k10.t0);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.T.O();
        org.telegram.messenger.t0.E = true;
        m4 m4Var = this.Z;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Z = null;
        }
        if (org.telegram.messenger.cz.s.isEmpty()) {
            org.telegram.messenger.cz.B = 0;
        } else {
            org.telegram.messenger.cz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 1);
            this.Z = m4Var2;
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
        org.telegram.ui.Components.qc0 qc0Var = this.S;
        if (qc0Var != null) {
            qc0Var.k();
        }
        b0 = null;
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (u(i7, strArr, iArr)) {
            if (!this.T.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.g2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
            hc1.h(iArr, i7);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.T.P();
        org.telegram.messenger.t0.E = false;
        m4 m4Var = this.Z;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Z = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.cz.B != 0) {
            org.telegram.messenger.cz.B = 0;
            org.telegram.messenger.cz.y();
        }
        if (this.S.getVisibility() != 0) {
            this.T.P();
        } else {
            this.T.n();
            this.S.l();
        }
        b0 = this;
    }

    public final void x(Intent intent, boolean z10, boolean z11, boolean z12, int i7) {
        bn bnVar;
        boolean z13 = true;
        if (!z12 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.cz.C)) {
            z();
            this.V = intent;
            this.W = z10;
            this.Y = z11;
            this.X = i7;
            org.telegram.messenger.k10.i(i7).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.k10.t0);
        this.P = intExtra;
        if (!org.telegram.messenger.k10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            bnVar = null;
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
            bnVar = new bn(bundle);
            bnVar.setInBubbleMode(true);
            bnVar.setCurrentAccount(this.P);
        }
        if (bnVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.ls.f(this.P).k(org.telegram.messenger.ls.t, Long.valueOf(this.a0));
        this.T.a0();
        this.T.c(-1, bnVar);
        org.telegram.messenger.ys.l0.c(new di.vb(org.telegram.messenger.ys.t(org.telegram.messenger.c.a(this.P).a), z13, this.a0, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).a).setAppPaused(false, false);
        this.T.f0();
    }

    public final void z() {
        if (this.S == null) {
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
        this.S.m(false, -1, -1, null);
        org.telegram.messenger.cz.C = true;
        this.S.setDelegate(new w0(this, 6));
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ void f(int[] iArr) {
    }

    @Override // org.telegram.ui.ActionBar.o4
    public final /* synthetic */ void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}

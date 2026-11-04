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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class BubbleActivity extends i5 implements org.telegram.ui.ActionBar.n4 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public org.telegram.ui.Components.zb0 S;
    public ActionBarLayout T;
    public org.telegram.ui.ActionBar.l3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public o4 Z;
    public long a0;

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ boolean h(org.telegram.ui.ActionBar.d2 d2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.Q) {
            o4 o4Var = this.Z;
            if (o4Var != null) {
                org.telegram.messenger.g0.r(o4Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        org.telegram.ui.ActionBar.d2 d2Var = o4Var.a;
        return true;
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i3, int i10, Intent intent) {
        b8.ke keVar;
        super.onActivityResult(i3, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (keVar = themeEditorView.m) != null) {
            keVar.u(i3, i10, intent);
        }
        if (this.T.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.d2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i3, i10, intent);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
        } else {
            this.T.I();
        }
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.q6(1));
        if (!org.telegram.messenger.az.s.isEmpty() && !org.telegram.messenger.az.A) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.az.s.isEmpty() && org.telegram.messenger.az.x) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(this);
        this.U = l3Var;
        setContentView(l3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, b8.mf.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), b8.mf.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        org.telegram.ui.Components.zb0 zb0Var = new org.telegram.ui.Components.zb0(this);
        this.S = zb0Var;
        this.U.addView(zb0Var, b8.mf.c(-1.0f, -1));
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k4, this);
        this.T.a0();
        x(getIntent(), false, bundle != null, false, org.telegram.messenger.h10.t0);
        b0 = this;
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i3 = this.P;
        if (i3 != -1) {
            boolean z10 = false;
            org.telegram.messenger.us.l0.c(new ci.cc(org.telegram.messenger.us.t(org.telegram.messenger.c.a(i3).a), z10, this.a0, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            o4 o4Var = this.Z;
            if (o4Var != null) {
                org.telegram.messenger.g0.r(o4Var);
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
        x(intent, true, false, false, org.telegram.messenger.h10.t0);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.T.O();
        org.telegram.messenger.t0.E = true;
        o4 o4Var = this.Z;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.Z = null;
        }
        if (org.telegram.messenger.az.s.isEmpty()) {
            org.telegram.messenger.az.B = 0;
        } else {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
            o4 o4Var2 = new o4(this, 1);
            this.Z = o4Var2;
            if (org.telegram.messenger.az.x) {
                org.telegram.messenger.g0.i3(o4Var2, 1000L);
            } else {
                int i3 = org.telegram.messenger.az.y;
                if (i3 != 0) {
                    org.telegram.messenger.g0.i3(o4Var2, (i3 * 1000) + 1000);
                }
            }
        }
        org.telegram.messenger.az.y();
        org.telegram.ui.Components.zb0 zb0Var = this.S;
        if (zb0Var != null) {
            zb0Var.k();
        }
        b0 = null;
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i3, strArr, iArr);
        if (u(i3, strArr, iArr)) {
            if (!this.T.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.d2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i3, strArr, iArr);
            }
            zb1.k(iArr, i3);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.T.P();
        org.telegram.messenger.t0.E = false;
        o4 o4Var = this.Z;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.Z = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            org.telegram.messenger.az.y();
        }
        if (this.S.getVisibility() != 0) {
            this.T.P();
        } else {
            this.T.n();
            this.S.l();
        }
        b0 = this;
    }

    public final void x(Intent intent, boolean z10, boolean z11, boolean z12, int i3) {
        wm wmVar;
        boolean z13 = true;
        if (!z12 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.az.C)) {
            z();
            this.V = intent;
            this.W = z10;
            this.Y = z11;
            this.X = i3;
            org.telegram.messenger.h10.i(i3).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.h10.t0);
        this.P = intExtra;
        if (!org.telegram.messenger.h10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            wmVar = null;
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
            wmVar = new wm(bundle);
            wmVar.setInBubbleMode(true);
            wmVar.setCurrentAccount(this.P);
        }
        if (wmVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.hs.f(this.P).k(org.telegram.messenger.hs.t, Long.valueOf(this.a0));
        this.T.a0();
        this.T.c(-1, wmVar);
        org.telegram.messenger.us.l0.c(new ci.cc(org.telegram.messenger.us.t(org.telegram.messenger.c.a(this.P).a), z13, this.a0, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).a).setAppPaused(false, false);
        this.T.f0();
    }

    public final void z() {
        if (this.S == null) {
            return;
        }
        org.telegram.messenger.az.x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (i4.G() && i4.v().W) {
            i4.v().m(false, true);
        }
        this.S.m(false, -1, -1, null);
        org.telegram.messenger.az.C = true;
        this.S.setDelegate(new x0(this, 6));
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void e(int[] iArr) {
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}

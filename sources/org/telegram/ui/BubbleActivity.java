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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class BubbleActivity extends f5 implements org.telegram.ui.ActionBar.v4 {
    public static BubbleActivity a0;
    public boolean P;
    public final ArrayList Q = new ArrayList();
    public org.telegram.ui.Components.zc0 R;
    public ActionBarLayout S;
    public org.telegram.ui.ActionBar.s3 T;
    public Intent U;
    public boolean V;
    public int W;
    public boolean X;
    public m4 Y;
    public long Z;

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ boolean h(org.telegram.ui.ActionBar.k2 k2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.P) {
            m4 m4Var = this.Y;
            if (m4Var != null) {
                org.telegram.messenger.i0.r(m4Var);
                this.Y = null;
            }
            this.P = true;
            a0 = null;
        }
        finish();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.w4 w4Var) {
        org.telegram.ui.ActionBar.k2 k2Var = w4Var.a;
        return true;
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        bh.d dVar;
        super.onActivityResult(i10, i11, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (dVar = themeEditorView.m) != null) {
            dVar.y(i10, i11, intent);
        }
        if (this.S.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.k2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onActivityResultFragment(i10, i11, intent);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (this.Q.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.R.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
        } else {
            this.S.H();
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.i0.v(this, configuration);
        org.telegram.messenger.i0.w3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, e0.f, android.app.Activity
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
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.S = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.S.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this);
        this.T = s3Var;
        setContentView(s3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.T.addView(relativeLayout, w7.b6.c(-1.0f, -1));
        relativeLayout.addView(this.S.getView(), w7.b6.w(-1, -1));
        this.T.setParentActionBarLayout(this.S);
        this.S.setDrawerLayoutContainer(this.T);
        this.S.setFragmentStack(this.Q);
        this.S.setDelegate(this);
        org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(this);
        this.R = zc0Var;
        this.T.addView(zc0Var, w7.b6.c(-1.0f, -1));
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k4, this);
        this.S.Z();
        x(getIntent(), false, bundle != null, false, org.telegram.messenger.d20.s0);
        a0 = this;
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i10 = this.O;
        if (i10 != -1) {
            boolean z10 = false;
            org.telegram.messenger.ot.k0.c(new org.telegram.messenger.kt(org.telegram.messenger.ot.t(org.telegram.messenger.c.a(i10).a), z10, this.Z, 0));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.O).a).setAppPaused(false, false);
        }
        if (!this.P) {
            m4 m4Var = this.Y;
            if (m4Var != null) {
                org.telegram.messenger.i0.r(m4Var);
                this.Y = null;
            }
            this.P = true;
            a0 = null;
        }
        a0 = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.S.L();
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.d20.s0);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.S.N();
        org.telegram.messenger.w0.D = true;
        m4 m4Var = this.Y;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.Y = null;
        }
        if (org.telegram.messenger.tz.s.isEmpty()) {
            org.telegram.messenger.tz.B = 0;
        } else {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 1);
            this.Y = m4Var2;
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
        org.telegram.ui.Components.zc0 zc0Var = this.R;
        if (zc0Var != null) {
            zc0Var.k();
        }
        a0 = null;
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            if (!this.S.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.k2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            be1.k(iArr, i10);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.S.O();
        org.telegram.messenger.w0.D = false;
        m4 m4Var = this.Y;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.Y = null;
        }
        if (org.telegram.messenger.i0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.tz.B != 0) {
            org.telegram.messenger.tz.B = 0;
            org.telegram.messenger.tz.y();
        }
        if (this.R.getVisibility() != 0) {
            this.S.O();
        } else {
            this.S.n();
            this.R.l();
        }
        a0 = this;
    }

    public final void x(Intent intent, boolean z10, boolean z11, boolean z12, int i10) {
        un unVar;
        boolean z13 = true;
        if (!z12 && (org.telegram.messenger.i0.p2(true) || org.telegram.messenger.tz.C)) {
            z();
            this.U = intent;
            this.V = z10;
            this.X = z11;
            this.W = i10;
            org.telegram.messenger.d20.i(i10).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.d20.s0);
        this.O = intExtra;
        if (!org.telegram.messenger.d20.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            unVar = null;
        } else {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.Z = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.Z = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            unVar = new un(bundle);
            unVar.setInBubbleMode(true);
            unVar.setCurrentAccount(this.O);
        }
        if (unVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.zs.f(this.O).k(org.telegram.messenger.zs.t, Long.valueOf(this.Z));
        this.S.Z();
        this.S.c(-1, unVar);
        org.telegram.messenger.ot.k0.c(new org.telegram.messenger.kt(org.telegram.messenger.ot.t(org.telegram.messenger.c.a(this.O).a), z13, this.Z, 0));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.O).a).setAppPaused(false, false);
        this.S.e0();
    }

    public final void z() {
        if (this.R == null) {
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
        this.R.m(false, -1, -1, null);
        org.telegram.messenger.tz.C = true;
        this.R.setDelegate(new y0(this, 6));
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ void a(float f7) {
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ void e(int[] iArr) {
    }

    @Override // org.telegram.ui.ActionBar.v4
    public final /* synthetic */ void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}

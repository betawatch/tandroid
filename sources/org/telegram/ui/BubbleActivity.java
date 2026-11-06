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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class BubbleActivity extends g5 implements org.telegram.ui.ActionBar.n4 {
    public static BubbleActivity a0;
    public boolean P;
    public final ArrayList Q = new ArrayList();
    public org.telegram.ui.Components.ec0 R;
    public ActionBarLayout S;
    public org.telegram.ui.ActionBar.n3 T;
    public Intent U;
    public boolean V;
    public int W;
    public boolean X;
    public m4 Y;
    public long Z;

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ boolean h(org.telegram.ui.ActionBar.f2 f2Var, ActionBarLayout actionBarLayout) {
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
        if (!this.P) {
            m4 m4Var = this.Y;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Y = null;
            }
            this.P = true;
            a0 = null;
        }
        finish();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        org.telegram.ui.ActionBar.f2 f2Var = o4Var.a;
        return true;
    }

    @Override // androidx.fragment.app.u, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        a8.r7 r7Var;
        super.onActivityResult(i7, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (r7Var = themeEditorView.m) != null) {
            r7Var.t(i7, i10, intent);
        }
        if (this.S.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.f2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onActivityResultFragment(i7, i10, intent);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        if (this.Q.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.R.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else {
            this.S.I();
        }
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.u, androidx.activity.l, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.r6(1));
        if (!org.telegram.messenger.iz.s.isEmpty() && !org.telegram.messenger.iz.A) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.iz.s.isEmpty() && org.telegram.messenger.iz.x) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.S = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.S.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(this);
        this.T = n3Var;
        setContentView(n3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.T.addView(relativeLayout, c8.ha.c(-1.0f, -1));
        relativeLayout.addView(this.S.getView(), c8.ha.w(-1, -1));
        this.T.setParentActionBarLayout(this.S);
        this.S.setDrawerLayoutContainer(this.T);
        this.S.setFragmentStack(this.Q);
        this.S.setDelegate(this);
        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(this);
        this.R = ec0Var;
        this.T.addView(ec0Var, c8.ha.c(-1.0f, -1));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k4, this);
        this.S.a0();
        x(getIntent(), false, bundle != null, false, org.telegram.messenger.p10.s0);
        a0 = this;
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i7 = this.O;
        if (i7 != -1) {
            boolean z9 = false;
            org.telegram.messenger.dt.k0.c(new bi.kd(org.telegram.messenger.dt.t(org.telegram.messenger.c.a(i7).a), z9, this.Z, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.O).a).setAppPaused(false, false);
        }
        if (!this.P) {
            m4 m4Var = this.Y;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
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
        this.S.M();
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.p10.s0);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.S.O();
        org.telegram.messenger.t0.D = true;
        m4 m4Var = this.Y;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Y = null;
        }
        if (org.telegram.messenger.iz.s.isEmpty()) {
            org.telegram.messenger.iz.B = 0;
        } else {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 1);
            this.Y = m4Var2;
            if (org.telegram.messenger.iz.x) {
                org.telegram.messenger.g0.i3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.iz.y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.i3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        }
        org.telegram.messenger.iz.y();
        org.telegram.ui.Components.ec0 ec0Var = this.R;
        if (ec0Var != null) {
            ec0Var.k();
        }
        a0 = null;
    }

    @Override // androidx.fragment.app.u, androidx.activity.l, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (u(i7, strArr, iArr)) {
            if (!this.S.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.f2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
            ec1.h(iArr, i7);
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.S.P();
        org.telegram.messenger.t0.D = false;
        m4 m4Var = this.Y;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Y = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.iz.B != 0) {
            org.telegram.messenger.iz.B = 0;
            org.telegram.messenger.iz.y();
        }
        if (this.R.getVisibility() != 0) {
            this.S.P();
        } else {
            this.S.n();
            this.R.l();
        }
        a0 = this;
    }

    public final void x(Intent intent, boolean z9, boolean z10, boolean z11, int i7) {
        an anVar;
        boolean z12 = true;
        if (!z11 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.iz.C)) {
            z();
            this.U = intent;
            this.V = z9;
            this.X = z10;
            this.W = i7;
            org.telegram.messenger.p10.i(i7).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.p10.s0);
        this.O = intExtra;
        if (!org.telegram.messenger.p10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            anVar = null;
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
            anVar = new an(bundle);
            anVar.setInBubbleMode(true);
            anVar.setCurrentAccount(this.O);
        }
        if (anVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.qs.f(this.O).k(org.telegram.messenger.qs.t, Long.valueOf(this.Z));
        this.S.a0();
        this.S.c(-1, anVar);
        org.telegram.messenger.dt.k0.c(new bi.kd(org.telegram.messenger.dt.t(org.telegram.messenger.c.a(this.O).a), z12, this.Z, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.O).a).setAppPaused(false, false);
        this.S.f0();
    }

    public final void z() {
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.iz.x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().V) {
            g4.v().m(false, true);
        }
        this.R.m(false, -1, -1, null);
        org.telegram.messenger.iz.C = true;
        this.R.setDelegate(new w0(this, 6));
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void e(int[] iArr) {
    }

    @Override // org.telegram.ui.ActionBar.n4
    public final /* synthetic */ void b(ActionBarLayout actionBarLayout, boolean z9) {
    }
}

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class BubbleActivity extends tg0 implements qi5 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public yv7 S;
    public ActionBarLayout T;
    public mq3 U;
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
        gba.w = true;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        this.S.m(false, -1, -1, null);
        gba.B = true;
        this.S.setDelegate(new sg0(this, (byte) 15));
    }

    @Override // qi5
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // qi5
    public final boolean j() {
        return false;
    }

    @Override // qi5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.Q) {
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gl.r(o1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override // qi5
    public final boolean l(ActionBarLayout actionBarLayout, ri5 ri5Var) {
        org.telegram.ui.ActionBar.d dVar = ri5Var.a;
        return true;
    }

    @Override // en4, wp2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        gl2 gl2Var;
        super.onActivityResult(i, i2, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (gl2Var = themeEditorView.m) != null) {
            gl2Var.F(i, i2, intent);
        }
        if (this.T.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.d) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i, i2, intent);
    }

    @Override // wp2, android.app.Activity
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(true, false);
        } else {
            this.T.G();
        }
    }

    @Override // wp2, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        gl.v(this, configuration);
        gl.s3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // en4, wp2, vp2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new x9((byte) 0));
        if (!gba.r.isEmpty() && !gba.z) {
            try {
                getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                gl.f2();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!gba.r.isEmpty() && gba.w) {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = gl.a;
        bkb.S(this);
        bkb.J(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        mq3 mq3Var = new mq3(this);
        this.U = mq3Var;
        setContentView(mq3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, nme.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), nme.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        yv7 yv7Var = new yv7(this);
        this.S = yv7Var;
        this.U.addView(yv7Var, nme.c(-1.0f, -1));
        kk7.e().k(kk7.m4, this);
        this.T.Z();
        z(getIntent(), false, bundle != null, false, y6c.t0);
        b0 = this;
    }

    @Override // en4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i = this.P;
        if (i != -1) {
            boolean z = false;
            im7.l0.c(new ko2((gk7) im7.n(j5.a(i).a), z, this.a0, (byte) 1));
            ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gl.r(o1Var);
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

    @Override // wp2, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        z(intent, true, false, false, y6c.t0);
    }

    @Override // en4, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.T.M();
        org.telegram.messenger.a.E = true;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gl.r(o1Var);
            this.Z = null;
        }
        if (gba.r.isEmpty()) {
            gba.A = 0;
        } else {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
            o1 o1Var2 = new o1(this, (byte) 10);
            this.Z = o1Var2;
            if (gba.w) {
                gl.e3(o1Var2, 1000L);
            } else {
                int i = gba.x;
                if (i != 0) {
                    gl.e3(o1Var2, (i * 1000) + 1000);
                }
            }
        }
        gba.x();
        yv7 yv7Var = this.S;
        if (yv7Var != null) {
            yv7Var.k();
        }
        b0 = null;
    }

    @Override // en4, wp2, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (w(i, strArr, iArr)) {
            if (!this.T.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.d) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            hgc.h(iArr, i);
        }
    }

    @Override // en4, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.T.N();
        org.telegram.messenger.a.E = false;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gl.r(o1Var);
            this.Z = null;
        }
        if (gl.n2(true)) {
            A();
        }
        if (gba.A != 0) {
            gba.A = 0;
            gba.x();
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
        mu1 mu1Var;
        boolean z4 = true;
        if (!z3 && (gl.n2(true) || gba.B)) {
            A();
            this.V = intent;
            this.W = z;
            this.Y = z2;
            this.X = i;
            y6c.h(i).u(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
        this.P = intExtra;
        if (!y6c.q(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            mu1Var = null;
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
            mu1Var = new mu1(bundle);
            mu1Var.setInBubbleMode(true);
            mu1Var.setCurrentAccount(this.P);
        }
        if (mu1Var == null) {
            finish();
            return;
        }
        kk7.f(this.P).k(kk7.s, Long.valueOf(this.a0));
        this.T.Z();
        this.T.b(-1, mu1Var);
        im7.l0.c(new ko2((gk7) im7.n(j5.a(this.P).a), z4, this.a0, (byte) 1));
        ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        this.T.e0();
    }

    @Override // qi5
    public final void a(float f) {
    }

    @Override // qi5
    public final void e(int[] iArr) {
    }

    @Override // qi5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
    }
}

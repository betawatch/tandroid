package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.a5 {
    public static final ArrayList x = new ArrayList();
    public static final ArrayList y = new ArrayList();
    public boolean a;
    public org.telegram.ui.Components.le0 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.kw0 e;
    public org.telegram.ui.ActionBar.y3 f;
    public Intent h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public a6 w;

    @Override // org.telegram.ui.ActionBar.a5
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || !(AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.n = z10;
        this.v = z11;
        this.r = i10;
        this.s = i11;
        UserConfig.getInstance(i10).saveConfig(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i10, int i11) {
        if (c(intent, z10, z11, z12, i10, i11)) {
            if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
                if (AndroidUtilities.isTablet()) {
                    if (this.d.getFragmentStack().isEmpty()) {
                        this.d.c(-1, new c7());
                    }
                } else if (this.c.getFragmentStack().isEmpty()) {
                    this.c.c(-1, new c7());
                }
                if (!AndroidUtilities.isTablet()) {
                    this.e.setVisibility(8);
                }
                this.c.c0();
                if (AndroidUtilities.isTablet()) {
                    this.d.c0();
                }
                intent.setAction(null);
                return;
            }
            if (i11 == 0) {
                int activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                if (activatedAccountsCount == 0) {
                    this.h = intent;
                    this.n = z10;
                    this.v = z11;
                    this.r = i10;
                    this.s = i11;
                    dg0 dg0Var = new dg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, dg0Var);
                    } else {
                        this.c.c(-1, dg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.b2 h = org.telegram.ui.Components.f5.h(this, new org.telegram.ui.Components.c5() { // from class: org.telegram.ui.vy
                        @Override // org.telegram.ui.Components.c5
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.x;
                            if (i12 != i14 && i12 != (i13 = UserConfig.selectedAccount)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                UserConfig.selectedAccount = i12;
                                UserConfig.getInstance(0).saveConfig(false);
                                if (!ApplicationLoader.mainInterfacePaused) {
                                    ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i12, 1);
                        }
                    });
                    h.show();
                    h.setCanceledOnTouchOutside(false);
                    h.setOnDismissListener(new w5(this, 6));
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
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
            b2Var.setOnCancelListener(new wy(i10, 0, iArr));
            b2Var.show();
            iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new w8(this, iArr, i10, b2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
        }
    }

    public final void f() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i10 = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = (((AndroidUtilities.displaySize.y - layoutParams.height) - i10) / 2) + i10;
            this.d.getView().setLayoutParams(layoutParams);
            if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.n2) this.c.getFragmentStack().get(1)).onPause();
                this.c.getFragmentStack().remove(1);
                this.c.c0();
            }
        }
    }

    public final void g() {
        if (this.a) {
            return;
        }
        a6 a6Var = this.w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.w = null;
        }
        this.a = true;
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (l4.I() && l4.x().V) {
            l4.x().o(false, true);
        }
        this.b.l(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.b.setDelegate(new ut(this, 7));
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
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

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.b5 b5Var) {
        org.telegram.ui.ActionBar.n2 n2Var = b5Var.a;
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        if (!AndroidUtilities.isTablet()) {
            this.c.G();
        } else if (this.d.getView().getVisibility() == 0) {
            this.d.G();
        } else {
            this.c.G();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (AndroidUtilities.isTablet() && (actionBarLayout = this.c) != null) {
            actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new xy(this));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        int i10 = 2;
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.h6.S(this);
        org.telegram.ui.ActionBar.h6.J(this, false);
        this.c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f = y3Var;
        setContentView(y3Var, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.ui.ActionBar.d5 d5Var = null;
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            ig.p1 p1Var = new ig.p1(this, d5Var, i10);
            this.e = p1Var;
            p1Var.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.h6.s0());
            relativeLayout.addView(this.e, w7.z5.w(-1, -1));
            relativeLayout.addView(this.c.getView(), w7.z5.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.z5.w(-1, -1));
            frameLayout.setOnTouchListener(new e0(this, i10));
            frameLayout.setOnClickListener(new ah.f(19));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.d.getView(), w7.z5.w(530, AndroidUtilities.isSmallTablet() ? 528 : 700));
            this.d.setFragmentStack(y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, w7.z5.c(-1.0f, -1));
            ig.p1 p1Var2 = new ig.p1(this, d5Var, 3);
            this.e = p1Var2;
            p1Var2.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.h6.s0());
            relativeLayout2.addView(this.e, w7.z5.w(-1, -1));
            relativeLayout2.addView(this.c.getView(), w7.z5.w(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(x);
        this.c.setDelegate(this);
        org.telegram.ui.Components.le0 le0Var = new org.telegram.ui.Components.le0(this);
        this.b = le0Var;
        this.f.addView(le0Var, w7.z5.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.c.X();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.X();
        }
        d(getIntent(), false, bundle != null, false, UserConfig.selectedAccount, 0);
        f();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.c.J();
        if (AndroidUtilities.isTablet()) {
            this.d.J();
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, UserConfig.selectedAccount, 0);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        a6 a6Var = this.w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.w = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            a6 a6Var2 = new a6(this, 3);
            this.w = a6Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(a6Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(a6Var2, (i10 * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.le0 le0Var = this.b;
        if (le0Var != null) {
            le0Var.j();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        a6 a6Var = this.w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.b.getVisibility() != 0) {
            this.c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.b.k();
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final /* synthetic */ void a(float f7) {
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final /* synthetic */ void e(int[] iArr) {
    }
}

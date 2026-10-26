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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.f5 {
    public static final ArrayList x = new ArrayList();
    public static final ArrayList y = new ArrayList();
    public boolean a;
    public org.telegram.ui.Components.le0 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.vw0 e;
    public org.telegram.ui.ActionBar.d4 f;
    public Intent h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public y5 w;

    @Override // org.telegram.ui.ActionBar.f5
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.c.W(z10, z10);
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
                this.c.e0();
                if (AndroidUtilities.isTablet()) {
                    this.d.e0();
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
                    gg0 gg0Var = new gg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, gg0Var);
                    } else {
                        this.c.c(-1, gg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.c.e0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.e2 i12 = org.telegram.ui.Components.g5.i(this, new org.telegram.ui.Components.c5() { // from class: org.telegram.ui.vy
                        @Override // org.telegram.ui.Components.c5
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.x;
                            if (i13 != i15 && i13 != (i14 = UserConfig.selectedAccount)) {
                                ConnectionsManager.getInstance(i14).setAppPaused(true, false);
                                UserConfig.selectedAccount = i13;
                                UserConfig.getInstance(0).saveConfig(false);
                                if (!ApplicationLoader.mainInterfacePaused) {
                                    ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i13, 1);
                        }
                    });
                    i12.show();
                    i12.setCanceledOnTouchOutside(false);
                    i12.setOnDismissListener(new u5(this, 6));
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
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(this, 3, null);
            e2Var.setOnCancelListener(new wy(i10, 0, iArr));
            e2Var.show();
            iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new y8(this, iArr, i10, e2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
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
                ((org.telegram.ui.ActionBar.r2) this.c.getFragmentStack().get(1)).onPause();
                this.c.getFragmentStack().remove(1);
                this.c.e0();
            }
        }
    }

    public final void g() {
        if (this.a) {
            return;
        }
        y5 y5Var = this.w;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            this.w = null;
        }
        this.a = true;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean h(org.telegram.ui.ActionBar.r2 r2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(false, true);
        } else if (j4.I() && j4.x().V) {
            j4.x().o(false, true);
        }
        this.b.m(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.b.setDelegate(new qt(this, 9));
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f5
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

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.g5 g5Var) {
        org.telegram.ui.ActionBar.r2 r2Var = g5Var.a;
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(true, false);
            return;
        }
        if (!AndroidUtilities.isTablet()) {
            this.c.H();
        } else if (this.d.getView().getVisibility() == 0) {
            this.d.H();
        } else {
            this.c.H();
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
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.y6(1));
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
        org.telegram.ui.ActionBar.y6.S(this);
        org.telegram.ui.ActionBar.y6.J(this, false);
        this.c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this);
        this.f = d4Var;
        setContentView(d4Var, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.ui.ActionBar.j5 j5Var = null;
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            int i10 = 2;
            jg.r1 r1Var = new jg.r1(this, j5Var, i10);
            this.e = r1Var;
            r1Var.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.y6.s0());
            relativeLayout.addView(this.e, org.telegram.ui.Components.gb1.A(-1, -1));
            relativeLayout.addView(this.c.getView(), org.telegram.ui.Components.gb1.A(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, org.telegram.ui.Components.gb1.A(-1, -1));
            frameLayout.setOnTouchListener(new d0(this, i10));
            frameLayout.setOnClickListener(new bh.f(19));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.d.getView(), org.telegram.ui.Components.gb1.A(530, AndroidUtilities.isSmallTablet() ? 528 : 700));
            this.d.setFragmentStack(y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            jg.r1 r1Var2 = new jg.r1(this, j5Var, 3);
            this.e = r1Var2;
            r1Var2.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.y6.s0());
            relativeLayout2.addView(this.e, org.telegram.ui.Components.gb1.A(-1, -1));
            relativeLayout2.addView(this.c.getView(), org.telegram.ui.Components.gb1.A(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(x);
        this.c.setDelegate(this);
        org.telegram.ui.Components.le0 le0Var = new org.telegram.ui.Components.le0(this);
        this.b = le0Var;
        this.f.addView(le0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.c.Z();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.Z();
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
        this.c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
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
        this.c.N();
        if (AndroidUtilities.isTablet()) {
            this.d.N();
        }
        ApplicationLoader.externalInterfacePaused = true;
        y5 y5Var = this.w;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            this.w = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            y5 y5Var2 = new y5(this, 3);
            this.w = y5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(y5Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(y5Var2, (i10 * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.le0 le0Var = this.b;
        if (le0Var != null) {
            le0Var.k();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.c.O();
        if (AndroidUtilities.isTablet()) {
            this.d.O();
        }
        ApplicationLoader.externalInterfacePaused = false;
        y5 y5Var = this.w;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
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
            this.c.O();
            if (AndroidUtilities.isTablet()) {
                this.d.O();
                return;
            }
            return;
        }
        this.c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.b.l();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final /* synthetic */ void a(float f7) {
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final /* synthetic */ void e(int[] iArr) {
    }
}

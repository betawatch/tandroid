package org.telegram.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class BubbleActivity extends g5 implements org.telegram.ui.ActionBar.y4 {
    public static BubbleActivity W;
    public boolean L;
    public final ArrayList M = new ArrayList();
    public org.telegram.ui.Components.yc0 N;
    public ActionBarLayout O;
    public org.telegram.ui.ActionBar.x3 P;
    public Intent Q;
    public boolean R;
    public int S;
    public boolean T;
    public v5 U;
    public long V;

    @Override // org.telegram.ui.ActionBar.y4
    public final /* synthetic */ boolean h(org.telegram.ui.ActionBar.o2 o2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.y4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.y4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.L) {
            v5 v5Var = this.U;
            if (v5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                this.U = null;
            }
            this.L = true;
            W = null;
        }
        finish();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.y4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.z4 z4Var) {
        org.telegram.ui.ActionBar.o2 o2Var = z4Var.a;
        return true;
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        org.telegram.ui.Components.u71 u71Var;
        super.onActivityResult(i9, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null && (u71Var = themeEditorView.k) != null) {
            u71Var.a(i9, i10, intent);
        }
        if (this.O.getFragmentStack().isEmpty()) {
            return;
        }
        ((org.telegram.ui.ActionBar.o2) this.O.getFragmentStack().get(this.O.getFragmentStack().size() - 1)).onActivityResultFragment(i9, i10, intent);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (this.M.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.N.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().F0(true, false);
        } else {
            this.O.G();
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, e0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.f6.R(this);
        org.telegram.ui.ActionBar.f6.J(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.O = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.O.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.P = x3Var;
        setContentView(x3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.P.addView(relativeLayout, g7.e6.c(-1.0f, -1));
        relativeLayout.addView(this.O.getView(), g7.e6.w(-1, -1));
        this.P.setParentActionBarLayout(this.O);
        this.O.setDrawerLayoutContainer(this.P);
        this.O.setFragmentStack(this.M);
        this.O.setDelegate(this);
        org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(this);
        this.N = yc0Var;
        this.P.addView(yc0Var, g7.e6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.O.X();
        y(getIntent(), false, bundle != null, false, UserConfig.selectedAccount);
        W = this;
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i9 = this.K;
        if (i9 != -1) {
            AccountInstance.getInstance(i9).getNotificationsController().setOpenedInBubble(this.V, false);
            AccountInstance.getInstance(this.K).getConnectionsManager().setAppPaused(false, false);
        }
        if (!this.L) {
            v5 v5Var = this.U;
            if (v5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                this.U = null;
            }
            this.L = true;
            W = null;
        }
        W = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.O.J();
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y(intent, true, false, false, UserConfig.selectedAccount);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.O.L();
        ApplicationLoader.externalInterfacePaused = true;
        v5 v5Var = this.U;
        if (v5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.U = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            v5 v5Var2 = new v5(this, 0);
            this.U = v5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(v5Var2, 1000L);
            } else {
                int i9 = SharedConfig.autoLockIn;
                if (i9 != 0) {
                    AndroidUtilities.runOnUIThread(v5Var2, (i9 * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.yc0 yc0Var = this.N;
        if (yc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yc0Var.N);
        }
        W = null;
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (u(i9, strArr, iArr)) {
            if (!this.O.getFragmentStack().isEmpty()) {
                ((org.telegram.ui.ActionBar.o2) this.O.getFragmentStack().get(this.O.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i9, strArr, iArr);
            }
            mh1.q(i9, iArr);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.O.M();
        ApplicationLoader.externalInterfacePaused = false;
        v5 v5Var = this.U;
        if (v5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.U = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            z();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.N.getVisibility() != 0) {
            this.O.M();
        } else {
            this.O.n();
            this.N.i();
        }
        W = this;
    }

    public final void y(Intent intent, boolean z10, boolean z11, boolean z12, int i9) {
        qn qnVar;
        if (!z12 && (AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            z();
            this.Q = intent;
            this.R = z10;
            this.T = z11;
            this.S = i9;
            UserConfig.getInstance(i9).saveConfig(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.K = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            qnVar = null;
        } else {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.V = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.V = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            qnVar = new qn(bundle);
            qnVar.setInBubbleMode(true);
            qnVar.setCurrentAccount(this.K);
        }
        if (qnVar == null) {
            finish();
            return;
        }
        NotificationCenter.getInstance(this.K).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(this.V));
        this.O.X();
        this.O.c(-1, qnVar);
        AccountInstance.getInstance(this.K).getNotificationsController().setOpenedInBubble(this.V, true);
        AccountInstance.getInstance(this.K).getConnectionsManager().setAppPaused(false, false);
        this.O.c0();
    }

    public final void z() {
        if (this.N == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().F0(false, true);
        } else if (l4.I() && l4.x().R) {
            l4.x().o(false, true);
        }
        this.N.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.N.setDelegate(new b1(this, 6));
    }

    @Override // org.telegram.ui.ActionBar.y4
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.ActionBar.y4
    public final /* synthetic */ void e(int[] iArr) {
    }

    @Override // org.telegram.ui.ActionBar.y4
    public final /* synthetic */ void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}

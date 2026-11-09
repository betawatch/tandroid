package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements org.telegram.ui.Components.dc0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ g80(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str = LaunchActivity.B1;
        org.telegram.messenger.qp.s1(this.a.O).A3(2);
    }

    @Override // org.telegram.ui.Components.dc0
    public void p(org.telegram.ui.Components.fc0 fc0Var) {
        String str = LaunchActivity.B1;
        org.telegram.messenger.iz.C = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.J0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.K0, launchActivity.L0, true, null, false, true);
            launchActivity.J0 = null;
        }
        launchActivity.o0.getView().setVisibility(0);
        launchActivity.o0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.o0;
        org.telegram.ui.ActionBar.f2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.p0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.p0.getView().getVisibility() == 4) {
                    launchActivity.p0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.q0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.q0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o0, fc0Var);
        try {
            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

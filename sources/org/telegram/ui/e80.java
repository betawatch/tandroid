package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements org.telegram.ui.Components.dc0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ e80(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.np.s1(this.a.P).A3(2);
    }

    @Override // org.telegram.ui.Components.dc0
    public void q(org.telegram.ui.Components.fc0 fc0Var) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.gz.C = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.p0.getView().setVisibility(0);
        launchActivity.p0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.p0;
        org.telegram.ui.ActionBar.e2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.q0.getView().getVisibility() == 4) {
                    launchActivity.q0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.r0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.r0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.o0, fc0Var);
        try {
            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

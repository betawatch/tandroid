package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements org.telegram.ui.Components.xb0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ a80(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String str = LaunchActivity.E1;
        org.telegram.messenger.hp.s1(this.a.P).A3(2);
    }

    @Override // org.telegram.ui.Components.xb0
    public void q(org.telegram.ui.Components.zb0 zb0Var) {
        String str = LaunchActivity.E1;
        org.telegram.messenger.az.C = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.M0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.N0, launchActivity.O0, true, null, false, true);
            launchActivity.M0 = null;
        }
        launchActivity.r0.getView().setVisibility(0);
        launchActivity.r0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.r0;
        org.telegram.ui.ActionBar.d2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.s0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.s0.getView().getVisibility() == 4) {
                    launchActivity.s0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.t0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.t0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.o0, zb0Var);
        try {
            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

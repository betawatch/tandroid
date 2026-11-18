package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h80 implements org.telegram.ui.Components.nc0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ h80(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.mp.u1(this.a.P).H3(2);
    }

    @Override // org.telegram.ui.Components.nc0
    public void p(org.telegram.ui.Components.pc0 pc0Var) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.bz.C = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.p0.getView().setVisibility(0);
        launchActivity.p0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.p0;
        org.telegram.ui.ActionBar.h2 lastFragment = actionBarLayout.getLastFragment();
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
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.o0, pc0Var);
        try {
            org.telegram.messenger.xs.t(org.telegram.messenger.j10.t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

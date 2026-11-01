package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ e90(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        Pattern pattern = LaunchActivity.D1;
        org.telegram.messenger.wp.r1(this.a.O).x3(2);
    }

    @Override // org.telegram.ui.Components.xc0
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        Pattern pattern = LaunchActivity.D1;
        org.telegram.messenger.uz.C = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.q0.getView().setVisibility(0);
        launchActivity.q0.W(true, true);
        ActionBarLayout actionBarLayout = launchActivity.q0;
        org.telegram.ui.ActionBar.k2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.W(true, true);
                if (launchActivity.r0.getView().getVisibility() == 4) {
                    launchActivity.r0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.s0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.W(true, true);
                launchActivity.s0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.o0, zc0Var);
        try {
            org.telegram.messenger.pt.t(org.telegram.messenger.e20.s0).Y();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}

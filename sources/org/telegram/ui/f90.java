package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f90 implements org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ f90(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        Pattern pattern = LaunchActivity.D1;
        org.telegram.messenger.vp.r1(this.a.O).x3(2);
    }

    @Override // org.telegram.ui.Components.xc0
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        Pattern pattern = LaunchActivity.D1;
        org.telegram.messenger.tz.C = false;
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
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.o0, zc0Var);
        try {
            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).Y();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}

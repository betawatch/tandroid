package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class cb0 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public boolean c = false;
    public boolean d = false;

    public cb0(LaunchActivity launchActivity) {
        this.f = launchActivity;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.c = false;
        this.d = false;
        if (this.b) {
            this.a.unlock();
            this.b = false;
        }
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.c1) {
            return;
        }
        actionBarLayout.c1 = false;
        actionBarLayout.e(true);
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.d = true;
        if (this.b) {
            this.a.unlock();
            this.b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f.onBackPressed();
            return;
        }
        if (this.f.c0(true)) {
            LaunchActivity launchActivity = this.f;
            ActionBarLayout actionBarLayout = launchActivity.q0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.c1) {
                actionBarLayout.G();
            } else {
                actionBarLayout.c1 = false;
                actionBarLayout.e(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1.T != false) goto L68;
     */
    @Override // android.window.OnBackAnimationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        org.telegram.ui.ActionBar.r rVar;
        if (this.c && this.d) {
            return;
        }
        float progress = backEvent.getProgress();
        if (!this.e && progress > 0.015f) {
            this.e = true;
            if (!AndroidUtilities.isTablet() && this.f.c0(false) && (actionBarLayout2 = this.f.q0) != null) {
                float touchX = backEvent.getTouchX();
                float touchY = backEvent.getTouchY();
                Activity activity = actionBarLayout2.K0;
                if (actionBarLayout2.T) {
                    AnimatorSet animatorSet = actionBarLayout2.h1;
                    if (animatorSet != null) {
                        animatorSet.end();
                        actionBarLayout2.h1 = null;
                    }
                }
                if (!actionBarLayout2.d1 && !actionBarLayout2.c1 && !actionBarLayout2.a0 && !actionBarLayout2.Q && !actionBarLayout2.j() && actionBarLayout2.O0.size() > 1 && !actionBarLayout2.y() && ((rVar = actionBarLayout2.G) == null || !rVar.hasShownSheet())) {
                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout2.O0);
                    if (m2Var.onBackPressed(false) && !m2Var.hasShownSheet() && m2Var.canBeginSlide()) {
                        actionBarLayout2.e1 = false;
                        actionBarLayout2.d1 = true;
                        actionBarLayout2.c1 = true;
                        actionBarLayout2.g1 = touchX < ((float) AndroidUtilities.displaySize.x) / 2.0f;
                        actionBarLayout2.f1 = touchY;
                        actionBarLayout2.O();
                        if (activity != null && activity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                        }
                        m2Var.onBeginSlide();
                        if (!this.b) {
                            this.a.lock();
                            this.b = true;
                        }
                    }
                }
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.q0) == null || !actionBarLayout.c1) {
            return;
        }
        float interpolation = org.telegram.ui.Components.rr.l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
        actionBarLayout.e1 = max > 0.0f;
        actionBarLayout.s.setTranslationX(interpolation);
        actionBarLayout.setInnerTranslationX(interpolation);
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        this.c = true;
        this.d = false;
        this.e = false;
    }
}

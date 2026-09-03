package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ab0 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public boolean c = false;
    public boolean d = false;

    public ab0(LaunchActivity launchActivity) {
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
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.n0) == null || !actionBarLayout.Z0) {
            return;
        }
        actionBarLayout.Z0 = false;
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
            ActionBarLayout actionBarLayout = launchActivity.n0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.Z0) {
                actionBarLayout.G();
            } else {
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1.Q != false) goto L68;
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
            if (!AndroidUtilities.isTablet() && this.f.c0(false) && (actionBarLayout2 = this.f.n0) != null) {
                float touchX = backEvent.getTouchX();
                float touchY = backEvent.getTouchY();
                Activity activity = actionBarLayout2.H0;
                if (actionBarLayout2.Q) {
                    AnimatorSet animatorSet = actionBarLayout2.e1;
                    if (animatorSet != null) {
                        animatorSet.end();
                        actionBarLayout2.e1 = null;
                    }
                }
                if (!actionBarLayout2.a1 && !actionBarLayout2.Z0 && !actionBarLayout2.U && !actionBarLayout2.N && !actionBarLayout2.j() && actionBarLayout2.L0.size() > 1 && !actionBarLayout2.y() && ((rVar = actionBarLayout2.D) == null || !rVar.hasShownSheet())) {
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) ai.j(1, actionBarLayout2.L0);
                    if (p2Var.onBackPressed(false) && !p2Var.hasShownSheet() && p2Var.canBeginSlide()) {
                        actionBarLayout2.b1 = false;
                        actionBarLayout2.a1 = true;
                        actionBarLayout2.Z0 = true;
                        actionBarLayout2.d1 = touchX < ((float) AndroidUtilities.displaySize.x) / 2.0f;
                        actionBarLayout2.c1 = touchY;
                        actionBarLayout2.O();
                        if (activity != null && activity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                        }
                        p2Var.onBeginSlide();
                        if (!this.b) {
                            this.a.lock();
                            this.b = true;
                        }
                    }
                }
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.n0) == null || !actionBarLayout.Z0) {
            return;
        }
        float interpolation = org.telegram.ui.Components.mr.l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
        actionBarLayout.b1 = max > 0.0f;
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

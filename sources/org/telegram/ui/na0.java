package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class na0 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public boolean c = false;
    public boolean d = false;

    public na0(LaunchActivity launchActivity) {
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
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.m0) == null || !actionBarLayout.Y0) {
            return;
        }
        actionBarLayout.Y0 = false;
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
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.Y0) {
                actionBarLayout.G();
            } else {
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1.P != false) goto L68;
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
            if (!AndroidUtilities.isTablet() && this.f.c0(false) && (actionBarLayout2 = this.f.m0) != null) {
                float touchX = backEvent.getTouchX();
                float touchY = backEvent.getTouchY();
                Activity activity = actionBarLayout2.G0;
                if (actionBarLayout2.P) {
                    AnimatorSet animatorSet = actionBarLayout2.d1;
                    if (animatorSet != null) {
                        animatorSet.end();
                        actionBarLayout2.d1 = null;
                    }
                }
                if (!actionBarLayout2.Z0 && !actionBarLayout2.Y0 && !actionBarLayout2.T && !actionBarLayout2.M && !actionBarLayout2.j() && actionBarLayout2.K0.size() > 1 && !actionBarLayout2.y() && ((rVar = actionBarLayout2.C) == null || !rVar.hasShownSheet())) {
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.k(1, actionBarLayout2.K0);
                    if (o2Var.onBackPressed(false) && !o2Var.hasShownSheet() && o2Var.canBeginSlide()) {
                        actionBarLayout2.a1 = false;
                        actionBarLayout2.Z0 = true;
                        actionBarLayout2.Y0 = true;
                        actionBarLayout2.c1 = touchX < ((float) AndroidUtilities.displaySize.x) / 2.0f;
                        actionBarLayout2.b1 = touchY;
                        actionBarLayout2.O();
                        if (activity != null && activity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                        }
                        o2Var.onBeginSlide();
                        if (!this.b) {
                            this.a.lock();
                            this.b = true;
                        }
                    }
                }
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f.m0) == null || !actionBarLayout.Y0) {
            return;
        }
        float interpolation = org.telegram.ui.Components.gr.l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
        actionBarLayout.a1 = max > 0.0f;
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

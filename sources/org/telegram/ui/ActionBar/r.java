package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ r(ActionBarLayout actionBarLayout, int i10) {
        this.a = i10;
        this.b = actionBarLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.F(false);
                break;
            default:
                Drawable drawable2 = ActionBarLayout.p1;
                actionBarLayout.F(false);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.v0 = System.currentTimeMillis();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

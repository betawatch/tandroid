// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ k6(ActionBarLayout actionBarLayout, byte b) {
        this.a = b;
        this.b = actionBarLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (b) {
            case 0:
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.F(false);
                break;
            default:
                Drawable drawable2 = ActionBarLayout.w1;
                actionBarLayout.F(false);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.C0 = System.currentTimeMillis();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ngc extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wgc d;

    public ngc(wgc wgcVar, View view, float f) {
        this.d = wgcVar;
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.d.F(this.b, this.c);
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    public /* synthetic */ e00(int i10) {
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.a) {
            case 1:
                jf.f fVar = th.w0.Z.L;
                if (fVar != null && (view = fVar.j) != null) {
                    fVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z10);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}

package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l c;

    public /* synthetic */ d(l lVar, boolean z10, int i10) {
        this.a = i10;
        this.c = lVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f9 = this.b ? 1.0f : 0.0f;
                l lVar = this.c;
                lVar.n1 = f9;
                lVar.b();
                break;
            default:
                float f10 = this.b ? 1.0f : 0.0f;
                l lVar2 = this.c;
                lVar2.n1 = f10;
                lVar2.b();
                break;
        }
    }
}

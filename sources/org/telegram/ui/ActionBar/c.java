package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l c;

    public /* synthetic */ c(l lVar, boolean z10, int i10) {
        this.a = i10;
        this.c = lVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                l lVar = this.c;
                lVar.D1 = f7;
                lVar.f();
                break;
            default:
                float f10 = this.b ? 1.0f : 0.0f;
                l lVar2 = this.c;
                lVar2.D1 = f10;
                lVar2.f();
                break;
        }
    }
}

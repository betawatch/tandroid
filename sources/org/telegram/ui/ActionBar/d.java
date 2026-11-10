package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l c;

    public /* synthetic */ d(l lVar, boolean z9, int i7) {
        this.a = i7;
        this.c = lVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                l lVar = this.c;
                lVar.D1 = f10;
                lVar.h();
                break;
            default:
                float f11 = this.b ? 1.0f : 0.0f;
                l lVar2 = this.c;
                lVar2.D1 = f11;
                lVar2.h();
                break;
        }
    }
}

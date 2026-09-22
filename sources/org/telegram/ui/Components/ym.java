package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ym extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ym(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.E.setTranslationY(0.0f);
                break;
            case 1:
                this.b.E.setTranslationY(0.0f);
                break;
            default:
                un unVar = this.b;
                unVar.f1 = false;
                unVar.E.setTranslationY(0.0f);
                unVar.a0();
                break;
        }
    }
}

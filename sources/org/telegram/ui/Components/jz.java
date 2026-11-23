package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz b;

    public /* synthetic */ jz(oz ozVar, int i7) {
        this.a = i7;
        this.b = ozVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                oz ozVar = this.b;
                if (ozVar.C0 == animator) {
                    ozVar.C0 = null;
                    break;
                }
                break;
            default:
                oz ozVar2 = this.b;
                ozVar2.V = ozVar2.d0;
                ozVar2.c0 = ozVar2.g0;
                ozVar2.W = ozVar2.e0;
                ozVar2.a0 = ozVar2.f0;
                ozVar2.d0 = -1;
                ozVar2.e0 = -1;
                ozVar2.f0 = -1;
                ozVar2.g0 = -1;
                break;
        }
    }
}

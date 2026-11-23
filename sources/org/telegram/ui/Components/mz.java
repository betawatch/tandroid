package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class mz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;

    public /* synthetic */ mz(rz rzVar, int i7) {
        this.a = i7;
        this.b = rzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                if (rzVar.C0 == animator) {
                    rzVar.C0 = null;
                    break;
                }
                break;
            default:
                rz rzVar2 = this.b;
                rzVar2.V = rzVar2.d0;
                rzVar2.c0 = rzVar2.g0;
                rzVar2.W = rzVar2.e0;
                rzVar2.a0 = rzVar2.f0;
                rzVar2.d0 = -1;
                rzVar2.e0 = -1;
                rzVar2.f0 = -1;
                rzVar2.g0 = -1;
                break;
        }
    }
}

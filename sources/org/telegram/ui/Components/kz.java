package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz b;

    public /* synthetic */ kz(pz pzVar, int i7) {
        this.a = i7;
        this.b = pzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pz pzVar = this.b;
                if (pzVar.C0 == animator) {
                    pzVar.C0 = null;
                    break;
                }
                break;
            default:
                pz pzVar2 = this.b;
                pzVar2.V = pzVar2.d0;
                pzVar2.c0 = pzVar2.g0;
                pzVar2.W = pzVar2.e0;
                pzVar2.a0 = pzVar2.f0;
                pzVar2.d0 = -1;
                pzVar2.e0 = -1;
                pzVar2.f0 = -1;
                pzVar2.g0 = -1;
                break;
        }
    }
}

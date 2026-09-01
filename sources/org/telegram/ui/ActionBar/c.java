package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k c;

    public /* synthetic */ c(k kVar, boolean z4, int i10) {
        this.a = i10;
        this.c = kVar;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                k kVar = this.c;
                kVar.o1 = f10;
                kVar.b();
                break;
            default:
                float f11 = this.b ? 1.0f : 0.0f;
                k kVar2 = this.c;
                kVar2.o1 = f11;
                kVar2.b();
                break;
        }
    }
}

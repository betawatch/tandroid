package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k c;

    public /* synthetic */ c(k kVar, boolean z10, int i10) {
        this.a = i10;
        this.c = kVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                k kVar = this.c;
                kVar.r1 = f7;
                kVar.b();
                break;
            default:
                float f10 = this.b ? 1.0f : 0.0f;
                k kVar2 = this.c;
                kVar2.r1 = f10;
                kVar2.b();
                break;
        }
    }
}

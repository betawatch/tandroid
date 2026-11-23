package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k c;

    public /* synthetic */ c(k kVar, boolean z10, int i7) {
        this.a = i7;
        this.c = kVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                k kVar = this.c;
                kVar.E1 = f10;
                kVar.i();
                break;
            default:
                float f11 = this.b ? 1.0f : 0.0f;
                k kVar2 = this.c;
                kVar2.E1 = f11;
                kVar2.i();
                break;
        }
    }
}

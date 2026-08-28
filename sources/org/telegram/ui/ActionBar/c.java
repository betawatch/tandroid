package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k c;

    public /* synthetic */ c(k kVar, boolean z10, int i9) {
        this.a = i9;
        this.c = kVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                k kVar = this.c;
                kVar.n1 = f10;
                kVar.b();
                break;
            default:
                float f11 = this.b ? 1.0f : 0.0f;
                k kVar2 = this.c;
                kVar2.n1 = f11;
                kVar2.b();
                break;
        }
    }
}

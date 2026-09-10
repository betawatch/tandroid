package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                lVar.r1 = f7;
                lVar.b();
                break;
            default:
                float f10 = this.b ? 1.0f : 0.0f;
                l lVar2 = this.c;
                lVar2.r1 = f10;
                lVar2.b();
                break;
        }
    }
}

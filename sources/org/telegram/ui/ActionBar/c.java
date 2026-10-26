package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                kVar.v1 = f7;
                kVar.b();
                break;
            default:
                float f10 = this.b ? 1.0f : 0.0f;
                k kVar2 = this.c;
                kVar2.v1 = f10;
                kVar2.b();
                break;
        }
    }
}

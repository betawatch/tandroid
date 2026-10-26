package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;

    public /* synthetic */ jn(go goVar, int i10) {
        this.a = i10;
        this.b = goVar;
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
                go goVar = this.b;
                goVar.f1 = false;
                goVar.E.setTranslationY(0.0f);
                goVar.d0();
                break;
        }
    }
}

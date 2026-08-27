package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;

    public /* synthetic */ mm(in inVar, int i10) {
        this.a = i10;
        this.b = inVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.A.setTranslationY(0.0f);
                break;
            case 1:
                this.b.A.setTranslationY(0.0f);
                break;
            default:
                in inVar = this.b;
                inVar.b1 = false;
                inVar.A.setTranslationY(0.0f);
                inVar.a0();
                break;
        }
    }
}

package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class w extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ w(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y yVar = this.b;
                yVar.F = false;
                yVar.invalidate();
                break;
            case 1:
                y yVar2 = this.b;
                x xVar = yVar2.c0;
                float f10 = yVar2.a0 ? 0.0f : 1.0f;
                yVar2.b0 = f10;
                xVar.setAlpha(f10);
                xVar.setVisibility(yVar2.a0 ? 8 : 0);
                yVar2.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                y yVar3 = this.b;
                yVar3.K0 = null;
                u uVar = yVar3.a;
                uVar.setRotationY(0.0f);
                if (!yVar3.L0) {
                    uVar.d.clearImage();
                    break;
                }
                break;
            case 3:
                this.b.F = false;
                break;
            default:
                this.b.F = false;
                break;
        }
    }
}

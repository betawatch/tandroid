package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ x(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                zVar.F = false;
                zVar.invalidate();
                break;
            case 1:
                z zVar2 = this.b;
                y yVar = zVar2.c0;
                float f10 = zVar2.a0 ? 0.0f : 1.0f;
                zVar2.b0 = f10;
                yVar.setAlpha(f10);
                yVar.setVisibility(zVar2.a0 ? 8 : 0);
                zVar2.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                z zVar3 = this.b;
                zVar3.K0 = null;
                v vVar = zVar3.a;
                vVar.setRotationY(0.0f);
                if (!zVar3.L0) {
                    vVar.d.clearImage();
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

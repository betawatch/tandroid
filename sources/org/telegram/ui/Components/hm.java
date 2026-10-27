package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.m0 = null;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                chatAttachAlertPhotoLayout.f1.unlock();
                chatAttachAlertPhotoLayout.d0 = false;
                pm pmVar = chatAttachAlertPhotoLayout.P;
                if (pmVar != null) {
                    pmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.c2.R();
                }
                pm pmVar2 = chatAttachAlertPhotoLayout.P;
                if (pmVar2 != null) {
                    pmVar2.setSystemUiVisibility(1028);
                }
                fm fmVar = chatAttachAlertPhotoLayout.E;
                if (fmVar != null) {
                    fmVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                kc1 kc1Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                fm fmVar2 = chatAttachAlertPhotoLayout2.E;
                if (fmVar2 != null) {
                    fmVar2.invalidate();
                }
                pm pmVar3 = chatAttachAlertPhotoLayout2.P;
                if (pmVar3 != null) {
                    pmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                bh.r rVar = chatAttachAlertPhotoLayout2.j0;
                if (rVar != null) {
                    rVar.setVisibility(8);
                }
                if (kc1Var != null) {
                    kc1Var.setVisibility(8);
                    kc1Var.setTag(null);
                }
                fm fmVar3 = chatAttachAlertPhotoLayout2.r;
                if (fmVar3 != null) {
                    fmVar3.setVisibility(8);
                }
                pm pmVar4 = chatAttachAlertPhotoLayout2.P;
                if (pmVar4 != null) {
                    pmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

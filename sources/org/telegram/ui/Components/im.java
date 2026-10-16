package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class im extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ im(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                qm qmVar = chatAttachAlertPhotoLayout.P;
                if (qmVar != null) {
                    qmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.c2.F();
                }
                qm qmVar2 = chatAttachAlertPhotoLayout.P;
                if (qmVar2 != null) {
                    qmVar2.setSystemUiVisibility(1028);
                }
                gm gmVar = chatAttachAlertPhotoLayout.E;
                if (gmVar != null) {
                    gmVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                fa1 fa1Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                gm gmVar2 = chatAttachAlertPhotoLayout2.E;
                if (gmVar2 != null) {
                    gmVar2.invalidate();
                }
                qm qmVar3 = chatAttachAlertPhotoLayout2.P;
                if (qmVar3 != null) {
                    qmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (fa1Var != null) {
                    fa1Var.setVisibility(8);
                    fa1Var.setTag(null);
                }
                gm gmVar3 = chatAttachAlertPhotoLayout2.r;
                if (gmVar3 != null) {
                    gmVar3.setVisibility(8);
                }
                qm qmVar4 = chatAttachAlertPhotoLayout2.P;
                if (qmVar4 != null) {
                    qmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

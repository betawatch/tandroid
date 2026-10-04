package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class yl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                gm gmVar = chatAttachAlertPhotoLayout.P;
                if (gmVar != null) {
                    gmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.Z1.K0();
                }
                gm gmVar2 = chatAttachAlertPhotoLayout.P;
                if (gmVar2 != null) {
                    gmVar2.setSystemUiVisibility(1028);
                }
                wl wlVar = chatAttachAlertPhotoLayout.E;
                if (wlVar != null) {
                    wlVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                ba1 ba1Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                wl wlVar2 = chatAttachAlertPhotoLayout2.E;
                if (wlVar2 != null) {
                    wlVar2.invalidate();
                }
                gm gmVar3 = chatAttachAlertPhotoLayout2.P;
                if (gmVar3 != null) {
                    gmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (ba1Var != null) {
                    ba1Var.setVisibility(8);
                    ba1Var.setTag(null);
                }
                wl wlVar3 = chatAttachAlertPhotoLayout2.r;
                if (wlVar3 != null) {
                    wlVar3.setVisibility(8);
                }
                gm gmVar4 = chatAttachAlertPhotoLayout2.P;
                if (gmVar4 != null) {
                    gmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

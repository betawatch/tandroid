package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class am extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                im imVar = chatAttachAlertPhotoLayout.P;
                if (imVar != null) {
                    imVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.Z1.K0();
                }
                im imVar2 = chatAttachAlertPhotoLayout.P;
                if (imVar2 != null) {
                    imVar2.setSystemUiVisibility(1028);
                }
                yl ylVar = chatAttachAlertPhotoLayout.E;
                if (ylVar != null) {
                    ylVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                q91 q91Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                yl ylVar2 = chatAttachAlertPhotoLayout2.E;
                if (ylVar2 != null) {
                    ylVar2.invalidate();
                }
                im imVar3 = chatAttachAlertPhotoLayout2.P;
                if (imVar3 != null) {
                    imVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                bi.ld ldVar = chatAttachAlertPhotoLayout2.j0;
                if (ldVar != null) {
                    ldVar.setVisibility(8);
                }
                if (q91Var != null) {
                    q91Var.setVisibility(8);
                    q91Var.setTag(null);
                }
                yl ylVar3 = chatAttachAlertPhotoLayout2.r;
                if (ylVar3 != null) {
                    ylVar3.setVisibility(8);
                }
                im imVar4 = chatAttachAlertPhotoLayout2.P;
                if (imVar4 != null) {
                    imVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

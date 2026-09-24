package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class wl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                em emVar = chatAttachAlertPhotoLayout.P;
                if (emVar != null) {
                    emVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.Z1.K0();
                }
                em emVar2 = chatAttachAlertPhotoLayout.P;
                if (emVar2 != null) {
                    emVar2.setSystemUiVisibility(1028);
                }
                ul ulVar = chatAttachAlertPhotoLayout.E;
                if (ulVar != null) {
                    ulVar.invalidate();
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
                ul ulVar2 = chatAttachAlertPhotoLayout2.E;
                if (ulVar2 != null) {
                    ulVar2.invalidate();
                }
                em emVar3 = chatAttachAlertPhotoLayout2.P;
                if (emVar3 != null) {
                    emVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (q91Var != null) {
                    q91Var.setVisibility(8);
                    q91Var.setTag(null);
                }
                ul ulVar3 = chatAttachAlertPhotoLayout2.r;
                if (ulVar3 != null) {
                    ulVar3.setVisibility(8);
                }
                em emVar4 = chatAttachAlertPhotoLayout2.P;
                if (emVar4 != null) {
                    emVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

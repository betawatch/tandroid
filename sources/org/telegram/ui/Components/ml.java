package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ml extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        this.a = i9;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.i0 = null;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                chatAttachAlertPhotoLayout.b1.unlock();
                chatAttachAlertPhotoLayout.W = false;
                ul ulVar = chatAttachAlertPhotoLayout.L;
                if (ulVar != null) {
                    ulVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.L.invalidate();
                }
                if (chatAttachAlertPhotoLayout.U) {
                    chatAttachAlertPhotoLayout.b.V1.u();
                }
                ul ulVar2 = chatAttachAlertPhotoLayout.L;
                if (ulVar2 != null) {
                    ulVar2.setSystemUiVisibility(1028);
                }
                kl klVar = chatAttachAlertPhotoLayout.A;
                if (klVar != null) {
                    klVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                i81 i81Var = chatAttachAlertPhotoLayout2.h0;
                chatAttachAlertPhotoLayout2.b1.unlock();
                chatAttachAlertPhotoLayout2.e1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.W = false;
                kl klVar2 = chatAttachAlertPhotoLayout2.A;
                if (klVar2 != null) {
                    klVar2.invalidate();
                }
                ul ulVar3 = chatAttachAlertPhotoLayout2.L;
                if (ulVar3 != null) {
                    ulVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.L.invalidate();
                }
                chatAttachAlertPhotoLayout2.U = false;
                fh.d2 d2Var = chatAttachAlertPhotoLayout2.f0;
                if (d2Var != null) {
                    d2Var.setVisibility(8);
                }
                if (i81Var != null) {
                    i81Var.setVisibility(8);
                    i81Var.setTag(null);
                }
                kl klVar3 = chatAttachAlertPhotoLayout2.r;
                if (klVar3 != null) {
                    klVar3.setVisibility(8);
                }
                ul ulVar4 = chatAttachAlertPhotoLayout2.L;
                if (ulVar4 != null) {
                    ulVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.L.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

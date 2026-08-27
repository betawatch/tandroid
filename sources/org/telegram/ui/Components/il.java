package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class il extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
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
                ql qlVar = chatAttachAlertPhotoLayout.L;
                if (qlVar != null) {
                    qlVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.L.invalidate();
                }
                if (chatAttachAlertPhotoLayout.U) {
                    chatAttachAlertPhotoLayout.b.V1.F();
                }
                ql qlVar2 = chatAttachAlertPhotoLayout.L;
                if (qlVar2 != null) {
                    qlVar2.setSystemUiVisibility(1028);
                }
                gl glVar = chatAttachAlertPhotoLayout.A;
                if (glVar != null) {
                    glVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                k81 k81Var = chatAttachAlertPhotoLayout2.h0;
                chatAttachAlertPhotoLayout2.b1.unlock();
                chatAttachAlertPhotoLayout2.e1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.W = false;
                gl glVar2 = chatAttachAlertPhotoLayout2.A;
                if (glVar2 != null) {
                    glVar2.invalidate();
                }
                ql qlVar3 = chatAttachAlertPhotoLayout2.L;
                if (qlVar3 != null) {
                    qlVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.L.invalidate();
                }
                chatAttachAlertPhotoLayout2.U = false;
                ag.p1 p1Var = chatAttachAlertPhotoLayout2.f0;
                if (p1Var != null) {
                    p1Var.setVisibility(8);
                }
                if (k81Var != null) {
                    k81Var.setVisibility(8);
                    k81Var.setTag(null);
                }
                gl glVar3 = chatAttachAlertPhotoLayout2.r;
                if (glVar3 != null) {
                    glVar3.setVisibility(8);
                }
                ql qlVar4 = chatAttachAlertPhotoLayout2.L;
                if (qlVar4 != null) {
                    qlVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.L.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

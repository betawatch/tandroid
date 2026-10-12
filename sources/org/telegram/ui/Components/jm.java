package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                rm rmVar = chatAttachAlertPhotoLayout.P;
                if (rmVar != null) {
                    rmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.c2.H();
                }
                rm rmVar2 = chatAttachAlertPhotoLayout.P;
                if (rmVar2 != null) {
                    rmVar2.setSystemUiVisibility(1028);
                }
                hm hmVar = chatAttachAlertPhotoLayout.E;
                if (hmVar != null) {
                    hmVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                ea1 ea1Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                hm hmVar2 = chatAttachAlertPhotoLayout2.E;
                if (hmVar2 != null) {
                    hmVar2.invalidate();
                }
                rm rmVar3 = chatAttachAlertPhotoLayout2.P;
                if (rmVar3 != null) {
                    rmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (ea1Var != null) {
                    ea1Var.setVisibility(8);
                    ea1Var.setTag(null);
                }
                hm hmVar3 = chatAttachAlertPhotoLayout2.r;
                if (hmVar3 != null) {
                    hmVar3.setVisibility(8);
                }
                rm rmVar4 = chatAttachAlertPhotoLayout2.P;
                if (rmVar4 != null) {
                    rmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

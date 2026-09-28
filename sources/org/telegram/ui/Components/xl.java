package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class xl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                fm fmVar = chatAttachAlertPhotoLayout.P;
                if (fmVar != null) {
                    fmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.Z1.K0();
                }
                fm fmVar2 = chatAttachAlertPhotoLayout.P;
                if (fmVar2 != null) {
                    fmVar2.setSystemUiVisibility(1028);
                }
                vl vlVar = chatAttachAlertPhotoLayout.E;
                if (vlVar != null) {
                    vlVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                s91 s91Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                vl vlVar2 = chatAttachAlertPhotoLayout2.E;
                if (vlVar2 != null) {
                    vlVar2.invalidate();
                }
                fm fmVar3 = chatAttachAlertPhotoLayout2.P;
                if (fmVar3 != null) {
                    fmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (s91Var != null) {
                    s91Var.setVisibility(8);
                    s91Var.setTag(null);
                }
                vl vlVar3 = chatAttachAlertPhotoLayout2.r;
                if (vlVar3 != null) {
                    vlVar3.setVisibility(8);
                }
                fm fmVar4 = chatAttachAlertPhotoLayout2.P;
                if (fmVar4 != null) {
                    fmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                dm dmVar = chatAttachAlertPhotoLayout.P;
                if (dmVar != null) {
                    dmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.Z1.L0();
                }
                dm dmVar2 = chatAttachAlertPhotoLayout.P;
                if (dmVar2 != null) {
                    dmVar2.setSystemUiVisibility(1028);
                }
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar != null) {
                    tlVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                t91 t91Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                tl tlVar2 = chatAttachAlertPhotoLayout2.E;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                dm dmVar3 = chatAttachAlertPhotoLayout2.P;
                if (dmVar3 != null) {
                    dmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (t91Var != null) {
                    t91Var.setVisibility(8);
                    t91Var.setTag(null);
                }
                tl tlVar3 = chatAttachAlertPhotoLayout2.r;
                if (tlVar3 != null) {
                    tlVar3.setVisibility(8);
                }
                dm dmVar4 = chatAttachAlertPhotoLayout2.P;
                if (dmVar4 != null) {
                    dmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

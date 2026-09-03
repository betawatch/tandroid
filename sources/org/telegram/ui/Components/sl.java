package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.j0 = null;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                chatAttachAlertPhotoLayout.c1.unlock();
                chatAttachAlertPhotoLayout.a0 = false;
                bm bmVar = chatAttachAlertPhotoLayout.M;
                if (bmVar != null) {
                    bmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.M.invalidate();
                }
                if (chatAttachAlertPhotoLayout.V) {
                    chatAttachAlertPhotoLayout.b.W1.Q0();
                }
                bm bmVar2 = chatAttachAlertPhotoLayout.M;
                if (bmVar2 != null) {
                    bmVar2.setSystemUiVisibility(1028);
                }
                ql qlVar = chatAttachAlertPhotoLayout.B;
                if (qlVar != null) {
                    qlVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                h91 h91Var = chatAttachAlertPhotoLayout2.i0;
                chatAttachAlertPhotoLayout2.c1.unlock();
                chatAttachAlertPhotoLayout2.f1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.a0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout2.B;
                if (qlVar2 != null) {
                    qlVar2.invalidate();
                }
                bm bmVar3 = chatAttachAlertPhotoLayout2.M;
                if (bmVar3 != null) {
                    bmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.M.invalidate();
                }
                chatAttachAlertPhotoLayout2.V = false;
                eg.s2 s2Var = chatAttachAlertPhotoLayout2.g0;
                if (s2Var != null) {
                    s2Var.setVisibility(8);
                }
                if (h91Var != null) {
                    h91Var.setVisibility(8);
                    h91Var.setTag(null);
                }
                ql qlVar3 = chatAttachAlertPhotoLayout2.r;
                if (qlVar3 != null) {
                    qlVar3.setVisibility(8);
                }
                bm bmVar4 = chatAttachAlertPhotoLayout2.M;
                if (bmVar4 != null) {
                    bmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.M.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

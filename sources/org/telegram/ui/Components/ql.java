package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ql extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                zl zlVar = chatAttachAlertPhotoLayout.M;
                if (zlVar != null) {
                    zlVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.M.invalidate();
                }
                if (chatAttachAlertPhotoLayout.V) {
                    chatAttachAlertPhotoLayout.b.W1.Q0();
                }
                zl zlVar2 = chatAttachAlertPhotoLayout.M;
                if (zlVar2 != null) {
                    zlVar2.setSystemUiVisibility(1028);
                }
                ol olVar = chatAttachAlertPhotoLayout.B;
                if (olVar != null) {
                    olVar.invalidate();
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
                ol olVar2 = chatAttachAlertPhotoLayout2.B;
                if (olVar2 != null) {
                    olVar2.invalidate();
                }
                zl zlVar3 = chatAttachAlertPhotoLayout2.M;
                if (zlVar3 != null) {
                    zlVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.M.invalidate();
                }
                chatAttachAlertPhotoLayout2.V = false;
                dg.u2 u2Var = chatAttachAlertPhotoLayout2.g0;
                if (u2Var != null) {
                    u2Var.setVisibility(8);
                }
                if (h91Var != null) {
                    h91Var.setVisibility(8);
                    h91Var.setTag(null);
                }
                ol olVar3 = chatAttachAlertPhotoLayout2.r;
                if (olVar3 != null) {
                    olVar3.setVisibility(8);
                }
                zl zlVar4 = chatAttachAlertPhotoLayout2.M;
                if (zlVar4 != null) {
                    zlVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.M.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

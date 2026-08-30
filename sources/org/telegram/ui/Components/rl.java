package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                am amVar = chatAttachAlertPhotoLayout.M;
                if (amVar != null) {
                    amVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.M.invalidate();
                }
                if (chatAttachAlertPhotoLayout.V) {
                    chatAttachAlertPhotoLayout.b.W1.C();
                }
                am amVar2 = chatAttachAlertPhotoLayout.M;
                if (amVar2 != null) {
                    amVar2.setSystemUiVisibility(1028);
                }
                pl plVar = chatAttachAlertPhotoLayout.B;
                if (plVar != null) {
                    plVar.invalidate();
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
                pl plVar2 = chatAttachAlertPhotoLayout2.B;
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
                am amVar3 = chatAttachAlertPhotoLayout2.M;
                if (amVar3 != null) {
                    amVar3.invalidateOutline();
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
                pl plVar3 = chatAttachAlertPhotoLayout2.r;
                if (plVar3 != null) {
                    plVar3.setVisibility(8);
                }
                am amVar4 = chatAttachAlertPhotoLayout2.M;
                if (amVar4 != null) {
                    amVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.M.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

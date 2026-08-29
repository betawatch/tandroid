package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                this.b.i0 = null;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                chatAttachAlertPhotoLayout.b1.unlock();
                chatAttachAlertPhotoLayout.W = false;
                yl ylVar = chatAttachAlertPhotoLayout.L;
                if (ylVar != null) {
                    ylVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.L.invalidate();
                }
                if (chatAttachAlertPhotoLayout.U) {
                    chatAttachAlertPhotoLayout.b.V1.L0();
                }
                yl ylVar2 = chatAttachAlertPhotoLayout.L;
                if (ylVar2 != null) {
                    ylVar2.setSystemUiVisibility(1028);
                }
                ol olVar = chatAttachAlertPhotoLayout.A;
                if (olVar != null) {
                    olVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                u81 u81Var = chatAttachAlertPhotoLayout2.h0;
                chatAttachAlertPhotoLayout2.b1.unlock();
                chatAttachAlertPhotoLayout2.e1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.W = false;
                ol olVar2 = chatAttachAlertPhotoLayout2.A;
                if (olVar2 != null) {
                    olVar2.invalidate();
                }
                yl ylVar3 = chatAttachAlertPhotoLayout2.L;
                if (ylVar3 != null) {
                    ylVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.L.invalidate();
                }
                chatAttachAlertPhotoLayout2.U = false;
                bg.x2 x2Var = chatAttachAlertPhotoLayout2.f0;
                if (x2Var != null) {
                    x2Var.setVisibility(8);
                }
                if (u81Var != null) {
                    u81Var.setVisibility(8);
                    u81Var.setTag(null);
                }
                ol olVar3 = chatAttachAlertPhotoLayout2.r;
                if (olVar3 != null) {
                    olVar3.setVisibility(8);
                }
                yl ylVar4 = chatAttachAlertPhotoLayout2.L;
                if (ylVar4 != null) {
                    ylVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.L.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

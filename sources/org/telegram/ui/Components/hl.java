package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        this.a = i3;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i3) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                pl plVar = chatAttachAlertPhotoLayout.Q;
                imageView.setImageResource((plVar == null || !plVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout.Q;
                if (plVar2 != null) {
                    plVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.U3.v0();
                }
                pl plVar3 = chatAttachAlertPhotoLayout.Q;
                if (plVar3 != null) {
                    plVar3.setSystemUiVisibility(1028);
                }
                il ilVar = chatAttachAlertPhotoLayout.F;
                if (ilVar != null) {
                    ilVar.invalidate();
                    break;
                }
                break;
            default:
                j71 j71Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                il ilVar2 = chatAttachAlertPhotoLayout.F;
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
                pl plVar4 = chatAttachAlertPhotoLayout.Q;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                ai.o2 o2Var = chatAttachAlertPhotoLayout.k0;
                if (o2Var != null) {
                    o2Var.setVisibility(8);
                }
                if (j71Var != null) {
                    j71Var.setVisibility(8);
                    j71Var.setTag(null);
                }
                il ilVar3 = chatAttachAlertPhotoLayout.r;
                if (ilVar3 != null) {
                    ilVar3.setVisibility(8);
                }
                pl plVar5 = chatAttachAlertPhotoLayout.Q;
                if (plVar5 != null) {
                    plVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

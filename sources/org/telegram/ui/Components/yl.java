package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i7) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                gm gmVar = chatAttachAlertPhotoLayout.Q;
                imageView.setImageResource((gmVar == null || !gmVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                gm gmVar2 = chatAttachAlertPhotoLayout.Q;
                if (gmVar2 != null) {
                    gmVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.X3.K0();
                }
                gm gmVar3 = chatAttachAlertPhotoLayout.Q;
                if (gmVar3 != null) {
                    gmVar3.setSystemUiVisibility(1028);
                }
                zl zlVar = chatAttachAlertPhotoLayout.F;
                if (zlVar != null) {
                    zlVar.invalidate();
                    break;
                }
                break;
            default:
                f81 f81Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                zl zlVar2 = chatAttachAlertPhotoLayout.F;
                if (zlVar2 != null) {
                    zlVar2.invalidate();
                }
                gm gmVar4 = chatAttachAlertPhotoLayout.Q;
                if (gmVar4 != null) {
                    gmVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                bi.e3 e3Var = chatAttachAlertPhotoLayout.k0;
                if (e3Var != null) {
                    e3Var.setVisibility(8);
                }
                if (f81Var != null) {
                    f81Var.setVisibility(8);
                    f81Var.setTag(null);
                }
                zl zlVar3 = chatAttachAlertPhotoLayout.r;
                if (zlVar3 != null) {
                    zlVar3.setVisibility(8);
                }
                gm gmVar5 = chatAttachAlertPhotoLayout.Q;
                if (gmVar5 != null) {
                    gmVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

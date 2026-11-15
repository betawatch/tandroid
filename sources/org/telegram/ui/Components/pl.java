package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
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
                xl xlVar = chatAttachAlertPhotoLayout.Q;
                imageView.setImageResource((xlVar == null || !xlVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                xl xlVar2 = chatAttachAlertPhotoLayout.Q;
                if (xlVar2 != null) {
                    xlVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.X3.K0();
                }
                xl xlVar3 = chatAttachAlertPhotoLayout.Q;
                if (xlVar3 != null) {
                    xlVar3.setSystemUiVisibility(1028);
                }
                ql qlVar = chatAttachAlertPhotoLayout.F;
                if (qlVar != null) {
                    qlVar.invalidate();
                    break;
                }
                break;
            default:
                s71 s71Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout.F;
                if (qlVar2 != null) {
                    qlVar2.invalidate();
                }
                xl xlVar4 = chatAttachAlertPhotoLayout.Q;
                if (xlVar4 != null) {
                    xlVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                bi.g2 g2Var = chatAttachAlertPhotoLayout.k0;
                if (g2Var != null) {
                    g2Var.setVisibility(8);
                }
                if (s71Var != null) {
                    s71Var.setVisibility(8);
                    s71Var.setTag(null);
                }
                ql qlVar3 = chatAttachAlertPhotoLayout.r;
                if (qlVar3 != null) {
                    qlVar3.setVisibility(8);
                }
                xl xlVar5 = chatAttachAlertPhotoLayout.Q;
                if (xlVar5 != null) {
                    xlVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

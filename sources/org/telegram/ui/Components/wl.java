package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
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
                em emVar = chatAttachAlertPhotoLayout.Q;
                imageView.setImageResource((emVar == null || !emVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                em emVar2 = chatAttachAlertPhotoLayout.Q;
                if (emVar2 != null) {
                    emVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.X3.B0();
                }
                em emVar3 = chatAttachAlertPhotoLayout.Q;
                if (emVar3 != null) {
                    emVar3.setSystemUiVisibility(1028);
                }
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (xlVar != null) {
                    xlVar.invalidate();
                    break;
                }
                break;
            default:
                g81 g81Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                xl xlVar2 = chatAttachAlertPhotoLayout.F;
                if (xlVar2 != null) {
                    xlVar2.invalidate();
                }
                em emVar4 = chatAttachAlertPhotoLayout.Q;
                if (emVar4 != null) {
                    emVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                bi.g3 g3Var = chatAttachAlertPhotoLayout.k0;
                if (g3Var != null) {
                    g3Var.setVisibility(8);
                }
                if (g81Var != null) {
                    g81Var.setVisibility(8);
                    g81Var.setTag(null);
                }
                xl xlVar3 = chatAttachAlertPhotoLayout.r;
                if (xlVar3 != null) {
                    xlVar3.setVisibility(8);
                }
                em emVar5 = chatAttachAlertPhotoLayout.Q;
                if (emVar5 != null) {
                    emVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                    chatAttachAlertPhotoLayout.b.X3.K0();
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
                c81 c81Var = chatAttachAlertPhotoLayout.m0;
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
                bi.a3 a3Var = chatAttachAlertPhotoLayout.k0;
                if (a3Var != null) {
                    a3Var.setVisibility(8);
                }
                if (c81Var != null) {
                    c81Var.setVisibility(8);
                    c81Var.setTag(null);
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

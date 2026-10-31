package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ol extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.r0;
                yl ylVar = chatAttachAlertPhotoLayout.P;
                imageView.setImageResource((ylVar == null || !ylVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.f1.e();
                chatAttachAlertPhotoLayout.d0 = false;
                yl ylVar2 = chatAttachAlertPhotoLayout.P;
                if (ylVar2 != null) {
                    ylVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.T3.j0();
                }
                yl ylVar3 = chatAttachAlertPhotoLayout.P;
                if (ylVar3 != null) {
                    ylVar3.setSystemUiVisibility(1028);
                }
                pl plVar = chatAttachAlertPhotoLayout.E;
                if (plVar != null) {
                    plVar.invalidate();
                    break;
                }
                break;
            default:
                s81 s81Var = chatAttachAlertPhotoLayout.l0;
                chatAttachAlertPhotoLayout.f1.e();
                chatAttachAlertPhotoLayout.i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.d0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout.E;
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
                yl ylVar4 = chatAttachAlertPhotoLayout.P;
                if (ylVar4 != null) {
                    ylVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.b0 = false;
                jg.l0 l0Var = chatAttachAlertPhotoLayout.j0;
                if (l0Var != null) {
                    l0Var.setVisibility(8);
                }
                if (s81Var != null) {
                    s81Var.setVisibility(8);
                    s81Var.setTag(null);
                }
                pl plVar3 = chatAttachAlertPhotoLayout.r;
                if (plVar3 != null) {
                    plVar3.setVisibility(8);
                }
                yl ylVar5 = chatAttachAlertPhotoLayout.P;
                if (ylVar5 != null) {
                    ylVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

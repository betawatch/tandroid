package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i7) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.r0;
                pl plVar = chatAttachAlertPhotoLayout.P;
                imageView.setImageResource((plVar == null || !plVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.f1.e();
                chatAttachAlertPhotoLayout.d0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout.P;
                if (plVar2 != null) {
                    plVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.W3.F0();
                }
                pl plVar3 = chatAttachAlertPhotoLayout.P;
                if (plVar3 != null) {
                    plVar3.setSystemUiVisibility(1028);
                }
                il ilVar = chatAttachAlertPhotoLayout.E;
                if (ilVar != null) {
                    ilVar.invalidate();
                    break;
                }
                break;
            default:
                r71 r71Var = chatAttachAlertPhotoLayout.l0;
                chatAttachAlertPhotoLayout.f1.e();
                chatAttachAlertPhotoLayout.i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.d0 = false;
                il ilVar2 = chatAttachAlertPhotoLayout.E;
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
                pl plVar4 = chatAttachAlertPhotoLayout.P;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.b0 = false;
                bi.e5 e5Var = chatAttachAlertPhotoLayout.j0;
                if (e5Var != null) {
                    e5Var.setVisibility(8);
                }
                if (r71Var != null) {
                    r71Var.setVisibility(8);
                    r71Var.setTag(null);
                }
                il ilVar3 = chatAttachAlertPhotoLayout.r;
                if (ilVar3 != null) {
                    ilVar3.setVisibility(8);
                }
                pl plVar5 = chatAttachAlertPhotoLayout.P;
                if (plVar5 != null) {
                    plVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class il extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
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
                ql qlVar = chatAttachAlertPhotoLayout.P;
                imageView.setImageResource((qlVar == null || !qlVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.f1.e();
                chatAttachAlertPhotoLayout.d0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout.P;
                if (qlVar2 != null) {
                    qlVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.T3.F0();
                }
                ql qlVar3 = chatAttachAlertPhotoLayout.P;
                if (qlVar3 != null) {
                    qlVar3.setSystemUiVisibility(1028);
                }
                jl jlVar = chatAttachAlertPhotoLayout.E;
                if (jlVar != null) {
                    jlVar.invalidate();
                    break;
                }
                break;
            default:
                l71 l71Var = chatAttachAlertPhotoLayout.l0;
                chatAttachAlertPhotoLayout.f1.e();
                chatAttachAlertPhotoLayout.i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.d0 = false;
                jl jlVar2 = chatAttachAlertPhotoLayout.E;
                if (jlVar2 != null) {
                    jlVar2.invalidate();
                }
                ql qlVar4 = chatAttachAlertPhotoLayout.P;
                if (qlVar4 != null) {
                    qlVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.b0 = false;
                bi.e5 e5Var = chatAttachAlertPhotoLayout.j0;
                if (e5Var != null) {
                    e5Var.setVisibility(8);
                }
                if (l71Var != null) {
                    l71Var.setVisibility(8);
                    l71Var.setTag(null);
                }
                jl jlVar3 = chatAttachAlertPhotoLayout.r;
                if (jlVar3 != null) {
                    jlVar3.setVisibility(8);
                }
                ql qlVar5 = chatAttachAlertPhotoLayout.P;
                if (qlVar5 != null) {
                    qlVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pl extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.o0;
        bm bmVar = chatAttachAlertPhotoLayout.M;
        imageView.setImageResource((bmVar == null || !bmVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.o0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}

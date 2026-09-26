package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class tl extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.r0;
        em emVar = chatAttachAlertPhotoLayout.P;
        imageView.setImageResource((emVar == null || !emVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nl extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.o0;
        zl zlVar = chatAttachAlertPhotoLayout.M;
        imageView.setImageResource((zlVar == null || !zlVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.o0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}

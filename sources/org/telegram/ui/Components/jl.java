package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jl extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.n0;
        ul ulVar = chatAttachAlertPhotoLayout.L;
        imageView.setImageResource((ulVar == null || !ulVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.n0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}

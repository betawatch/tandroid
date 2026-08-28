package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nl implements CameraView.CameraViewDelegate {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.n0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
        String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
        if (currentFlashMode == null || nextFlashMode == null) {
            return;
        }
        if (currentFlashMode.equals(nextFlashMode)) {
            for (int i9 = 0; i9 < 2; i9++) {
                imageViewArr[i9].setVisibility(4);
                imageViewArr[i9].setAlpha(0.0f);
                imageViewArr[i9].setTranslationY(0.0f);
            }
        } else {
            ChatAttachAlertPhotoLayout.n0(imageViewArr[0], chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode());
            int i10 = 0;
            while (i10 < 2) {
                imageViewArr[i10].setVisibility(i10 == 0 ? 0 : 4);
                imageViewArr[i10].setAlpha((i10 == 0 && chatAttachAlertPhotoLayout.U) ? 1.0f : 0.0f);
                imageViewArr[i10].setTranslationY(0.0f);
                i10++;
            }
        }
        imageView.setImageResource(chatAttachAlertPhotoLayout.L.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
        imageView.setVisibility(chatAttachAlertPhotoLayout.L.hasFrontFaceCamera() ? 0 : 4);
        if (chatAttachAlertPhotoLayout.U) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        chatAttachAlertPhotoLayout.K = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.L, (Property<ul, Float>) View.ALPHA, 0.0f, 1.0f));
        chatAttachAlertPhotoLayout.K.setDuration(180L);
        chatAttachAlertPhotoLayout.K.addListener(new org.telegram.ui.xp(this, 15));
        chatAttachAlertPhotoLayout.K.start();
    }
}

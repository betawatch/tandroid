package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ll implements CameraView.CameraViewDelegate {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.r0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
        String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
        if (currentFlashMode == null || nextFlashMode == null) {
            return;
        }
        if (currentFlashMode.equals(nextFlashMode)) {
            for (int i7 = 0; i7 < 2; i7++) {
                imageViewArr[i7].setVisibility(4);
                imageViewArr[i7].setAlpha(0.0f);
                imageViewArr[i7].setTranslationY(0.0f);
            }
        } else {
            ChatAttachAlertPhotoLayout.r0(imageViewArr[0], chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode());
            int i10 = 0;
            while (i10 < 2) {
                imageViewArr[i10].setVisibility(i10 == 0 ? 0 : 4);
                imageViewArr[i10].setAlpha((i10 == 0 && chatAttachAlertPhotoLayout.b0) ? 1.0f : 0.0f);
                imageViewArr[i10].setTranslationY(0.0f);
                i10++;
            }
        }
        imageView.setImageResource(chatAttachAlertPhotoLayout.P.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
        imageView.setVisibility(chatAttachAlertPhotoLayout.P.hasFrontFaceCamera() ? 0 : 4);
        if (chatAttachAlertPhotoLayout.b0) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        chatAttachAlertPhotoLayout.O = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.P, (Property<ql, Float>) View.ALPHA, 0.0f, 1.0f));
        chatAttachAlertPhotoLayout.O.setDuration(180L);
        chatAttachAlertPhotoLayout.O.addListener(new z5(this, 13));
        chatAttachAlertPhotoLayout.O.start();
    }
}

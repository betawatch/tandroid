package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bm implements CameraView.CameraViewDelegate {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.s0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
        String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
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
            ChatAttachAlertPhotoLayout.r0(imageViewArr[0], chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode());
            int i10 = 0;
            while (i10 < 2) {
                imageViewArr[i10].setVisibility(i10 == 0 ? 0 : 4);
                imageViewArr[i10].setAlpha((i10 == 0 && chatAttachAlertPhotoLayout.c0) ? 1.0f : 0.0f);
                imageViewArr[i10].setTranslationY(0.0f);
                i10++;
            }
        }
        imageView.setImageResource(chatAttachAlertPhotoLayout.Q.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
        imageView.setVisibility(chatAttachAlertPhotoLayout.Q.hasFrontFaceCamera() ? 0 : 4);
        if (chatAttachAlertPhotoLayout.c0) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        chatAttachAlertPhotoLayout.P = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.Q, (Property<gm, Float>) View.ALPHA, 0.0f, 1.0f));
        chatAttachAlertPhotoLayout.P.setDuration(180L);
        chatAttachAlertPhotoLayout.P.addListener(new y(this, 14));
        chatAttachAlertPhotoLayout.P.start();
    }
}

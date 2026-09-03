package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ul implements CameraView.CameraViewDelegate {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.o0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
        String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
        if (currentFlashMode == null || nextFlashMode == null) {
            return;
        }
        if (currentFlashMode.equals(nextFlashMode)) {
            for (int i10 = 0; i10 < 2; i10++) {
                imageViewArr[i10].setVisibility(4);
                imageViewArr[i10].setAlpha(0.0f);
                imageViewArr[i10].setTranslationY(0.0f);
            }
        } else {
            ChatAttachAlertPhotoLayout.o0(imageViewArr[0], chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode());
            int i11 = 0;
            while (i11 < 2) {
                imageViewArr[i11].setVisibility(i11 == 0 ? 0 : 4);
                imageViewArr[i11].setAlpha((i11 == 0 && chatAttachAlertPhotoLayout.V) ? 1.0f : 0.0f);
                imageViewArr[i11].setTranslationY(0.0f);
                i11++;
            }
        }
        imageView.setImageResource(chatAttachAlertPhotoLayout.M.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
        imageView.setVisibility(chatAttachAlertPhotoLayout.M.hasFrontFaceCamera() ? 0 : 4);
        if (chatAttachAlertPhotoLayout.V) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        chatAttachAlertPhotoLayout.L = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.M, (Property<bm, Float>) View.ALPHA, 0.0f, 1.0f));
        chatAttachAlertPhotoLayout.L.setDuration(180L);
        chatAttachAlertPhotoLayout.L.addListener(new a9(this, 8));
        chatAttachAlertPhotoLayout.L.start();
    }
}

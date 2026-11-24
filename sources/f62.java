// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f62 implements CameraView.CameraViewDelegate {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public f62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
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
            for (int i = 0; i < 2; i++) {
                imageViewArr[i].setVisibility(4);
                imageViewArr[i].setAlpha(0.0f);
                imageViewArr[i].setTranslationY(0.0f);
            }
        } else {
            ChatAttachAlertPhotoLayout.r0(imageViewArr[0], chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode());
            int i2 = 0;
            while (i2 < 2) {
                imageViewArr[i2].setVisibility(i2 == 0 ? 0 : 4);
                imageViewArr[i2].setAlpha((i2 == 0 && chatAttachAlertPhotoLayout.c0) ? 1.0f : 0.0f);
                imageViewArr[i2].setTranslationY(0.0f);
                i2++;
            }
        }
        imageView.setImageResource(chatAttachAlertPhotoLayout.Q.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
        imageView.setVisibility(chatAttachAlertPhotoLayout.Q.hasFrontFaceCamera() ? 0 : 4);
        if (chatAttachAlertPhotoLayout.c0) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        chatAttachAlertPhotoLayout.P = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.Q, (Property<m62, Float>) View.ALPHA, 0.0f, 1.0f));
        chatAttachAlertPhotoLayout.P.setDuration(180L);
        chatAttachAlertPhotoLayout.P.addListener(new b91((Object) this, (byte) 19));
        chatAttachAlertPhotoLayout.P.start();
    }
}

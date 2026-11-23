package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class xl implements nt0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = h6Var;
        this.d = m2Var;
    }

    public final void a() {
        gm gmVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (gmVar = chatAttachAlertPhotoLayout.Q) == null || gmVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == ot0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(ot0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                org.telegram.messenger.f3.o(null, 2131749366, new lc(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
            int i7 = 1;
            File q02 = org.telegram.messenger.g0.q0(null, (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).z());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((uiVar.a2 instanceof org.telegram.ui.bn) || uiVar.O2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.kb(this, q02, isSameTakePictureOrientation, i7));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

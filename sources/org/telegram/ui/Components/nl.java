package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nl implements fu0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = p6Var;
        this.d = p2Var;
    }

    public final void a() {
        yl ylVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        bi biVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (ylVar = chatAttachAlertPhotoLayout.P) == null || ylVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == gu0.b) {
            chatAttachAlertPhotoLayout.m0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(gu0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.m5.o(null, 2131749551, new cc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            File q02 = org.telegram.messenger.i0.q0(null, (k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).A());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((biVar.W1 instanceof org.telegram.ui.un) || biVar.K2 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ll(this, q02, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}

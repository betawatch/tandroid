package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dm implements gw0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = u6Var;
        this.d = h3Var;
    }

    public final void a() {
        pm pmVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (pmVar = chatAttachAlertPhotoLayout.P) == null || pmVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == hw0.b) {
            chatAttachAlertPhotoLayout.m0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(hw0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.wh.n(R.string.GlobalAttachPhotoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).w(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((tiVar.f0 instanceof org.telegram.ui.wn) || tiVar.T0 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.kc(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}

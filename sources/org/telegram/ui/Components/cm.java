package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cm implements cw0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = g6Var;
        this.d = e3Var;
    }

    public final void a() {
        om omVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (omVar = chatAttachAlertPhotoLayout.P) == null || omVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == dw0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(dw0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.sl.q(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).x(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((tiVar.f0 instanceof org.telegram.ui.sn) || tiVar.T0 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ei.oc(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}

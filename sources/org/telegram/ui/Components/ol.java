package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ol implements ct0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = e6Var;
        this.d = k2Var;
    }

    public final void a() {
        xl xlVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (xlVar = chatAttachAlertPhotoLayout.Q) == null || xlVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == dt0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(dt0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                org.telegram.messenger.k5.o(null, 2131749542, new cc(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
            File q02 = org.telegram.messenger.g0.q0(null, (e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).z());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((kiVar.a2 instanceof org.telegram.ui.an) || kiVar.O2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.kb(this, q02, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

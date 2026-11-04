package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gl implements at0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public gl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.j2 j2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = e6Var;
        this.d = j2Var;
    }

    public final void a() {
        pl plVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        bi biVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (plVar = chatAttachAlertPhotoLayout.Q) == null || plVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == bt0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(bt0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                org.telegram.messenger.k5.p(null, 2131749550, new fc(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            File q02 = org.telegram.messenger.g0.q0(null, (d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).z());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((biVar.X1 instanceof org.telegram.ui.wm) || biVar.L2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new gi.nb(this, q02, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

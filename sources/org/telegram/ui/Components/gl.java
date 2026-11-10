package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gl implements ct0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public gl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = h6Var;
        this.d = m2Var;
    }

    public final void a() {
        pl plVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (plVar = chatAttachAlertPhotoLayout.P) == null || plVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == dt0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(dt0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.k5.p(null, 2131749542, new gc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            File q02 = org.telegram.messenger.g0.q0(null, (f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).z());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((ciVar.Z1 instanceof org.telegram.ui.cn) || ciVar.N2 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.nb(this, q02, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}

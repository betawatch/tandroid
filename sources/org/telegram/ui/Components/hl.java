package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hl implements dt0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.l2 l2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = g6Var;
        this.d = l2Var;
    }

    public final void a() {
        ql qlVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        di diVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (qlVar = chatAttachAlertPhotoLayout.P) == null || qlVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == et0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(et0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.k5.p(null, 2131749542, new hc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            File q02 = org.telegram.messenger.g0.q0(null, (f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).z());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((diVar.W1 instanceof org.telegram.ui.cn) || diVar.K2 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.nb(this, q02, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}

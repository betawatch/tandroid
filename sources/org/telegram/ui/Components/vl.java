package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vl implements mt0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = i6Var;
        this.d = m2Var;
    }

    public final void a() {
        em emVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (emVar = chatAttachAlertPhotoLayout.Q) == null || emVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == nt0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(nt0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                org.telegram.messenger.f3.o(null, 2131749366, new kc(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
            int i7 = 1;
            File q02 = org.telegram.messenger.g0.q0(null, (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).y());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((tiVar.a2 instanceof org.telegram.ui.bn) || tiVar.O2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.fc(this, q02, isSameTakePictureOrientation, i7));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

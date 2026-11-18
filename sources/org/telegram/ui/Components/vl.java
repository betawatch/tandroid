package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vl implements kt0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = i6Var;
        this.d = n2Var;
    }

    public final void a() {
        em emVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        si siVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (emVar = chatAttachAlertPhotoLayout.Q) == null || emVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == lt0.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(lt0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                org.telegram.messenger.f3.o(null, 2131749367, new lc(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
            int i7 = 1;
            File q02 = org.telegram.messenger.g0.q0(null, (h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).z());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((siVar.a2 instanceof org.telegram.ui.bn) || siVar.O2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.lb(this, q02, isSameTakePictureOrientation, i7));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

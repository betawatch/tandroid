// default package

import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b62 implements zia {
    public File a;
    public boolean b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ dy0 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public b62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ylb ylbVar, dy0 dy0Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = ylbVar;
        this.d = dy0Var;
    }

    public final void a() {
        m62 m62Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (m62Var = chatAttachAlertPhotoLayout.Q) == null || m62Var.getCameraSession() == null) {
            return;
        }
        byte b = 0;
        if (shutterButton.getState() == aja.b) {
            chatAttachAlertPhotoLayout.o0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(aja.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                mlb.y(null, 2131749316, new c41(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            d dVar = i22Var.Z1;
            File q0 = gm.q0(null, (dVar instanceof yv1) && ((yv1) dVar).x());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((i22Var.Z1 instanceof yv1) || i22Var.N2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q0, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new z52(this, q0, isSameTakePictureOrientation, b));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

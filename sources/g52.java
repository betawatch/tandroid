// default package

import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g52 implements qka {
    public File a;
    public boolean b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ ex0 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public g52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, vnb vnbVar, ex0 ex0Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = vnbVar;
        this.d = ex0Var;
    }

    public final void a() {
        r52 r52Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
        if (chatAttachAlertPhotoLayout.t0 || (r52Var = chatAttachAlertPhotoLayout.Q) == null || r52Var.getCameraSession() == null) {
            return;
        }
        byte b = 0;
        if (shutterButton.getState() == rka.b) {
            chatAttachAlertPhotoLayout.n0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
            shutterButton.a(rka.a);
        } else {
            if (!chatAttachAlertPhotoLayout.y0) {
                xnb.x(null, 2131749313, new d31(chatAttachAlertPhotoLayout.Q, this.c), null);
                return;
            }
            e eVar = n12Var.Z1;
            File q0 = hl.q0(null, (eVar instanceof zu1) && ((zu1) eVar).y());
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.Q.getCameraSession().setFlipFront((n12Var.Z1 instanceof zu1) || n12Var.N2 == 2);
            chatAttachAlertPhotoLayout.t0 = CameraController.getInstance().takePicture(q0, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new e52(this, q0, isSameTakePictureOrientation, b));
            chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
        }
    }
}

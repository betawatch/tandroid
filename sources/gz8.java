// default package

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jz8 b;

    public /* synthetic */ gz8(jz8 jz8Var, byte b) {
        this.a = b;
        this.b = jz8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jz8 jz8Var = this.b;
        switch (b) {
            case 0:
                jz8Var.g();
                jz8Var.a.A(jz8Var);
                break;
            case 1:
                af0 af0Var = jz8Var.j0;
                if (af0Var != null) {
                    af0Var.d();
                    jz8Var.j0 = null;
                }
                Bitmap bitmap = jz8Var.l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    jz8Var.l0 = null;
                }
                jz8Var.g0.quitSafely();
                break;
            case 2:
                try {
                    Context context = a.b;
                    qwe qweVar = new qwe();
                    qweVar.a = 256;
                    jz8Var.j0 = new af0(new cgd(context, qweVar));
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                jz8Var.k0 = new aj3((byte) 29);
                break;
            default:
                if (!jz8Var.W && !jz8Var.V && jz8Var.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(jz8Var.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new m88((Object) jz8Var, (Object) cameraView, (byte) 17));
                    jz8Var.b = cameraView;
                    jz8Var.addView(cameraView, 0, tre.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}

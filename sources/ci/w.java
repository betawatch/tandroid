package ci;

import android.content.Context;
import android.graphics.Bitmap;
import c8.ja;
import com.google.android.gms.internal.vision.u2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ w(a0 a0Var, int i7) {
        this.a = i7;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.g();
                a0Var.a.g(a0Var);
                break;
            case 1:
                a0 a0Var2 = this.b;
                u8.n nVar = a0Var2.j0;
                if (nVar != null) {
                    nVar.X0();
                    a0Var2.j0 = null;
                }
                Bitmap bitmap = a0Var2.l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    a0Var2.l0 = null;
                }
                a0Var2.g0.quitSafely();
                break;
            case 2:
                a0 a0Var3 = this.b;
                try {
                    Context context = org.telegram.messenger.t0.b;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    a0Var3.j0 = new u8.n(new u2(context, x1Var));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                a0Var3.k0 = new cb.c(24);
                break;
            default:
                a0 a0Var4 = this.b;
                if (!a0Var4.W && !a0Var4.V && a0Var4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(a0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ab.g(11, a0Var4, cameraView));
                    a0Var4.b = cameraView;
                    a0Var4.addView(cameraView, 0, ja.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}

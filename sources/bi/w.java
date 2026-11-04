package bi;

import android.content.Context;
import android.graphics.Bitmap;
import b8.mf;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ w(a0 a0Var, int i3) {
        this.a = i3;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.g();
                a0Var.a.e(a0Var);
                break;
            case 1:
                a0 a0Var2 = this.b;
                t8.n nVar = a0Var2.j0;
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
                    a0Var3.j0 = new t8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                a0Var3.k0 = new c6.i(9);
                break;
            default:
                a0 a0Var4 = this.b;
                if (!a0Var4.W && !a0Var4.V && a0Var4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(a0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ai.n(6, a0Var4, cameraView));
                    a0Var4.b = cameraView;
                    a0Var4.addView(cameraView, 0, mf.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}

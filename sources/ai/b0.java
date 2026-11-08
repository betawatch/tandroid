package ai;

import android.content.Context;
import android.graphics.Bitmap;
import c8.ha;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ b0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.g();
                i0Var.a.l(i0Var);
                break;
            case 1:
                i0 i0Var2 = this.b;
                u8.n nVar = i0Var2.i0;
                if (nVar != null) {
                    nVar.X0();
                    i0Var2.i0 = null;
                }
                Bitmap bitmap = i0Var2.k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    i0Var2.k0 = null;
                }
                i0Var2.f0.quitSafely();
                break;
            case 2:
                i0 i0Var3 = this.b;
                try {
                    Context context = org.telegram.messenger.t0.b;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    i0Var3.i0 = new u8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                i0Var3.j0 = new aa.n(20);
                break;
            default:
                i0 i0Var4 = this.b;
                if (!i0Var4.V && !i0Var4.U && i0Var4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(i0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ab.g(2, i0Var4, cameraView));
                    i0Var4.b = cameraView;
                    i0Var4.addView(cameraView, 0, ha.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}

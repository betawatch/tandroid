package ci;

import android.content.Context;
import android.graphics.Bitmap;
import c8.na;
import com.google.android.gms.internal.vision.u2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ x(b0 b0Var, int i7) {
        this.a = i7;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                b0Var.g();
                b0Var.a.e(b0Var);
                break;
            case 1:
                b0 b0Var2 = this.b;
                u8.n nVar = b0Var2.j0;
                if (nVar != null) {
                    nVar.X0();
                    b0Var2.j0 = null;
                }
                Bitmap bitmap = b0Var2.l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    b0Var2.l0 = null;
                }
                b0Var2.g0.quitSafely();
                break;
            case 2:
                b0 b0Var3 = this.b;
                try {
                    Context context = org.telegram.messenger.t0.b;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    b0Var3.j0 = new u8.n(new u2(context, x1Var));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                b0Var3.k0 = new d6.i(21);
                break;
            default:
                b0 b0Var4 = this.b;
                if (!b0Var4.W && !b0Var4.V && b0Var4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(b0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ab.g(10, b0Var4, cameraView));
                    b0Var4.b = cameraView;
                    b0Var4.addView(cameraView, 0, na.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}

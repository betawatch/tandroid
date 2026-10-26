package ai;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ c0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                o0Var.g();
                o0Var.a.a(o0Var);
                break;
            case 1:
                o0 o0Var2 = this.b;
                s8.n nVar = o0Var2.i0;
                if (nVar != null) {
                    nVar.X0();
                    o0Var2.i0 = null;
                }
                Bitmap bitmap = o0Var2.k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    o0Var2.k0 = null;
                }
                o0Var2.f0.quitSafely();
                break;
            case 2:
                o0 o0Var3 = this.b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    o0Var3.i0 = new s8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                o0Var3.j0 = new za.c(28);
                break;
            default:
                o0 o0Var4 = this.b;
                if (!o0Var4.V && !o0Var4.U && o0Var4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(o0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new f0(0, o0Var4, cameraView));
                    o0Var4.b = cameraView;
                    o0Var4.addView(cameraView, 0, gb1.g(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}

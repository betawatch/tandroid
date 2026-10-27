package ai;

import android.graphics.Bitmap;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ o0 a;

    public m0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0 o0Var = this.a;
        CameraView cameraView = o0Var.b;
        if (!o0Var.h0 || cameraView == null) {
            return;
        }
        TextureView textureView = cameraView.getTextureView();
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        if (width > 0 && height > 0) {
            if (width > 720 || height > 720) {
                float f7 = width;
                float f10 = height;
                float min = Math.min(720.0f / f7, 720.0f / f10);
                width = Math.max(1, (int) (f7 * min));
                height = Math.max(1, (int) (f10 * min));
            }
            Bitmap bitmap = this.a.k0;
            if (bitmap == null || bitmap.getWidth() != width || this.a.k0.getHeight() != height) {
                this.a.k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            }
            try {
                textureView.getBitmap(this.a.k0);
                o0 o0Var2 = this.a;
                rf.b f11 = o0.f(o0Var2.k0, o0Var2.i0, o0Var2.j0, o0Var2.O);
                if (f11 != null) {
                    AndroidUtilities.runOnUIThread(new a1.f(11, this, f11));
                    return;
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (this.a.h0) {
            this.a.g0.postDelayed(this, 150L);
        }
    }
}

// default package

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha1 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CameraView.CameraGLThread) obj).updTex(surfaceTexture);
                return;
            case 1:
                ((td4) obj).b(false, true, true);
                return;
            case 2:
                yl9 yl9Var = (yl9) obj;
                synchronized (yl9Var.b) {
                    yl9Var.m = true;
                    yl9Var.b.notifyAll();
                }
                return;
            default:
                ((SurfaceTextureHelper) obj).lambda$new$0(surfaceTexture);
                return;
        }
    }
}

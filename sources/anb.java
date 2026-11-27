// default package

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class anb extends rjc implements TextureView.SurfaceTextureListener {
    public bnb M;
    public final Object N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;

    public anb(String str) {
        super(str);
        this.N = new Object();
    }

    @Override // rjc
    public final void g(float f) {
        synchronized (this.N) {
            this.O = f == 0.0f;
        }
        super.g(f);
    }

    @Override // rjc, org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        synchronized (this.N) {
            if (!this.O) {
                if (this.Q != videoFrame.getRotatedWidth() || this.R != videoFrame.getRotatedHeight() || this.S != videoFrame.getRotation()) {
                    Logging.d("TextureEglRenderer", this.b + ": " + ("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation()));
                    bnb bnbVar = this.M;
                    if (bnbVar != null) {
                        bnbVar.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.Q = videoFrame.getRotatedWidth();
                    this.R = videoFrame.getRotatedHeight();
                    this.S = videoFrame.getRotation();
                }
            }
        }
        super.onFrame(videoFrame);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        a(surfaceTexture, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new nn3(countDownLatch, (byte) 1), false);
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Logging.d("TextureEglRenderer", this.b + ": " + ("surfaceChanged: size: " + i + "x" + i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

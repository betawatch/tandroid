// default package

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ke8 implements VideoSink {
    public final EglRenderer a;
    public SurfaceTexture b;
    public boolean c;

    public ke8(ne8 ne8Var) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        ne8Var.setSurfaceTextureListener(new wr5(this, (byte) 1));
        SurfaceTexture surfaceTexture = ne8Var.getSurfaceTexture();
        if (surfaceTexture == null || ne8Var.a == null) {
            return;
        }
        int width = ne8Var.getWidth();
        int height = ne8Var.getHeight();
        if (this.c || this.b == surfaceTexture) {
            return;
        }
        this.b = surfaceTexture;
        if (width > 0 && height > 0) {
            eglRenderer.setLayoutAspectRatio(width / height);
        }
        eglRenderer.createEglSurface(surfaceTexture);
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.release();
        this.b = null;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.c) {
            return;
        }
        this.a.onFrame(videoFrame);
    }
}

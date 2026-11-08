package org.telegram.ui.Components.voip;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.w30;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q0 implements VideoSink {
    public final EglRenderer a;
    public SurfaceTexture b;
    public boolean c;

    public q0(ti.p pVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        pVar.setSurfaceTextureListener(new w30(this, 3));
        SurfaceTexture surfaceTexture = pVar.getSurfaceTexture();
        if (surfaceTexture == null || pVar.a == null) {
            return;
        }
        int width = pVar.getWidth();
        int height = pVar.getHeight();
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

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        org.webrtc.e0.a(this, videoSink);
    }
}

package org.telegram.ui.Components.voip;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.z30;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u0 implements VideoSink {
    public final EglRenderer a;
    public SurfaceTexture b;
    public boolean c;

    public u0(wi.o oVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        oVar.setSurfaceTextureListener(new z30(this, 3));
        SurfaceTexture surfaceTexture = oVar.getSurfaceTexture();
        if (surfaceTexture == null || oVar.a == null) {
            return;
        }
        int width = oVar.getWidth();
        int height = oVar.getHeight();
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
        org.webrtc.d0.a(this, videoSink);
    }
}

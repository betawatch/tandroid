// default package

import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cq9 implements aq9 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public SurfaceTextureHelper b;
    public Surface c;

    public cq9() {
        EglBase eglBase = VideoCapturerDevice.getEglBase();
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RtmpStreamTexture", eglBase != null ? eglBase.getEglBaseContext() : null);
        this.b = create;
        if (create != null) {
            this.c = new Surface(this.b.getSurfaceTexture());
            this.b.startListening(new b11(this, (byte) 1));
        }
    }

    @Override // aq9
    public final void a(int i, int i2) {
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i, i2);
            this.b.setFrameRotation(0);
        }
    }

    @Override // aq9
    public final boolean b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            VideoSink videoSink = (VideoSink) it.next();
            if (!(videoSink instanceof VoIPService.ProxyVideoSink) || !((VoIPService.ProxyVideoSink) videoSink).isUnused()) {
                return true;
            }
        }
        return false;
    }

    @Override // aq9
    public final Surface getSurface() {
        return this.c;
    }
}

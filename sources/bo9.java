// default package

import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bo9 implements zn9 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public SurfaceTextureHelper b;
    public Surface c;

    public bo9() {
        EglBase eglBase = VideoCapturerDevice.getEglBase();
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RtmpStreamTexture", eglBase != null ? eglBase.getEglBaseContext() : null);
        this.b = create;
        if (create != null) {
            this.c = new Surface(this.b.getSurfaceTexture());
            this.b.startListening(new uz0(this, (byte) 1));
        }
    }

    @Override // zn9
    public final void a(int i, int i2) {
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i, i2);
            this.b.setFrameRotation(0);
        }
    }

    @Override // zn9
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

    @Override // zn9
    public final Surface getSurface() {
        return this.c;
    }
}

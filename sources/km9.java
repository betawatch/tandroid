// default package

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class km9 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ nm9 a;

    public km9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.r) {
            gl.c3(new zk9(this, (byte) 2));
        }
    }
}

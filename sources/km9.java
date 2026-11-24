// default package

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
            gl.d3(new zk9(this, (byte) 2));
        }
    }
}

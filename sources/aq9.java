// default package

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class aq9 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ dq9 a;

    public aq9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.r) {
            hl.c3(new v59(this, (byte) 18));
        }
    }
}

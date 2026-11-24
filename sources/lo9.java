// default package

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lo9 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ oo9 a;

    public lo9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.r) {
            gm.c3(new kf9(this, (byte) 10));
        }
    }
}

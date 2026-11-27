// default package

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

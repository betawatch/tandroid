package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b1 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ e1 a;

    public b1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.s) {
            org.telegram.messenger.g0.h3(new ch.w(this, 29));
        }
    }
}

package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class a1 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ c1 a;

    public a1(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.s) {
            org.telegram.messenger.g0.g3(new f2.a(this, 3));
        }
    }
}

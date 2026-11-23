package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

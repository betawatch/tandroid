package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class b2 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ d2 a;

    public b2(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.s) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 3));
        }
    }
}

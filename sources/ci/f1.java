package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class f1 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ h1 a;

    public f1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.s) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 7));
        }
    }
}

package di;

import bi.ab;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h1 implements VideoSink {
    public volatile VideoSink a;
    public volatile int b;
    public volatile int c;
    public final ab d = new ab(this, 18);
    public final /* synthetic */ i1 e;

    public h1(i1 i1Var) {
        this.e = i1Var;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.b || rotatedHeight != this.c) {
            this.b = rotatedWidth;
            this.c = rotatedHeight;
            org.telegram.messenger.g0.h3(this.d);
        }
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        org.webrtc.e0.a(this, videoSink);
    }
}

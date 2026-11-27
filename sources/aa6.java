// default package

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class aa6 implements VideoSink {
    public volatile VideoSink a;
    public volatile int b;
    public volatile int c;
    public final z96 d = new z96(this, (byte) 0);
    public final /* synthetic */ ba6 e;

    public aa6(ba6 ba6Var) {
        this.e = ba6Var;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.b || rotatedHeight != this.c) {
            this.b = rotatedWidth;
            this.c = rotatedHeight;
            hl.c3(this.d);
        }
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }
}

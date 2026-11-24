// default package

import java.util.Iterator;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b11 implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b11(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c11 c11Var = (c11) obj;
                VideoSink incomingVideoSink = c11Var.v.a.getIncomingVideoSink(c11Var.a);
                if (incomingVideoSink != null) {
                    incomingVideoSink.onFrame(videoFrame);
                    break;
                }
                break;
            case 1:
                Iterator it = ((cq9) obj).a.iterator();
                while (it.hasNext()) {
                    ((VideoSink) it.next()).onFrame(videoFrame);
                }
                break;
            default:
                ((VideoSource) obj).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
        byte b = this.a;
    }

    private final void a(VideoSink videoSink) {
    }

    private final void b(VideoSink videoSink) {
    }

    private final void c(VideoSink videoSink) {
    }
}

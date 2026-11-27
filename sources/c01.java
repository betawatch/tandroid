// default package

import java.util.Iterator;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class c01 implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c01(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d01 d01Var = (d01) obj;
                VideoSink incomingVideoSink = d01Var.v.a.getIncomingVideoSink(d01Var.a);
                if (incomingVideoSink != null) {
                    incomingVideoSink.onFrame(videoFrame);
                    break;
                }
                break;
            case 1:
                Iterator it = ((sr9) obj).a.iterator();
                while (it.hasNext()) {
                    ((VideoSink) it.next()).onFrame(videoFrame);
                }
                break;
            default:
                ((VideoSource) obj).lambda$setVideoProcessor$3(videoFrame);
                break;
        }
    }
}

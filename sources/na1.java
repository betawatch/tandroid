// default package

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class na1 implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ na1(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.a) {
            case 0:
                boolean z = SystemClock.elapsedRealtime() - ((oa1) this.b).r > 1000;
                ((oa1) this.b).r = SystemClock.elapsedRealtime();
                ((oa1) this.b).s = videoFrame.getRotatedWidth();
                ((oa1) this.b).w = videoFrame.getRotatedHeight();
                ((oa1) this.b).b.d.onFrame(videoFrame);
                if (z && !((oa1) this.b).x) {
                    ((oa1) this.b).x = true;
                    gm.c3(((oa1) this.b).y);
                    break;
                }
                break;
            default:
                ((ya5) this.b).s = SystemClock.elapsedRealtime();
                ((ya5) this.b).w = videoFrame.getRotatedWidth();
                ((ya5) this.b).x = videoFrame.getRotatedHeight();
                akc akcVar = ((ya5) this.b).c;
                if (akcVar != null) {
                    akcVar.d.onFrame(videoFrame);
                    break;
                }
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
}

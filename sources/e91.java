// default package

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e91 implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ e91(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.a) {
            case 0:
                boolean z = SystemClock.elapsedRealtime() - ((f91) this.b).r > 1000;
                ((f91) this.b).r = SystemClock.elapsedRealtime();
                ((f91) this.b).s = videoFrame.getRotatedWidth();
                ((f91) this.b).w = videoFrame.getRotatedHeight();
                ((f91) this.b).b.d.onFrame(videoFrame);
                if (z && !((f91) this.b).x) {
                    ((f91) this.b).x = true;
                    gl.d3(((f91) this.b).y);
                    break;
                }
                break;
            default:
                ((z85) this.b).s = SystemClock.elapsedRealtime();
                ((z85) this.b).w = videoFrame.getRotatedWidth();
                ((z85) this.b).x = videoFrame.getRotatedHeight();
                aic aicVar = ((z85) this.b).c;
                if (aicVar != null) {
                    aicVar.d.onFrame(videoFrame);
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

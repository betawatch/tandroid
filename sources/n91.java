// default package

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n91 implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ n91(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.a) {
            case 0:
                boolean z = SystemClock.elapsedRealtime() - ((o91) this.b).r > 1000;
                ((o91) this.b).r = SystemClock.elapsedRealtime();
                ((o91) this.b).s = videoFrame.getRotatedWidth();
                ((o91) this.b).w = videoFrame.getRotatedHeight();
                ((o91) this.b).b.d.onFrame(videoFrame);
                if (z && !((o91) this.b).x) {
                    ((o91) this.b).x = true;
                    hl.c3(((o91) this.b).y);
                    break;
                }
                break;
            default:
                ((bb5) this.b).s = SystemClock.elapsedRealtime();
                ((bb5) this.b).w = videoFrame.getRotatedWidth();
                ((bb5) this.b).x = videoFrame.getRotatedHeight();
                hmc hmcVar = ((bb5) this.b).c;
                if (hmcVar != null) {
                    hmcVar.d.onFrame(videoFrame);
                    break;
                }
                break;
        }
    }
}

// default package

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

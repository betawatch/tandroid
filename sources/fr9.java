// default package

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fr9 implements VideoSink {
    public volatile ke8 a;
    public volatile gmc b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final v59 f = new v59(this, 22);
    public final /* synthetic */ ir9 h;

    public fr9(ir9 ir9Var) {
        this.h = ir9Var;
    }

    public final boolean a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return this.e < j ? elapsedRealtime - j < 700 : elapsedRealtime - this.e < 5000;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime - this.e > 5000;
        this.e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.c || rotatedHeight != this.d || z) {
            this.c = rotatedWidth;
            this.d = rotatedHeight;
            hl.c3(this.f);
        }
        ke8 ke8Var = this.a;
        gmc gmcVar = this.b;
        if (ke8Var != null) {
            ke8Var.onFrame(videoFrame);
        }
        if (gmcVar != null) {
            gmcVar.onFrame(videoFrame);
        }
    }
}

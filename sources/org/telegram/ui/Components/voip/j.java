package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j implements VideoSink {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ j(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.a) {
            case 0:
                boolean z9 = SystemClock.elapsedRealtime() - ((k) this.b).r > 1000;
                ((k) this.b).r = SystemClock.elapsedRealtime();
                ((k) this.b).s = videoFrame.getRotatedWidth();
                ((k) this.b).w = videoFrame.getRotatedHeight();
                ((k) this.b).b.d.onFrame(videoFrame);
                if (z9 && !((k) this.b).x) {
                    ((k) this.b).x = true;
                    org.telegram.messenger.g0.h3(((k) this.b).y);
                    break;
                }
                break;
            default:
                ((d0) this.b).s = SystemClock.elapsedRealtime();
                ((d0) this.b).w = videoFrame.getRotatedWidth();
                ((d0) this.b).x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.b).c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    break;
                }
                break;
        }
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        int i7 = this.a;
        org.webrtc.e0.a(this, videoSink);
    }
}

package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                boolean z10 = SystemClock.elapsedRealtime() - ((k) this.b).r > 1000;
                ((k) this.b).r = SystemClock.elapsedRealtime();
                ((k) this.b).s = videoFrame.getRotatedWidth();
                ((k) this.b).w = videoFrame.getRotatedHeight();
                ((k) this.b).b.d.onFrame(videoFrame);
                if (z10 && !((k) this.b).x) {
                    ((k) this.b).x = true;
                    org.telegram.messenger.g0.g3(((k) this.b).y);
                    break;
                }
                break;
            default:
                ((d0) this.b).s = SystemClock.elapsedRealtime();
                ((d0) this.b).w = videoFrame.getRotatedWidth();
                ((d0) this.b).x = videoFrame.getRotatedHeight();
                n2 n2Var = ((d0) this.b).c;
                if (n2Var != null) {
                    n2Var.d.onFrame(videoFrame);
                    break;
                }
                break;
        }
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        int i7 = this.a;
        org.webrtc.d0.a(this, videoSink);
    }
}

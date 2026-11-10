package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.p5;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d1 implements VideoSink {
    public volatile q0 a;
    public volatile j2 b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final p5 f = new p5(this, 3);
    public final /* synthetic */ g1 h;

    public d1(g1 g1Var) {
        this.h = g1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return this.e < j3 ? elapsedRealtime - j3 < 700 : elapsedRealtime - this.e < 5000;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = elapsedRealtime - this.e > 5000;
        this.e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.c || rotatedHeight != this.d || z9) {
            this.c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.h3(this.f);
        }
        q0 q0Var = this.a;
        j2 j2Var = this.b;
        if (q0Var != null) {
            q0Var.onFrame(videoFrame);
        }
        if (j2Var != null) {
            j2Var.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}

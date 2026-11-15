package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h1 implements VideoSink {
    public volatile u0 a;
    public volatile n2 b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final org.telegram.ui.ActionBar.r0 f = new org.telegram.ui.ActionBar.r0(this, 16);
    public final /* synthetic */ k1 h;

    public h1(k1 k1Var) {
        this.h = k1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return this.e < j3 ? elapsedRealtime - j3 < 700 : elapsedRealtime - this.e < 5000;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = elapsedRealtime - this.e > 5000;
        this.e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.c || rotatedHeight != this.d || z10) {
            this.c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.h3(this.f);
        }
        u0 u0Var = this.a;
        n2 n2Var = this.b;
        if (u0Var != null) {
            u0Var.onFrame(videoFrame);
        }
        if (n2Var != null) {
            n2Var.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}

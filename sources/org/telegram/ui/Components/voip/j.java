package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ((e0) this.b).s = SystemClock.elapsedRealtime();
                ((e0) this.b).w = videoFrame.getRotatedWidth();
                ((e0) this.b).x = videoFrame.getRotatedHeight();
                o2 o2Var = ((e0) this.b).c;
                if (o2Var != null) {
                    o2Var.d.onFrame(videoFrame);
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

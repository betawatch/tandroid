// default package

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bdc extends zcc implements Choreographer$VsyncCallback {
    public final Handler e;

    public bdc(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = hac.q(null);
    }

    @Override // zcc
    public final void a() {
        this.b.registerDisplayListener(this, hac.q(null));
        Choreographer choreographer = this.a;
        choreographer.removeVsyncCallback(this);
        choreographer.postVsyncCallback(this);
    }

    @Override // zcc
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final /* synthetic */ void c() {
        this.a.postVsyncCallback(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.e.removeCallbacksAndMessages(null);
            Choreographer choreographer = this.a;
            choreographer.removeVsyncCallback(this);
            choreographer.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.removeCallbacksAndMessages(null);
        this.e.postDelayed(new f8c(this, (byte) 5), 500L);
    }
}

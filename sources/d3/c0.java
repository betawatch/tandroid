package d3;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import bi.ab;
import h2.m0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c0 extends a0 implements Choreographer$VsyncCallback {
    public final Handler e;

    public c0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = m0.q(null);
    }

    @Override // d3.a0
    public final void a() {
        this.b.registerDisplayListener(this, m0.q(null));
        this.a.postVsyncCallback(this);
    }

    @Override // d3.a0
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            this.a.postVsyncCallback(this);
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
        this.e.postDelayed(new ab(this, 13), 500L);
    }
}

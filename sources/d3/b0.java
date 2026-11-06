package d3;

import android.view.Choreographer;
import h2.m0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b0 extends a0 implements Choreographer.FrameCallback {
    @Override // d3.a0
    public final void a() {
        long j3;
        this.b.registerDisplayListener(this, m0.q(null));
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            j3 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            h2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j3 = -9223372036854775807L;
        }
        this.d = j3;
    }

    @Override // d3.a0
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.c = j3;
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        long j3;
        if (i7 == 0) {
            this.a.postFrameCallback(this);
            if (this.b.getDisplay(0) != null) {
                j3 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                h2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j3 = -9223372036854775807L;
            }
            this.d = j3;
        }
    }
}

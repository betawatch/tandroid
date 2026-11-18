package d3;

import android.view.Choreographer;
import h2.l0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a0 extends z implements Choreographer.FrameCallback {
    @Override // d3.z
    public final void a() {
        long j3;
        this.b.registerDisplayListener(this, l0.q(null));
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            j3 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            h2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j3 = -9223372036854775807L;
        }
        this.d = j3;
    }

    @Override // d3.z
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

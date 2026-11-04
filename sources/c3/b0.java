package c3;

import android.view.Choreographer;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends a0 implements Choreographer.FrameCallback {
    @Override // c3.a0
    public final void a() {
        long j10;
        this.b.registerDisplayListener(this, n0.q(null));
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            j10 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            g2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
        }
        this.d = j10;
    }

    @Override // c3.a0
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.c = j10;
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        long j10;
        if (i3 == 0) {
            this.a.postFrameCallback(this);
            if (this.b.getDisplay(0) != null) {
                j10 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                g2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j10 = -9223372036854775807L;
            }
            this.d = j10;
        }
    }
}

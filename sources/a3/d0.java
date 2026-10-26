package a3;

import android.view.Choreographer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d0 extends c0 implements Choreographer.FrameCallback {
    @Override // a3.c0
    public final void a() {
        long j10;
        this.b.registerDisplayListener(this, e2.n0.q(null));
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            j10 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            e2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
        }
        this.d = j10;
    }

    @Override // a3.c0
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
    public final void onDisplayChanged(int i10) {
        long j10;
        if (i10 == 0) {
            this.a.postFrameCallback(this);
            if (this.b.getDisplay(0) != null) {
                j10 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                e2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j10 = -9223372036854775807L;
            }
            this.d = j10;
        }
    }
}

// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class adc extends zcc implements Choreographer.FrameCallback {
    @Override // zcc
    public final void a() {
        long j;
        this.b.registerDisplayListener(this, hac.q(null));
        this.a.removeFrameCallback(this);
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            ncd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.d = j;
    }

    @Override // zcc
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        this.a.removeFrameCallback(this);
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.a.removeFrameCallback(this);
            this.a.postFrameCallback(this);
            if (this.b.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                ncd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.d = j;
        }
    }
}

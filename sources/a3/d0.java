package a3;

import android.view.Choreographer;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d0 extends c0 implements Choreographer.FrameCallback {
    @Override // a3.c0
    public final void a() {
        long j10;
        this.b.registerDisplayListener(this, e2.m0.q(null));
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

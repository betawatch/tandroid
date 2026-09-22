package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kt0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.z1.f(false);
        org.telegram.ui.Components.eg0.p0.Q.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.e(false);
        photoViewer.z1.d(!z10);
        photoViewer.z1.f(true);
        photoViewer.e0.invalidate();
        org.telegram.ui.Components.eg0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.q3.h(f7, false);
            photoViewer.r3.invalidate();
        }
        org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.p0;
        eg0Var.Q.g(0L);
        if (z10) {
            eg0Var.Z = f7;
            ai.n4 n4Var = eg0Var.b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.dg0 dg0Var = eg0Var.h;
            if (dg0Var != null) {
                dg0Var.invalidate();
            }
        }
    }
}

package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ft0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.z1.f(false);
        org.telegram.ui.Components.rg0.p0.Q.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.e(false);
        photoViewer.z1.d(!z10);
        photoViewer.z1.f(true);
        photoViewer.e0.invalidate();
        org.telegram.ui.Components.rg0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.q3.h(f7, false);
            photoViewer.r3.invalidate();
        }
        org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.p0;
        rg0Var.Q.g(0L);
        if (z10) {
            rg0Var.Z = f7;
            ai.n4 n4Var = rg0Var.b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.qg0 qg0Var = rg0Var.h;
            if (qg0Var != null) {
                qg0Var.invalidate();
            }
        }
    }
}

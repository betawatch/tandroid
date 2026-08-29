package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gs0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.v1.f(false);
        org.telegram.ui.Components.bg0.l0.M.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.v1.e(false);
        photoViewer.v1.d(!z10);
        photoViewer.v1.f(true);
        photoViewer.a0.invalidate();
        org.telegram.ui.Components.bg0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f9, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.v1.g(Math.abs(j10));
        if (z10) {
            photoViewer.m3.h(f9, false);
            photoViewer.n3.invalidate();
        }
        org.telegram.ui.Components.bg0 bg0Var = org.telegram.ui.Components.bg0.l0;
        bg0Var.M.g(0L);
        if (z10) {
            bg0Var.V = f9;
            lh.z2 z2Var = bg0Var.X;
            if (z2Var != null) {
                z2Var.invalidate();
            }
            org.telegram.ui.Components.ag0 ag0Var = bg0Var.h;
            if (ag0Var != null) {
                ag0Var.invalidate();
            }
        }
    }
}

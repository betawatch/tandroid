package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hs0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.v1.f(false);
        org.telegram.ui.Components.pf0.l0.M.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.v1.e(false);
        photoViewer.v1.d(!z10);
        photoViewer.v1.f(true);
        photoViewer.a0.invalidate();
        org.telegram.ui.Components.pf0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.v1.g(Math.abs(j10));
        if (z10) {
            photoViewer.m3.h(f10, false);
            photoViewer.n3.invalidate();
        }
        org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.l0;
        pf0Var.M.g(0L);
        if (z10) {
            pf0Var.V = f10;
            ih.b3 b3Var = pf0Var.X;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            org.telegram.ui.Components.of0 of0Var = pf0Var.h;
            if (of0Var != null) {
                of0Var.invalidate();
            }
        }
    }
}

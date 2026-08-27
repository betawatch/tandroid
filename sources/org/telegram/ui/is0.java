package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class is0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.v1.f(false);
        org.telegram.ui.Components.sf0.l0.M.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.v1.e(false);
        photoViewer.v1.d(!z10);
        photoViewer.v1.f(true);
        photoViewer.a0.invalidate();
        org.telegram.ui.Components.sf0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.v1.g(Math.abs(j10));
        if (z10) {
            photoViewer.m3.h(f10, false);
            photoViewer.n3.invalidate();
        }
        org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.l0;
        sf0Var.M.g(0L);
        if (z10) {
            sf0Var.V = f10;
            jh.a3 a3Var = sf0Var.X;
            if (a3Var != null) {
                a3Var.invalidate();
            }
            org.telegram.ui.Components.rf0 rf0Var = sf0Var.h;
            if (rf0Var != null) {
                rf0Var.invalidate();
            }
        }
    }
}

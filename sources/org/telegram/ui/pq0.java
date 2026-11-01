package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pq0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.d(photoViewer, obtain);
        photoViewer.z1.f(false);
        org.telegram.ui.Components.jf0.p0.Q.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.e(false);
        photoViewer.z1.d(!z10);
        photoViewer.z1.f(true);
        photoViewer.e0.invalidate();
        org.telegram.ui.Components.jf0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.q3.h(false, f7);
            photoViewer.r3.invalidate();
        }
        org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.p0;
        jf0Var.Q.g(0L);
        if (z10) {
            jf0Var.Z = f7;
            ih.c cVar = jf0Var.b0;
            if (cVar != null) {
                cVar.invalidate();
            }
            org.telegram.ui.Components.if0 if0Var = jf0Var.h;
            if (if0Var != null) {
                if0Var.invalidate();
            }
        }
    }
}

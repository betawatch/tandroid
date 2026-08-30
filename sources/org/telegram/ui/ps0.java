package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ps0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.w1.f(false);
        org.telegram.ui.Components.lg0.m0.N.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z4) {
        PhotoViewer photoViewer = this.a;
        photoViewer.w1.e(false);
        photoViewer.w1.d(!z4);
        photoViewer.w1.f(true);
        photoViewer.b0.invalidate();
        org.telegram.ui.Components.lg0.v(z4);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        PhotoViewer photoViewer = this.a;
        photoViewer.w1.g(Math.abs(j10));
        if (z4) {
            photoViewer.n3.h(f10, false);
            photoViewer.o3.invalidate();
        }
        org.telegram.ui.Components.lg0 lg0Var = org.telegram.ui.Components.lg0.m0;
        lg0Var.N.g(0L);
        if (z4) {
            lg0Var.W = f10;
            nh.a3 a3Var = lg0Var.Y;
            if (a3Var != null) {
                a3Var.invalidate();
            }
            org.telegram.ui.Components.kg0 kg0Var = lg0Var.h;
            if (kg0Var != null) {
                kg0Var.invalidate();
            }
        }
    }
}

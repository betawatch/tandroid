package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fp0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        wi.h hVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.A1.f(false);
        wi.n nVar = photoViewer.P8;
        if (nVar == null || (hVar = nVar.e) == null) {
            return;
        }
        hVar.F.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.e(false);
        boolean z11 = !z10;
        photoViewer.A1.d(z11);
        photoViewer.A1.f(true);
        photoViewer.f0.invalidate();
        wi.n nVar = photoViewer.P8;
        if (nVar == null || (hVar = nVar.e) == null) {
            return;
        }
        org.telegram.ui.Components.m51 m51Var = hVar.F;
        m51Var.e(false);
        m51Var.d(z11);
        m51Var.f(true);
        fi.w2 w2Var = hVar.o;
        if (w2Var != null) {
            w2Var.invalidate();
        }
        wi.d dVar = hVar.m;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f10, boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.g(Math.abs(j3));
        if (z10) {
            photoViewer.q3.h(false, f10);
            photoViewer.r3.invalidate();
        }
        wi.n nVar = photoViewer.P8;
        if (nVar == null || (hVar = nVar.e) == null) {
            return;
        }
        hVar.F.g(0L);
        if (z10) {
            hVar.I = f10;
            fi.w2 w2Var = hVar.o;
            if (w2Var != null) {
                w2Var.invalidate();
            }
            wi.d dVar = hVar.m;
            if (dVar != null) {
                dVar.invalidate();
            }
        }
    }
}

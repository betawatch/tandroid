package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Nb.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.d(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                ie0.q0.R.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                d51 d51Var = q1Var.Nb;
                d51Var.n = new hi.d(this, 27);
                d51Var.e(false);
                q1Var.Nb.d(!z10);
                q1Var.Nb.f(true);
                q1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.A1.e(false);
                photoViewer.A1.d(!z10);
                photoViewer.A1.f(true);
                photoViewer.f0.invalidate();
                ie0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.Nb.g(Math.abs(j10));
                if (z10) {
                    q1Var.P5.b0 = f10;
                    q1Var.Q3();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.A1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.r3.h(false, f10);
                    photoViewer.s3.invalidate();
                }
                ie0 ie0Var = ie0.q0;
                ie0Var.R.g(0L);
                if (z10) {
                    ie0Var.a0 = f10;
                    ei.e3 e3Var = ie0Var.c0;
                    if (e3Var != null) {
                        e3Var.invalidate();
                    }
                    ge0 ge0Var = ie0Var.h;
                    if (ge0Var != null) {
                        ge0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

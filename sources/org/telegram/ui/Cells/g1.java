package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class g1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Gd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.z1.f(false);
                dh0.p0.Q.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                b81 b81Var = t1Var.Gd;
                b81Var.n = new ki.t1(this, 11);
                b81Var.e(false);
                t1Var.Gd.d(!z10);
                t1Var.Gd.f(true);
                t1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.e(false);
                photoViewer.z1.d(!z10);
                photoViewer.z1.f(true);
                photoViewer.e0.invalidate();
                dh0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                t1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    t1Var.y7.audioProgress = f7;
                    t1Var.p4();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.q3.h(f7, false);
                    photoViewer.r3.invalidate();
                }
                dh0 dh0Var = dh0.p0;
                dh0Var.Q.g(0L);
                if (z10) {
                    dh0Var.Z = f7;
                    ci.h3 h3Var = dh0Var.b0;
                    if (h3Var != null) {
                        h3Var.invalidate();
                    }
                    ch0 ch0Var = dh0Var.h;
                    if (ch0Var != null) {
                        ch0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

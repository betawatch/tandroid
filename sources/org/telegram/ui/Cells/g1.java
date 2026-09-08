package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                eg0.p0.Q.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                w61 w61Var = t1Var.Gd;
                w61Var.n = new l.d(this, 9);
                w61Var.e(false);
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
                eg0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                t1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    t1Var.y7.audioProgress = f7;
                    t1Var.q4();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.q3.h(f7, false);
                    photoViewer.r3.invalidate();
                }
                eg0 eg0Var = eg0.p0;
                eg0Var.Q.g(0L);
                if (z10) {
                    eg0Var.Z = f7;
                    bi.a4 a4Var = eg0Var.b0;
                    if (a4Var != null) {
                        a4Var.invalidate();
                    }
                    dg0 dg0Var = eg0Var.h;
                    if (dg0Var != null) {
                        dg0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

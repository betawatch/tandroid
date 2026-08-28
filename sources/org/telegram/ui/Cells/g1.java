package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                t1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                t1Var.Cd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.v1.f(false);
                pf0.l0.M.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                a61 a61Var = t1Var.Cd;
                a61Var.n = new m5.c0(this, 10);
                a61Var.e(false);
                t1Var.Cd.d(!z10);
                t1Var.Cd.f(true);
                t1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.v1.e(false);
                photoViewer.v1.d(!z10);
                photoViewer.v1.f(true);
                photoViewer.a0.invalidate();
                pf0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                t1Var.Cd.g(Math.abs(j10));
                if (z10) {
                    t1Var.u7.audioProgress = f10;
                    t1Var.q4();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.v1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.m3.h(f10, false);
                    photoViewer.n3.invalidate();
                }
                pf0 pf0Var = pf0.l0;
                pf0Var.M.g(0L);
                if (z10) {
                    pf0Var.V = f10;
                    ih.b3 b3Var = pf0Var.X;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    of0 of0Var = pf0Var.h;
                    if (of0Var != null) {
                        of0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

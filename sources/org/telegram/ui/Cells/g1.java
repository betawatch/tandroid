package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                t1Var.Dd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.w1.f(false);
                lg0.m0.N.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z4) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                y61 y61Var = t1Var.Dd;
                y61Var.n = new f1(this, 0);
                y61Var.e(false);
                t1Var.Dd.d(!z4);
                t1Var.Dd.f(true);
                t1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w1.e(false);
                photoViewer.w1.d(!z4);
                photoViewer.w1.f(true);
                photoViewer.b0.invalidate();
                lg0.v(z4);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                t1Var.Dd.g(Math.abs(j10));
                if (z4) {
                    t1Var.v7.audioProgress = f10;
                    t1Var.q4();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w1.g(Math.abs(j10));
                if (z4) {
                    photoViewer.n3.h(f10, false);
                    photoViewer.o3.invalidate();
                }
                lg0 lg0Var = lg0.m0;
                lg0Var.N.g(0L);
                if (z4) {
                    lg0Var.W = f10;
                    nh.a3 a3Var = lg0Var.Y;
                    if (a3Var != null) {
                        a3Var.invalidate();
                    }
                    kg0 kg0Var = lg0Var.h;
                    if (kg0Var != null) {
                        kg0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

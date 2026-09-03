package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ng0.m0.N.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z4) {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                z61 z61Var = t1Var.Dd;
                z61Var.n = new f1(this, 0);
                z61Var.e(false);
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
                ng0.v(z4);
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
                ng0 ng0Var = ng0.m0;
                ng0Var.N.g(0L);
                if (z4) {
                    ng0Var.W = f10;
                    oh.b3 b3Var = ng0Var.Y;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    mg0 mg0Var = ng0Var.h;
                    if (mg0Var != null) {
                        mg0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

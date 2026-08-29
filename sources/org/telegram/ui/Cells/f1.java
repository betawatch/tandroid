package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                s1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                s1Var.Cd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.v1.f(false);
                bg0.l0.M.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                n61 n61Var = s1Var.Cd;
                n61Var.n = new o1.a(this, 4);
                n61Var.e(false);
                s1Var.Cd.d(!z10);
                s1Var.Cd.f(true);
                s1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.v1.e(false);
                photoViewer.v1.d(!z10);
                photoViewer.v1.f(true);
                photoViewer.a0.invalidate();
                bg0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f9, boolean z10) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                s1Var.Cd.g(Math.abs(j10));
                if (z10) {
                    s1Var.u7.audioProgress = f9;
                    s1Var.q4();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.v1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.m3.h(f9, false);
                    photoViewer.n3.invalidate();
                }
                bg0 bg0Var = bg0.l0;
                bg0Var.M.g(0L);
                if (z10) {
                    bg0Var.V = f9;
                    lh.z2 z2Var = bg0Var.X;
                    if (z2Var != null) {
                        z2Var.invalidate();
                    }
                    ag0 ag0Var = bg0Var.h;
                    if (ag0Var != null) {
                        ag0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

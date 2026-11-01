package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Mb.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.d(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.z1.f(false);
                jf0.p0.Q.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                n61 n61Var = q1Var.Mb;
                n61Var.n = new m2.t(this, 7);
                n61Var.e(false);
                q1Var.Mb.d(!z10);
                q1Var.Mb.f(true);
                q1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.e(false);
                photoViewer.z1.d(!z10);
                photoViewer.z1.f(true);
                photoViewer.e0.invalidate();
                jf0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.Mb.g(Math.abs(j10));
                if (z10) {
                    q1Var.O5.b0 = f7;
                    q1Var.O3();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.g(Math.abs(j10));
                if (z10) {
                    photoViewer.q3.h(false, f7);
                    photoViewer.r3.invalidate();
                }
                jf0 jf0Var = jf0.p0;
                jf0Var.Q.g(0L);
                if (z10) {
                    jf0Var.Z = f7;
                    ih.c cVar = jf0Var.b0;
                    if (cVar != null) {
                        cVar.invalidate();
                    }
                    if0 if0Var = jf0Var.h;
                    if (if0Var != null) {
                        if0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

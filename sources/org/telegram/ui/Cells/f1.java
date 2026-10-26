package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                s1Var.Gd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.z1.f(false);
                ch0.p0.Q.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                j81 j81Var = s1Var.Gd;
                j81Var.n = new jg.s0(this, 15);
                j81Var.e(false);
                s1Var.Gd.d(!z10);
                s1Var.Gd.f(true);
                s1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.e(false);
                photoViewer.z1.d(!z10);
                photoViewer.z1.f(true);
                photoViewer.e0.invalidate();
                ch0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                s1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    s1Var.y7.audioProgress = f7;
                    s1Var.s4();
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
                ch0 ch0Var = ch0.p0;
                ch0Var.Q.g(0L);
                if (z10) {
                    ch0Var.Z = f7;
                    di.h3 h3Var = ch0Var.b0;
                    if (h3Var != null) {
                        h3Var.invalidate();
                    }
                    bh0 bh0Var = ch0Var.h;
                    if (bh0Var != null) {
                        bh0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

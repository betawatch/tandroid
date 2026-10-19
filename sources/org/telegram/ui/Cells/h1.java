package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class h1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                u1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                u1Var.Gd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.z1.f(false);
                zg0.p0.Q.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                s71 s71Var = u1Var.Gd;
                s71Var.n = new ki.t1(this, 11);
                s71Var.e(false);
                u1Var.Gd.d(!z10);
                u1Var.Gd.f(true);
                u1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.e(false);
                photoViewer.z1.d(!z10);
                photoViewer.z1.f(true);
                photoViewer.e0.invalidate();
                zg0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                u1Var.Gd.g(Math.abs(j10));
                if (z10) {
                    u1Var.y7.audioProgress = f7;
                    u1Var.q4();
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
                zg0 zg0Var = zg0.p0;
                zg0Var.Q.g(0L);
                if (z10) {
                    zg0Var.Z = f7;
                    ci.i3 i3Var = zg0Var.b0;
                    if (i3Var != null) {
                        i3Var.invalidate();
                    }
                    yg0 yg0Var = zg0Var.h;
                    if (yg0Var != null) {
                        yg0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

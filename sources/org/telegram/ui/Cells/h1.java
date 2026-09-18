package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                pg0.p0.Q.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                l71 l71Var = u1Var.Gd;
                l71Var.n = new n2.e(this, 3);
                l71Var.e(false);
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
                pg0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                u1Var.Gd.g(Math.abs(j3));
                if (z10) {
                    u1Var.y7.audioProgress = f7;
                    u1Var.q4();
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
                pg0 pg0Var = pg0.p0;
                pg0Var.Q.g(0L);
                if (z10) {
                    pg0Var.Z = f7;
                    ai.n4 n4Var = pg0Var.b0;
                    if (n4Var != null) {
                        n4Var.invalidate();
                    }
                    og0 og0Var = pg0Var.h;
                    if (og0Var != null) {
                        og0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                sf0.l0.M.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                c61 c61Var = s1Var.Cd;
                c61Var.n = new o0.b(this, 3);
                c61Var.e(false);
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
                sf0.v(z10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                s1Var.Cd.g(Math.abs(j10));
                if (z10) {
                    s1Var.u7.audioProgress = f10;
                    s1Var.p4();
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
                sf0 sf0Var = sf0.l0;
                sf0Var.M.g(0L);
                if (z10) {
                    sf0Var.V = f10;
                    jh.a3 a3Var = sf0Var.X;
                    if (a3Var != null) {
                        a3Var.invalidate();
                    }
                    rf0 rf0Var = sf0Var.h;
                    if (rf0Var != null) {
                        rf0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

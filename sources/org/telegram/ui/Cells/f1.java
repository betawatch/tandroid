package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                s1Var.Dd.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.k(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.w1.f(false);
                mg0.m0.N.f(false);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z4) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                y61 y61Var = s1Var.Dd;
                y61Var.n = new ja.c(this, 26);
                y61Var.e(false);
                s1Var.Dd.d(!z4);
                s1Var.Dd.f(true);
                s1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w1.e(false);
                photoViewer.w1.d(!z4);
                photoViewer.w1.f(true);
                photoViewer.b0.invalidate();
                mg0.v(z4);
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                s1Var.Dd.g(Math.abs(j10));
                if (z4) {
                    s1Var.v7.audioProgress = f10;
                    s1Var.q4();
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
                mg0 mg0Var = mg0.m0;
                mg0Var.N.g(0L);
                if (z4) {
                    mg0Var.W = f10;
                    nh.a3 a3Var = mg0Var.Y;
                    if (a3Var != null) {
                        a3Var.invalidate();
                    }
                    lg0 lg0Var = mg0Var.h;
                    if (lg0Var != null) {
                        lg0Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}

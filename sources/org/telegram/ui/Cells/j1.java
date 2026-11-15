package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.ou;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        wi.h hVar;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Ob.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.e) != null) {
                    hVar.F.f(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                m51 m51Var = q1Var.Ob;
                m51Var.n = new ou(this, 2);
                m51Var.e(false);
                q1Var.Ob.d(!z10);
                q1Var.Ob.f(true);
                q1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.A1.e(false);
                boolean z11 = !z10;
                photoViewer.A1.d(z11);
                photoViewer.A1.f(true);
                photoViewer.f0.invalidate();
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.e) != null) {
                    m51 m51Var2 = hVar.F;
                    m51Var2.e(false);
                    m51Var2.d(z11);
                    m51Var2.f(true);
                    fi.w2 w2Var = hVar.o;
                    if (w2Var != null) {
                        w2Var.invalidate();
                    }
                    wi.d dVar = hVar.m;
                    if (dVar != null) {
                        dVar.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f10, boolean z10) {
        wi.h hVar;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.Ob.g(Math.abs(j3));
                if (z10) {
                    q1Var.Q5.b0 = f10;
                    q1Var.T3();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.A1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.q3.h(false, f10);
                    photoViewer.r3.invalidate();
                }
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.e) != null) {
                    hVar.F.g(0L);
                    if (z10) {
                        hVar.I = f10;
                        fi.w2 w2Var = hVar.o;
                        if (w2Var != null) {
                            w2Var.invalidate();
                        }
                        wi.d dVar = hVar.m;
                        if (dVar != null) {
                            dVar.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}

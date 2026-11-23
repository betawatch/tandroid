package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.z51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k1 extends OldVideoPlayerRewinder {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        wi.h hVar;
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.b;
                r1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                r1Var.Ob.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                wi.n nVar = photoViewer.V8;
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
                r1 r1Var = (r1) this.b;
                z51 z51Var = r1Var.Ob;
                z51Var.n = new h6.o(this, 29);
                z51Var.e(false);
                r1Var.Ob.d(!z10);
                r1Var.Ob.f(true);
                r1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.A1.e(false);
                boolean z11 = !z10;
                photoViewer.A1.d(z11);
                photoViewer.A1.f(true);
                photoViewer.f0.invalidate();
                wi.n nVar = photoViewer.V8;
                if (nVar != null && (hVar = nVar.e) != null) {
                    z51 z51Var2 = hVar.F;
                    z51Var2.e(false);
                    z51Var2.d(z11);
                    z51Var2.f(true);
                    fi.u2 u2Var = hVar.o;
                    if (u2Var != null) {
                        u2Var.invalidate();
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
                r1 r1Var = (r1) this.b;
                r1Var.Ob.g(Math.abs(j3));
                if (z10) {
                    r1Var.Q5.b0 = f10;
                    r1Var.U3();
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
                wi.n nVar = photoViewer.V8;
                if (nVar != null && (hVar = nVar.e) != null) {
                    hVar.F.g(0L);
                    if (z10) {
                        hVar.I = f10;
                        fi.u2 u2Var = hVar.o;
                        if (u2Var != null) {
                            u2Var.invalidate();
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

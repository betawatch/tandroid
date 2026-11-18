package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.x51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                r1 r1Var = (r1) this.b;
                x51 x51Var = r1Var.Ob;
                x51Var.n = new hi.w4(this, 27);
                x51Var.e(false);
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
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.e) != null) {
                    x51 x51Var2 = hVar.F;
                    x51Var2.e(false);
                    x51Var2.d(z11);
                    x51Var2.f(true);
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
                wi.n nVar = photoViewer.P8;
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

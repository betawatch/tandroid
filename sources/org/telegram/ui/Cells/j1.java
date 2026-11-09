package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.k51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        ti.i iVar;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Nb.f(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.z1.f(false);
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.e) != null) {
                    iVar.F.f(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                k51 k51Var = q1Var.Nb;
                k51Var.n = new h9.f1(this, 26);
                k51Var.e(false);
                q1Var.Nb.d(!z9);
                q1Var.Nb.f(true);
                q1Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.e(false);
                boolean z10 = !z9;
                photoViewer.z1.d(z10);
                photoViewer.z1.f(true);
                photoViewer.e0.invalidate();
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.e) != null) {
                    k51 k51Var2 = iVar.F;
                    k51Var2.e(false);
                    k51Var2.d(z10);
                    k51Var2.f(true);
                    di.b3 b3Var = iVar.o;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    ti.e eVar = iVar.m;
                    if (eVar != null) {
                        eVar.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f10, boolean z9) {
        ti.i iVar;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                q1Var.Nb.g(Math.abs(j3));
                if (z9) {
                    q1Var.P5.b0 = f10;
                    q1Var.S3();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.z1.g(Math.abs(j3));
                if (z9) {
                    photoViewer.p3.h(false, f10);
                    photoViewer.q3.invalidate();
                }
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.e) != null) {
                    iVar.F.g(0L);
                    if (z9) {
                        iVar.I = f10;
                        di.b3 b3Var = iVar.o;
                        if (b3Var != null) {
                            b3Var.invalidate();
                        }
                        ti.e eVar = iVar.m;
                        if (eVar != null) {
                            eVar.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}

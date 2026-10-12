package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh0 b;

    public /* synthetic */ ah0(fh0 fh0Var, int i10) {
        this.a = i10;
        this.b = fh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                fh0 fh0Var = this.b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    if (fh0Var.r != null) {
                        fh0Var.Z = r2.getCurrentPosition() / fh0Var.r.getVideoDuration();
                        fh0Var.a0 = fh0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = fh0Var.m();
                            fh0Var.Z = r1.n() / m10;
                            fh0Var.a0 = r1.j() / m10;
                        }
                    }
                    fh0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(fh0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                fh0 fh0Var2 = this.b;
                PhotoViewer photoViewer2 = fh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || fh0Var2.r != null) && !fh0Var2.c0 && !fh0Var2.Y && !fh0Var2.w && !fh0Var2.s.isInProgress() && fh0Var2.f0) {
                        h81 h81Var = fh0Var2.V.F2;
                        boolean z10 = fh0Var2.g0[0] >= (((float) fh0Var2.t()) * fh0Var2.J) * 0.5f;
                        long l4 = fh0Var2.l();
                        long m11 = fh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            qg0 qg0Var = fh0Var2.r;
                            if (qg0Var != null) {
                                PhotoViewer photoViewer3 = fh0Var2.V;
                                photoViewer3.c4.startRewind(qg0Var, z10, fh0Var2.g0[0], photoViewer3.t1, fh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = fh0Var2.V;
                                photoViewer4.c4.startRewind(h81Var, z10, fh0Var2.g0[0], photoViewer4.t1, fh0Var2.R);
                            }
                            if (!fh0Var2.E) {
                                fh0Var2.E = true;
                                fh0Var2.y(true);
                                if (!fh0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(fh0Var2.j0, 1500L);
                                    fh0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                fh0 fh0Var3 = this.b;
                PhotoViewer photoViewer5 = fh0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(fh0Var3.j0, 1500L);
                    break;
                } else {
                    fh0Var3.E = false;
                    fh0Var3.y(false);
                    fh0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

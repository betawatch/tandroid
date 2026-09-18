package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ kg0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                pg0 pg0Var = this.b;
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null) {
                    if (pg0Var.r != null) {
                        pg0Var.Z = r2.getCurrentPosition() / pg0Var.r.getVideoDuration();
                        pg0Var.a0 = pg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = pg0Var.m();
                            pg0Var.Z = r1.n() / m10;
                            pg0Var.a0 = r1.j() / m10;
                        }
                    }
                    pg0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(pg0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                pg0 pg0Var2 = this.b;
                PhotoViewer photoViewer2 = pg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || pg0Var2.r != null) && !pg0Var2.c0 && !pg0Var2.Y && !pg0Var2.w && !pg0Var2.s.isInProgress() && pg0Var2.f0) {
                        u71 u71Var = pg0Var2.V.F2;
                        boolean z10 = pg0Var2.g0[0] >= (((float) pg0Var2.t()) * pg0Var2.J) * 0.5f;
                        long l4 = pg0Var2.l();
                        long m11 = pg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            zf0 zf0Var = pg0Var2.r;
                            if (zf0Var != null) {
                                PhotoViewer photoViewer3 = pg0Var2.V;
                                photoViewer3.c4.startRewind(zf0Var, z10, pg0Var2.g0[0], photoViewer3.t1, pg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = pg0Var2.V;
                                photoViewer4.c4.startRewind(u71Var, z10, pg0Var2.g0[0], photoViewer4.t1, pg0Var2.R);
                            }
                            if (!pg0Var2.E) {
                                pg0Var2.E = true;
                                pg0Var2.y(true);
                                if (!pg0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(pg0Var2.j0, 1500L);
                                    pg0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                pg0 pg0Var3 = this.b;
                PhotoViewer photoViewer5 = pg0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(pg0Var3.j0, 1500L);
                    break;
                } else {
                    pg0Var3.E = false;
                    pg0Var3.y(false);
                    pg0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

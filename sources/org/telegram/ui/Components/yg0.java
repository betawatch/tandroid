package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh0 b;

    public /* synthetic */ yg0(dh0 dh0Var, int i10) {
        this.a = i10;
        this.b = dh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                dh0 dh0Var = this.b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    if (dh0Var.r != null) {
                        dh0Var.Z = r2.getCurrentPosition() / dh0Var.r.getVideoDuration();
                        dh0Var.a0 = dh0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = dh0Var.m();
                            dh0Var.Z = r1.n() / m10;
                            dh0Var.a0 = r1.j() / m10;
                        }
                    }
                    dh0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(dh0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                dh0 dh0Var2 = this.b;
                PhotoViewer photoViewer2 = dh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || dh0Var2.r != null) && !dh0Var2.c0 && !dh0Var2.Y && !dh0Var2.w && !dh0Var2.s.isInProgress() && dh0Var2.f0) {
                        j81 j81Var = dh0Var2.V.F2;
                        boolean z10 = dh0Var2.g0[0] >= (((float) dh0Var2.t()) * dh0Var2.J) * 0.5f;
                        long l4 = dh0Var2.l();
                        long m11 = dh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            pg0 pg0Var = dh0Var2.r;
                            if (pg0Var != null) {
                                PhotoViewer photoViewer3 = dh0Var2.V;
                                photoViewer3.c4.startRewind(pg0Var, z10, dh0Var2.g0[0], photoViewer3.t1, dh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = dh0Var2.V;
                                photoViewer4.c4.startRewind(j81Var, z10, dh0Var2.g0[0], photoViewer4.t1, dh0Var2.R);
                            }
                            if (!dh0Var2.E) {
                                dh0Var2.E = true;
                                dh0Var2.y(true);
                                if (!dh0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(dh0Var2.j0, 1500L);
                                    dh0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                dh0 dh0Var3 = this.b;
                PhotoViewer photoViewer5 = dh0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(dh0Var3.j0, 1500L);
                    break;
                } else {
                    dh0Var3.E = false;
                    dh0Var3.y(false);
                    dh0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

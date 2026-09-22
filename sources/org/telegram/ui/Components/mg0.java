package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    public /* synthetic */ mg0(rg0 rg0Var, int i10) {
        this.a = i10;
        this.b = rg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                rg0 rg0Var = this.b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    if (rg0Var.r != null) {
                        rg0Var.Z = r2.getCurrentPosition() / rg0Var.r.getVideoDuration();
                        rg0Var.a0 = rg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = rg0Var.m();
                            rg0Var.Z = r1.n() / m10;
                            rg0Var.a0 = r1.j() / m10;
                        }
                    }
                    rg0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(rg0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                rg0 rg0Var2 = this.b;
                PhotoViewer photoViewer2 = rg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || rg0Var2.r != null) && !rg0Var2.c0 && !rg0Var2.Y && !rg0Var2.w && !rg0Var2.s.isInProgress() && rg0Var2.f0) {
                        v71 v71Var = rg0Var2.V.F2;
                        boolean z10 = rg0Var2.g0[0] >= (((float) rg0Var2.t()) * rg0Var2.J) * 0.5f;
                        long l4 = rg0Var2.l();
                        long m11 = rg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            bg0 bg0Var = rg0Var2.r;
                            if (bg0Var != null) {
                                PhotoViewer photoViewer3 = rg0Var2.V;
                                photoViewer3.c4.startRewind(bg0Var, z10, rg0Var2.g0[0], photoViewer3.t1, rg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = rg0Var2.V;
                                photoViewer4.c4.startRewind(v71Var, z10, rg0Var2.g0[0], photoViewer4.t1, rg0Var2.R);
                            }
                            if (!rg0Var2.E) {
                                rg0Var2.E = true;
                                rg0Var2.y(true);
                                if (!rg0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(rg0Var2.j0, 1500L);
                                    rg0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                rg0 rg0Var3 = this.b;
                PhotoViewer photoViewer5 = rg0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(rg0Var3.j0, 1500L);
                    break;
                } else {
                    rg0Var3.E = false;
                    rg0Var3.y(false);
                    rg0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

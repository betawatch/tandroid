package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;

    public /* synthetic */ ug0(zg0 zg0Var, int i10) {
        this.a = i10;
        this.b = zg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                zg0 zg0Var = this.b;
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null) {
                    if (zg0Var.r != null) {
                        zg0Var.Z = r2.getCurrentPosition() / zg0Var.r.getVideoDuration();
                        zg0Var.a0 = zg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = zg0Var.m();
                            zg0Var.Z = r1.n() / m10;
                            zg0Var.a0 = r1.j() / m10;
                        }
                    }
                    zg0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(zg0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                zg0 zg0Var2 = this.b;
                PhotoViewer photoViewer2 = zg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || zg0Var2.r != null) && !zg0Var2.c0 && !zg0Var2.Y && !zg0Var2.w && !zg0Var2.s.isInProgress() && zg0Var2.f0) {
                        b81 b81Var = zg0Var2.V.F2;
                        boolean z10 = zg0Var2.g0[0] >= (((float) zg0Var2.t()) * zg0Var2.J) * 0.5f;
                        long l4 = zg0Var2.l();
                        long m11 = zg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            kg0 kg0Var = zg0Var2.r;
                            if (kg0Var != null) {
                                PhotoViewer photoViewer3 = zg0Var2.V;
                                photoViewer3.c4.startRewind(kg0Var, z10, zg0Var2.g0[0], photoViewer3.t1, zg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = zg0Var2.V;
                                photoViewer4.c4.startRewind(b81Var, z10, zg0Var2.g0[0], photoViewer4.t1, zg0Var2.R);
                            }
                            if (!zg0Var2.E) {
                                zg0Var2.E = true;
                                zg0Var2.y(true);
                                if (!zg0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(zg0Var2.j0, 1500L);
                                    zg0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                zg0 zg0Var3 = this.b;
                PhotoViewer photoViewer5 = zg0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(zg0Var3.j0, 1500L);
                    break;
                } else {
                    zg0Var3.E = false;
                    zg0Var3.y(false);
                    zg0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

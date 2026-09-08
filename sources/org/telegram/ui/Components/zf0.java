package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ zf0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                eg0 eg0Var = this.b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    if (eg0Var.r != null) {
                        eg0Var.Z = r2.getCurrentPosition() / eg0Var.r.getVideoDuration();
                        eg0Var.a0 = eg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = eg0Var.m();
                            eg0Var.Z = r1.n() / m10;
                            eg0Var.a0 = r1.j() / m10;
                        }
                    }
                    eg0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(eg0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                eg0 eg0Var2 = this.b;
                PhotoViewer photoViewer2 = eg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || eg0Var2.r != null) && !eg0Var2.c0 && !eg0Var2.Y && !eg0Var2.w && !eg0Var2.s.isInProgress() && eg0Var2.f0) {
                        g71 g71Var = eg0Var2.V.F2;
                        boolean z10 = eg0Var2.g0[0] >= (((float) eg0Var2.t()) * eg0Var2.J) * 0.5f;
                        long l4 = eg0Var2.l();
                        long m11 = eg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            qf0 qf0Var = eg0Var2.r;
                            if (qf0Var != null) {
                                PhotoViewer photoViewer3 = eg0Var2.V;
                                photoViewer3.c4.startRewind(qf0Var, z10, eg0Var2.g0[0], photoViewer3.t1, eg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = eg0Var2.V;
                                photoViewer4.c4.startRewind(g71Var, z10, eg0Var2.g0[0], photoViewer4.t1, eg0Var2.R);
                            }
                            if (!eg0Var2.E) {
                                eg0Var2.E = true;
                                eg0Var2.y(true);
                                if (!eg0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(eg0Var2.j0, 1500L);
                                    eg0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                eg0 eg0Var3 = this.b;
                PhotoViewer photoViewer5 = eg0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(eg0Var3.j0, 1500L);
                    break;
                } else {
                    eg0Var3.E = false;
                    eg0Var3.y(false);
                    eg0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

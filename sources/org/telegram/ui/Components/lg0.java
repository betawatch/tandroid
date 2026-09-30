package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ lg0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                qg0 qg0Var = this.b;
                PhotoViewer photoViewer = qg0Var.V;
                if (photoViewer != null) {
                    if (qg0Var.r != null) {
                        qg0Var.Z = r2.getCurrentPosition() / qg0Var.r.getVideoDuration();
                        qg0Var.a0 = qg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = qg0Var.m();
                            qg0Var.Z = r1.n() / m10;
                            qg0Var.a0 = r1.j() / m10;
                        }
                    }
                    qg0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(qg0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                qg0 qg0Var2 = this.b;
                PhotoViewer photoViewer2 = qg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || qg0Var2.r != null) && !qg0Var2.c0 && !qg0Var2.Y && !qg0Var2.w && !qg0Var2.s.isInProgress() && qg0Var2.f0) {
                        u71 u71Var = qg0Var2.V.F2;
                        boolean z10 = qg0Var2.g0[0] >= (((float) qg0Var2.t()) * qg0Var2.J) * 0.5f;
                        long l4 = qg0Var2.l();
                        long m11 = qg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            cg0 cg0Var = qg0Var2.r;
                            if (cg0Var != null) {
                                PhotoViewer photoViewer3 = qg0Var2.V;
                                photoViewer3.c4.startRewind(cg0Var, z10, qg0Var2.g0[0], photoViewer3.t1, qg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = qg0Var2.V;
                                photoViewer4.c4.startRewind(u71Var, z10, qg0Var2.g0[0], photoViewer4.t1, qg0Var2.R);
                            }
                            if (!qg0Var2.E) {
                                qg0Var2.E = true;
                                qg0Var2.y(true);
                                if (!qg0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(qg0Var2.j0, 1500L);
                                    qg0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                qg0 qg0Var3 = this.b;
                PhotoViewer photoViewer5 = qg0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(qg0Var3.j0, 1500L);
                    break;
                } else {
                    qg0Var3.E = false;
                    qg0Var3.y(false);
                    qg0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

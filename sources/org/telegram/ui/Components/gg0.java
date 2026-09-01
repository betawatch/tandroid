package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ gg0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                ng0 ng0Var = this.b;
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null) {
                    if (ng0Var.r != null) {
                        ng0Var.W = r2.getCurrentPosition() / ng0Var.r.getVideoDuration();
                        ng0Var.X = ng0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.C2 != null) {
                            float m9 = ng0Var.m();
                            ng0Var.W = r1.n() / m9;
                            ng0Var.X = r1.j() / m9;
                        }
                    }
                    ng0Var.Y.invalidate();
                    AndroidUtilities.runOnUIThread(ng0Var.b0, 500L);
                    break;
                }
                break;
            case 2:
                ng0 ng0Var2 = this.b;
                PhotoViewer photoViewer2 = ng0Var2.S;
                if (photoViewer2 != null) {
                    if ((photoViewer2.C2 != null || ng0Var2.r != null) && !ng0Var2.Z && !ng0Var2.V && !ng0Var2.w && !ng0Var2.s.isInProgress() && ng0Var2.c0) {
                        k71 k71Var = ng0Var2.S.C2;
                        boolean z4 = ng0Var2.d0[0] >= (((float) ng0Var2.t()) * ng0Var2.G) * 0.5f;
                        long l10 = ng0Var2.l();
                        long m10 = ng0Var2.m();
                        if (l10 != -9223372036854775807L && m10 >= 15000) {
                            xf0 xf0Var = ng0Var2.r;
                            if (xf0Var != null) {
                                PhotoViewer photoViewer3 = ng0Var2.S;
                                photoViewer3.Z3.startRewind(xf0Var, z4, ng0Var2.d0[0], photoViewer3.q1, ng0Var2.O);
                            } else {
                                PhotoViewer photoViewer4 = ng0Var2.S;
                                photoViewer4.Z3.startRewind(k71Var, z4, ng0Var2.d0[0], photoViewer4.q1, ng0Var2.O);
                            }
                            if (!ng0Var2.B) {
                                ng0Var2.B = true;
                                ng0Var2.y(true);
                                if (!ng0Var2.f0) {
                                    AndroidUtilities.runOnUIThread(ng0Var2.g0, 1500L);
                                    ng0Var2.f0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                ng0 ng0Var3 = this.b;
                PhotoViewer photoViewer5 = ng0Var3.S;
                if (photoViewer5 != null && photoViewer5.Z3.rewinding) {
                    AndroidUtilities.runOnUIThread(ng0Var3.g0, 1500L);
                    break;
                } else {
                    ng0Var3.B = false;
                    ng0Var3.y(false);
                    ng0Var3.f0 = false;
                    break;
                }
                break;
        }
    }
}

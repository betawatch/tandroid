package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh0 b;

    public /* synthetic */ bh0(gh0 gh0Var, int i10) {
        this.a = i10;
        this.b = gh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                gh0 gh0Var = this.b;
                PhotoViewer photoViewer = gh0Var.V;
                if (photoViewer != null) {
                    if (gh0Var.r != null) {
                        gh0Var.Z = r2.getCurrentPosition() / gh0Var.r.getVideoDuration();
                        gh0Var.a0 = gh0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = gh0Var.m();
                            gh0Var.Z = r1.n() / m10;
                            gh0Var.a0 = r1.j() / m10;
                        }
                    }
                    gh0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(gh0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                gh0 gh0Var2 = this.b;
                PhotoViewer photoViewer2 = gh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || gh0Var2.r != null) && !gh0Var2.c0 && !gh0Var2.Y && !gh0Var2.w && !gh0Var2.s.isInProgress() && gh0Var2.f0) {
                        k81 k81Var = gh0Var2.V.F2;
                        boolean z10 = gh0Var2.g0[0] >= (((float) gh0Var2.t()) * gh0Var2.J) * 0.5f;
                        long l4 = gh0Var2.l();
                        long m11 = gh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            sg0 sg0Var = gh0Var2.r;
                            if (sg0Var != null) {
                                PhotoViewer photoViewer3 = gh0Var2.V;
                                photoViewer3.c4.startRewind(sg0Var, z10, gh0Var2.g0[0], photoViewer3.t1, gh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = gh0Var2.V;
                                photoViewer4.c4.startRewind(k81Var, z10, gh0Var2.g0[0], photoViewer4.t1, gh0Var2.R);
                            }
                            if (!gh0Var2.E) {
                                gh0Var2.E = true;
                                gh0Var2.y(true);
                                if (!gh0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(gh0Var2.j0, 1500L);
                                    gh0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                gh0 gh0Var3 = this.b;
                PhotoViewer photoViewer5 = gh0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(gh0Var3.j0, 1500L);
                    break;
                } else {
                    gh0Var3.E = false;
                    gh0Var3.y(false);
                    gh0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

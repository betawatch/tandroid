package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;

    public /* synthetic */ eg0(lg0 lg0Var, int i10) {
        this.a = i10;
        this.b = lg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                lg0 lg0Var = this.b;
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null) {
                    if (lg0Var.r != null) {
                        lg0Var.W = r2.getCurrentPosition() / lg0Var.r.getVideoDuration();
                        lg0Var.X = lg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.C2 != null) {
                            float m9 = lg0Var.m();
                            lg0Var.W = r1.n() / m9;
                            lg0Var.X = r1.j() / m9;
                        }
                    }
                    lg0Var.Y.invalidate();
                    AndroidUtilities.runOnUIThread(lg0Var.b0, 500L);
                    break;
                }
                break;
            case 2:
                lg0 lg0Var2 = this.b;
                PhotoViewer photoViewer2 = lg0Var2.S;
                if (photoViewer2 != null) {
                    if ((photoViewer2.C2 != null || lg0Var2.r != null) && !lg0Var2.Z && !lg0Var2.V && !lg0Var2.w && !lg0Var2.s.isInProgress() && lg0Var2.c0) {
                        i71 i71Var = lg0Var2.S.C2;
                        boolean z4 = lg0Var2.d0[0] >= (((float) lg0Var2.t()) * lg0Var2.G) * 0.5f;
                        long l10 = lg0Var2.l();
                        long m10 = lg0Var2.m();
                        if (l10 != -9223372036854775807L && m10 >= 15000) {
                            vf0 vf0Var = lg0Var2.r;
                            if (vf0Var != null) {
                                PhotoViewer photoViewer3 = lg0Var2.S;
                                photoViewer3.Z3.startRewind(vf0Var, z4, lg0Var2.d0[0], photoViewer3.q1, lg0Var2.O);
                            } else {
                                PhotoViewer photoViewer4 = lg0Var2.S;
                                photoViewer4.Z3.startRewind(i71Var, z4, lg0Var2.d0[0], photoViewer4.q1, lg0Var2.O);
                            }
                            if (!lg0Var2.B) {
                                lg0Var2.B = true;
                                lg0Var2.y(true);
                                if (!lg0Var2.f0) {
                                    AndroidUtilities.runOnUIThread(lg0Var2.g0, 1500L);
                                    lg0Var2.f0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                lg0 lg0Var3 = this.b;
                PhotoViewer photoViewer5 = lg0Var3.S;
                if (photoViewer5 != null && photoViewer5.Z3.rewinding) {
                    AndroidUtilities.runOnUIThread(lg0Var3.g0, 1500L);
                    break;
                } else {
                    lg0Var3.B = false;
                    lg0Var3.y(false);
                    lg0Var3.f0 = false;
                    break;
                }
                break;
        }
    }
}

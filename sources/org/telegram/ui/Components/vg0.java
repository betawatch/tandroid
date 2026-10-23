package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ vg0(ah0 ah0Var, int i10) {
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                ah0 ah0Var = this.b;
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null) {
                    if (ah0Var.r != null) {
                        ah0Var.Z = r2.getCurrentPosition() / ah0Var.r.getVideoDuration();
                        ah0Var.a0 = ah0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = ah0Var.m();
                            ah0Var.Z = r1.n() / m10;
                            ah0Var.a0 = r1.j() / m10;
                        }
                    }
                    ah0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(ah0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                ah0 ah0Var2 = this.b;
                PhotoViewer photoViewer2 = ah0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ah0Var2.r != null) && !ah0Var2.c0 && !ah0Var2.Y && !ah0Var2.w && !ah0Var2.s.isInProgress() && ah0Var2.f0) {
                        c81 c81Var = ah0Var2.V.F2;
                        boolean z10 = ah0Var2.g0[0] >= (((float) ah0Var2.t()) * ah0Var2.J) * 0.5f;
                        long l4 = ah0Var2.l();
                        long m11 = ah0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            lg0 lg0Var = ah0Var2.r;
                            if (lg0Var != null) {
                                PhotoViewer photoViewer3 = ah0Var2.V;
                                photoViewer3.c4.startRewind(lg0Var, z10, ah0Var2.g0[0], photoViewer3.t1, ah0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ah0Var2.V;
                                photoViewer4.c4.startRewind(c81Var, z10, ah0Var2.g0[0], photoViewer4.t1, ah0Var2.R);
                            }
                            if (!ah0Var2.E) {
                                ah0Var2.E = true;
                                ah0Var2.y(true);
                                if (!ah0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(ah0Var2.j0, 1500L);
                                    ah0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                ah0 ah0Var3 = this.b;
                PhotoViewer photoViewer5 = ah0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ah0Var3.j0, 1500L);
                    break;
                } else {
                    ah0Var3.E = false;
                    ah0Var3.y(false);
                    ah0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

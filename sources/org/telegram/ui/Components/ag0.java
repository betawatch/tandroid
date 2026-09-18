package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ ag0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                fg0 fg0Var = this.b;
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null) {
                    if (fg0Var.r != null) {
                        fg0Var.Z = r2.getCurrentPosition() / fg0Var.r.getVideoDuration();
                        fg0Var.a0 = fg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = fg0Var.m();
                            fg0Var.Z = r1.n() / m10;
                            fg0Var.a0 = r1.j() / m10;
                        }
                    }
                    fg0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(fg0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                fg0 fg0Var2 = this.b;
                PhotoViewer photoViewer2 = fg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || fg0Var2.r != null) && !fg0Var2.c0 && !fg0Var2.Y && !fg0Var2.w && !fg0Var2.s.isInProgress() && fg0Var2.f0) {
                        h71 h71Var = fg0Var2.V.F2;
                        boolean z10 = fg0Var2.g0[0] >= (((float) fg0Var2.t()) * fg0Var2.J) * 0.5f;
                        long l4 = fg0Var2.l();
                        long m11 = fg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            qf0 qf0Var = fg0Var2.r;
                            if (qf0Var != null) {
                                PhotoViewer photoViewer3 = fg0Var2.V;
                                photoViewer3.c4.startRewind(qf0Var, z10, fg0Var2.g0[0], photoViewer3.t1, fg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = fg0Var2.V;
                                photoViewer4.c4.startRewind(h71Var, z10, fg0Var2.g0[0], photoViewer4.t1, fg0Var2.R);
                            }
                            if (!fg0Var2.E) {
                                fg0Var2.E = true;
                                fg0Var2.y(true);
                                if (!fg0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(fg0Var2.j0, 1500L);
                                    fg0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                fg0 fg0Var3 = this.b;
                PhotoViewer photoViewer5 = fg0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(fg0Var3.j0, 1500L);
                    break;
                } else {
                    fg0Var3.E = false;
                    fg0Var3.y(false);
                    fg0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

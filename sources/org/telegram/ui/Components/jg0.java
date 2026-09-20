package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ jg0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                og0 og0Var = this.b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    if (og0Var.r != null) {
                        og0Var.Z = r2.getCurrentPosition() / og0Var.r.getVideoDuration();
                        og0Var.a0 = og0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = og0Var.m();
                            og0Var.Z = r1.n() / m10;
                            og0Var.a0 = r1.j() / m10;
                        }
                    }
                    og0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(og0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                og0 og0Var2 = this.b;
                PhotoViewer photoViewer2 = og0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || og0Var2.r != null) && !og0Var2.c0 && !og0Var2.Y && !og0Var2.w && !og0Var2.s.isInProgress() && og0Var2.f0) {
                        t71 t71Var = og0Var2.V.F2;
                        boolean z10 = og0Var2.g0[0] >= (((float) og0Var2.t()) * og0Var2.J) * 0.5f;
                        long l4 = og0Var2.l();
                        long m11 = og0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            yf0 yf0Var = og0Var2.r;
                            if (yf0Var != null) {
                                PhotoViewer photoViewer3 = og0Var2.V;
                                photoViewer3.c4.startRewind(yf0Var, z10, og0Var2.g0[0], photoViewer3.t1, og0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = og0Var2.V;
                                photoViewer4.c4.startRewind(t71Var, z10, og0Var2.g0[0], photoViewer4.t1, og0Var2.R);
                            }
                            if (!og0Var2.E) {
                                og0Var2.E = true;
                                og0Var2.y(true);
                                if (!og0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(og0Var2.j0, 1500L);
                                    og0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                og0 og0Var3 = this.b;
                PhotoViewer photoViewer5 = og0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(og0Var3.j0, 1500L);
                    break;
                } else {
                    og0Var3.E = false;
                    og0Var3.y(false);
                    og0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

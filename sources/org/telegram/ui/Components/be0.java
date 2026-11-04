package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;

    public /* synthetic */ be0(ie0 ie0Var, int i3) {
        this.a = i3;
        this.b = ie0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                ie0 ie0Var = this.b;
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null) {
                    if (ie0Var.r != null) {
                        ie0Var.a0 = r2.getCurrentPosition() / ie0Var.r.getVideoDuration();
                        ie0Var.b0 = ie0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.G2 != null) {
                            float f10 = ie0Var.f();
                            ie0Var.a0 = r1.S() / f10;
                            ie0Var.b0 = r1.K() / f10;
                        }
                    }
                    ie0Var.c0.invalidate();
                    org.telegram.messenger.g0.i3(ie0Var.f0, 500L);
                    break;
                }
                break;
            case 2:
                ie0 ie0Var2 = this.b;
                PhotoViewer photoViewer2 = ie0Var2.W;
                if (photoViewer2 != null) {
                    if ((photoViewer2.G2 != null || ie0Var2.r != null) && !ie0Var2.d0 && !ie0Var2.Z && !ie0Var2.x && !ie0Var2.s.isInProgress() && ie0Var2.g0) {
                        m51 m51Var = ie0Var2.W.G2;
                        boolean z10 = ie0Var2.h0[0] >= (((float) ie0Var2.t()) * ie0Var2.K) * 0.5f;
                        long e10 = ie0Var2.e();
                        long f11 = ie0Var2.f();
                        if (e10 != -9223372036854775807L && f11 >= 15000) {
                            ud0 ud0Var = ie0Var2.r;
                            if (ud0Var != null) {
                                PhotoViewer photoViewer3 = ie0Var2.W;
                                photoViewer3.d4.startRewind(ud0Var, z10, ie0Var2.h0[0], photoViewer3.u1, ie0Var2.S);
                            } else {
                                PhotoViewer photoViewer4 = ie0Var2.W;
                                photoViewer4.d4.startRewind(m51Var, z10, ie0Var2.h0[0], photoViewer4.u1, ie0Var2.S);
                            }
                            if (!ie0Var2.F) {
                                ie0Var2.F = true;
                                ie0Var2.y(true);
                                if (!ie0Var2.j0) {
                                    org.telegram.messenger.g0.i3(ie0Var2.k0, 1500L);
                                    ie0Var2.j0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                ie0 ie0Var3 = this.b;
                PhotoViewer photoViewer5 = ie0Var3.W;
                if (photoViewer5 != null && photoViewer5.d4.rewinding) {
                    org.telegram.messenger.g0.i3(ie0Var3.k0, 1500L);
                    break;
                } else {
                    ie0Var3.F = false;
                    ie0Var3.y(false);
                    ie0Var3.j0 = false;
                    break;
                }
                break;
        }
    }
}

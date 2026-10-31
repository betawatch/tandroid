package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ cf0(jf0 jf0Var, int i10) {
        this.a = i10;
        this.b = jf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                jf0 jf0Var = this.b;
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null) {
                    if (jf0Var.r != null) {
                        jf0Var.Z = r2.getCurrentPosition() / jf0Var.r.getVideoDuration();
                        jf0Var.a0 = jf0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float f7 = jf0Var.f();
                            jf0Var.Z = r1.S() / f7;
                            jf0Var.a0 = r1.J() / f7;
                        }
                    }
                    jf0Var.b0.invalidate();
                    org.telegram.messenger.i0.h3(jf0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                jf0 jf0Var2 = this.b;
                PhotoViewer photoViewer2 = jf0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || jf0Var2.r != null) && !jf0Var2.c0 && !jf0Var2.Y && !jf0Var2.x && !jf0Var2.s.isInProgress() && jf0Var2.f0) {
                        u61 u61Var = jf0Var2.V.F2;
                        boolean z10 = jf0Var2.g0[0] >= (((float) jf0Var2.t()) * jf0Var2.J) * 0.5f;
                        long e = jf0Var2.e();
                        long f10 = jf0Var2.f();
                        if (e != -9223372036854775807L && f10 >= 15000) {
                            ve0 ve0Var = jf0Var2.r;
                            if (ve0Var != null) {
                                PhotoViewer photoViewer3 = jf0Var2.V;
                                photoViewer3.c4.startRewind(ve0Var, z10, jf0Var2.g0[0], photoViewer3.t1, jf0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = jf0Var2.V;
                                photoViewer4.c4.startRewind(u61Var, z10, jf0Var2.g0[0], photoViewer4.t1, jf0Var2.R);
                            }
                            if (!jf0Var2.E) {
                                jf0Var2.E = true;
                                jf0Var2.y(true);
                                if (!jf0Var2.i0) {
                                    org.telegram.messenger.i0.h3(jf0Var2.j0, 1500L);
                                    jf0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                jf0 jf0Var3 = this.b;
                PhotoViewer photoViewer5 = jf0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    org.telegram.messenger.i0.h3(jf0Var3.j0, 1500L);
                    break;
                } else {
                    jf0Var3.E = false;
                    jf0Var3.y(false);
                    jf0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

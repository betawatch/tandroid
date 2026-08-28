package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf0 b;

    public /* synthetic */ jf0(pf0 pf0Var, int i9) {
        this.a = i9;
        this.b = pf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                pf0 pf0Var = this.b;
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null) {
                    if (pf0Var.r != null) {
                        pf0Var.V = r2.getCurrentPosition() / pf0Var.r.getVideoDuration();
                        pf0Var.W = pf0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.B2 != null) {
                            float m10 = pf0Var.m();
                            pf0Var.V = r1.o() / m10;
                            pf0Var.W = r1.k() / m10;
                        }
                    }
                    pf0Var.X.invalidate();
                    AndroidUtilities.runOnUIThread(pf0Var.a0, 500L);
                    break;
                }
                break;
            case 2:
                pf0 pf0Var2 = this.b;
                PhotoViewer photoViewer2 = pf0Var2.R;
                if (photoViewer2 != null) {
                    if ((photoViewer2.B2 != null || pf0Var2.r != null) && !pf0Var2.Y && !pf0Var2.U && !pf0Var2.w && !pf0Var2.s.isInProgress() && pf0Var2.b0) {
                        k61 k61Var = pf0Var2.R.B2;
                        boolean z10 = pf0Var2.c0[0] >= (((float) pf0Var2.t()) * pf0Var2.F) * 0.5f;
                        long l10 = pf0Var2.l();
                        long m11 = pf0Var2.m();
                        if (l10 != -9223372036854775807L && m11 >= 15000) {
                            ze0 ze0Var = pf0Var2.r;
                            if (ze0Var != null) {
                                PhotoViewer photoViewer3 = pf0Var2.R;
                                photoViewer3.Y3.startRewind(ze0Var, z10, pf0Var2.c0[0], photoViewer3.p1, pf0Var2.N);
                            } else {
                                PhotoViewer photoViewer4 = pf0Var2.R;
                                photoViewer4.Y3.startRewind(k61Var, z10, pf0Var2.c0[0], photoViewer4.p1, pf0Var2.N);
                            }
                            if (!pf0Var2.A) {
                                pf0Var2.A = true;
                                pf0Var2.y(true);
                                if (!pf0Var2.e0) {
                                    AndroidUtilities.runOnUIThread(pf0Var2.f0, 1500L);
                                    pf0Var2.e0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                pf0 pf0Var3 = this.b;
                PhotoViewer photoViewer5 = pf0Var3.R;
                if (photoViewer5 != null && photoViewer5.Y3.rewinding) {
                    AndroidUtilities.runOnUIThread(pf0Var3.f0, 1500L);
                    break;
                } else {
                    pf0Var3.A = false;
                    pf0Var3.y(false);
                    pf0Var3.e0 = false;
                    break;
                }
                break;
        }
    }
}

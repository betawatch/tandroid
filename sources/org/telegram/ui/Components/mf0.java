package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;

    public /* synthetic */ mf0(sf0 sf0Var, int i10) {
        this.a = i10;
        this.b = sf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                sf0 sf0Var = this.b;
                PhotoViewer photoViewer = sf0Var.R;
                if (photoViewer != null) {
                    if (sf0Var.r != null) {
                        sf0Var.V = r2.getCurrentPosition() / sf0Var.r.getVideoDuration();
                        sf0Var.W = sf0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.B2 != null) {
                            float m10 = sf0Var.m();
                            sf0Var.V = r1.o() / m10;
                            sf0Var.W = r1.k() / m10;
                        }
                    }
                    sf0Var.X.invalidate();
                    AndroidUtilities.runOnUIThread(sf0Var.a0, 500L);
                    break;
                }
                break;
            case 2:
                sf0 sf0Var2 = this.b;
                PhotoViewer photoViewer2 = sf0Var2.R;
                if (photoViewer2 != null) {
                    if ((photoViewer2.B2 != null || sf0Var2.r != null) && !sf0Var2.Y && !sf0Var2.U && !sf0Var2.w && !sf0Var2.s.isInProgress() && sf0Var2.b0) {
                        m61 m61Var = sf0Var2.R.B2;
                        boolean z10 = sf0Var2.c0[0] >= (((float) sf0Var2.t()) * sf0Var2.F) * 0.5f;
                        long l10 = sf0Var2.l();
                        long m11 = sf0Var2.m();
                        if (l10 != -9223372036854775807L && m11 >= 15000) {
                            df0 df0Var = sf0Var2.r;
                            if (df0Var != null) {
                                PhotoViewer photoViewer3 = sf0Var2.R;
                                photoViewer3.Y3.startRewind(df0Var, z10, sf0Var2.c0[0], photoViewer3.p1, sf0Var2.N);
                            } else {
                                PhotoViewer photoViewer4 = sf0Var2.R;
                                photoViewer4.Y3.startRewind(m61Var, z10, sf0Var2.c0[0], photoViewer4.p1, sf0Var2.N);
                            }
                            if (!sf0Var2.A) {
                                sf0Var2.A = true;
                                sf0Var2.y(true);
                                if (!sf0Var2.e0) {
                                    AndroidUtilities.runOnUIThread(sf0Var2.f0, 1500L);
                                    sf0Var2.e0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sf0 sf0Var3 = this.b;
                PhotoViewer photoViewer5 = sf0Var3.R;
                if (photoViewer5 != null && photoViewer5.Y3.rewinding) {
                    AndroidUtilities.runOnUIThread(sf0Var3.f0, 1500L);
                    break;
                } else {
                    sf0Var3.A = false;
                    sf0Var3.y(false);
                    sf0Var3.e0 = false;
                    break;
                }
                break;
        }
    }
}

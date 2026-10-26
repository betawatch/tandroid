package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    public /* synthetic */ xg0(ch0 ch0Var, int i10) {
        this.a = i10;
        this.b = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                ch0 ch0Var = this.b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    if (ch0Var.r != null) {
                        ch0Var.Z = r2.getCurrentPosition() / ch0Var.r.getVideoDuration();
                        ch0Var.a0 = ch0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.F2 != null) {
                            float m10 = ch0Var.m();
                            ch0Var.Z = r1.n() / m10;
                            ch0Var.a0 = r1.j() / m10;
                        }
                    }
                    ch0Var.b0.invalidate();
                    AndroidUtilities.runOnUIThread(ch0Var.e0, 500L);
                    break;
                }
                break;
            case 2:
                ch0 ch0Var2 = this.b;
                PhotoViewer photoViewer2 = ch0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ch0Var2.r != null) && !ch0Var2.c0 && !ch0Var2.Y && !ch0Var2.w && !ch0Var2.s.isInProgress() && ch0Var2.f0) {
                        s81 s81Var = ch0Var2.V.F2;
                        boolean z10 = ch0Var2.g0[0] >= (((float) ch0Var2.t()) * ch0Var2.J) * 0.5f;
                        long l4 = ch0Var2.l();
                        long m11 = ch0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            mg0 mg0Var = ch0Var2.r;
                            if (mg0Var != null) {
                                PhotoViewer photoViewer3 = ch0Var2.V;
                                photoViewer3.c4.startRewind(mg0Var, z10, ch0Var2.g0[0], photoViewer3.t1, ch0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ch0Var2.V;
                                photoViewer4.c4.startRewind(s81Var, z10, ch0Var2.g0[0], photoViewer4.t1, ch0Var2.R);
                            }
                            if (!ch0Var2.E) {
                                ch0Var2.E = true;
                                ch0Var2.y(true);
                                if (!ch0Var2.i0) {
                                    AndroidUtilities.runOnUIThread(ch0Var2.j0, 1500L);
                                    ch0Var2.i0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                ch0 ch0Var3 = this.b;
                PhotoViewer photoViewer5 = ch0Var3.V;
                if (photoViewer5 != null && photoViewer5.c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ch0Var3.j0, 1500L);
                    break;
                } else {
                    ch0Var3.E = false;
                    ch0Var3.y(false);
                    ch0Var3.i0 = false;
                    break;
                }
                break;
        }
    }
}

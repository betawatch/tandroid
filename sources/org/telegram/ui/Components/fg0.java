package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ fg0(mg0 mg0Var, int i10) {
        this.a = i10;
        this.b = mg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                mg0 mg0Var = this.b;
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null) {
                    if (mg0Var.r != null) {
                        mg0Var.W = r2.getCurrentPosition() / mg0Var.r.getVideoDuration();
                        mg0Var.X = mg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.C2 != null) {
                            float m9 = mg0Var.m();
                            mg0Var.W = r1.n() / m9;
                            mg0Var.X = r1.j() / m9;
                        }
                    }
                    mg0Var.Y.invalidate();
                    AndroidUtilities.runOnUIThread(mg0Var.b0, 500L);
                    break;
                }
                break;
            case 2:
                mg0 mg0Var2 = this.b;
                PhotoViewer photoViewer2 = mg0Var2.S;
                if (photoViewer2 != null) {
                    if ((photoViewer2.C2 != null || mg0Var2.r != null) && !mg0Var2.Z && !mg0Var2.V && !mg0Var2.w && !mg0Var2.s.isInProgress() && mg0Var2.c0) {
                        i71 i71Var = mg0Var2.S.C2;
                        boolean z4 = mg0Var2.d0[0] >= (((float) mg0Var2.t()) * mg0Var2.G) * 0.5f;
                        long l10 = mg0Var2.l();
                        long m10 = mg0Var2.m();
                        if (l10 != -9223372036854775807L && m10 >= 15000) {
                            wf0 wf0Var = mg0Var2.r;
                            if (wf0Var != null) {
                                PhotoViewer photoViewer3 = mg0Var2.S;
                                photoViewer3.Z3.startRewind(wf0Var, z4, mg0Var2.d0[0], photoViewer3.q1, mg0Var2.O);
                            } else {
                                PhotoViewer photoViewer4 = mg0Var2.S;
                                photoViewer4.Z3.startRewind(i71Var, z4, mg0Var2.d0[0], photoViewer4.q1, mg0Var2.O);
                            }
                            if (!mg0Var2.B) {
                                mg0Var2.B = true;
                                mg0Var2.y(true);
                                if (!mg0Var2.f0) {
                                    AndroidUtilities.runOnUIThread(mg0Var2.g0, 1500L);
                                    mg0Var2.f0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                mg0 mg0Var3 = this.b;
                PhotoViewer photoViewer5 = mg0Var3.S;
                if (photoViewer5 != null && photoViewer5.Z3.rewinding) {
                    AndroidUtilities.runOnUIThread(mg0Var3.g0, 1500L);
                    break;
                } else {
                    mg0Var3.B = false;
                    mg0Var3.y(false);
                    mg0Var3.f0 = false;
                    break;
                }
                break;
        }
    }
}

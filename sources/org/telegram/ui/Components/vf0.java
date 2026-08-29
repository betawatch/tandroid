package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ vf0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u();
                break;
            case 1:
                bg0 bg0Var = this.b;
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null) {
                    if (bg0Var.r != null) {
                        bg0Var.V = r2.getCurrentPosition() / bg0Var.r.getVideoDuration();
                        bg0Var.W = bg0Var.r.getBufferedPosition();
                    } else {
                        if (photoViewer.B2 != null) {
                            float m10 = bg0Var.m();
                            bg0Var.V = r1.o() / m10;
                            bg0Var.W = r1.k() / m10;
                        }
                    }
                    bg0Var.X.invalidate();
                    AndroidUtilities.runOnUIThread(bg0Var.a0, 500L);
                    break;
                }
                break;
            case 2:
                bg0 bg0Var2 = this.b;
                PhotoViewer photoViewer2 = bg0Var2.R;
                if (photoViewer2 != null) {
                    if ((photoViewer2.B2 != null || bg0Var2.r != null) && !bg0Var2.Y && !bg0Var2.U && !bg0Var2.w && !bg0Var2.s.isInProgress() && bg0Var2.b0) {
                        x61 x61Var = bg0Var2.R.B2;
                        boolean z10 = bg0Var2.c0[0] >= (((float) bg0Var2.t()) * bg0Var2.F) * 0.5f;
                        long l10 = bg0Var2.l();
                        long m11 = bg0Var2.m();
                        if (l10 != -9223372036854775807L && m11 >= 15000) {
                            mf0 mf0Var = bg0Var2.r;
                            if (mf0Var != null) {
                                PhotoViewer photoViewer3 = bg0Var2.R;
                                photoViewer3.Y3.startRewind(mf0Var, z10, bg0Var2.c0[0], photoViewer3.p1, bg0Var2.N);
                            } else {
                                PhotoViewer photoViewer4 = bg0Var2.R;
                                photoViewer4.Y3.startRewind(x61Var, z10, bg0Var2.c0[0], photoViewer4.p1, bg0Var2.N);
                            }
                            if (!bg0Var2.A) {
                                bg0Var2.A = true;
                                bg0Var2.y(true);
                                if (!bg0Var2.e0) {
                                    AndroidUtilities.runOnUIThread(bg0Var2.f0, 1500L);
                                    bg0Var2.e0 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                bg0 bg0Var3 = this.b;
                PhotoViewer photoViewer5 = bg0Var3.R;
                if (photoViewer5 != null && photoViewer5.Y3.rewinding) {
                    AndroidUtilities.runOnUIThread(bg0Var3.f0, 1500L);
                    break;
                } else {
                    bg0Var3.A = false;
                    bg0Var3.y(false);
                    bg0Var3.e0 = false;
                    break;
                }
                break;
        }
    }
}

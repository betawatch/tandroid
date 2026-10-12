package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class at0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.y71, org.telegram.ui.Components.i81, org.telegram.ui.Components.sf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ at0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.es.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.sn0(10, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void b(float f7) {
        pu0 pu0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((pu0Var = photoViewer.f0) != null && pu0Var.x)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.t2((int) (f7 * r1));
            }
            photoViewer.b3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void c(float f7) {
        tt0 tt0Var;
        tt0 tt0Var2;
        PhotoViewer photoViewer = this.a;
        pu0 pu0Var = photoViewer.f0;
        if (pu0Var != null && pu0Var.x && (tt0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.j81.S;
            tt0Var2.N = pu0Var;
            if (tt0Var2.W != 0) {
                tt0Var2.W = 0L;
                tt0Var2.f0 = null;
                tt0Var2.e0 = null;
                tt0Var2.d0 = null;
                tt0Var2.b(-1);
            }
            if (i10 != 0) {
                tt0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (tt0Var2.n != i11) {
                    tt0Var2.n = i11;
                }
            }
            tt0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (pu0Var.getVideoDuration() * f7)) / 1000));
            tt0Var2.E = (int) Math.ceil(tt0Var2.F.measureText(r0));
            tt0Var2.invalidate();
            if (tt0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(tt0Var2.f);
            }
            double videoDuration = (f7 * pu0Var.getVideoDuration()) / 1000.0d;
            tt0Var2.O = videoDuration;
            String c10 = pu0Var.c((int) videoDuration);
            if (c10 != null) {
                tt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (tt0Var = photoViewer.s3) != null) {
            tt0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.j81.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
        if (h81Var == null) {
            return;
        }
        h81Var.K((long) (h81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        yk0 yk0Var = new yk0(this, 19);
        photoViewer.I2 = yk0Var;
        AndroidUtilities.runOnUIThread(yk0Var, 860L);
    }

    @Override // org.telegram.ui.Components.y71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

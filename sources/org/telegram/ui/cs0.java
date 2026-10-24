package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.a81, org.telegram.ui.Components.k81, org.telegram.ui.Components.qf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ cs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.k81
    public void a(float f7) {
        rt0 rt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((rt0Var = photoViewer.f0) != null && rt0Var.x)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.B1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.v2((int) (f7 * r1));
            }
            photoViewer.d3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.Components.k81
    public void b(float f7) {
        vs0 vs0Var;
        vs0 vs0Var2;
        PhotoViewer photoViewer = this.a;
        rt0 rt0Var = photoViewer.f0;
        if (rt0Var != null && rt0Var.x && (vs0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.l81.S;
            vs0Var2.N = rt0Var;
            if (vs0Var2.W != 0) {
                vs0Var2.W = 0L;
                vs0Var2.f0 = null;
                vs0Var2.e0 = null;
                vs0Var2.d0 = null;
                vs0Var2.b(-1);
            }
            if (i10 != 0) {
                vs0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (vs0Var2.n != i11) {
                    vs0Var2.n = i11;
                }
            }
            vs0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (rt0Var.getVideoDuration() * f7)) / 1000));
            vs0Var2.E = (int) Math.ceil(vs0Var2.F.measureText(r0));
            vs0Var2.invalidate();
            if (vs0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(vs0Var2.f);
            }
            double videoDuration = (f7 * rt0Var.getVideoDuration()) / 1000.0d;
            vs0Var2.O = videoDuration;
            String c10 = rt0Var.c((int) videoDuration);
            if (c10 != null) {
                vs0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (vs0Var = photoViewer.s3) != null) {
            vs0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.l81.S);
        }
        this.a.d3(true);
        PhotoViewer.Y(this.a);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    public void e(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.bs.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.b60(13, photoViewer, z11));
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        j81Var.K((long) (j81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.v0();
        oj0 oj0Var = new oj0(this, 20);
        photoViewer.I2 = oj0Var;
        AndroidUtilities.runOnUIThread(oj0Var, 860L);
    }

    @Override // org.telegram.ui.Components.a81
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

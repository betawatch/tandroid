package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.q71, org.telegram.ui.Components.b81, org.telegram.ui.Components.mf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ bs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.bs.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.b60(13, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.b81
    public void b(float f7) {
        qt0 qt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((qt0Var = photoViewer.f0) != null && qt0Var.x)) {
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

    @Override // org.telegram.ui.Components.b81
    public void c(float f7) {
        us0 us0Var;
        us0 us0Var2;
        PhotoViewer photoViewer = this.a;
        qt0 qt0Var = photoViewer.f0;
        if (qt0Var != null && qt0Var.x && (us0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.c81.S;
            us0Var2.N = qt0Var;
            if (us0Var2.W != 0) {
                us0Var2.W = 0L;
                us0Var2.f0 = null;
                us0Var2.e0 = null;
                us0Var2.d0 = null;
                us0Var2.b(-1);
            }
            if (i10 != 0) {
                us0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (us0Var2.n != i11) {
                    us0Var2.n = i11;
                }
            }
            us0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (qt0Var.getVideoDuration() * f7)) / 1000));
            us0Var2.E = (int) Math.ceil(us0Var2.F.measureText(r0));
            us0Var2.invalidate();
            if (us0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(us0Var2.f);
            }
            double videoDuration = (f7 * qt0Var.getVideoDuration()) / 1000.0d;
            us0Var2.O = videoDuration;
            String c10 = qt0Var.c((int) videoDuration);
            if (c10 != null) {
                us0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (us0Var = photoViewer.s3) != null) {
            us0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.c81.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    public void d() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.a81 a81Var = photoViewer.F2;
        if (a81Var == null) {
            return;
        }
        a81Var.K((long) (a81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        ek0 ek0Var = new ek0(this, 19);
        photoViewer.I2 = ek0Var;
        AndroidUtilities.runOnUIThread(ek0Var, 860L);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void f() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

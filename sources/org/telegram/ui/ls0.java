package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ls0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.j71, org.telegram.ui.Components.t71, org.telegram.ui.Components.df0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ ls0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.rr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.yr0(8, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.t71
    public void b(float f7) {
        au0 au0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((au0Var = photoViewer.f0) != null && au0Var.x)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.s2((int) (f7 * r1));
            }
            photoViewer.a3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override // org.telegram.ui.Components.t71
    public void d(float f7) {
        et0 et0Var;
        et0 et0Var2;
        PhotoViewer photoViewer = this.a;
        au0 au0Var = photoViewer.f0;
        if (au0Var != null && au0Var.x && (et0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.u71.S;
            et0Var2.N = au0Var;
            if (et0Var2.W != 0) {
                et0Var2.W = 0L;
                et0Var2.f0 = null;
                et0Var2.e0 = null;
                et0Var2.d0 = null;
                et0Var2.b(-1);
            }
            if (i10 != 0) {
                et0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (et0Var2.n != i11) {
                    et0Var2.n = i11;
                }
            }
            et0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (au0Var.getVideoDuration() * f7)) / 1000));
            et0Var2.E = (int) Math.ceil(et0Var2.F.measureText(r0));
            et0Var2.invalidate();
            if (et0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(et0Var2.f);
            }
            double videoDuration = (f7 * au0Var.getVideoDuration()) / 1000.0d;
            et0Var2.O = videoDuration;
            String c10 = au0Var.c((int) videoDuration);
            if (c10 != null) {
                et0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (et0Var = photoViewer.s3) != null) {
            et0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.u71.S);
        }
        this.a.a3(true);
        PhotoViewer.X(this.a);
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
        org.telegram.ui.Components.s71 s71Var = photoViewer.F2;
        if (s71Var == null) {
            return;
        }
        s71Var.K((long) (s71Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        il0 il0Var = new il0(this, 18);
        photoViewer.I2 = il0Var;
        AndroidUtilities.runOnUIThread(il0Var, 860L);
    }

    @Override // org.telegram.ui.Components.j71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

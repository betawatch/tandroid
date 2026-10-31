package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bq0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.l61, org.telegram.ui.Components.v61, org.telegram.ui.Components.ae0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ bq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void a() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.v2();
        }
    }

    public void b(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.gr.f).setDuration(150L).withEndAction(new k2.v(29, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void c(float f7) {
        mr0 mr0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((mr0Var = photoViewer.f0) != null && mr0Var.y)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.C1() == -9223372036854775807L) {
                photoViewer.a3 = f7;
            } else {
                photoViewer.w2((int) (f7 * r1));
            }
            photoViewer.e3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void d(float f7) {
        tq0 tq0Var;
        tq0 tq0Var2;
        PhotoViewer photoViewer = this.a;
        mr0 mr0Var = photoViewer.f0;
        if (mr0Var != null && mr0Var.y && (tq0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.w61.S;
            tq0Var2.N = mr0Var;
            if (tq0Var2.W != 0) {
                tq0Var2.W = 0L;
                tq0Var2.f0 = null;
                tq0Var2.e0 = null;
                tq0Var2.d0 = null;
                tq0Var2.b(-1);
            }
            if (i10 != 0) {
                tq0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (tq0Var2.n != i11) {
                    tq0Var2.n = i11;
                }
            }
            tq0Var2.D = org.telegram.messenger.i0.g0((int) (((long) (mr0Var.getVideoDuration() * f7)) / 1000), false, false);
            tq0Var2.E = (int) Math.ceil(tq0Var2.F.measureText(r0));
            tq0Var2.invalidate();
            if (tq0Var2.f != null) {
                Utilities.e.a(tq0Var2.f);
            }
            double videoDuration = (f7 * mr0Var.getVideoDuration()) / 1000.0d;
            tq0Var2.O = videoDuration;
            String c10 = mr0Var.c((int) videoDuration);
            if (c10 != null) {
                tq0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (tq0Var = photoViewer.s3) != null) {
            tq0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.w61.S);
        }
        this.a.e3(true);
        PhotoViewer.Y(this.a);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            org.telegram.messenger.i0.r(photoViewer.x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
        if (u61Var == null) {
            return;
        }
        u61Var.p0((long) (u61Var.U() * photoViewer.w8));
        photoViewer.F2.g0();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.v0();
        mg0 mg0Var = new mg0(this, 22);
        photoViewer.I2 = mg0Var;
        org.telegram.messenger.i0.h3(mg0Var, 860L);
    }

    @Override // org.telegram.ui.Components.l61
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

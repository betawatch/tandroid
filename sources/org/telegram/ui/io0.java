package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class io0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.c51, org.telegram.ui.Components.n51, org.telegram.ui.Components.zc0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ io0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z11) {
            photoViewer.W0.setClickable(z11);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            photoViewer.W0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.xq.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.up0(10, photoViewer, z11));
        }
    }

    public void b() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        if (m51Var == null) {
            return;
        }
        m51Var.p0((long) (m51Var.U() * photoViewer.x8));
        photoViewer.G2.g0();
        photoViewer.T7.setProgress(photoViewer.x8);
        photoViewer.v0();
        sg0 sg0Var = new sg0(this, 21);
        photoViewer.J2 = sg0Var;
        org.telegram.messenger.g0.i3(sg0Var, 860L);
    }

    @Override // org.telegram.ui.Components.n51
    public void c(float f10) {
        tp0 tp0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G2 != null || ((tp0Var = photoViewer.g0) != null && tp0Var.y)) {
            if (!photoViewer.C8 && photoViewer.S7.getVisibility() == 0) {
                f10 = ((photoViewer.T7.getRightProgress() - photoViewer.T7.getLeftProgress()) * f10) + photoViewer.T7.getLeftProgress();
            }
            if (photoViewer.C1() == -9223372036854775807L) {
                photoViewer.b3 = f10;
            } else {
                photoViewer.w2((int) (f10 * r1));
            }
            photoViewer.e3(false);
            photoViewer.v3 = false;
        }
    }

    @Override // org.telegram.ui.Components.n51
    public void d(float f10) {
        ap0 ap0Var;
        ap0 ap0Var2;
        PhotoViewer photoViewer = this.a;
        tp0 tp0Var = photoViewer.g0;
        if (tp0Var != null && tp0Var.y && (ap0Var2 = photoViewer.t3) != null) {
            int i3 = photoViewer.r3.h - org.telegram.ui.Components.o51.S;
            ap0Var2.O = tp0Var;
            if (ap0Var2.a0 != 0) {
                ap0Var2.a0 = 0L;
                ap0Var2.g0 = null;
                ap0Var2.f0 = null;
                ap0Var2.e0 = null;
                ap0Var2.b(-1);
            }
            if (i3 != 0) {
                ap0Var2.r = i3;
                int i10 = ((int) (i3 * f10)) / 5;
                if (ap0Var2.n != i10) {
                    ap0Var2.n = i10;
                }
            }
            ap0Var2.E = org.telegram.messenger.g0.g0((int) (((long) (tp0Var.getVideoDuration() * f10)) / 1000), false, false);
            ap0Var2.F = (int) Math.ceil(ap0Var2.G.measureText(r0));
            ap0Var2.invalidate();
            if (ap0Var2.f != null) {
                Utilities.e.a(ap0Var2.f);
            }
            double videoDuration = (f10 * tp0Var.getVideoDuration()) / 1000.0d;
            ap0Var2.P = videoDuration;
            String c2 = tp0Var.c((int) videoDuration);
            if (c2 != null) {
                ap0Var2.R.o0(c2, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (ap0Var = photoViewer.t3) != null) {
            ap0Var.e(photoViewer.U4, f10, photoViewer.r3.h - org.telegram.ui.Components.o51.S);
        }
        this.a.e3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.m3 && photoViewer.Q3) {
            photoViewer.v2();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void g() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.m3 && photoViewer.Q3) {
            org.telegram.messenger.g0.r(photoViewer.y2);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public void invalidate() {
        this.a.f0.invalidate();
    }
}

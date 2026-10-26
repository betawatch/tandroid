package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gs0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.i81, org.telegram.ui.Components.t81, org.telegram.ui.Components.nf0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ gs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void a() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    @Override // org.telegram.ui.Components.t81
    public void c(float f7) {
        vt0 vt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((vt0Var = photoViewer.f0) != null && vt0Var.x)) {
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

    public void d(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.ds.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.d60(14, photoViewer, z11));
        }
    }

    public void e() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
        if (s81Var == null) {
            return;
        }
        s81Var.K((long) (s81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.v0();
        lj0 lj0Var = new lj0(this, 21);
        photoViewer.I2 = lj0Var;
        AndroidUtilities.runOnUIThread(lj0Var, 860L);
    }

    @Override // org.telegram.ui.Components.t81
    public void f(float f7) {
        zs0 zs0Var;
        zs0 zs0Var2;
        PhotoViewer photoViewer = this.a;
        vt0 vt0Var = photoViewer.f0;
        if (vt0Var != null && vt0Var.x && (zs0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.u81.S;
            zs0Var2.N = vt0Var;
            if (zs0Var2.W != 0) {
                zs0Var2.W = 0L;
                zs0Var2.f0 = null;
                zs0Var2.e0 = null;
                zs0Var2.d0 = null;
                zs0Var2.b(-1);
            }
            if (i10 != 0) {
                zs0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (zs0Var2.n != i11) {
                    zs0Var2.n = i11;
                }
            }
            zs0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (vt0Var.getVideoDuration() * f7)) / 1000));
            zs0Var2.E = (int) Math.ceil(zs0Var2.F.measureText(r0));
            zs0Var2.invalidate();
            if (zs0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(zs0Var2.f);
            }
            double videoDuration = (f7 * vt0Var.getVideoDuration()) / 1000.0d;
            zs0Var2.O = videoDuration;
            String c10 = vt0Var.c((int) videoDuration);
            if (c10 != null) {
                zs0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (zs0Var = photoViewer.s3) != null) {
            zs0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.u81.S);
        }
        this.a.d3(true);
        PhotoViewer.Y(this.a);
    }

    @Override // org.telegram.ui.Components.i81
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

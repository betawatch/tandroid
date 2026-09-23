package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ms0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.u61, org.telegram.ui.Components.g71, org.telegram.ui.Components.te0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ ms0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.rr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.sr0(7, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void b(float f7) {
        bu0 bu0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((bu0Var = photoViewer.f0) != null && bu0Var.x)) {
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

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void d(float f7) {
        ft0 ft0Var;
        ft0 ft0Var2;
        PhotoViewer photoViewer = this.a;
        bu0 bu0Var = photoViewer.f0;
        if (bu0Var != null && bu0Var.x && (ft0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.h71.S;
            ft0Var2.N = bu0Var;
            if (ft0Var2.W != 0) {
                ft0Var2.W = 0L;
                ft0Var2.f0 = null;
                ft0Var2.e0 = null;
                ft0Var2.d0 = null;
                ft0Var2.b(-1);
            }
            if (i10 != 0) {
                ft0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ft0Var2.n != i11) {
                    ft0Var2.n = i11;
                }
            }
            ft0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (bu0Var.getVideoDuration() * f7)) / 1000));
            ft0Var2.E = (int) Math.ceil(ft0Var2.F.measureText(r0));
            ft0Var2.invalidate();
            if (ft0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ft0Var2.f);
            }
            double videoDuration = (f7 * bu0Var.getVideoDuration()) / 1000.0d;
            ft0Var2.O = videoDuration;
            String c10 = bu0Var.c((int) videoDuration);
            if (c10 != null) {
                ft0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ft0Var = photoViewer.s3) != null) {
            ft0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.h71.S);
        }
        this.a.a3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
        if (f71Var == null) {
            return;
        }
        f71Var.K((long) (f71Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        jl0 jl0Var = new jl0(this, 18);
        photoViewer.I2 = jl0Var;
        AndroidUtilities.runOnUIThread(jl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.u61
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

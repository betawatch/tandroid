package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class is0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.j81, org.telegram.ui.Components.u81, org.telegram.ui.Components.of0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ is0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void a() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.v2();
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
    }

    @Override // org.telegram.ui.Components.u81
    public void c(float f7) {
        xt0 xt0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((xt0Var = photoViewer.f0) != null && xt0Var.x)) {
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
        org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
        if (t81Var == null) {
            return;
        }
        t81Var.K((long) (t81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.v0();
        nj0 nj0Var = new nj0(this, 21);
        photoViewer.I2 = nj0Var;
        AndroidUtilities.runOnUIThread(nj0Var, 860L);
    }

    @Override // org.telegram.ui.Components.u81
    public void f(float f7) {
        bt0 bt0Var;
        bt0 bt0Var2;
        PhotoViewer photoViewer = this.a;
        xt0 xt0Var = photoViewer.f0;
        if (xt0Var != null && xt0Var.x && (bt0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.v81.S;
            bt0Var2.N = xt0Var;
            if (bt0Var2.W != 0) {
                bt0Var2.W = 0L;
                bt0Var2.f0 = null;
                bt0Var2.e0 = null;
                bt0Var2.d0 = null;
                bt0Var2.b(-1);
            }
            if (i10 != 0) {
                bt0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (bt0Var2.n != i11) {
                    bt0Var2.n = i11;
                }
            }
            bt0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (xt0Var.getVideoDuration() * f7)) / 1000));
            bt0Var2.E = (int) Math.ceil(bt0Var2.F.measureText(r0));
            bt0Var2.invalidate();
            if (bt0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(bt0Var2.f);
            }
            double videoDuration = (f7 * xt0Var.getVideoDuration()) / 1000.0d;
            bt0Var2.O = videoDuration;
            String c10 = xt0Var.c((int) videoDuration);
            if (c10 != null) {
                bt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (bt0Var = photoViewer.s3) != null) {
            bt0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.v81.S);
        }
        this.a.e3(true);
        PhotoViewer.Y(this.a);
    }

    @Override // org.telegram.ui.Components.j81
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

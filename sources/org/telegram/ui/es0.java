package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class es0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.y61, org.telegram.ui.Components.k71, org.telegram.ui.Components.ze0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ es0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z4) {
        boolean z10 = !z4;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.S0.isClickable() != z10) {
            photoViewer.S0.setClickable(z10);
            photoViewer.S0.setVisibility(0);
            photoViewer.S0.clearAnimation();
            photoViewer.S0.animate().alpha(!z4 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.pr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.qv0(5, photoViewer, z10));
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void b(float f10) {
        ut0 ut0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.C2 != null || ((ut0Var = photoViewer.c0) != null && ut0Var.x)) {
            if (!photoViewer.x8 && photoViewer.N7.getVisibility() == 0) {
                f10 = ((photoViewer.O7.getRightProgress() - photoViewer.O7.getLeftProgress()) * f10) + photoViewer.O7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.X2 = f10;
            } else {
                photoViewer.t2((int) (f10 * r1));
            }
            photoViewer.b3(false);
            photoViewer.r3 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.i3 && photoViewer.M3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void d(float f10) {
        ys0 ys0Var;
        ys0 ys0Var2;
        PhotoViewer photoViewer = this.a;
        ut0 ut0Var = photoViewer.c0;
        if (ut0Var != null && ut0Var.x && (ys0Var2 = photoViewer.p3) != null) {
            int i10 = photoViewer.n3.h - org.telegram.ui.Components.l71.S;
            ys0Var2.K = ut0Var;
            if (ys0Var2.T != 0) {
                ys0Var2.T = 0L;
                ys0Var2.c0 = null;
                ys0Var2.b0 = null;
                ys0Var2.a0 = null;
                ys0Var2.b(-1);
            }
            if (i10 != 0) {
                ys0Var2.r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (ys0Var2.n != i11) {
                    ys0Var2.n = i11;
                }
            }
            ys0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (ut0Var.getVideoDuration() * f10)) / 1000));
            ys0Var2.B = (int) Math.ceil(ys0Var2.C.measureText(r0));
            ys0Var2.invalidate();
            if (ys0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ys0Var2.f);
            }
            double videoDuration = (f10 * ut0Var.getVideoDuration()) / 1000.0d;
            ys0Var2.L = videoDuration;
            String c3 = ut0Var.c((int) videoDuration);
            if (c3 != null) {
                ys0Var2.N.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.C2 != null && (ys0Var = photoViewer.p3) != null) {
            ys0Var.e(photoViewer.Q4, f10, photoViewer.n3.h - org.telegram.ui.Components.l71.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.i3 && photoViewer.M3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.u2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
        if (j71Var == null) {
            return;
        }
        j71Var.K((long) (j71Var.p() * photoViewer.s8));
        photoViewer.C2.B();
        photoViewer.O7.setProgress(photoViewer.s8);
        photoViewer.u0();
        gl0 gl0Var = new gl0(this, 18);
        photoViewer.F2 = gl0Var;
        AndroidUtilities.runOnUIThread(gl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.y61
    public void invalidate() {
        this.a.b0.invalidate();
    }
}

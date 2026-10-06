package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class os0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.v71, org.telegram.ui.Components.f81, org.telegram.ui.Components.ff0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ os0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.tr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.fs0(8, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.Components.f81
    public void b(float f7) {
        du0 du0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((du0Var = photoViewer.f0) != null && du0Var.x)) {
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

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.Components.f81
    public void d(float f7) {
        ht0 ht0Var;
        ht0 ht0Var2;
        PhotoViewer photoViewer = this.a;
        du0 du0Var = photoViewer.f0;
        if (du0Var != null && du0Var.x && (ht0Var2 = photoViewer.s3) != null) {
            int i10 = photoViewer.q3.h - org.telegram.ui.Components.g81.S;
            ht0Var2.N = du0Var;
            if (ht0Var2.W != 0) {
                ht0Var2.W = 0L;
                ht0Var2.f0 = null;
                ht0Var2.e0 = null;
                ht0Var2.d0 = null;
                ht0Var2.b(-1);
            }
            if (i10 != 0) {
                ht0Var2.r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ht0Var2.n != i11) {
                    ht0Var2.n = i11;
                }
            }
            ht0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (du0Var.getVideoDuration() * f7)) / 1000));
            ht0Var2.E = (int) Math.ceil(ht0Var2.F.measureText(r0));
            ht0Var2.invalidate();
            if (ht0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(ht0Var2.f);
            }
            double videoDuration = (f7 * du0Var.getVideoDuration()) / 1000.0d;
            ht0Var2.O = videoDuration;
            String c10 = du0Var.c((int) videoDuration);
            if (c10 != null) {
                ht0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ht0Var = photoViewer.s3) != null) {
            ht0Var.e(photoViewer.T4, f7, photoViewer.q3.h - org.telegram.ui.Components.g81.S);
        }
        this.a.b3(true);
        PhotoViewer.W(this.a);
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
        org.telegram.ui.Components.e81 e81Var = photoViewer.F2;
        if (e81Var == null) {
            return;
        }
        e81Var.K((long) (e81Var.p() * photoViewer.w8));
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.u0();
        nl0 nl0Var = new nl0(this, 19);
        photoViewer.I2 = nl0Var;
        AndroidUtilities.runOnUIThread(nl0Var, 860L);
    }

    @Override // org.telegram.ui.Components.v71
    public void invalidate() {
        this.a.e0.invalidate();
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.m61, org.telegram.ui.Components.y61, org.telegram.ui.Components.oe0 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ pr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.R0.isClickable() != z11) {
            photoViewer.R0.setClickable(z11);
            photoViewer.R0.setVisibility(0);
            photoViewer.R0.clearAnimation();
            photoViewer.R0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.jr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.p90(11, photoViewer, z11));
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.h3 && photoViewer.L3) {
            photoViewer.s2();
        }
    }

    @Override // org.telegram.ui.Components.y61
    public void c(float f9) {
        et0 et0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.B2 != null || ((et0Var = photoViewer.b0) != null && et0Var.x)) {
            if (!photoViewer.w8 && photoViewer.M7.getVisibility() == 0) {
                f9 = ((photoViewer.N7.getRightProgress() - photoViewer.N7.getLeftProgress()) * f9) + photoViewer.N7.getLeftProgress();
            }
            if (photoViewer.A1() == -9223372036854775807L) {
                photoViewer.W2 = f9;
            } else {
                photoViewer.t2((int) (f9 * r1));
            }
            photoViewer.b3(false);
            photoViewer.q3 = false;
        }
    }

    @Override // org.telegram.ui.Components.y61
    public void d(float f9) {
        is0 is0Var;
        is0 is0Var2;
        PhotoViewer photoViewer = this.a;
        et0 et0Var = photoViewer.b0;
        if (et0Var != null && et0Var.x && (is0Var2 = photoViewer.o3) != null) {
            int i10 = photoViewer.m3.h - org.telegram.ui.Components.z61.S;
            is0Var2.J = et0Var;
            if (is0Var2.S != 0) {
                is0Var2.S = 0L;
                is0Var2.b0 = null;
                is0Var2.a0 = null;
                is0Var2.W = null;
                is0Var2.b(-1);
            }
            if (i10 != 0) {
                is0Var2.r = i10;
                int i11 = ((int) (i10 * f9)) / 5;
                if (is0Var2.n != i11) {
                    is0Var2.n = i11;
                }
            }
            is0Var2.y = AndroidUtilities.formatShortDuration((int) (((long) (et0Var.getVideoDuration() * f9)) / 1000));
            is0Var2.A = (int) Math.ceil(is0Var2.B.measureText(r0));
            is0Var2.invalidate();
            if (is0Var2.f != null) {
                Utilities.globalQueue.cancelRunnable(is0Var2.f);
            }
            double videoDuration = (f9 * et0Var.getVideoDuration()) / 1000.0d;
            is0Var2.K = videoDuration;
            String c3 = et0Var.c((int) videoDuration);
            if (c3 != null) {
                is0Var2.M.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.B2 != null && (is0Var = photoViewer.o3) != null) {
            is0Var.e(photoViewer.P4, f9, photoViewer.m3.h - org.telegram.ui.Components.z61.S);
        }
        this.a.b3(true);
        PhotoViewer.X(this.a);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.h3 && photoViewer.L3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.t2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        if (x61Var == null) {
            return;
        }
        x61Var.L((long) (x61Var.q() * photoViewer.r8));
        photoViewer.B2.C();
        photoViewer.N7.setProgress(photoViewer.r8);
        photoViewer.u0();
        vk0 vk0Var = new vk0(this, 19);
        photoViewer.E2 = vk0Var;
        AndroidUtilities.runOnUIThread(vk0Var, 860L);
    }

    @Override // org.telegram.ui.Components.m61
    public void invalidate() {
        this.a.a0.invalidate();
    }
}

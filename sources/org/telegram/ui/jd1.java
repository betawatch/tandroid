package org.telegram.ui;

import android.animation.ValueAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class jd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ vd1 a;

    public jd1(vd1 vd1Var) {
        this.a = vd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        int i11;
        vd1 vd1Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = vd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (vd1Var.Q0(true)) {
                vd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            vd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (vd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = vd1Var.W0;
            g6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            g6Var.p = vd1Var.l1;
            g6Var.q = vd1Var.E1;
            if (((int) g6Var.j) == 0) {
                g6Var.j = 4294967296L;
            }
            if (((int) g6Var.k) == 0) {
                g6Var.k = 4294967296L;
            }
            if (((int) g6Var.l) == 0) {
                g6Var.l = 4294967296L;
            }
            if (((int) g6Var.m) == 0) {
                g6Var.m = 4294967296L;
            }
            vd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(vd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(vd1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vd1Var.e0, Boolean.valueOf(vd1Var.f0), null, -1);
            vd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (vd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (vd1Var.F1) {
                sb2.append("blur");
            }
            if (vd1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = vd1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) vd1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder j3 = t8.b.j(b10, "?mode=");
                    j3.append(sb2.toString());
                    b10 = j3.toString();
                }
            } else if (obj instanceof ej1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = vd1Var.W0;
                ej1 ej1Var = new ej1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", vd1Var.Z0, vd1Var.b1, vd1Var.c1, vd1Var.d1, vd1Var.h1, vd1Var.l1, vd1Var.E1, null);
                ej1Var.g = tL_wallPaper2;
                b10 = ej1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) == null) {
                    return;
                }
                ej1 ej1Var2 = new ej1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = vd1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) vd1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        ej1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = ej1Var2.b();
            }
            vd1Var.showDialog(new hd1(this, vd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = vd1Var.B1;
                if (!(obj2 instanceof fj1) || (file = ((fj1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(vd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new id1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = vd1Var.p1.a();
        md1 md1Var = vd1Var.p1;
        if (md1Var != null) {
            if (!md1Var.Y0()) {
                vd1Var.g1();
                return;
            }
            vd1Var.p1.o1(true);
            org.telegram.ui.Components.ij0 ij0Var = vd1Var.N1;
            ij0Var.h = true;
            if (a2) {
                ij0Var.P(0);
            } else {
                ij0Var.P(36);
            }
            vd1Var.N1.start();
            if (vd1Var.M1) {
                md1 md1Var2 = vd1Var.p1;
                if (md1Var2 == null || !md1Var2.a()) {
                    vd1Var.R1.a(0.0f);
                } else {
                    vd1Var.R1.setVisibility(0);
                    vd1Var.R1.a(vd1Var.n1);
                }
                ValueAnimator valueAnimator = vd1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    vd1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(vd1Var.o1, vd1Var.p1.a() ? 1.0f : 0.0f);
                vd1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new i21(this, 13));
                vd1Var.P1.addListener(new gp0(this, 23));
                vd1Var.P1.setDuration(250L);
                vd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f);
                vd1Var.P1.start();
            }
        }
    }
}

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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wd1 a;

    public kd1(wd1 wd1Var) {
        this.a = wd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        int i11;
        wd1 wd1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (wd1Var.Q0(true)) {
                wd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            wd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (wd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = wd1Var.W0;
            h6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            h6Var.p = wd1Var.l1;
            h6Var.q = wd1Var.E1;
            if (((int) h6Var.j) == 0) {
                h6Var.j = 4294967296L;
            }
            if (((int) h6Var.k) == 0) {
                h6Var.k = 4294967296L;
            }
            if (((int) h6Var.l) == 0) {
                h6Var.l = 4294967296L;
            }
            if (((int) h6Var.m) == 0) {
                h6Var.m = 4294967296L;
            }
            wd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(wd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(wd1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.e0, Boolean.valueOf(wd1Var.f0), null, -1);
            wd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (wd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (wd1Var.F1) {
                sb2.append("blur");
            }
            if (wd1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = wd1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) wd1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder g10 = w.f.g(b10, "?mode=");
                    g10.append(sb2.toString());
                    b10 = g10.toString();
                }
            } else if (obj instanceof gj1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = wd1Var.W0;
                gj1 gj1Var = new gj1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", wd1Var.Z0, wd1Var.b1, wd1Var.c1, wd1Var.d1, wd1Var.h1, wd1Var.l1, wd1Var.E1, null);
                gj1Var.g = tL_wallPaper2;
                b10 = gj1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) == null) {
                    return;
                }
                gj1 gj1Var2 = new gj1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = wd1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) wd1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        gj1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = gj1Var2.b();
            }
            wd1Var.showDialog(new id1(this, wd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = wd1Var.B1;
                if (!(obj2 instanceof hj1) || (file = ((hj1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(wd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new jd1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = wd1Var.p1.a();
        nd1 nd1Var = wd1Var.p1;
        if (nd1Var != null) {
            if (!nd1Var.Z0()) {
                wd1Var.g1();
                return;
            }
            wd1Var.p1.p1(true);
            org.telegram.ui.Components.xi0 xi0Var = wd1Var.N1;
            xi0Var.h = true;
            if (a2) {
                xi0Var.N(0);
            } else {
                xi0Var.N(36);
            }
            wd1Var.N1.start();
            if (wd1Var.M1) {
                nd1 nd1Var2 = wd1Var.p1;
                if (nd1Var2 == null || !nd1Var2.a()) {
                    wd1Var.R1.a(0.0f);
                } else {
                    wd1Var.R1.setVisibility(0);
                    wd1Var.R1.a(wd1Var.n1);
                }
                ValueAnimator valueAnimator = wd1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    wd1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(wd1Var.o1, wd1Var.p1.a() ? 1.0f : 0.0f);
                wd1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new b21(this, 14));
                wd1Var.P1.addListener(new gk0(this, 25));
                wd1Var.P1.setDuration(250L);
                wd1Var.P1.setInterpolator(org.telegram.ui.Components.pr.f);
                wd1Var.P1.start();
            }
        }
    }
}

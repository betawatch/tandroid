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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wd1 a;

    public kd1(wd1 wd1Var) {
        this.a = wd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        int i11;
        wd1 wd1Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = wd1Var.s;
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
                org.telegram.ui.ActionBar.i6.p1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = wd1Var.W0;
            g6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            g6Var.p = wd1Var.l1;
            g6Var.q = wd1Var.E1;
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
            wd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(wd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(wd1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
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
                    StringBuilder h = w.c.h(b10, "?mode=");
                    h.append(sb2.toString());
                    b10 = h.toString();
                }
            } else if (obj instanceof gj1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = wd1Var.W0;
                gj1 gj1Var = new gj1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", wd1Var.Z0, wd1Var.b1, wd1Var.c1, wd1Var.d1, wd1Var.h1, wd1Var.l1, wd1Var.E1, null);
                gj1Var.g = tL_wallPaper2;
                b10 = gj1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) == null) {
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
                PhotoViewer.t1().J2(wd1Var.getParentActivity(), null, null);
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
            if (!nd1Var.Y0()) {
                wd1Var.g1();
                return;
            }
            wd1Var.p1.o1(true);
            org.telegram.ui.Components.xi0 xi0Var = wd1Var.N1;
            xi0Var.h = true;
            if (a2) {
                xi0Var.P(0);
            } else {
                xi0Var.P(36);
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
                ofFloat.addUpdateListener(new a21(this, 14));
                wd1Var.P1.addListener(new cr0(this, 22));
                wd1Var.P1.setDuration(250L);
                wd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f);
                wd1Var.P1.start();
            }
        }
    }
}

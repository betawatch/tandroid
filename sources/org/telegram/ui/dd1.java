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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class dd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pd1 a;

    public dd1(pd1 pd1Var) {
        this.a = pd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        int i11;
        pd1 pd1Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = pd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (pd1Var.Q0(true)) {
                pd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            pd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (pd1Var.v) {
                org.telegram.ui.ActionBar.i6.p1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = pd1Var.W0;
            f6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            f6Var.p = pd1Var.l1;
            f6Var.q = pd1Var.E1;
            if (((int) f6Var.j) == 0) {
                f6Var.j = 4294967296L;
            }
            if (((int) f6Var.k) == 0) {
                f6Var.k = 4294967296L;
            }
            if (((int) f6Var.l) == 0) {
                f6Var.l = 4294967296L;
            }
            if (((int) f6Var.m) == 0) {
                f6Var.m = 4294967296L;
            }
            pd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(pd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(pd1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, pd1Var.e0, Boolean.valueOf(pd1Var.f0), null, -1);
            pd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (pd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (pd1Var.F1) {
                sb2.append("blur");
            }
            if (pd1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = pd1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder j3 = sa.e.j(b10, "?mode=");
                    j3.append(sb2.toString());
                    b10 = j3.toString();
                }
            } else if (obj instanceof wi1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = pd1Var.W0;
                wi1 wi1Var = new wi1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", pd1Var.Z0, pd1Var.b1, pd1Var.c1, pd1Var.d1, pd1Var.h1, pd1Var.l1, pd1Var.E1, null);
                wi1Var.g = tL_wallPaper2;
                b10 = wi1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) == null) {
                    return;
                }
                wi1 wi1Var2 = new wi1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = pd1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) pd1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        wi1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = wi1Var2.b();
            }
            pd1Var.showDialog(new bd1(this, pd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = pd1Var.B1;
                if (!(obj2 instanceof xi1) || (file = ((xi1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(pd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new cd1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = pd1Var.p1.a();
        gd1 gd1Var = pd1Var.p1;
        if (gd1Var != null) {
            if (!gd1Var.a1()) {
                pd1Var.g1();
                return;
            }
            pd1Var.p1.q1(true);
            org.telegram.ui.Components.kj0 kj0Var = pd1Var.N1;
            kj0Var.h = true;
            if (a2) {
                kj0Var.P(0);
            } else {
                kj0Var.P(36);
            }
            pd1Var.N1.start();
            if (pd1Var.M1) {
                gd1 gd1Var2 = pd1Var.p1;
                if (gd1Var2 == null || !gd1Var2.a()) {
                    pd1Var.R1.a(0.0f);
                } else {
                    pd1Var.R1.setVisibility(0);
                    pd1Var.R1.a(pd1Var.n1);
                }
                ValueAnimator valueAnimator = pd1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    pd1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pd1Var.o1, pd1Var.p1.a() ? 1.0f : 0.0f);
                pd1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new b21(this, 13));
                pd1Var.P1.addListener(new ap0(this, 23));
                pd1Var.P1.setDuration(250L);
                pd1Var.P1.setInterpolator(org.telegram.ui.Components.tr.f);
                pd1Var.P1.start();
            }
        }
    }
}

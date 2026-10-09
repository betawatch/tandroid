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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ld1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ xd1 a;

    public ld1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.g6 k10;
        String b10;
        int i11;
        xd1 xd1Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (xd1Var.Q0(true)) {
                xd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            xd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (xd1Var.v) {
                org.telegram.ui.ActionBar.i6.q1(false);
            }
            File d = g6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = xd1Var.W0;
            g6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            g6Var.p = xd1Var.l1;
            g6Var.q = xd1Var.E1;
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
            xd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(xd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.u1(xd1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.e0, Boolean.valueOf(xd1Var.f0), null, -1);
            xd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (xd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (xd1Var.F1) {
                sb2.append("blur");
            }
            if (xd1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = xd1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder j3 = sc.v.j(b10, "?mode=");
                    j3.append(sb2.toString());
                    b10 = j3.toString();
                }
            } else if (obj instanceof ij1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = xd1Var.W0;
                ij1 ij1Var = new ij1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", xd1Var.Z0, xd1Var.b1, xd1Var.c1, xd1Var.d1, xd1Var.h1, xd1Var.l1, xd1Var.E1, null);
                ij1Var.g = tL_wallPaper2;
                b10 = ij1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) == null) {
                    return;
                }
                ij1 ij1Var2 = new ij1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = xd1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) xd1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        ij1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = ij1Var2.b();
            }
            xd1Var.showDialog(new jd1(this, xd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = xd1Var.B1;
                if (!(obj2 instanceof jj1) || (file = ((jj1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(xd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new kd1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = xd1Var.p1.a();
        od1 od1Var = xd1Var.p1;
        if (od1Var != null) {
            if (!od1Var.T0()) {
                xd1Var.g1();
                return;
            }
            xd1Var.p1.l1(true);
            org.telegram.ui.Components.ck0 ck0Var = xd1Var.N1;
            ck0Var.h = true;
            if (a2) {
                ck0Var.P(0);
            } else {
                ck0Var.P(36);
            }
            xd1Var.N1.start();
            if (xd1Var.M1) {
                od1 od1Var2 = xd1Var.p1;
                if (od1Var2 == null || !od1Var2.a()) {
                    xd1Var.R1.a(0.0f);
                } else {
                    xd1Var.R1.setVisibility(0);
                    xd1Var.R1.a(xd1Var.n1);
                }
                ValueAnimator valueAnimator = xd1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    xd1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(xd1Var.o1, xd1Var.p1.a() ? 1.0f : 0.0f);
                xd1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new y11(this, 14));
                xd1Var.P1.addListener(new ep0(this, 23));
                xd1Var.P1.setDuration(250L);
                xd1Var.P1.setInterpolator(org.telegram.ui.Components.hs.f);
                xd1Var.P1.start();
            }
        }
    }
}

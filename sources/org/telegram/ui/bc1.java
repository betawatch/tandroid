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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nc1 a;

    public bc1(nc1 nc1Var) {
        this.a = nc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.e6 k10;
        String b10;
        int i11;
        nc1 nc1Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (nc1Var.Q0(true)) {
                nc1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            nc1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (nc1Var.v) {
                org.telegram.ui.ActionBar.g6.p1(false);
            }
            File d = e6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = nc1Var.S0;
            e6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            e6Var.p = nc1Var.h1;
            e6Var.q = nc1Var.A1;
            if (((int) e6Var.j) == 0) {
                e6Var.j = 4294967296L;
            }
            if (((int) e6Var.k) == 0) {
                e6Var.k = 4294967296L;
            }
            if (((int) e6Var.l) == 0) {
                e6Var.l = 4294967296L;
            }
            if (((int) e6Var.m) == 0) {
                e6Var.m = 4294967296L;
            }
            nc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(nc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.g6.t1(nc1Var.a0, true, false, false, true, false);
            org.telegram.ui.ActionBar.g6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, nc1Var.a0, Boolean.valueOf(nc1Var.b0), null, -1);
            nc1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (nc1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (nc1Var.B1) {
                sb2.append("blur");
            }
            if (nc1Var.A1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = nc1Var.x1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) nc1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder f10 = s3.c.f(b10, "?mode=");
                    f10.append(sb2.toString());
                    b10 = f10.toString();
                }
            } else if (obj instanceof wh1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.S0;
                wh1 wh1Var = new wh1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", nc1Var.V0, nc1Var.X0, nc1Var.Y0, nc1Var.Z0, nc1Var.d1, nc1Var.h1, nc1Var.A1, null);
                wh1Var.g = tL_wallPaper2;
                b10 = wh1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.g6.I.k(false)) == null) {
                    return;
                }
                wh1 wh1Var2 = new wh1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = nc1Var.Q0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) nc1Var.Q0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        wh1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = wh1Var2.b();
            }
            nc1Var.showDialog(new yb1(this, nc1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = nc1Var.x1;
                if (!(obj2 instanceof xh1) || (file = ((xh1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(nc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new ac1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = nc1Var.l1.a();
        ec1 ec1Var = nc1Var.l1;
        if (ec1Var != null) {
            if (!ec1Var.X0()) {
                nc1Var.g1();
                return;
            }
            nc1Var.l1.n1(true);
            org.telegram.ui.Components.oi0 oi0Var = nc1Var.J1;
            oi0Var.h = true;
            if (a2) {
                oi0Var.N(0);
            } else {
                oi0Var.N(36);
            }
            nc1Var.J1.start();
            if (nc1Var.I1) {
                ec1 ec1Var2 = nc1Var.l1;
                if (ec1Var2 == null || !ec1Var2.a()) {
                    nc1Var.N1.a(0.0f);
                } else {
                    nc1Var.N1.setVisibility(0);
                    nc1Var.N1.a(nc1Var.j1);
                }
                ValueAnimator valueAnimator = nc1Var.L1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nc1Var.L1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nc1Var.k1, nc1Var.l1.a() ? 1.0f : 0.0f);
                nc1Var.L1 = ofFloat;
                ofFloat.addUpdateListener(new w01(this, 14));
                nc1Var.L1.addListener(new zb1(this, 0));
                nc1Var.L1.setDuration(250L);
                nc1Var.L1.setInterpolator(org.telegram.ui.Components.er.f);
                nc1Var.L1.start();
            }
        }
    }
}

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class od1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ae1 a;

    public od1(ae1 ae1Var) {
        this.a = ae1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        int i11;
        ae1 ae1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = ae1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (ae1Var.Q0(true)) {
                ae1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            ae1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (ae1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = ae1Var.W0;
            h6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            h6Var.p = ae1Var.l1;
            h6Var.q = ae1Var.E1;
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
            ae1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(ae1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(ae1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ae1Var.e0, Boolean.valueOf(ae1Var.f0), null, -1);
            ae1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (ae1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (ae1Var.F1) {
                sb2.append("blur");
            }
            if (ae1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = ae1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.p2) ae1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder g10 = w.f.g(b10, "?mode=");
                    g10.append(sb2.toString());
                    b10 = g10.toString();
                }
            } else if (obj instanceof kj1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = ae1Var.W0;
                kj1 kj1Var = new kj1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", ae1Var.Z0, ae1Var.b1, ae1Var.c1, ae1Var.d1, ae1Var.h1, ae1Var.l1, ae1Var.E1, null);
                kj1Var.g = tL_wallPaper2;
                b10 = kj1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) == null) {
                    return;
                }
                kj1 kj1Var2 = new kj1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = ae1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) ae1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        kj1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = kj1Var2.b();
            }
            ae1Var.showDialog(new md1(this, ae1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = ae1Var.B1;
                if (!(obj2 instanceof lj1) || (file = ((lj1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(ae1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new nd1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = ae1Var.p1.a();
        rd1 rd1Var = ae1Var.p1;
        if (rd1Var != null) {
            if (!rd1Var.Y0()) {
                ae1Var.g1();
                return;
            }
            ae1Var.p1.n1(true);
            org.telegram.ui.Components.hj0 hj0Var = ae1Var.N1;
            hj0Var.h = true;
            if (a2) {
                hj0Var.P(0);
            } else {
                hj0Var.P(36);
            }
            ae1Var.N1.start();
            if (ae1Var.M1) {
                rd1 rd1Var2 = ae1Var.p1;
                if (rd1Var2 == null || !rd1Var2.a()) {
                    ae1Var.R1.a(0.0f);
                } else {
                    ae1Var.R1.setVisibility(0);
                    ae1Var.R1.a(ae1Var.n1);
                }
                ValueAnimator valueAnimator = ae1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    ae1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ae1Var.o1, ae1Var.p1.a() ? 1.0f : 0.0f);
                ae1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new f21(this, 14));
                ae1Var.P1.addListener(new mv0(this, 12));
                ae1Var.P1.setDuration(250L);
                ae1Var.P1.setInterpolator(org.telegram.ui.Components.wr.f);
                ae1Var.P1.start();
            }
        }
    }
}

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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class cd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ od1 a;

    public cd1(od1 od1Var) {
        this.a = od1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        int i11;
        od1 od1Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = od1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (od1Var.Q0(true)) {
                od1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            od1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (od1Var.v) {
                org.telegram.ui.ActionBar.h6.p1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = od1Var.W0;
            f6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            f6Var.p = od1Var.l1;
            f6Var.q = od1Var.E1;
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
            od1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(od1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.h6.t1(od1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.h6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, od1Var.e0, Boolean.valueOf(od1Var.f0), null, -1);
            od1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (od1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (od1Var.F1) {
                sb2.append("blur");
            }
            if (od1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = od1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.m2) od1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder h = v7.j.h(b10, "?mode=");
                    h.append(sb2.toString());
                    b10 = h.toString();
                }
            } else if (obj instanceof yi1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = od1Var.W0;
                yi1 yi1Var = new yi1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", od1Var.Z0, od1Var.b1, od1Var.c1, od1Var.d1, od1Var.h1, od1Var.l1, od1Var.E1, null);
                yi1Var.g = tL_wallPaper2;
                b10 = yi1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.h6.I.k(false)) == null) {
                    return;
                }
                yi1 yi1Var2 = new yi1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = od1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) od1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        yi1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = yi1Var2.b();
            }
            od1Var.showDialog(new ad1(this, od1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = od1Var.B1;
                if (!(obj2 instanceof zi1) || (file = ((zi1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().J2(od1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new bd1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = od1Var.p1.a();
        fd1 fd1Var = od1Var.p1;
        if (fd1Var != null) {
            if (!fd1Var.Y0()) {
                od1Var.g1();
                return;
            }
            od1Var.p1.o1(true);
            org.telegram.ui.Components.ij0 ij0Var = od1Var.N1;
            ij0Var.h = true;
            if (a2) {
                ij0Var.P(0);
            } else {
                ij0Var.P(36);
            }
            od1Var.N1.start();
            if (od1Var.M1) {
                fd1 fd1Var2 = od1Var.p1;
                if (fd1Var2 == null || !fd1Var2.a()) {
                    od1Var.R1.a(0.0f);
                } else {
                    od1Var.R1.setVisibility(0);
                    od1Var.R1.a(od1Var.n1);
                }
                ValueAnimator valueAnimator = od1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    od1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(od1Var.o1, od1Var.p1.a() ? 1.0f : 0.0f);
                od1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new q11(this, 14));
                od1Var.P1.addListener(new xo0(this, 23));
                od1Var.P1.setDuration(250L);
                od1Var.P1.setInterpolator(org.telegram.ui.Components.rr.f);
                od1Var.P1.start();
            }
        }
    }
}

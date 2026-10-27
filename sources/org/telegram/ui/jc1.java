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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ vc1 a;

    public jc1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.w6 k10;
        String b10;
        int i11;
        vc1 vc1Var = this.a;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        int i12 = 0;
        if (i10 == -1) {
            if (vc1Var.Q0(true)) {
                vc1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            vc1Var.Z0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (vc1Var.w) {
                org.telegram.ui.ActionBar.y6.s1(false);
            }
            File d = w6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = vc1Var.X0;
            w6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            w6Var.p = vc1Var.m1;
            w6Var.q = vc1Var.F1;
            if (((int) w6Var.j) == 0) {
                w6Var.j = 4294967296L;
            }
            if (((int) w6Var.k) == 0) {
                w6Var.k = 4294967296L;
            }
            if (((int) w6Var.l) == 0) {
                w6Var.l = 4294967296L;
            }
            if (((int) w6Var.m) == 0) {
                w6Var.m = 4294967296L;
            }
            vc1Var.X0();
            NotificationCenter.getGlobalInstance().removeObserver(vc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.y6.w1(vc1Var.f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.y6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vc1Var.f0, Boolean.valueOf(vc1Var.g0), null, -1);
            vc1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (vc1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (vc1Var.G1) {
                sb2.append("blur");
            }
            if (vc1Var.F1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = vc1Var.C1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.r2) vc1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder l4 = org.telegram.ui.Components.b10.l(b10, "?mode=");
                    l4.append(sb2.toString());
                    b10 = l4.toString();
                }
            } else if (obj instanceof di1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = vc1Var.X0;
                di1 di1Var = new di1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", vc1Var.a1, vc1Var.c1, vc1Var.d1, vc1Var.e1, vc1Var.i1, vc1Var.m1, vc1Var.F1, null);
                di1Var.g = tL_wallPaper2;
                b10 = di1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.y6.I.k(false)) == null) {
                    return;
                }
                di1 di1Var2 = new di1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = vc1Var.V0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) vc1Var.V0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        di1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = di1Var2.b();
            }
            vc1Var.showDialog(new gc1(this, vc1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = vc1Var.C1;
                if (!(obj2 instanceof ei1) || (file = ((ei1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.v1().N2(vc1Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new ic1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = vc1Var.q1.a();
        mc1 mc1Var = vc1Var.q1;
        if (mc1Var != null) {
            if (!mc1Var.X0()) {
                vc1Var.h1();
                return;
            }
            vc1Var.q1.j1(true);
            org.telegram.ui.Components.yj0 yj0Var = vc1Var.O1;
            yj0Var.h = true;
            if (a2) {
                yj0Var.P(0);
            } else {
                yj0Var.P(36);
            }
            vc1Var.O1.start();
            if (vc1Var.N1) {
                mc1 mc1Var2 = vc1Var.q1;
                if (mc1Var2 == null || !mc1Var2.a()) {
                    vc1Var.S1.a(0.0f);
                } else {
                    vc1Var.S1.setVisibility(0);
                    vc1Var.S1.a(vc1Var.o1);
                }
                ValueAnimator valueAnimator = vc1Var.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    vc1Var.Q1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(vc1Var.p1, vc1Var.q1.a() ? 1.0f : 0.0f);
                vc1Var.Q1 = ofFloat;
                ofFloat.addUpdateListener(new x11(this, 11));
                vc1Var.Q1.addListener(new hc1(this, 0));
                vc1Var.Q1.setDuration(250L);
                vc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f);
                vc1Var.Q1.start();
            }
        }
    }
}

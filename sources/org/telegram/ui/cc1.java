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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ oc1 a;

    public cc1(oc1 oc1Var) {
        this.a = oc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        File file;
        org.telegram.ui.ActionBar.d6 k10;
        String b10;
        int i10;
        oc1 oc1Var = this.a;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
        int i11 = 0;
        if (i9 == -1) {
            if (oc1Var.Q0(true)) {
                oc1Var.O0(false);
                return;
            }
            return;
        }
        if (i9 >= 1 && i9 <= 3) {
            oc1Var.Y0(i9, true);
            return;
        }
        if (i9 == 4) {
            if (oc1Var.v) {
                org.telegram.ui.ActionBar.f6.p1(false);
            }
            File d = d6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = oc1Var.S0;
            d6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            d6Var.p = oc1Var.h1;
            d6Var.q = oc1Var.A1;
            if (((int) d6Var.j) == 0) {
                d6Var.j = 4294967296L;
            }
            if (((int) d6Var.k) == 0) {
                d6Var.k = 4294967296L;
            }
            if (((int) d6Var.l) == 0) {
                d6Var.l = 4294967296L;
            }
            if (((int) d6Var.m) == 0) {
                d6Var.m = 4294967296L;
            }
            oc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(oc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.f6.t1(oc1Var.a0, true, false, false, true, false);
            org.telegram.ui.ActionBar.f6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, oc1Var.a0, Boolean.valueOf(oc1Var.b0), null, -1);
            oc1Var.finishFragment();
            return;
        }
        if (i9 == 5) {
            if (oc1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (oc1Var.B1) {
                sb2.append("blur");
            }
            if (oc1Var.A1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = oc1Var.x1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.o2) oc1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i10).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder e10 = ta.b.e(b10, "?mode=");
                    e10.append(sb2.toString());
                    b10 = e10.toString();
                }
            } else if (obj instanceof xh1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = oc1Var.S0;
                xh1 xh1Var = new xh1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", oc1Var.V0, oc1Var.X0, oc1Var.Y0, oc1Var.Z0, oc1Var.d1, oc1Var.h1, oc1Var.A1, null);
                xh1Var.g = tL_wallPaper2;
                b10 = xh1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.f6.I.k(false)) == null) {
                    return;
                }
                xh1 xh1Var2 = new xh1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = oc1Var.Q0.size();
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) oc1Var.Q0.get(i11);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        xh1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i11++;
                }
                b10 = xh1Var2.b();
            }
            oc1Var.showDialog(new ac1(this, oc1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i9 != 6) {
            if (i9 == 7) {
                Object obj2 = oc1Var.x1;
                if (!(obj2 instanceof yh1) || (file = ((yh1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(oc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new bc1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = oc1Var.l1.a();
        fc1 fc1Var = oc1Var.l1;
        if (fc1Var != null) {
            if (!fc1Var.X0()) {
                oc1Var.g1();
                return;
            }
            oc1Var.l1.m1(true);
            org.telegram.ui.Components.mi0 mi0Var = oc1Var.J1;
            mi0Var.h = true;
            if (a2) {
                mi0Var.N(0);
            } else {
                mi0Var.N(36);
            }
            oc1Var.J1.start();
            if (oc1Var.I1) {
                fc1 fc1Var2 = oc1Var.l1;
                if (fc1Var2 == null || !fc1Var2.a()) {
                    oc1Var.N1.a(0.0f);
                } else {
                    oc1Var.N1.setVisibility(0);
                    oc1Var.N1.a(oc1Var.j1);
                }
                ValueAnimator valueAnimator = oc1Var.L1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    oc1Var.L1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(oc1Var.k1, oc1Var.l1.a() ? 1.0f : 0.0f);
                oc1Var.L1 = ofFloat;
                ofFloat.addUpdateListener(new v01(this, 14));
                oc1Var.L1.addListener(new bc0(this, 28));
                oc1Var.L1.setDuration(250L);
                oc1Var.L1.setInterpolator(org.telegram.ui.Components.gr.f);
                oc1Var.L1.start();
            }
        }
    }
}

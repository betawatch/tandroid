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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ec1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qc1 a;

    public ec1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.i6 k10;
        String b10;
        int i11;
        qc1 qc1Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
        int i12 = 0;
        if (i10 == -1) {
            if (qc1Var.P0(true)) {
                qc1Var.N0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            qc1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (qc1Var.w) {
                org.telegram.ui.ActionBar.k6.s1(false);
            }
            File d = i6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = qc1Var.X0;
            i6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            i6Var.p = qc1Var.m1;
            i6Var.q = qc1Var.F1;
            if (((int) i6Var.j) == 0) {
                i6Var.j = 4294967296L;
            }
            if (((int) i6Var.k) == 0) {
                i6Var.k = 4294967296L;
            }
            if (((int) i6Var.l) == 0) {
                i6Var.l = 4294967296L;
            }
            if (((int) i6Var.m) == 0) {
                i6Var.m = 4294967296L;
            }
            qc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(qc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.k6.w1(qc1Var.f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, qc1Var.f0, Boolean.valueOf(qc1Var.g0), null, -1);
            qc1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (qc1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (qc1Var.G1) {
                sb2.append("blur");
            }
            if (qc1Var.F1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = qc1Var.C1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder i13 = si.o0.i(b10, "?mode=");
                    i13.append(sb2.toString());
                    b10 = i13.toString();
                }
            } else if (obj instanceof zh1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = qc1Var.X0;
                zh1 zh1Var = new zh1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", qc1Var.a1, qc1Var.c1, qc1Var.d1, qc1Var.e1, qc1Var.i1, qc1Var.m1, qc1Var.F1, null);
                zh1Var.g = tL_wallPaper2;
                b10 = zh1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.k6.I.k(false)) == null) {
                    return;
                }
                zh1 zh1Var2 = new zh1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = qc1Var.V0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) qc1Var.V0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        zh1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = zh1Var2.b();
            }
            qc1Var.showDialog(new cc1(this, qc1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = qc1Var.C1;
                if (!(obj2 instanceof ai1) || (file = ((ai1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.u1().M2(qc1Var.getParentActivity(), null, null);
                PhotoViewer.u1().i2(arrayList, 0, 3, false, new dc1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = qc1Var.q1.a();
        hc1 hc1Var = qc1Var.q1;
        if (hc1Var != null) {
            if (!hc1Var.I0()) {
                qc1Var.g1();
                return;
            }
            qc1Var.q1.c1(true);
            org.telegram.ui.Components.yj0 yj0Var = qc1Var.O1;
            yj0Var.h = true;
            if (a2) {
                yj0Var.P(0);
            } else {
                yj0Var.P(36);
            }
            qc1Var.O1.start();
            if (qc1Var.N1) {
                hc1 hc1Var2 = qc1Var.q1;
                if (hc1Var2 == null || !hc1Var2.a()) {
                    qc1Var.S1.a(0.0f);
                } else {
                    qc1Var.S1.setVisibility(0);
                    qc1Var.S1.a(qc1Var.o1);
                }
                ValueAnimator valueAnimator = qc1Var.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qc1Var.Q1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qc1Var.p1, qc1Var.q1.a() ? 1.0f : 0.0f);
                qc1Var.Q1 = ofFloat;
                ofFloat.addUpdateListener(new g11(this, 12));
                qc1Var.Q1.addListener(new v70(this, 28));
                qc1Var.Q1.setDuration(250L);
                qc1Var.Q1.setInterpolator(org.telegram.ui.Components.bs.f);
                qc1Var.Q1.start();
            }
        }
    }
}

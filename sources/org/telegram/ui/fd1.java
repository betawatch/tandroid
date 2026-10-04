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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ rd1 a;

    public fd1(rd1 rd1Var) {
        this.a = rd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        int i11;
        rd1 rd1Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = rd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (rd1Var.Q0(true)) {
                rd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            rd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (rd1Var.v) {
                org.telegram.ui.ActionBar.i6.p1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = rd1Var.W0;
            f6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            f6Var.p = rd1Var.l1;
            f6Var.q = rd1Var.E1;
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
            rd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(rd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.i6.t1(rd1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.i6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, rd1Var.e0, Boolean.valueOf(rd1Var.f0), null, -1);
            rd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (rd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (rd1Var.F1) {
                sb2.append("blur");
            }
            if (rd1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = rd1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) rd1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder j3 = t8.b.j(b10, "?mode=");
                    j3.append(sb2.toString());
                    b10 = j3.toString();
                }
            } else if (obj instanceof yi1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = rd1Var.W0;
                yi1 yi1Var = new yi1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", rd1Var.Z0, rd1Var.b1, rd1Var.c1, rd1Var.d1, rd1Var.h1, rd1Var.l1, rd1Var.E1, null);
                yi1Var.g = tL_wallPaper2;
                b10 = yi1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.i6.I.k(false)) == null) {
                    return;
                }
                yi1 yi1Var2 = new yi1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = rd1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) rd1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        yi1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = yi1Var2.b();
            }
            rd1Var.showDialog(new dd1(this, rd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = rd1Var.B1;
                if (!(obj2 instanceof zi1) || (file = ((zi1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(rd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new ed1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = rd1Var.p1.a();
        id1 id1Var = rd1Var.p1;
        if (id1Var != null) {
            if (!id1Var.a1()) {
                rd1Var.g1();
                return;
            }
            rd1Var.p1.q1(true);
            org.telegram.ui.Components.kj0 kj0Var = rd1Var.N1;
            kj0Var.h = true;
            if (a2) {
                kj0Var.P(0);
            } else {
                kj0Var.P(36);
            }
            rd1Var.N1.start();
            if (rd1Var.M1) {
                id1 id1Var2 = rd1Var.p1;
                if (id1Var2 == null || !id1Var2.a()) {
                    rd1Var.R1.a(0.0f);
                } else {
                    rd1Var.R1.setVisibility(0);
                    rd1Var.R1.a(rd1Var.n1);
                }
                ValueAnimator valueAnimator = rd1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    rd1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(rd1Var.o1, rd1Var.p1.a() ? 1.0f : 0.0f);
                rd1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new b21(this, 13));
                rd1Var.P1.addListener(new ap0(this, 23));
                rd1Var.P1.setDuration(250L);
                rd1Var.P1.setInterpolator(org.telegram.ui.Components.tr.f);
                rd1Var.P1.start();
            }
        }
    }
}

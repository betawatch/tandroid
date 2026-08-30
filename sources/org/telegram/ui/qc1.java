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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cd1 a;

    public qc1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        int i11;
        cd1 cd1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (cd1Var.Q0(true)) {
                cd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            cd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (cd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = cd1Var.T0;
            h6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            h6Var.p = cd1Var.i1;
            h6Var.q = cd1Var.B1;
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
            cd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(cd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(cd1Var.b0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, cd1Var.b0, Boolean.valueOf(cd1Var.c0), null, -1);
            cd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (cd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (cd1Var.C1) {
                sb.append("blur");
            }
            if (cd1Var.B1) {
                if (sb.length() > 0) {
                    sb.append("+");
                }
                sb.append("motion");
            }
            Object obj = cd1Var.y1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb2 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                sb2.append(MessagesController.getInstance(i11).linkPrefix);
                sb2.append("/bg/");
                sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb2.toString();
                if (sb.length() > 0) {
                    StringBuilder f10 = vh.v2.f(b10, "?mode=");
                    f10.append(sb.toString());
                    b10 = f10.toString();
                }
            } else if (obj instanceof mi1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = cd1Var.T0;
                mi1 mi1Var = new mi1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", cd1Var.W0, cd1Var.Y0, cd1Var.Z0, cd1Var.a1, cd1Var.e1, cd1Var.i1, cd1Var.B1, null);
                mi1Var.g = tL_wallPaper2;
                b10 = mi1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) == null) {
                    return;
                }
                mi1 mi1Var2 = new mi1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = cd1Var.R0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) cd1Var.R0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        mi1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = mi1Var2.b();
            }
            cd1Var.showDialog(new oc1(this, cd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = cd1Var.y1;
                if (!(obj2 instanceof ni1) || (file = ((ni1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(cd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new pc1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = cd1Var.m1.a();
        tc1 tc1Var = cd1Var.m1;
        if (tc1Var != null) {
            if (!tc1Var.V0()) {
                cd1Var.g1();
                return;
            }
            cd1Var.m1.n1(true);
            org.telegram.ui.Components.gj0 gj0Var = cd1Var.K1;
            gj0Var.h = true;
            if (a2) {
                gj0Var.N(0);
            } else {
                gj0Var.N(36);
            }
            cd1Var.K1.start();
            if (cd1Var.J1) {
                tc1 tc1Var2 = cd1Var.m1;
                if (tc1Var2 == null || !tc1Var2.a()) {
                    cd1Var.O1.a(0.0f);
                } else {
                    cd1Var.O1.setVisibility(0);
                    cd1Var.O1.a(cd1Var.k1);
                }
                ValueAnimator valueAnimator = cd1Var.M1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    cd1Var.M1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(cd1Var.l1, cd1Var.m1.a() ? 1.0f : 0.0f);
                cd1Var.M1 = ofFloat;
                ofFloat.addUpdateListener(new h11(this, 14));
                cd1Var.M1.addListener(new ls0(this, 21));
                cd1Var.M1.setDuration(250L);
                cd1Var.M1.setInterpolator(org.telegram.ui.Components.nr.f);
                cd1Var.M1.start();
            }
        }
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a71 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ l71 a;

    public a71(l71 l71Var) {
        this.a = l71Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        File file;
        String b10;
        int i10;
        l71 l71Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
        if (i3 == -1) {
            if (l71Var.U0(true)) {
                l71Var.S0(false);
                return;
            }
            return;
        }
        if (i3 >= 1 && i3 <= 3) {
            l71Var.d1(i3, true);
            return;
        }
        if (i3 == 4) {
            if (l71Var.x) {
                org.telegram.ui.ActionBar.k6.v1(false);
            }
            File e10 = g6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = l71Var.Y0;
            g6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            g6Var.p = l71Var.n1;
            g6Var.q = l71Var.G1;
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
            l71Var.b1();
            org.telegram.messenger.hs.e().n(l71Var, org.telegram.messenger.hs.e4);
            org.telegram.ui.ActionBar.k6.z1(l71Var.g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.p();
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, l71Var.g0, Boolean.valueOf(l71Var.h0), null, -1);
            l71Var.finishFragment();
            return;
        }
        if (i3 == 5) {
            if (l71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (l71Var.H1) {
                sb2.append("blur");
            }
            if (l71Var.G1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = l71Var.D1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                sb3.append(org.telegram.messenger.hp.s1(i10).V2);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder h = t4.c.h(b10, "?mode=");
                    h.append(sb2.toString());
                    b10 = h.toString();
                }
            } else {
                if (!(obj instanceof kc1)) {
                    boolean z10 = org.telegram.messenger.r2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = l71Var.Y0;
                kc1 kc1Var = new kc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", l71Var.b1, l71Var.d1, l71Var.e1, l71Var.f1, l71Var.j1, l71Var.n1, l71Var.G1, null);
                kc1Var.g = tL_wallPaper2;
                b10 = kc1Var.b();
            }
            l71Var.showDialog(new y61(this, l71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i3 != 6) {
            if (i3 == 7) {
                Object obj2 = l71Var.D1;
                if (!(obj2 instanceof lc1) || (file = ((lc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, file.getAbsolutePath(), 0, false, 0, 0);
                yeVar.b = false;
                yeVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(yeVar);
                PhotoViewer.v1().N2(l71Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new z61(this, yeVar), null);
                return;
            }
            return;
        }
        if (org.telegram.messenger.az.S <= 3) {
            org.telegram.messenger.az.S = 10;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            int i11 = org.telegram.messenger.az.S + 1;
            org.telegram.messenger.az.S = i11;
            edit.putInt("dayNightWallpaperSwitchHint", i11);
            edit.apply();
        }
        boolean a10 = l71Var.r1.a();
        d71 d71Var = l71Var.r1;
        if (d71Var != null) {
            if (!d71Var.Y0()) {
                l71Var.l1();
                return;
            }
            l71Var.r1.l1(true);
            org.telegram.ui.Components.ch0 ch0Var = l71Var.P1;
            ch0Var.h = true;
            if (a10) {
                ch0Var.P(0);
            } else {
                ch0Var.P(36);
            }
            l71Var.P1.start();
            if (l71Var.O1) {
                d71 d71Var2 = l71Var.r1;
                if (d71Var2 == null || !d71Var2.a()) {
                    l71Var.T1.a(0.0f);
                } else {
                    l71Var.T1.setVisibility(0);
                    l71Var.T1.a(l71Var.p1);
                }
                ValueAnimator valueAnimator = l71Var.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    l71Var.R1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(l71Var.q1, l71Var.r1.a() ? 1.0f : 0.0f);
                l71Var.R1 = ofFloat;
                ofFloat.addUpdateListener(new xy0(this, 10));
                l71Var.R1.addListener(new y20(this, 29));
                l71Var.R1.setDuration(250L);
                l71Var.R1.setInterpolator(org.telegram.ui.Components.xq.f);
                l71Var.R1.start();
            }
        }
    }
}

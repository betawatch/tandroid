package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k71 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ v71 a;

    public k71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        File file;
        String b10;
        int i10;
        v71 v71Var = this.a;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.w;
        if (i7 == -1) {
            if (v71Var.U0(true)) {
                v71Var.S0(false);
                return;
            }
            return;
        }
        if (i7 >= 1 && i7 <= 3) {
            v71Var.d1(i7, true);
            return;
        }
        if (i7 == 4) {
            if (v71Var.x) {
                org.telegram.ui.ActionBar.n6.v1(false);
            }
            File e10 = k6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = v71Var.Y0;
            k6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            k6Var.p = v71Var.n1;
            k6Var.q = v71Var.G1;
            if (((int) k6Var.j) == 0) {
                k6Var.j = 4294967296L;
            }
            if (((int) k6Var.k) == 0) {
                k6Var.k = 4294967296L;
            }
            if (((int) k6Var.l) == 0) {
                k6Var.l = 4294967296L;
            }
            if (((int) k6Var.m) == 0) {
                k6Var.m = 4294967296L;
            }
            v71Var.b1();
            org.telegram.messenger.ks.e().n(v71Var, org.telegram.messenger.ks.h4);
            org.telegram.ui.ActionBar.n6.z1(v71Var.g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.n6.p();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, v71Var.g0, Boolean.valueOf(v71Var.h0), null, -1);
            v71Var.finishFragment();
            return;
        }
        if (i7 == 5) {
            if (v71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (v71Var.H1) {
                sb2.append("blur");
            }
            if (v71Var.G1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = v71Var.D1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.g2) v71Var).currentAccount;
                sb3.append(org.telegram.messenger.mp.u1(i10).X2);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder n10 = p5.c.n(b10, "?mode=");
                    n10.append(sb2.toString());
                    b10 = n10.toString();
                }
            } else {
                if (!(obj instanceof pc1)) {
                    boolean z10 = org.telegram.messenger.s2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = v71Var.Y0;
                pc1 pc1Var = new pc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", v71Var.b1, v71Var.d1, v71Var.e1, v71Var.f1, v71Var.j1, v71Var.n1, v71Var.G1, null);
                pc1Var.g = tL_wallPaper2;
                b10 = pc1Var.b();
            }
            v71Var.showDialog(new h71(this, v71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i7 != 6) {
            if (i7 == 7) {
                Object obj2 = v71Var.D1;
                if (!(obj2 instanceof qc1) || (file = ((qc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, file.getAbsolutePath(), 0, false, 0, 0);
                efVar.b = false;
                efVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(efVar);
                PhotoViewer.p1().J2(v71Var.getParentActivity(), null, null);
                PhotoViewer.p1().g2(arrayList, 0, 3, false, new j71(this, efVar), null);
                return;
            }
            return;
        }
        if (org.telegram.messenger.bz.S <= 3) {
            org.telegram.messenger.bz.S = 10;
            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
            int i11 = org.telegram.messenger.bz.S + 1;
            org.telegram.messenger.bz.S = i11;
            edit.putInt("dayNightWallpaperSwitchHint", i11);
            edit.apply();
        }
        boolean b11 = v71Var.r1.b();
        n71 n71Var = v71Var.r1;
        if (n71Var != null) {
            if (!n71Var.O0()) {
                v71Var.l1();
                return;
            }
            v71Var.r1.b1(true);
            org.telegram.ui.Components.nh0 nh0Var = v71Var.P1;
            nh0Var.h = true;
            if (b11) {
                nh0Var.P(0);
            } else {
                nh0Var.P(36);
            }
            v71Var.P1.start();
            if (v71Var.O1) {
                n71 n71Var2 = v71Var.r1;
                if (n71Var2 == null || !n71Var2.b()) {
                    v71Var.T1.a(0.0f);
                } else {
                    v71Var.T1.setVisibility(0);
                    v71Var.T1.a(v71Var.p1);
                }
                ValueAnimator valueAnimator = v71Var.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    v71Var.R1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(v71Var.q1, v71Var.r1.b() ? 1.0f : 0.0f);
                v71Var.R1 = ofFloat;
                ofFloat.addUpdateListener(new hz0(this, 10));
                v71Var.R1.addListener(new i71(this, 0));
                v71Var.R1.setDuration(250L);
                v71Var.R1.setInterpolator(org.telegram.ui.Components.kr.f);
                v71Var.R1.start();
            }
        }
    }
}

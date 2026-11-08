package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        org.telegram.ui.ActionBar.h6 h6Var = v71Var.w;
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
                org.telegram.ui.ActionBar.k6.v1(false);
            }
            File e10 = h6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = v71Var.X0;
            h6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            h6Var.p = v71Var.m1;
            h6Var.q = v71Var.F1;
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
            v71Var.b1();
            org.telegram.messenger.qs.e().n(v71Var, org.telegram.messenger.qs.e4);
            org.telegram.ui.ActionBar.k6.z1(v71Var.f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.p();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, v71Var.f0, Boolean.valueOf(v71Var.g0), null, -1);
            v71Var.finishFragment();
            return;
        }
        if (i7 == 5) {
            if (v71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (v71Var.G1) {
                sb2.append("blur");
            }
            if (v71Var.F1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = v71Var.C1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.f2) v71Var).currentAccount;
                sb3.append(org.telegram.messenger.qp.s1(i10).U2);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder j3 = rf.b.j(b10, "?mode=");
                    j3.append(sb2.toString());
                    b10 = j3.toString();
                }
            } else {
                if (!(obj instanceof pc1)) {
                    boolean z9 = org.telegram.messenger.r2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = v71Var.X0;
                pc1 pc1Var = new pc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", v71Var.a1, v71Var.c1, v71Var.d1, v71Var.e1, v71Var.i1, v71Var.m1, v71Var.F1, null);
                pc1Var.g = tL_wallPaper2;
                b10 = pc1Var.b();
            }
            v71Var.showDialog(new i71(this, v71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i7 != 6) {
            if (i7 == 7) {
                Object obj2 = v71Var.C1;
                if (!(obj2 instanceof qc1) || (file = ((qc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, file.getAbsolutePath(), 0, false, 0, 0);
                gfVar.b = false;
                gfVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gfVar);
                PhotoViewer.p1().H2(v71Var.getParentActivity(), null, null);
                PhotoViewer.p1().e2(arrayList, 0, 3, false, new j71(this, gfVar), null);
                return;
            }
            return;
        }
        if (org.telegram.messenger.iz.S <= 3) {
            org.telegram.messenger.iz.S = 10;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            int i11 = org.telegram.messenger.iz.S + 1;
            org.telegram.messenger.iz.S = i11;
            edit.putInt("dayNightWallpaperSwitchHint", i11);
            edit.apply();
        }
        boolean a10 = v71Var.q1.a();
        n71 n71Var = v71Var.q1;
        if (n71Var != null) {
            if (!n71Var.a1()) {
                v71Var.l1();
                return;
            }
            v71Var.q1.t1(true);
            org.telegram.ui.Components.zg0 zg0Var = v71Var.O1;
            zg0Var.h = true;
            if (a10) {
                zg0Var.P(0);
            } else {
                zg0Var.P(36);
            }
            v71Var.O1.start();
            if (v71Var.N1) {
                n71 n71Var2 = v71Var.q1;
                if (n71Var2 == null || !n71Var2.a()) {
                    v71Var.S1.a(0.0f);
                } else {
                    v71Var.S1.setVisibility(0);
                    v71Var.S1.a(v71Var.o1);
                }
                ValueAnimator valueAnimator = v71Var.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    v71Var.Q1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(v71Var.p1, v71Var.q1.a() ? 1.0f : 0.0f);
                v71Var.Q1 = ofFloat;
                ofFloat.addUpdateListener(new gz0(this, 10));
                v71Var.Q1.addListener(new d30(this, 29));
                v71Var.Q1.setDuration(250L);
                v71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f);
                v71Var.Q1.start();
            }
        }
    }
}

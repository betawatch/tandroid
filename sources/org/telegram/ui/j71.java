package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class j71 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ u71 a;

    public j71(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        File file;
        String b10;
        int i10;
        u71 u71Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = u71Var.w;
        if (i7 == -1) {
            if (u71Var.U0(true)) {
                u71Var.S0(false);
                return;
            }
            return;
        }
        if (i7 >= 1 && i7 <= 3) {
            u71Var.d1(i7, true);
            return;
        }
        if (i7 == 4) {
            if (u71Var.x) {
                org.telegram.ui.ActionBar.k6.v1(false);
            }
            File e10 = h6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = u71Var.X0;
            h6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            h6Var.p = u71Var.m1;
            h6Var.q = u71Var.F1;
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
            u71Var.b1();
            org.telegram.messenger.qs.e().n(u71Var, org.telegram.messenger.qs.e4);
            org.telegram.ui.ActionBar.k6.z1(u71Var.f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.p();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, u71Var.f0, Boolean.valueOf(u71Var.g0), null, -1);
            u71Var.finishFragment();
            return;
        }
        if (i7 == 5) {
            if (u71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (u71Var.G1) {
                sb2.append("blur");
            }
            if (u71Var.F1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = u71Var.C1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.f2) u71Var).currentAccount;
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
                if (!(obj instanceof oc1)) {
                    boolean z9 = org.telegram.messenger.r2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = u71Var.X0;
                oc1 oc1Var = new oc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", u71Var.a1, u71Var.c1, u71Var.d1, u71Var.e1, u71Var.i1, u71Var.m1, u71Var.F1, null);
                oc1Var.g = tL_wallPaper2;
                b10 = oc1Var.b();
            }
            u71Var.showDialog(new h71(this, u71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i7 != 6) {
            if (i7 == 7) {
                Object obj2 = u71Var.C1;
                if (!(obj2 instanceof pc1) || (file = ((pc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, file.getAbsolutePath(), 0, false, 0, 0);
                gfVar.b = false;
                gfVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gfVar);
                PhotoViewer.p1().H2(u71Var.getParentActivity(), null, null);
                PhotoViewer.p1().e2(arrayList, 0, 3, false, new i71(this, gfVar), null);
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
        boolean a10 = u71Var.q1.a();
        m71 m71Var = u71Var.q1;
        if (m71Var != null) {
            if (!m71Var.a1()) {
                u71Var.l1();
                return;
            }
            u71Var.q1.t1(true);
            org.telegram.ui.Components.zg0 zg0Var = u71Var.O1;
            zg0Var.h = true;
            if (a10) {
                zg0Var.P(0);
            } else {
                zg0Var.P(36);
            }
            u71Var.O1.start();
            if (u71Var.N1) {
                m71 m71Var2 = u71Var.q1;
                if (m71Var2 == null || !m71Var2.a()) {
                    u71Var.S1.a(0.0f);
                } else {
                    u71Var.S1.setVisibility(0);
                    u71Var.S1.a(u71Var.o1);
                }
                ValueAnimator valueAnimator = u71Var.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    u71Var.Q1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(u71Var.p1, u71Var.q1.a() ? 1.0f : 0.0f);
                u71Var.Q1 = ofFloat;
                ofFloat.addUpdateListener(new gz0(this, 10));
                u71Var.Q1.addListener(new d30(this, 29));
                u71Var.Q1.setDuration(250L);
                u71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f);
                u71Var.Q1.start();
            }
        }
    }
}

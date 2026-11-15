package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i71 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ t71 a;

    public i71(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        File file;
        String b10;
        int i10;
        t71 t71Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = t71Var.w;
        if (i7 == -1) {
            if (t71Var.U0(true)) {
                t71Var.S0(false);
                return;
            }
            return;
        }
        if (i7 >= 1 && i7 <= 3) {
            t71Var.d1(i7, true);
            return;
        }
        if (i7 == 4) {
            if (t71Var.x) {
                org.telegram.ui.ActionBar.j6.v1(false);
            }
            File e10 = g6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = t71Var.Y0;
            g6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            g6Var.p = t71Var.n1;
            g6Var.q = t71Var.G1;
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
            t71Var.b1();
            org.telegram.messenger.ns.e().n(t71Var, org.telegram.messenger.ns.e4);
            org.telegram.ui.ActionBar.j6.z1(t71Var.g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.p();
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, t71Var.g0, Boolean.valueOf(t71Var.h0), null, -1);
            t71Var.finishFragment();
            return;
        }
        if (i7 == 5) {
            if (t71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (t71Var.H1) {
                sb2.append("blur");
            }
            if (t71Var.G1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = t71Var.D1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.e2) t71Var).currentAccount;
                sb3.append(org.telegram.messenger.np.s1(i10).V2);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder m10 = r.b.m(b10, "?mode=");
                    m10.append(sb2.toString());
                    b10 = m10.toString();
                }
            } else {
                if (!(obj instanceof oc1)) {
                    boolean z10 = org.telegram.messenger.r2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = t71Var.Y0;
                oc1 oc1Var = new oc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", t71Var.b1, t71Var.d1, t71Var.e1, t71Var.f1, t71Var.j1, t71Var.n1, t71Var.G1, null);
                oc1Var.g = tL_wallPaper2;
                b10 = oc1Var.b();
            }
            t71Var.showDialog(new f71(this, t71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i7 != 6) {
            if (i7 == 7) {
                Object obj2 = t71Var.D1;
                if (!(obj2 instanceof pc1) || (file = ((pc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
                ffVar.b = false;
                ffVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ffVar);
                PhotoViewer.p1().I2(t71Var.getParentActivity(), null, null);
                PhotoViewer.p1().f2(arrayList, 0, 3, false, new h71(this, ffVar), null);
                return;
            }
            return;
        }
        if (org.telegram.messenger.gz.S <= 3) {
            org.telegram.messenger.gz.S = 10;
            SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
            int i11 = org.telegram.messenger.gz.S + 1;
            org.telegram.messenger.gz.S = i11;
            edit.putInt("dayNightWallpaperSwitchHint", i11);
            edit.apply();
        }
        boolean a10 = t71Var.r1.a();
        l71 l71Var = t71Var.r1;
        if (l71Var != null) {
            if (!l71Var.Y0()) {
                t71Var.l1();
                return;
            }
            t71Var.r1.m1(true);
            org.telegram.ui.Components.ch0 ch0Var = t71Var.P1;
            ch0Var.h = true;
            if (a10) {
                ch0Var.P(0);
            } else {
                ch0Var.P(36);
            }
            t71Var.P1.start();
            if (t71Var.O1) {
                l71 l71Var2 = t71Var.r1;
                if (l71Var2 == null || !l71Var2.a()) {
                    t71Var.T1.a(0.0f);
                } else {
                    t71Var.T1.setVisibility(0);
                    t71Var.T1.a(t71Var.p1);
                }
                ValueAnimator valueAnimator = t71Var.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    t71Var.R1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(t71Var.q1, t71Var.r1.a() ? 1.0f : 0.0f);
                t71Var.R1 = ofFloat;
                ofFloat.addUpdateListener(new ez0(this, 10));
                t71Var.R1.addListener(new g71(this, 0));
                t71Var.R1.setDuration(250L);
                t71Var.R1.setInterpolator(org.telegram.ui.Components.er.f);
                t71Var.R1.start();
            }
        }
    }
}

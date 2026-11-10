package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m71 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ x71 a;

    public m71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        File file;
        String b10;
        int i10;
        x71 x71Var = this.a;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
        if (i7 == -1) {
            if (x71Var.U0(true)) {
                x71Var.S0(false);
                return;
            }
            return;
        }
        if (i7 >= 1 && i7 <= 3) {
            x71Var.d1(i7, true);
            return;
        }
        if (i7 == 4) {
            if (x71Var.x) {
                org.telegram.ui.ActionBar.m6.v1(false);
            }
            File e10 = j6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = x71Var.X0;
            j6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            j6Var.p = x71Var.m1;
            j6Var.q = x71Var.F1;
            if (((int) j6Var.j) == 0) {
                j6Var.j = 4294967296L;
            }
            if (((int) j6Var.k) == 0) {
                j6Var.k = 4294967296L;
            }
            if (((int) j6Var.l) == 0) {
                j6Var.l = 4294967296L;
            }
            if (((int) j6Var.m) == 0) {
                j6Var.m = 4294967296L;
            }
            x71Var.b1();
            org.telegram.messenger.qs.e().n(x71Var, org.telegram.messenger.qs.e4);
            org.telegram.ui.ActionBar.m6.z1(x71Var.f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.m6.p();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, x71Var.f0, Boolean.valueOf(x71Var.g0), null, -1);
            x71Var.finishFragment();
            return;
        }
        if (i7 == 5) {
            if (x71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (x71Var.G1) {
                sb2.append("blur");
            }
            if (x71Var.F1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = x71Var.C1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.f2) x71Var).currentAccount;
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
                if (!(obj instanceof tc1)) {
                    boolean z9 = org.telegram.messenger.r2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = x71Var.X0;
                tc1 tc1Var = new tc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", x71Var.a1, x71Var.c1, x71Var.d1, x71Var.e1, x71Var.i1, x71Var.m1, x71Var.F1, null);
                tc1Var.g = tL_wallPaper2;
                b10 = tc1Var.b();
            }
            x71Var.showDialog(new k71(this, x71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i7 != 6) {
            if (i7 == 7) {
                Object obj2 = x71Var.C1;
                if (!(obj2 instanceof uc1) || (file = ((uc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, file.getAbsolutePath(), 0, false, 0, 0);
                gfVar.b = false;
                gfVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gfVar);
                PhotoViewer.p1().H2(x71Var.getParentActivity(), null, null);
                PhotoViewer.p1().e2(arrayList, 0, 3, false, new l71(this, gfVar), null);
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
        boolean a10 = x71Var.q1.a();
        p71 p71Var = x71Var.q1;
        if (p71Var != null) {
            if (!p71Var.a1()) {
                x71Var.l1();
                return;
            }
            x71Var.q1.t1(true);
            org.telegram.ui.Components.zg0 zg0Var = x71Var.O1;
            zg0Var.h = true;
            if (a10) {
                zg0Var.P(0);
            } else {
                zg0Var.P(36);
            }
            x71Var.O1.start();
            if (x71Var.N1) {
                p71 p71Var2 = x71Var.q1;
                if (p71Var2 == null || !p71Var2.a()) {
                    x71Var.S1.a(0.0f);
                } else {
                    x71Var.S1.setVisibility(0);
                    x71Var.S1.a(x71Var.o1);
                }
                ValueAnimator valueAnimator = x71Var.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    x71Var.Q1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x71Var.p1, x71Var.q1.a() ? 1.0f : 0.0f);
                x71Var.Q1 = ofFloat;
                ofFloat.addUpdateListener(new kz0(this, 10));
                x71Var.Q1.addListener(new g30(this, 29));
                x71Var.Q1.setDuration(250L);
                x71Var.Q1.setInterpolator(org.telegram.ui.Components.wq.f);
                x71Var.Q1.start();
            }
        }
    }
}

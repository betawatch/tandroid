package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m71 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ x71 a;

    public m71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // org.telegram.ui.ActionBar.j
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
            TLRPC.TL_wallPaper tL_wallPaper = x71Var.Y0;
            j6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            j6Var.p = x71Var.n1;
            j6Var.q = x71Var.G1;
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
            org.telegram.messenger.ks.e().n(x71Var, org.telegram.messenger.ks.h4);
            org.telegram.ui.ActionBar.m6.z1(x71Var.g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.m6.p();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, x71Var.g0, Boolean.valueOf(x71Var.h0), null, -1);
            x71Var.finishFragment();
            return;
        }
        if (i7 == 5) {
            if (x71Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (x71Var.H1) {
                sb2.append("blur");
            }
            if (x71Var.G1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = x71Var.D1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i10 = ((org.telegram.ui.ActionBar.g2) x71Var).currentAccount;
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
                if (!(obj instanceof rc1)) {
                    boolean z10 = org.telegram.messenger.s2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = x71Var.Y0;
                rc1 rc1Var = new rc1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", x71Var.b1, x71Var.d1, x71Var.e1, x71Var.f1, x71Var.j1, x71Var.n1, x71Var.G1, null);
                rc1Var.g = tL_wallPaper2;
                b10 = rc1Var.b();
            }
            x71Var.showDialog(new j71(this, x71Var.getParentActivity(), b10, b10));
            return;
        }
        if (i7 != 6) {
            if (i7 == 7) {
                Object obj2 = x71Var.D1;
                if (!(obj2 instanceof sc1) || (file = ((sc1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, file.getAbsolutePath(), 0, false, 0, 0);
                efVar.b = false;
                efVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(efVar);
                PhotoViewer.p1().I2(x71Var.getParentActivity(), null, null);
                PhotoViewer.p1().f2(arrayList, 0, 3, false, new l71(this, efVar), null);
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
        boolean d = x71Var.r1.d();
        p71 p71Var = x71Var.r1;
        if (p71Var != null) {
            if (!p71Var.Y0()) {
                x71Var.l1();
                return;
            }
            x71Var.r1.l1(true);
            org.telegram.ui.Components.oh0 oh0Var = x71Var.P1;
            oh0Var.h = true;
            if (d) {
                oh0Var.P(0);
            } else {
                oh0Var.P(36);
            }
            x71Var.P1.start();
            if (x71Var.O1) {
                p71 p71Var2 = x71Var.r1;
                if (p71Var2 == null || !p71Var2.d()) {
                    x71Var.T1.a(0.0f);
                } else {
                    x71Var.T1.setVisibility(0);
                    x71Var.T1.a(x71Var.p1);
                }
                ValueAnimator valueAnimator = x71Var.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    x71Var.R1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x71Var.q1, x71Var.r1.d() ? 1.0f : 0.0f);
                x71Var.R1 = ofFloat;
                ofFloat.addUpdateListener(new iz0(this, 10));
                x71Var.R1.addListener(new k71(this, 0));
                x71Var.R1.setDuration(250L);
                x71Var.R1.setInterpolator(org.telegram.ui.Components.nr.f);
                x71Var.R1.start();
            }
        }
    }
}

// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class eqb extends d6 {
    public final /* synthetic */ pqb a;

    public eqb(pqb pqbVar) {
        this.a = pqbVar;
    }

    @Override // d6
    public final void b(int i) {
        File file;
        String b;
        int i2;
        pqb pqbVar = this.a;
        if (i == -1) {
            if (pqbVar.R0(true)) {
                pqbVar.P0(false);
                return;
            }
            return;
        }
        if (i >= 1 && i <= 3) {
            pqbVar.d1(i, true);
            return;
        }
        if (i == 4) {
            if (pqbVar.x) {
                aob.t1(false);
            }
            ynb ynbVar = pqbVar.w;
            TLRPC.TL_wallPaper tL_wallPaper = pqbVar.Y0;
            ynbVar.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            ynbVar.p = pqbVar.n1;
            ynbVar.q = pqbVar.G1;
            if (((int) ynbVar.j) == 0) {
                ynbVar.j = 4294967296L;
            }
            if (((int) ynbVar.k) == 0) {
                ynbVar.k = 4294967296L;
            }
            if (((int) ynbVar.l) == 0) {
                ynbVar.l = 4294967296L;
            }
            if (((int) ynbVar.m) == 0) {
                ynbVar.m = 4294967296L;
            }
            pqbVar.b1();
            jn7.e().n(pqbVar, jn7.h4);
            aob.x1(pqbVar.g0, true, false, false, true, false);
            aob.o();
            jn7.e().k(jn7.w4, pqbVar.g0, Boolean.valueOf(pqbVar.h0), null, -1);
            pqbVar.finishFragment();
            return;
        }
        if (i == 5) {
            if (pqbVar.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (pqbVar.H1) {
                    sb.append("blur");
                }
                if (pqbVar.G1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = pqbVar.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i2 = ((e) pqbVar).currentAccount;
                    sb2.append(uc7.s1(i2).N2);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder l = c00.l(b, "?mode=");
                        l.append(sb.toString());
                        b = l.toString();
                    }
                } else {
                    if (!(obj instanceof yvc)) {
                        boolean z = f11.a;
                        return;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper2 = pqbVar.Y0;
                    yvc yvcVar = new yvc(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", pqbVar.b1, pqbVar.d1, pqbVar.e1, pqbVar.f1, pqbVar.j1, pqbVar.n1, pqbVar.G1);
                    yvcVar.g = tL_wallPaper2;
                    b = yvcVar.b();
                }
                pqbVar.showDialog(new cqb(this, pqbVar.getParentActivity(), b, b));
                return;
            }
            return;
        }
        if (i != 6) {
            if (i == 7) {
                Object obj2 = pqbVar.D1;
                if (!(obj2 instanceof zvc) || (file = ((zvc) obj2).e) == null) {
                    return;
                }
                no6 no6Var = new no6(0, file.getAbsolutePath(), 0, false, 0, 0);
                no6Var.b = false;
                no6Var.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(no6Var);
                PhotoViewer.q0().T1(pqbVar.getParentActivity(), null, null);
                PhotoViewer.q0().o1(arrayList, 0, 3, false, new dqb(this, no6Var), null);
                return;
            }
            return;
        }
        if (xea.R <= 3) {
            xea.R = 10;
            SharedPreferences.Editor edit = uc7.e1().edit();
            int i3 = xea.R + 1;
            xea.R = i3;
            edit.putInt("dayNightWallpaperSwitchHint", i3);
            edit.apply();
        }
        boolean a = pqbVar.r1.a();
        hqb hqbVar = pqbVar.r1;
        if (hqbVar != null) {
            if (!hqbVar.s()) {
                pqbVar.l1();
                return;
            }
            pqbVar.r1.w(true);
            b29 b29Var = pqbVar.P1;
            b29Var.h = true;
            if (a) {
                b29Var.K(0);
            } else {
                b29Var.K(36);
            }
            pqbVar.P1.start();
            if (pqbVar.O1) {
                hqb hqbVar2 = pqbVar.r1;
                if (hqbVar2 == null || !hqbVar2.a()) {
                    pqbVar.T1.a(0.0f);
                } else {
                    pqbVar.T1.setVisibility(0);
                    pqbVar.T1.a(pqbVar.p1);
                }
                ValueAnimator valueAnimator = pqbVar.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    pqbVar.R1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pqbVar.q1, pqbVar.r1.a() ? 1.0f : 0.0f);
                pqbVar.R1 = ofFloat;
                ofFloat.addUpdateListener(new ija(this, (byte) 24));
                pqbVar.R1.addListener(new omb(this, (byte) 1));
                pqbVar.R1.setDuration(250L);
                pqbVar.R1.setInterpolator(k43.f);
                pqbVar.R1.start();
            }
        }
    }
}

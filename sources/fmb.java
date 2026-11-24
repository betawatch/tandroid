// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fmb extends c6 {
    public final /* synthetic */ qmb a;

    public fmb(qmb qmbVar) {
        this.a = qmbVar;
    }

    @Override // c6
    public final void b(int i) {
        File file;
        String b;
        int i2;
        qmb qmbVar = this.a;
        if (i == -1) {
            if (qmbVar.Q0(true)) {
                qmbVar.O0(false);
                return;
            }
            return;
        }
        if (i >= 1 && i <= 3) {
            qmbVar.c1(i, true);
            return;
        }
        if (i == 4) {
            if (qmbVar.x) {
                bkb.t1(false);
            }
            zjb zjbVar = qmbVar.w;
            TLRPC.TL_wallPaper tL_wallPaper = qmbVar.Y0;
            zjbVar.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            zjbVar.p = qmbVar.n1;
            zjbVar.q = qmbVar.G1;
            if (((int) zjbVar.j) == 0) {
                zjbVar.j = 4294967296L;
            }
            if (((int) zjbVar.k) == 0) {
                zjbVar.k = 4294967296L;
            }
            if (((int) zjbVar.l) == 0) {
                zjbVar.l = 4294967296L;
            }
            if (((int) zjbVar.m) == 0) {
                zjbVar.m = 4294967296L;
            }
            qmbVar.a1();
            kk7.e().n(qmbVar, kk7.g4);
            bkb.x1(qmbVar.g0, true, false, false, true, false);
            bkb.o();
            kk7.e().k(kk7.v4, qmbVar.g0, Boolean.valueOf(qmbVar.h0), null, -1);
            qmbVar.finishFragment();
            return;
        }
        if (i == 5) {
            if (qmbVar.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (qmbVar.H1) {
                    sb.append("blur");
                }
                if (qmbVar.G1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = qmbVar.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i2 = ((d) qmbVar).currentAccount;
                    sb2.append(na7.q1(i2).N2);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder k = b00.k(b, "?mode=");
                        k.append(sb.toString());
                        b = k.toString();
                    }
                } else {
                    if (!(obj instanceof krc)) {
                        boolean z = w01.a;
                        return;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper2 = qmbVar.Y0;
                    krc krcVar = new krc(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", qmbVar.b1, qmbVar.d1, qmbVar.e1, qmbVar.f1, qmbVar.j1, qmbVar.n1, qmbVar.G1);
                    krcVar.g = tL_wallPaper2;
                    b = krcVar.b();
                }
                qmbVar.showDialog(new dmb(this, qmbVar.getParentActivity(), b, b));
                return;
            }
            return;
        }
        if (i != 6) {
            if (i == 7) {
                Object obj2 = qmbVar.D1;
                if (!(obj2 instanceof lrc) || (file = ((lrc) obj2).e) == null) {
                    return;
                }
                jm6 jm6Var = new jm6(0, file.getAbsolutePath(), 0, false, 0, 0);
                jm6Var.b = false;
                jm6Var.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(jm6Var);
                PhotoViewer.r0().T1(qmbVar.getParentActivity(), null, null);
                PhotoViewer.r0().o1(arrayList, 0, 3, false, new emb(this, jm6Var), null);
                return;
            }
            return;
        }
        if (gba.R <= 3) {
            gba.R = 10;
            SharedPreferences.Editor edit = na7.c1().edit();
            int i3 = gba.R + 1;
            gba.R = i3;
            edit.putInt("dayNightWallpaperSwitchHint", i3);
            edit.apply();
        }
        boolean a = qmbVar.r1.a();
        imb imbVar = qmbVar.r1;
        if (imbVar != null) {
            if (!imbVar.w()) {
                qmbVar.k1();
                return;
            }
            qmbVar.r1.E(true);
            oy8 oy8Var = qmbVar.P1;
            oy8Var.h = true;
            if (a) {
                oy8Var.K(0);
            } else {
                oy8Var.K(36);
            }
            qmbVar.P1.start();
            if (qmbVar.O1) {
                imb imbVar2 = qmbVar.r1;
                if (imbVar2 == null || !imbVar2.a()) {
                    qmbVar.T1.a(0.0f);
                } else {
                    qmbVar.T1.setVisibility(0);
                    qmbVar.T1.a(qmbVar.p1);
                }
                ValueAnimator valueAnimator = qmbVar.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qmbVar.R1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qmbVar.q1, qmbVar.r1.a() ? 1.0f : 0.0f);
                qmbVar.R1 = ofFloat;
                ofFloat.addUpdateListener(new gja(this, (byte) 22));
                qmbVar.R1.addListener(new iab(this, (byte) 2));
                qmbVar.R1.setDuration(250L);
                qmbVar.R1.setInterpolator(s33.f);
                qmbVar.R1.start();
            }
        }
    }
}

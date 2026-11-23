package ah;

import ai.a3;
import ai.c1;
import android.view.View;
import android.widget.TextView;
import bi.e2;
import bi.l7;
import bi.o7;
import bi.t0;
import ch.b0;
import di.b6;
import di.c3;
import di.eb;
import di.gb;
import di.h1;
import di.h5;
import di.h9;
import di.o0;
import di.pb;
import di.r0;
import di.u0;
import fi.a2;
import fi.f9;
import fi.j8;
import fi.n5;
import fi.o8;
import fi.y8;
import hi.ia;
import hi.v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import ug.y0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g2 Q;
        g2 Q2;
        switch (this.a) {
            case 0:
                Runnable runnable = ((e) this.b).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                a3 a3Var = (a3) this.b;
                a3Var.getClass();
                DictationAsr.Y(!DictationAsr.x());
                a3Var.e0();
                break;
            case 2:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 3:
                ((bi.e) this.b).dismiss();
                break;
            case 4:
                ((t0) this.b).dismiss();
                break;
            case 5:
                e2 e2Var = (e2) this.b;
                LinkedHashMap linkedHashMap = e2Var.a2;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.values());
                    e2Var.dismiss();
                    e2Var.V1.c.a(arrayList);
                    break;
                }
                break;
            case 6:
                if (((l7) this.b).n > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                    e2Var2.a = true;
                    Q.showAsSheet(new pb(), e2Var2);
                    break;
                }
                break;
            case 7:
                ((o7) this.b).performClick();
                break;
            case 8:
                b0 b0Var = (b0) this.b;
                if (b0Var.k) {
                    b0Var.d();
                    break;
                }
                break;
            case 9:
                ((ci.n) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 10:
                ((a30) this.b).dismiss();
                break;
            case 11:
                o0 o0Var = (o0) this.b;
                TextView textView = o0Var.u1;
                a70 G = a70.G(o0Var.c, o0Var.J0, textView);
                int[] iArr = o0.H1;
                int i7 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i7 >= 6) {
                        G.W(5);
                        o0Var.I0(textView, G, true);
                        break;
                    } else {
                        int i10 = iArr[i7];
                        if (i10 != o0Var.C1) {
                            z10 = false;
                        }
                        G.i(new c1(o0Var, i10, 5), hd.G(i10 / 3600, "GiftOfferHours", new Object[0]), z10);
                        i7++;
                    }
                }
            case 12:
                ((r0) this.b).dismiss();
                break;
            case 13:
                u0 u0Var = (u0) this.b;
                cg.b bVar = u0Var.z1.a;
                cg.b bVar2 = cg.b.b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.a;
                }
                u0Var.K0(cg.a.j(0L, bVar2), true, false, true);
                u0Var.n1.setText("");
                break;
            case 14:
                ((h1) this.b).dismiss();
                break;
            case 15:
                ((c3) this.b).run();
                break;
            case 16:
                ((c3) this.b).run();
                break;
            case 17:
                h5 h5Var = (h5) this.b;
                h5Var.getClass();
                new gb(h5Var.b, h5Var.g).show();
                break;
            case 18:
                ((b6) this.b).dismiss();
                break;
            case 19:
                ((h9) this.b).run();
                break;
            case 20:
                if (((eb) ((a) this.b).c).e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2();
                    e2Var3.a = true;
                    Q2.showAsSheet(new pb(), e2Var3);
                    break;
                }
                break;
            case 21:
                ((a2) this.b).q(!r11.g0, true);
                break;
            case 22:
                ((f9) this.b).T();
                break;
            case 23:
                ((n5) this.b).dismiss();
                g2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new y0(Q3, 14, false));
                    break;
                }
                break;
            case 24:
                j8 j8Var = (j8) this.b;
                j8Var.onClick(j8Var.b);
                break;
            case 25:
                o8 o8Var = (o8) this.b;
                o8Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new y8(o8Var, 0)).start();
                break;
            case 26:
                ((f2.a) this.b).run();
                break;
            case 27:
                hi.o oVar = (hi.o) this.b;
                hi.h hVar = oVar.f;
                hVar.d();
                hVar.k(true);
                hi.f fVar = oVar.d0;
                g0.r(fVar);
                fVar.run();
                break;
            case 28:
                ((ia) this.b).B();
                break;
            default:
                v0.a((v0) this.b);
                break;
        }
    }
}

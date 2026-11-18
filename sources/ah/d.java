package ah;

import ai.w0;
import ai.x2;
import android.view.View;
import android.widget.TextView;
import bi.a2;
import bi.i7;
import bi.l7;
import bi.t0;
import bi.x0;
import ch.b0;
import di.b6;
import di.c3;
import di.eb;
import di.g9;
import di.gb;
import di.h1;
import di.h5;
import di.o0;
import di.pb;
import di.r0;
import di.u0;
import fi.f9;
import fi.j8;
import fi.m5;
import fi.o8;
import fi.y8;
import hi.ja;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import ug.z0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        h2 Q;
        h2 Q2;
        switch (this.a) {
            case 0:
                Runnable runnable = ((e) this.b).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                x2 x2Var = (x2) this.b;
                x2Var.getClass();
                DictationAsr.T(!DictationAsr.v());
                x2Var.e0();
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
                ((x0) this.b).c(null);
                break;
            case 6:
                a2 a2Var = (a2) this.b;
                LinkedHashMap linkedHashMap = a2Var.a2;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.values());
                    a2Var.dismiss();
                    a2Var.V1.c.a(arrayList);
                    break;
                }
                break;
            case 7:
                if (((i7) this.b).n > 0 && (Q = LaunchActivity.Q()) != null) {
                    f2 f2Var = new f2();
                    f2Var.a = true;
                    Q.showAsSheet(new pb(), f2Var);
                    break;
                }
                break;
            case 8:
                ((l7) this.b).performClick();
                break;
            case 9:
                b0 b0Var = (b0) this.b;
                if (b0Var.k) {
                    b0Var.d();
                    break;
                }
                break;
            case 10:
                ((ci.n) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 11:
                ((x20) this.b).dismiss();
                break;
            case 12:
                o0 o0Var = (o0) this.b;
                TextView textView = o0Var.u1;
                y60 G = y60.G(o0Var.c, o0Var.J0, textView);
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
                        G.i(new w0(o0Var, i10, 5), gd.G(i10 / 3600, "GiftOfferHours", new Object[0]), z10);
                        i7++;
                    }
                }
            case 13:
                ((r0) this.b).dismiss();
                break;
            case 14:
                u0 u0Var = (u0) this.b;
                cg.b bVar = u0Var.z1.a;
                cg.b bVar2 = cg.b.b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.a;
                }
                u0Var.K0(cg.a.j(0L, bVar2), true, false, true);
                u0Var.n1.setText("");
                break;
            case 15:
                ((h1) this.b).dismiss();
                break;
            case 16:
                ((c3) this.b).run();
                break;
            case 17:
                ((c3) this.b).run();
                break;
            case 18:
                h5 h5Var = (h5) this.b;
                h5Var.getClass();
                new gb(h5Var.b, h5Var.g).show();
                break;
            case 19:
                ((b6) this.b).dismiss();
                break;
            case 20:
                ((g9) this.b).run();
                break;
            case 21:
                if (((eb) ((a) this.b).c).e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    f2 f2Var2 = new f2();
                    f2Var2.a = true;
                    Q2.showAsSheet(new pb(), f2Var2);
                    break;
                }
                break;
            case 22:
                ((fi.a2) this.b).q(!r11.g0, true);
                break;
            case 23:
                ((f9) this.b).T();
                break;
            case 24:
                ((m5) this.b).dismiss();
                h2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new z0(Q3, 14, false));
                    break;
                }
                break;
            case 25:
                j8 j8Var = (j8) this.b;
                j8Var.onClick(j8Var.b);
                break;
            case 26:
                o8 o8Var = (o8) this.b;
                o8Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new y8(o8Var, 0)).start();
                break;
            case 27:
                ((f2.a) this.b).run();
                break;
            case 28:
                hi.n nVar = (hi.n) this.b;
                hi.g gVar = nVar.f;
                gVar.d();
                gVar.k(true);
                hi.e eVar = nVar.d0;
                g0.r(eVar);
                eVar.run();
                break;
            default:
                ((ja) this.b).B();
                break;
        }
    }
}

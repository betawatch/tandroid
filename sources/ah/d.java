package ah;

import ai.r2;
import ai.u0;
import android.view.View;
import android.widget.TextView;
import bi.f2;
import bi.o7;
import bi.r7;
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
import fi.a2;
import fi.f9;
import fi.j8;
import fi.n5;
import fi.o8;
import fi.y8;
import hi.d1;
import hi.db;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import ug.y0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                r2 r2Var = (r2) this.b;
                r2Var.getClass();
                DictationAsr.b0(!DictationAsr.z());
                r2Var.e0();
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
                f2 f2Var = (f2) this.b;
                LinkedHashMap linkedHashMap = f2Var.a2;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.values());
                    f2Var.dismiss();
                    f2Var.V1.c.a(arrayList);
                    break;
                }
                break;
            case 6:
                if (((o7) this.b).n > 0 && (Q = LaunchActivity.Q()) != null) {
                    e2 e2Var = new e2();
                    e2Var.a = true;
                    Q.showAsSheet(new pb(), e2Var);
                    break;
                }
                break;
            case 7:
                ((r7) this.b).performClick();
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
                ((x20) this.b).dismiss();
                break;
            case 11:
                o0 o0Var = (o0) this.b;
                TextView textView = o0Var.u1;
                x60 G = x60.G(o0Var.c, o0Var.J0, textView);
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
                        G.i(new u0(o0Var, i10, 6), gd.G(i10 / 3600, "GiftOfferHours", new Object[0]), z10);
                        i7++;
                    }
                }
            case 12:
                ((r0) this.b).dismiss();
                break;
            case 13:
                di.u0 u0Var = (di.u0) this.b;
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
                    e2 e2Var2 = new e2();
                    e2Var2.a = true;
                    Q2.showAsSheet(new pb(), e2Var2);
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
                hi.n nVar = (hi.n) this.b;
                hi.h hVar = nVar.f;
                hVar.d();
                hVar.k(true);
                hi.f fVar = nVar.d0;
                g0.r(fVar);
                fVar.run();
                break;
            case 28:
                ((db) this.b).B();
                break;
            default:
                d1.a((d1) this.b);
                break;
        }
    }
}

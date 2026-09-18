package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class e3 implements a6 {
    public final /* synthetic */ w3 a;

    public e3(w3 w3Var) {
        this.a = w3Var;
    }

    public final int a(a aVar) {
        int i10;
        w3 w3Var = this.a;
        int indexOf = w3Var.l3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= w3Var.l3.size() || ((a) w3Var.l3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        w3 w3Var = this.a;
        int indexOf = w3Var.l3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) w3Var.l3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        w3 w3Var = this.a;
        u3 u3Var = w3Var.h3;
        if (i10 == 7) {
            w3Var.S4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        w3Var.b4 = null;
        w3Var.c4 = aVar;
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.d();
        }
        if (aVar != null) {
            d6.f(aVar.b, "");
            View A1 = w3Var.A1(aVar);
            if (A1 instanceof d6) {
                ((d6) A1).getEditText().setTextSilently("");
            }
        }
        h2 h2Var2 = w3Var.J3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        switch (i10) {
            case 1:
                u3Var.i(3);
                break;
            case 2:
                u3Var.i(6);
                break;
            case 3:
                r.U(w3Var.getContext(), "", new ai.y1(w3Var, 28), w3Var.g3);
                break;
            case 4:
            case 5:
                u3Var.i(1);
                break;
            case 6:
                w3Var.u3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        w3 w3Var = this.a;
        if (!z12) {
            w3Var.S4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = w3Var.Y4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (w3Var.l3.indexOf(aVar) < 0 || w3.y3(aVar) || aVar.i) {
                return;
            }
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !d6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (d6.p(aVar.b)) {
                    long a2 = q0.a();
                    TL_iv.RichText k10 = d6.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        w3Var.m3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(q0.a()));
            }
            w3Var.t4();
            if (z13 && (w3Var.findFocus() instanceof i1)) {
                w3Var.Y1();
                h2 h2Var2 = w3Var.J3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.e3(aVar);
                return;
            }
            w3Var.Y2.N(false);
            h2 h2Var3 = w3Var.J3;
            if (h2Var3 != null) {
                h2Var3.h();
            }
            w3Var.post(new z2(w3Var, aVar, 5));
        }
    }
}

package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d3 implements a6 {
    public final /* synthetic */ v3 a;

    public d3(v3 v3Var) {
        this.a = v3Var;
    }

    public final int a(a aVar) {
        int i10;
        v3 v3Var = this.a;
        int indexOf = v3Var.t3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= v3Var.t3.size() || ((a) v3Var.t3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        v3 v3Var = this.a;
        int indexOf = v3Var.t3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) v3Var.t3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        v3 v3Var = this.a;
        t3 t3Var = v3Var.p3;
        if (i10 == 7) {
            v3Var.X4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        v3Var.j4 = null;
        v3Var.k4 = aVar;
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        if (aVar != null) {
            d6.e(aVar.b, "");
            View F1 = v3Var.F1(aVar);
            if (F1 instanceof d6) {
                ((d6) F1).getEditText().setTextSilently("");
            }
        }
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        switch (i10) {
            case 1:
                t3Var.m(3);
                break;
            case 2:
                t3Var.m(6);
                break;
            case 3:
                q.X(v3Var.getContext(), "", new ig.o(v3Var, 11), v3Var.o3);
                break;
            case 4:
            case 5:
                t3Var.m(1);
                break;
            case 6:
                v3Var.z3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        v3 v3Var = this.a;
        if (!z12) {
            v3Var.X4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = v3Var.d5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (v3Var.t3.indexOf(aVar) < 0 || v3.D3(aVar) || aVar.i) {
                return;
            }
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !d6.o(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (d6.o(aVar.b)) {
                    long a2 = o0.a();
                    TL_iv.RichText j10 = d6.j(aVar.b);
                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                        v3Var.u3.put(Long.valueOf(a2), j10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(o0.a()));
            }
            v3Var.y4();
            if (z13 && (v3Var.findFocus() instanceof g1)) {
                v3Var.d2();
                f2 f2Var2 = v3Var.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                v3Var.j3(aVar);
                return;
            }
            v3Var.g3.O(false);
            f2 f2Var3 = v3Var.R3;
            if (f2Var3 != null) {
                f2Var3.h();
            }
            v3Var.post(new y2(v3Var, aVar, 5));
        }
    }
}

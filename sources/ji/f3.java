package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class f3 implements f6 {
    public final /* synthetic */ x3 a;

    public f3(x3 x3Var) {
        this.a = x3Var;
    }

    public final int a(a aVar) {
        int i10;
        x3 x3Var = this.a;
        int indexOf = x3Var.j3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= x3Var.j3.size() || ((a) x3Var.j3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        x3 x3Var = this.a;
        int indexOf = x3Var.j3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) x3Var.j3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        x3 x3Var = this.a;
        v3 v3Var = x3Var.f3;
        if (i10 == 7) {
            x3Var.S4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        x3Var.Z3 = null;
        x3Var.a4 = aVar;
        h2 h2Var = x3Var.H3;
        if (h2Var != null) {
            h2Var.d();
        }
        if (aVar != null) {
            i6.f(aVar.b, "");
            View A1 = x3Var.A1(aVar);
            if (A1 instanceof i6) {
                ((i6) A1).getEditText().setTextSilently("");
            }
        }
        h2 h2Var2 = x3Var.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        switch (i10) {
            case 1:
                v3Var.m(3);
                break;
            case 2:
                v3Var.m(6);
                break;
            case 3:
                r.X(x3Var.getContext(), "", new p1(x3Var, 1), x3Var.e3);
                break;
            case 4:
            case 5:
                v3Var.m(1);
                break;
            case 6:
                x3Var.u3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        x3 x3Var = this.a;
        if (!z12) {
            x3Var.S4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = x3Var.Y4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (x3Var.j3.indexOf(aVar) < 0 || x3.y3(aVar) || aVar.i) {
                return;
            }
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !i6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (i6.p(aVar.b)) {
                    long a2 = p0.a();
                    TL_iv.RichText k10 = i6.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        x3Var.k3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(p0.a()));
            }
            x3Var.t4();
            if (z13 && (x3Var.findFocus() instanceof h1)) {
                x3Var.Y1();
                h2 h2Var2 = x3Var.H3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                x3Var.e3(aVar);
                return;
            }
            x3Var.W2.N(false);
            h2 h2Var3 = x3Var.H3;
            if (h2Var3 != null) {
                h2Var3.h();
            }
            x3Var.post(new a3(x3Var, aVar, 5));
        }
    }
}

package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class d3 implements d6 {
    public final /* synthetic */ v3 a;

    public d3(v3 v3Var) {
        this.a = v3Var;
    }

    public final int a(a aVar) {
        int i10;
        v3 v3Var = this.a;
        int indexOf = v3Var.l3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= v3Var.l3.size() || ((a) v3Var.l3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        v3 v3Var = this.a;
        int indexOf = v3Var.l3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) v3Var.l3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        v3 v3Var = this.a;
        t3 t3Var = v3Var.h3;
        if (i10 == 7) {
            v3Var.Q4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        v3Var.b4 = null;
        v3Var.c4 = aVar;
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        if (aVar != null) {
            g6.f(aVar.b, "");
            View y12 = v3Var.y1(aVar);
            if (y12 instanceof g6) {
                ((g6) y12).getEditText().setTextSilently("");
            }
        }
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        switch (i10) {
            case 1:
                t3Var.e(3);
                break;
            case 2:
                t3Var.e(6);
                break;
            case 3:
                r.U(v3Var.getContext(), "", new bi.o1(v3Var, 28), v3Var.g3);
                break;
            case 4:
            case 5:
                t3Var.e(1);
                break;
            case 6:
                v3Var.s3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        v3 v3Var = this.a;
        if (!z12) {
            v3Var.Q4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = v3Var.W4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (v3Var.l3.indexOf(aVar) < 0 || v3.w3(aVar) || aVar.i) {
                return;
            }
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !g6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (g6.p(aVar.b)) {
                    long a2 = p0.a();
                    TL_iv.RichText k10 = g6.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        v3Var.m3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(p0.a()));
            }
            v3Var.r4();
            if (z13 && (v3Var.findFocus() instanceof h1)) {
                v3Var.W1();
                g2 g2Var2 = v3Var.J3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                v3Var.c3(aVar);
                return;
            }
            v3Var.Y2.N(false);
            g2 g2Var3 = v3Var.J3;
            if (g2Var3 != null) {
                g2Var3.h();
            }
            v3Var.post(new y2(v3Var, aVar, 5));
        }
    }
}

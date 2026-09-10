package hi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h3 implements d6 {
    public final /* synthetic */ z3 a;

    public h3(z3 z3Var) {
        this.a = z3Var;
    }

    public final int a(a aVar) {
        int i10;
        z3 z3Var = this.a;
        int indexOf = z3Var.l3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= z3Var.l3.size() || ((a) z3Var.l3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        z3 z3Var = this.a;
        int indexOf = z3Var.l3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) z3Var.l3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        z3 z3Var = this.a;
        x3 x3Var = z3Var.h3;
        if (i10 == 7) {
            z3Var.Q4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        z3Var.b4 = null;
        z3Var.c4 = aVar;
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.d();
        }
        if (aVar != null) {
            g6.f(aVar.b, "");
            View y12 = z3Var.y1(aVar);
            if (y12 instanceof g6) {
                ((g6) y12).getEditText().setTextSilently("");
            }
        }
        k2 k2Var2 = z3Var.J3;
        if (k2Var2 != null) {
            k2Var2.h();
        }
        switch (i10) {
            case 1:
                x3Var.q(3);
                break;
            case 2:
                x3Var.q(6);
                break;
            case 3:
                s.U(z3Var.getContext(), "", new ai.b(z3Var, 24), z3Var.g3);
                break;
            case 4:
            case 5:
                x3Var.q(1);
                break;
            case 6:
                z3Var.s3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        z3 z3Var = this.a;
        if (!z12) {
            z3Var.Q4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = z3Var.W4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (z3Var.l3.indexOf(aVar) < 0 || z3.w3(aVar) || aVar.i) {
                return;
            }
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !g6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (g6.p(aVar.b)) {
                    long a2 = r0.a();
                    TL_iv.RichText k10 = g6.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        z3Var.m3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(r0.a()));
            }
            z3Var.r4();
            if (z13 && (z3Var.findFocus() instanceof k1)) {
                z3Var.W1();
                k2 k2Var2 = z3Var.J3;
                if (k2Var2 != null) {
                    k2Var2.h();
                }
                z3Var.c3(aVar);
                return;
            }
            z3Var.Y2.N(false);
            k2 k2Var3 = z3Var.J3;
            if (k2Var3 != null) {
                k2Var3.h();
            }
            z3Var.post(new c3(z3Var, aVar, 5));
        }
    }
}

package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class c3 implements x5 {
    public final /* synthetic */ t3 a;

    public c3(t3 t3Var) {
        this.a = t3Var;
    }

    public final int a(a aVar) {
        int i7;
        t3 t3Var = this.a;
        int indexOf = t3Var.s3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf < 0 || (i7 = indexOf + 1) >= t3Var.s3.size() || ((a) t3Var.s3.get(i7)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        t3 t3Var = this.a;
        int indexOf = t3Var.s3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf <= 0 || ((a) t3Var.s3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i7) {
        t3 t3Var = this.a;
        r3 r3Var = t3Var.o3;
        if (i7 == 7) {
            t3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        t3Var.i4 = null;
        t3Var.j4 = aVar;
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        if (aVar != null) {
            a6.e(aVar.b, "");
            View C1 = t3Var.C1(aVar);
            if (C1 instanceof a6) {
                ((a6) C1).getEditText().setTextSilently("");
            }
        }
        f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        switch (i7) {
            case 1:
                r3Var.g(3);
                break;
            case 2:
                r3Var.g(6);
                break;
            case 3:
                p.Z(t3Var.getContext(), "", new ii.c(t3Var, 12), t3Var.n3);
                break;
            case 4:
            case 5:
                r3Var.g(1);
                break;
            case 6:
                t3Var.w3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z9, boolean z10) {
        boolean z11 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        t3 t3Var = this.a;
        if (!z11) {
            t3Var.U4(aVar, pageBlock, i7, i10, z9, z10);
            return;
        }
        if (aVar == null) {
            aVar = t3Var.a5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (t3Var.s3.indexOf(aVar) < 0 || t3.A3(aVar) || aVar.i) {
                return;
            }
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            boolean z12 = arrayList.isEmpty() && !a6.p(aVar.b);
            if (z12) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (a6.p(aVar.b)) {
                    long a10 = n0.a();
                    TL_iv.RichText j3 = a6.j(aVar.b);
                    if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                        t3Var.t3.put(Long.valueOf(a10), j3);
                    }
                    arrayList.add(Long.valueOf(a10));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(n0.a()));
            }
            t3Var.v4();
            if (z12 && (t3Var.findFocus() instanceof g1)) {
                t3Var.b2();
                f2 f2Var2 = t3Var.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                t3Var.g3(aVar);
                return;
            }
            t3Var.f3.O(false);
            f2 f2Var3 = t3Var.Q3;
            if (f2Var3 != null) {
                f2Var3.h();
            }
            t3Var.post(new x2(t3Var, aVar, 5));
        }
    }
}

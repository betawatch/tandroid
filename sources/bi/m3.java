package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class m3 implements n6 {
    public final /* synthetic */ d4 a;

    public m3(d4 d4Var) {
        this.a = d4Var;
    }

    public final int a(a aVar) {
        int i10;
        d4 d4Var = this.a;
        int indexOf = d4Var.s3.indexOf(aVar);
        return org.telegram.messenger.i0.L((indexOf < 0 || (i10 = indexOf + 1) >= d4Var.s3.size() || ((a) d4Var.s3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        d4 d4Var = this.a;
        int indexOf = d4Var.s3.indexOf(aVar);
        return org.telegram.messenger.i0.L((indexOf <= 0 || ((a) d4Var.s3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        d4 d4Var = this.a;
        b4 b4Var = d4Var.o3;
        if (i10 == 7) {
            d4Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        d4Var.i4 = null;
        d4Var.j4 = aVar;
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        if (aVar != null) {
            q6.e(aVar.b, "");
            View C1 = d4Var.C1(aVar);
            if (C1 instanceof q6) {
                ((q6) C1).getEditText().setTextSilently("");
            }
        }
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        switch (i10) {
            case 1:
                b4Var.p(3);
                break;
            case 2:
                b4Var.p(6);
                break;
            case 3:
                t.X(d4Var.getContext(), "", new ag.l(d4Var, 9), d4Var.n3);
                break;
            case 4:
            case 5:
                b4Var.p(1);
                break;
            case 6:
                d4Var.w3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        d4 d4Var = this.a;
        if (!z12) {
            d4Var.U4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = d4Var.a5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (d4Var.s3.indexOf(aVar) < 0 || d4.A3(aVar) || aVar.i) {
                return;
            }
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !q6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (q6.p(aVar.b)) {
                    long a2 = r0.a();
                    TL_iv.RichText k10 = q6.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        d4Var.t3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(r0.a()));
            }
            d4Var.v4();
            if (z13 && (d4Var.findFocus() instanceof n1)) {
                d4Var.a2();
                o2 o2Var2 = d4Var.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                d4Var.g3(aVar);
                return;
            }
            d4Var.f3.O(false);
            o2 o2Var3 = d4Var.Q3;
            if (o2Var3 != null) {
                o2Var3.h();
            }
            d4Var.post(new h3(d4Var, aVar, 5));
        }
    }
}

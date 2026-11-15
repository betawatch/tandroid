package oi;

import android.view.View;
import hi.g7;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class a3 implements v5 {
    public final /* synthetic */ q3 a;

    public a3(q3 q3Var) {
        this.a = q3Var;
    }

    public final int a(a aVar) {
        int i7;
        q3 q3Var = this.a;
        int indexOf = q3Var.t3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf < 0 || (i7 = indexOf + 1) >= q3Var.t3.size() || ((a) q3Var.t3.get(i7)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        q3 q3Var = this.a;
        int indexOf = q3Var.t3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf <= 0 || ((a) q3Var.t3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i7) {
        q3 q3Var = this.a;
        o3 o3Var = q3Var.p3;
        if (i7 == 7) {
            q3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        q3Var.j4 = null;
        q3Var.k4 = aVar;
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
        }
        if (aVar != null) {
            y5.e(aVar.b, "");
            View C1 = q3Var.C1(aVar);
            if (C1 instanceof y5) {
                ((y5) C1).getEditText().setTextSilently("");
            }
        }
        d2 d2Var2 = q3Var.R3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        switch (i7) {
            case 1:
                o3Var.s(3);
                break;
            case 2:
                o3Var.s(6);
                break;
            case 3:
                o.Z(q3Var.getContext(), "", new g7(q3Var, 17), q3Var.o3);
                break;
            case 4:
            case 5:
                o3Var.s(1);
                break;
            case 6:
                q3Var.w3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        q3 q3Var = this.a;
        if (!z12) {
            q3Var.U4(aVar, pageBlock, i7, i10, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = q3Var.a5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (q3Var.t3.indexOf(aVar) < 0 || q3.A3(aVar) || aVar.i) {
                return;
            }
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !y5.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (y5.p(aVar.b)) {
                    long a10 = l0.a();
                    TL_iv.RichText j3 = y5.j(aVar.b);
                    if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                        q3Var.u3.put(Long.valueOf(a10), j3);
                    }
                    arrayList.add(Long.valueOf(a10));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(l0.a()));
            }
            q3Var.v4();
            if (z13 && (q3Var.findFocus() instanceof e1)) {
                q3Var.b2();
                d2 d2Var2 = q3Var.R3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                q3Var.g3(aVar);
                return;
            }
            q3Var.g3.O(false);
            d2 d2Var3 = q3Var.R3;
            if (d2Var3 != null) {
                d2Var3.h();
            }
            q3Var.post(new v2(q3Var, aVar, 5));
        }
    }
}

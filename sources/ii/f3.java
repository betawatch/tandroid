package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class f3 implements c6 {
    public final /* synthetic */ x3 a;

    public f3(x3 x3Var) {
        this.a = x3Var;
    }

    public final int a(a aVar) {
        int i10;
        x3 x3Var = this.a;
        int indexOf = x3Var.s3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= x3Var.s3.size() || ((a) x3Var.s3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        x3 x3Var = this.a;
        int indexOf = x3Var.s3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) x3Var.s3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        x3 x3Var = this.a;
        v3 v3Var = x3Var.o3;
        if (i10 == 7) {
            x3Var.T4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        x3Var.i4 = null;
        x3Var.j4 = aVar;
        i2 i2Var = x3Var.Q3;
        if (i2Var != null) {
            i2Var.d();
        }
        if (aVar != null) {
            f6.f(aVar.b, "");
            View B1 = x3Var.B1(aVar);
            if (B1 instanceof f6) {
                ((f6) B1).getEditText().setTextSilently("");
            }
        }
        i2 i2Var2 = x3Var.Q3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        switch (i10) {
            case 1:
                v3Var.r(3);
                break;
            case 2:
                v3Var.r(6);
                break;
            case 3:
                r.S(x3Var.getContext(), "", new q1(x3Var, 1), x3Var.n3);
                break;
            case 4:
            case 5:
                v3Var.r(1);
                break;
            case 6:
                x3Var.v3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        x3 x3Var = this.a;
        if (!z12) {
            x3Var.T4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = x3Var.Z4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (x3Var.s3.indexOf(aVar) < 0 || x3.z3(aVar) || aVar.i) {
                return;
            }
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !f6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (f6.p(aVar.b)) {
                    long a2 = q0.a();
                    TL_iv.RichText k10 = f6.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        x3Var.t3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(q0.a()));
            }
            x3Var.u4();
            if (z13 && (x3Var.findFocus() instanceof i1)) {
                x3Var.Z1();
                i2 i2Var2 = x3Var.Q3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.f3(aVar);
                return;
            }
            x3Var.f3.N(false);
            i2 i2Var3 = x3Var.Q3;
            if (i2Var3 != null) {
                i2Var3.h();
            }
            x3Var.post(new a3(x3Var, aVar, 5));
        }
    }
}

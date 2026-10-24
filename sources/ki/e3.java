package ki;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class e3 implements z5 {
    public final /* synthetic */ w3 a;

    public e3(w3 w3Var) {
        this.a = w3Var;
    }

    public final int a(a aVar) {
        int i10;
        w3 w3Var = this.a;
        int indexOf = w3Var.m3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= w3Var.m3.size() || ((a) w3Var.m3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        w3 w3Var = this.a;
        int indexOf = w3Var.m3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) w3Var.m3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        w3 w3Var = this.a;
        u3 u3Var = w3Var.i3;
        if (i10 == 7) {
            w3Var.X4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        w3Var.c4 = null;
        w3Var.d4 = aVar;
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        if (aVar != null) {
            c6.e(aVar.b, "");
            View F1 = w3Var.F1(aVar);
            if (F1 instanceof c6) {
                ((c6) F1).getEditText().setTextSilently("");
            }
        }
        h2 h2Var2 = w3Var.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        switch (i10) {
            case 1:
                u3Var.m(3);
                break;
            case 2:
                u3Var.m(6);
                break;
            case 3:
                q.X(w3Var.getContext(), "", new ig.k0(w3Var, 7), w3Var.h3);
                break;
            case 4:
            case 5:
                u3Var.m(1);
                break;
            case 6:
                w3Var.z3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        w3 w3Var = this.a;
        if (!z12) {
            w3Var.X4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = w3Var.d5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (w3Var.m3.indexOf(aVar) < 0 || w3.D3(aVar) || aVar.i) {
                return;
            }
            h2 h2Var = w3Var.K3;
            if (h2Var != null) {
                h2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !c6.o(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (c6.o(aVar.b)) {
                    long a2 = p0.a();
                    TL_iv.RichText j10 = c6.j(aVar.b);
                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                        w3Var.n3.put(Long.valueOf(a2), j10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(p0.a()));
            }
            w3Var.y4();
            if (z13 && (w3Var.findFocus() instanceof h1)) {
                w3Var.d2();
                h2 h2Var2 = w3Var.K3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.j3(aVar);
                return;
            }
            w3Var.Z2.N(false);
            h2 h2Var3 = w3Var.K3;
            if (h2Var3 != null) {
                h2Var3.h();
            }
            w3Var.post(new z2(w3Var, aVar, 5));
        }
    }
}

package mi;

import android.view.View;
import gi.j8;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class d3 implements y5 {
    public final /* synthetic */ t3 a;

    public d3(t3 t3Var) {
        this.a = t3Var;
    }

    public final int a(a aVar) {
        int i3;
        t3 t3Var = this.a;
        int indexOf = t3Var.t3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf < 0 || (i3 = indexOf + 1) >= t3Var.t3.size() || ((a) t3Var.t3.get(i3)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        t3 t3Var = this.a;
        int indexOf = t3Var.t3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf <= 0 || ((a) t3Var.t3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i3) {
        t3 t3Var = this.a;
        r3 r3Var = t3Var.p3;
        if (i3 == 7) {
            t3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        t3Var.j4 = null;
        t3Var.k4 = aVar;
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        if (aVar != null) {
            b6.e(aVar.b, "");
            View C1 = t3Var.C1(aVar);
            if (C1 instanceof b6) {
                ((b6) C1).getEditText().setTextSilently("");
            }
        }
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        switch (i3) {
            case 1:
                r3Var.O(3);
                break;
            case 2:
                r3Var.O(6);
                break;
            case 3:
                p.Z(t3Var.getContext(), "", new j8(t3Var, 15), t3Var.o3);
                break;
            case 4:
            case 5:
                r3Var.O(1);
                break;
            case 6:
                t3Var.w3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i3, int i10, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        t3 t3Var = this.a;
        if (!z12) {
            t3Var.U4(aVar, pageBlock, i3, i10, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = t3Var.a5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (t3Var.t3.indexOf(aVar) < 0 || t3.A3(aVar) || aVar.i) {
                return;
            }
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !b6.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (b6.p(aVar.b)) {
                    long a10 = o0.a();
                    TL_iv.RichText j10 = b6.j(aVar.b);
                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                        t3Var.u3.put(Long.valueOf(a10), j10);
                    }
                    arrayList.add(Long.valueOf(a10));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(o0.a()));
            }
            t3Var.v4();
            if (z13 && (t3Var.findFocus() instanceof h1)) {
                t3Var.b2();
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.g3(aVar);
                return;
            }
            t3Var.g3.O(false);
            g2 g2Var3 = t3Var.R3;
            if (g2Var3 != null) {
                g2Var3.h();
            }
            t3Var.post(new y2(t3Var, aVar, 5));
        }
    }
}

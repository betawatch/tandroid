package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p0 {
    public final RecyclerView a;

    public /* synthetic */ p0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(o1 o1Var, d5.p pVar, d5.p pVar2) {
        boolean z10;
        o1 T;
        int i10;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(o1Var);
        recyclerView.h(o1Var);
        o1Var.q(false);
        r1 r1Var = (r1) recyclerView.V;
        r1Var.getClass();
        int i11 = pVar.a;
        int i12 = pVar.b;
        View view = o1Var.a;
        int left = pVar2 == null ? view.getLeft() : pVar2.a;
        int top = pVar2 == null ? view.getTop() : pVar2.b;
        if (o1Var.j() || (i11 == left && i12 == top)) {
            int i13 = o1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            o1Var.i = (o1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            r1Var.s(o1Var, pVar);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = r1Var.r(o1Var, pVar, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void b(o1 o1Var) {
        RecyclerView recyclerView = this.a;
        x0 x0Var = recyclerView.x;
        View view = o1Var.a;
        e1 e1Var = recyclerView.b;
        a5.n nVar = x0Var.a;
        a9.i iVar = (a9.i) nVar.b;
        int indexOfChild = ((RecyclerView) iVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) nVar.c).K(indexOfChild)) {
                nVar.z(view);
            }
            iVar.P(indexOfChild);
        }
        e1Var.g(view);
    }
}

package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n0 {
    public final RecyclerView a;

    public /* synthetic */ n0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(l1 l1Var, c5.e eVar, c5.e eVar2) {
        boolean z4;
        l1 T;
        int i10;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(l1Var);
        recyclerView.h(l1Var);
        l1Var.q(false);
        o1 o1Var = (o1) recyclerView.W;
        o1Var.getClass();
        int i11 = eVar.a;
        int i12 = eVar.b;
        View view = l1Var.a;
        int left = eVar2 == null ? view.getLeft() : eVar2.a;
        int top = eVar2 == null ? view.getTop() : eVar2.b;
        if (l1Var.j() || (i11 == left && i12 == top)) {
            int i13 = l1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            l1Var.i = (l1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            o1Var.s(l1Var, eVar);
            z4 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z4 = o1Var.r(l1Var, eVar, i11, i12, left, top);
        }
        if (z4) {
            recyclerView.l0();
        }
    }

    public void b(l1 l1Var) {
        RecyclerView recyclerView = this.a;
        v0 v0Var = recyclerView.x;
        View view = l1Var.a;
        af.h hVar = recyclerView.b;
        af.d dVar = v0Var.a;
        bb.b bVar = (bb.b) dVar.b;
        int indexOfChild = ((RecyclerView) bVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) dVar.c).z(indexOfChild)) {
                dVar.C(view);
            }
            bVar.Q(indexOfChild);
        }
        hVar.g(view);
    }
}

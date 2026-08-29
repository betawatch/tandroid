package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o0 {
    public final RecyclerView a;

    public /* synthetic */ o0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(n1 n1Var, a5.e eVar, a5.e eVar2) {
        boolean z10;
        n1 T;
        int i10;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(n1Var);
        recyclerView.h(n1Var);
        n1Var.q(false);
        q1 q1Var = (q1) recyclerView.V;
        q1Var.getClass();
        int i11 = eVar.a;
        int i12 = eVar.b;
        View view = n1Var.a;
        int left = eVar2 == null ? view.getLeft() : eVar2.a;
        int top = eVar2 == null ? view.getTop() : eVar2.b;
        if (n1Var.j() || (i11 == left && i12 == top)) {
            int i13 = n1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            n1Var.i = (n1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            q1Var.s(n1Var, eVar);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = q1Var.r(n1Var, eVar, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void b(n1 n1Var) {
        RecyclerView recyclerView = this.a;
        w0 w0Var = recyclerView.x;
        View view = n1Var.a;
        d1 d1Var = recyclerView.b;
        androidx.biometric.e eVar = w0Var.a;
        ag.o1 o1Var = (ag.o1) eVar.b;
        int indexOfChild = ((RecyclerView) o1Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) eVar.c).G(indexOfChild)) {
                eVar.B(view);
            }
            o1Var.k(indexOfChild);
        }
        d1Var.g(view);
    }
}

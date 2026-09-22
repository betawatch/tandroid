package hh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import e6.n;
import k2.c0;
import org.telegram.messenger.MediaDataController;
import s4.c1;
import s4.f1;
import s4.o0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h {
    public final RecyclerView a;

    public /* synthetic */ h(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(c1 c1Var, q0 q0Var, q0 q0Var2) {
        boolean z10;
        c1 T;
        int i10;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = c1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void b(c1 c1Var) {
        RecyclerView recyclerView = this.a;
        o0 o0Var = recyclerView.x;
        View view = c1Var.a;
        of.e eVar = recyclerView.b;
        lf.i iVar = o0Var.a;
        c0 c0Var = (c0) iVar.b;
        int indexOfChild = ((RecyclerView) c0Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((n) iVar.c).B(indexOfChild)) {
                iVar.Y(view);
            }
            c0Var.r(indexOfChild);
        }
        eVar.g(view);
    }
}

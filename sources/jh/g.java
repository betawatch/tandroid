package jh;

import a8.ua;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e2.r0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;
import v4.d1;
import v4.f1;
import v4.n0;
import v4.v0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g {
    public final RecyclerView a;

    public /* synthetic */ g(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(d1 d1Var, r0 r0Var, r0 r0Var2) {
        boolean z9;
        d1 T;
        int i7;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        f1 f1Var = (f1) recyclerView.c0;
        f1Var.getClass();
        int i10 = r0Var.a;
        int i11 = r0Var.b;
        View view = d1Var.a;
        int left = r0Var2 == null ? view.getLeft() : r0Var2.a;
        int top = r0Var2 == null ? view.getTop() : r0Var2.b;
        if (d1Var.j() || (i10 == left && i11 == top)) {
            int i12 = d1Var.h;
            int i13 = -1;
            if (i12 != -1) {
                for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                    View childAt = recyclerView.getChildAt(i14);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i7 = T.h) >= 0 && i7 < i12 && i7 > i13) {
                        i13 = i7;
                    }
                }
            }
            d1Var.i = (d1Var.h - i13) + (i13 * 1000);
            f1Var.s(d1Var, r0Var);
            z9 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z9 = f1Var.r(d1Var, r0Var, i10, i11, left, top);
        }
        if (z9) {
            recyclerView.m0();
        }
    }

    public void b(d1 d1Var) {
        RecyclerView recyclerView = this.a;
        n0 n0Var = recyclerView.y;
        View view = d1Var.a;
        v0 v0Var = recyclerView.b;
        hy0 hy0Var = n0Var.a;
        uy uyVar = (uy) hy0Var.b;
        int indexOfChild = ((RecyclerView) uyVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ua) hy0Var.c).G(indexOfChild)) {
                hy0Var.M(view);
            }
            uyVar.Q(indexOfChild);
        }
        v0Var.g(view);
    }
}

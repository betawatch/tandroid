package jh;

import a8.va;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e2.r0;
import org.telegram.ui.Components.of;
import org.telegram.ui.nd0;
import v4.f1;
import v4.h1;
import v4.p0;
import v4.x0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g {
    public final RecyclerView a;

    public /* synthetic */ g(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(f1 f1Var, r0 r0Var, r0 r0Var2) {
        boolean z10;
        f1 T;
        int i7;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(f1Var);
        recyclerView.h(f1Var);
        f1Var.q(false);
        h1 h1Var = (h1) recyclerView.d0;
        h1Var.getClass();
        int i10 = r0Var.a;
        int i11 = r0Var.b;
        View view = f1Var.a;
        int left = r0Var2 == null ? view.getLeft() : r0Var2.a;
        int top = r0Var2 == null ? view.getTop() : r0Var2.b;
        if (f1Var.j() || (i10 == left && i11 == top)) {
            int i12 = f1Var.h;
            int i13 = -1;
            if (i12 != -1) {
                for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                    View childAt = recyclerView.getChildAt(i14);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i7 = T.h) >= 0 && i7 < i12 && i7 > i13) {
                        i13 = i7;
                    }
                }
            }
            f1Var.i = (f1Var.h - i13) + (i13 * 1000);
            h1Var.s(f1Var, r0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = h1Var.r(f1Var, r0Var, i10, i11, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(f1 f1Var) {
        RecyclerView recyclerView = this.a;
        p0 p0Var = recyclerView.y;
        View view = f1Var.a;
        x0 x0Var = recyclerView.b;
        nd0 nd0Var = p0Var.a;
        of ofVar = (of) nd0Var.b;
        int indexOfChild = ((RecyclerView) ofVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((va) nd0Var.c).I(indexOfChild)) {
                nd0Var.K(view);
            }
            ofVar.x0(indexOfChild);
        }
        x0Var.g(view);
    }
}

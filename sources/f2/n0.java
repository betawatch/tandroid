package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n0 {
    public final RecyclerView a;

    public /* synthetic */ n0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(a aVar) {
        int i10 = aVar.a;
        RecyclerView recyclerView = this.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.a;
        int v = recyclerView.e.v();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < v; i15++) {
            View u10 = recyclerView.e.u(i15);
            l1 U = RecyclerView.U(u10);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((w0) u10.getLayoutParams()).c = true;
            }
        }
        bf.f fVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) fVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            l1 l1Var = (l1) arrayList2.get(size);
            if (l1Var != null && (i12 = l1Var.c) >= i10 && i12 < i14) {
                l1Var.a(2);
                fVar.f(size);
            }
        }
        recyclerView.u0 = true;
    }

    public void c(int i10, int i11) {
        RecyclerView recyclerView = this.a;
        int v = recyclerView.e.v();
        for (int i12 = 0; i12 < v; i12++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.q0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            l1 l1Var = (l1) arrayList.get(i13);
            if (l1Var != null && l1Var.c >= i10) {
                l1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.t0 = true;
    }

    public void d(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.a;
        int v = recyclerView.e.v();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < v; i20++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.q0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            l1 l1Var = (l1) arrayList.get(i21);
            if (l1Var != null && (i17 = l1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    l1Var.n(i11 - i10, false);
                } else {
                    l1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.t0 = true;
    }
}

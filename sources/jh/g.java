package jh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import v4.f1;
import v4.q0;
import v4.x0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g {
    public final RecyclerView a;

    public /* synthetic */ g(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(v4.a aVar) {
        int i7 = aVar.a;
        RecyclerView recyclerView = this.a;
        if (i7 == 1) {
            recyclerView.y.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i7 == 2) {
            recyclerView.y.Y(recyclerView, aVar.b, aVar.d);
        } else if (i7 == 4) {
            recyclerView.y.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.y.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public void b(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.a;
        int F = recyclerView.e.F();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < F; i14++) {
            View E = recyclerView.e.E(i14);
            f1 U = RecyclerView.U(E);
            if (U != null && !U.r() && (i12 = U.c) >= i7 && i12 < i13) {
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
                ((q0) E.getLayoutParams()).c = true;
            }
        }
        x0 x0Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) x0Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            f1 f1Var = (f1) arrayList2.get(size);
            if (f1Var != null && (i11 = f1Var.c) >= i7 && i11 < i13) {
                f1Var.a(2);
                x0Var.f(size);
            }
        }
        recyclerView.z0 = true;
    }

    public void c(int i7, int i10) {
        RecyclerView recyclerView = this.a;
        int F = recyclerView.e.F();
        for (int i11 = 0; i11 < F; i11++) {
            f1 U = RecyclerView.U(recyclerView.e.E(i11));
            if (U != null && !U.r() && U.c >= i7) {
                U.n(i10, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            f1 f1Var = (f1) arrayList.get(i12);
            if (f1Var != null && f1Var.c >= i7) {
                f1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    public void d(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.a;
        int F = recyclerView.e.F();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < F; i19++) {
            f1 U = RecyclerView.U(recyclerView.e.E(i19));
            if (U != null && (i17 = U.c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            f1 f1Var = (f1) arrayList.get(i20);
            if (f1Var != null && (i16 = f1Var.c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    f1Var.n(i10 - i7, false);
                } else {
                    f1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }
}

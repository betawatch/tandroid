package kh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import u4.d1;
import u4.p0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g {
    public final RecyclerView a;

    public /* synthetic */ g(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(u4.a aVar) {
        int i3 = aVar.a;
        RecyclerView recyclerView = this.a;
        if (i3 == 1) {
            recyclerView.y.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i3 == 2) {
            recyclerView.y.Y(recyclerView, aVar.b, aVar.d);
        } else if (i3 == 4) {
            recyclerView.y.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i3 != 8) {
                return;
            }
            recyclerView.y.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public void b(int i3, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.a;
        int u10 = recyclerView.e.u();
        int i13 = i10 + i3;
        for (int i14 = 0; i14 < u10; i14++) {
            View t10 = recyclerView.e.t(i14);
            d1 U = RecyclerView.U(t10);
            if (U != null && !U.r() && (i12 = U.c) >= i3 && i12 < i13) {
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
                ((p0) t10.getLayoutParams()).c = true;
            }
        }
        tf.e eVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) arrayList2.get(size);
            if (d1Var != null && (i11 = d1Var.c) >= i3 && i11 < i13) {
                d1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.z0 = true;
    }

    public void c(int i3, int i10) {
        RecyclerView recyclerView = this.a;
        int u10 = recyclerView.e.u();
        for (int i11 = 0; i11 < u10; i11++) {
            d1 U = RecyclerView.U(recyclerView.e.t(i11));
            if (U != null && !U.r() && U.c >= i3) {
                U.n(i10, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d1 d1Var = (d1) arrayList.get(i12);
            if (d1Var != null && d1Var.c >= i3) {
                d1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    public void d(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.a;
        int u10 = recyclerView.e.u();
        int i18 = -1;
        if (i3 < i10) {
            i12 = i3;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i3;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < u10; i19++) {
            d1 U = RecyclerView.U(recyclerView.e.t(i19));
            if (U != null && (i17 = U.c) >= i12 && i17 <= i11) {
                if (i17 == i3) {
                    U.n(i10 - i3, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i3 < i10) {
            i15 = i3;
            i14 = i10;
        } else {
            i14 = i3;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            d1 d1Var = (d1) arrayList.get(i20);
            if (d1Var != null && (i16 = d1Var.c) >= i15 && i16 <= i14) {
                if (i16 == i3) {
                    d1Var.n(i10 - i3, false);
                } else {
                    d1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }
}

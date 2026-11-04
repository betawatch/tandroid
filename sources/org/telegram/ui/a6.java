package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements qe.b, v50, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.ct0, org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ a6(z6 z6Var, int i3) {
        this.a = i3;
        this.b = z6Var;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
        int i10 = this.a;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                z6Var.z0();
                z6Var.fragmentView.invalidate();
                break;
            default:
                z6.a0(this.b, f10);
                break;
        }
    }

    @Override // org.telegram.ui.v50
    public void a(int i3) {
        org.telegram.messenger.g0.b4(this.b.b);
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        z6 z6Var = this.b;
        ArrayList arrayList = z6Var.g0;
        if (z6Var.getParentActivity() != null && i3 >= 0 && i3 < arrayList.size()) {
            v6 v6Var = (v6) arrayList.get(i3);
            int i10 = 0;
            int i11 = 1;
            if (v6Var.a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i12 = v6Var.f;
                if (i12 < 0) {
                    z6Var.M = !z6Var.M;
                    z6Var.A0(true);
                    z6Var.y0();
                    return;
                }
                boolean[] zArr = z6Var.d;
                if (i12 < 0) {
                    z6Var.x0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && z6Var.w0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        org.telegram.messenger.p2.E.a();
                        org.telegram.messenger.g0.G3(-3.0f, view, null);
                        return;
                    }
                }
                int i15 = v6Var.f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (v6Var.i) {
                    while (true) {
                        if (i10 >= z6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            z6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((v6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(z6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                z6Var.y0();
                return;
            }
            if (v6Var.c >= 0) {
                y50 y50Var = new y50(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.f1 P = org.telegram.ui.Components.t4.P(z6Var, y50Var, view, f10, f11);
                int i16 = ((v6) arrayList.get(i3)).c;
                y50Var.d0 = i16;
                FrameLayout frameLayout = y50Var.i0;
                org.telegram.ui.ActionBar.y0 y0Var = y50Var.W;
                org.telegram.ui.ActionBar.y0 y0Var2 = y50Var.a0;
                org.telegram.ui.Components.s70 s70Var = y50Var.U;
                x50 x50Var = y50Var.c0;
                if (i16 == 3) {
                    y0Var2.setVisibility(0);
                    y0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    x50Var.setVisibility(8);
                    s70Var.setVisibility(8);
                } else {
                    y0Var2.setVisibility(8);
                    y0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    x50Var.setVisibility(0);
                    s70Var.setVisibility(0);
                }
                ArrayList d = y50Var.e0.d(i16);
                y50Var.g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.d2 d2Var = y50Var.h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.k5 k5Var = x50Var.a;
                    org.telegram.ui.Components.x8 x8Var = x50Var.b;
                    k5Var.l(org.telegram.messenger.bd.M0(2131754475, null), false);
                    x50Var.a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    x8Var.b(0, d2Var.getCurrentAccount(), null);
                    x8Var.b(1, d2Var.getCurrentAccount(), null);
                    x8Var.b(2, d2Var.getCurrentAccount(), null);
                    x8Var.a(false);
                } else {
                    int min = Math.min(3, y50Var.g0.size());
                    org.telegram.ui.ActionBar.k5 k5Var2 = x50Var.a;
                    org.telegram.ui.Components.x8 x8Var2 = x50Var.b;
                    k5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    x50Var.a.l(org.telegram.messenger.bd.G(y50Var.g0.size(), "ExceptionShort", Integer.valueOf(y50Var.g0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        x8Var2.b(i17, d2Var.getCurrentAccount(), d2Var.getMessagesController().e2(((org.telegram.messenger.s2) y50Var.g0.get(i17)).a));
                    }
                    x8Var2.a(false);
                }
                y50Var.V.setVisibility(8);
                s70Var.setVisibility(8);
                y50Var.g();
                y50Var.setParentWindow(P);
                y50Var.setCallback(new a6(z6Var, i11));
            }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ct0
    public int c() {
        return this.b.S;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        z6 z6Var = this.b;
        di.c cVar = z6Var.e0;
        LongSparseArray longSparseArray = cVar.c;
        t6 t6Var = new t6(0L);
        Iterator it = cVar.j.iterator();
        while (it.hasNext()) {
            di.b bVar = (di.b) it.next();
            t6Var.a(bVar, bVar.d);
            t6 t6Var2 = (t6) longSparseArray.get(bVar.b);
            if (t6Var2 != null) {
                t6Var2.b(bVar);
                if (t6Var2.c <= 0) {
                    longSparseArray.remove(bVar.b);
                    cVar.b.remove(t6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (t6Var.c > 0) {
            z6Var.o0(t6Var, null, null);
        }
        z6Var.e0.d();
        k6 k6Var = z6Var.N;
        if (k6Var != null) {
            k6Var.d();
            z6Var.N.f(false);
        }
        z6Var.A0(true);
        z6Var.y0();
    }

    private final /* synthetic */ void d(float f10, int i3) {
    }

    private final /* synthetic */ void e(float f10, int i3) {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}

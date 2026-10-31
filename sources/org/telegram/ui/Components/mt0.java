package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mt0 extends ak0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ zt0 f;

    public mt0(zt0 zt0Var, Context context, int i10) {
        this.f = zt0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        ArrayList arrayList = this.f.v1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((xs0) arrayList.get(i11)).b) {
                return ((xs0) arrayList.get(i11)).a;
            }
        }
        return ((xs0) i0.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        float e = f7 * ((e() * measuredHeight) - (tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void J(tk0 tk0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tk0Var.getChildCount() && (i10 = zt0.n(tk0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.a0(this.d, tk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ak0
    public final void K() {
        this.e = true;
        ss0 e02 = this.f.e0(this.d);
        if (e02 != null) {
            zt0.p(e02, null, false);
        }
    }

    @Override // s4.g0
    public final int b() {
        ot0[] ot0VarArr = this.f.v1;
        int i10 = this.d;
        ot0 ot0Var = ot0VarArr[i10];
        if (ot0Var.o) {
            return ot0Var.e();
        }
        if (ot0Var.a.size() == 0 && !ot0VarArr[i10].g) {
            return 1;
        }
        if (ot0VarArr[i10].a.size() == 0) {
            ot0 ot0Var2 = ot0VarArr[i10];
            boolean[] zArr = ot0Var2.i;
            if ((!zArr[0] || !zArr[1]) && ot0Var2.l) {
                return 0;
            }
        }
        if (ot0VarArr[i10].e() != 0) {
            return Math.max(ot0VarArr[i10].e(), ot0VarArr[i10].c().size() + ot0VarArr[i10].d());
        }
        int size = ot0VarArr[i10].c().size() + ot0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        ot0 ot0Var3 = ot0VarArr[i10];
        boolean[] zArr2 = ot0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = ot0Var3.r;
        if ((z10 ? ot0Var3.u : ot0Var3.n) != 0) {
            return (z10 ? ot0Var3.u : ot0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        ot0[] ot0VarArr = this.f.v1;
        int i11 = this.d;
        if (ot0VarArr[i11].c.size() == 0 && !ot0VarArr[i11].g) {
            return 9;
        }
        ot0 ot0Var = ot0VarArr[i11];
        int i12 = ot0Var.m;
        if (i10 < i12 || i10 >= ot0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // s4.g0
    public final int e() {
        return this.f.v1[this.d].e();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        zt0 zt0Var = this.f;
        long j10 = zt0Var.l1;
        SparseArray[] sparseArrayArr = zt0Var.b1;
        ot0 ot0Var = zt0Var.v1[this.d];
        ArrayList arrayList = ot0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10 - ot0Var.m);
                l7Var.c(jjVar, i10 != arrayList.size() - 1);
                if (zt0Var.E1) {
                    l7Var.b(sparseArrayArr[(org.telegram.messenger.jj.B0(jjVar.k) > j10 ? 1 : (org.telegram.messenger.jj.B0(jjVar.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) >= 0, !zt0Var.d1);
                    return;
                } else {
                    l7Var.b(false, !zt0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i10 - ot0Var.m);
            k7Var.f(jjVar2, i10 != arrayList.size() - 1);
            if (zt0Var.E1) {
                k7Var.e(sparseArrayArr[(org.telegram.messenger.jj.B0(jjVar2.k) > j10 ? 1 : (org.telegram.messenger.jj.B0(jjVar2.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar2.f1()) >= 0, !zt0Var.d1);
            } else {
                k7Var.e(false, !zt0Var.d1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        zt0 zt0Var = this.f;
        zz zzVar = zt0Var.D;
        ArrayList arrayList = zt0Var.I0;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                zz zzVar2 = new zz(context, p6Var);
                if (i11 == 2) {
                    zzVar2.setViewType(4);
                } else {
                    zzVar2.setViewType(3);
                }
                zzVar2.x = false;
                zzVar2.setIsSingleCell(true);
                zzVar2.setGlobalGradientView(zzVar);
                view = zzVar2;
            } else {
                if (i10 == 9) {
                    p3 V = zt0.V(i11, zt0Var.l1, context, p6Var);
                    V.setLayoutParams(new s4.o0(-1, -1));
                    return new ck0(V);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new ts0(this, context, p6Var, 1);
                } else {
                    View view3 = (View) arrayList.get(0);
                    arrayList.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                    view2 = view3;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view3);
                        view2 = view3;
                    }
                }
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                k7Var.setGlobalGradientView(zzVar);
                view = view2;
                if (i11 == 4) {
                    zt0Var.J0.add(k7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(0, context, p6Var);
            l7Var.setGlobalGradientView(zzVar);
            view = l7Var;
        }
        return sc.e.o(view, view, -1, -2);
    }
}

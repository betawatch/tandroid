package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nt0 extends bk0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ au0 f;

    public nt0(au0 au0Var, Context context, int i10) {
        this.f = au0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.bk0
    public final String F(int i10) {
        ArrayList arrayList = this.f.v1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ys0) arrayList.get(i11)).b) {
                return ((ys0) arrayList.get(i11)).a;
            }
        }
        return ((ys0) i0.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.bk0
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        float e = f7 * ((e() * measuredHeight) - (uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.bk0
    public final void J(uk0 uk0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < uk0Var.getChildCount() && (i10 = au0.n(uk0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.b0(this.d, uk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final void K() {
        this.e = true;
        ts0 f02 = this.f.f0(this.d);
        if (f02 != null) {
            au0.p(f02, null, false);
        }
    }

    @Override // s4.g0
    public final int b() {
        pt0[] pt0VarArr = this.f.v1;
        int i10 = this.d;
        pt0 pt0Var = pt0VarArr[i10];
        if (pt0Var.o) {
            return pt0Var.e();
        }
        if (pt0Var.a.size() == 0 && !pt0VarArr[i10].g) {
            return 1;
        }
        if (pt0VarArr[i10].a.size() == 0) {
            pt0 pt0Var2 = pt0VarArr[i10];
            boolean[] zArr = pt0Var2.i;
            if ((!zArr[0] || !zArr[1]) && pt0Var2.l) {
                return 0;
            }
        }
        if (pt0VarArr[i10].e() != 0) {
            return Math.max(pt0VarArr[i10].e(), pt0VarArr[i10].c().size() + pt0VarArr[i10].d());
        }
        int size = pt0VarArr[i10].c().size() + pt0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        pt0 pt0Var3 = pt0VarArr[i10];
        boolean[] zArr2 = pt0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = pt0Var3.r;
        if ((z10 ? pt0Var3.u : pt0Var3.n) != 0) {
            return (z10 ? pt0Var3.u : pt0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        pt0[] pt0VarArr = this.f.v1;
        int i11 = this.d;
        if (pt0VarArr[i11].c.size() == 0 && !pt0VarArr[i11].g) {
            return 9;
        }
        pt0 pt0Var = pt0VarArr[i11];
        int i12 = pt0Var.m;
        if (i10 < i12 || i10 >= pt0Var.a.size() + i12) {
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
        au0 au0Var = this.f;
        long j10 = au0Var.l1;
        SparseArray[] sparseArrayArr = au0Var.b1;
        pt0 pt0Var = au0Var.v1[this.d];
        ArrayList arrayList = pt0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10 - pt0Var.m);
                l7Var.c(kjVar, i10 != arrayList.size() - 1);
                if (au0Var.E1) {
                    l7Var.b(sparseArrayArr[(org.telegram.messenger.kj.B0(kjVar.k) > j10 ? 1 : (org.telegram.messenger.kj.B0(kjVar.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar.f1()) >= 0, !au0Var.d1);
                    return;
                } else {
                    l7Var.b(false, !au0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i10 - pt0Var.m);
            k7Var.f(kjVar2, i10 != arrayList.size() - 1);
            if (au0Var.E1) {
                k7Var.e(sparseArrayArr[(org.telegram.messenger.kj.B0(kjVar2.k) > j10 ? 1 : (org.telegram.messenger.kj.B0(kjVar2.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar2.f1()) >= 0, !au0Var.d1);
            } else {
                k7Var.e(false, !au0Var.d1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        au0 au0Var = this.f;
        zz zzVar = au0Var.D;
        ArrayList arrayList = au0Var.I0;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
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
                    p3 W = au0.W(i11, au0Var.l1, context, p6Var);
                    W.setLayoutParams(new s4.o0(-1, -1));
                    return new dk0(W);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new us0(this, context, p6Var, 1);
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
                    au0Var.J0.add(k7Var);
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

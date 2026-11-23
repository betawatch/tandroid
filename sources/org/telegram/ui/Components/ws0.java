package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ws0 extends kj0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ jt0 f;

    public ws0(jt0 jt0Var, Context context, int i7) {
        this.f = jt0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((js0) arrayList.get(i10)).b) {
                return ((js0) arrayList.get(i10)).a;
            }
        }
        return ((js0) i5.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void J(ek0 ek0Var) {
        if (this.e) {
            this.e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ek0Var.getChildCount() && (i7 = jt0.o(ek0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f.c0(this.d, ek0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.kj0
    public final void K() {
        this.e = true;
        ds0 g02 = this.f.g0(this.d);
        if (g02 != null) {
            jt0.s(g02, null, false);
        }
    }

    @Override // v4.i0
    public final int b() {
        ys0[] ys0VarArr = this.f.w1;
        int i7 = this.d;
        ys0 ys0Var = ys0VarArr[i7];
        if (ys0Var.o) {
            return ys0Var.e();
        }
        if (ys0Var.a.size() == 0 && !ys0VarArr[i7].g) {
            return 1;
        }
        if (ys0VarArr[i7].a.size() == 0) {
            ys0 ys0Var2 = ys0VarArr[i7];
            boolean[] zArr = ys0Var2.i;
            if ((!zArr[0] || !zArr[1]) && ys0Var2.l) {
                return 0;
            }
        }
        if (ys0VarArr[i7].e() != 0) {
            return Math.max(ys0VarArr[i7].e(), ys0VarArr[i7].c().size() + ys0VarArr[i7].d());
        }
        int size = ys0VarArr[i7].c().size() + ys0VarArr[i7].d();
        if (size == 0) {
            return size;
        }
        ys0 ys0Var3 = ys0VarArr[i7];
        boolean[] zArr2 = ys0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = ys0Var3.r;
        if ((z10 ? ys0Var3.u : ys0Var3.n) != 0) {
            return (z10 ? ys0Var3.u : ys0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        ys0[] ys0VarArr = this.f.w1;
        int i10 = this.d;
        if (ys0VarArr[i10].c.size() == 0 && !ys0VarArr[i10].g) {
            return 9;
        }
        ys0 ys0Var = ys0VarArr[i10];
        int i11 = ys0Var.m;
        if (i7 < i11 || i7 >= ys0Var.a.size() + i11) {
            return 8;
        }
        return (i10 == 2 || i10 == 4) ? 10 : 7;
    }

    @Override // v4.i0
    public final int e() {
        return this.f.w1[this.d].e();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        jt0 jt0Var = this.f;
        long j3 = jt0Var.m1;
        SparseArray[] sparseArrayArr = jt0Var.c1;
        ys0 ys0Var = jt0Var.w1[this.d];
        ArrayList arrayList = ys0Var.a;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7 - ys0Var.m);
                i7Var.c(gjVar, i7 != arrayList.size() - 1);
                if (jt0Var.F1) {
                    i7Var.b(sparseArrayArr[(org.telegram.messenger.gj.B0(gjVar.k) > j3 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0, !jt0Var.e1);
                    return;
                } else {
                    i7Var.b(false, !jt0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7 - ys0Var.m);
            h7Var.f(gjVar2, i7 != arrayList.size() - 1);
            if (jt0Var.F1) {
                h7Var.e(sparseArrayArr[(org.telegram.messenger.gj.B0(gjVar2.k) > j3 ? 1 : (org.telegram.messenger.gj.B0(gjVar2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar2.e1()) >= 0, !jt0Var.e1);
            } else {
                h7Var.e(false, !jt0Var.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        jt0 jt0Var = this.f;
        yz yzVar = jt0Var.E;
        ArrayList arrayList = jt0Var.J0;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 == 8) {
                yz yzVar2 = new yz(context, h6Var);
                if (i10 == 2) {
                    yzVar2.setViewType(4);
                } else {
                    yzVar2.setViewType(3);
                }
                yzVar2.x = false;
                yzVar2.setIsSingleCell(true);
                yzVar2.setGlobalGradientView(yzVar);
                view = yzVar2;
            } else {
                if (i7 == 9) {
                    y3 X = jt0.X(i10, jt0Var.m1, context, h6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new mj0(X);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new fs0(this, context, h6Var, 1);
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
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                h7Var.setGlobalGradientView(yzVar);
                view = view2;
                if (i10 == 4) {
                    jt0Var.K0.add(h7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(0, context, h6Var);
            i7Var.setGlobalGradientView(yzVar);
            view = i7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}

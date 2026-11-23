package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vs0 extends kj0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ it0 f;

    public vs0(it0 it0Var, Context context, int i7) {
        this.f = it0Var;
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
            if (i7 <= ((is0) arrayList.get(i10)).b) {
                return ((is0) arrayList.get(i10)).a;
            }
        }
        return ((is0) i5.c.h(1, arrayList)).a;
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
            for (int i10 = 0; i10 < ek0Var.getChildCount() && (i7 = it0.o(ek0Var.getChildAt(i10))) == 0; i10++) {
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
            it0.s(g02, null, false);
        }
    }

    @Override // v4.i0
    public final int b() {
        xs0[] xs0VarArr = this.f.w1;
        int i7 = this.d;
        xs0 xs0Var = xs0VarArr[i7];
        if (xs0Var.o) {
            return xs0Var.e();
        }
        if (xs0Var.a.size() == 0 && !xs0VarArr[i7].g) {
            return 1;
        }
        if (xs0VarArr[i7].a.size() == 0) {
            xs0 xs0Var2 = xs0VarArr[i7];
            boolean[] zArr = xs0Var2.i;
            if ((!zArr[0] || !zArr[1]) && xs0Var2.l) {
                return 0;
            }
        }
        if (xs0VarArr[i7].e() != 0) {
            return Math.max(xs0VarArr[i7].e(), xs0VarArr[i7].c().size() + xs0VarArr[i7].d());
        }
        int size = xs0VarArr[i7].c().size() + xs0VarArr[i7].d();
        if (size == 0) {
            return size;
        }
        xs0 xs0Var3 = xs0VarArr[i7];
        boolean[] zArr2 = xs0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = xs0Var3.r;
        if ((z10 ? xs0Var3.u : xs0Var3.n) != 0) {
            return (z10 ? xs0Var3.u : xs0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        xs0[] xs0VarArr = this.f.w1;
        int i10 = this.d;
        if (xs0VarArr[i10].c.size() == 0 && !xs0VarArr[i10].g) {
            return 9;
        }
        xs0 xs0Var = xs0VarArr[i10];
        int i11 = xs0Var.m;
        if (i7 < i11 || i7 >= xs0Var.a.size() + i11) {
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
        it0 it0Var = this.f;
        long j3 = it0Var.m1;
        SparseArray[] sparseArrayArr = it0Var.c1;
        xs0 xs0Var = it0Var.w1[this.d];
        ArrayList arrayList = xs0Var.a;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7 - xs0Var.m);
                h7Var.c(fjVar, i7 != arrayList.size() - 1);
                if (it0Var.F1) {
                    h7Var.b(sparseArrayArr[(org.telegram.messenger.fj.B0(fjVar.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, !it0Var.e1);
                    return;
                } else {
                    h7Var.b(false, !it0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7 - xs0Var.m);
            g7Var.f(fjVar2, i7 != arrayList.size() - 1);
            if (it0Var.F1) {
                g7Var.e(sparseArrayArr[(org.telegram.messenger.fj.B0(fjVar2.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(fjVar2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar2.e1()) >= 0, !it0Var.e1);
            } else {
                g7Var.e(false, !it0Var.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        it0 it0Var = this.f;
        vz vzVar = it0Var.E;
        ArrayList arrayList = it0Var.J0;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 == 8) {
                vz vzVar2 = new vz(context, i6Var);
                if (i10 == 2) {
                    vzVar2.setViewType(4);
                } else {
                    vzVar2.setViewType(3);
                }
                vzVar2.x = false;
                vzVar2.setIsSingleCell(true);
                vzVar2.setGlobalGradientView(vzVar);
                view = vzVar2;
            } else {
                if (i7 == 9) {
                    x3 X = it0.X(i10, it0Var.m1, context, i6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new mj0(X);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new es0(this, context, i6Var, 1);
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
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view2;
                g7Var.setGlobalGradientView(vzVar);
                view = view2;
                if (i10 == 4) {
                    it0Var.K0.add(g7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, i6Var);
            h7Var.setGlobalGradientView(vzVar);
            view = h7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}

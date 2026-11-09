package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ms0 extends wi0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ zs0 f;

    public ms0(zs0 zs0Var, Context context, int i7) {
        this.f = zs0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final String F(int i7) {
        ArrayList arrayList = this.f.v1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((zr0) arrayList.get(i10)).b) {
                return ((zr0) arrayList.get(i10)).a;
            }
        }
        return ((zr0) jg.g.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void J(qj0 qj0Var) {
        if (this.e) {
            this.e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < qj0Var.getChildCount() && (i7 = zs0.o(qj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f.c0(this.d, qj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final void K() {
        this.e = true;
        ur0 g02 = this.f.g0(this.d);
        if (g02 != null) {
            zs0.s(g02, null, false);
        }
    }

    @Override // v4.g0
    public final int b() {
        os0[] os0VarArr = this.f.v1;
        int i7 = this.d;
        os0 os0Var = os0VarArr[i7];
        if (os0Var.o) {
            return os0Var.e();
        }
        if (os0Var.a.size() == 0 && !os0VarArr[i7].g) {
            return 1;
        }
        if (os0VarArr[i7].a.size() == 0) {
            os0 os0Var2 = os0VarArr[i7];
            boolean[] zArr = os0Var2.i;
            if ((!zArr[0] || !zArr[1]) && os0Var2.l) {
                return 0;
            }
        }
        if (os0VarArr[i7].e() != 0) {
            return Math.max(os0VarArr[i7].e(), os0VarArr[i7].c().size() + os0VarArr[i7].d());
        }
        int size = os0VarArr[i7].c().size() + os0VarArr[i7].d();
        if (size == 0) {
            return size;
        }
        os0 os0Var3 = os0VarArr[i7];
        boolean[] zArr2 = os0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z9 = os0Var3.r;
        if ((z9 ? os0Var3.u : os0Var3.n) != 0) {
            return (z9 ? os0Var3.u : os0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        os0[] os0VarArr = this.f.v1;
        int i10 = this.d;
        if (os0VarArr[i10].c.size() == 0 && !os0VarArr[i10].g) {
            return 9;
        }
        os0 os0Var = os0VarArr[i10];
        int i11 = os0Var.m;
        if (i7 < i11 || i7 >= os0Var.a.size() + i11) {
            return 8;
        }
        return (i10 == 2 || i10 == 4) ? 10 : 7;
    }

    @Override // v4.g0
    public final int e() {
        return this.f.v1[this.d].e();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        zs0 zs0Var = this.f;
        long j3 = zs0Var.l1;
        SparseArray[] sparseArrayArr = zs0Var.b1;
        os0 os0Var = zs0Var.v1[this.d];
        ArrayList arrayList = os0Var.a;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7 - os0Var.m);
                h7Var.c(ijVar, i7 != arrayList.size() - 1);
                if (zs0Var.E1) {
                    h7Var.b(sparseArrayArr[(org.telegram.messenger.ij.B0(ijVar.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, !zs0Var.d1);
                    return;
                } else {
                    h7Var.b(false, !zs0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7 - os0Var.m);
            g7Var.f(ijVar2, i7 != arrayList.size() - 1);
            if (zs0Var.E1) {
                g7Var.e(sparseArrayArr[(org.telegram.messenger.ij.B0(ijVar2.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(ijVar2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar2.e1()) >= 0, !zs0Var.d1);
            } else {
                g7Var.e(false, !zs0Var.d1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        zs0 zs0Var = this.f;
        mz mzVar = zs0Var.D;
        ArrayList arrayList = zs0Var.I0;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 == 8) {
                mz mzVar2 = new mz(context, g6Var);
                if (i10 == 2) {
                    mzVar2.setViewType(4);
                } else {
                    mzVar2.setViewType(3);
                }
                mzVar2.x = false;
                mzVar2.setIsSingleCell(true);
                mzVar2.setGlobalGradientView(mzVar);
                view = mzVar2;
            } else {
                if (i7 == 9) {
                    r3 X = zs0.X(i10, zs0Var.l1, context, g6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new yi0(X);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new vr0(this, context, g6Var, 1);
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
                g7Var.setGlobalGradientView(mzVar);
                view = view2;
                if (i10 == 4) {
                    zs0Var.J0.add(g7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, g6Var);
            h7Var.setGlobalGradientView(mzVar);
            view = h7Var;
        }
        return jg.g.r(view, view, -1, -2);
    }
}

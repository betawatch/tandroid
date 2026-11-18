package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ts0 extends ij0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ gt0 f;

    public ts0(gt0 gt0Var, Context context, int i7) {
        this.f = gt0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((gs0) arrayList.get(i10)).b) {
                return ((gs0) arrayList.get(i10)).a;
            }
        }
        return ((gs0) i5.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void J(ck0 ck0Var) {
        if (this.e) {
            this.e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ck0Var.getChildCount() && (i7 = gt0.o(ck0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f.c0(this.d, ck0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public final void K() {
        this.e = true;
        bs0 g02 = this.f.g0(this.d);
        if (g02 != null) {
            gt0.s(g02, null, false);
        }
    }

    @Override // v4.i0
    public final int b() {
        vs0[] vs0VarArr = this.f.w1;
        int i7 = this.d;
        vs0 vs0Var = vs0VarArr[i7];
        if (vs0Var.o) {
            return vs0Var.e();
        }
        if (vs0Var.a.size() == 0 && !vs0VarArr[i7].g) {
            return 1;
        }
        if (vs0VarArr[i7].a.size() == 0) {
            vs0 vs0Var2 = vs0VarArr[i7];
            boolean[] zArr = vs0Var2.i;
            if ((!zArr[0] || !zArr[1]) && vs0Var2.l) {
                return 0;
            }
        }
        if (vs0VarArr[i7].e() != 0) {
            return Math.max(vs0VarArr[i7].e(), vs0VarArr[i7].c().size() + vs0VarArr[i7].d());
        }
        int size = vs0VarArr[i7].c().size() + vs0VarArr[i7].d();
        if (size == 0) {
            return size;
        }
        vs0 vs0Var3 = vs0VarArr[i7];
        boolean[] zArr2 = vs0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = vs0Var3.r;
        if ((z10 ? vs0Var3.u : vs0Var3.n) != 0) {
            return (z10 ? vs0Var3.u : vs0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        vs0[] vs0VarArr = this.f.w1;
        int i10 = this.d;
        if (vs0VarArr[i10].c.size() == 0 && !vs0VarArr[i10].g) {
            return 9;
        }
        vs0 vs0Var = vs0VarArr[i10];
        int i11 = vs0Var.m;
        if (i7 < i11 || i7 >= vs0Var.a.size() + i11) {
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
        gt0 gt0Var = this.f;
        long j3 = gt0Var.m1;
        SparseArray[] sparseArrayArr = gt0Var.c1;
        vs0 vs0Var = gt0Var.w1[this.d];
        ArrayList arrayList = vs0Var.a;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7 - vs0Var.m);
                h7Var.c(fjVar, i7 != arrayList.size() - 1);
                if (gt0Var.F1) {
                    h7Var.b(sparseArrayArr[(org.telegram.messenger.fj.B0(fjVar.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, !gt0Var.e1);
                    return;
                } else {
                    h7Var.b(false, !gt0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7 - vs0Var.m);
            g7Var.f(fjVar2, i7 != arrayList.size() - 1);
            if (gt0Var.F1) {
                g7Var.e(sparseArrayArr[(org.telegram.messenger.fj.B0(fjVar2.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(fjVar2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar2.e1()) >= 0, !gt0Var.e1);
            } else {
                g7Var.e(false, !gt0Var.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        gt0 gt0Var = this.f;
        wz wzVar = gt0Var.E;
        ArrayList arrayList = gt0Var.J0;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 == 8) {
                wz wzVar2 = new wz(context, i6Var);
                if (i10 == 2) {
                    wzVar2.setViewType(4);
                } else {
                    wzVar2.setViewType(3);
                }
                wzVar2.x = false;
                wzVar2.setIsSingleCell(true);
                wzVar2.setGlobalGradientView(wzVar);
                view = wzVar2;
            } else {
                if (i7 == 9) {
                    x3 X = gt0.X(i10, gt0Var.m1, context, i6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new kj0(X);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new cs0(this, context, i6Var, 1);
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
                g7Var.setGlobalGradientView(wzVar);
                view = view2;
                if (i10 == 4) {
                    gt0Var.K0.add(g7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, i6Var);
            h7Var.setGlobalGradientView(wzVar);
            view = h7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}

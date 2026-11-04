package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class js0 extends zi0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ ws0 f;

    public js0(ws0 ws0Var, Context context, int i3) {
        this.f = ws0Var;
        this.c = context;
        this.d = i3;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i3 <= ((wr0) arrayList.get(i10)).b) {
                return ((wr0) arrayList.get(i10)).a;
            }
        }
        return ((wr0) k2.p1.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void J(tj0 tj0Var) {
        if (this.e) {
            this.e = false;
            int i3 = 0;
            for (int i10 = 0; i10 < tj0Var.getChildCount() && (i3 = ws0.o(tj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i3 == 0) {
                this.f.c0(this.d, tj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.zi0
    public final void K() {
        this.e = true;
        rr0 g02 = this.f.g0(this.d);
        if (g02 != null) {
            ws0.s(g02, null, false);
        }
    }

    @Override // u4.h0
    public final int b() {
        ls0[] ls0VarArr = this.f.w1;
        int i3 = this.d;
        ls0 ls0Var = ls0VarArr[i3];
        if (ls0Var.o) {
            return ls0Var.e();
        }
        if (ls0Var.a.size() == 0 && !ls0VarArr[i3].g) {
            return 1;
        }
        if (ls0VarArr[i3].a.size() == 0) {
            ls0 ls0Var2 = ls0VarArr[i3];
            boolean[] zArr = ls0Var2.i;
            if ((!zArr[0] || !zArr[1]) && ls0Var2.l) {
                return 0;
            }
        }
        if (ls0VarArr[i3].e() != 0) {
            return Math.max(ls0VarArr[i3].e(), ls0VarArr[i3].c().size() + ls0VarArr[i3].d());
        }
        int size = ls0VarArr[i3].c().size() + ls0VarArr[i3].d();
        if (size == 0) {
            return size;
        }
        ls0 ls0Var3 = ls0VarArr[i3];
        boolean[] zArr2 = ls0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = ls0Var3.r;
        if ((z10 ? ls0Var3.u : ls0Var3.n) != 0) {
            return (z10 ? ls0Var3.u : ls0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        ls0[] ls0VarArr = this.f.w1;
        int i10 = this.d;
        if (ls0VarArr[i10].c.size() == 0 && !ls0VarArr[i10].g) {
            return 9;
        }
        ls0 ls0Var = ls0VarArr[i10];
        int i11 = ls0Var.m;
        if (i3 < i11 || i3 >= ls0Var.a.size() + i11) {
            return 8;
        }
        return (i10 == 2 || i10 == 4) ? 10 : 7;
    }

    @Override // u4.h0
    public final int e() {
        return this.f.w1[this.d].e();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ws0 ws0Var = this.f;
        long j10 = ws0Var.m1;
        SparseArray[] sparseArrayArr = ws0Var.c1;
        ls0 ls0Var = ws0Var.w1[this.d];
        ArrayList arrayList = ls0Var.a;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3 - ls0Var.m);
                g7Var.c(ziVar, i3 != arrayList.size() - 1);
                if (ws0Var.F1) {
                    g7Var.b(sparseArrayArr[(org.telegram.messenger.zi.B0(ziVar.k) > j10 ? 1 : (org.telegram.messenger.zi.B0(ziVar.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) >= 0, !ws0Var.e1);
                    return;
                } else {
                    g7Var.b(false, !ws0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.f7)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i3 - ls0Var.m);
            f7Var.f(ziVar2, i3 != arrayList.size() - 1);
            if (ws0Var.F1) {
                f7Var.e(sparseArrayArr[(org.telegram.messenger.zi.B0(ziVar2.k) > j10 ? 1 : (org.telegram.messenger.zi.B0(ziVar2.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar2.f1()) >= 0, !ws0Var.e1);
            } else {
                f7Var.e(false, !ws0Var.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        ws0 ws0Var = this.f;
        iz izVar = ws0Var.E;
        ArrayList arrayList = ws0Var.J0;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.c;
        if (i3 != 7) {
            int i10 = this.d;
            if (i3 == 8) {
                iz izVar2 = new iz(context, e6Var);
                if (i10 == 2) {
                    izVar2.setViewType(4);
                } else {
                    izVar2.setViewType(3);
                }
                izVar2.x = false;
                izVar2.setIsSingleCell(true);
                izVar2.setGlobalGradientView(izVar);
                view = izVar2;
            } else {
                if (i3 == 9) {
                    p3 X = ws0.X(i10, ws0Var.m1, context, e6Var);
                    X.setLayoutParams(new u4.p0(-1, -1));
                    return new bj0(X);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new sr0(this, context, e6Var, 1);
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
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view2;
                f7Var.setGlobalGradientView(izVar);
                view = view2;
                if (i10 == 4) {
                    ws0Var.K0.add(f7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(0, context, e6Var);
            g7Var.setGlobalGradientView(izVar);
            view = g7Var;
        }
        return k2.p1.p(view, view, -1, -2);
    }
}

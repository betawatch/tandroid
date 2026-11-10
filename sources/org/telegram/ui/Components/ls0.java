package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ls0 extends vi0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ ys0 f;

    public ls0(ys0 ys0Var, Context context, int i7) {
        this.f = ys0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        ArrayList arrayList = this.f.v1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((yr0) arrayList.get(i10)).b) {
                return ((yr0) arrayList.get(i10)).a;
            }
        }
        return ((yr0) jg.g.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void J(pj0 pj0Var) {
        if (this.e) {
            this.e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < pj0Var.getChildCount() && (i7 = ys0.o(pj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f.c0(this.d, pj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public final void K() {
        this.e = true;
        tr0 g02 = this.f.g0(this.d);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    @Override // v4.g0
    public final int b() {
        ns0[] ns0VarArr = this.f.v1;
        int i7 = this.d;
        ns0 ns0Var = ns0VarArr[i7];
        if (ns0Var.o) {
            return ns0Var.e();
        }
        if (ns0Var.a.size() == 0 && !ns0VarArr[i7].g) {
            return 1;
        }
        if (ns0VarArr[i7].a.size() == 0) {
            ns0 ns0Var2 = ns0VarArr[i7];
            boolean[] zArr = ns0Var2.i;
            if ((!zArr[0] || !zArr[1]) && ns0Var2.l) {
                return 0;
            }
        }
        if (ns0VarArr[i7].e() != 0) {
            return Math.max(ns0VarArr[i7].e(), ns0VarArr[i7].c().size() + ns0VarArr[i7].d());
        }
        int size = ns0VarArr[i7].c().size() + ns0VarArr[i7].d();
        if (size == 0) {
            return size;
        }
        ns0 ns0Var3 = ns0VarArr[i7];
        boolean[] zArr2 = ns0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z9 = ns0Var3.r;
        if ((z9 ? ns0Var3.u : ns0Var3.n) != 0) {
            return (z9 ? ns0Var3.u : ns0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ns0[] ns0VarArr = this.f.v1;
        int i10 = this.d;
        if (ns0VarArr[i10].c.size() == 0 && !ns0VarArr[i10].g) {
            return 9;
        }
        ns0 ns0Var = ns0VarArr[i10];
        int i11 = ns0Var.m;
        if (i7 < i11 || i7 >= ns0Var.a.size() + i11) {
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
        ys0 ys0Var = this.f;
        long j3 = ys0Var.l1;
        SparseArray[] sparseArrayArr = ys0Var.b1;
        ns0 ns0Var = ys0Var.v1[this.d];
        ArrayList arrayList = ns0Var.a;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7 - ns0Var.m);
                h7Var.c(ijVar, i7 != arrayList.size() - 1);
                if (ys0Var.E1) {
                    h7Var.b(sparseArrayArr[(org.telegram.messenger.ij.B0(ijVar.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, !ys0Var.d1);
                    return;
                } else {
                    h7Var.b(false, !ys0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7 - ns0Var.m);
            g7Var.f(ijVar2, i7 != arrayList.size() - 1);
            if (ys0Var.E1) {
                g7Var.e(sparseArrayArr[(org.telegram.messenger.ij.B0(ijVar2.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(ijVar2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar2.e1()) >= 0, !ys0Var.d1);
            } else {
                g7Var.e(false, !ys0Var.d1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        ys0 ys0Var = this.f;
        lz lzVar = ys0Var.D;
        ArrayList arrayList = ys0Var.I0;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 == 8) {
                lz lzVar2 = new lz(context, h6Var);
                if (i10 == 2) {
                    lzVar2.setViewType(4);
                } else {
                    lzVar2.setViewType(3);
                }
                lzVar2.x = false;
                lzVar2.setIsSingleCell(true);
                lzVar2.setGlobalGradientView(lzVar);
                view = lzVar2;
            } else {
                if (i7 == 9) {
                    q3 X = ys0.X(i10, ys0Var.l1, context, h6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new xi0(X);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new ur0(this, context, h6Var, 1);
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
                g7Var.setGlobalGradientView(lzVar);
                view = view2;
                if (i10 == 4) {
                    ys0Var.J0.add(g7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, h6Var);
            h7Var.setGlobalGradientView(lzVar);
            view = h7Var;
        }
        return jg.g.r(view, view, -1, -2);
    }
}

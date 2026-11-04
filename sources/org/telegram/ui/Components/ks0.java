package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ks0 extends oj0 {
    public final Context r;
    public final /* synthetic */ ws0 s;

    public ks0(ws0 ws0Var, Context context) {
        this.s = ws0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        ls0[] ls0VarArr = this.s.w1;
        if ((ls0VarArr[3].c.size() == 0 && !ls0VarArr[3].g) || i3 >= ls0VarArr[3].c.size()) {
            return 1;
        }
        ls0 ls0Var = ls0VarArr[3];
        return ((ArrayList) ls0Var.d.get(ls0Var.c.get(i3))).size() + (i3 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        ls0[] ls0VarArr = this.s.w1;
        if (ls0VarArr[3].c.size() == 0 && !ls0VarArr[3].g) {
            return 5;
        }
        if (i3 < ls0VarArr[3].c.size()) {
            return (i3 == 0 || i10 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.oj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        ls0[] ls0VarArr = this.s.w1;
        int i3 = 1;
        if (ls0VarArr[3].c.size() == 0 && !ls0VarArr[3].g) {
            return 1;
        }
        int size = ls0VarArr[3].c.size();
        if (!ls0VarArr[3].c.isEmpty()) {
            boolean[] zArr = ls0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i3;
        }
        i3 = 0;
        return size + i3;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        ws0 ws0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.r, ws0Var.I1);
        }
        if (i3 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i3 < ws0Var.w1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) ((ArrayList) ws0Var.w1[3].d.get((String) ws0Var.w1[3].c.get(i3))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        ls0[] ls0VarArr = this.s.w1;
        if (ls0VarArr[3].c.size() != 0 || ls0VarArr[3].g) {
            return i3 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        ws0 ws0Var = this.s;
        ls0[] ls0VarArr = ws0Var.w1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) ls0VarArr[3].d.get((String) ls0VarArr[3].c.get(i3));
        int i12 = d1Var.f;
        if (i12 == 3) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(ziVar.k.date, false));
                return;
            }
            return;
        }
        if (i12 != 4) {
            return;
        }
        if (i3 != 0) {
            i10--;
        }
        if (!(view instanceof org.telegram.ui.Cells.j7) || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i10);
        j7Var.E = i10 != arrayList.size() - 1 || (i3 == ls0VarArr[3].c.size() - 1 && ls0VarArr[3].g);
        j7Var.e();
        j7Var.c0 = ziVar2;
        j7Var.requestLayout();
        if (ws0Var.F1) {
            j7Var.f(ws0Var.c1[(org.telegram.messenger.zi.B0(ziVar2.k) > ws0Var.m1 ? 1 : (org.telegram.messenger.zi.B0(ziVar2.k) == ws0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar2.f1()) >= 0, !ws0Var.e1);
        } else {
            j7Var.f(false, !ws0Var.e1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        ws0 ws0Var = this.s;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.r;
        if (i3 == 3) {
            x3Var = new org.telegram.ui.Cells.x3(28, context, e6Var);
        } else if (i3 == 4) {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
            j7Var.setDelegate(ws0Var.W1);
            x3Var = j7Var;
        } else {
            if (i3 == 5) {
                p3 X = ws0.X(3, ws0Var.m1, context, e6Var);
                X.setLayoutParams(new u4.p0(-1, -1));
                return new bj0(X);
            }
            iz izVar = new iz(context, e6Var);
            izVar.setIsSingleCell(true);
            izVar.x = false;
            izVar.setViewType(5);
            x3Var = izVar;
        }
        return k2.p1.p(x3Var, x3Var, -1, -2);
    }
}

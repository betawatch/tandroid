package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nt0 extends ok0 {
    public final Context r;
    public final /* synthetic */ zt0 s;

    public nt0(zt0 zt0Var, Context context) {
        this.s = zt0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int M(int i10) {
        ot0[] ot0VarArr = this.s.v1;
        if ((ot0VarArr[3].c.size() == 0 && !ot0VarArr[3].g) || i10 >= ot0VarArr[3].c.size()) {
            return 1;
        }
        ot0 ot0Var = ot0VarArr[3];
        return ((ArrayList) ot0Var.d.get(ot0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.ok0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int P(int i10, int i11) {
        ot0[] ot0VarArr = this.s.v1;
        if (ot0VarArr[3].c.size() == 0 && !ot0VarArr[3].g) {
            return 5;
        }
        if (i10 < ot0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        ot0[] ot0VarArr = this.s.v1;
        int i10 = 1;
        if (ot0VarArr[3].c.size() == 0 && !ot0VarArr[3].g) {
            return 1;
        }
        int size = ot0VarArr[3].c.size();
        if (!ot0VarArr[3].c.isEmpty()) {
            boolean[] zArr = ot0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        zt0 zt0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(28, this.r, zt0Var.H1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < zt0Var.v1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) ((ArrayList) zt0Var.v1[3].d.get((String) zt0Var.v1[3].c.get(i10))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        ot0[] ot0VarArr = this.s.v1;
        if (ot0VarArr[3].c.size() != 0 || ot0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        zt0 zt0Var = this.s;
        ot0[] ot0VarArr = zt0Var.v1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) ot0VarArr[3].d.get((String) ot0VarArr[3].c.get(i10));
        int i13 = c1Var.f;
        if (i13 == 3) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(jjVar.k.date, false));
                return;
            }
            return;
        }
        if (i13 != 4) {
            return;
        }
        if (i10 != 0) {
            i11--;
        }
        if (!(view instanceof org.telegram.ui.Cells.o7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i11);
        o7Var.D = i11 != arrayList.size() - 1 || (i10 == ot0VarArr[3].c.size() - 1 && ot0VarArr[3].g);
        o7Var.e();
        o7Var.b0 = jjVar2;
        o7Var.requestLayout();
        if (zt0Var.E1) {
            o7Var.f(zt0Var.b1[(org.telegram.messenger.jj.B0(jjVar2.k) > zt0Var.l1 ? 1 : (org.telegram.messenger.jj.B0(jjVar2.k) == zt0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar2.f1()) >= 0, !zt0Var.d1);
        } else {
            o7Var.f(false, !zt0Var.d1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        zt0 zt0Var = this.s;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.r;
        if (i10 == 3) {
            z3Var = new org.telegram.ui.Cells.z3(28, context, p6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
            o7Var.setDelegate(zt0Var.V1);
            z3Var = o7Var;
        } else {
            if (i10 == 5) {
                p3 V = zt0.V(3, zt0Var.l1, context, p6Var);
                V.setLayoutParams(new s4.o0(-1, -1));
                return new ck0(V);
            }
            zz zzVar = new zz(context, p6Var);
            zzVar.setIsSingleCell(true);
            zzVar.x = false;
            zzVar.setViewType(5);
            z3Var = zzVar;
        }
        return sc.e.o(z3Var, z3Var, -1, -2);
    }
}

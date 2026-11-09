package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ns0 extends lj0 {
    public final Context r;
    public final /* synthetic */ zs0 s;

    public ns0(zs0 zs0Var, Context context) {
        this.s = zs0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.wi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.lj0
    public final int M(int i7) {
        os0[] os0VarArr = this.s.v1;
        if ((os0VarArr[3].c.size() == 0 && !os0VarArr[3].g) || i7 >= os0VarArr[3].c.size()) {
            return 1;
        }
        os0 os0Var = os0VarArr[3];
        return ((ArrayList) os0Var.d.get(os0Var.c.get(i7))).size() + (i7 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.lj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.lj0
    public final int P(int i7, int i10) {
        os0[] os0VarArr = this.s.v1;
        if (os0VarArr[3].c.size() == 0 && !os0VarArr[3].g) {
            return 5;
        }
        if (i7 < os0VarArr[3].c.size()) {
            return (i7 == 0 || i10 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.lj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        os0[] os0VarArr = this.s.v1;
        int i7 = 1;
        if (os0VarArr[3].c.size() == 0 && !os0VarArr[3].g) {
            return 1;
        }
        int size = os0VarArr[3].c.size();
        if (!os0VarArr[3].c.isEmpty()) {
            boolean[] zArr = os0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i7;
        }
        i7 = 0;
        return size + i7;
    }

    @Override // org.telegram.ui.Components.lj0
    public final View T(int i7, View view) {
        zs0 zs0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.r, zs0Var.H1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < zs0Var.v1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) zs0Var.v1[3].d.get((String) zs0Var.v1[3].c.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.lj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        os0[] os0VarArr = this.s.v1;
        if (os0VarArr[3].c.size() != 0 || os0VarArr[3].g) {
            return i7 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        zs0 zs0Var = this.s;
        os0[] os0VarArr = zs0Var.v1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) os0VarArr[3].d.get((String) os0VarArr[3].c.get(i7));
        int i12 = d1Var.f;
        if (i12 == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(ijVar.k.date, false));
                return;
            }
            return;
        }
        if (i12 != 4) {
            return;
        }
        if (i7 != 0) {
            i10--;
        }
        if (!(view instanceof org.telegram.ui.Cells.k7) || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i10);
        k7Var.D = i10 != arrayList.size() - 1 || (i7 == os0VarArr[3].c.size() - 1 && os0VarArr[3].g);
        k7Var.e();
        k7Var.b0 = ijVar2;
        k7Var.requestLayout();
        if (zs0Var.E1) {
            k7Var.f(zs0Var.b1[(org.telegram.messenger.ij.B0(ijVar2.k) > zs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar2.k) == zs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar2.e1()) >= 0, !zs0Var.d1);
        } else {
            k7Var.f(false, !zs0Var.d1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        zs0 zs0Var = this.s;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.r;
        if (i7 == 3) {
            x3Var = new org.telegram.ui.Cells.x3(28, context, g6Var);
        } else if (i7 == 4) {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, g6Var);
            k7Var.setDelegate(zs0Var.V1);
            x3Var = k7Var;
        } else {
            if (i7 == 5) {
                r3 X = zs0.X(3, zs0Var.l1, context, g6Var);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new yi0(X);
            }
            mz mzVar = new mz(context, g6Var);
            mzVar.setIsSingleCell(true);
            mzVar.x = false;
            mzVar.setViewType(5);
            x3Var = mzVar;
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ls0 extends kj0 {
    public final Context r;
    public final /* synthetic */ xs0 s;

    public ls0(xs0 xs0Var, Context context) {
        this.s = xs0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        ms0[] ms0VarArr = this.s.v1;
        if ((ms0VarArr[3].c.size() == 0 && !ms0VarArr[3].g) || i7 >= ms0VarArr[3].c.size()) {
            return 1;
        }
        ms0 ms0Var = ms0VarArr[3];
        return ((ArrayList) ms0Var.d.get(ms0Var.c.get(i7))).size() + (i7 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        ms0[] ms0VarArr = this.s.v1;
        if (ms0VarArr[3].c.size() == 0 && !ms0VarArr[3].g) {
            return 5;
        }
        if (i7 < ms0VarArr[3].c.size()) {
            return (i7 == 0 || i10 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.kj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        ms0[] ms0VarArr = this.s.v1;
        int i7 = 1;
        if (ms0VarArr[3].c.size() == 0 && !ms0VarArr[3].g) {
            return 1;
        }
        int size = ms0VarArr[3].c.size();
        if (!ms0VarArr[3].c.isEmpty()) {
            boolean[] zArr = ms0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i7;
        }
        i7 = 0;
        return size + i7;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        xs0 xs0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.r, xs0Var.H1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < xs0Var.v1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) xs0Var.v1[3].d.get((String) xs0Var.v1[3].c.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        ms0[] ms0VarArr = this.s.v1;
        if (ms0VarArr[3].c.size() != 0 || ms0VarArr[3].g) {
            return i7 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        xs0 xs0Var = this.s;
        ms0[] ms0VarArr = xs0Var.v1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) ms0VarArr[3].d.get((String) ms0VarArr[3].c.get(i7));
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
        k7Var.D = i10 != arrayList.size() - 1 || (i7 == ms0VarArr[3].c.size() - 1 && ms0VarArr[3].g);
        k7Var.e();
        k7Var.b0 = ijVar2;
        k7Var.requestLayout();
        if (xs0Var.E1) {
            k7Var.f(xs0Var.b1[(org.telegram.messenger.ij.B0(ijVar2.k) > xs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar2.k) == xs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar2.f1()) >= 0, !xs0Var.d1);
        } else {
            k7Var.f(false, !xs0Var.d1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        xs0 xs0Var = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.r;
        if (i7 == 3) {
            x3Var = new org.telegram.ui.Cells.x3(28, context, f6Var);
        } else if (i7 == 4) {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, f6Var);
            k7Var.setDelegate(xs0Var.V1);
            x3Var = k7Var;
        } else {
            if (i7 == 5) {
                r3 X = xs0.X(3, xs0Var.l1, context, f6Var);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new xi0(X);
            }
            mz mzVar = new mz(context, f6Var);
            mzVar.setIsSingleCell(true);
            mzVar.x = false;
            mzVar.setViewType(5);
            x3Var = mzVar;
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ws0 extends zj0 {
    public final Context r;
    public final /* synthetic */ it0 s;

    public ws0(it0 it0Var, Context context) {
        this.s = it0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int M(int i7) {
        xs0[] xs0VarArr = this.s.w1;
        if ((xs0VarArr[3].c.size() == 0 && !xs0VarArr[3].g) || i7 >= xs0VarArr[3].c.size()) {
            return 1;
        }
        xs0 xs0Var = xs0VarArr[3];
        return ((ArrayList) xs0Var.d.get(xs0Var.c.get(i7))).size() + (i7 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.zj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int P(int i7, int i10) {
        xs0[] xs0VarArr = this.s.w1;
        if (xs0VarArr[3].c.size() == 0 && !xs0VarArr[3].g) {
            return 5;
        }
        if (i7 < xs0VarArr[3].c.size()) {
            return (i7 == 0 || i10 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        xs0[] xs0VarArr = this.s.w1;
        int i7 = 1;
        if (xs0VarArr[3].c.size() == 0 && !xs0VarArr[3].g) {
            return 1;
        }
        int size = xs0VarArr[3].c.size();
        if (!xs0VarArr[3].c.isEmpty()) {
            boolean[] zArr = xs0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i7;
        }
        i7 = 0;
        return size + i7;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        it0 it0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(28, this.r, it0Var.I1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < it0Var.w1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) it0Var.w1[3].d.get((String) it0Var.w1[3].c.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        xs0[] xs0VarArr = this.s.w1;
        if (xs0VarArr[3].c.size() != 0 || xs0VarArr[3].g) {
            return i7 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        it0 it0Var = this.s;
        xs0[] xs0VarArr = it0Var.w1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) xs0VarArr[3].d.get((String) xs0VarArr[3].c.get(i7));
        int i12 = f1Var.f;
        if (i12 == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.y3) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(fjVar.k.date, false));
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
        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i10);
        k7Var.E = i10 != arrayList.size() - 1 || (i7 == xs0VarArr[3].c.size() - 1 && xs0VarArr[3].g);
        k7Var.e();
        k7Var.c0 = fjVar2;
        k7Var.requestLayout();
        if (it0Var.F1) {
            k7Var.f(it0Var.c1[(org.telegram.messenger.fj.B0(fjVar2.k) > it0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar2.k) == it0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar2.e1()) >= 0, !it0Var.e1);
        } else {
            k7Var.f(false, !it0Var.e1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        it0 it0Var = this.s;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.r;
        if (i7 == 3) {
            y3Var = new org.telegram.ui.Cells.y3(28, context, i6Var);
        } else if (i7 == 4) {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, i6Var);
            k7Var.setDelegate(it0Var.W1);
            y3Var = k7Var;
        } else {
            if (i7 == 5) {
                x3 X = it0.X(3, it0Var.m1, context, i6Var);
                X.setLayoutParams(new v4.q0(-1, -1));
                return new mj0(X);
            }
            vz vzVar = new vz(context, i6Var);
            vzVar.setIsSingleCell(true);
            vzVar.x = false;
            vzVar.setViewType(5);
            y3Var = vzVar;
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}

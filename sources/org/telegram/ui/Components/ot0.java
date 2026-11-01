package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ot0 extends pk0 {
    public final Context r;
    public final /* synthetic */ au0 s;

    public ot0(au0 au0Var, Context context) {
        this.s = au0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.bk0
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pk0
    public final int M(int i10) {
        pt0[] pt0VarArr = this.s.v1;
        if ((pt0VarArr[3].c.size() == 0 && !pt0VarArr[3].g) || i10 >= pt0VarArr[3].c.size()) {
            return 1;
        }
        pt0 pt0Var = pt0VarArr[3];
        return ((ArrayList) pt0Var.d.get(pt0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.pk0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.pk0
    public final int P(int i10, int i11) {
        pt0[] pt0VarArr = this.s.v1;
        if (pt0VarArr[3].c.size() == 0 && !pt0VarArr[3].g) {
            return 5;
        }
        if (i10 < pt0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        pt0[] pt0VarArr = this.s.v1;
        int i10 = 1;
        if (pt0VarArr[3].c.size() == 0 && !pt0VarArr[3].g) {
            return 1;
        }
        int size = pt0VarArr[3].c.size();
        if (!pt0VarArr[3].c.isEmpty()) {
            boolean[] zArr = pt0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.pk0
    public final View T(int i10, View view) {
        au0 au0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(28, this.r, au0Var.H1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < au0Var.v1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(((org.telegram.messenger.kj) ((ArrayList) au0Var.v1[3].d.get((String) au0Var.v1[3].c.get(i10))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        pt0[] pt0VarArr = this.s.v1;
        if (pt0VarArr[3].c.size() != 0 || pt0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        au0 au0Var = this.s;
        pt0[] pt0VarArr = au0Var.v1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) pt0VarArr[3].d.get((String) pt0VarArr[3].c.get(i10));
        int i13 = c1Var.f;
        if (i13 == 3) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(kjVar.k.date, false));
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
        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i11);
        o7Var.D = i11 != arrayList.size() - 1 || (i10 == pt0VarArr[3].c.size() - 1 && pt0VarArr[3].g);
        o7Var.e();
        o7Var.b0 = kjVar2;
        o7Var.requestLayout();
        if (au0Var.E1) {
            o7Var.f(au0Var.b1[(org.telegram.messenger.kj.B0(kjVar2.k) > au0Var.l1 ? 1 : (org.telegram.messenger.kj.B0(kjVar2.k) == au0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar2.f1()) >= 0, !au0Var.d1);
        } else {
            o7Var.f(false, !au0Var.d1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        au0 au0Var = this.s;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.r;
        if (i10 == 3) {
            z3Var = new org.telegram.ui.Cells.z3(28, context, p6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
            o7Var.setDelegate(au0Var.V1);
            z3Var = o7Var;
        } else {
            if (i10 == 5) {
                p3 W = au0.W(3, au0Var.l1, context, p6Var);
                W.setLayoutParams(new s4.o0(-1, -1));
                return new dk0(W);
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

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class us0 extends xj0 {
    public final Context r;
    public final /* synthetic */ gt0 s;

    public us0(gt0 gt0Var, Context context) {
        this.s = gt0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int M(int i7) {
        vs0[] vs0VarArr = this.s.w1;
        if ((vs0VarArr[3].c.size() == 0 && !vs0VarArr[3].g) || i7 >= vs0VarArr[3].c.size()) {
            return 1;
        }
        vs0 vs0Var = vs0VarArr[3];
        return ((ArrayList) vs0Var.d.get(vs0Var.c.get(i7))).size() + (i7 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.xj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int P(int i7, int i10) {
        vs0[] vs0VarArr = this.s.w1;
        if (vs0VarArr[3].c.size() == 0 && !vs0VarArr[3].g) {
            return 5;
        }
        if (i7 < vs0VarArr[3].c.size()) {
            return (i7 == 0 || i10 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.xj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        vs0[] vs0VarArr = this.s.w1;
        int i7 = 1;
        if (vs0VarArr[3].c.size() == 0 && !vs0VarArr[3].g) {
            return 1;
        }
        int size = vs0VarArr[3].c.size();
        if (!vs0VarArr[3].c.isEmpty()) {
            boolean[] zArr = vs0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i7;
        }
        i7 = 0;
        return size + i7;
    }

    @Override // org.telegram.ui.Components.xj0
    public final View T(int i7, View view) {
        gt0 gt0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(28, this.r, gt0Var.I1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < gt0Var.w1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) gt0Var.w1[3].d.get((String) gt0Var.w1[3].c.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.xj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        vs0[] vs0VarArr = this.s.w1;
        if (vs0VarArr[3].c.size() != 0 || vs0VarArr[3].g) {
            return i7 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        gt0 gt0Var = this.s;
        vs0[] vs0VarArr = gt0Var.w1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) vs0VarArr[3].d.get((String) vs0VarArr[3].c.get(i7));
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
        if (!(view instanceof org.telegram.ui.Cells.l7) || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i10);
        l7Var.E = i10 != arrayList.size() - 1 || (i7 == vs0VarArr[3].c.size() - 1 && vs0VarArr[3].g);
        l7Var.e();
        l7Var.c0 = fjVar2;
        l7Var.requestLayout();
        if (gt0Var.F1) {
            l7Var.f(gt0Var.c1[(org.telegram.messenger.fj.B0(fjVar2.k) > gt0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar2.k) == gt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar2.e1()) >= 0, !gt0Var.e1);
        } else {
            l7Var.f(false, !gt0Var.e1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        gt0 gt0Var = this.s;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.r;
        if (i7 == 3) {
            y3Var = new org.telegram.ui.Cells.y3(28, context, i6Var);
        } else if (i7 == 4) {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(0, context, i6Var);
            l7Var.setDelegate(gt0Var.W1);
            y3Var = l7Var;
        } else {
            if (i7 == 5) {
                x3 X = gt0.X(3, gt0Var.m1, context, i6Var);
                X.setLayoutParams(new v4.q0(-1, -1));
                return new kj0(X);
            }
            wz wzVar = new wz(context, i6Var);
            wzVar.setIsSingleCell(true);
            wzVar.x = false;
            wzVar.setViewType(5);
            y3Var = wzVar;
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}

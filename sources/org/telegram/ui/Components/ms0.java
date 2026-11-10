package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ms0 extends kj0 {
    public final Context r;
    public final /* synthetic */ ys0 s;

    public ms0(ys0 ys0Var, Context context) {
        this.s = ys0Var;
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
        ns0[] ns0VarArr = this.s.v1;
        if ((ns0VarArr[3].c.size() == 0 && !ns0VarArr[3].g) || i7 >= ns0VarArr[3].c.size()) {
            return 1;
        }
        ns0 ns0Var = ns0VarArr[3];
        return ((ArrayList) ns0Var.d.get(ns0Var.c.get(i7))).size() + (i7 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        ns0[] ns0VarArr = this.s.v1;
        if (ns0VarArr[3].c.size() == 0 && !ns0VarArr[3].g) {
            return 5;
        }
        if (i7 < ns0VarArr[3].c.size()) {
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
        ns0[] ns0VarArr = this.s.v1;
        int i7 = 1;
        if (ns0VarArr[3].c.size() == 0 && !ns0VarArr[3].g) {
            return 1;
        }
        int size = ns0VarArr[3].c.size();
        if (!ns0VarArr[3].c.isEmpty()) {
            boolean[] zArr = ns0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i7;
        }
        i7 = 0;
        return size + i7;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        ys0 ys0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.r, ys0Var.H1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < ys0Var.v1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) ys0Var.v1[3].d.get((String) ys0Var.v1[3].c.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        ns0[] ns0VarArr = this.s.v1;
        if (ns0VarArr[3].c.size() != 0 || ns0VarArr[3].g) {
            return i7 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        ys0 ys0Var = this.s;
        ns0[] ns0VarArr = ys0Var.v1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) ns0VarArr[3].d.get((String) ns0VarArr[3].c.get(i7));
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
        k7Var.D = i10 != arrayList.size() - 1 || (i7 == ns0VarArr[3].c.size() - 1 && ns0VarArr[3].g);
        k7Var.e();
        k7Var.b0 = ijVar2;
        k7Var.requestLayout();
        if (ys0Var.E1) {
            k7Var.f(ys0Var.b1[(org.telegram.messenger.ij.B0(ijVar2.k) > ys0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar2.k) == ys0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar2.e1()) >= 0, !ys0Var.d1);
        } else {
            k7Var.f(false, !ys0Var.d1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        ys0 ys0Var = this.s;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.r;
        if (i7 == 3) {
            x3Var = new org.telegram.ui.Cells.x3(28, context, h6Var);
        } else if (i7 == 4) {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, h6Var);
            k7Var.setDelegate(ys0Var.V1);
            x3Var = k7Var;
        } else {
            if (i7 == 5) {
                q3 X = ys0.X(3, ys0Var.l1, context, h6Var);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new xi0(X);
            }
            lz lzVar = new lz(context, h6Var);
            lzVar.setIsSingleCell(true);
            lzVar.x = false;
            lzVar.setViewType(5);
            x3Var = lzVar;
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}

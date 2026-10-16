package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lv0 extends im0 {
    public final Context r;
    public final /* synthetic */ xv0 s;

    public lv0(xv0 xv0Var, Context context) {
        this.s = xv0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.im0
    public final int M(int i10) {
        mv0[] mv0VarArr = this.s.t1;
        if ((mv0VarArr[3].c.size() == 0 && !mv0VarArr[3].g) || i10 >= mv0VarArr[3].c.size()) {
            return 1;
        }
        mv0 mv0Var = mv0VarArr[3];
        return ((ArrayList) mv0Var.d.get(mv0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.im0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.im0
    public final int P(int i10, int i11) {
        mv0[] mv0VarArr = this.s.t1;
        if (mv0VarArr[3].c.size() == 0 && !mv0VarArr[3].g) {
            return 5;
        }
        if (i10 < mv0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.im0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        mv0[] mv0VarArr = this.s.t1;
        int i10 = 1;
        if (mv0VarArr[3].c.size() == 0 && !mv0VarArr[3].g) {
            return 1;
        }
        int size = mv0VarArr[3].c.size();
        if (!mv0VarArr[3].c.isEmpty()) {
            boolean[] zArr = mv0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final View T(int i10, View view) {
        xv0 xv0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.r, 28, xv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < xv0Var.t1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) xv0Var.t1[3].d.get((String) xv0Var.t1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        mv0[] mv0VarArr = this.s.t1;
        if (mv0VarArr[3].c.size() != 0 || mv0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.im0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        xv0 xv0Var = this.s;
        mv0[] mv0VarArr = xv0Var.t1;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) mv0VarArr[3].d.get((String) mv0VarArr[3].c.get(i10));
        int i13 = b1Var.f;
        if (i13 == 3) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.v3) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
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
        if (!(view instanceof org.telegram.ui.Cells.n7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        n7Var.y = i11 != arrayList.size() - 1 || (i10 == mv0VarArr[3].c.size() - 1 && mv0VarArr[3].g);
        n7Var.e();
        n7Var.b0 = messageObject2;
        n7Var.requestLayout();
        if (xv0Var.C1) {
            n7Var.f(xv0Var.Z0[(messageObject2.getDialogId() > xv0Var.j1 ? 1 : (messageObject2.getDialogId() == xv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !xv0Var.b1);
        } else {
            n7Var.f(false, !xv0Var.b1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        xv0 xv0Var = this.s;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.r;
        if (i10 == 3) {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, c6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, c6Var);
            n7Var.setDelegate(xv0Var.S1);
            v3Var = n7Var;
        } else {
            if (i10 == 5) {
                ku0 M = xv0.M(3, xv0Var.j1, context, c6Var);
                M.setLayoutParams(new s4.o0(-1, -1));
                return new wl0(M);
            }
            f10 f10Var = new f10(context, c6Var);
            f10Var.setIsSingleCell(true);
            f10Var.w = false;
            f10Var.setViewType(5);
            v3Var = f10Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(v3Var, v3Var, -1, -2);
    }
}

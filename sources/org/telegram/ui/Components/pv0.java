package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pv0 extends im0 {
    public final Context r;
    public final /* synthetic */ bw0 s;

    public pv0(bw0 bw0Var, Context context) {
        this.s = bw0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.im0
    public final int M(int i10) {
        qv0[] qv0VarArr = this.s.v1;
        if ((qv0VarArr[3].c.size() == 0 && !qv0VarArr[3].g) || i10 >= qv0VarArr[3].c.size()) {
            return 1;
        }
        qv0 qv0Var = qv0VarArr[3];
        return ((ArrayList) qv0Var.d.get(qv0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.im0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.im0
    public final int P(int i10, int i11) {
        qv0[] qv0VarArr = this.s.v1;
        if (qv0VarArr[3].c.size() == 0 && !qv0VarArr[3].g) {
            return 5;
        }
        if (i10 < qv0VarArr[3].c.size()) {
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
        qv0[] qv0VarArr = this.s.v1;
        int i10 = 1;
        if (qv0VarArr[3].c.size() == 0 && !qv0VarArr[3].g) {
            return 1;
        }
        int size = qv0VarArr[3].c.size();
        if (!qv0VarArr[3].c.isEmpty()) {
            boolean[] zArr = qv0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final View T(int i10, View view) {
        bw0 bw0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.r, 28, bw0Var.H1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < bw0Var.v1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) bw0Var.v1[3].d.get((String) bw0Var.v1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        qv0[] qv0VarArr = this.s.v1;
        if (qv0VarArr[3].c.size() != 0 || qv0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.im0
    public final void W(int i10, int i11, s4.e1 e1Var) {
        bw0 bw0Var = this.s;
        qv0[] qv0VarArr = bw0Var.v1;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) qv0VarArr[3].d.get((String) qv0VarArr[3].c.get(i10));
        int i13 = e1Var.f;
        if (i13 == 3) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
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
        if (!(view instanceof org.telegram.ui.Cells.r7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        r7Var.y = i11 != arrayList.size() - 1 || (i10 == qv0VarArr[3].c.size() - 1 && qv0VarArr[3].g);
        r7Var.e();
        r7Var.b0 = messageObject2;
        r7Var.requestLayout();
        if (bw0Var.E1) {
            r7Var.f(bw0Var.b1[(messageObject2.getDialogId() > bw0Var.l1 ? 1 : (messageObject2.getDialogId() == bw0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !bw0Var.d1);
        } else {
            r7Var.f(false, !bw0Var.d1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        bw0 bw0Var = this.s;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.r;
        if (i10 == 3) {
            z3Var = new org.telegram.ui.Cells.z3(context, 28, u6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 0, u6Var);
            r7Var.setDelegate(bw0Var.V1);
            z3Var = r7Var;
        } else {
            if (i10 == 5) {
                ou0 U = bw0.U(3, bw0Var.l1, context, u6Var);
                U.setLayoutParams(new s4.q0(-1, -1));
                return new wl0(U);
            }
            c10 c10Var = new c10(context, u6Var);
            c10Var.setIsSingleCell(true);
            c10Var.w = false;
            c10Var.setViewType(5);
            z3Var = c10Var;
        }
        return ic.a.n(z3Var, z3Var, -1, -2);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class st0 extends sk0 {
    public final Context r;
    public final /* synthetic */ eu0 s;

    public st0(eu0 eu0Var, Context context) {
        this.s = eu0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        tt0[] tt0VarArr = this.s.p1;
        if ((tt0VarArr[3].c.size() == 0 && !tt0VarArr[3].g) || i9 >= tt0VarArr[3].c.size()) {
            return 1;
        }
        tt0 tt0Var = tt0VarArr[3];
        return ((ArrayList) tt0Var.d.get(tt0Var.c.get(i9))).size() + (i9 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        tt0[] tt0VarArr = this.s.p1;
        if (tt0VarArr[3].c.size() == 0 && !tt0VarArr[3].g) {
            return 5;
        }
        if (i9 < tt0VarArr[3].c.size()) {
            return (i9 == 0 || i10 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        tt0[] tt0VarArr = this.s.p1;
        int i9 = 1;
        if (tt0VarArr[3].c.size() == 0 && !tt0VarArr[3].g) {
            return 1;
        }
        int size = tt0VarArr[3].c.size();
        if (!tt0VarArr[3].c.isEmpty()) {
            boolean[] zArr = tt0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i9;
        }
        i9 = 0;
        return size + i9;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        eu0 eu0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.r, 28, eu0Var.B1);
        }
        if (i9 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i9 < eu0Var.p1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) eu0Var.p1[3].d.get((String) eu0Var.p1[3].c.get(i9))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        tt0[] tt0VarArr = this.s.p1;
        if (tt0VarArr[3].c.size() != 0 || tt0VarArr[3].g) {
            return i9 == 0 || i10 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        eu0 eu0Var = this.s;
        tt0[] tt0VarArr = eu0Var.p1;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 6 || i11 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) tt0VarArr[3].d.get((String) tt0VarArr[3].c.get(i9));
        int i12 = q1Var.f;
        if (i12 == 3) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.v3) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
                return;
            }
            return;
        }
        if (i12 != 4) {
            return;
        }
        if (i9 != 0) {
            i10--;
        }
        if (!(view instanceof org.telegram.ui.Cells.l7) || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
        l7Var.y = i10 != arrayList.size() - 1 || (i9 == tt0VarArr[3].c.size() - 1 && tt0VarArr[3].g);
        l7Var.e();
        l7Var.U = messageObject2;
        l7Var.requestLayout();
        if (eu0Var.y1) {
            l7Var.f(eu0Var.V0[(messageObject2.getDialogId() > eu0Var.f1 ? 1 : (messageObject2.getDialogId() == eu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !eu0Var.X0);
        } else {
            l7Var.f(false, !eu0Var.X0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.v3 v3Var;
        eu0 eu0Var = this.s;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.r;
        if (i9 == 3) {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, b6Var);
        } else if (i9 == 4) {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, b6Var);
            l7Var.setDelegate(eu0Var.O1);
            v3Var = l7Var;
        } else {
            if (i9 == 5) {
                rs0 M = eu0.M(3, eu0Var.f1, context, b6Var);
                M.setLayoutParams(new f2.a1(-1, -1));
                return new ik0(M);
            }
            e00 e00Var = new e00(context, b6Var);
            e00Var.setIsSingleCell(true);
            e00Var.w = false;
            e00Var.setViewType(5);
            v3Var = e00Var;
        }
        return j3.r0.s(v3Var, v3Var, -1, -2);
    }
}

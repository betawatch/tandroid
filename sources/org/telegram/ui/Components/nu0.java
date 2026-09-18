package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nu0 extends il0 {
    public final Context r;
    public final /* synthetic */ zu0 s;

    public nu0(zu0 zu0Var, Context context) {
        this.s = zu0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.uk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.uk0
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.il0
    public final int M(int i10) {
        ou0[] ou0VarArr = this.s.t1;
        if ((ou0VarArr[3].c.size() == 0 && !ou0VarArr[3].g) || i10 >= ou0VarArr[3].c.size()) {
            return 1;
        }
        ou0 ou0Var = ou0VarArr[3];
        return ((ArrayList) ou0Var.d.get(ou0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.il0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.il0
    public final int P(int i10, int i11) {
        ou0[] ou0VarArr = this.s.t1;
        if (ou0VarArr[3].c.size() == 0 && !ou0VarArr[3].g) {
            return 5;
        }
        if (i10 < ou0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        ou0[] ou0VarArr = this.s.t1;
        int i10 = 1;
        if (ou0VarArr[3].c.size() == 0 && !ou0VarArr[3].g) {
            return 1;
        }
        int size = ou0VarArr[3].c.size();
        if (!ou0VarArr[3].c.isEmpty()) {
            boolean[] zArr = ou0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final View T(int i10, View view) {
        zu0 zu0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, 28, zu0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < zu0Var.t1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) zu0Var.t1[3].d.get((String) zu0Var.t1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        ou0[] ou0VarArr = this.s.t1;
        if (ou0VarArr[3].c.size() != 0 || ou0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        zu0 zu0Var = this.s;
        ou0[] ou0VarArr = zu0Var.t1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) ou0VarArr[3].d.get((String) ou0VarArr[3].c.get(i10));
        int i13 = c1Var.f;
        if (i13 == 3) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.u3) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
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
        n7Var.y = i11 != arrayList.size() - 1 || (i10 == ou0VarArr[3].c.size() - 1 && ou0VarArr[3].g);
        n7Var.e();
        n7Var.b0 = messageObject2;
        n7Var.requestLayout();
        if (zu0Var.C1) {
            n7Var.f(zu0Var.Z0[(messageObject2.getDialogId() > zu0Var.j1 ? 1 : (messageObject2.getDialogId() == zu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !zu0Var.b1);
        } else {
            n7Var.f(false, !zu0Var.b1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        zu0 zu0Var = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.r;
        if (i10 == 3) {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, f6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, f6Var);
            n7Var.setDelegate(zu0Var.S1);
            u3Var = n7Var;
        } else {
            if (i10 == 5) {
                mt0 M = zu0.M(3, zu0Var.j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new wk0(M);
            }
            t00 t00Var = new t00(context, f6Var);
            t00Var.setIsSingleCell(true);
            t00Var.w = false;
            t00Var.setViewType(5);
            u3Var = t00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(u3Var, u3Var, -1, -2);
    }
}

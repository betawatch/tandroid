package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eu0 extends fl0 {
    public final Context r;
    public final /* synthetic */ qu0 s;

    public eu0(qu0 qu0Var, Context context) {
        this.s = qu0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int M(int i10) {
        fu0[] fu0VarArr = this.s.p1;
        if ((fu0VarArr[3].c.size() == 0 && !fu0VarArr[3].g) || i10 >= fu0VarArr[3].c.size()) {
            return 1;
        }
        fu0 fu0Var = fu0VarArr[3];
        return ((ArrayList) fu0Var.d.get(fu0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.fl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int P(int i10, int i11) {
        fu0[] fu0VarArr = this.s.p1;
        if (fu0VarArr[3].c.size() == 0 && !fu0VarArr[3].g) {
            return 5;
        }
        if (i10 < fu0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        fu0[] fu0VarArr = this.s.p1;
        int i10 = 1;
        if (fu0VarArr[3].c.size() == 0 && !fu0VarArr[3].g) {
            return 1;
        }
        int size = fu0VarArr[3].c.size();
        if (!fu0VarArr[3].c.isEmpty()) {
            boolean[] zArr = fu0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.fl0
    public final View T(int i10, View view) {
        qu0 qu0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.r, 28, qu0Var.B1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < qu0Var.p1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) qu0Var.p1[3].d.get((String) qu0Var.p1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        fu0[] fu0VarArr = this.s.p1;
        if (fu0VarArr[3].c.size() != 0 || fu0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void W(int i10, int i11, f2.n1 n1Var) {
        qu0 qu0Var = this.s;
        fu0[] fu0VarArr = qu0Var.p1;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) fu0VarArr[3].d.get((String) fu0VarArr[3].c.get(i10));
        int i13 = n1Var.f;
        if (i13 == 3) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.s3) {
                ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
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
        if (!(view instanceof org.telegram.ui.Cells.j7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        j7Var.y = i11 != arrayList.size() - 1 || (i10 == fu0VarArr[3].c.size() - 1 && fu0VarArr[3].g);
        j7Var.e();
        j7Var.U = messageObject2;
        j7Var.requestLayout();
        if (qu0Var.y1) {
            j7Var.f(qu0Var.V0[(messageObject2.getDialogId() > qu0Var.f1 ? 1 : (messageObject2.getDialogId() == qu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !qu0Var.X0);
        } else {
            j7Var.f(false, !qu0Var.X0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        qu0 qu0Var = this.s;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.r;
        if (i10 == 3) {
            s3Var = new org.telegram.ui.Cells.s3(context, 28, c6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, c6Var);
            j7Var.setDelegate(qu0Var.O1);
            s3Var = j7Var;
        } else {
            if (i10 == 5) {
                ct0 M = qu0.M(3, qu0Var.f1, context, c6Var);
                M.setLayoutParams(new f2.x0(-1, -1));
                return new vk0(M);
            }
            p00 p00Var = new p00(context, c6Var);
            p00Var.setIsSingleCell(true);
            p00Var.w = false;
            p00Var.setViewType(5);
            s3Var = p00Var;
        }
        return org.telegram.ui.th.m(s3Var, s3Var, -1, -2);
    }
}

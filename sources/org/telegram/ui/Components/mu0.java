package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mu0 extends ol0 {
    public final Context r;
    public final /* synthetic */ yu0 s;

    public mu0(yu0 yu0Var, Context context) {
        this.s = yu0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int M(int i10) {
        nu0[] nu0VarArr = this.s.q1;
        if ((nu0VarArr[3].c.size() == 0 && !nu0VarArr[3].g) || i10 >= nu0VarArr[3].c.size()) {
            return 1;
        }
        nu0 nu0Var = nu0VarArr[3];
        return ((ArrayList) nu0Var.d.get(nu0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.ol0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int P(int i10, int i11) {
        nu0[] nu0VarArr = this.s.q1;
        if (nu0VarArr[3].c.size() == 0 && !nu0VarArr[3].g) {
            return 5;
        }
        if (i10 < nu0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.ol0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        nu0[] nu0VarArr = this.s.q1;
        int i10 = 1;
        if (nu0VarArr[3].c.size() == 0 && !nu0VarArr[3].g) {
            return 1;
        }
        int size = nu0VarArr[3].c.size();
        if (!nu0VarArr[3].c.isEmpty()) {
            boolean[] zArr = nu0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.ol0
    public final View T(int i10, View view) {
        yu0 yu0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, 28, yu0Var.C1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < yu0Var.q1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) yu0Var.q1[3].d.get((String) yu0Var.q1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ol0
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        nu0[] nu0VarArr = this.s.q1;
        if (nu0VarArr[3].c.size() != 0 || nu0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public final void W(int i10, int i11, f2.m1 m1Var) {
        yu0 yu0Var = this.s;
        nu0[] nu0VarArr = yu0Var.q1;
        int i12 = m1Var.f;
        View view = m1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) nu0VarArr[3].d.get((String) nu0VarArr[3].c.get(i10));
        int i13 = m1Var.f;
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
        if (!(view instanceof org.telegram.ui.Cells.l7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        l7Var.y = i11 != arrayList.size() - 1 || (i10 == nu0VarArr[3].c.size() - 1 && nu0VarArr[3].g);
        l7Var.e();
        l7Var.V = messageObject2;
        l7Var.requestLayout();
        if (yu0Var.z1) {
            l7Var.f(yu0Var.W0[(messageObject2.getDialogId() > yu0Var.g1 ? 1 : (messageObject2.getDialogId() == yu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !yu0Var.Y0);
        } else {
            l7Var.f(false, !yu0Var.Y0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        yu0 yu0Var = this.s;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.r;
        if (i10 == 3) {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, g6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, g6Var);
            l7Var.setDelegate(yu0Var.P1);
            u3Var = l7Var;
        } else {
            if (i10 == 5) {
                kt0 M = yu0.M(3, yu0Var.g1, context, g6Var);
                M.setLayoutParams(new f2.x0(-1, -1));
                return new el0(M);
            }
            u00 u00Var = new u00(context, g6Var);
            u00Var.setIsSingleCell(true);
            u00Var.w = false;
            u00Var.setViewType(5);
            u3Var = u00Var;
        }
        return org.telegram.ui.yh.o(u3Var, u3Var, -1, -2);
    }
}

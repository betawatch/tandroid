package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class gv0 extends em0 {
    public final Context r;
    public final /* synthetic */ sv0 s;

    public gv0(sv0 sv0Var, Context context) {
        this.s = sv0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void G(im0 im0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.em0
    public final int M(int i10) {
        hv0[] hv0VarArr = this.s.t1;
        if ((hv0VarArr[3].c.size() == 0 && !hv0VarArr[3].g) || i10 >= hv0VarArr[3].c.size()) {
            return 1;
        }
        hv0 hv0Var = hv0VarArr[3];
        return ((ArrayList) hv0Var.d.get(hv0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.em0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.em0
    public final int P(int i10, int i11) {
        hv0[] hv0VarArr = this.s.t1;
        if (hv0VarArr[3].c.size() == 0 && !hv0VarArr[3].g) {
            return 5;
        }
        if (i10 < hv0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.em0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        hv0[] hv0VarArr = this.s.t1;
        int i10 = 1;
        if (hv0VarArr[3].c.size() == 0 && !hv0VarArr[3].g) {
            return 1;
        }
        int size = hv0VarArr[3].c.size();
        if (!hv0VarArr[3].c.isEmpty()) {
            boolean[] zArr = hv0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.em0
    public final View T(int i10, View view) {
        sv0 sv0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, 28, sv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < sv0Var.t1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) sv0Var.t1[3].d.get((String) sv0Var.t1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.em0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        hv0[] hv0VarArr = this.s.t1;
        if (hv0VarArr[3].c.size() != 0 || hv0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.em0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        sv0 sv0Var = this.s;
        hv0[] hv0VarArr = sv0Var.t1;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) hv0VarArr[3].d.get((String) hv0VarArr[3].c.get(i10));
        int i13 = b1Var.f;
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
        if (!(view instanceof org.telegram.ui.Cells.m7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        m7Var.y = i11 != arrayList.size() - 1 || (i10 == hv0VarArr[3].c.size() - 1 && hv0VarArr[3].g);
        m7Var.e();
        m7Var.b0 = messageObject2;
        m7Var.requestLayout();
        if (sv0Var.C1) {
            m7Var.f(sv0Var.Z0[(messageObject2.getDialogId() > sv0Var.j1 ? 1 : (messageObject2.getDialogId() == sv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !sv0Var.b1);
        } else {
            m7Var.f(false, !sv0Var.b1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        sv0 sv0Var = this.s;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.r;
        if (i10 == 3) {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, d6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 0, d6Var);
            m7Var.setDelegate(sv0Var.S1);
            u3Var = m7Var;
        } else {
            if (i10 == 5) {
                fu0 M = sv0.M(3, sv0Var.j1, context, d6Var);
                M.setLayoutParams(new s4.o0(-1, -1));
                return new sl0(M);
            }
            b10 b10Var = new b10(context, d6Var);
            b10Var.setIsSingleCell(true);
            b10Var.w = false;
            b10Var.setViewType(5);
            u3Var = b10Var;
        }
        return com.google.android.gms.internal.cast.a6.l(u3Var, u3Var, -1, -2);
    }
}

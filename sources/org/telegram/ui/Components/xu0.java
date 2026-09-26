package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class xu0 extends sl0 {
    public final Context r;
    public final /* synthetic */ jv0 s;

    public xu0(jv0 jv0Var, Context context) {
        this.s = jv0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.el0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.el0
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sl0
    public final int M(int i10) {
        yu0[] yu0VarArr = this.s.t1;
        if ((yu0VarArr[3].c.size() == 0 && !yu0VarArr[3].g) || i10 >= yu0VarArr[3].c.size()) {
            return 1;
        }
        yu0 yu0Var = yu0VarArr[3];
        return ((ArrayList) yu0Var.d.get(yu0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.sl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.sl0
    public final int P(int i10, int i11) {
        yu0[] yu0VarArr = this.s.t1;
        if (yu0VarArr[3].c.size() == 0 && !yu0VarArr[3].g) {
            return 5;
        }
        if (i10 < yu0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.sl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        yu0[] yu0VarArr = this.s.t1;
        int i10 = 1;
        if (yu0VarArr[3].c.size() == 0 && !yu0VarArr[3].g) {
            return 1;
        }
        int size = yu0VarArr[3].c.size();
        if (!yu0VarArr[3].c.isEmpty()) {
            boolean[] zArr = yu0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public final View T(int i10, View view) {
        jv0 jv0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.r, 28, jv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < jv0Var.t1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) jv0Var.t1[3].d.get((String) jv0Var.t1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        yu0[] yu0VarArr = this.s.t1;
        if (yu0VarArr[3].c.size() != 0 || yu0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        jv0 jv0Var = this.s;
        yu0[] yu0VarArr = jv0Var.t1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) yu0VarArr[3].d.get((String) yu0VarArr[3].c.get(i10));
        int i13 = c1Var.f;
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
        n7Var.y = i11 != arrayList.size() - 1 || (i10 == yu0VarArr[3].c.size() - 1 && yu0VarArr[3].g);
        n7Var.e();
        n7Var.b0 = messageObject2;
        n7Var.requestLayout();
        if (jv0Var.C1) {
            n7Var.f(jv0Var.Z0[(messageObject2.getDialogId() > jv0Var.j1 ? 1 : (messageObject2.getDialogId() == jv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !jv0Var.b1);
        } else {
            n7Var.f(false, !jv0Var.b1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        jv0 jv0Var = this.s;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.r;
        if (i10 == 3) {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, d6Var);
            n7Var.setDelegate(jv0Var.S1);
            v3Var = n7Var;
        } else {
            if (i10 == 5) {
                wt0 M = jv0.M(3, jv0Var.j1, context, d6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new gl0(M);
            }
            u00 u00Var = new u00(context, d6Var);
            u00Var.setIsSingleCell(true);
            u00Var.w = false;
            u00Var.setViewType(5);
            v3Var = u00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}

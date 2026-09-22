package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zu0 extends ul0 {
    public final Context r;
    public final /* synthetic */ lv0 s;

    public zu0(lv0 lv0Var, Context context) {
        this.s = lv0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.gl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int M(int i10) {
        av0[] av0VarArr = this.s.t1;
        if ((av0VarArr[3].c.size() == 0 && !av0VarArr[3].g) || i10 >= av0VarArr[3].c.size()) {
            return 1;
        }
        av0 av0Var = av0VarArr[3];
        return ((ArrayList) av0Var.d.get(av0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.ul0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int P(int i10, int i11) {
        av0[] av0VarArr = this.s.t1;
        if (av0VarArr[3].c.size() == 0 && !av0VarArr[3].g) {
            return 5;
        }
        if (i10 < av0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        av0[] av0VarArr = this.s.t1;
        int i10 = 1;
        if (av0VarArr[3].c.size() == 0 && !av0VarArr[3].g) {
            return 1;
        }
        int size = av0VarArr[3].c.size();
        if (!av0VarArr[3].c.isEmpty()) {
            boolean[] zArr = av0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final View T(int i10, View view) {
        lv0 lv0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.w3(this.r, 28, lv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < lv0Var.t1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) lv0Var.t1[3].d.get((String) lv0Var.t1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        av0[] av0VarArr = this.s.t1;
        if (av0VarArr[3].c.size() != 0 || av0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        lv0 lv0Var = this.s;
        av0[] av0VarArr = lv0Var.t1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) av0VarArr[3].d.get((String) av0VarArr[3].c.get(i10));
        int i13 = c1Var.f;
        if (i13 == 3) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
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
        if (!(view instanceof org.telegram.ui.Cells.o7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        o7Var.y = i11 != arrayList.size() - 1 || (i10 == av0VarArr[3].c.size() - 1 && av0VarArr[3].g);
        o7Var.e();
        o7Var.b0 = messageObject2;
        o7Var.requestLayout();
        if (lv0Var.C1) {
            o7Var.f(lv0Var.Z0[(messageObject2.getDialogId() > lv0Var.j1 ? 1 : (messageObject2.getDialogId() == lv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !lv0Var.b1);
        } else {
            o7Var.f(false, !lv0Var.b1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w3 w3Var;
        lv0 lv0Var = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
        Context context = this.r;
        if (i10 == 3) {
            w3Var = new org.telegram.ui.Cells.w3(context, 28, f6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
            o7Var.setDelegate(lv0Var.S1);
            w3Var = o7Var;
        } else {
            if (i10 == 5) {
                yt0 M = lv0.M(3, lv0Var.j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new il0(M);
            }
            t00 t00Var = new t00(context, f6Var);
            t00Var.setIsSingleCell(true);
            t00Var.w = false;
            t00Var.setViewType(5);
            w3Var = t00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(w3Var, w3Var, -1, -2);
    }
}

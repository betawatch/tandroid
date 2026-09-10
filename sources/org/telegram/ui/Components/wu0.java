package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wu0 extends rl0 {
    public final Context r;
    public final /* synthetic */ iv0 s;

    public wu0(iv0 iv0Var, Context context) {
        this.s = iv0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int M(int i10) {
        xu0[] xu0VarArr = this.s.t1;
        if ((xu0VarArr[3].c.size() == 0 && !xu0VarArr[3].g) || i10 >= xu0VarArr[3].c.size()) {
            return 1;
        }
        xu0 xu0Var = xu0VarArr[3];
        return ((ArrayList) xu0Var.d.get(xu0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.rl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int P(int i10, int i11) {
        xu0[] xu0VarArr = this.s.t1;
        if (xu0VarArr[3].c.size() == 0 && !xu0VarArr[3].g) {
            return 5;
        }
        if (i10 < xu0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.rl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        xu0[] xu0VarArr = this.s.t1;
        int i10 = 1;
        if (xu0VarArr[3].c.size() == 0 && !xu0VarArr[3].g) {
            return 1;
        }
        int size = xu0VarArr[3].c.size();
        if (!xu0VarArr[3].c.isEmpty()) {
            boolean[] zArr = xu0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final View T(int i10, View view) {
        iv0 iv0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, 28, iv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < iv0Var.t1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) iv0Var.t1[3].d.get((String) iv0Var.t1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        xu0[] xu0VarArr = this.s.t1;
        if (xu0VarArr[3].c.size() != 0 || xu0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        iv0 iv0Var = this.s;
        xu0[] xu0VarArr = iv0Var.t1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) xu0VarArr[3].d.get((String) xu0VarArr[3].c.get(i10));
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
        if (!(view instanceof org.telegram.ui.Cells.o7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        o7Var.y = i11 != arrayList.size() - 1 || (i10 == xu0VarArr[3].c.size() - 1 && xu0VarArr[3].g);
        o7Var.e();
        o7Var.b0 = messageObject2;
        o7Var.requestLayout();
        if (iv0Var.C1) {
            o7Var.f(iv0Var.Z0[(messageObject2.getDialogId() > iv0Var.j1 ? 1 : (messageObject2.getDialogId() == iv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !iv0Var.b1);
        } else {
            o7Var.f(false, !iv0Var.b1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        iv0 iv0Var = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.r;
        if (i10 == 3) {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, f6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
            o7Var.setDelegate(iv0Var.S1);
            u3Var = o7Var;
        } else {
            if (i10 == 5) {
                ut0 M = iv0.M(3, iv0Var.j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new fl0(M);
            }
            a10 a10Var = new a10(context, f6Var);
            a10Var.setIsSingleCell(true);
            a10Var.w = false;
            a10Var.setViewType(5);
            u3Var = a10Var;
        }
        return com.google.android.gms.internal.vision.e2.j(u3Var, u3Var, -1, -2);
    }
}

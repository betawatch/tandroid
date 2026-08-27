package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vt0 extends vk0 {
    public final Context r;
    public final /* synthetic */ hu0 s;

    public vt0(hu0 hu0Var, Context context) {
        this.s = hu0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.vk0
    public final int M(int i10) {
        wt0[] wt0VarArr = this.s.p1;
        if ((wt0VarArr[3].c.size() == 0 && !wt0VarArr[3].g) || i10 >= wt0VarArr[3].c.size()) {
            return 1;
        }
        wt0 wt0Var = wt0VarArr[3];
        return ((ArrayList) wt0Var.d.get(wt0Var.c.get(i10))).size() + (i10 == 0 ? 0 : 1);
    }

    @Override // org.telegram.ui.Components.vk0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.vk0
    public final int P(int i10, int i11) {
        wt0[] wt0VarArr = this.s.p1;
        if (wt0VarArr[3].c.size() == 0 && !wt0VarArr[3].g) {
            return 5;
        }
        if (i10 < wt0VarArr[3].c.size()) {
            return (i10 == 0 || i11 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0[1] != false) goto L13;
     */
    @Override // org.telegram.ui.Components.vk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        wt0[] wt0VarArr = this.s.p1;
        int i10 = 1;
        if (wt0VarArr[3].c.size() == 0 && !wt0VarArr[3].g) {
            return 1;
        }
        int size = wt0VarArr[3].c.size();
        if (!wt0VarArr[3].c.isEmpty()) {
            boolean[] zArr = wt0VarArr[3].i;
            if (zArr[0]) {
            }
            return size + i10;
        }
        i10 = 0;
        return size + i10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final View T(int i10, View view) {
        hu0 hu0Var = this.s;
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.r, 28, hu0Var.B1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < hu0Var.p1[3].c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) hu0Var.p1[3].d.get((String) hu0Var.p1[3].c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        wt0[] wt0VarArr = this.s.p1;
        if (wt0VarArr[3].c.size() != 0 || wt0VarArr[3].g) {
            return i10 == 0 || i11 != 0;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vk0
    public final void W(int i10, int i11, f2.o1 o1Var) {
        hu0 hu0Var = this.s;
        wt0[] wt0VarArr = hu0Var.p1;
        int i12 = o1Var.f;
        View view = o1Var.a;
        if (i12 == 6 || i12 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) wt0VarArr[3].d.get((String) wt0VarArr[3].c.get(i10));
        int i13 = o1Var.f;
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
        if (!(view instanceof org.telegram.ui.Cells.i7) || i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
        MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
        i7Var.y = i11 != arrayList.size() - 1 || (i10 == wt0VarArr[3].c.size() - 1 && wt0VarArr[3].g);
        i7Var.e();
        i7Var.U = messageObject2;
        i7Var.requestLayout();
        if (hu0Var.y1) {
            i7Var.f(hu0Var.V0[(messageObject2.getDialogId() > hu0Var.f1 ? 1 : (messageObject2.getDialogId() == hu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !hu0Var.X0);
        } else {
            i7Var.f(false, !hu0Var.X0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        hu0 hu0Var = this.s;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.r;
        if (i10 == 3) {
            s3Var = new org.telegram.ui.Cells.s3(context, 28, c6Var);
        } else if (i10 == 4) {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, c6Var);
            i7Var.setDelegate(hu0Var.O1);
            s3Var = i7Var;
        } else {
            if (i10 == 5) {
                ts0 M = hu0.M(3, hu0Var.f1, context, c6Var);
                M.setLayoutParams(new f2.y0(-1, -1));
                return new lk0(M);
            }
            h00 h00Var = new h00(context, c6Var);
            h00Var.setIsSingleCell(true);
            h00Var.w = false;
            h00Var.setViewType(5);
            s3Var = h00Var;
        }
        return org.telegram.ui.Cells.pa.l(s3Var, s3Var, -1, -2);
    }
}

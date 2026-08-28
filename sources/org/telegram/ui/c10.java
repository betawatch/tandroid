package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c10 extends org.telegram.ui.Components.sk0 {
    public final Context r;
    public final b10 s = new b10(this);
    public final /* synthetic */ f10 v;

    public c10(f10 f10Var, Context context) {
        this.v = f10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        f10 f10Var = this.v;
        if (i9 < f10Var.n.size()) {
            return ((ArrayList) f10Var.r.get(f10Var.n.get(i9))).size() + (i9 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        if (i9 < this.v.n.size()) {
            return (i9 == 0 || i10 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int R() {
        f10 f10Var = this.v;
        ArrayList arrayList = f10Var.n;
        int i9 = 0;
        if (f10Var.f.isEmpty() || (arrayList.isEmpty() && f10Var.I)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !f10Var.J) {
            i9 = 1;
        }
        return size + i9;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.e7, false) & (-218103809));
        }
        if (i9 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i9 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i9))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        f10 f10Var = this.v;
        ArrayList arrayList = f10Var.n;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) f10Var.r.get((String) arrayList.get(i9));
            int i12 = q1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (i9 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            boolean z11 = l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject.getId();
            if (i10 != arrayList2.size() - 1 || (i9 == arrayList.size() - 1 && f10Var.I)) {
                z10 = true;
            }
            l7Var.y = z10;
            l7Var.e();
            l7Var.U = messageObject;
            l7Var.requestLayout();
            l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, l7Var, messageObject, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.v3 v3Var;
        Context context = this.r;
        if (i9 == 0) {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        } else if (i9 != 1) {
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
            e00Var.setViewType(5);
            e00Var.setIsSingleCell(true);
            v3Var = e00Var;
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 1, null);
            l7Var.setDelegate(this.s);
            v3Var = l7Var;
        }
        return j3.r0.s(v3Var, v3Var, -1, -2);
    }
}

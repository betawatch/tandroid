package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q10 extends org.telegram.ui.Components.ol0 {
    public final Context r;
    public final p10 s = new p10(this);
    public final /* synthetic */ t10 v;

    public q10(t10 t10Var, Context context) {
        this.v = t10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(org.telegram.ui.Components.sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int M(int i10) {
        t10 t10Var = this.v;
        if (i10 < t10Var.n.size()) {
            return ((ArrayList) t10Var.r.get(t10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.ol0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int P(int i10, int i11) {
        if (i10 < this.v.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int R() {
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.n;
        int i10 = 0;
        if (t10Var.f.isEmpty() || (arrayList.isEmpty() && t10Var.J)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !t10Var.K) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.ol0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ol0
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.ol0
    public final void W(int i10, int i11, f2.m1 m1Var) {
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.n;
        int i12 = m1Var.f;
        View view = m1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) t10Var.r.get((String) arrayList.get(i10));
            int i13 = m1Var.f;
            boolean z4 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z10 = l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && t10Var.J)) {
                z4 = true;
            }
            l7Var.y = z4;
            l7Var.e();
            l7Var.V = messageObject;
            l7Var.requestLayout();
            l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, l7Var, messageObject, z10, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.r;
        if (i10 == 0) {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
            u00Var.setViewType(5);
            u00Var.setIsSingleCell(true);
            u3Var = u00Var;
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 1, null);
            l7Var.setDelegate(this.s);
            u3Var = l7Var;
        }
        return yh.o(u3Var, u3Var, -1, -2);
    }
}

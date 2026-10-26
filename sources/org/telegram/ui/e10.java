package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e10 extends org.telegram.ui.Components.hm0 {
    public final Context r;
    public final d10 s = new d10(this);
    public final /* synthetic */ h10 v;

    public e10(h10 h10Var, Context context) {
        this.v = h10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.tl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.hm0
    public final int M(int i10) {
        h10 h10Var = this.v;
        if (i10 < h10Var.n.size()) {
            return ((ArrayList) h10Var.r.get(h10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.hm0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.hm0
    public final int P(int i10, int i11) {
        if (i10 < this.v.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.hm0
    public final int R() {
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.n;
        int i10 = 0;
        if (h10Var.f.isEmpty() || (arrayList.isEmpty() && h10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !h10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.hm0
    public final void W(int i10, int i11, s4.e1 e1Var) {
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.n;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) h10Var.r.get((String) arrayList.get(i10));
            int i13 = e1Var.f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z11 = r7Var.getMessage() != null && r7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && h10Var.M)) {
                z10 = true;
            }
            r7Var.y = z10;
            r7Var.e();
            r7Var.b0 = messageObject;
            r7Var.requestLayout();
            r7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, r7Var, messageObject, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        Context context = this.r;
        if (i10 == 0) {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
            c10Var.setViewType(5);
            c10Var.setIsSingleCell(true);
            z3Var = c10Var;
        } else {
            org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 1, null);
            r7Var.setDelegate(this.s);
            z3Var = r7Var;
        }
        return ic.a.n(z3Var, z3Var, -1, -2);
    }
}

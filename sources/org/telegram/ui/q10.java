package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q10 extends org.telegram.ui.Components.sl0 {
    public final Context r;
    public final p10 s = new p10(this);
    public final /* synthetic */ t10 v;

    public q10(t10 t10Var, Context context) {
        this.v = t10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.el0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.el0
    public final void G(org.telegram.ui.Components.wl0 wl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sl0
    public final int M(int i10) {
        t10 t10Var = this.v;
        if (i10 < t10Var.n.size()) {
            return ((ArrayList) t10Var.r.get(t10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.sl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.sl0
    public final int P(int i10, int i11) {
        if (i10 < this.v.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.sl0
    public final int R() {
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.n;
        int i10 = 0;
        if (t10Var.f.isEmpty() || (arrayList.isEmpty() && t10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !t10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.sl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) t10Var.r.get((String) arrayList.get(i10));
            int i13 = c1Var.f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z11 = n7Var.getMessage() != null && n7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && t10Var.M)) {
                z10 = true;
            }
            n7Var.y = z10;
            n7Var.e();
            n7Var.b0 = messageObject;
            n7Var.requestLayout();
            n7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, n7Var, messageObject, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        Context context = this.r;
        if (i10 == 0) {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
            u00Var.setViewType(5);
            u00Var.setIsSingleCell(true);
            v3Var = u00Var;
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 1, null);
            n7Var.setDelegate(this.s);
            v3Var = n7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class b10 extends org.telegram.ui.Components.fm0 {
    public final Context r;
    public final a10 s = new a10(this);
    public final /* synthetic */ e10 v;

    public b10(e10 e10Var, Context context) {
        this.v = e10Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(org.telegram.ui.Components.jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int M(int i10) {
        e10 e10Var = this.v;
        if (i10 < e10Var.n.size()) {
            return ((ArrayList) e10Var.r.get(e10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.fm0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int P(int i10, int i11) {
        if (i10 < this.v.n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int R() {
        e10 e10Var = this.v;
        ArrayList arrayList = e10Var.n;
        int i10 = 0;
        if (e10Var.f.isEmpty() || (arrayList.isEmpty() && e10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !e10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.fm0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
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

    @Override // org.telegram.ui.Components.fm0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.fm0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        e10 e10Var = this.v;
        ArrayList arrayList = e10Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) e10Var.r.get((String) arrayList.get(i10));
            int i13 = b1Var.f;
            boolean z10 = false;
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
            org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z11 = m7Var.getMessage() != null && m7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && e10Var.M)) {
                z10 = true;
            }
            m7Var.y = z10;
            m7Var.e();
            m7Var.b0 = messageObject;
            m7Var.requestLayout();
            m7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, m7Var, messageObject, z11, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.r;
        if (i10 == 0) {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
            b10Var.setViewType(5);
            b10Var.setIsSingleCell(true);
            u3Var = b10Var;
        } else {
            org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 1, null);
            m7Var.setDelegate(this.s);
            u3Var = m7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}

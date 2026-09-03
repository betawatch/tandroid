package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d20 extends f2.b0 {
    public final /* synthetic */ FiltersSetupActivity d;

    public d20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        View view = m1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        return m1Var.f != 2 ? f2.b0.l(0, 0) : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        return true;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (m1Var.f != m1Var2.f) {
            return false;
        }
        a20 a20Var = this.d.b;
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        FiltersSetupActivity filtersSetupActivity = a20Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            x10 x10Var = (x10) arrayList.get(b10);
            x10 x10Var2 = (x10) arrayList.get(b11);
            if (x10Var != null && x10Var2 != null && (dialogFilter = x10Var.d) != null && (dialogFilter2 = x10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, x10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, x10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        if (i10 != 0) {
            this.d.a.I0(false);
            m1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new c10(this, 4));
            AndroidUtilities.runOnUIThread(new c10(this, 4), 320L);
        }
        if (m1Var != null) {
            m1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }
}

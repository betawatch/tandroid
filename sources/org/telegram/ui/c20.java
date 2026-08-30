package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c20 extends f2.b0 {
    public final /* synthetic */ FiltersSetupActivity d;

    public c20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        return l1Var.f != 2 ? f2.b0.l(0, 0) : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        return true;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (l1Var.f != l1Var2.f) {
            return false;
        }
        z10 z10Var = this.d.b;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        FiltersSetupActivity filtersSetupActivity = z10Var.e;
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
    public final void p(f2.l1 l1Var, int i10) {
        if (i10 != 0) {
            this.d.a.I0(false);
            l1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new c10(this, 4));
            AndroidUtilities.runOnUIThread(new c10(this, 4), 320L);
        }
        if (l1Var != null) {
            l1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}

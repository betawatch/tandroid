package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class q10 extends s4.v {
    public final /* synthetic */ FiltersSetupActivity d;

    public q10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        return b1Var.f != 2 ? s4.v.l(0, 0) : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean k() {
        return true;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (b1Var.f != b1Var2.f) {
            return false;
        }
        n10 n10Var = this.d.b;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        FiltersSetupActivity filtersSetupActivity = n10Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            l10 l10Var = (l10) arrayList.get(b10);
            l10 l10Var2 = (l10) arrayList.get(b11);
            if (l10Var != null && l10Var2 != null && (dialogFilter = l10Var.d) != null && (dialogFilter2 = l10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, l10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, l10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        if (i10 != 0) {
            this.d.a.I0(false);
            b1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new fz(this, 5));
            AndroidUtilities.runOnUIThread(new fz(this, 5), 320L);
        }
        if (b1Var != null) {
            b1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}

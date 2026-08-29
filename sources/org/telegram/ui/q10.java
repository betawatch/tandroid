package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q10 extends f2.b0 {
    public final /* synthetic */ FiltersSetupActivity d;

    public q10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        return n1Var.f != 2 ? f2.b0.l(0, 0) : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        return true;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (n1Var.f != n1Var2.f) {
            return false;
        }
        n10 n10Var = this.d.b;
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
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

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        if (i10 != 0) {
            this.d.a.I0(false);
            n1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new q00(this, 4));
            AndroidUtilities.runOnUIThread(new q00(this, 4), 320L);
        }
        if (n1Var != null) {
            n1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }
}

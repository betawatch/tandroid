package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e20 extends f2.b0 {
    public final /* synthetic */ FiltersSetupActivity d;

    public e20(FiltersSetupActivity filtersSetupActivity) {
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
        b20 b20Var = this.d.b;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        FiltersSetupActivity filtersSetupActivity = b20Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            z10 z10Var = (z10) arrayList.get(b10);
            z10 z10Var2 = (z10) arrayList.get(b11);
            if (z10Var != null && z10Var2 != null && (dialogFilter = z10Var.d) != null && (dialogFilter2 = z10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, z10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, z10Var.d);
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
            AndroidUtilities.cancelRunOnUIThread(new d10(this, 4));
            AndroidUtilities.runOnUIThread(new d10(this, 4), 320L);
        }
        if (l1Var != null) {
            l1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}

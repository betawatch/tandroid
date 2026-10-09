package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f20 extends s4.w {
    public final /* synthetic */ FiltersSetupActivity d;

    public f20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        return d1Var.f != 2 ? s4.w.l(0, 0) : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean k() {
        return true;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (d1Var.f != d1Var2.f) {
            return false;
        }
        c20 c20Var = this.d.b;
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        FiltersSetupActivity filtersSetupActivity = c20Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            a20 a20Var = (a20) arrayList.get(b10);
            a20 a20Var2 = (a20) arrayList.get(b11);
            if (a20Var != null && a20Var2 != null && (dialogFilter = a20Var.d) != null && (dialogFilter2 = a20Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, a20Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, a20Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        if (i10 != 0) {
            this.d.a.I0(false);
            d1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new uz(this, 5));
            AndroidUtilities.runOnUIThread(new uz(this, 5), 320L);
        }
        if (d1Var != null) {
            d1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}

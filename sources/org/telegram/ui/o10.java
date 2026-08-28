package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o10 extends f2.d0 {
    public final /* synthetic */ FiltersSetupActivity d;

    public o10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        return q1Var.f != 2 ? f2.d0.l(0, 0) : f2.d0.l(3, 0);
    }

    @Override // f2.d0
    public final boolean k() {
        return true;
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (q1Var.f != q1Var2.f) {
            return false;
        }
        l10 l10Var = this.d.b;
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        FiltersSetupActivity filtersSetupActivity = l10Var.e;
        int i9 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i9 && b11 >= i9) {
            j10 j10Var = (j10) arrayList.get(b10);
            j10 j10Var2 = (j10) arrayList.get(b11);
            if (j10Var != null && j10Var2 != null && (dialogFilter = j10Var.d) != null && (dialogFilter2 = j10Var2.d) != null) {
                int i10 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i10;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, j10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, j10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Y(true);
            }
        }
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        if (i9 != 0) {
            this.d.a.I0(false);
            q1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new o00(this, 4));
            AndroidUtilities.runOnUIThread(new o00(this, 4), 320L);
        }
        if (q1Var != null) {
            q1Var.a.setTag(R.id.dragging, i9 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}

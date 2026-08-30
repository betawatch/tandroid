package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fu0 extends f2.b0 {
    public final /* synthetic */ hu0 d;

    public fu0(hu0 hu0Var) {
        this.d = hu0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        SavedMessagesController.SavedDialog r10;
        int l10 = f2.b0.l(0, 0);
        yu0 yu0Var = this.d.x;
        return (!yu0Var.z1 || recyclerView.getAdapter() == yu0Var.P || (r10 = r(l1Var)) == null || !r10.pinned) ? l10 : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        hu0 hu0Var = this.d;
        ArrayList arrayList = hu0Var.f;
        yu0 yu0Var = hu0Var.x;
        if (!yu0Var.z1 || recyclerView.getAdapter() == yu0Var.P) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(l1Var);
        SavedMessagesController.SavedDialog r11 = r(l1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        hu0Var.p(b10, b11);
        hu0Var.h = true;
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        pt0 pt0Var;
        hu0 hu0Var = this.d;
        nq0 nq0Var = hu0Var.n;
        if (l1Var != null && (pt0Var = hu0Var.s) != null) {
            pt0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
            AndroidUtilities.runOnUIThread(nq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.l1 l1Var) {
        int b10;
        if (l1Var != null && (b10 = l1Var.b()) >= 0) {
            hu0 hu0Var = this.d;
            if (b10 < hu0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) hu0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}

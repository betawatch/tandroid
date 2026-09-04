package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class fu0 extends s4.v {
    public final /* synthetic */ hu0 d;

    public fu0(hu0 hu0Var) {
        this.d = hu0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        xu0 xu0Var = this.d.x;
        return (!xu0Var.C1 || recyclerView.getAdapter() == xu0Var.S || (r10 = r(c1Var)) == null || !r10.pinned) ? l4 : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        hu0 hu0Var = this.d;
        ArrayList arrayList = hu0Var.f;
        xu0 xu0Var = hu0Var.x;
        if (!xu0Var.C1 || recyclerView.getAdapter() == xu0Var.S) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(c1Var);
        SavedMessagesController.SavedDialog r11 = r(c1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        hu0Var.p(b10, b11);
        hu0Var.h = true;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        pt0 pt0Var;
        hu0 hu0Var = this.d;
        jq0 jq0Var = hu0Var.n;
        if (c1Var != null && (pt0Var = hu0Var.s) != null) {
            pt0Var.c1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(jq0Var);
            AndroidUtilities.runOnUIThread(jq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            hu0 hu0Var = this.d;
            if (b10 < hu0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) hu0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}

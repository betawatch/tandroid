package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gu0 extends s4.v {
    public final /* synthetic */ iu0 d;

    public gu0(iu0 iu0Var) {
        this.d = iu0Var;
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
        yu0 yu0Var = this.d.x;
        return (!yu0Var.C1 || recyclerView.getAdapter() == yu0Var.S || (r10 = r(c1Var)) == null || !r10.pinned) ? l4 : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        iu0 iu0Var = this.d;
        ArrayList arrayList = iu0Var.f;
        yu0 yu0Var = iu0Var.x;
        if (!yu0Var.C1 || recyclerView.getAdapter() == yu0Var.S) {
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
        iu0Var.p(b10, b11);
        iu0Var.h = true;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        qt0 qt0Var;
        iu0 iu0Var = this.d;
        jq0 jq0Var = iu0Var.n;
        if (c1Var != null && (qt0Var = iu0Var.s) != null) {
            qt0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(jq0Var);
            AndroidUtilities.runOnUIThread(jq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            iu0 iu0Var = this.d;
            if (b10 < iu0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) iu0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}

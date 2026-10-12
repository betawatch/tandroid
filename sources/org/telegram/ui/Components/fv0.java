package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fv0 extends s4.v {
    public final /* synthetic */ hv0 d;

    public fv0(hv0 hv0Var) {
        this.d = hv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        xv0 xv0Var = this.d.x;
        return (!xv0Var.C1 || recyclerView.getAdapter() == xv0Var.S || (r10 = r(b1Var)) == null || !r10.pinned) ? l4 : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        hv0 hv0Var = this.d;
        ArrayList arrayList = hv0Var.f;
        xv0 xv0Var = hv0Var.x;
        if (!xv0Var.C1 || recyclerView.getAdapter() == xv0Var.S) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(b1Var);
        SavedMessagesController.SavedDialog r11 = r(b1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        hv0Var.p(b10, b11);
        hv0Var.h = true;
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        pu0 pu0Var;
        hv0 hv0Var = this.d;
        lr0 lr0Var = hv0Var.n;
        if (b1Var != null && (pu0Var = hv0Var.s) != null) {
            pu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(lr0Var);
            AndroidUtilities.runOnUIThread(lr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            hv0 hv0Var = this.d;
            if (b10 < hv0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) hv0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}

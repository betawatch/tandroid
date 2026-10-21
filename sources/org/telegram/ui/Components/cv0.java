package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class cv0 extends s4.v {
    public final /* synthetic */ ev0 d;

    public cv0(ev0 ev0Var) {
        this.d = ev0Var;
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
        uv0 uv0Var = this.d.x;
        return (!uv0Var.C1 || recyclerView.getAdapter() == uv0Var.S || (r10 = r(b1Var)) == null || !r10.pinned) ? l4 : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ev0 ev0Var = this.d;
        ArrayList arrayList = ev0Var.f;
        uv0 uv0Var = ev0Var.x;
        if (!uv0Var.C1 || recyclerView.getAdapter() == uv0Var.S) {
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
        ev0Var.p(b10, b11);
        ev0Var.h = true;
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        mu0 mu0Var;
        ev0 ev0Var = this.d;
        hr0 hr0Var = ev0Var.n;
        if (b1Var != null && (mu0Var = ev0Var.s) != null) {
            mu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(hr0Var);
            AndroidUtilities.runOnUIThread(hr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            ev0 ev0Var = this.d;
            if (b10 < ev0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) ev0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}

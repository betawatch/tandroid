package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mt0 extends f2.d0 {
    public final /* synthetic */ ot0 d;

    public mt0(ot0 ot0Var) {
        this.d = ot0Var;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.a.setPressed(false);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        SavedMessagesController.SavedDialog r10;
        int l10 = f2.d0.l(0, 0);
        eu0 eu0Var = this.d.x;
        return (!eu0Var.y1 || recyclerView.getAdapter() == eu0Var.O || (r10 = r(q1Var)) == null || !r10.pinned) ? l10 : f2.d0.l(3, 0);
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        ot0 ot0Var = this.d;
        ArrayList arrayList = ot0Var.f;
        eu0 eu0Var = ot0Var.x;
        if (!eu0Var.y1 || recyclerView.getAdapter() == eu0Var.O) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(q1Var);
        SavedMessagesController.SavedDialog r11 = r(q1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        ot0Var.p(b10, b11);
        ot0Var.h = true;
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        ws0 ws0Var;
        ot0 ot0Var = this.d;
        tp0 tp0Var = ot0Var.n;
        if (q1Var != null && (ws0Var = ot0Var.s) != null) {
            ws0Var.d1(false);
        }
        if (i9 == 0) {
            AndroidUtilities.cancelRunOnUIThread(tp0Var);
            AndroidUtilities.runOnUIThread(tp0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.q1 q1Var) {
        int b10;
        if (q1Var != null && (b10 = q1Var.b()) >= 0) {
            ot0 ot0Var = this.d;
            if (b10 < ot0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) ot0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}

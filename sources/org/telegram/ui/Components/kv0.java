package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kv0 extends s4.w {
    public final /* synthetic */ mv0 d;

    public kv0(mv0 mv0Var) {
        this.d = mv0Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        SavedMessagesController.SavedDialog r6;
        int l4 = s4.w.l(0, 0);
        bw0 bw0Var = this.d.x;
        return (!bw0Var.E1 || recyclerView.getAdapter() == bw0Var.U || (r6 = r(e1Var)) == null || !r6.pinned) ? l4 : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        mv0 mv0Var = this.d;
        ArrayList arrayList = mv0Var.f;
        bw0 bw0Var = mv0Var.x;
        if (!bw0Var.E1 || recyclerView.getAdapter() == bw0Var.U) {
            return false;
        }
        SavedMessagesController.SavedDialog r6 = r(e1Var);
        SavedMessagesController.SavedDialog r10 = r(e1Var2);
        if (r6 == null || r10 == null || !r6.pinned || !r10.pinned) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r6);
        mv0Var.p(b10, b11);
        mv0Var.h = true;
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        tu0 tu0Var;
        mv0 mv0Var = this.d;
        np0 np0Var = mv0Var.n;
        if (e1Var != null && (tu0Var = mv0Var.s) != null) {
            tu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(np0Var);
            AndroidUtilities.runOnUIThread(np0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.e1 e1Var) {
        int b10;
        if (e1Var != null && (b10 = e1Var.b()) >= 0) {
            mv0 mv0Var = this.d;
            if (b10 < mv0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) mv0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}

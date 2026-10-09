package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jv0 extends s4.w {
    public final /* synthetic */ lv0 d;

    public jv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.w.l(0, 0);
        bw0 bw0Var = this.d.x;
        return (!bw0Var.C1 || recyclerView.getAdapter() == bw0Var.S || (r10 = r(d1Var)) == null || !r10.pinned) ? l4 : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        lv0 lv0Var = this.d;
        ArrayList arrayList = lv0Var.f;
        bw0 bw0Var = lv0Var.x;
        if (!bw0Var.C1 || recyclerView.getAdapter() == bw0Var.S) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(d1Var);
        SavedMessagesController.SavedDialog r11 = r(d1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        lv0Var.p(b10, b11);
        lv0Var.h = true;
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        tu0 tu0Var;
        lv0 lv0Var = this.d;
        or0 or0Var = lv0Var.n;
        if (d1Var != null && (tu0Var = lv0Var.s) != null) {
            tu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
            AndroidUtilities.runOnUIThread(or0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.d1 d1Var) {
        int b10;
        if (d1Var != null && (b10 = d1Var.b()) >= 0) {
            lv0 lv0Var = this.d;
            if (b10 < lv0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) lv0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}

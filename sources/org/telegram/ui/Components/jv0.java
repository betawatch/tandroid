package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jv0 extends s4.w {
    public final /* synthetic */ lv0 d;

    public jv0(lv0 lv0Var) {
        this.d = lv0Var;
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
        aw0 aw0Var = this.d.x;
        return (!aw0Var.E1 || recyclerView.getAdapter() == aw0Var.U || (r6 = r(e1Var)) == null || !r6.pinned) ? l4 : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        lv0 lv0Var = this.d;
        ArrayList arrayList = lv0Var.f;
        aw0 aw0Var = lv0Var.x;
        if (!aw0Var.E1 || recyclerView.getAdapter() == aw0Var.U) {
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
        lv0Var.p(b10, b11);
        lv0Var.h = true;
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        su0 su0Var;
        lv0 lv0Var = this.d;
        mp0 mp0Var = lv0Var.n;
        if (e1Var != null && (su0Var = lv0Var.s) != null) {
            su0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(mp0Var);
            AndroidUtilities.runOnUIThread(mp0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.e1 e1Var) {
        int b10;
        if (e1Var != null && (b10 = e1Var.b()) >= 0) {
            lv0 lv0Var = this.d;
            if (b10 < lv0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) lv0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}

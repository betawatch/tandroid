package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gu0 extends f2.b0 {
    public final /* synthetic */ iu0 d;

    public gu0(iu0 iu0Var) {
        this.d = iu0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        SavedMessagesController.SavedDialog r10;
        int l10 = f2.b0.l(0, 0);
        zu0 zu0Var = this.d.x;
        return (!zu0Var.z1 || recyclerView.getAdapter() == zu0Var.P || (r10 = r(m1Var)) == null || !r10.pinned) ? l10 : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        iu0 iu0Var = this.d;
        ArrayList arrayList = iu0Var.f;
        zu0 zu0Var = iu0Var.x;
        if (!zu0Var.z1 || recyclerView.getAdapter() == zu0Var.P) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(m1Var);
        SavedMessagesController.SavedDialog r11 = r(m1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        iu0Var.p(b10, b11);
        iu0Var.h = true;
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        qt0 qt0Var;
        iu0 iu0Var = this.d;
        oq0 oq0Var = iu0Var.n;
        if (m1Var != null && (qt0Var = iu0Var.s) != null) {
            qt0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
            AndroidUtilities.runOnUIThread(oq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.m1 m1Var) {
        int b10;
        if (m1Var != null && (b10 = m1Var.b()) >= 0) {
            iu0 iu0Var = this.d;
            if (b10 < iu0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) iu0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }
}

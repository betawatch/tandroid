package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class yu0 extends s4.v {
    public final /* synthetic */ av0 d;

    public yu0(av0 av0Var) {
        this.d = av0Var;
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
        qv0 qv0Var = this.d.x;
        return (!qv0Var.C1 || recyclerView.getAdapter() == qv0Var.S || (r10 = r(c1Var)) == null || !r10.pinned) ? l4 : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        av0 av0Var = this.d;
        ArrayList arrayList = av0Var.f;
        qv0 qv0Var = av0Var.x;
        if (!qv0Var.C1 || recyclerView.getAdapter() == qv0Var.S) {
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
        av0Var.p(b10, b11);
        av0Var.h = true;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        iu0 iu0Var;
        av0 av0Var = this.d;
        gq0 gq0Var = av0Var.n;
        if (c1Var != null && (iu0Var = av0Var.s) != null) {
            iu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            AndroidUtilities.runOnUIThread(gq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            av0 av0Var = this.d;
            if (b10 < av0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) av0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}

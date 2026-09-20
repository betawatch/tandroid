package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ru0 extends s4.v {
    public final /* synthetic */ tu0 d;

    public ru0(tu0 tu0Var) {
        this.d = tu0Var;
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
        jv0 jv0Var = this.d.x;
        return (!jv0Var.C1 || recyclerView.getAdapter() == jv0Var.S || (r10 = r(c1Var)) == null || !r10.pinned) ? l4 : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        tu0 tu0Var = this.d;
        ArrayList arrayList = tu0Var.f;
        jv0 jv0Var = tu0Var.x;
        if (!jv0Var.C1 || recyclerView.getAdapter() == jv0Var.S) {
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
        tu0Var.p(b10, b11);
        tu0Var.h = true;
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        bu0 bu0Var;
        tu0 tu0Var = this.d;
        wq0 wq0Var = tu0Var.n;
        if (c1Var != null && (bu0Var = tu0Var.s) != null) {
            bu0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(wq0Var);
            AndroidUtilities.runOnUIThread(wq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            tu0 tu0Var = this.d;
            if (b10 < tu0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) tu0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}

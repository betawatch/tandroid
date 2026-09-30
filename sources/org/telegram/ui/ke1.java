package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ke1 extends org.telegram.ui.Components.xl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public je1 e;
    public int f;
    public final /* synthetic */ le1 h;

    public ke1(le1 le1Var) {
        this.h = le1Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.a;
        g4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        g4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}

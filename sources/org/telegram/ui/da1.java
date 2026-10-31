package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class da1 extends org.telegram.ui.Components.sk0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ca1 e;
    public int f;
    public final /* synthetic */ ea1 h;

    public da1(ea1 ea1Var) {
        this.h = ea1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) c1Var.a;
        j4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        j4Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.j4(viewGroup.getContext(), 1, 0, false));
    }
}

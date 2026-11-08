package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m81 extends org.telegram.ui.Components.oj0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public l81 e;
    public int f;
    public final /* synthetic */ n81 h;

    public m81(n81 n81Var) {
        this.h = n81Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.a;
        h4Var.e(chat, chat.title, str, i7 != arrayList.size() - 1);
        h4Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}

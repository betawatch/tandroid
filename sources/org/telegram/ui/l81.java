package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l81 extends org.telegram.ui.Components.oj0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public k81 e;
    public int f;
    public final /* synthetic */ m81 h;

    public l81(m81 m81Var) {
        this.h = m81Var;
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

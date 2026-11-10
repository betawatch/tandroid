package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o81 extends org.telegram.ui.Components.oj0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public n81 e;
    public int f;
    public final /* synthetic */ p81 h;

    public o81(p81 p81Var) {
        this.h = p81Var;
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

package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k81 extends org.telegram.ui.Components.tj0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public j81 e;
    public int f;
    public final /* synthetic */ l81 h;

    public k81(l81 l81Var) {
        this.h = l81Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) e1Var.a;
        h4Var.e(chat, chat.title, str, i7 != arrayList.size() - 1);
        h4Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.cj0(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}

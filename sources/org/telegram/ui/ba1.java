package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ba1 extends org.telegram.ui.Components.tk0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public aa1 e;
    public int f;
    public final /* synthetic */ ca1 h;

    public ba1(ca1 ca1Var) {
        this.h = ca1Var;
    }

    @Override // org.telegram.ui.Components.tk0
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
        return new org.telegram.ui.Components.dk0(new org.telegram.ui.Cells.j4(viewGroup.getContext(), 1, 0, false));
    }
}

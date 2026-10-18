package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hd1 extends org.telegram.ui.Components.hm0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public gd1 e;
    public int f;
    public final /* synthetic */ id1 h;

    public hd1(id1 id1Var) {
        this.h = id1Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) b1Var.a;
        f4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        f4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.f4(1, 0, viewGroup.getContext(), false));
    }
}

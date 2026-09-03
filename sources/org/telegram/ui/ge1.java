package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ge1 extends org.telegram.ui.Components.rl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public fe1 e;
    public int f;
    public final /* synthetic */ he1 h;

    public ge1(he1 he1Var) {
        this.h = he1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) m1Var.a;
        g4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        g4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}

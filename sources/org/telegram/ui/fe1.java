package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fe1 extends org.telegram.ui.Components.ql0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ee1 e;
    public int f;
    public final /* synthetic */ ge1 h;

    public fe1(ge1 ge1Var) {
        this.h = ge1Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) l1Var.a;
        f4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        f4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false));
    }
}

package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kd1 extends org.telegram.ui.Components.yk0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public jd1 e;
    public int f;
    public final /* synthetic */ ld1 h;

    public kd1(ld1 ld1Var) {
        this.h = ld1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) o1Var.a;
        d4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        d4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.d4(viewGroup.getContext(), 1, 0, false));
    }
}

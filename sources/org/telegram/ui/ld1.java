package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ld1 extends org.telegram.ui.Components.il0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public kd1 e;
    public int f;
    public final /* synthetic */ md1 h;

    public ld1(md1 md1Var) {
        this.h = md1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) n1Var.a;
        e4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        e4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.e4(viewGroup.getContext(), 1, 0, false));
    }
}

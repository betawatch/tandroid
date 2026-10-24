package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ld1 extends org.telegram.ui.Components.lm0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public kd1 e;
    public int f;
    public final /* synthetic */ md1 h;

    public ld1(md1 md1Var) {
        this.h = md1Var;
    }

    @Override // org.telegram.ui.Components.lm0
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
        return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false));
    }
}

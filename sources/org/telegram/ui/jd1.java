package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jd1 extends org.telegram.ui.Components.vk0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public id1 e;
    public int f;
    public final /* synthetic */ kd1 h;

    public jd1(kd1 kd1Var) {
        this.h = kd1Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i9);
        String str = (String) this.d.get(i9);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) q1Var.a;
        g4Var.e(chat, chat.title, str, i9 != arrayList.size() - 1);
        g4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}

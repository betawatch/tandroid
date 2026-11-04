package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wn0 implements kg.c0 {
    public final /* synthetic */ oo0 a;

    public wn0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    @Override // kg.c0
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLObject tLObject = ((kg.d0) arrayList.get(i3)).a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        oo0 oo0Var = this.a;
        oo0Var.x2 = arrayList;
        for (int i10 = 0; i10 < oo0Var.x2.size(); i10++) {
            kg.d0 d0Var = (kg.d0) oo0Var.x2.get(i10);
            TLObject tLObject2 = d0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.hp.s1(oo0Var.a).X3((TLRPC.User) d0Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.hp.s1(oo0Var.a).Q3((TLRPC.Chat) d0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.hp.s1(oo0Var.a).U3((TLRPC.EncryptedChat) d0Var.a, true);
            }
        }
        oo0Var.F1.f();
    }
}

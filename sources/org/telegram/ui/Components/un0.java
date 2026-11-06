package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class un0 implements jg.f0 {
    public final /* synthetic */ mo0 a;

    public un0(mo0 mo0Var) {
        this.a = mo0Var;
    }

    @Override // jg.f0
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        mo0 mo0Var = this.a;
        mo0Var.w2 = arrayList;
        for (int i10 = 0; i10 < mo0Var.w2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) mo0Var.w2.get(i10);
            TLObject tLObject2 = g0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.qp.s1(mo0Var.a).X3((TLRPC.User) g0Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.qp.s1(mo0Var.a).Q3((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.qp.s1(mo0Var.a).U3((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        mo0Var.E1.f();
    }
}

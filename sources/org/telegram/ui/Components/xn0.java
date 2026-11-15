package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xn0 implements jg.f0 {
    public final /* synthetic */ po0 a;

    public xn0(po0 po0Var) {
        this.a = po0Var;
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
        po0 po0Var = this.a;
        po0Var.A2 = arrayList;
        for (int i10 = 0; i10 < po0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) po0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.np.s1(po0Var.a).X3((TLRPC.User) g0Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.np.s1(po0Var.a).Q3((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.np.s1(po0Var.a).U3((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        po0Var.I1.f();
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vn0 implements jg.f0 {
    public final /* synthetic */ no0 a;

    public vn0(no0 no0Var) {
        this.a = no0Var;
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
        no0 no0Var = this.a;
        no0Var.w2 = arrayList;
        for (int i10 = 0; i10 < no0Var.w2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) no0Var.w2.get(i10);
            TLObject tLObject2 = g0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.qp.s1(no0Var.a).X3((TLRPC.User) g0Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.qp.s1(no0Var.a).Q3((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.qp.s1(no0Var.a).U3((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        no0Var.E1.f();
    }
}

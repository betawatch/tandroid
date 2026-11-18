package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class go0 implements jg.f0 {
    public final /* synthetic */ yo0 a;

    public go0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // jg.f0
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.v3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        yo0 yo0Var = this.a;
        yo0Var.A2 = arrayList;
        for (int i10 = 0; i10 < yo0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) yo0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.mp.u1(yo0Var.a).e4((TLRPC.User) g0Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.mp.u1(yo0Var.a).X3((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.mp.u1(yo0Var.a).b4((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        yo0Var.I1.f();
    }
}

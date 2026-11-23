package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ho0 implements jg.f0 {
    public final /* synthetic */ zo0 a;

    public ho0(zo0 zo0Var) {
        this.a = zo0Var;
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
        zo0 zo0Var = this.a;
        zo0Var.A2 = arrayList;
        for (int i10 = 0; i10 < zo0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) zo0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.mp.u1(zo0Var.a).e4((TLRPC.User) g0Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.mp.u1(zo0Var.a).X3((TLRPC.Chat) g0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.mp.u1(zo0Var.a).b4((TLRPC.EncryptedChat) g0Var.a, true);
            }
        }
        zo0Var.I1.f();
    }
}

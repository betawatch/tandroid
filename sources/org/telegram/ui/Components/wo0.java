package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wo0 implements zf.x {
    public final /* synthetic */ op0 a;

    public wo0(op0 op0Var) {
        this.a = op0Var;
    }

    @Override // zf.x
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLObject tLObject = ((zf.y) arrayList.get(i10)).a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.w3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        op0 op0Var = this.a;
        op0Var.w2 = arrayList;
        for (int i11 = 0; i11 < op0Var.w2.size(); i11++) {
            zf.y yVar = (zf.y) op0Var.w2.get(i11);
            TLObject tLObject2 = yVar.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.vp.r1(op0Var.a).U3((TLRPC.User) yVar.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.vp.r1(op0Var.a).N3((TLRPC.Chat) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.vp.r1(op0Var.a).R3((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        op0Var.E1.f();
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xo0 implements zf.x {
    public final /* synthetic */ pp0 a;

    public xo0(pp0 pp0Var) {
        this.a = pp0Var;
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
        pp0 pp0Var = this.a;
        pp0Var.w2 = arrayList;
        for (int i11 = 0; i11 < pp0Var.w2.size(); i11++) {
            zf.y yVar = (zf.y) pp0Var.w2.get(i11);
            TLObject tLObject2 = yVar.a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.wp.r1(pp0Var.a).U3((TLRPC.User) yVar.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.wp.r1(pp0Var.a).N3((TLRPC.Chat) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.wp.r1(pp0Var.a).R3((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        pp0Var.E1.f();
    }
}

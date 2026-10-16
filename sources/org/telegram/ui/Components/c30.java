package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c30 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ f30 d;

    public c30(f30 f30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = f30Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        f30 f30Var = this.d;
        if (i10 < size && i11 < f30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(f30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - f30Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= f30Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < f30Var.e.size() ? ((ChatObject.VideoParticipant) f30Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) f30Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) f30Var.f.get(size3)).peer);
    }

    @Override // s4.o
    public final int d() {
        f30 f30Var = this.d;
        return f30Var.f.size() + f30Var.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

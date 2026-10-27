package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a30 extends s4.p {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ c30 d;

    public a30(c30 c30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = c30Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        c30 c30Var = this.d;
        if (i10 < size && i11 < c30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(c30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - c30Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= c30Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < c30Var.e.size() ? ((ChatObject.VideoParticipant) c30Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) c30Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) c30Var.f.get(size3)).peer);
    }

    @Override // s4.p
    public final int d() {
        c30 c30Var = this.d;
        return c30Var.f.size() + c30Var.e.size();
    }

    @Override // s4.p
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

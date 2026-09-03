package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r20 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ u20 d;

    public r20(u20 u20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = u20Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        u20 u20Var = this.d;
        if (i10 < size && i11 < u20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(u20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - u20Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= u20Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < u20Var.e.size() ? ((ChatObject.VideoParticipant) u20Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) u20Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) u20Var.f.get(size3)).peer);
    }

    @Override // f2.q
    public final int d() {
        u20 u20Var = this.d;
        return u20Var.f.size() + u20Var.e.size();
    }

    @Override // f2.q
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

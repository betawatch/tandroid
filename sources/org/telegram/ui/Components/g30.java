package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g30 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ j30 d;

    public g30(j30 j30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = j30Var;
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
        j30 j30Var = this.d;
        if (i10 < size && i11 < j30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(j30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - j30Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= j30Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < j30Var.e.size() ? ((ChatObject.VideoParticipant) j30Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) j30Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) j30Var.f.get(size3)).peer);
    }

    @Override // s4.o
    public final int d() {
        j30 j30Var = this.d;
        return j30Var.f.size() + j30Var.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y20 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ b30 d;

    public y20(b30 b30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = b30Var;
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
        b30 b30Var = this.d;
        if (i10 < size && i11 < b30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(b30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - b30Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= b30Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < b30Var.e.size() ? ((ChatObject.VideoParticipant) b30Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) b30Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) b30Var.f.get(size3)).peer);
    }

    @Override // s4.o
    public final int d() {
        b30 b30Var = this.d;
        return b30Var.f.size() + b30Var.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

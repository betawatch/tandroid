package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y20 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a30 d;

    public y20(a30 a30Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = a30Var;
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
        a30 a30Var = this.d;
        if (i10 < size && i11 < a30Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(a30Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - a30Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= a30Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < a30Var.e.size() ? ((ChatObject.VideoParticipant) a30Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) a30Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) a30Var.f.get(size3)).peer);
    }

    @Override // s4.o
    public final int d() {
        a30 a30Var = this.d;
        return a30Var.f.size() + a30Var.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class s20 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ v20 d;

    public s20(v20 v20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = v20Var;
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
        v20 v20Var = this.d;
        if (i10 < size && i11 < v20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(v20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - v20Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= v20Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < v20Var.e.size() ? ((ChatObject.VideoParticipant) v20Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) v20Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) v20Var.f.get(size3)).peer);
    }

    @Override // s4.o
    public final int d() {
        v20 v20Var = this.d;
        return v20Var.f.size() + v20Var.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

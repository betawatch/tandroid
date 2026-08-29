package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l20 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ o20 d;

    public l20(o20 o20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = o20Var;
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
        o20 o20Var = this.d;
        if (i10 < size && i11 < o20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(o20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - o20Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= o20Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < o20Var.e.size() ? ((ChatObject.VideoParticipant) o20Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) o20Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) o20Var.f.get(size3)).peer);
    }

    @Override // f2.q
    public final int d() {
        o20 o20Var = this.d;
        return o20Var.f.size() + o20Var.e.size();
    }

    @Override // f2.q
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

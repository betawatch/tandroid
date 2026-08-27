package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d20 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ f20 d;

    public d20(f20 f20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = f20Var;
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
        f20 f20Var = this.d;
        if (i10 < size && i11 < f20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(f20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - f20Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= f20Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < f20Var.e.size() ? ((ChatObject.VideoParticipant) f20Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) f20Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) f20Var.f.get(size3)).peer);
    }

    @Override // f2.q
    public final int d() {
        f20 f20Var = this.d;
        return f20Var.f.size() + f20Var.e.size();
    }

    @Override // f2.q
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

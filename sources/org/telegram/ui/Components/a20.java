package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a20 extends f2.s {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ c20 d;

    public a20(c20 c20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = c20Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        c20 c20Var = this.d;
        if (i9 < size && i10 < c20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i9)).equals(c20Var.e.get(i10));
        }
        int size2 = i9 - arrayList.size();
        int size3 = i10 - c20Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= c20Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i9 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i9)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i10 < c20Var.e.size() ? ((ChatObject.VideoParticipant) c20Var.e.get(i10)).participant : (TLRPC.GroupCallParticipant) c20Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) c20Var.f.get(size3)).peer);
    }

    @Override // f2.s
    public final int d() {
        c20 c20Var = this.d;
        return c20Var.f.size() + c20Var.e.size();
    }

    @Override // f2.s
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

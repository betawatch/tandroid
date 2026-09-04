package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class p20 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ s20 d;

    public p20(s20 s20Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = s20Var;
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
        s20 s20Var = this.d;
        if (i10 < size && i11 < s20Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(s20Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - s20Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= s20Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return MessageObject.getPeerId((i10 < arrayList.size() ? ((ChatObject.VideoParticipant) arrayList.get(i10)).participant : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId((i11 < s20Var.e.size() ? ((ChatObject.VideoParticipant) s20Var.e.get(i11)).participant : (TLRPC.GroupCallParticipant) s20Var.f.get(size3)).peer);
        }
        return MessageObject.getPeerId(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == MessageObject.getPeerId(((TLRPC.GroupCallParticipant) s20Var.f.get(size3)).peer);
    }

    @Override // s4.o
    public final int d() {
        s20 s20Var = this.d;
        return s20Var.f.size() + s20Var.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}

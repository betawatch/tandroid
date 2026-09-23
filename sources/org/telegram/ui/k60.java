package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l60 c;

    public k60(l60 l60Var, ArrayList arrayList) {
        this.c = l60Var;
        this.b = arrayList;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        l60 l60Var = this.c;
        if (i11 < l60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(l60Var.e.get(i11));
        }
        return false;
    }

    @Override // s4.o
    public final int d() {
        return this.c.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.size();
    }
}

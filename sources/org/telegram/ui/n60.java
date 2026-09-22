package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ o60 c;

    public n60(o60 o60Var, ArrayList arrayList) {
        this.c = o60Var;
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
        o60 o60Var = this.c;
        if (i11 < o60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(o60Var.e.get(i11));
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

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

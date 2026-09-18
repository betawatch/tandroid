package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ q60 c;

    public p60(q60 q60Var, ArrayList arrayList) {
        this.c = q60Var;
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
        q60 q60Var = this.c;
        if (i11 < q60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(q60Var.e.get(i11));
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

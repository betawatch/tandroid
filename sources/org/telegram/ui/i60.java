package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j60 c;

    public i60(j60 j60Var, ArrayList arrayList) {
        this.c = j60Var;
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
        j60 j60Var = this.c;
        if (i11 < j60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(j60Var.e.get(i11));
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

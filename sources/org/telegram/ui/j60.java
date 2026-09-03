package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j60 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k60 c;

    public j60(k60 k60Var, ArrayList arrayList) {
        this.c = k60Var;
        this.b = arrayList;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        k60 k60Var = this.c;
        if (i11 < k60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(k60Var.e.get(i11));
        }
        return false;
    }

    @Override // f2.q
    public final int d() {
        return this.c.e.size();
    }

    @Override // f2.q
    public final int e() {
        return this.b.size();
    }
}

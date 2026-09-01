package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i60 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j60 c;

    public i60(j60 j60Var, ArrayList arrayList) {
        this.c = j60Var;
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
        j60 j60Var = this.c;
        if (i11 < j60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(j60Var.e.get(i11));
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

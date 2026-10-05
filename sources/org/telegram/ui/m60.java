package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class m60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ n60 c;

    public m60(n60 n60Var, ArrayList arrayList) {
        this.c = n60Var;
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
        n60 n60Var = this.c;
        if (i11 < n60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(n60Var.e.get(i11));
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

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c60 extends s4.p {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ d60 c;

    public c60(d60 d60Var, ArrayList arrayList) {
        this.c = d60Var;
        this.b = arrayList;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        d60 d60Var = this.c;
        if (i11 < d60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(d60Var.e.get(i11));
        }
        return false;
    }

    @Override // s4.p
    public final int d() {
        return this.c.e.size();
    }

    @Override // s4.p
    public final int e() {
        return this.b.size();
    }
}

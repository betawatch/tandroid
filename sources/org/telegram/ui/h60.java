package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h60 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ i60 c;

    public h60(i60 i60Var, ArrayList arrayList) {
        this.c = i60Var;
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
        i60 i60Var = this.c;
        if (i11 < i60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(i60Var.e.get(i11));
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

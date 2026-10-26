package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a60 extends s4.p {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ b60 c;

    public a60(b60 b60Var, ArrayList arrayList) {
        this.c = b60Var;
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
        b60 b60Var = this.c;
        if (i11 < b60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(b60Var.e.get(i11));
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

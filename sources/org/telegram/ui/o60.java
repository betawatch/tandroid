package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class o60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ p60 c;

    public o60(p60 p60Var, ArrayList arrayList) {
        this.c = p60Var;
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
        p60 p60Var = this.c;
        if (i11 < p60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(p60Var.e.get(i11));
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

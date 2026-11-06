package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements dj {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.d5 b;

    public /* synthetic */ xi(org.telegram.messenger.d5 d5Var, int i7) {
        this.a = i7;
        this.b = d5Var;
    }

    @Override // org.telegram.ui.Components.dj
    public final String run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b.e;
                return arrayList.isEmpty() ? "" : pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.b.e;
                return arrayList2.isEmpty() ? "" : pf.b.c().b((String) arrayList2.get(0));
        }
    }
}

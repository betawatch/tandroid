package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi implements cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.d5 b;

    public /* synthetic */ wi(org.telegram.messenger.d5 d5Var, int i3) {
        this.a = i3;
        this.b = d5Var;
    }

    @Override // org.telegram.ui.Components.cj
    public final String run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b.e;
                return arrayList.isEmpty() ? "" : mf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.b.e;
                return arrayList2.isEmpty() ? "" : mf.b.c().b((String) arrayList2.get(0));
        }
    }
}

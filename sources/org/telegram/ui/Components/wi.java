package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi implements cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.f5 b;

    public /* synthetic */ wi(org.telegram.messenger.f5 f5Var, int i10) {
        this.a = i10;
        this.b = f5Var;
    }

    @Override // org.telegram.ui.Components.cj
    public final String run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b.e;
                return arrayList.isEmpty() ? "" : af.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.b.e;
                return arrayList2.isEmpty() ? "" : af.b.c().b((String) arrayList2.get(0));
        }
    }
}

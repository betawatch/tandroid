package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj implements rj {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.f5 b;

    public /* synthetic */ lj(org.telegram.messenger.f5 f5Var, int i7) {
        this.a = i7;
        this.b = f5Var;
    }

    @Override // org.telegram.ui.Components.rj
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

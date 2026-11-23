package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj implements tj {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.f5 b;

    public /* synthetic */ nj(org.telegram.messenger.f5 f5Var, int i7) {
        this.a = i7;
        this.b = f5Var;
    }

    @Override // org.telegram.ui.Components.tj
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

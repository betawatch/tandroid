package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

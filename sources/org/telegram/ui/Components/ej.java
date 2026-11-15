package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej implements kj {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.d5 b;

    public /* synthetic */ ej(org.telegram.messenger.d5 d5Var, int i7) {
        this.a = i7;
        this.b = d5Var;
    }

    @Override // org.telegram.ui.Components.kj
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

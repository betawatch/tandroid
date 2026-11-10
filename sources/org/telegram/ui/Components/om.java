package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class om implements lj {
    public final /* synthetic */ org.telegram.messenger.c20 a;
    public final /* synthetic */ di.u2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;

    public om(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = c20Var;
        this.b = u2Var;
        this.c = f2Var;
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.d((org.telegram.messenger.fz) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void S() {
    }
}

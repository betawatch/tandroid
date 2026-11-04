package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class om implements lj {
    public final /* synthetic */ org.telegram.messenger.u10 a;
    public final /* synthetic */ ei.x2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;

    public om(ei.x2 x2Var, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = u10Var;
        this.b = x2Var;
        this.c = d2Var;
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
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.a(new uh.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new uh.d((org.telegram.messenger.xy) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void S() {
    }
}

package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xm implements nj {
    public final /* synthetic */ org.telegram.messenger.q20 a;
    public final /* synthetic */ ag.v b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;

    public xm(ag.v vVar, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = q20Var;
        this.b = vVar;
        this.c = k2Var;
    }

    @Override // org.telegram.ui.Components.nj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.a(new jh.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new jh.d((org.telegram.messenger.pz) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void S() {
    }
}

package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class en implements bk {
    public final /* synthetic */ org.telegram.messenger.w10 a;
    public final /* synthetic */ fi.n2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;

    public en(fi.n2 n2Var, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = w10Var;
        this.b = n2Var;
        this.c = g2Var;
    }

    @Override // org.telegram.ui.Components.bk
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.bk
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.bk
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.d((org.telegram.messenger.yy) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.bk
    public final /* synthetic */ void T() {
    }
}

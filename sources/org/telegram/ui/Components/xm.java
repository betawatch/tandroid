package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xm implements tj {
    public final /* synthetic */ org.telegram.messenger.z10 a;
    public final /* synthetic */ fi.p2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;

    public xm(fi.p2 p2Var, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = z10Var;
        this.b = p2Var;
        this.c = e2Var;
    }

    @Override // org.telegram.ui.Components.tj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.tj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.tj
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.d((org.telegram.messenger.dz) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.tj
    public final /* synthetic */ void T() {
    }
}

package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gn implements ck {
    public final /* synthetic */ org.telegram.messenger.x10 a;
    public final /* synthetic */ fi.n2 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;

    public gn(fi.n2 n2Var, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = x10Var;
        this.b = n2Var;
        this.c = g2Var;
    }

    @Override // org.telegram.ui.Components.ck
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ck
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.ck
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        if (!arrayList.isEmpty()) {
            this.a.a(new th.d((org.telegram.messenger.yy) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.ck
    public final /* synthetic */ void T() {
    }
}

package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xm implements nj {
    public final /* synthetic */ org.telegram.messenger.r20 a;
    public final /* synthetic */ ag.v b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;

    public xm(ag.v vVar, org.telegram.messenger.r20 r20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = r20Var;
        this.b = vVar;
        this.c = k2Var;
    }

    @Override // org.telegram.ui.Components.nj
    public final void B() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.a(new jh.c((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final void p(ArrayList arrayList, boolean z10, int i10, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.a(new jh.d((org.telegram.messenger.qz) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void T() {
    }
}

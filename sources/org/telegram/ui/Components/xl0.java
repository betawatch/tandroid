package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xl0 extends bs {
    public final /* synthetic */ org.telegram.ui.hw l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(org.telegram.ui.hw hwVar, uj0 uj0Var, Context context, int i7, int i10) {
        super(uj0Var, context, i7, i10, false, null);
        this.l0 = hwVar;
    }

    @Override // org.telegram.ui.Components.p41
    public final void O(boolean z10) {
        ArrayList arrayList;
        super.O(z10);
        wl0 wl0Var = this.l0.o0;
        wl0Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z10);
        wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var.e.setVisibility(8);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fm0 extends is {
    public final /* synthetic */ org.telegram.ui.kw l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm0(org.telegram.ui.kw kwVar, ck0 ck0Var, Context context, int i7, int i10) {
        super(ck0Var, context, i7, i10, false, null);
        this.l0 = kwVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final void O(boolean z10) {
        ArrayList arrayList;
        super.O(z10);
        em0 em0Var = this.l0.o0;
        em0Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z10);
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.e.setVisibility(8);
    }
}

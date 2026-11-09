package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ul0 extends vr {
    public final /* synthetic */ org.telegram.ui.hw k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(org.telegram.ui.hw hwVar, qj0 qj0Var, Context context, int i7, int i10) {
        super(qj0Var, context, i7, i10, false, null);
        this.k0 = hwVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final void O(boolean z9) {
        ArrayList arrayList;
        super.O(z9);
        tl0 tl0Var = this.k0.n0;
        tl0Var.e(this.b0 || this.c0 || (arrayList = this.V) == null || !arrayList.isEmpty(), z9);
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.e.setVisibility(8);
    }
}

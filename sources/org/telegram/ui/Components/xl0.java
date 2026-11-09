package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xl0 extends v20 {
    public final /* synthetic */ org.telegram.ui.hw e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(org.telegram.ui.hw hwVar, qj0 qj0Var, Context context, int i7) {
        super(qj0Var, context, i7);
        this.e0 = hwVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final void O(boolean z9) {
        super.O(z9);
        tl0 tl0Var = this.e0.u0;
        tl0Var.e(false, z9);
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.e.setVisibility(8);
    }
}

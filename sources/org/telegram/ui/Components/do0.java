package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class do0 extends org.telegram.ui.Cells.d7 {
    public final /* synthetic */ fo0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do0(fo0 fo0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(0, context, f6Var);
        this.N = fo0Var;
    }

    @Override // org.telegram.ui.Cells.d7
    public final String a() {
        return this.N.f.S1 ? org.telegram.messenger.id.M0(2131746187, null) : org.telegram.messenger.id.M0(2131750489, null);
    }
}

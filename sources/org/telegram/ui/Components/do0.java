package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

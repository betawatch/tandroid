package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n00 extends org.telegram.ui.Components.zz {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n00(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.zz
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((z00) this.V).s;
            default:
                return ((x00) this.V).d.s;
        }
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i10 extends org.telegram.ui.Components.u00 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((u10) this.V).s;
            default:
                return ((s10) this.V).d.s;
        }
    }
}

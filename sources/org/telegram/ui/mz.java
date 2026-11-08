package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mz extends org.telegram.ui.Components.mz {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz(int i7, Context context, Object obj) {
        super(context, null);
        this.U = i7;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.mz
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((yz) this.V).s;
            default:
                return ((wz) this.V).d.s;
        }
    }
}

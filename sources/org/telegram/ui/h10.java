package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class h10 extends org.telegram.ui.Components.u00 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((t10) this.V).s;
            default:
                return ((r10) this.V).d.s;
        }
    }
}

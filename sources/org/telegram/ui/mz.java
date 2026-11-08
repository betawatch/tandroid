package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class mz extends org.telegram.ui.Components.lz {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz(int i7, Context context, Object obj) {
        super(context, null);
        this.U = i7;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.lz
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((yz) this.V).s;
            default:
                return ((wz) this.V).d.s;
        }
    }
}

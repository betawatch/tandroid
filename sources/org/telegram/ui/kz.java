package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.iz {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz(int i3, Context context, Object obj) {
        super(context, null);
        this.V = i3;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.iz
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((wz) this.W).s;
            default:
                return ((uz) this.W).d.s;
        }
    }
}
